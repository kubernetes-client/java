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

/** /--rules.alert.*_/ command-line arguments */
@ApiModel(description = "/--rules.alert.*_/ command-line arguments")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1PrometheusSpecRulesAlert {
  public static final String SERIALIZED_NAME_FOR_GRACE_PERIOD = "forGracePeriod";

  @SerializedName(SERIALIZED_NAME_FOR_GRACE_PERIOD)
  private String forGracePeriod;

  public static final String SERIALIZED_NAME_FOR_OUTAGE_TOLERANCE = "forOutageTolerance";

  @SerializedName(SERIALIZED_NAME_FOR_OUTAGE_TOLERANCE)
  private String forOutageTolerance;

  public static final String SERIALIZED_NAME_RESEND_DELAY = "resendDelay";

  @SerializedName(SERIALIZED_NAME_RESEND_DELAY)
  private String resendDelay;

  public V1PrometheusSpecRulesAlert forGracePeriod(String forGracePeriod) {

    this.forGracePeriod = forGracePeriod;
    return this;
  }

  /**
   * Minimum duration between alert and restored &#39;for&#39; state. This is maintained only for
   * alerts with configured &#39;for&#39; time greater than grace period.
   *
   * @return forGracePeriod
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Minimum duration between alert and restored 'for' state. This is maintained only for alerts with configured 'for' time greater than grace period.")
  public String getForGracePeriod() {
    return forGracePeriod;
  }

  public void setForGracePeriod(String forGracePeriod) {
    this.forGracePeriod = forGracePeriod;
  }

  public V1PrometheusSpecRulesAlert forOutageTolerance(String forOutageTolerance) {

    this.forOutageTolerance = forOutageTolerance;
    return this;
  }

  /**
   * Max time to tolerate prometheus outage for restoring &#39;for&#39; state of alert.
   *
   * @return forOutageTolerance
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Max time to tolerate prometheus outage for restoring 'for' state of alert.")
  public String getForOutageTolerance() {
    return forOutageTolerance;
  }

  public void setForOutageTolerance(String forOutageTolerance) {
    this.forOutageTolerance = forOutageTolerance;
  }

  public V1PrometheusSpecRulesAlert resendDelay(String resendDelay) {

    this.resendDelay = resendDelay;
    return this;
  }

  /**
   * Minimum amount of time to wait before resending an alert to Alertmanager.
   *
   * @return resendDelay
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Minimum amount of time to wait before resending an alert to Alertmanager.")
  public String getResendDelay() {
    return resendDelay;
  }

  public void setResendDelay(String resendDelay) {
    this.resendDelay = resendDelay;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PrometheusSpecRulesAlert v1PrometheusSpecRulesAlert = (V1PrometheusSpecRulesAlert) o;
    return Objects.equals(this.forGracePeriod, v1PrometheusSpecRulesAlert.forGracePeriod)
        && Objects.equals(this.forOutageTolerance, v1PrometheusSpecRulesAlert.forOutageTolerance)
        && Objects.equals(this.resendDelay, v1PrometheusSpecRulesAlert.resendDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forGracePeriod, forOutageTolerance, resendDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PrometheusSpecRulesAlert {\n");
    sb.append("    forGracePeriod: ").append(toIndentedString(forGracePeriod)).append("\n");
    sb.append("    forOutageTolerance: ").append(toIndentedString(forOutageTolerance)).append("\n");
    sb.append("    resendDelay: ").append(toIndentedString(resendDelay)).append("\n");
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
