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
import io.kubernetes.client.openapi.models.V1beta2CounterSet;
import io.kubernetes.client.openapi.models.V1beta2Device;
import io.kubernetes.client.openapi.models.V1beta2ResourcePool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
@ApiModel(description = "ResourceSliceSpec contains the information published by the driver in one ResourceSlice.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T21:20:49.874193Z[Etc/UTC]")
public class V1beta2ResourceSliceSpec {
  public static final String SERIALIZED_NAME_ALL_NODES = "allNodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  private Boolean allNodes;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<V1beta2Device> devices = null;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_PER_DEVICE_NODE_SELECTION = "perDeviceNodeSelection";
  @SerializedName(SERIALIZED_NAME_PER_DEVICE_NODE_SELECTION)
  private Boolean perDeviceNodeSelection;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private V1beta2ResourcePool pool;

  public static final String SERIALIZED_NAME_SHARED_COUNTERS = "sharedCounters";
  @SerializedName(SERIALIZED_NAME_SHARED_COUNTERS)
  private List<V1beta2CounterSet> sharedCounters = null;


  public V1beta2ResourceSliceSpec allNodes(Boolean allNodes) {

    this.allNodes = allNodes;
    return this;
  }

   /**
   * AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.
   * @return allNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.")

  public Boolean getAllNodes() {
    return allNodes;
  }


  public void setAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
  }


  public V1beta2ResourceSliceSpec devices(List<V1beta2Device> devices) {

    this.devices = devices;
    return this;
  }

  public V1beta2ResourceSliceSpec addDevicesItem(V1beta2Device devicesItem) {
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

  public List<V1beta2Device> getDevices() {
    return devices;
  }


  public void setDevices(List<V1beta2Device> devices) {
    this.devices = devices;
  }


  public V1beta2ResourceSliceSpec driver(String driver) {

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


  public V1beta2ResourceSliceSpec nodeName(String nodeName) {

    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. This field is immutable.
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. This field is immutable.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1beta2ResourceSliceSpec nodeSelector(V1NodeSelector nodeSelector) {

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


  public V1beta2ResourceSliceSpec perDeviceNodeSelection(Boolean perDeviceNodeSelection) {

    this.perDeviceNodeSelection = perDeviceNodeSelection;
    return this;
  }

   /**
   * PerDeviceNodeSelection defines whether the access from nodes to resources in the pool is set on the ResourceSlice level or on each device. If it is set to true, every device defined the ResourceSlice must specify this individually.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.
   * @return perDeviceNodeSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PerDeviceNodeSelection defines whether the access from nodes to resources in the pool is set on the ResourceSlice level or on each device. If it is set to true, every device defined the ResourceSlice must specify this individually.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.")

  public Boolean getPerDeviceNodeSelection() {
    return perDeviceNodeSelection;
  }


  public void setPerDeviceNodeSelection(Boolean perDeviceNodeSelection) {
    this.perDeviceNodeSelection = perDeviceNodeSelection;
  }


  public V1beta2ResourceSliceSpec pool(V1beta2ResourcePool pool) {

    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta2ResourcePool getPool() {
    return pool;
  }


  public void setPool(V1beta2ResourcePool pool) {
    this.pool = pool;
  }


  public V1beta2ResourceSliceSpec sharedCounters(List<V1beta2CounterSet> sharedCounters) {

    this.sharedCounters = sharedCounters;
    return this;
  }

  public V1beta2ResourceSliceSpec addSharedCountersItem(V1beta2CounterSet sharedCountersItem) {
    if (this.sharedCounters == null) {
      this.sharedCounters = new ArrayList<>();
    }
    this.sharedCounters.add(sharedCountersItem);
    return this;
  }

   /**
   * SharedCounters defines a list of counter sets, each of which has a name and a list of counters available.  The names of the SharedCounters must be unique in the ResourceSlice.  The maximum number of counters in all sets is 32.
   * @return sharedCounters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SharedCounters defines a list of counter sets, each of which has a name and a list of counters available.  The names of the SharedCounters must be unique in the ResourceSlice.  The maximum number of counters in all sets is 32.")

  public List<V1beta2CounterSet> getSharedCounters() {
    return sharedCounters;
  }


  public void setSharedCounters(List<V1beta2CounterSet> sharedCounters) {
    this.sharedCounters = sharedCounters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2ResourceSliceSpec v1beta2ResourceSliceSpec = (V1beta2ResourceSliceSpec) o;
    return Objects.equals(this.allNodes, v1beta2ResourceSliceSpec.allNodes) &&
        Objects.equals(this.devices, v1beta2ResourceSliceSpec.devices) &&
        Objects.equals(this.driver, v1beta2ResourceSliceSpec.driver) &&
        Objects.equals(this.nodeName, v1beta2ResourceSliceSpec.nodeName) &&
        Objects.equals(this.nodeSelector, v1beta2ResourceSliceSpec.nodeSelector) &&
        Objects.equals(this.perDeviceNodeSelection, v1beta2ResourceSliceSpec.perDeviceNodeSelection) &&
        Objects.equals(this.pool, v1beta2ResourceSliceSpec.pool) &&
        Objects.equals(this.sharedCounters, v1beta2ResourceSliceSpec.sharedCounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNodes, devices, driver, nodeName, nodeSelector, perDeviceNodeSelection, pool, sharedCounters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ResourceSliceSpec {\n");
    sb.append("    allNodes: ").append(toIndentedString(allNodes)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    perDeviceNodeSelection: ").append(toIndentedString(perDeviceNodeSelection)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    sharedCounters: ").append(toIndentedString(sharedCounters)).append("\n");
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
