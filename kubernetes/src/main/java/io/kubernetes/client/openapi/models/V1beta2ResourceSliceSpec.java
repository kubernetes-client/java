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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1beta2CounterSet;
import io.kubernetes.client.openapi.models.V1beta2Device;
import io.kubernetes.client.openapi.models.V1beta2ResourcePool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
@ApiModel(description = "ResourceSliceSpec contains the information published by the driver in one ResourceSlice.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta2ResourceSliceSpec {
  public static final String SERIALIZED_NAME_ALL_NODES = "allNodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  @jakarta.annotation.Nullable
  private Boolean allNodes;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  @jakarta.annotation.Nullable
  private List<V1beta2Device> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_PER_DEVICE_NODE_SELECTION = "perDeviceNodeSelection";
  @SerializedName(SERIALIZED_NAME_PER_DEVICE_NODE_SELECTION)
  @jakarta.annotation.Nullable
  private Boolean perDeviceNodeSelection;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  @jakarta.annotation.Nonnull
  private V1beta2ResourcePool pool;

  public static final String SERIALIZED_NAME_SHARED_COUNTERS = "sharedCounters";
  @SerializedName(SERIALIZED_NAME_SHARED_COUNTERS)
  @jakarta.annotation.Nullable
  private List<V1beta2CounterSet> sharedCounters = new ArrayList<>();

  public V1beta2ResourceSliceSpec() {
  }

  public V1beta2ResourceSliceSpec allNodes(@jakarta.annotation.Nullable Boolean allNodes) {
    this.allNodes = allNodes;
    return this;
  }

  /**
   * AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.
   * @return allNodes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllNodes indicates that all nodes have access to the resources in the pool.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.")
  public Boolean getAllNodes() {
    return allNodes;
  }

  public void setAllNodes(@jakarta.annotation.Nullable Boolean allNodes) {
    this.allNodes = allNodes;
  }


  public V1beta2ResourceSliceSpec devices(@jakarta.annotation.Nullable List<V1beta2Device> devices) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Devices lists some or all of the devices in this pool.  Must not have more than 128 entries.")
  public List<V1beta2Device> getDevices() {
    return devices;
  }

  public void setDevices(@jakarta.annotation.Nullable List<V1beta2Device> devices) {
    this.devices = devices;
  }


  public V1beta2ResourceSliceSpec driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1beta2ResourceSliceSpec nodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. This field is immutable.
   * @return nodeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.  This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set. This field is immutable.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
  }


  public V1beta2ResourceSliceSpec nodeSelector(@jakarta.annotation.Nullable V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  /**
   * Get nodeSelector
   * @return nodeSelector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NodeSelector getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(@jakarta.annotation.Nullable V1NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public V1beta2ResourceSliceSpec perDeviceNodeSelection(@jakarta.annotation.Nullable Boolean perDeviceNodeSelection) {
    this.perDeviceNodeSelection = perDeviceNodeSelection;
    return this;
  }

  /**
   * PerDeviceNodeSelection defines whether the access from nodes to resources in the pool is set on the ResourceSlice level or on each device. If it is set to true, every device defined the ResourceSlice must specify this individually.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.
   * @return perDeviceNodeSelection
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "PerDeviceNodeSelection defines whether the access from nodes to resources in the pool is set on the ResourceSlice level or on each device. If it is set to true, every device defined the ResourceSlice must specify this individually.  Exactly one of NodeName, NodeSelector, AllNodes, and PerDeviceNodeSelection must be set.")
  public Boolean getPerDeviceNodeSelection() {
    return perDeviceNodeSelection;
  }

  public void setPerDeviceNodeSelection(@jakarta.annotation.Nullable Boolean perDeviceNodeSelection) {
    this.perDeviceNodeSelection = perDeviceNodeSelection;
  }


  public V1beta2ResourceSliceSpec pool(@jakarta.annotation.Nonnull V1beta2ResourcePool pool) {
    this.pool = pool;
    return this;
  }

  /**
   * Get pool
   * @return pool
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1beta2ResourcePool getPool() {
    return pool;
  }

  public void setPool(@jakarta.annotation.Nonnull V1beta2ResourcePool pool) {
    this.pool = pool;
  }


  public V1beta2ResourceSliceSpec sharedCounters(@jakarta.annotation.Nullable List<V1beta2CounterSet> sharedCounters) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "SharedCounters defines a list of counter sets, each of which has a name and a list of counters available.  The names of the SharedCounters must be unique in the ResourceSlice.  The maximum number of counters in all sets is 32.")
  public List<V1beta2CounterSet> getSharedCounters() {
    return sharedCounters;
  }

  public void setSharedCounters(@jakarta.annotation.Nullable List<V1beta2CounterSet> sharedCounters) {
    this.sharedCounters = sharedCounters;
  }



  @Override
  public boolean equals(Object o) {
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
    openapiFields.add("allNodes");
    openapiFields.add("devices");
    openapiFields.add("driver");
    openapiFields.add("nodeName");
    openapiFields.add("nodeSelector");
    openapiFields.add("perDeviceNodeSelection");
    openapiFields.add("pool");
    openapiFields.add("sharedCounters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("pool");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2ResourceSliceSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2ResourceSliceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2ResourceSliceSpec is not found in the empty JSON string", V1beta2ResourceSliceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2ResourceSliceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2ResourceSliceSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2ResourceSliceSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            V1beta2Device.validateJsonElement(jsonArraydevices.get(i));
          };
        }
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `nodeSelector`
      if (jsonObj.get("nodeSelector") != null && !jsonObj.get("nodeSelector").isJsonNull()) {
        V1NodeSelector.validateJsonElement(jsonObj.get("nodeSelector"));
      }
      // validate the required field `pool`
      V1beta2ResourcePool.validateJsonElement(jsonObj.get("pool"));
      if (jsonObj.get("sharedCounters") != null && !jsonObj.get("sharedCounters").isJsonNull()) {
        JsonArray jsonArraysharedCounters = jsonObj.getAsJsonArray("sharedCounters");
        if (jsonArraysharedCounters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharedCounters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharedCounters` to be an array in the JSON string but got `%s`", jsonObj.get("sharedCounters").toString()));
          }

          // validate the optional field `sharedCounters` (array)
          for (int i = 0; i < jsonArraysharedCounters.size(); i++) {
            V1beta2CounterSet.validateJsonElement(jsonArraysharedCounters.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2ResourceSliceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2ResourceSliceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2ResourceSliceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2ResourceSliceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2ResourceSliceSpec>() {
           @Override
           public void write(JsonWriter out, V1beta2ResourceSliceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2ResourceSliceSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2ResourceSliceSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2ResourceSliceSpec
   * @throws IOException if the JSON string is invalid with respect to V1beta2ResourceSliceSpec
   */
  public static V1beta2ResourceSliceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2ResourceSliceSpec.class);
  }

  /**
   * Convert an instance of V1beta2ResourceSliceSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
