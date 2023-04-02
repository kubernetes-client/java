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
import java.util.List;
import java.util.Objects;

/** HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler. */
@ApiModel(
    description =
        "HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2HorizontalPodAutoscalerStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V2HorizontalPodAutoscalerCondition> conditions = null;

  public static final String SERIALIZED_NAME_CURRENT_METRICS = "currentMetrics";

  @SerializedName(SERIALIZED_NAME_CURRENT_METRICS)
  private List<V2MetricStatus> currentMetrics = null;

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

  public V2HorizontalPodAutoscalerStatus conditions(
      List<V2HorizontalPodAutoscalerCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V2HorizontalPodAutoscalerStatus addConditionsItem(
      V2HorizontalPodAutoscalerCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and
   * indicates whether or not those conditions are met.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.")
  public List<V2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V2HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
  }

  public V2HorizontalPodAutoscalerStatus currentMetrics(List<V2MetricStatus> currentMetrics) {

    this.currentMetrics = currentMetrics;
    return this;
  }

  public V2HorizontalPodAutoscalerStatus addCurrentMetricsItem(V2MetricStatus currentMetricsItem) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList<>();
    }
    this.currentMetrics.add(currentMetricsItem);
    return this;
  }

  /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
   *
   * @return currentMetrics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "currentMetrics is the last read state of the metrics used by this autoscaler.")
  public List<V2MetricStatus> getCurrentMetrics() {
    return currentMetrics;
  }

  public void setCurrentMetrics(List<V2MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
  }

  public V2HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {

    this.currentReplicas = currentReplicas;
    return this;
  }

  /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen
   * by the autoscaler.
   *
   * @return currentReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public V2HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {

    this.desiredReplicas = desiredReplicas;
    return this;
  }

  /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last
   * calculated by the autoscaler.
   *
   * @return desiredReplicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }

  public V2HorizontalPodAutoscalerStatus lastScaleTime(OffsetDateTime lastScaleTime) {

    this.lastScaleTime = lastScaleTime;
    return this;
  }

  /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by
   * the autoscaler to control how often the number of pods is changed.
   *
   * @return lastScaleTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.")
  public OffsetDateTime getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }

  public V2HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {

    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   *
   * @return observedGeneration
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "observedGeneration is the most recent generation observed by this autoscaler.")
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
    V2HorizontalPodAutoscalerStatus v2HorizontalPodAutoscalerStatus =
        (V2HorizontalPodAutoscalerStatus) o;
    return Objects.equals(this.conditions, v2HorizontalPodAutoscalerStatus.conditions)
        && Objects.equals(this.currentMetrics, v2HorizontalPodAutoscalerStatus.currentMetrics)
        && Objects.equals(this.currentReplicas, v2HorizontalPodAutoscalerStatus.currentReplicas)
        && Objects.equals(this.desiredReplicas, v2HorizontalPodAutoscalerStatus.desiredReplicas)
        && Objects.equals(this.lastScaleTime, v2HorizontalPodAutoscalerStatus.lastScaleTime)
        && Objects.equals(
            this.observedGeneration, v2HorizontalPodAutoscalerStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditions,
        currentMetrics,
        currentReplicas,
        desiredReplicas,
        lastScaleTime,
        observedGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2HorizontalPodAutoscalerStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentMetrics: ").append(toIndentedString(currentMetrics)).append("\n");
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
