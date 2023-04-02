/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** CertificateSigningRequestSpec contains the certificate request. */
@ApiModel(description = "CertificateSigningRequestSpec contains the certificate request.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CertificateSigningRequestSpec {
  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";

  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Integer expirationSeconds;

  public static final String SERIALIZED_NAME_EXTRA = "extra";

  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";

  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = null;

  public static final String SERIALIZED_NAME_REQUEST = "request";

  @SerializedName(SERIALIZED_NAME_REQUEST)
  private byte[] request;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";

  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_UID = "uid";

  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USAGES = "usages";

  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<String> usages = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";

  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public V1CertificateSigningRequestSpec expirationSeconds(Integer expirationSeconds) {

    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * expirationSeconds is the requested duration of validity of the issued certificate. The
   * certificate signer may issue a certificate with a different validity duration so a client must
   * check the delta between the notBefore and and notAfter fields in the issued certificate to
   * determine the actual duration. The v1.22+ in-tree implementations of the well-known Kubernetes
   * signers will honor this field as long as the requested duration is not greater than the maximum
   * duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes
   * controller manager. Certificate signers may not honor this field for various reasons: 1. Old
   * signer that is unaware of the field (such as the in-tree implementations prior to v1.22) 2.
   * Signer whose configured maximum is shorter than the requested duration 3. Signer whose
   * configured minimum is longer than the requested duration The minimum valid value for
   * expirationSeconds is 600, i.e. 10 minutes.
   *
   * @return expirationSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.  The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.  Certificate signers may not honor this field for various reasons:    1. Old signer that is unaware of the field (such as the in-tree      implementations prior to v1.22)   2. Signer whose configured maximum is shorter than the requested duration   3. Signer whose configured minimum is longer than the requested duration  The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.")
  public Integer getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  public V1CertificateSigningRequestSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public V1CertificateSigningRequestSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

  /**
   * extra contains extra attributes of the user that created the CertificateSigningRequest.
   * Populated by the API server on creation and immutable.
   *
   * @return extra
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public V1CertificateSigningRequestSpec groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public V1CertificateSigningRequestSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * groups contains group membership of the user that created the CertificateSigningRequest.
   * Populated by the API server on creation and immutable.
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public V1CertificateSigningRequestSpec request(byte[] request) {

    this.request = request;
    return this;
  }

  /**
   * request contains an x509 certificate signing request encoded in a \&quot;CERTIFICATE
   * REQUEST\&quot; PEM block. When serialized as JSON or YAML, the data is additionally
   * base64-encoded.
   *
   * @return request
   */
  @ApiModelProperty(
      required = true,
      value =
          "request contains an x509 certificate signing request encoded in a \"CERTIFICATE REQUEST\" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.")
  public byte[] getRequest() {
    return request;
  }

  public void setRequest(byte[] request) {
    this.request = request;
  }

  public V1CertificateSigningRequestSpec signerName(String signerName) {

    this.signerName = signerName;
    return this;
  }

  /**
   * signerName indicates the requested signer, and is a qualified name. List/watch requests for
   * CertificateSigningRequests can filter on this field using a
   * \&quot;spec.signerName&#x3D;NAME\&quot; fieldSelector. Well-known Kubernetes signers are: 1.
   * \&quot;kubernetes.io/kube-apiserver-client\&quot;: issues client certificates that can be used
   * to authenticate to kube-apiserver. Requests for this signer are never auto-approved by
   * kube-controller-manager, can be issued by the \&quot;csrsigning\&quot; controller in
   * kube-controller-manager. 2. \&quot;kubernetes.io/kube-apiserver-client-kubelet\&quot;: issues
   * client certificates that kubelets use to authenticate to kube-apiserver. Requests for this
   * signer can be auto-approved by the \&quot;csrapproving\&quot; controller in
   * kube-controller-manager, and can be issued by the \&quot;csrsigning\&quot; controller in
   * kube-controller-manager. 3. \&quot;kubernetes.io/kubelet-serving\&quot; issues serving
   * certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to
   * securely. Requests for this signer are never auto-approved by kube-controller-manager, and can
   * be issued by the \&quot;csrsigning\&quot; controller in kube-controller-manager. More details
   * are available at
   * https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
   * Custom signerNames can also be specified. The signer defines: 1. Trust distribution: how trust
   * (CA bundles) are distributed. 2. Permitted subjects: and behavior when a disallowed subject is
   * requested. 3. Required, permitted, or forbidden x509 extensions in the request (including
   * whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior
   * when a disallowed extension is requested. 4. Required, permitted, or forbidden key usages /
   * extended key usages. 5. Expiration/certificate lifetime: whether it is fixed by the signer,
   * configurable by the admin. 6. Whether or not requests for CA certificates are allowed.
   *
   * @return signerName
   */
  @ApiModelProperty(
      required = true,
      value =
          "signerName indicates the requested signer, and is a qualified name.  List/watch requests for CertificateSigningRequests can filter on this field using a \"spec.signerName=NAME\" fieldSelector.  Well-known Kubernetes signers are:  1. \"kubernetes.io/kube-apiserver-client\": issues client certificates that can be used to authenticate to kube-apiserver.   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the \"csrsigning\" controller in kube-controller-manager.  2. \"kubernetes.io/kube-apiserver-client-kubelet\": issues client certificates that kubelets use to authenticate to kube-apiserver.   Requests for this signer can be auto-approved by the \"csrapproving\" controller in kube-controller-manager, and can be issued by the \"csrsigning\" controller in kube-controller-manager.  3. \"kubernetes.io/kubelet-serving\" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the \"csrsigning\" controller in kube-controller-manager.  More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers  Custom signerNames can also be specified. The signer defines:  1. Trust distribution: how trust (CA bundles) are distributed.  2. Permitted subjects: and behavior when a disallowed subject is requested.  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.  4. Required, permitted, or forbidden key usages / extended key usages.  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.  6. Whether or not requests for CA certificates are allowed.")
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }

  public V1CertificateSigningRequestSpec uid(String uid) {

    this.uid = uid;
    return this;
  }

  /**
   * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the
   * API server on creation and immutable.
   *
   * @return uid
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1CertificateSigningRequestSpec usages(List<String> usages) {

    this.usages = usages;
    return this;
  }

  public V1CertificateSigningRequestSpec addUsagesItem(String usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

  /**
   * usages specifies a set of key usages requested in the issued certificate. Requests for TLS
   * client certificates typically request: \&quot;digital signature\&quot;, \&quot;key
   * encipherment\&quot;, \&quot;client auth\&quot;. Requests for TLS serving certificates typically
   * request: \&quot;key encipherment\&quot;, \&quot;digital signature\&quot;, \&quot;server
   * auth\&quot;. Valid values are: \&quot;signing\&quot;, \&quot;digital signature\&quot;,
   * \&quot;content commitment\&quot;, \&quot;key encipherment\&quot;, \&quot;key agreement\&quot;,
   * \&quot;data encipherment\&quot;, \&quot;cert sign\&quot;, \&quot;crl sign\&quot;,
   * \&quot;encipher only\&quot;, \&quot;decipher only\&quot;, \&quot;any\&quot;, \&quot;server
   * auth\&quot;, \&quot;client auth\&quot;, \&quot;code signing\&quot;, \&quot;email
   * protection\&quot;, \&quot;s/mime\&quot;, \&quot;ipsec end system\&quot;, \&quot;ipsec
   * tunnel\&quot;, \&quot;ipsec user\&quot;, \&quot;timestamping\&quot;, \&quot;ocsp
   * signing\&quot;, \&quot;microsoft sgc\&quot;, \&quot;netscape sgc\&quot;
   *
   * @return usages
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "usages specifies a set of key usages requested in the issued certificate.  Requests for TLS client certificates typically request: \"digital signature\", \"key encipherment\", \"client auth\".  Requests for TLS serving certificates typically request: \"key encipherment\", \"digital signature\", \"server auth\".  Valid values are:  \"signing\", \"digital signature\", \"content commitment\",  \"key encipherment\", \"key agreement\", \"data encipherment\",  \"cert sign\", \"crl sign\", \"encipher only\", \"decipher only\", \"any\",  \"server auth\", \"client auth\",  \"code signing\", \"email protection\", \"s/mime\",  \"ipsec end system\", \"ipsec tunnel\", \"ipsec user\",  \"timestamping\", \"ocsp signing\", \"microsoft sgc\", \"netscape sgc\"")
  public List<String> getUsages() {
    return usages;
  }

  public void setUsages(List<String> usages) {
    this.usages = usages;
  }

  public V1CertificateSigningRequestSpec username(String username) {

    this.username = username;
    return this;
  }

  /**
   * username contains the name of the user that created the CertificateSigningRequest. Populated by
   * the API server on creation and immutable.
   *
   * @return username
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSigningRequestSpec v1CertificateSigningRequestSpec =
        (V1CertificateSigningRequestSpec) o;
    return Objects.equals(this.expirationSeconds, v1CertificateSigningRequestSpec.expirationSeconds)
        && Objects.equals(this.extra, v1CertificateSigningRequestSpec.extra)
        && Objects.equals(this.groups, v1CertificateSigningRequestSpec.groups)
        && Arrays.equals(this.request, v1CertificateSigningRequestSpec.request)
        && Objects.equals(this.signerName, v1CertificateSigningRequestSpec.signerName)
        && Objects.equals(this.uid, v1CertificateSigningRequestSpec.uid)
        && Objects.equals(this.usages, v1CertificateSigningRequestSpec.usages)
        && Objects.equals(this.username, v1CertificateSigningRequestSpec.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        expirationSeconds,
        extra,
        groups,
        Arrays.hashCode(request),
        signerName,
        uid,
        usages,
        username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSigningRequestSpec {\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
