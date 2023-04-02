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

/** DaemonSetStatus represents the current status of a daemon set. */
@ApiModel(description = "DaemonSetStatus represents the current status of a daemon set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DaemonSetStatus {
  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";

  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1DaemonSetCondition> conditions = null;

  public static final String SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED = "currentNumberScheduled";

  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER_SCHEDULED)
  private Integer currentNumberScheduled;

  public static final String SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED = "desiredNumberScheduled";

  @SerializedName(SERIALIZED_NAME_DESIRED_NUMBER_SCHEDULED)
  private Integer desiredNumberScheduled;

  public static final String SERIALIZED_NAME_NUMBER_AVAILABLE = "numberAvailable";

  @SerializedName(SERIALIZED_NAME_NUMBER_AVAILABLE)
  private Integer numberAvailable;

  public static final String SERIALIZED_NAME_NUMBER_MISSCHEDULED = "numberMisscheduled";

  @SerializedName(SERIALIZED_NAME_NUMBER_MISSCHEDULED)
  private Integer numberMisscheduled;

  public static final String SERIALIZED_NAME_NUMBER_READY = "numberReady";

  @SerializedName(SERIALIZED_NAME_NUMBER_READY)
  private Integer numberReady;

  public static final String SERIALIZED_NAME_NUMBER_UNAVAILABLE = "numberUnavailable";

  @SerializedName(SERIALIZED_NAME_NUMBER_UNAVAILABLE)
  private Integer numberUnavailable;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED = "updatedNumberScheduled";

  @SerializedName(SERIALIZED_NAME_UPDATED_NUMBER_SCHEDULED)
  private Integer updatedNumberScheduled;

  public V1DaemonSetStatus collisionCount(Integer collisionCount) {

    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
   * collision avoidance mechanism when it needs to create the name for the newest
   * ControllerRevision.
   *
   * @return collisionCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public V1DaemonSetStatus conditions(List<V1DaemonSetCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1DaemonSetStatus addConditionsItem(V1DaemonSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a DaemonSet&#39;s current state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Represents the latest available observations of a DaemonSet's current state.")
  public List<V1DaemonSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1DaemonSetCondition> conditions) {
    this.conditions = conditions;
  }

  public V1DaemonSetStatus currentNumberScheduled(Integer currentNumberScheduled) {

    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

  /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon
   * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   *
   * @return currentNumberScheduled
   */
  @ApiModelProperty(
      required = true,
      value =
          "The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getCurrentNumberScheduled() {
    return currentNumberScheduled;
  }

  public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
  }

  public V1DaemonSetStatus desiredNumberScheduled(Integer desiredNumberScheduled) {

    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

  /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly
   * running the daemon pod). More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   *
   * @return desiredNumberScheduled
   */
  @ApiModelProperty(
      required = true,
      value =
          "The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getDesiredNumberScheduled() {
    return desiredNumberScheduled;
  }

  public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
  }

  public V1DaemonSetStatus numberAvailable(Integer numberAvailable) {

    this.numberAvailable = numberAvailable;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon
   * pod running and available (ready for at least spec.minReadySeconds)
   *
   * @return numberAvailable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberAvailable() {
    return numberAvailable;
  }

  public void setNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
  }

  public V1DaemonSetStatus numberMisscheduled(Integer numberMisscheduled) {

    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

  /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
   * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   *
   * @return numberMisscheduled
   */
  @ApiModelProperty(
      required = true,
      value =
          "The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getNumberMisscheduled() {
    return numberMisscheduled;
  }

  public void setNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
  }

  public V1DaemonSetStatus numberReady(Integer numberReady) {

    this.numberReady = numberReady;
    return this;
  }

  /**
   * numberReady is the number of nodes that should be running the daemon pod and have one or more
   * of the daemon pod running with a Ready Condition.
   *
   * @return numberReady
   */
  @ApiModelProperty(
      required = true,
      value =
          "numberReady is the number of nodes that should be running the daemon pod and have one or more of the daemon pod running with a Ready Condition.")
  public Integer getNumberReady() {
    return numberReady;
  }

  public void setNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
  }

  public V1DaemonSetStatus numberUnavailable(Integer numberUnavailable) {

    this.numberUnavailable = numberUnavailable;
    return this;
  }

  /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod
   * running and available (ready for at least spec.minReadySeconds)
   *
   * @return numberUnavailable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberUnavailable() {
    return numberUnavailable;
  }

  public void setNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
  }

  public V1DaemonSetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The most recent generation observed by the daemon set controller.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The most recent generation observed by the daemon set controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1DaemonSetStatus updatedNumberScheduled(Integer updatedNumberScheduled) {

    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }

  /**
   * The total number of nodes that are running updated daemon pod
   *
   * @return updatedNumberScheduled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of nodes that are running updated daemon pod")
  public Integer getUpdatedNumberScheduled() {
    return updatedNumberScheduled;
  }

  public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonSetStatus v1DaemonSetStatus = (V1DaemonSetStatus) o;
    return Objects.equals(this.collisionCount, v1DaemonSetStatus.collisionCount)
        && Objects.equals(this.conditions, v1DaemonSetStatus.conditions)
        && Objects.equals(this.currentNumberScheduled, v1DaemonSetStatus.currentNumberScheduled)
        && Objects.equals(this.desiredNumberScheduled, v1DaemonSetStatus.desiredNumberScheduled)
        && Objects.equals(this.numberAvailable, v1DaemonSetStatus.numberAvailable)
        && Objects.equals(this.numberMisscheduled, v1DaemonSetStatus.numberMisscheduled)
        && Objects.equals(this.numberReady, v1DaemonSetStatus.numberReady)
        && Objects.equals(this.numberUnavailable, v1DaemonSetStatus.numberUnavailable)
        && Objects.equals(this.observedGeneration, v1DaemonSetStatus.observedGeneration)
        && Objects.equals(this.updatedNumberScheduled, v1DaemonSetStatus.updatedNumberScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        collisionCount,
        conditions,
        currentNumberScheduled,
        desiredNumberScheduled,
        numberAvailable,
        numberMisscheduled,
        numberReady,
        numberUnavailable,
        observedGeneration,
        updatedNumberScheduled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetStatus {\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentNumberScheduled: ")
        .append(toIndentedString(currentNumberScheduled))
        .append("\n");
    sb.append("    desiredNumberScheduled: ")
        .append(toIndentedString(desiredNumberScheduled))
        .append("\n");
    sb.append("    numberAvailable: ").append(toIndentedString(numberAvailable)).append("\n");
    sb.append("    numberMisscheduled: ").append(toIndentedString(numberMisscheduled)).append("\n");
    sb.append("    numberReady: ").append(toIndentedString(numberReady)).append("\n");
    sb.append("    numberUnavailable: ").append(toIndentedString(numberUnavailable)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    updatedNumberScheduled: ")
        .append(toIndentedString(updatedNumberScheduled))
        .append("\n");
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
