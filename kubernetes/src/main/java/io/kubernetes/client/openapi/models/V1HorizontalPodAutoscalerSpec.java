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

/** specification of a horizontal pod autoscaler. */
@ApiModel(description = "specification of a horizontal pod autoscaler.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1HorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";

  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";

  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";

  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  private V1CrossVersionObjectReference scaleTargetRef;

  public static final String SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE =
      "targetCPUUtilizationPercentage";

  @SerializedName(SERIALIZED_NAME_TARGET_C_P_U_UTILIZATION_PERCENTAGE)
  private Integer targetCPUUtilizationPercentage;

  public V1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {

    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than
   * MinReplicas.
   *
   * @return maxReplicas
   */
  @ApiModelProperty(
      required = true,
      value =
          "upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public V1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {

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

  public V1HorizontalPodAutoscalerSpec scaleTargetRef(
      V1CrossVersionObjectReference scaleTargetRef) {

    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

  /**
   * Get scaleTargetRef
   *
   * @return scaleTargetRef
   */
  @ApiModelProperty(required = true, value = "")
  public V1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }

  public V1HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(
      Integer targetCPUUtilizationPercentage) {

    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }

  /**
   * target average CPU utilization (represented as a percentage of requested CPU) over all the
   * pods; if not specified the default autoscaling policy will be used.
   *
   * @return targetCPUUtilizationPercentage
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.")
  public Integer getTargetCPUUtilizationPercentage() {
    return targetCPUUtilizationPercentage;
  }

  public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HorizontalPodAutoscalerSpec v1HorizontalPodAutoscalerSpec = (V1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, v1HorizontalPodAutoscalerSpec.maxReplicas)
        && Objects.equals(this.minReplicas, v1HorizontalPodAutoscalerSpec.minReplicas)
        && Objects.equals(this.scaleTargetRef, v1HorizontalPodAutoscalerSpec.scaleTargetRef)
        && Objects.equals(
            this.targetCPUUtilizationPercentage,
            v1HorizontalPodAutoscalerSpec.targetCPUUtilizationPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HorizontalPodAutoscalerSpec {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
    sb.append("    targetCPUUtilizationPercentage: ")
        .append(toIndentedString(targetCPUUtilizationPercentage))
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
