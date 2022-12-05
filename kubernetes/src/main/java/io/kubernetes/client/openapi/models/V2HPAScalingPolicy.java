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
import java.util.Objects;

/** HPAScalingPolicy is a single policy which must hold true for a specified past interval. */
@ApiModel(
    description =
        "HPAScalingPolicy is a single policy which must hold true for a specified past interval.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2HPAScalingPolicy {
  public static final String SERIALIZED_NAME_PERIOD_SECONDS = "periodSeconds";

  @SerializedName(SERIALIZED_NAME_PERIOD_SECONDS)
  private Integer periodSeconds;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public V2HPAScalingPolicy periodSeconds(Integer periodSeconds) {

    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds
   * must be greater than zero and less than or equal to 1800 (30 min).
   *
   * @return periodSeconds
   */
  @ApiModelProperty(
      required = true,
      value =
          "PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public V2HPAScalingPolicy type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Type is used to specify the scaling policy.
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type is used to specify the scaling policy.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V2HPAScalingPolicy value(Integer value) {

    this.value = value;
    return this;
  }

  /**
   * Value contains the amount of change which is permitted by the policy. It must be greater than
   * zero
   *
   * @return value
   */
  @ApiModelProperty(
      required = true,
      value =
          "Value contains the amount of change which is permitted by the policy. It must be greater than zero")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2HPAScalingPolicy v2HPAScalingPolicy = (V2HPAScalingPolicy) o;
    return Objects.equals(this.periodSeconds, v2HPAScalingPolicy.periodSeconds)
        && Objects.equals(this.type, v2HPAScalingPolicy.type)
        && Objects.equals(this.value, v2HPAScalingPolicy.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodSeconds, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HPAScalingPolicy {\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
