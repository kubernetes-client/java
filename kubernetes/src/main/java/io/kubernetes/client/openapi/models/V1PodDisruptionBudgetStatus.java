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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget.
 * Status may trail the actual state of a system.
 */
@ApiModel(
    description =
        "PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodDisruptionBudgetStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions = null;

  public static final String SERIALIZED_NAME_CURRENT_HEALTHY = "currentHealthy";

  @SerializedName(SERIALIZED_NAME_CURRENT_HEALTHY)
  private Integer currentHealthy;

  public static final String SERIALIZED_NAME_DESIRED_HEALTHY = "desiredHealthy";

  @SerializedName(SERIALIZED_NAME_DESIRED_HEALTHY)
  private Integer desiredHealthy;

  public static final String SERIALIZED_NAME_DISRUPTED_PODS = "disruptedPods";

  @SerializedName(SERIALIZED_NAME_DISRUPTED_PODS)
  private Map<String, OffsetDateTime> disruptedPods = null;

  public static final String SERIALIZED_NAME_DISRUPTIONS_ALLOWED = "disruptionsAllowed";

  @SerializedName(SERIALIZED_NAME_DISRUPTIONS_ALLOWED)
  private Integer disruptionsAllowed;

  public static final String SERIALIZED_NAME_EXPECTED_PODS = "expectedPods";

  @SerializedName(SERIALIZED_NAME_EXPECTED_PODS)
  private Integer expectedPods;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public V1PodDisruptionBudgetStatus conditions(List<V1Condition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1PodDisruptionBudgetStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed
   * condition. The following are known values for the reason field (additional reasons could be
   * added in the future): - SyncFailed: The controller encountered an error and wasn&#39;t able to
   * compute the number of allowed disruptions. Therefore no disruptions are allowed and the status
   * of the condition will be False. - InsufficientPods: The number of pods are either at or below
   * the number required by the PodDisruptionBudget. No disruptions are allowed and the status of
   * the condition will be False. - SufficientPods: There are more pods than required by the
   * PodDisruptionBudget. The condition will be True, and the number of allowed disruptions are
   * provided by the disruptionsAllowed property.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn't able to compute               the number of allowed disruptions. Therefore no disruptions are               allowed and the status of the condition will be False. - InsufficientPods: The number of pods are either at or below the number                     required by the PodDisruptionBudget. No disruptions are                     allowed and the status of the condition will be False. - SufficientPods: There are more pods than required by the PodDisruptionBudget.                   The condition will be True, and the number of allowed                   disruptions are provided by the disruptionsAllowed property.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }

  public V1PodDisruptionBudgetStatus currentHealthy(Integer currentHealthy) {

    this.currentHealthy = currentHealthy;
    return this;
  }

  /**
   * current number of healthy pods
   *
   * @return currentHealthy
   */
  @ApiModelProperty(required = true, value = "current number of healthy pods")
  public Integer getCurrentHealthy() {
    return currentHealthy;
  }

  public void setCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
  }

  public V1PodDisruptionBudgetStatus desiredHealthy(Integer desiredHealthy) {

    this.desiredHealthy = desiredHealthy;
    return this;
  }

  /**
   * minimum desired number of healthy pods
   *
   * @return desiredHealthy
   */
  @ApiModelProperty(required = true, value = "minimum desired number of healthy pods")
  public Integer getDesiredHealthy() {
    return desiredHealthy;
  }

  public void setDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
  }

  public V1PodDisruptionBudgetStatus disruptedPods(Map<String, OffsetDateTime> disruptedPods) {

    this.disruptedPods = disruptedPods;
    return this;
  }

  public V1PodDisruptionBudgetStatus putDisruptedPodsItem(
      String key, OffsetDateTime disruptedPodsItem) {
    if (this.disruptedPods == null) {
      this.disruptedPods = new HashMap<>();
    }
    this.disruptedPods.put(key, disruptedPodsItem);
    return this;
  }

  /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server
   * eviction subresource handler but has not yet been observed by the PodDisruptionBudget
   * controller. A pod will be in this map from the time when the API server processed the eviction
   * request to the time when the pod is seen by PDB controller as having been marked for deletion
   * (or after a timeout). The key in the map is the name of the pod and the value is the time when
   * the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is
   * still there it will be removed from the list automatically by PodDisruptionBudget controller
   * after some time. If everything goes smooth this map should be empty for the most of the time.
   * Large number of entries in the map may indicate problems with pod deletions.
   *
   * @return disruptedPods
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.")
  public Map<String, OffsetDateTime> getDisruptedPods() {
    return disruptedPods;
  }

  public void setDisruptedPods(Map<String, OffsetDateTime> disruptedPods) {
    this.disruptedPods = disruptedPods;
  }

  public V1PodDisruptionBudgetStatus disruptionsAllowed(Integer disruptionsAllowed) {

    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

  /**
   * Number of pod disruptions that are currently allowed.
   *
   * @return disruptionsAllowed
   */
  @ApiModelProperty(
      required = true,
      value = "Number of pod disruptions that are currently allowed.")
  public Integer getDisruptionsAllowed() {
    return disruptionsAllowed;
  }

  public void setDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
  }

  public V1PodDisruptionBudgetStatus expectedPods(Integer expectedPods) {

    this.expectedPods = expectedPods;
    return this;
  }

  /**
   * total number of pods counted by this disruption budget
   *
   * @return expectedPods
   */
  @ApiModelProperty(
      required = true,
      value = "total number of pods counted by this disruption budget")
  public Integer getExpectedPods() {
    return expectedPods;
  }

  public void setExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
  }

  public V1PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
   * status information is valid only if observedGeneration equals to PDB&#39;s object generation.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDisruptionBudgetStatus v1PodDisruptionBudgetStatus = (V1PodDisruptionBudgetStatus) o;
    return Objects.equals(this.conditions, v1PodDisruptionBudgetStatus.conditions)
        && Objects.equals(this.currentHealthy, v1PodDisruptionBudgetStatus.currentHealthy)
        && Objects.equals(this.desiredHealthy, v1PodDisruptionBudgetStatus.desiredHealthy)
        && Objects.equals(this.disruptedPods, v1PodDisruptionBudgetStatus.disruptedPods)
        && Objects.equals(this.disruptionsAllowed, v1PodDisruptionBudgetStatus.disruptionsAllowed)
        && Objects.equals(this.expectedPods, v1PodDisruptionBudgetStatus.expectedPods)
        && Objects.equals(this.observedGeneration, v1PodDisruptionBudgetStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditions,
        currentHealthy,
        desiredHealthy,
        disruptedPods,
        disruptionsAllowed,
        expectedPods,
        observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDisruptionBudgetStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentHealthy: ").append(toIndentedString(currentHealthy)).append("\n");
    sb.append("    desiredHealthy: ").append(toIndentedString(desiredHealthy)).append("\n");
    sb.append("    disruptedPods: ").append(toIndentedString(disruptedPods)).append("\n");
    sb.append("    disruptionsAllowed: ").append(toIndentedString(disruptionsAllowed)).append("\n");
    sb.append("    expectedPods: ").append(toIndentedString(expectedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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
