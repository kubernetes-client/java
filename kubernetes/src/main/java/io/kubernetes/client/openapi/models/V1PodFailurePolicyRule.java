/*
Copyright 2023 The Kubernetes Authors.
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirement;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.
 */
@ApiModel(description = "PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1PodFailurePolicyRule {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ON_EXIT_CODES = "onExitCodes";
  @SerializedName(SERIALIZED_NAME_ON_EXIT_CODES)
  private V1PodFailurePolicyOnExitCodesRequirement onExitCodes;

  public static final String SERIALIZED_NAME_ON_POD_CONDITIONS = "onPodConditions";
  @SerializedName(SERIALIZED_NAME_ON_POD_CONDITIONS)
  private List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions = null;


  public V1PodFailurePolicyRule action(String action) {

    this.action = action;
    return this;
  }

   /**
   * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:  - FailJob: indicates that the pod&#39;s job is marked as Failed and all   running pods are terminated. - FailIndex: indicates that the pod&#39;s index is marked as Failed and will   not be restarted.   This value is alpha-level. It can be used when the   &#x60;JobBackoffLimitPerIndex&#x60; feature gate is enabled (disabled by default). - Ignore: indicates that the counter towards the .backoffLimit is not   incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the   counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:  - FailJob: indicates that the pod's job is marked as Failed and all   running pods are terminated. - FailIndex: indicates that the pod's index is marked as Failed and will   not be restarted.   This value is alpha-level. It can be used when the   `JobBackoffLimitPerIndex` feature gate is enabled (disabled by default). - Ignore: indicates that the counter towards the .backoffLimit is not   incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the   counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public V1PodFailurePolicyRule onExitCodes(V1PodFailurePolicyOnExitCodesRequirement onExitCodes) {

    this.onExitCodes = onExitCodes;
    return this;
  }

   /**
   * Get onExitCodes
   * @return onExitCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PodFailurePolicyOnExitCodesRequirement getOnExitCodes() {
    return onExitCodes;
  }


  public void setOnExitCodes(V1PodFailurePolicyOnExitCodesRequirement onExitCodes) {
    this.onExitCodes = onExitCodes;
  }


  public V1PodFailurePolicyRule onPodConditions(List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions) {

    this.onPodConditions = onPodConditions;
    return this;
  }

  public V1PodFailurePolicyRule addOnPodConditionsItem(V1PodFailurePolicyOnPodConditionsPattern onPodConditionsItem) {
    if (this.onPodConditions == null) {
      this.onPodConditions = new ArrayList<>();
    }
    this.onPodConditions.add(onPodConditionsItem);
    return this;
  }

   /**
   * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
   * @return onPodConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.")

  public List<V1PodFailurePolicyOnPodConditionsPattern> getOnPodConditions() {
    return onPodConditions;
  }


  public void setOnPodConditions(List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
    this.onPodConditions = onPodConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodFailurePolicyRule v1PodFailurePolicyRule = (V1PodFailurePolicyRule) o;
    return Objects.equals(this.action, v1PodFailurePolicyRule.action) &&
        Objects.equals(this.onExitCodes, v1PodFailurePolicyRule.onExitCodes) &&
        Objects.equals(this.onPodConditions, v1PodFailurePolicyRule.onPodConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, onExitCodes, onPodConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodFailurePolicyRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    onExitCodes: ").append(toIndentedString(onExitCodes)).append("\n");
    sb.append("    onPodConditions: ").append(toIndentedString(onPodConditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
