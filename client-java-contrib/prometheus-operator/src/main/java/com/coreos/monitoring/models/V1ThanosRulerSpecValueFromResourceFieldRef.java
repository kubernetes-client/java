/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Selects a resource of the container: only resources limits and requests (limits.cpu,
 * limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and
 * requests.ephemeral-storage) are currently supported.
 */
@ApiModel(
    description =
        "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecValueFromResourceFieldRef {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";

  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_DIVISOR = "divisor";

  @SerializedName(SERIALIZED_NAME_DIVISOR)
  private String divisor;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public V1ThanosRulerSpecValueFromResourceFieldRef containerName(String containerName) {

    this.containerName = containerName;
    return this;
  }

  /**
   * Container name: required for volumes, optional for env vars
   *
   * @return containerName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public V1ThanosRulerSpecValueFromResourceFieldRef divisor(String divisor) {

    this.divisor = divisor;
    return this;
  }

  /**
   * Specifies the output format of the exposed resources, defaults to \&quot;1\&quot;
   *
   * @return divisor
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Specifies the output format of the exposed resources, defaults to \"1\"")
  public String getDivisor() {
    return divisor;
  }

  public void setDivisor(String divisor) {
    this.divisor = divisor;
  }

  public V1ThanosRulerSpecValueFromResourceFieldRef resource(String resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Required: resource to select
   *
   * @return resource
   */
  @ApiModelProperty(required = true, value = "Required: resource to select")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecValueFromResourceFieldRef v1ThanosRulerSpecValueFromResourceFieldRef =
        (V1ThanosRulerSpecValueFromResourceFieldRef) o;
    return Objects.equals(
            this.containerName, v1ThanosRulerSpecValueFromResourceFieldRef.containerName)
        && Objects.equals(this.divisor, v1ThanosRulerSpecValueFromResourceFieldRef.divisor)
        && Objects.equals(this.resource, v1ThanosRulerSpecValueFromResourceFieldRef.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecValueFromResourceFieldRef {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
