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

/**
 * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition
 * type.
 */
@ApiModel(
    description =
        "PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodFailurePolicyOnPodConditionsPattern {
  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1PodFailurePolicyOnPodConditionsPattern status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Specifies the required Pod condition status. To match a pod condition it is required that the
   * specified status equals the pod condition status. Defaults to True.
   *
   * @return status
   */
  @ApiModelProperty(
      required = true,
      value =
          "Specifies the required Pod condition status. To match a pod condition it is required that the specified status equals the pod condition status. Defaults to True.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1PodFailurePolicyOnPodConditionsPattern type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Specifies the required Pod condition type. To match a pod condition it is required that
   * specified type equals the pod condition type.
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "Specifies the required Pod condition type. To match a pod condition it is required that specified type equals the pod condition type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyOnPodConditionsPattern v1PodFailurePolicyOnPodConditionsPattern =
        (V1PodFailurePolicyOnPodConditionsPattern) o;
    return Objects.equals(this.status, v1PodFailurePolicyOnPodConditionsPattern.status)
        && Objects.equals(this.type, v1PodFailurePolicyOnPodConditionsPattern.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyOnPodConditionsPattern {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
