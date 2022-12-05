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
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** NodeStatus is information about the current status of a node. */
@ApiModel(description = "NodeStatus is information about the current status of a node.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1NodeStatus {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";

  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<V1NodeAddress> addresses = null;

  public static final String SERIALIZED_NAME_ALLOCATABLE = "allocatable";

  @SerializedName(SERIALIZED_NAME_ALLOCATABLE)
  private Map<String, Quantity> allocatable = null;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, Quantity> capacity = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1NodeCondition> conditions = null;

  public static final String SERIALIZED_NAME_CONFIG = "config";

  @SerializedName(SERIALIZED_NAME_CONFIG)
  private V1NodeConfigStatus config;

  public static final String SERIALIZED_NAME_DAEMON_ENDPOINTS = "daemonEndpoints";

  @SerializedName(SERIALIZED_NAME_DAEMON_ENDPOINTS)
  private V1NodeDaemonEndpoints daemonEndpoints;

  public static final String SERIALIZED_NAME_IMAGES = "images";

  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<V1ContainerImage> images = null;

  public static final String SERIALIZED_NAME_NODE_INFO = "nodeInfo";

  @SerializedName(SERIALIZED_NAME_NODE_INFO)
  private V1NodeSystemInfo nodeInfo;

  public static final String SERIALIZED_NAME_PHASE = "phase";

  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_VOLUMES_ATTACHED = "volumesAttached";

  @SerializedName(SERIALIZED_NAME_VOLUMES_ATTACHED)
  private List<V1AttachedVolume> volumesAttached = null;

  public static final String SERIALIZED_NAME_VOLUMES_IN_USE = "volumesInUse";

  @SerializedName(SERIALIZED_NAME_VOLUMES_IN_USE)
  private List<String> volumesInUse = null;

  public V1NodeStatus addresses(List<V1NodeAddress> addresses) {

    this.addresses = addresses;
    return this;
  }

  public V1NodeStatus addAddressesItem(V1NodeAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info:
   * https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as
   * mergeable, but the merge key is not sufficiently unique, which can cause data corruption when
   * it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391
   * for an example.
   *
   * @return addresses
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.")
  public List<V1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V1NodeAddress> addresses) {
    this.addresses = addresses;
  }

  public V1NodeStatus allocatable(Map<String, Quantity> allocatable) {

    this.allocatable = allocatable;
    return this;
  }

  public V1NodeStatus putAllocatableItem(String key, Quantity allocatableItem) {
    if (this.allocatable == null) {
      this.allocatable = new HashMap<>();
    }
    this.allocatable.put(key, allocatableItem);
    return this;
  }

  /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to
   * Capacity.
   *
   * @return allocatable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
  public Map<String, Quantity> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, Quantity> allocatable) {
    this.allocatable = allocatable;
  }

  public V1NodeStatus capacity(Map<String, Quantity> capacity) {

    this.capacity = capacity;
    return this;
  }

  public V1NodeStatus putCapacityItem(String key, Quantity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

  /**
   * Capacity represents the total resources of a node. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   *
   * @return capacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }

  public V1NodeStatus conditions(List<V1NodeCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1NodeStatus addConditionsItem(V1NodeCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions is an array of current observed node conditions. More info:
   * https://kubernetes.io/docs/concepts/nodes/node/#condition
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition")
  public List<V1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1NodeCondition> conditions) {
    this.conditions = conditions;
  }

  public V1NodeStatus config(V1NodeConfigStatus config) {

    this.config = config;
    return this;
  }

  /**
   * Get config
   *
   * @return config
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigStatus getConfig() {
    return config;
  }

  public void setConfig(V1NodeConfigStatus config) {
    this.config = config;
  }

  public V1NodeStatus daemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {

    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

  /**
   * Get daemonEndpoints
   *
   * @return daemonEndpoints
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }

  public V1NodeStatus images(List<V1ContainerImage> images) {

    this.images = images;
    return this;
  }

  public V1NodeStatus addImagesItem(V1ContainerImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * List of container images on this node
   *
   * @return images
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of container images on this node")
  public List<V1ContainerImage> getImages() {
    return images;
  }

  public void setImages(List<V1ContainerImage> images) {
    this.images = images;
  }

  public V1NodeStatus nodeInfo(V1NodeSystemInfo nodeInfo) {

    this.nodeInfo = nodeInfo;
    return this;
  }

  /**
   * Get nodeInfo
   *
   * @return nodeInfo
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public V1NodeStatus phase(String phase) {

    this.phase = phase;
    return this;
  }

  /**
   * NodePhase is the recently observed lifecycle phase of the node. More info:
   * https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is
   * deprecated.
   *
   * @return phase
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.  ")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1NodeStatus volumesAttached(List<V1AttachedVolume> volumesAttached) {

    this.volumesAttached = volumesAttached;
    return this;
  }

  public V1NodeStatus addVolumesAttachedItem(V1AttachedVolume volumesAttachedItem) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList<>();
    }
    this.volumesAttached.add(volumesAttachedItem);
    return this;
  }

  /**
   * List of volumes that are attached to the node.
   *
   * @return volumesAttached
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of volumes that are attached to the node.")
  public List<V1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }

  public V1NodeStatus volumesInUse(List<String> volumesInUse) {

    this.volumesInUse = volumesInUse;
    return this;
  }

  public V1NodeStatus addVolumesInUseItem(String volumesInUseItem) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList<>();
    }
    this.volumesInUse.add(volumesInUseItem);
    return this;
  }

  /**
   * List of attachable volumes in use (mounted) by the node.
   *
   * @return volumesInUse
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attachable volumes in use (mounted) by the node.")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeStatus v1NodeStatus = (V1NodeStatus) o;
    return Objects.equals(this.addresses, v1NodeStatus.addresses)
        && Objects.equals(this.allocatable, v1NodeStatus.allocatable)
        && Objects.equals(this.capacity, v1NodeStatus.capacity)
        && Objects.equals(this.conditions, v1NodeStatus.conditions)
        && Objects.equals(this.config, v1NodeStatus.config)
        && Objects.equals(this.daemonEndpoints, v1NodeStatus.daemonEndpoints)
        && Objects.equals(this.images, v1NodeStatus.images)
        && Objects.equals(this.nodeInfo, v1NodeStatus.nodeInfo)
        && Objects.equals(this.phase, v1NodeStatus.phase)
        && Objects.equals(this.volumesAttached, v1NodeStatus.volumesAttached)
        && Objects.equals(this.volumesInUse, v1NodeStatus.volumesInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addresses,
        allocatable,
        capacity,
        conditions,
        config,
        daemonEndpoints,
        images,
        nodeInfo,
        phase,
        volumesAttached,
        volumesInUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeStatus {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    daemonEndpoints: ").append(toIndentedString(daemonEndpoints)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
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
