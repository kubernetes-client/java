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
import java.util.List;
import java.util.Objects;

/**
 * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based
 * on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each
 * app container and init container status, represented by the .status.containerStatuses and
 * .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with
 * success (exit code 0) are excluded from the requirement check.
 */
@ApiModel(
    description =
        "PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodFailurePolicyOnExitCodesRequirement {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";

  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";

  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_VALUES = "values";

  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = new ArrayList<>();

  public V1PodFailurePolicyOnExitCodesRequirement containerName(String containerName) {

    this.containerName = containerName;
    return this;
  }

  /**
   * Restricts the check for exit codes to the container with the specified name. When null, the
   * rule applies to all containers. When specified, it should match one the container or
   * initContainer names in the pod template.
   *
   * @return containerName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Restricts the check for exit codes to the container with the specified name. When null, the rule applies to all containers. When specified, it should match one the container or initContainer names in the pod template.")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public V1PodFailurePolicyOnExitCodesRequirement operator(String operator) {

    this.operator = operator;
    return this;
  }

  /**
   * Represents the relationship between the container exit code(s) and the specified values.
   * Containers completed with success (exit code 0) are excluded from the requirement check.
   * Possible values are: - In: the requirement is satisfied if at least one container exit code
   * (might be multiple if there are multiple containers not restricted by the
   * &#39;containerName&#39; field) is in the set of specified values. - NotIn: the requirement is
   * satisfied if at least one container exit code (might be multiple if there are multiple
   * containers not restricted by the &#39;containerName&#39; field) is not in the set of specified
   * values. Additional values are considered to be added in the future. Clients should react to an
   * unknown operator by assuming the requirement is not satisfied.
   *
   * @return operator
   */
  @ApiModelProperty(
      required = true,
      value =
          "Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code   (might be multiple if there are multiple containers not restricted   by the 'containerName' field) is in the set of specified values. - NotIn: the requirement is satisfied if at least one container exit code   (might be multiple if there are multiple containers not restricted   by the 'containerName' field) is not in the set of specified values. Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.  ")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public V1PodFailurePolicyOnExitCodesRequirement values(List<Integer> values) {

    this.values = values;
    return this;
  }

  public V1PodFailurePolicyOnExitCodesRequirement addValuesItem(Integer valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Specifies the set of values. Each returned container exit code (might be multiple in case of
   * multiple containers) is checked against this set of values with respect to the operator. The
   * list of values must be ordered and must not contain duplicates. Value &#39;0&#39; cannot be
   * used for the In operator. At least one element is required. At most 255 elements are allowed.
   *
   * @return values
   */
  @ApiModelProperty(
      required = true,
      value =
          "Specifies the set of values. Each returned container exit code (might be multiple in case of multiple containers) is checked against this set of values with respect to the operator. The list of values must be ordered and must not contain duplicates. Value '0' cannot be used for the In operator. At least one element is required. At most 255 elements are allowed.")
  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyOnExitCodesRequirement v1PodFailurePolicyOnExitCodesRequirement =
        (V1PodFailurePolicyOnExitCodesRequirement) o;
    return Objects.equals(
            this.containerName, v1PodFailurePolicyOnExitCodesRequirement.containerName)
        && Objects.equals(this.operator, v1PodFailurePolicyOnExitCodesRequirement.operator)
        && Objects.equals(this.values, v1PodFailurePolicyOnExitCodesRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyOnExitCodesRequirement {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
