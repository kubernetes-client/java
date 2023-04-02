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
 * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
 * specified in requests and limits, describing each pod in the current scale target (e.g. CPU or
 * memory). The values will be averaged together before being compared to the target. Such metrics
 * are built in to Kubernetes, and have special scaling options on top of those available to normal
 * per-pod metrics using the \&quot;pods\&quot; source. Only one \&quot;target\&quot; type should be
 * set.
 */
@ApiModel(
    description =
        "ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.  Only one \"target\" type should be set.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2beta2ResourceMetricSource {
  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET = "target";

  @SerializedName(SERIALIZED_NAME_TARGET)
  private V2beta2MetricTarget target;

  public V2beta2ResourceMetricSource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is the name of the resource in question.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V2beta2ResourceMetricSource target(V2beta2MetricTarget target) {

    this.target = target;
    return this;
  }

  /**
   * Get target
   *
   * @return target
   */
  @ApiModelProperty(required = true, value = "")
  public V2beta2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(V2beta2MetricTarget target) {
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
    V2beta2ResourceMetricSource v2beta2ResourceMetricSource = (V2beta2ResourceMetricSource) o;
    return Objects.equals(this.name, v2beta2ResourceMetricSource.name)
        && Objects.equals(this.target, v2beta2ResourceMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2ResourceMetricSource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
