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
 * PodCertificateProjection provides a private key and X.509 certificate in the pod filesystem.
 */
@ApiModel(description = "PodCertificateProjection provides a private key and X.509 certificate in the pod filesystem.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1PodCertificateProjection {
  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN_PATH = "certificateChainPath";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN_PATH)
  private String certificateChainPath;

  public static final String SERIALIZED_NAME_CREDENTIAL_BUNDLE_PATH = "credentialBundlePath";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_BUNDLE_PATH)
  private String credentialBundlePath;

  public static final String SERIALIZED_NAME_KEY_PATH = "keyPath";
  @SerializedName(SERIALIZED_NAME_KEY_PATH)
  private String keyPath;

  public static final String SERIALIZED_NAME_KEY_TYPE = "keyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_MAX_EXPIRATION_SECONDS = "maxExpirationSeconds";
  @SerializedName(SERIALIZED_NAME_MAX_EXPIRATION_SECONDS)
  private Integer maxExpirationSeconds;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;


  public V1PodCertificateProjection certificateChainPath(String certificateChainPath) {

    this.certificateChainPath = certificateChainPath;
    return this;
  }

   /**
   * Write the certificate chain at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.
   * @return certificateChainPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Write the certificate chain at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.")

  public String getCertificateChainPath() {
    return certificateChainPath;
  }


  public void setCertificateChainPath(String certificateChainPath) {
    this.certificateChainPath = certificateChainPath;
  }


  public V1PodCertificateProjection credentialBundlePath(String credentialBundlePath) {

    this.credentialBundlePath = credentialBundlePath;
    return this;
  }

   /**
   * Write the credential bundle at this path in the projected volume.  The credential bundle is a single file that contains multiple PEM blocks. The first PEM block is a PRIVATE KEY block, containing a PKCS#8 private key.  The remaining blocks are CERTIFICATE blocks, containing the issued certificate chain from the signer (leaf and any intermediates).  Using credentialBundlePath lets your Pod&#39;s application code make a single atomic read that retrieves a consistent key and certificate chain.  If you project them to separate files, your application code will need to additionally check that the leaf certificate was issued to the key.
   * @return credentialBundlePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Write the credential bundle at this path in the projected volume.  The credential bundle is a single file that contains multiple PEM blocks. The first PEM block is a PRIVATE KEY block, containing a PKCS#8 private key.  The remaining blocks are CERTIFICATE blocks, containing the issued certificate chain from the signer (leaf and any intermediates).  Using credentialBundlePath lets your Pod's application code make a single atomic read that retrieves a consistent key and certificate chain.  If you project them to separate files, your application code will need to additionally check that the leaf certificate was issued to the key.")

  public String getCredentialBundlePath() {
    return credentialBundlePath;
  }


  public void setCredentialBundlePath(String credentialBundlePath) {
    this.credentialBundlePath = credentialBundlePath;
  }


  public V1PodCertificateProjection keyPath(String keyPath) {

    this.keyPath = keyPath;
    return this;
  }

   /**
   * Write the key at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.
   * @return keyPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Write the key at this path in the projected volume.  Most applications should use credentialBundlePath.  When using keyPath and certificateChainPath, your application needs to check that the key and leaf certificate are consistent, because it is possible to read the files mid-rotation.")

  public String getKeyPath() {
    return keyPath;
  }


  public void setKeyPath(String keyPath) {
    this.keyPath = keyPath;
  }


  public V1PodCertificateProjection keyType(String keyType) {

    this.keyType = keyType;
    return this;
  }

   /**
   * The type of keypair Kubelet will generate for the pod.  Valid values are \&quot;RSA3072\&quot;, \&quot;RSA4096\&quot;, \&quot;ECDSAP256\&quot;, \&quot;ECDSAP384\&quot;, \&quot;ECDSAP521\&quot;, and \&quot;ED25519\&quot;.
   * @return keyType
  **/
  @ApiModelProperty(required = true, value = "The type of keypair Kubelet will generate for the pod.  Valid values are \"RSA3072\", \"RSA4096\", \"ECDSAP256\", \"ECDSAP384\", \"ECDSAP521\", and \"ED25519\".")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public V1PodCertificateProjection maxExpirationSeconds(Integer maxExpirationSeconds) {

    this.maxExpirationSeconds = maxExpirationSeconds;
    return this;
  }

   /**
   * maxExpirationSeconds is the maximum lifetime permitted for the certificate.  Kubelet copies this value verbatim into the PodCertificateRequests it generates for this projection.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. &#x60;kubernetes.io&#x60; signers will never issue certificates with a lifetime longer than 24 hours.
   * @return maxExpirationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "maxExpirationSeconds is the maximum lifetime permitted for the certificate.  Kubelet copies this value verbatim into the PodCertificateRequests it generates for this projection.  If omitted, kube-apiserver will set it to 86400(24 hours). kube-apiserver will reject values shorter than 3600 (1 hour).  The maximum allowable value is 7862400 (91 days).  The signer implementation is then free to issue a certificate with any lifetime *shorter* than MaxExpirationSeconds, but no shorter than 3600 seconds (1 hour).  This constraint is enforced by kube-apiserver. `kubernetes.io` signers will never issue certificates with a lifetime longer than 24 hours.")

  public Integer getMaxExpirationSeconds() {
    return maxExpirationSeconds;
  }


  public void setMaxExpirationSeconds(Integer maxExpirationSeconds) {
    this.maxExpirationSeconds = maxExpirationSeconds;
  }


  public V1PodCertificateProjection signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

   /**
   * Kubelet&#39;s generated CSRs will be addressed to this signer.
   * @return signerName
  **/
  @ApiModelProperty(required = true, value = "Kubelet's generated CSRs will be addressed to this signer.")

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
    V1PodCertificateProjection v1PodCertificateProjection = (V1PodCertificateProjection) o;
    return Objects.equals(this.certificateChainPath, v1PodCertificateProjection.certificateChainPath) &&
        Objects.equals(this.credentialBundlePath, v1PodCertificateProjection.credentialBundlePath) &&
        Objects.equals(this.keyPath, v1PodCertificateProjection.keyPath) &&
        Objects.equals(this.keyType, v1PodCertificateProjection.keyType) &&
        Objects.equals(this.maxExpirationSeconds, v1PodCertificateProjection.maxExpirationSeconds) &&
        Objects.equals(this.signerName, v1PodCertificateProjection.signerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateChainPath, credentialBundlePath, keyPath, keyType, maxExpirationSeconds, signerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodCertificateProjection {\n");
    sb.append("    certificateChainPath: ").append(toIndentedString(certificateChainPath)).append("\n");
    sb.append("    credentialBundlePath: ").append(toIndentedString(credentialBundlePath)).append("\n");
    sb.append("    keyPath: ").append(toIndentedString(keyPath)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    maxExpirationSeconds: ").append(toIndentedString(maxExpirationSeconds)).append("\n");
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
