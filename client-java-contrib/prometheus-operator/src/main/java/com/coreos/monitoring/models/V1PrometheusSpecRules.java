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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** /--rules.*_/ command-line arguments. */
@ApiModel(description = "/--rules.*_/ command-line arguments.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecRules {
  public static final String SERIALIZED_NAME_ALERT = "alert";

  @SerializedName(SERIALIZED_NAME_ALERT)
  private V1PrometheusSpecRulesAlert alert;

  public V1PrometheusSpecRules alert(V1PrometheusSpecRulesAlert alert) {

    this.alert = alert;
    return this;
  }

  /**
   * Get alert
   *
   * @return alert
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PrometheusSpecRulesAlert getAlert() {
    return alert;
  }

  public void setAlert(V1PrometheusSpecRulesAlert alert) {
    this.alert = alert;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecRules v1PrometheusSpecRules = (V1PrometheusSpecRules) o;
    return Objects.equals(this.alert, v1PrometheusSpecRules.alert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecRules {\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
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
