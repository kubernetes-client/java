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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1AttachedVolume;
import io.kubernetes.client.openapi.models.V1ContainerImage;
import io.kubernetes.client.openapi.models.V1NodeAddress;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeConfigStatus;
import io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints;
import io.kubernetes.client.openapi.models.V1NodeFeatures;
import io.kubernetes.client.openapi.models.V1NodeRuntimeHandler;
import io.kubernetes.client.openapi.models.V1NodeSystemInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * NodeStatus is information about the current status of a node.
 */
@ApiModel(description = "NodeStatus is information about the current status of a node.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NodeStatus {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  @jakarta.annotation.Nullable
  private List<V1NodeAddress> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOCATABLE = "allocatable";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> allocatable = new HashMap<>();

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> capacity = new HashMap<>();

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<V1NodeCondition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  @jakarta.annotation.Nullable
  private V1NodeConfigStatus config;

  public static final String SERIALIZED_NAME_DAEMON_ENDPOINTS = "daemonEndpoints";
  @SerializedName(SERIALIZED_NAME_DAEMON_ENDPOINTS)
  @jakarta.annotation.Nullable
  private V1NodeDaemonEndpoints daemonEndpoints;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  @jakarta.annotation.Nullable
  private V1NodeFeatures features;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  @jakarta.annotation.Nullable
  private List<V1ContainerImage> images = new ArrayList<>();

  public static final String SERIALIZED_NAME_NODE_INFO = "nodeInfo";
  @SerializedName(SERIALIZED_NAME_NODE_INFO)
  @jakarta.annotation.Nullable
  private V1NodeSystemInfo nodeInfo;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  @jakarta.annotation.Nullable
  private String phase;

  public static final String SERIALIZED_NAME_RUNTIME_HANDLERS = "runtimeHandlers";
  @SerializedName(SERIALIZED_NAME_RUNTIME_HANDLERS)
  @jakarta.annotation.Nullable
  private List<V1NodeRuntimeHandler> runtimeHandlers = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUMES_ATTACHED = "volumesAttached";
  @SerializedName(SERIALIZED_NAME_VOLUMES_ATTACHED)
  @jakarta.annotation.Nullable
  private List<V1AttachedVolume> volumesAttached = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUMES_IN_USE = "volumesInUse";
  @SerializedName(SERIALIZED_NAME_VOLUMES_IN_USE)
  @jakarta.annotation.Nullable
  private List<String> volumesInUse = new ArrayList<>();

  public V1NodeStatus() {
  }

  public V1NodeStatus addresses(@jakarta.annotation.Nullable List<V1NodeAddress> addresses) {
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
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/reference/node/node-status/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node&#39;s address in its own status or consumers of the downward API (status.hostIP).
   * @return addresses
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/reference/node/node-status/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See https://pr.k8s.io/79391 for an example. Consumers should assume that addresses can change during the lifetime of a Node. However, there are some exceptions where this may not be possible, such as Pods that inherit a Node's address in its own status or consumers of the downward API (status.hostIP).")
  public List<V1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(@jakarta.annotation.Nullable List<V1NodeAddress> addresses) {
    this.addresses = addresses;
  }


  public V1NodeStatus allocatable(@jakarta.annotation.Nullable Map<String, Quantity> allocatable) {
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
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   * @return allocatable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
  public Map<String, Quantity> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(@jakarta.annotation.Nullable Map<String, Quantity> allocatable) {
    this.allocatable = allocatable;
  }


  public V1NodeStatus capacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
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
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/reference/node/node-status/#capacity
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/reference/node/node-status/#capacity")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }


  public V1NodeStatus conditions(@jakarta.annotation.Nullable List<V1NodeCondition> conditions) {
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
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/reference/node/node-status/#condition
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/reference/node/node-status/#condition")
  public List<V1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(@jakarta.annotation.Nullable List<V1NodeCondition> conditions) {
    this.conditions = conditions;
  }


  public V1NodeStatus config(@jakarta.annotation.Nullable V1NodeConfigStatus config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeConfigStatus getConfig() {
    return config;
  }

  public void setConfig(@jakarta.annotation.Nullable V1NodeConfigStatus config) {
    this.config = config;
  }


  public V1NodeStatus daemonEndpoints(@jakarta.annotation.Nullable V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

  /**
   * Get daemonEndpoints
   * @return daemonEndpoints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(@jakarta.annotation.Nullable V1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }


  public V1NodeStatus features(@jakarta.annotation.Nullable V1NodeFeatures features) {
    this.features = features;
    return this;
  }

  /**
   * Get features
   * @return features
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeFeatures getFeatures() {
    return features;
  }

  public void setFeatures(@jakarta.annotation.Nullable V1NodeFeatures features) {
    this.features = features;
  }


  public V1NodeStatus images(@jakarta.annotation.Nullable List<V1ContainerImage> images) {
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
   * @return images
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of container images on this node")
  public List<V1ContainerImage> getImages() {
    return images;
  }

  public void setImages(@jakarta.annotation.Nullable List<V1ContainerImage> images) {
    this.images = images;
  }


  public V1NodeStatus nodeInfo(@jakarta.annotation.Nullable V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  /**
   * Get nodeInfo
   * @return nodeInfo
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(@jakarta.annotation.Nullable V1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }


  public V1NodeStatus phase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
   * @return phase
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(@jakarta.annotation.Nullable String phase) {
    this.phase = phase;
  }


  public V1NodeStatus runtimeHandlers(@jakarta.annotation.Nullable List<V1NodeRuntimeHandler> runtimeHandlers) {
    this.runtimeHandlers = runtimeHandlers;
    return this;
  }

  public V1NodeStatus addRuntimeHandlersItem(V1NodeRuntimeHandler runtimeHandlersItem) {
    if (this.runtimeHandlers == null) {
      this.runtimeHandlers = new ArrayList<>();
    }
    this.runtimeHandlers.add(runtimeHandlersItem);
    return this;
  }

  /**
   * The available runtime handlers.
   * @return runtimeHandlers
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The available runtime handlers.")
  public List<V1NodeRuntimeHandler> getRuntimeHandlers() {
    return runtimeHandlers;
  }

  public void setRuntimeHandlers(@jakarta.annotation.Nullable List<V1NodeRuntimeHandler> runtimeHandlers) {
    this.runtimeHandlers = runtimeHandlers;
  }


  public V1NodeStatus volumesAttached(@jakarta.annotation.Nullable List<V1AttachedVolume> volumesAttached) {
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
   * @return volumesAttached
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of volumes that are attached to the node.")
  public List<V1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(@jakarta.annotation.Nullable List<V1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }


  public V1NodeStatus volumesInUse(@jakarta.annotation.Nullable List<String> volumesInUse) {
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
   * @return volumesInUse
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "List of attachable volumes in use (mounted) by the node.")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(@jakarta.annotation.Nullable List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeStatus v1NodeStatus = (V1NodeStatus) o;
    return Objects.equals(this.addresses, v1NodeStatus.addresses) &&
        Objects.equals(this.allocatable, v1NodeStatus.allocatable) &&
        Objects.equals(this.capacity, v1NodeStatus.capacity) &&
        Objects.equals(this.conditions, v1NodeStatus.conditions) &&
        Objects.equals(this.config, v1NodeStatus.config) &&
        Objects.equals(this.daemonEndpoints, v1NodeStatus.daemonEndpoints) &&
        Objects.equals(this.features, v1NodeStatus.features) &&
        Objects.equals(this.images, v1NodeStatus.images) &&
        Objects.equals(this.nodeInfo, v1NodeStatus.nodeInfo) &&
        Objects.equals(this.phase, v1NodeStatus.phase) &&
        Objects.equals(this.runtimeHandlers, v1NodeStatus.runtimeHandlers) &&
        Objects.equals(this.volumesAttached, v1NodeStatus.volumesAttached) &&
        Objects.equals(this.volumesInUse, v1NodeStatus.volumesInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, allocatable, capacity, conditions, config, daemonEndpoints, features, images, nodeInfo, phase, runtimeHandlers, volumesAttached, volumesInUse);
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
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    runtimeHandlers: ").append(toIndentedString(runtimeHandlers)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("addresses");
    openapiFields.add("allocatable");
    openapiFields.add("capacity");
    openapiFields.add("conditions");
    openapiFields.add("config");
    openapiFields.add("daemonEndpoints");
    openapiFields.add("features");
    openapiFields.add("images");
    openapiFields.add("nodeInfo");
    openapiFields.add("phase");
    openapiFields.add("runtimeHandlers");
    openapiFields.add("volumesAttached");
    openapiFields.add("volumesInUse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NodeStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NodeStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NodeStatus is not found in the empty JSON string", V1NodeStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NodeStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NodeStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            V1NodeAddress.validateJsonElement(jsonArrayaddresses.get(i));
          };
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1NodeCondition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        V1NodeConfigStatus.validateJsonElement(jsonObj.get("config"));
      }
      // validate the optional field `daemonEndpoints`
      if (jsonObj.get("daemonEndpoints") != null && !jsonObj.get("daemonEndpoints").isJsonNull()) {
        V1NodeDaemonEndpoints.validateJsonElement(jsonObj.get("daemonEndpoints"));
      }
      // validate the optional field `features`
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        V1NodeFeatures.validateJsonElement(jsonObj.get("features"));
      }
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
        if (jsonArrayimages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("images").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
          }

          // validate the optional field `images` (array)
          for (int i = 0; i < jsonArrayimages.size(); i++) {
            V1ContainerImage.validateJsonElement(jsonArrayimages.get(i));
          };
        }
      }
      // validate the optional field `nodeInfo`
      if (jsonObj.get("nodeInfo") != null && !jsonObj.get("nodeInfo").isJsonNull()) {
        V1NodeSystemInfo.validateJsonElement(jsonObj.get("nodeInfo"));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if (jsonObj.get("runtimeHandlers") != null && !jsonObj.get("runtimeHandlers").isJsonNull()) {
        JsonArray jsonArrayruntimeHandlers = jsonObj.getAsJsonArray("runtimeHandlers");
        if (jsonArrayruntimeHandlers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runtimeHandlers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runtimeHandlers` to be an array in the JSON string but got `%s`", jsonObj.get("runtimeHandlers").toString()));
          }

          // validate the optional field `runtimeHandlers` (array)
          for (int i = 0; i < jsonArrayruntimeHandlers.size(); i++) {
            V1NodeRuntimeHandler.validateJsonElement(jsonArrayruntimeHandlers.get(i));
          };
        }
      }
      if (jsonObj.get("volumesAttached") != null && !jsonObj.get("volumesAttached").isJsonNull()) {
        JsonArray jsonArrayvolumesAttached = jsonObj.getAsJsonArray("volumesAttached");
        if (jsonArrayvolumesAttached != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumesAttached").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumesAttached` to be an array in the JSON string but got `%s`", jsonObj.get("volumesAttached").toString()));
          }

          // validate the optional field `volumesAttached` (array)
          for (int i = 0; i < jsonArrayvolumesAttached.size(); i++) {
            V1AttachedVolume.validateJsonElement(jsonArrayvolumesAttached.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumesInUse") != null && !jsonObj.get("volumesInUse").isJsonNull() && !jsonObj.get("volumesInUse").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumesInUse` to be an array in the JSON string but got `%s`", jsonObj.get("volumesInUse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NodeStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NodeStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NodeStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NodeStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NodeStatus>() {
           @Override
           public void write(JsonWriter out, V1NodeStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NodeStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NodeStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NodeStatus
   * @throws IOException if the JSON string is invalid with respect to V1NodeStatus
   */
  public static V1NodeStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NodeStatus.class);
  }

  /**
   * Convert an instance of V1NodeStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
