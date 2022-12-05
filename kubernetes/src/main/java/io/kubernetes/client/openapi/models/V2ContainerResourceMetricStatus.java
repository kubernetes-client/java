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
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to
 * Kubernetes, as specified in requests and limits, describing a single container in each pod in the
 * current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have
 * special scaling options on top of those available to normal per-pod metrics using the
 * \&quot;pods\&quot; source.
 */
@ApiModel(
    description =
        "ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2ContainerResourceMetricStatus {
  public static final String SERIALIZED_NAME_CONTAINER = "container";

  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_CURRENT = "current";

  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2MetricValueStatus current;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V2ContainerResourceMetricStatus container(String container) {

    this.container = container;
    return this;
  }

  /**
   * Container is the name of the container in the pods of the scaling target
   *
   * @return container
   */
  @ApiModelProperty(
      required = true,
      value = "Container is the name of the container in the pods of the scaling target")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public V2ContainerResourceMetricStatus current(V2MetricValueStatus current) {

    this.current = current;
    return this;
  }

  /**
   * Get current
   *
   * @return current
   */
  @ApiModelProperty(required = true, value = "")
  public V2MetricValueStatus getCurrent() {
    return current;
  }

  public void setCurrent(V2MetricValueStatus current) {
    this.current = current;
  }

  public V2ContainerResourceMetricStatus name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Name is the name of the resource in question.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ContainerResourceMetricStatus v2ContainerResourceMetricStatus =
        (V2ContainerResourceMetricStatus) o;
    return Objects.equals(this.container, v2ContainerResourceMetricStatus.container)
        && Objects.equals(this.current, v2ContainerResourceMetricStatus.current)
        && Objects.equals(this.name, v2ContainerResourceMetricStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, current, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ContainerResourceMetricStatus {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
