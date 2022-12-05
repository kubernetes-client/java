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

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object
 * (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside
 * of cluster).
 */
@ApiModel(
    description =
        "ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2ExternalMetricSource {
  public static final String SERIALIZED_NAME_METRIC = "metric";

  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2MetricIdentifier metric;

  public static final String SERIALIZED_NAME_TARGET = "target";

  @SerializedName(SERIALIZED_NAME_TARGET)
  private V2MetricTarget target;

  public V2ExternalMetricSource metric(V2MetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   *
   * @return metric
   */
  @ApiModelProperty(required = true, value = "")
  public V2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(V2MetricIdentifier metric) {
    this.metric = metric;
  }

  public V2ExternalMetricSource target(V2MetricTarget target) {

    this.target = target;
    return this;
  }

  /**
   * Get target
   *
   * @return target
   */
  @ApiModelProperty(required = true, value = "")
  public V2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(V2MetricTarget target) {
    this.target = target;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ExternalMetricSource v2ExternalMetricSource = (V2ExternalMetricSource) o;
    return Objects.equals(this.metric, v2ExternalMetricSource.metric)
        && Objects.equals(this.target, v2ExternalMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ExternalMetricSource {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
