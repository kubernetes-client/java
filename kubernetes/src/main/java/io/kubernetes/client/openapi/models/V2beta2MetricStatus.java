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

/** MetricStatus describes the last-read state of a single metric. */
@ApiModel(description = "MetricStatus describes the last-read state of a single metric.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V2beta2MetricStatus {
  public static final String SERIALIZED_NAME_CONTAINER_RESOURCE = "containerResource";

  @SerializedName(SERIALIZED_NAME_CONTAINER_RESOURCE)
  private V2beta2ContainerResourceMetricStatus containerResource;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";

  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private V2beta2ExternalMetricStatus external;

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V2beta2ObjectMetricStatus _object;

  public static final String SERIALIZED_NAME_PODS = "pods";

  @SerializedName(SERIALIZED_NAME_PODS)
  private V2beta2PodsMetricStatus pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V2beta2ResourceMetricStatus resource;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V2beta2MetricStatus containerResource(
      V2beta2ContainerResourceMetricStatus containerResource) {

    this.containerResource = containerResource;
    return this;
  }

  /**
   * Get containerResource
   *
   * @return containerResource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ContainerResourceMetricStatus getContainerResource() {
    return containerResource;
  }

  public void setContainerResource(V2beta2ContainerResourceMetricStatus containerResource) {
    this.containerResource = containerResource;
  }

  public V2beta2MetricStatus external(V2beta2ExternalMetricStatus external) {

    this.external = external;
    return this;
  }

  /**
   * Get external
   *
   * @return external
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ExternalMetricStatus getExternal() {
    return external;
  }

  public void setExternal(V2beta2ExternalMetricStatus external) {
    this.external = external;
  }

  public V2beta2MetricStatus _object(V2beta2ObjectMetricStatus _object) {

    this._object = _object;
    return this;
  }

  /**
   * Get _object
   *
   * @return _object
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ObjectMetricStatus getObject() {
    return _object;
  }

  public void setObject(V2beta2ObjectMetricStatus _object) {
    this._object = _object;
  }

  public V2beta2MetricStatus pods(V2beta2PodsMetricStatus pods) {

    this.pods = pods;
    return this;
  }

  /**
   * Get pods
   *
   * @return pods
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2PodsMetricStatus getPods() {
    return pods;
  }

  public void setPods(V2beta2PodsMetricStatus pods) {
    this.pods = pods;
  }

  public V2beta2MetricStatus resource(V2beta2ResourceMetricStatus resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ResourceMetricStatus getResource() {
    return resource;
  }

  public void setResource(V2beta2ResourceMetricStatus resource) {
    this.resource = resource;
  }

  public V2beta2MetricStatus type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type is the type of metric source. It will be one of \&quot;ContainerResource\&quot;,
   * \&quot;External\&quot;, \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;,
   * each corresponds to a matching field in the object. Note: \&quot;ContainerResource\&quot; type
   * is available on when the feature-gate HPAContainerMetrics is enabled
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type is the type of metric source.  It will be one of \"ContainerResource\", \"External\", \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object. Note: \"ContainerResource\" type is available on when the feature-gate HPAContainerMetrics is enabled")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricStatus v2beta2MetricStatus = (V2beta2MetricStatus) o;
    return Objects.equals(this.containerResource, v2beta2MetricStatus.containerResource)
        && Objects.equals(this.external, v2beta2MetricStatus.external)
        && Objects.equals(this._object, v2beta2MetricStatus._object)
        && Objects.equals(this.pods, v2beta2MetricStatus.pods)
        && Objects.equals(this.resource, v2beta2MetricStatus.resource)
        && Objects.equals(this.type, v2beta2MetricStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerResource, external, _object, pods, resource, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricStatus {\n");
    sb.append("    containerResource: ").append(toIndentedString(containerResource)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
