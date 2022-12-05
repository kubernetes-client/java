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

/** DeploymentStatus is the most recently observed status of the Deployment. */
@ApiModel(description = "DeploymentStatus is the most recently observed status of the Deployment.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1DeploymentStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_COLLISION_COUNT = "collisionCount";

  @SerializedName(SERIALIZED_NAME_COLLISION_COUNT)
  private Integer collisionCount;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1DeploymentCondition> conditions = null;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";

  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_UNAVAILABLE_REPLICAS = "unavailableReplicas";

  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_REPLICAS)
  private Integer unavailableReplicas;

  public static final String SERIALIZED_NAME_UPDATED_REPLICAS = "updatedReplicas";

  @SerializedName(SERIALIZED_NAME_UPDATED_REPLICAS)
  private Integer updatedReplicas;

  public V1DeploymentStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this
   * deployment.
   *
   * @return availableReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1DeploymentStatus collisionCount(Integer collisionCount) {

    this.collisionCount = collisionCount;
    return this;
  }

  /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
   * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   *
   * @return collisionCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public V1DeploymentStatus conditions(List<V1DeploymentCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1DeploymentStatus addConditionsItem(V1DeploymentCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a deployment&#39;s current state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Represents the latest available observations of a deployment's current state.")
  public List<V1DeploymentCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }

  public V1DeploymentStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The generation observed by the deployment controller.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The generation observed by the deployment controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1DeploymentStatus readyReplicas(Integer readyReplicas) {

    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
   *
   * @return readyReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public V1DeploymentStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the
   * selector).
   *
   * @return replicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Total number of non-terminated pods targeted by this deployment (their labels match the selector).")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1DeploymentStatus unavailableReplicas(Integer unavailableReplicas) {

    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

  /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods
   * that are still required for the deployment to have 100% available capacity. They may either be
   * pods that are running but not yet available or pods that still have not been created.
   *
   * @return unavailableReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.")
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }

  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }

  public V1DeploymentStatus updatedReplicas(Integer updatedReplicas) {

    this.updatedReplicas = updatedReplicas;
    return this;
  }

  /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template
   * spec.
   *
   * @return updatedReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Total number of non-terminated pods targeted by this deployment that have the desired template spec.")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeploymentStatus v1DeploymentStatus = (V1DeploymentStatus) o;
    return Objects.equals(this.availableReplicas, v1DeploymentStatus.availableReplicas)
        && Objects.equals(this.collisionCount, v1DeploymentStatus.collisionCount)
        && Objects.equals(this.conditions, v1DeploymentStatus.conditions)
        && Objects.equals(this.observedGeneration, v1DeploymentStatus.observedGeneration)
        && Objects.equals(this.readyReplicas, v1DeploymentStatus.readyReplicas)
        && Objects.equals(this.replicas, v1DeploymentStatus.replicas)
        && Objects.equals(this.unavailableReplicas, v1DeploymentStatus.unavailableReplicas)
        && Objects.equals(this.updatedReplicas, v1DeploymentStatus.updatedReplicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableReplicas,
        collisionCount,
        conditions,
        observedGeneration,
        readyReplicas,
        replicas,
        unavailableReplicas,
        updatedReplicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeploymentStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ")
        .append(toIndentedString(unavailableReplicas))
        .append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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
