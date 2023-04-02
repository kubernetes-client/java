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
import java.util.List;
import java.util.Objects;

/** Status of the Issuer. This is set and managed automatically. */
@ApiModel(description = "Status of the Issuer. This is set and managed automatically.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-18T19:55:23.947Z[Etc/UTC]")
public class V1alpha2IssuerStatus {
  public static final String SERIALIZED_NAME_ACME = "acme";

  @SerializedName(SERIALIZED_NAME_ACME)
  private V1alpha2IssuerStatusAcme acme;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha2IssuerStatusConditions> conditions = null;

  public V1alpha2IssuerStatus acme(V1alpha2IssuerStatusAcme acme) {

    this.acme = acme;
    return this;
  }

  /**
   * Get acme
   *
   * @return acme
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha2IssuerStatusAcme getAcme() {
    return acme;
  }

  public void setAcme(V1alpha2IssuerStatusAcme acme) {
    this.acme = acme;
  }

  public V1alpha2IssuerStatus conditions(List<V1alpha2IssuerStatusConditions> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1alpha2IssuerStatus addConditionsItem(V1alpha2IssuerStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1alpha2IssuerStatusConditions>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * List of status conditions to indicate the status of a CertificateRequest. Known condition types
   * are &#x60;Ready&#x60;.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of status conditions to indicate the status of a CertificateRequest. Known condition types are `Ready`.")
  public List<V1alpha2IssuerStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1alpha2IssuerStatusConditions> conditions) {
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
    V1alpha2IssuerStatus v1alpha2IssuerStatus = (V1alpha2IssuerStatus) o;
    return Objects.equals(this.acme, v1alpha2IssuerStatus.acme)
        && Objects.equals(this.conditions, v1alpha2IssuerStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acme, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2IssuerStatus {\n");
    sb.append("    acme: ").append(toIndentedString(acme)).append("\n");
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
