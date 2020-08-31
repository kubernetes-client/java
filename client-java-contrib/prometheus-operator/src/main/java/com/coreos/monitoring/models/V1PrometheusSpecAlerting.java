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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Define details regarding alerting. */
@ApiModel(description = "Define details regarding alerting.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecAlerting {
  public static final String SERIALIZED_NAME_ALERTMANAGERS = "alertmanagers";

  @SerializedName(SERIALIZED_NAME_ALERTMANAGERS)
  private List<V1PrometheusSpecAlertingAlertmanagers> alertmanagers =
      new ArrayList<V1PrometheusSpecAlertingAlertmanagers>();

  public V1PrometheusSpecAlerting alertmanagers(
      List<V1PrometheusSpecAlertingAlertmanagers> alertmanagers) {

    this.alertmanagers = alertmanagers;
    return this;
  }

  public V1PrometheusSpecAlerting addAlertmanagersItem(
      V1PrometheusSpecAlertingAlertmanagers alertmanagersItem) {
    this.alertmanagers.add(alertmanagersItem);
    return this;
  }

  /**
   * AlertmanagerEndpoints Prometheus should fire alerts against.
   *
   * @return alertmanagers
   */
  @ApiModelProperty(
      required = true,
      value = "AlertmanagerEndpoints Prometheus should fire alerts against.")
  public List<V1PrometheusSpecAlertingAlertmanagers> getAlertmanagers() {
    return alertmanagers;
  }

  public void setAlertmanagers(List<V1PrometheusSpecAlertingAlertmanagers> alertmanagers) {
    this.alertmanagers = alertmanagers;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecAlerting v1PrometheusSpecAlerting = (V1PrometheusSpecAlerting) o;
    return Objects.equals(this.alertmanagers, v1PrometheusSpecAlerting.alertmanagers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertmanagers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecAlerting {\n");
    sb.append("    alertmanagers: ").append(toIndentedString(alertmanagers)).append("\n");
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
