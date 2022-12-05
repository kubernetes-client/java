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

/** ReplicaSetStatus represents the current status of a ReplicaSet. */
@ApiModel(description = "ReplicaSetStatus represents the current status of a ReplicaSet.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1ReplicaSetStatus {
  public static final String SERIALIZED_NAME_AVAILABLE_REPLICAS = "availableReplicas";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_REPLICAS)
  private Integer availableReplicas;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1ReplicaSetCondition> conditions = null;

  public static final String SERIALIZED_NAME_FULLY_LABELED_REPLICAS = "fullyLabeledReplicas";

  @SerializedName(SERIALIZED_NAME_FULLY_LABELED_REPLICAS)
  private Integer fullyLabeledReplicas;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public static final String SERIALIZED_NAME_READY_REPLICAS = "readyReplicas";

  @SerializedName(SERIALIZED_NAME_READY_REPLICAS)
  private Integer readyReplicas;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";

  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public V1ReplicaSetStatus availableReplicas(Integer availableReplicas) {

    this.availableReplicas = availableReplicas;
    return this;
  }

  /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   *
   * @return availableReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of available replicas (ready for at least minReadySeconds) for this replica set.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1ReplicaSetStatus conditions(List<V1ReplicaSetCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1ReplicaSetStatus addConditionsItem(V1ReplicaSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Represents the latest available observations of a replica set&#39;s current state.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Represents the latest available observations of a replica set's current state.")
  public List<V1ReplicaSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }

  public V1ReplicaSetStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {

    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

  /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   *
   * @return fullyLabeledReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The number of pods that have labels matching the labels of the pod template of the replicaset.")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public V1ReplicaSetStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ObservedGeneration reflects the generation of the most recently observed ReplicaSet.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1ReplicaSetStatus readyReplicas(Integer readyReplicas) {

    this.readyReplicas = readyReplicas;
    return this;
  }

  /**
   * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
   *
   * @return readyReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public V1ReplicaSetStatus replicas(Integer replicas) {

    this.replicas = replicas;
    return this;
  }

  /**
   * Replicas is the most recently oberved number of replicas. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   *
   * @return replicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSetStatus v1ReplicaSetStatus = (V1ReplicaSetStatus) o;
    return Objects.equals(this.availableReplicas, v1ReplicaSetStatus.availableReplicas)
        && Objects.equals(this.conditions, v1ReplicaSetStatus.conditions)
        && Objects.equals(this.fullyLabeledReplicas, v1ReplicaSetStatus.fullyLabeledReplicas)
        && Objects.equals(this.observedGeneration, v1ReplicaSetStatus.observedGeneration)
        && Objects.equals(this.readyReplicas, v1ReplicaSetStatus.readyReplicas)
        && Objects.equals(this.replicas, v1ReplicaSetStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        availableReplicas,
        conditions,
        fullyLabeledReplicas,
        observedGeneration,
        readyReplicas,
        replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSetStatus {\n");
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ")
        .append(toIndentedString(fullyLabeledReplicas))
        .append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
