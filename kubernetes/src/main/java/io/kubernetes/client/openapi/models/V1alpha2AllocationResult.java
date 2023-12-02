/*
Copyright 2023 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1alpha2ResourceHandle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AllocationResult contains attributes of an allocated resource.
 */
@ApiModel(description = "AllocationResult contains attributes of an allocated resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2AllocationResult {
  public static final String SERIALIZED_NAME_AVAILABLE_ON_NODES = "availableOnNodes";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_ON_NODES)
  private V1NodeSelector availableOnNodes;

  public static final String SERIALIZED_NAME_RESOURCE_HANDLES = "resourceHandles";
  @SerializedName(SERIALIZED_NAME_RESOURCE_HANDLES)
  private List<V1alpha2ResourceHandle> resourceHandles = null;

  public static final String SERIALIZED_NAME_SHAREABLE = "shareable";
  @SerializedName(SERIALIZED_NAME_SHAREABLE)
  private Boolean shareable;


  public V1alpha2AllocationResult availableOnNodes(V1NodeSelector availableOnNodes) {

    this.availableOnNodes = availableOnNodes;
    return this;
  }

   /**
   * Get availableOnNodes
   * @return availableOnNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NodeSelector getAvailableOnNodes() {
    return availableOnNodes;
  }


  public void setAvailableOnNodes(V1NodeSelector availableOnNodes) {
    this.availableOnNodes = availableOnNodes;
  }


  public V1alpha2AllocationResult resourceHandles(List<V1alpha2ResourceHandle> resourceHandles) {

    this.resourceHandles = resourceHandles;
    return this;
  }

  public V1alpha2AllocationResult addResourceHandlesItem(V1alpha2ResourceHandle resourceHandlesItem) {
    if (this.resourceHandles == null) {
      this.resourceHandles = new ArrayList<>();
    }
    this.resourceHandles.add(resourceHandlesItem);
    return this;
  }

   /**
   * ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.  Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.
   * @return resourceHandles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourceHandles contain the state associated with an allocation that should be maintained throughout the lifetime of a claim. Each ResourceHandle contains data that should be passed to a specific kubelet plugin once it lands on a node. This data is returned by the driver after a successful allocation and is opaque to Kubernetes. Driver documentation may explain to users how to interpret this data if needed.  Setting this field is optional. It has a maximum size of 32 entries. If null (or empty), it is assumed this allocation will be processed by a single kubelet plugin with no ResourceHandle data attached. The name of the kubelet plugin invoked will match the DriverName set in the ResourceClaimStatus this AllocationResult is embedded in.")

  public List<V1alpha2ResourceHandle> getResourceHandles() {
    return resourceHandles;
  }


  public void setResourceHandles(List<V1alpha2ResourceHandle> resourceHandles) {
    this.resourceHandles = resourceHandles;
  }


  public V1alpha2AllocationResult shareable(Boolean shareable) {

    this.shareable = shareable;
    return this;
  }

   /**
   * Shareable determines whether the resource supports more than one consumer at a time.
   * @return shareable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shareable determines whether the resource supports more than one consumer at a time.")

  public Boolean getShareable() {
    return shareable;
  }


  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2AllocationResult v1alpha2AllocationResult = (V1alpha2AllocationResult) o;
    return Objects.equals(this.availableOnNodes, v1alpha2AllocationResult.availableOnNodes) &&
        Objects.equals(this.resourceHandles, v1alpha2AllocationResult.resourceHandles) &&
        Objects.equals(this.shareable, v1alpha2AllocationResult.shareable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableOnNodes, resourceHandles, shareable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2AllocationResult {\n");
    sb.append("    availableOnNodes: ").append(toIndentedString(availableOnNodes)).append("\n");
    sb.append("    resourceHandles: ").append(toIndentedString(resourceHandles)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
