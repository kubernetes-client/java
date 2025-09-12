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
import io.kubernetes.client.openapi.models.V1ContainerExtendedResourceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodExtendedResourceClaimStatus is stored in the PodStatus for the extended resource requests backed by DRA. It stores the generated name for the corresponding special ResourceClaim created by the scheduler.
 */
@ApiModel(description = "PodExtendedResourceClaimStatus is stored in the PodStatus for the extended resource requests backed by DRA. It stores the generated name for the corresponding special ResourceClaim created by the scheduler.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T16:56:46.431280Z[Etc/UTC]")
public class V1PodExtendedResourceClaimStatus {
  public static final String SERIALIZED_NAME_REQUEST_MAPPINGS = "requestMappings";
  @SerializedName(SERIALIZED_NAME_REQUEST_MAPPINGS)
  private List<V1ContainerExtendedResourceRequest> requestMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESOURCE_CLAIM_NAME = "resourceClaimName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLAIM_NAME)
  private String resourceClaimName;


  public V1PodExtendedResourceClaimStatus requestMappings(List<V1ContainerExtendedResourceRequest> requestMappings) {

    this.requestMappings = requestMappings;
    return this;
  }

  public V1PodExtendedResourceClaimStatus addRequestMappingsItem(V1ContainerExtendedResourceRequest requestMappingsItem) {
    this.requestMappings.add(requestMappingsItem);
    return this;
  }

   /**
   * RequestMappings identifies the mapping of &lt;container, extended resource backed by DRA&gt; to  device request in the generated ResourceClaim.
   * @return requestMappings
  **/
  @ApiModelProperty(required = true, value = "RequestMappings identifies the mapping of <container, extended resource backed by DRA> to  device request in the generated ResourceClaim.")

  public List<V1ContainerExtendedResourceRequest> getRequestMappings() {
    return requestMappings;
  }


  public void setRequestMappings(List<V1ContainerExtendedResourceRequest> requestMappings) {
    this.requestMappings = requestMappings;
  }


  public V1PodExtendedResourceClaimStatus resourceClaimName(String resourceClaimName) {

    this.resourceClaimName = resourceClaimName;
    return this;
  }

   /**
   * ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod.
   * @return resourceClaimName
  **/
  @ApiModelProperty(required = true, value = "ResourceClaimName is the name of the ResourceClaim that was generated for the Pod in the namespace of the Pod.")

  public String getResourceClaimName() {
    return resourceClaimName;
  }


  public void setResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodExtendedResourceClaimStatus v1PodExtendedResourceClaimStatus = (V1PodExtendedResourceClaimStatus) o;
    return Objects.equals(this.requestMappings, v1PodExtendedResourceClaimStatus.requestMappings) &&
        Objects.equals(this.resourceClaimName, v1PodExtendedResourceClaimStatus.resourceClaimName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestMappings, resourceClaimName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodExtendedResourceClaimStatus {\n");
    sb.append("    requestMappings: ").append(toIndentedString(requestMappings)).append("\n");
    sb.append("    resourceClaimName: ").append(toIndentedString(resourceClaimName)).append("\n");
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
