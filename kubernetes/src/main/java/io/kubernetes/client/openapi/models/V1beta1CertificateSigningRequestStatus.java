/*
Copyright 2021 The Kubernetes Authors.
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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** V1beta1CertificateSigningRequestStatus */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class V1beta1CertificateSigningRequestStatus {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";

  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta1CertificateSigningRequestCondition> conditions = null;

  public V1beta1CertificateSigningRequestStatus certificate(byte[] certificate) {

    this.certificate = certificate;
    return this;
  }

  /**
   * If request was approved, the controller will place the issued certificate here.
   *
   * @return certificate
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "If request was approved, the controller will place the issued certificate here.")
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public V1beta1CertificateSigningRequestStatus conditions(
      List<V1beta1CertificateSigningRequestCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1CertificateSigningRequestStatus addConditionsItem(
      V1beta1CertificateSigningRequestCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions applied to the request, such as approval or denial.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions applied to the request, such as approval or denial.")
  public List<V1beta1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1CertificateSigningRequestCondition> conditions) {
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
    V1beta1CertificateSigningRequestStatus v1beta1CertificateSigningRequestStatus =
        (V1beta1CertificateSigningRequestStatus) o;
    return Arrays.equals(this.certificate, v1beta1CertificateSigningRequestStatus.certificate)
        && Objects.equals(this.conditions, v1beta1CertificateSigningRequestStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(certificate), conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSigningRequestStatus {\n");
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
