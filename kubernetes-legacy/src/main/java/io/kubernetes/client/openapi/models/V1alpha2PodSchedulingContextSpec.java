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
 * PodSchedulingContextSpec describes where resources for the Pod are needed.
 */
@ApiModel(description = "PodSchedulingContextSpec describes where resources for the Pod are needed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1alpha2PodSchedulingContextSpec {
  public static final String SERIALIZED_NAME_POTENTIAL_NODES = "potentialNodes";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_NODES)
  private List<String> potentialNodes = null;

  public static final String SERIALIZED_NAME_SELECTED_NODE = "selectedNode";
  @SerializedName(SERIALIZED_NAME_SELECTED_NODE)
  private String selectedNode;


  public V1alpha2PodSchedulingContextSpec potentialNodes(List<String> potentialNodes) {

    this.potentialNodes = potentialNodes;
    return this;
  }

  public V1alpha2PodSchedulingContextSpec addPotentialNodesItem(String potentialNodesItem) {
    if (this.potentialNodes == null) {
      this.potentialNodes = new ArrayList<>();
    }
    this.potentialNodes.add(potentialNodesItem);
    return this;
  }

   /**
   * PotentialNodes lists nodes where the Pod might be able to run.  The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
   * @return potentialNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PotentialNodes lists nodes where the Pod might be able to run.  The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.")

  public List<String> getPotentialNodes() {
    return potentialNodes;
  }


  public void setPotentialNodes(List<String> potentialNodes) {
    this.potentialNodes = potentialNodes;
  }


  public V1alpha2PodSchedulingContextSpec selectedNode(String selectedNode) {

    this.selectedNode = selectedNode;
    return this;
  }

   /**
   * SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use \&quot;WaitForFirstConsumer\&quot; allocation is to be attempted.
   * @return selectedNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use \"WaitForFirstConsumer\" allocation is to be attempted.")

  public String getSelectedNode() {
    return selectedNode;
  }


  public void setSelectedNode(String selectedNode) {
    this.selectedNode = selectedNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2PodSchedulingContextSpec v1alpha2PodSchedulingContextSpec = (V1alpha2PodSchedulingContextSpec) o;
    return Objects.equals(this.potentialNodes, v1alpha2PodSchedulingContextSpec.potentialNodes) &&
        Objects.equals(this.selectedNode, v1alpha2PodSchedulingContextSpec.selectedNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(potentialNodes, selectedNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2PodSchedulingContextSpec {\n");
    sb.append("    potentialNodes: ").append(toIndentedString(potentialNodes)).append("\n");
    sb.append("    selectedNode: ").append(toIndentedString(selectedNode)).append("\n");
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
