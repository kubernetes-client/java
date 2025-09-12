/*
Copyright 2025 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PodCertificateRequestSpec describes the certificate request.  All fields are immutable after creation.
 */
@ApiModel(description = "PodCertificateRequestSpec describes the certificate request.  All fields are immutable after creation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T22:12:20.439480Z[Etc/UTC]")
public class V1alpha1PodCertificateRequestSpec {
  public static final String SERIALIZED_NAME_MAX_EXPIRATION_SECONDS = "maxExpirationSeconds";
  @SerializedName(SERIALIZED_NAME_MAX_EXPIRATION_SECONDS)
  private Integer maxExpirationSeconds;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_U_I_D = "nodeUID";
  @SerializedName(SERIALIZED_NAME_NODE_U_I_D)
  private String nodeUID;

  public static final String SERIALIZED_NAME_PKIX_PUBLIC_KEY = "pkixPublicKey";
  @SerializedName(SERIALIZED_NAME_PKIX_PUBLIC_KEY)
  private byte[] pkixPublicKey;

  public static final String SERIALIZED_NAME_POD_NAME = "podName";
  @SerializedName(SERIALIZED_NAME_POD_NAME)
  private String podName;

  public static final String SERIALIZED_NAME_POD_U_I_D = "podUID";
  @SerializedName(SERIALIZED_NAME_POD_U_I_D)
  private String podUID;

  public static final String SERIALIZED_NAME_PROOF_OF_POSSESSION = "proofOfPossession";
  @SerializedName(SERIALIZED_NAME_PROOF_OF_POSSESSION)
  private byte[] proofOfPossession;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_U_I_D = "serviceAccountUID";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_U_I_D)
  private String serviceAccountUID;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;


  public V1alpha1PodCertificateRequestSpec maxExpirationSeconds(Integer maxExpirationSeconds) {

    this.maxExpirationSeconds = maxExpirationSeconds;
    return this;
  }

   /**
   * maxExpirationSeconds is the maximum lifetime permitted for the certificate.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. &#x60;kubernetes.io&#x60; signers will never issue certificates with a lifetime longer than 24 hours.
   * @return maxExpirationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "maxExpirationSeconds is the maximum lifetime permitted for the certificate.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. `kubernetes.io` signers will never issue certificates with a lifetime longer than 24 hours.")

  public Integer getMaxExpirationSeconds() {
    return maxExpirationSeconds;
  }


  public void setMaxExpirationSeconds(Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
  }


  public V1alpha1PodCertificateRequestSpec nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * nodeName is the name of the node the pod is assigned to.
   * @return nodeName
  **/
  @ApiModelProperty(required = true, value = "nodeName is the name of the node the pod is assigned to.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1PodCertificateRequestSpec nodeUID(String nodeUID) {

    this.nodeUID = nodeUID;
    return this;
  }

   /**
   * nodeUID is the UID of the node the pod is assigned to.
   * @return nodeUID
  **/
  @ApiModelProperty(required = true, value = "nodeUID is the UID of the node the pod is assigned to.")

  public String getNodeUID() {
    return nodeUID;
  }


  public void setNodeUID(String nodeUID) {
    this.nodeUID = nodeUID;
  }


  public V1alpha1PodCertificateRequestSpec pkixPublicKey(byte[] pkixPublicKey) {

    this.pkixPublicKey = pkixPublicKey;
    return this;
  }

   /**
   * pkixPublicKey is the PKIX-serialized public key the signer will issue the certificate to.  The key must be one of RSA3072, RSA4096, ECDSAP256, ECDSAP384, ECDSAP521, or ED25519. Note that this list may be expanded in the future.  Signer implementations do not need to support all key types supported by kube-apiserver and kubelet.  If a signer does not support the key type used for a given PodCertificateRequest, it must deny the request by setting a status.conditions entry with a type of \&quot;Denied\&quot; and a reason of \&quot;UnsupportedKeyType\&quot;. It may also suggest a key type that it does support in the message field.
   * @return pkixPublicKey
  **/
  @ApiModelProperty(required = true, value = "pkixPublicKey is the PKIX-serialized public key the signer will issue the certificate to.  The key must be one of RSA3072, RSA4096, ECDSAP256, ECDSAP384, ECDSAP521, or ED25519. Note that this list may be expanded in the future.  Signer implementations do not need to support all key types supported by kube-apiserver and kubelet.  If a signer does not support the key type used for a given PodCertificateRequest, it must deny the request by setting a status.conditions entry with a type of \"Denied\" and a reason of \"UnsupportedKeyType\". It may also suggest a key type that it does support in the message field.")

  public byte[] getPkixPublicKey() {
    return pkixPublicKey;
  }


  public void setPkixPublicKey(byte[] pkixPublicKey) {
    this.pkixPublicKey = pkixPublicKey;
  }


  public V1alpha1PodCertificateRequestSpec podName(String podName) {

    this.podName = podName;
    return this;
  }

   /**
   * podName is the name of the pod into which the certificate will be mounted.
   * @return podName
  **/
  @ApiModelProperty(required = true, value = "podName is the name of the pod into which the certificate will be mounted.")

  public String getPodName() {
    return podName;
  }


  public void setPodName(String podName) {
    this.podName = podName;
  }


  public V1alpha1PodCertificateRequestSpec podUID(String podUID) {

    this.podUID = podUID;
    return this;
  }

   /**
   * podUID is the UID of the pod into which the certificate will be mounted.
   * @return podUID
  **/
  @ApiModelProperty(required = true, value = "podUID is the UID of the pod into which the certificate will be mounted.")

  public String getPodUID() {
    return podUID;
  }


  public void setPodUID(String podUID) {
    this.podUID = podUID;
  }


  public V1alpha1PodCertificateRequestSpec proofOfPossession(byte[] proofOfPossession) {

    this.proofOfPossession = proofOfPossession;
    return this;
  }

   /**
   * proofOfPossession proves that the requesting kubelet holds the private key corresponding to pkixPublicKey.  It is contructed by signing the ASCII bytes of the pod&#39;s UID using &#x60;pkixPublicKey&#x60;.  kube-apiserver validates the proof of possession during creation of the PodCertificateRequest.  If the key is an RSA key, then the signature is over the ASCII bytes of the pod UID, using RSASSA-PSS from RFC 8017 (as implemented by the golang function crypto/rsa.SignPSS with nil options).  If the key is an ECDSA key, then the signature is as described by [SEC 1, Version 2.0](https://www.secg.org/sec1-v2.pdf) (as implemented by the golang library function crypto/ecdsa.SignASN1)  If the key is an ED25519 key, the the signature is as described by the [ED25519 Specification](https://ed25519.cr.yp.to/) (as implemented by the golang library crypto/ed25519.Sign).
   * @return proofOfPossession
  **/
  @ApiModelProperty(required = true, value = "proofOfPossession proves that the requesting kubelet holds the private key corresponding to pkixPublicKey.  It is contructed by signing the ASCII bytes of the pod's UID using `pkixPublicKey`.  kube-apiserver validates the proof of possession during creation of the PodCertificateRequest.  If the key is an RSA key, then the signature is over the ASCII bytes of the pod UID, using RSASSA-PSS from RFC 8017 (as implemented by the golang function crypto/rsa.SignPSS with nil options).  If the key is an ECDSA key, then the signature is as described by [SEC 1, Version 2.0](https://www.secg.org/sec1-v2.pdf) (as implemented by the golang library function crypto/ecdsa.SignASN1)  If the key is an ED25519 key, the the signature is as described by the [ED25519 Specification](https://ed25519.cr.yp.to/) (as implemented by the golang library crypto/ed25519.Sign).")

  public byte[] getProofOfPossession() {
    return proofOfPossession;
  }


  public void setProofOfPossession(byte[] proofOfPossession) {
    this.proofOfPossession = proofOfPossession;
  }


  public V1alpha1PodCertificateRequestSpec serviceAccountName(String serviceAccountName) {

    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * serviceAccountName is the name of the service account the pod is running as.
   * @return serviceAccountName
  **/
  @ApiModelProperty(required = true, value = "serviceAccountName is the name of the service account the pod is running as.")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public V1alpha1PodCertificateRequestSpec serviceAccountUID(String serviceAccountUID) {

    this.serviceAccountUID = serviceAccountUID;
    return this;
  }

   /**
   * serviceAccountUID is the UID of the service account the pod is running as.
   * @return serviceAccountUID
  **/
  @ApiModelProperty(required = true, value = "serviceAccountUID is the UID of the service account the pod is running as.")

  public String getServiceAccountUID() {
    return serviceAccountUID;
  }


  public void setServiceAccountUID(String serviceAccountUID) {
    this.serviceAccountUID = serviceAccountUID;
  }


  public V1alpha1PodCertificateRequestSpec signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * signerName indicates the requested signer.  All signer names beginning with &#x60;kubernetes.io&#x60; are reserved for use by the Kubernetes project.  There is currently one well-known signer documented by the Kubernetes project, &#x60;kubernetes.io/kube-apiserver-client-pod&#x60;, which will issue client certificates understood by kube-apiserver.  It is currently unimplemented.
   * @return signerName
  **/
  @ApiModelProperty(required = true, value = "signerName indicates the requested signer.  All signer names beginning with `kubernetes.io` are reserved for use by the Kubernetes project.  There is currently one well-known signer documented by the Kubernetes project, `kubernetes.io/kube-apiserver-client-pod`, which will issue client certificates understood by kube-apiserver.  It is currently unimplemented.")

  public String getSignerName() {
    return signerName;
  }


  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodCertificateRequestSpec v1alpha1PodCertificateRequestSpec = (V1alpha1PodCertificateRequestSpec) o;
    return Objects.equals(this.maxExpirationSeconds, v1alpha1PodCertificateRequestSpec.maxExpirationSeconds) &&
        Objects.equals(this.nodeName, v1alpha1PodCertificateRequestSpec.nodeName) &&
        Objects.equals(this.nodeUID, v1alpha1PodCertificateRequestSpec.nodeUID) &&
        Arrays.equals(this.pkixPublicKey, v1alpha1PodCertificateRequestSpec.pkixPublicKey) &&
        Objects.equals(this.podName, v1alpha1PodCertificateRequestSpec.podName) &&
        Objects.equals(this.podUID, v1alpha1PodCertificateRequestSpec.podUID) &&
        Arrays.equals(this.proofOfPossession, v1alpha1PodCertificateRequestSpec.proofOfPossession) &&
        Objects.equals(this.serviceAccountName, v1alpha1PodCertificateRequestSpec.serviceAccountName) &&
        Objects.equals(this.serviceAccountUID, v1alpha1PodCertificateRequestSpec.serviceAccountUID) &&
        Objects.equals(this.signerName, v1alpha1PodCertificateRequestSpec.signerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxExpirationSeconds, nodeName, nodeUID, Arrays.hashCode(pkixPublicKey), podName, podUID, Arrays.hashCode(proofOfPossession), serviceAccountName, serviceAccountUID, signerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodCertificateRequestSpec {\n");
    sb.append("    maxExpirationSeconds: ").append(toIndentedString(maxExpirationSeconds)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeUID: ").append(toIndentedString(nodeUID)).append("\n");
    sb.append("    pkixPublicKey: ").append(toIndentedString(pkixPublicKey)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    podUID: ").append(toIndentedString(podUID)).append("\n");
    sb.append("    proofOfPossession: ").append(toIndentedString(proofOfPossession)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    serviceAccountUID: ").append(toIndentedString(serviceAccountUID)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
