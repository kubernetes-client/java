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
import java.util.Objects;

/** current status of a horizontal pod autoscaler */
@ApiModel(description = "current status of a horizontal pod autoscaler")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1HorizontalPodAutoscalerStatus {
  public static final String SERIALIZED_NAME_CURRENT_C_P_U_UTILIZATION_PERCENTAGE =
      "currentCPUUtilizationPercentage";

  @SerializedName(SERIALIZED_NAME_CURRENT_C_P_U_UTILIZATION_PERCENTAGE)
  private Integer currentCPUUtilizationPercentage;

  public static final String SERIALIZED_NAME_CURRENT_REPLICAS = "currentReplicas";

  @SerializedName(SERIALIZED_NAME_CURRENT_REPLICAS)
  private Integer currentReplicas;

  public static final String SERIALIZED_NAME_DESIRED_REPLICAS = "desiredReplicas";

  @SerializedName(SERIALIZED_NAME_DESIRED_REPLICAS)
  private Integer desiredReplicas;

  public static final String SERIALIZED_NAME_LAST_SCALE_TIME = "lastScaleTime";

  @SerializedName(SERIALIZED_NAME_LAST_SCALE_TIME)
  private OffsetDateTime lastScaleTime;

  public static final String SERIALIZED_NAME_OBSERVED_GENERATION = "observedGeneration";

  @SerializedName(SERIALIZED_NAME_OBSERVED_GENERATION)
  private Long observedGeneration;

  public V1HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(
      Integer currentCPUUtilizationPercentage) {

    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return this;
  }

  /**
   * current average CPU utilization over all pods, represented as a percentage of requested CPU,
   * e.g. 70 means that an average pod is using now 70% of its requested CPU.
   *
   * @return currentCPUUtilizationPercentage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.")
  public Integer getCurrentCPUUtilizationPercentage() {
    return currentCPUUtilizationPercentage;
  }

  public void setCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
  }

  public V1HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {

    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * current number of replicas of pods managed by this autoscaler.
   *
   * @return currentReplicas
   */
  @ApiModelProperty(
      required = true,
      value = "current number of replicas of pods managed by this autoscaler.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public V1HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {

    this.desiredReplicas = desiredReplicas;
    return this;
  }

  /**
   * desired number of replicas of pods managed by this autoscaler.
   *
   * @return desiredReplicas
   */
  @ApiModelProperty(
      required = true,
      value = "desired number of replicas of pods managed by this autoscaler.")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }

  public V1HorizontalPodAutoscalerStatus lastScaleTime(OffsetDateTime lastScaleTime) {

    this.lastScaleTime = lastScaleTime;
    return this;
  }

  /**
   * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
   * control how often the number of pods is changed.
   *
   * @return lastScaleTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.")
  public OffsetDateTime getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }

  public V1HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * most recent generation observed by this autoscaler.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "most recent generation observed by this autoscaler.")
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
    V1HorizontalPodAutoscalerStatus v1HorizontalPodAutoscalerStatus =
        (V1HorizontalPodAutoscalerStatus) o;
    return Objects.equals(
            this.currentCPUUtilizationPercentage,
            v1HorizontalPodAutoscalerStatus.currentCPUUtilizationPercentage)
        && Objects.equals(this.currentReplicas, v1HorizontalPodAutoscalerStatus.currentReplicas)
        && Objects.equals(this.desiredReplicas, v1HorizontalPodAutoscalerStatus.desiredReplicas)
        && Objects.equals(this.lastScaleTime, v1HorizontalPodAutoscalerStatus.lastScaleTime)
        && Objects.equals(
            this.observedGeneration, v1HorizontalPodAutoscalerStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentCPUUtilizationPercentage,
        currentReplicas,
        desiredReplicas,
        lastScaleTime,
        observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HorizontalPodAutoscalerStatus {\n");
    sb.append("    currentCPUUtilizationPercentage: ")
        .append(toIndentedString(currentCPUUtilizationPercentage))
        .append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    desiredReplicas: ").append(toIndentedString(desiredReplicas)).append("\n");
    sb.append("    lastScaleTime: ").append(toIndentedString(lastScaleTime)).append("\n");
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
