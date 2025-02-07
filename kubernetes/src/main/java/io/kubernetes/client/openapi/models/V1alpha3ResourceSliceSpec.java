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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1alpha3Device;
import io.kubernetes.client.openapi.models.V1alpha3ResourcePool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
@ApiModel(description = "ResourceSliceSpec contains the information published by the driver in one ResourceSlice.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-07T19:21:52.410010Z[Etc/UTC]")
public class V1alpha3ResourceSliceSpec {
  public static final String SERIALIZED_NAME_ALL_NODES = "allNodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  private Boolean allNodes;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<V1alpha3Device> devices = null;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private V1alpha3ResourcePool pool;


  public V1alpha3ResourceSliceSpec allNodes(Boolean allNodes) {

    this.allNodes = allNodes;
    return this;
  }

   /**
   * AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector and AllNodes must be set.
   * @return allNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector and AllNodes must be set.")

  public Boolean getAllNodes() {
    return allNodes;
  }


  public void setAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
  }


  public V1alpha3ResourceSliceSpec devices(List<V1alpha3Device> devices) {

    this.devices = devices;
    return this;
  }

  public V1alpha3ResourceSliceSpec addDevicesItem(V1alpha3Device devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Devices lists some or all of the devices in this pool.  Must not have more than 128 entries.
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Devices lists some or all of the devices in this pool.  Must not have more than 128 entries.")

  public List<V1alpha3Device> getDevices() {
    return devices;
  }


  public void setDevices(List<V1alpha3Device> devices) {
    this.devices = devices;
  }


  public V1alpha3ResourceSliceSpec driver(String driver) {

    this.driver = driver;
    return this;
  }

   /**
   * Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1alpha3ResourceSliceSpec nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha3ResourceSliceSpec nodeSelector(V1NodeSelector nodeSelector) {

    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1NodeSelector getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1alpha3ResourceSliceSpec pool(V1alpha3ResourcePool pool) {

    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha3ResourcePool getPool() {
    return pool;
  }


  public void setPool(V1alpha3ResourcePool pool) {
    this.pool = pool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ResourceSliceSpec v1alpha3ResourceSliceSpec = (V1alpha3ResourceSliceSpec) o;
    return Objects.equals(this.allNodes, v1alpha3ResourceSliceSpec.allNodes) &&
        Objects.equals(this.devices, v1alpha3ResourceSliceSpec.devices) &&
        Objects.equals(this.driver, v1alpha3ResourceSliceSpec.driver) &&
        Objects.equals(this.nodeName, v1alpha3ResourceSliceSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1alpha3ResourceSliceSpec.nodeSelector) &&
        Objects.equals(this.pool, v1alpha3ResourceSliceSpec.pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNodes, devices, driver, nodeName, nodeSelector, pool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceSliceSpec {\n");
    sb.append("    allNodes: ").append(toIndentedString(allNodes)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
