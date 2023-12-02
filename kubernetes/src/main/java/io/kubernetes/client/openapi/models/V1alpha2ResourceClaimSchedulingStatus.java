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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceClaimSchedulingStatus contains information about one particular ResourceClaim with \&quot;WaitForFirstConsumer\&quot; allocation mode.
 */
@ApiModel(description = "ResourceClaimSchedulingStatus contains information about one particular ResourceClaim with \"WaitForFirstConsumer\" allocation mode.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2ResourceClaimSchedulingStatus {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNSUITABLE_NODES = "unsuitableNodes";
  @SerializedName(SERIALIZED_NAME_UNSUITABLE_NODES)
  private List<String> unsuitableNodes = null;


  public V1alpha2ResourceClaimSchedulingStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name matches the pod.spec.resourceClaims[*].Name field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name matches the pod.spec.resourceClaims[*].Name field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha2ResourceClaimSchedulingStatus unsuitableNodes(List<String> unsuitableNodes) {

    this.unsuitableNodes = unsuitableNodes;
    return this;
  }

  public V1alpha2ResourceClaimSchedulingStatus addUnsuitableNodesItem(String unsuitableNodesItem) {
    if (this.unsuitableNodes == null) {
      this.unsuitableNodes = new ArrayList<>();
    }
    this.unsuitableNodes.add(unsuitableNodesItem);
    return this;
  }

   /**
   * UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.  The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.
   * @return unsuitableNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.  The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.")

  public List<String> getUnsuitableNodes() {
    return unsuitableNodes;
  }


  public void setUnsuitableNodes(List<String> unsuitableNodes) {
    this.unsuitableNodes = unsuitableNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceClaimSchedulingStatus v1alpha2ResourceClaimSchedulingStatus = (V1alpha2ResourceClaimSchedulingStatus) o;
    return Objects.equals(this.name, v1alpha2ResourceClaimSchedulingStatus.name) &&
        Objects.equals(this.unsuitableNodes, v1alpha2ResourceClaimSchedulingStatus.unsuitableNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, unsuitableNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceClaimSchedulingStatus {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unsuitableNodes: ").append(toIndentedString(unsuitableNodes)).append("\n");
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
