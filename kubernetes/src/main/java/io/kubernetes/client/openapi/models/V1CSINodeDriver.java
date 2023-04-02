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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CSINodeDriver holds information about the specification of one CSI driver installed on a node */
@ApiModel(
    description =
        "CSINodeDriver holds information about the specification of one CSI driver installed on a node")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CSINodeDriver {
  public static final String SERIALIZED_NAME_ALLOCATABLE = "allocatable";

  @SerializedName(SERIALIZED_NAME_ALLOCATABLE)
  private V1VolumeNodeResources allocatable;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_I_D = "nodeID";

  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEYS = "topologyKeys";

  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEYS)
  private List<String> topologyKeys = null;

  public V1CSINodeDriver allocatable(V1VolumeNodeResources allocatable) {

    this.allocatable = allocatable;
    return this;
  }

  /**
   * Get allocatable
   *
   * @return allocatable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeNodeResources getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(V1VolumeNodeResources allocatable) {
    this.allocatable = allocatable;
  }

  public V1CSINodeDriver name(String name) {

    this.name = name;
    return this;
  }

  /**
   * This is the name of the CSI driver that this object refers to. This MUST be the same name
   * returned by the CSI GetPluginName() call for that driver.
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1CSINodeDriver nodeID(String nodeID) {

    this.nodeID = nodeID;
    return this;
  }

  /**
   * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate
   * with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes
   * may refer to a given node as \&quot;node1\&quot;, but the storage system may refer to the same
   * node as \&quot;nodeA\&quot;. When Kubernetes issues a command to the storage system to attach a
   * volume to a specific node, it can use this field to refer to the node name using the ID that
   * the storage system will understand, e.g. \&quot;nodeA\&quot; instead of \&quot;node1\&quot;.
   * This field is required.
   *
   * @return nodeID
   */
  @ApiModelProperty(
      required = true,
      value =
          "nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as \"node1\", but the storage system may refer to the same node as \"nodeA\". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. \"nodeA\" instead of \"node1\". This field is required.")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public V1CSINodeDriver topologyKeys(List<String> topologyKeys) {

    this.topologyKeys = topologyKeys;
    return this;
  }

  public V1CSINodeDriver addTopologyKeysItem(String topologyKeysItem) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList<>();
    }
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }

  /**
   * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a
   * cluster, it provides a set of topology keys that it understands (e.g.
   * \&quot;company.com/zone\&quot;, \&quot;company.com/region\&quot;). When a driver is initialized
   * on a node, it provides the same topology keys along with values. Kubelet will expose these
   * topology keys as labels on its own node object. When Kubernetes does topology aware
   * provisioning, it can use this list to determine which labels it should retrieve from the node
   * object and pass back to the driver. It is possible for different nodes to use different
   * topology keys. This can be empty if driver does not support topology.
   *
   * @return topologyKeys
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. \"company.com/zone\", \"company.com/region\"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.")
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }

  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSINodeDriver v1CSINodeDriver = (V1CSINodeDriver) o;
    return Objects.equals(this.allocatable, v1CSINodeDriver.allocatable)
        && Objects.equals(this.name, v1CSINodeDriver.name)
        && Objects.equals(this.nodeID, v1CSINodeDriver.nodeID)
        && Objects.equals(this.topologyKeys, v1CSINodeDriver.topologyKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatable, name, nodeID, topologyKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSINodeDriver {\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
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
