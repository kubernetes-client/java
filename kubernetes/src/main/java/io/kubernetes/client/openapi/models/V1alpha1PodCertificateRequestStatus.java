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
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PodCertificateRequestStatus describes the status of the request, and holds the certificate data if the request is issued.
 */
@ApiModel(description = "PodCertificateRequestStatus describes the status of the request, and holds the certificate data if the request is issued.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1alpha1PodCertificateRequestStatus {
  public static final String SERIALIZED_NAME_BEGIN_REFRESH_AT = "beginRefreshAt";
  @SerializedName(SERIALIZED_NAME_BEGIN_REFRESH_AT)
  private OffsetDateTime beginRefreshAt;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private String certificateChain;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions = null;

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private OffsetDateTime notBefore;


  public V1alpha1PodCertificateRequestStatus beginRefreshAt(OffsetDateTime beginRefreshAt) {

    this.beginRefreshAt = beginRefreshAt;
    return this;
  }

   /**
   * beginRefreshAt is the time at which the kubelet should begin trying to refresh the certificate.  This field is set via the /status subresource, and must be set at the same time as certificateChain.  Once populated, this field is immutable.  This field is only a hint.  Kubelet may start refreshing before or after this time if necessary.
   * @return beginRefreshAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "beginRefreshAt is the time at which the kubelet should begin trying to refresh the certificate.  This field is set via the /status subresource, and must be set at the same time as certificateChain.  Once populated, this field is immutable.  This field is only a hint.  Kubelet may start refreshing before or after this time if necessary.")

  public OffsetDateTime getBeginRefreshAt() {
    return beginRefreshAt;
  }


  public void setBeginRefreshAt(OffsetDateTime beginRefreshAt) {
    this.beginRefreshAt = beginRefreshAt;
  }


  public V1alpha1PodCertificateRequestStatus certificateChain(String certificateChain) {

    this.certificateChain = certificateChain;
    return this;
  }

   /**
   * certificateChain is populated with an issued certificate by the signer. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \&quot;Denied\&quot; is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \&quot;Failed\&quot; is added and this field remains empty.  Validation requirements:  1. certificateChain must consist of one or more PEM-formatted certificates.  2. Each entry must be a valid PEM-wrapped, DER-encoded ASN.1 Certificate as     described in section 4 of RFC5280.  If more than one block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  When projecting the chain into a pod volume, kubelet will drop any data in-between the PEM blocks, as well as any PEM block headers.
   * @return certificateChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "certificateChain is populated with an issued certificate by the signer. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \"Denied\" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \"Failed\" is added and this field remains empty.  Validation requirements:  1. certificateChain must consist of one or more PEM-formatted certificates.  2. Each entry must be a valid PEM-wrapped, DER-encoded ASN.1 Certificate as     described in section 4 of RFC5280.  If more than one block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  When projecting the chain into a pod volume, kubelet will drop any data in-between the PEM blocks, as well as any PEM block headers.")

  public String getCertificateChain() {
    return certificateChain;
  }


  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }


  public V1alpha1PodCertificateRequestStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1alpha1PodCertificateRequestStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions applied to the request.  The types \&quot;Issued\&quot;, \&quot;Denied\&quot;, and \&quot;Failed\&quot; have special handling.  At most one of these conditions may be present, and they must have status \&quot;True\&quot;.  If the request is denied with &#x60;Reason&#x3D;UnsupportedKeyType&#x60;, the signer may suggest a key type that will work in the message field.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "conditions applied to the request.  The types \"Issued\", \"Denied\", and \"Failed\" have special handling.  At most one of these conditions may be present, and they must have status \"True\".  If the request is denied with `Reason=UnsupportedKeyType`, the signer may suggest a key type that will work in the message field.")

  public List<V1Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1PodCertificateRequestStatus notAfter(OffsetDateTime notAfter) {

    this.notAfter = notAfter;
    return this;
  }

   /**
   * notAfter is the time at which the certificate expires.  The value must be the same as the notAfter value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable.  The signer must set this field at the same time it sets certificateChain.
   * @return notAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "notAfter is the time at which the certificate expires.  The value must be the same as the notAfter value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable.  The signer must set this field at the same time it sets certificateChain.")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public V1alpha1PodCertificateRequestStatus notBefore(OffsetDateTime notBefore) {

    this.notBefore = notBefore;
    return this;
  }

   /**
   * notBefore is the time at which the certificate becomes valid.  The value must be the same as the notBefore value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable. The signer must set this field at the same time it sets certificateChain.
   * @return notBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "notBefore is the time at which the certificate becomes valid.  The value must be the same as the notBefore value in the leaf certificate in certificateChain.  This field is set via the /status subresource.  Once populated, it is immutable. The signer must set this field at the same time it sets certificateChain.")

  public OffsetDateTime getNotBefore() {
    return notBefore;
  }


  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodCertificateRequestStatus v1alpha1PodCertificateRequestStatus = (V1alpha1PodCertificateRequestStatus) o;
    return Objects.equals(this.beginRefreshAt, v1alpha1PodCertificateRequestStatus.beginRefreshAt) &&
        Objects.equals(this.certificateChain, v1alpha1PodCertificateRequestStatus.certificateChain) &&
        Objects.equals(this.conditions, v1alpha1PodCertificateRequestStatus.conditions) &&
        Objects.equals(this.notAfter, v1alpha1PodCertificateRequestStatus.notAfter) &&
        Objects.equals(this.notBefore, v1alpha1PodCertificateRequestStatus.notBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginRefreshAt, certificateChain, conditions, notAfter, notBefore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodCertificateRequestStatus {\n");
    sb.append("    beginRefreshAt: ").append(toIndentedString(beginRefreshAt)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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
