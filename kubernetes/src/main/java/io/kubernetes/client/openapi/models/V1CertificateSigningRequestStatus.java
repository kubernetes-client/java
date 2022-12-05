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
import java.util.List;
import java.util.Objects;

/**
 * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed
 * status of the request, and the issued certificate.
 */
@ApiModel(
    description =
        "CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CertificateSigningRequestStatus {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";

  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1CertificateSigningRequestCondition> conditions = null;

  public V1CertificateSigningRequestStatus certificate(byte[] certificate) {

    this.certificate = certificate;
    return this;
  }

  /**
   * certificate is populated with an issued certificate by the signer after an Approved condition
   * is present. This field is set via the /status subresource. Once populated, this field is
   * immutable. If the certificate signing request is denied, a condition of type
   * \&quot;Denied\&quot; is added and this field remains empty. If the signer cannot issue the
   * certificate, a condition of type \&quot;Failed\&quot; is added and this field remains empty.
   * Validation requirements: 1. certificate must contain one or more PEM blocks. 2. All PEM blocks
   * must have the \&quot;CERTIFICATE\&quot; label, contain no headers, and the encoded data must be
   * a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280. 3. Non-PEM
   * content may appear before or after the \&quot;CERTIFICATE\&quot; PEM blocks and is unvalidated,
   * to allow for explanatory text as described in section 5.2 of RFC7468. If more than one PEM
   * block is present, and the definition of the requested spec.signerName does not indicate
   * otherwise, the first block is the issued certificate, and subsequent blocks should be treated
   * as intermediate certificates and presented in TLS handshakes. The certificate is encoded in PEM
   * format. When serialized as JSON or YAML, the data is additionally base64-encoded, so it
   * consists of: base64( -----BEGIN CERTIFICATE----- ... -----END CERTIFICATE----- )
   *
   * @return certificate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.  If the certificate signing request is denied, a condition of type \"Denied\" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type \"Failed\" is added and this field remains empty.  Validation requirements:  1. certificate must contain one or more PEM blocks.  2. All PEM blocks must have the \"CERTIFICATE\" label, contain no headers, and the encoded data   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.  3. Non-PEM content may appear before or after the \"CERTIFICATE\" PEM blocks and is unvalidated,   to allow for explanatory text as described in section 5.2 of RFC7468.  If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.  The certificate is encoded in PEM format.  When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:      base64(     -----BEGIN CERTIFICATE-----     ...     -----END CERTIFICATE-----     )")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1CertificateSigningRequestStatus conditions(
      List<V1CertificateSigningRequestCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1CertificateSigningRequestStatus addConditionsItem(
      V1CertificateSigningRequestCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions applied to the request. Known conditions are \&quot;Approved\&quot;,
   * \&quot;Denied\&quot;, and \&quot;Failed\&quot;.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "conditions applied to the request. Known conditions are \"Approved\", \"Denied\", and \"Failed\".")
  public List<V1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSigningRequestStatus v1CertificateSigningRequestStatus =
        (V1CertificateSigningRequestStatus) o;
    return Arrays.equals(this.certificate, v1CertificateSigningRequestStatus.certificate)
        && Objects.equals(this.conditions, v1CertificateSigningRequestStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(certificate), conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSigningRequestStatus {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
