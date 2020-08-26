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
package io.cert.manager.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;

/** Status of the CertificateRequest. This is set and managed automatically. */
@ApiModel(description = "Status of the CertificateRequest. This is set and managed automatically.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1beta1CertificateRequestStatus {
  public static final String SERIALIZED_NAME_CA = "ca";

  @SerializedName(SERIALIZED_NAME_CA)
  private byte[] ca;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";

  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta1CertificateRequestStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_FAILURE_TIME = "failureTime";

  @SerializedName(SERIALIZED_NAME_FAILURE_TIME)
  private DateTime failureTime;

  public V1beta1CertificateRequestStatus ca(byte[] ca) {

    this.ca = ca;
    return this;
  }

  /**
   * The PEM encoded x509 certificate of the signer, also known as the CA (Certificate Authority).
   * This is set on a best-effort basis by different issuers. If not set, the CA is assumed to be
   * unknown/not available.
   *
   * @return ca
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The PEM encoded x509 certificate of the signer, also known as the CA (Certificate Authority). This is set on a best-effort basis by different issuers. If not set, the CA is assumed to be unknown/not available.")
  public byte[] getCa() {
    return ca;
  }

  public void setCa(byte[] ca) {
    this.ca = ca;
  }

  public V1beta1CertificateRequestStatus certificate(byte[] certificate) {

    this.certificate = certificate;
    return this;
  }

  /**
   * The PEM encoded x509 certificate resulting from the certificate signing request. If not set,
   * the CertificateRequest has either not been completed or has failed. More information on failure
   * can be found by checking the &#x60;conditions&#x60; field.
   *
   * @return certificate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The PEM encoded x509 certificate resulting from the certificate signing request. If not set, the CertificateRequest has either not been completed or has failed. More information on failure can be found by checking the `conditions` field.")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1beta1CertificateRequestStatus conditions(
      List<V1beta1CertificateRequestStatusConditions> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1CertificateRequestStatus addConditionsItem(
      V1beta1CertificateRequestStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1CertificateRequestStatusConditions>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * List of status conditions to indicate the status of a CertificateRequest. Known condition types
   * are &#x60;Ready&#x60; and &#x60;InvalidRequest&#x60;.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of status conditions to indicate the status of a CertificateRequest. Known condition types are `Ready` and `InvalidRequest`.")
  public List<V1beta1CertificateRequestStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1CertificateRequestStatusConditions> conditions) {
    this.conditions = conditions;
  }

  public V1beta1CertificateRequestStatus failureTime(DateTime failureTime) {

    this.failureTime = failureTime;
    return this;
  }

  /**
   * FailureTime stores the time that this CertificateRequest failed. This is used to influence
   * garbage collection and back-off.
   *
   * @return failureTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "FailureTime stores the time that this CertificateRequest failed. This is used to influence garbage collection and back-off.")
  public DateTime getFailureTime() {
    return failureTime;
  }

  public void setFailureTime(DateTime failureTime) {
    this.failureTime = failureTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateRequestStatus v1beta1CertificateRequestStatus =
        (V1beta1CertificateRequestStatus) o;
    return Arrays.equals(this.ca, v1beta1CertificateRequestStatus.ca)
        && Arrays.equals(this.certificate, v1beta1CertificateRequestStatus.certificate)
        && Objects.equals(this.conditions, v1beta1CertificateRequestStatus.conditions)
        && Objects.equals(this.failureTime, v1beta1CertificateRequestStatus.failureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(ca), Arrays.hashCode(certificate), conditions, failureTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateRequestStatus {\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failureTime: ").append(toIndentedString(failureTime)).append("\n");
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
