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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerExtendedResourceRequest has the mapping of container name, extended resource name to the device request name.
 */
@ApiModel(description = "ContainerExtendedResourceRequest has the mapping of container name, extended resource name to the device request name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1ContainerExtendedResourceRequest {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_REQUEST_NAME = "requestName";
  @SerializedName(SERIALIZED_NAME_REQUEST_NAME)
  private String requestName;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;


  public V1ContainerExtendedResourceRequest containerName(String containerName) {

    this.containerName = containerName;
    return this;
  }

   /**
   * The name of the container requesting resources.
   * @return containerName
  **/
  @ApiModelProperty(required = true, value = "The name of the container requesting resources.")

  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public V1ContainerExtendedResourceRequest requestName(String requestName) {

    this.requestName = requestName;
    return this;
  }

   /**
   * The name of the request in the special ResourceClaim which corresponds to the extended resource.
   * @return requestName
  **/
  @ApiModelProperty(required = true, value = "The name of the request in the special ResourceClaim which corresponds to the extended resource.")

  public String getRequestName() {
    return requestName;
  }


  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }


  public V1ContainerExtendedResourceRequest resourceName(String resourceName) {

    this.resourceName = resourceName;
    return this;
  }

   /**
   * The name of the extended resource in that container which gets backed by DRA.
   * @return resourceName
  **/
  @ApiModelProperty(required = true, value = "The name of the extended resource in that container which gets backed by DRA.")

  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerExtendedResourceRequest v1ContainerExtendedResourceRequest = (V1ContainerExtendedResourceRequest) o;
    return Objects.equals(this.containerName, v1ContainerExtendedResourceRequest.containerName) &&
        Objects.equals(this.requestName, v1ContainerExtendedResourceRequest.requestName) &&
        Objects.equals(this.resourceName, v1ContainerExtendedResourceRequest.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, requestName, resourceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerExtendedResourceRequest {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
