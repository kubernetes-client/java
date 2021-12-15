/*
Copyright 2021 The Kubernetes Authors.
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
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 */
@ApiModel(
    description =
        "HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V2beta1HorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";

  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_METRICS = "metrics";

  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<V2beta1MetricSpec> metrics = null;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";

  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";

  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  private V2beta1CrossVersionObjectReference scaleTargetRef;

  public V2beta1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {

    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
   * It cannot be less that minReplicas.
   *
   * @return maxReplicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public V2beta1HorizontalPodAutoscalerSpec metrics(List<V2beta1MetricSpec> metrics) {

    this.metrics = metrics;
    return this;
  }

  public V2beta1HorizontalPodAutoscalerSpec addMetricsItem(V2beta1MetricSpec metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * metrics contains the specifications for which to use to calculate the desired replica count
   * (the maximum replica count across all metrics will be used). The desired replica count is
   * calculated multiplying the ratio between the target value and the current value by the current
   * number of pods. Ergo, metrics used must decrease as the pod count is increased, and vice-versa.
   * See the individual metric source types for more information about how each type of metric must
   * respond.
   *
   * @return metrics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.")
  public List<V2beta1MetricSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<V2beta1MetricSpec> metrics) {
    this.metrics = metrics;
  }

  public V2beta1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {

    this.minReplicas = minReplicas;
    return this;
  }

  /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
   * down. It defaults to 1 pod. minReplicas is allowed to be 0 if the alpha feature gate
   * HPAScaleToZero is enabled and at least one Object or External metric is configured. Scaling is
   * active as long as at least one metric value is available.
   *
   * @return minReplicas
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public V2beta1HorizontalPodAutoscalerSpec scaleTargetRef(
      V2beta1CrossVersionObjectReference scaleTargetRef) {

    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

  /**
   * Get scaleTargetRef
   *
   * @return scaleTargetRef
   */
  @ApiModelProperty(required = true, value = "")
  public V2beta1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(V2beta1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1HorizontalPodAutoscalerSpec v2beta1HorizontalPodAutoscalerSpec =
        (V2beta1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, v2beta1HorizontalPodAutoscalerSpec.maxReplicas)
        && Objects.equals(this.metrics, v2beta1HorizontalPodAutoscalerSpec.metrics)
        && Objects.equals(this.minReplicas, v2beta1HorizontalPodAutoscalerSpec.minReplicas)
        && Objects.equals(this.scaleTargetRef, v2beta1HorizontalPodAutoscalerSpec.scaleTargetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, metrics, minReplicas, scaleTargetRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1HorizontalPodAutoscalerSpec {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
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
