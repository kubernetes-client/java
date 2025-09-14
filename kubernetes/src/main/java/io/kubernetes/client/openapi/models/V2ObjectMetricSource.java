/*
Copyright 2025 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V2ObjectMetricSource {
  public static final String SERIALIZED_NAME_DESCRIBED_OBJECT = "describedObject";
  @SerializedName(SERIALIZED_NAME_DESCRIBED_OBJECT)
  private V2CrossVersionObjectReference describedObject;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2MetricIdentifier metric;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private V2MetricTarget target;


  public V2ObjectMetricSource describedObject(V2CrossVersionObjectReference describedObject) {

    this.describedObject = describedObject;
    return this;
  }

   /**
   * Get describedObject
   * @return describedObject
  **/
  @ApiModelProperty(required = true, value = "")

  public V2CrossVersionObjectReference getDescribedObject() {
    return describedObject;
  }


  public void setDescribedObject(V2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
  }


  public V2ObjectMetricSource metric(V2MetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "")

  public V2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2MetricIdentifier metric) {
    this.metric = metric;
  }


  public V2ObjectMetricSource target(V2MetricTarget target) {

    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
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
    V2ObjectMetricSource v2ObjectMetricSource = (V2ObjectMetricSource) o;
    return Objects.equals(this.describedObject, v2ObjectMetricSource.describedObject) &&
        Objects.equals(this.metric, v2ObjectMetricSource.metric) &&
        Objects.equals(this.target, v2ObjectMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describedObject, metric, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ObjectMetricSource {\n");
    sb.append("    describedObject: ").append(toIndentedString(describedObject)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
