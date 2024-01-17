/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CertificatesV1Api;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.CSRNotApprovedException;
import io.kubernetes.client.util.exception.CSRSigningException;
import io.kubernetes.client.util.wait.Wait;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.KeyPair;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSRUtils {

  private static final Logger LOG = LoggerFactory.getLogger(CSRUtils.class);

  public static final String CSR_USAGE_CLIENT_AUTH = "client auth";

  public static final String SIGNER_NAME_KUBE_APISERVER_CLIENT =
      "kubernetes.io/kube-apiserver-client";

  /**
   * Approves a CertificateSigningRequest by requesting "/approve" subresource.
   *
   * @param apiClient the api client
   * @param csrObjName the csr obj name
   * @throws ApiException the api exception
   */
  public static void approve(ApiClient apiClient, String csrObjName) throws ApiException {
    CertificatesV1Api api = new CertificatesV1Api(apiClient);
    OffsetDateTime now = OffsetDateTime.now();
    V1CertificateSigningRequest current = api.readCertificateSigningRequest(csrObjName).execute();
    current
        .getStatus()
        .addConditionsItem(
            new V1CertificateSigningRequestCondition()
                .type("Approved")
                .status("True")
                .reason("Kubernetes Java Client")
                .lastTransitionTime(now)
                .lastUpdateTime(now));
    api.replaceCertificateSigningRequestApproval(csrObjName, current).execute();
  }

  /**
   * Creates the given CertificateSigningRequest object if it doesn't exist, then waits until it's
   * approved.
   *
   * <p>It's short-cut combo of CSRUtils#createIfAbsent and CSRUtils#waitUntilCertificateSigned
   *
   * @param bootstrapApiClient the bootstrap api client
   * @param csr the csr
   * @return the bytes of CSR [ ]
   * @throws CSRNotApprovedException the csr not approved exception
   * @throws ApiException the api exception
   */
  public static byte[] createAndWaitUntilCertificateSigned(
      ApiClient bootstrapApiClient, V1CertificateSigningRequest csr)
      throws CSRNotApprovedException, ApiException {
    // creates CSR or checks whether the existing one conflicts.
    if (!CSRUtils.createIfAbsent(bootstrapApiClient, csr)) {
      CertificatesV1Api api = new CertificatesV1Api(bootstrapApiClient);
      V1CertificateSigningRequest existing =
          api.readCertificateSigningRequest(csr.getMetadata().getName()).execute();
      if (!CSRUtils.isIdentical(existing, csr)) {
        LOG.error(
            "Existing CertificateSigningRequest object is conflicting with the requesting object");
        throw new IllegalStateException("Conflicting CSR object found in the cluster");
      }
    }

    // wait until the certificates is approved.
    return CSRUtils.waitUntilCertificateSigned(bootstrapApiClient, csr.getMetadata().getName());
  }

  /**
   * Creates if the CertificateSigningRequest is absent in the cluster.
   *
   * @param apiClient the api client
   * @param csr the csr
   * @return the boolean represents whether the CSR is actually created.
   * @throws ApiException the api exception
   */
  public static boolean createIfAbsent(ApiClient apiClient, V1CertificateSigningRequest csr)
      throws ApiException {
    CertificatesV1Api api = new CertificatesV1Api(apiClient);
    try {
      api.createCertificateSigningRequest(csr).execute();
      return true;
    } catch (ApiException e) {
      if (e.getCode() == 409) { // HTTP-Conflict
        return false;
      }
      LOG.error(
          "Failed creating CSR {} in the cluster: {}",
          csr.getMetadata().getName(),
          e.getResponseBody());
      throw e;
    }
  }

  /**
   * Wait until the CertificateSigningRequest is approved within a timeout of 30 minutes.
   *
   * @param apiClient the api client
   * @param csrObjectName the csr object name
   * @return the byte [ ]
   * @throws CSRNotApprovedException the csr not approved exception
   */
  public static byte[] waitUntilCertificateSigned(ApiClient apiClient, String csrObjectName)
      throws CSRNotApprovedException {
    return waitUntilCertificateSigned(
        apiClient, csrObjectName, Duration.ofSeconds(5), Duration.ofMinutes(30));
  }

  /**
   * Wait until the CertificateSigningRequest is approved within a timeout of 30 minutes.
   *
   * @param apiClient the api client
   * @param csrObjectName the csr object name
   * @param retryInterval the retry interval
   * @param timeout the timeout
   * @return the byte [ ]
   * @throws CSRNotApprovedException the csr not approved exception
   */
  public static byte[] waitUntilCertificateSigned(
      ApiClient apiClient, String csrObjectName, Duration retryInterval, Duration timeout)
      throws CSRNotApprovedException {
    CertificatesV1Api api = new CertificatesV1Api(apiClient);
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    try {
      AtomicReference<byte[]> certRef = new AtomicReference<>();
      boolean certificateSigned =
          Wait.poll(
              retryInterval,
              timeout,
              () -> {
                try {
                  V1CertificateSigningRequest current =
                      api.readCertificateSigningRequest(csrObjectName).execute();
                  CSRUtils.getCertificate(current).ifPresent(cert -> certRef.set(cert));
                  return true;
                } catch (ApiException e) {
                  LOG.info(
                      "Failed acquiring latest state of CertificateSigningRequest resource {} from the cluster",
                      csrObjectName);
                  return false;
                }
              });
      if (!certificateSigned) {
        LOG.error(
            "Timeout exceed but the CertificateSigningRequest {} is not approved", csrObjectName);
        throw new CSRNotApprovedException(
            "Timeout - CertificateSigningRequest not approved: " + csrObjectName);
      }
      LOG.info(
          "Successfully acquired certificate from CertificateSigningRequest {}", csrObjectName);
      return certRef.get();
    } finally {
      service.shutdown();
    }
  }

  /**
   * Gets certificate data from the CertificateSigningRequest object.
   *
   * @param csr the csr
   * @return the certificate
   */
  public static Optional<byte[]> getCertificate(V1CertificateSigningRequest csr) {
    if (csr.getStatus() == null || csr.getStatus().getCertificate() == null) {
      return Optional.empty();
    }
    return Optional.of(csr.getStatus().getCertificate());
  }

  /**
   * Checks if the two CertificateSigningRequest is identical.
   *
   * @param left the left
   * @param right the right
   * @return the boolean
   */
  public static boolean isIdentical(
      V1CertificateSigningRequest left, V1CertificateSigningRequest right) {
    // TODO: check CSR modulus
    if (!Objects.equals(left.getSpec().getUsages(), right.getSpec().getUsages())) {
      return false;
    }
    return Objects.equals(left.getSpec().getSignerName(), right.getSpec().getSignerName());
  }

  /**
   * Sign CSR from the key-pair.
   *
   * @param keyPair the key pair
   * @param commonName the common name
   * @return the byte [ ]
   * @throws CSRSigningException the csr signing exception
   */
  public static byte[] sign(KeyPair keyPair, String commonName) throws CSRSigningException {
    return sign(keyPair, "SHA512withRSA", commonName, "");
  }

  /**
   * Sign CSR from the key-pair.
   *
   * @param keyPair the key pair
   * @param csrAlgo the csr algo
   * @param commonName the common name
   * @param organizationName the organization name
   * @return the byte [ ]
   * @throws CSRSigningException the csr signing exception
   */
  public static byte[] sign(
      KeyPair keyPair, String csrAlgo, String commonName, String organizationName)
      throws CSRSigningException {
    return sign(
        keyPair,
        csrAlgo,
        String.join(
            ", ",
            new String[] {
              "CN=" + commonName, "O=" + organizationName,
            }));
  }

  /**
   * Sign CSR from the key-pair.
   *
   * @param keyPair the key pair
   * @param csrAlgo the csr algo
   * @param subjects the subjects
   * @return the byte [ ]
   * @throws CSRSigningException the csr signing exception
   */
  public static byte[] sign(KeyPair keyPair, String csrAlgo, String subjects)
      throws CSRSigningException {
    try {
      PKCS10CertificationRequestBuilder p10Builder =
          new JcaPKCS10CertificationRequestBuilder(
              new X500Principal(subjects), keyPair.getPublic());
      JcaContentSignerBuilder csBuilder = new JcaContentSignerBuilder(csrAlgo);
      ContentSigner signer = csBuilder.build(keyPair.getPrivate());
      PKCS10CertificationRequest csr = p10Builder.build(signer);

      // NOTE: a work-around for https://github.com/kubernetes/kubernetes/pull/96747
      ByteArrayOutputStream bs = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(bs);
      byte[] CRLF = new byte[] {'\r', '\n'};
      ps.println("-----BEGIN CERTIFICATE REQUEST-----");
      ps.println(Base64.getMimeEncoder(64, CRLF).encodeToString(csr.getEncoded()));
      ps.println("-----END CERTIFICATE REQUEST-----");
      return bs.toByteArray();
    } catch (IOException | OperatorCreationException e) {
      throw new CSRSigningException(e);
    }
  }

  public static V1CertificateSigningRequest newV1CertificateSigningRequest(
      String csrObjName, byte[] csrBytes) {
    return newV1CertificateSigningRequest(
        csrObjName, csrBytes, SIGNER_NAME_KUBE_APISERVER_CLIENT, CSR_USAGE_CLIENT_AUTH);
  }

  public static V1CertificateSigningRequest newV1CertificateSigningRequest(
      String csrObjName, byte[] csrBytes, String signerName, String usage) {
    return new V1CertificateSigningRequest()
        .metadata(new V1ObjectMeta().name(csrObjName))
        .spec(
            new V1CertificateSigningRequestSpec()
                .request(csrBytes)
                .signerName(signerName)
                .addUsagesItem(usage));
  }
}
