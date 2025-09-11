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
import io.kubernetes.client.openapi.models.V1beta1DeviceAttribute;
import io.kubernetes.client.openapi.models.V1beta1DeviceCapacity;
import io.kubernetes.client.openapi.models.V1beta1DeviceCounterConsumption;
import io.kubernetes.client.openapi.models.V1beta1DeviceTaint;
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
 * BasicDevice defines one device instance.
 */
@ApiModel(description = "BasicDevice defines one device instance.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta1BasicDevice {
  public static final String SERIALIZED_NAME_ALL_NODES = "allNodes";
  @SerializedName(SERIALIZED_NAME_ALL_NODES)
  @jakarta.annotation.Nullable
  private Boolean allNodes;

  public static final String SERIALIZED_NAME_ALLOW_MULTIPLE_ALLOCATIONS = "allowMultipleAllocations";
  @SerializedName(SERIALIZED_NAME_ALLOW_MULTIPLE_ALLOCATIONS)
  @jakarta.annotation.Nullable
  private Boolean allowMultipleAllocations;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  @jakarta.annotation.Nullable
  private Map<String, V1beta1DeviceAttribute> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_BINDING_CONDITIONS = "bindingConditions";
  @SerializedName(SERIALIZED_NAME_BINDING_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<String> bindingConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_BINDING_FAILURE_CONDITIONS = "bindingFailureConditions";
  @SerializedName(SERIALIZED_NAME_BINDING_FAILURE_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<String> bindingFailureConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_BINDS_TO_NODE = "bindsToNode";
  @SerializedName(SERIALIZED_NAME_BINDS_TO_NODE)
  @jakarta.annotation.Nullable
  private Boolean bindsToNode;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @jakarta.annotation.Nullable
  private Map<String, V1beta1DeviceCapacity> capacity = new HashMap<>();

  public static final String SERIALIZED_NAME_CONSUMES_COUNTERS = "consumesCounters";
  @SerializedName(SERIALIZED_NAME_CONSUMES_COUNTERS)
  @jakarta.annotation.Nullable
  private List<V1beta1DeviceCounterConsumption> consumesCounters = new ArrayList<>();

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nodeName;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1NodeSelector nodeSelector;

  public static final String SERIALIZED_NAME_TAINTS = "taints";
  @SerializedName(SERIALIZED_NAME_TAINTS)
  @jakarta.annotation.Nullable
  private List<V1beta1DeviceTaint> taints = new ArrayList<>();

  public V1beta1BasicDevice() {
  }

  public V1beta1BasicDevice allNodes(@jakarta.annotation.Nullable Boolean allNodes) {
    this.allNodes = allNodes;
    return this;
  }

  /**
   * AllNodes indicates that all nodes have access to the device.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set.
   * @return allNodes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllNodes indicates that all nodes have access to the device.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set.")
  public Boolean getAllNodes() {
    return allNodes;
  }

  public void setAllNodes(@jakarta.annotation.Nullable Boolean allNodes) {
    this.allNodes = allNodes;
  }


  public V1beta1BasicDevice allowMultipleAllocations(@jakarta.annotation.Nullable Boolean allowMultipleAllocations) {
    this.allowMultipleAllocations = allowMultipleAllocations;
    return this;
  }

  /**
   * AllowMultipleAllocations marks whether the device is allowed to be allocated to multiple DeviceRequests.  If AllowMultipleAllocations is set to true, the device can be allocated more than once, and all of its capacity is consumable, regardless of whether the requestPolicy is defined or not.
   * @return allowMultipleAllocations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllowMultipleAllocations marks whether the device is allowed to be allocated to multiple DeviceRequests.  If AllowMultipleAllocations is set to true, the device can be allocated more than once, and all of its capacity is consumable, regardless of whether the requestPolicy is defined or not.")
  public Boolean getAllowMultipleAllocations() {
    return allowMultipleAllocations;
  }

  public void setAllowMultipleAllocations(@jakarta.annotation.Nullable Boolean allowMultipleAllocations) {
    this.allowMultipleAllocations = allowMultipleAllocations;
  }


  public V1beta1BasicDevice attributes(@jakarta.annotation.Nullable Map<String, V1beta1DeviceAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public V1beta1BasicDevice putAttributesItem(String key, V1beta1DeviceAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32.
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Attributes defines the set of attributes for this device. The name of each attribute must be unique in that set.  The maximum number of attributes and capacities combined is 32.")
  public Map<String, V1beta1DeviceAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(@jakarta.annotation.Nullable Map<String, V1beta1DeviceAttribute> attributes) {
    this.attributes = attributes;
  }


  public V1beta1BasicDevice bindingConditions(@jakarta.annotation.Nullable List<String> bindingConditions) {
    this.bindingConditions = bindingConditions;
    return this;
  }

  public V1beta1BasicDevice addBindingConditionsItem(String bindingConditionsItem) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList<>();
    }
    this.bindingConditions.add(bindingConditionsItem);
    return this;
  }

  /**
   * BindingConditions defines the conditions for proceeding with binding. All of these conditions must be set in the per-device status conditions with a value of True to proceed with binding the pod to the node while scheduling the pod.  The maximum number of binding conditions is 4.  The conditions must be a valid condition type string.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.
   * @return bindingConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BindingConditions defines the conditions for proceeding with binding. All of these conditions must be set in the per-device status conditions with a value of True to proceed with binding the pod to the node while scheduling the pod.  The maximum number of binding conditions is 4.  The conditions must be a valid condition type string.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.")
  public List<String> getBindingConditions() {
    return bindingConditions;
  }

  public void setBindingConditions(@jakarta.annotation.Nullable List<String> bindingConditions) {
    this.bindingConditions = bindingConditions;
  }


  public V1beta1BasicDevice bindingFailureConditions(@jakarta.annotation.Nullable List<String> bindingFailureConditions) {
    this.bindingFailureConditions = bindingFailureConditions;
    return this;
  }

  public V1beta1BasicDevice addBindingFailureConditionsItem(String bindingFailureConditionsItem) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList<>();
    }
    this.bindingFailureConditions.add(bindingFailureConditionsItem);
    return this;
  }

  /**
   * BindingFailureConditions defines the conditions for binding failure. They may be set in the per-device status conditions. If any is true, a binding failure occurred.  The maximum number of binding failure conditions is 4.  The conditions must be a valid condition type string.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.
   * @return bindingFailureConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BindingFailureConditions defines the conditions for binding failure. They may be set in the per-device status conditions. If any is true, a binding failure occurred.  The maximum number of binding failure conditions is 4.  The conditions must be a valid condition type string.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.")
  public List<String> getBindingFailureConditions() {
    return bindingFailureConditions;
  }

  public void setBindingFailureConditions(@jakarta.annotation.Nullable List<String> bindingFailureConditions) {
    this.bindingFailureConditions = bindingFailureConditions;
  }


  public V1beta1BasicDevice bindsToNode(@jakarta.annotation.Nullable Boolean bindsToNode) {
    this.bindsToNode = bindsToNode;
    return this;
  }

  /**
   * BindsToNode indicates if the usage of an allocation involving this device has to be limited to exactly the node that was chosen when allocating the claim. If set to true, the scheduler will set the ResourceClaim.Status.Allocation.NodeSelector to match the node where the allocation was made.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.
   * @return bindsToNode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BindsToNode indicates if the usage of an allocation involving this device has to be limited to exactly the node that was chosen when allocating the claim. If set to true, the scheduler will set the ResourceClaim.Status.Allocation.NodeSelector to match the node where the allocation was made.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.")
  public Boolean getBindsToNode() {
    return bindsToNode;
  }

  public void setBindsToNode(@jakarta.annotation.Nullable Boolean bindsToNode) {
    this.bindsToNode = bindsToNode;
  }


  public V1beta1BasicDevice capacity(@jakarta.annotation.Nullable Map<String, V1beta1DeviceCapacity> capacity) {
    this.capacity = capacity;
    return this;
  }

  public V1beta1BasicDevice putCapacityItem(String key, V1beta1DeviceCapacity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

  /**
   * Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32.
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Capacity defines the set of capacities for this device. The name of each capacity must be unique in that set.  The maximum number of attributes and capacities combined is 32.")
  public Map<String, V1beta1DeviceCapacity> getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable Map<String, V1beta1DeviceCapacity> capacity) {
    this.capacity = capacity;
  }


  public V1beta1BasicDevice consumesCounters(@jakarta.annotation.Nullable List<V1beta1DeviceCounterConsumption> consumesCounters) {
    this.consumesCounters = consumesCounters;
    return this;
  }

  public V1beta1BasicDevice addConsumesCountersItem(V1beta1DeviceCounterConsumption consumesCountersItem) {
    if (this.consumesCounters == null) {
      this.consumesCounters = new ArrayList<>();
    }
    this.consumesCounters.add(consumesCountersItem);
    return this;
  }

  /**
   * ConsumesCounters defines a list of references to sharedCounters and the set of counters that the device will consume from those counter sets.  There can only be a single entry per counterSet.  The total number of device counter consumption entries must be &lt;&#x3D; 32. In addition, the total number in the entire ResourceSlice must be &lt;&#x3D; 1024 (for example, 64 devices with 16 counters each).
   * @return consumesCounters
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ConsumesCounters defines a list of references to sharedCounters and the set of counters that the device will consume from those counter sets.  There can only be a single entry per counterSet.  The total number of device counter consumption entries must be <= 32. In addition, the total number in the entire ResourceSlice must be <= 1024 (for example, 64 devices with 16 counters each).")
  public List<V1beta1DeviceCounterConsumption> getConsumesCounters() {
    return consumesCounters;
  }

  public void setConsumesCounters(@jakarta.annotation.Nullable List<V1beta1DeviceCounterConsumption> consumesCounters) {
    this.consumesCounters = consumesCounters;
  }


  public V1beta1BasicDevice nodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * NodeName identifies the node where the device is available.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set.
   * @return nodeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "NodeName identifies the node where the device is available.  Must only be set if Spec.PerDeviceNodeSelection is set to true. At most one of NodeName, NodeSelector and AllNodes can be set.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
  }


  public V1beta1BasicDevice nodeSelector(@jakarta.annotation.Nullable V1NodeSelector nodeSelector) {
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


  public V1beta1BasicDevice taints(@jakarta.annotation.Nullable List<V1beta1DeviceTaint> taints) {
    this.taints = taints;
    return this;
  }

  public V1beta1BasicDevice addTaintsItem(V1beta1DeviceTaint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<>();
    }
    this.taints.add(taintsItem);
    return this;
  }

  /**
   * If specified, these are the driver-defined taints.  The maximum number of taints is 4.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.
   * @return taints
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, these are the driver-defined taints.  The maximum number of taints is 4.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.")
  public List<V1beta1DeviceTaint> getTaints() {
    return taints;
  }

  public void setTaints(@jakarta.annotation.Nullable List<V1beta1DeviceTaint> taints) {
    this.taints = taints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1BasicDevice v1beta1BasicDevice = (V1beta1BasicDevice) o;
    return Objects.equals(this.allNodes, v1beta1BasicDevice.allNodes) &&
        Objects.equals(this.allowMultipleAllocations, v1beta1BasicDevice.allowMultipleAllocations) &&
        Objects.equals(this.attributes, v1beta1BasicDevice.attributes) &&
        Objects.equals(this.bindingConditions, v1beta1BasicDevice.bindingConditions) &&
        Objects.equals(this.bindingFailureConditions, v1beta1BasicDevice.bindingFailureConditions) &&
        Objects.equals(this.bindsToNode, v1beta1BasicDevice.bindsToNode) &&
        Objects.equals(this.capacity, v1beta1BasicDevice.capacity) &&
        Objects.equals(this.consumesCounters, v1beta1BasicDevice.consumesCounters) &&
        Objects.equals(this.nodeName, v1beta1BasicDevice.nodeName) &&
        Objects.equals(this.nodeSelector, v1beta1BasicDevice.nodeSelector) &&
        Objects.equals(this.taints, v1beta1BasicDevice.taints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allNodes, allowMultipleAllocations, attributes, bindingConditions, bindingFailureConditions, bindsToNode, capacity, consumesCounters, nodeName, nodeSelector, taints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1BasicDevice {\n");
    sb.append("    allNodes: ").append(toIndentedString(allNodes)).append("\n");
    sb.append("    allowMultipleAllocations: ").append(toIndentedString(allowMultipleAllocations)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    bindingConditions: ").append(toIndentedString(bindingConditions)).append("\n");
    sb.append("    bindingFailureConditions: ").append(toIndentedString(bindingFailureConditions)).append("\n");
    sb.append("    bindsToNode: ").append(toIndentedString(bindsToNode)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    consumesCounters: ").append(toIndentedString(consumesCounters)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
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
    openapiFields.add("allowMultipleAllocations");
    openapiFields.add("attributes");
    openapiFields.add("bindingConditions");
    openapiFields.add("bindingFailureConditions");
    openapiFields.add("bindsToNode");
    openapiFields.add("capacity");
    openapiFields.add("consumesCounters");
    openapiFields.add("nodeName");
    openapiFields.add("nodeSelector");
    openapiFields.add("taints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1BasicDevice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1BasicDevice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1BasicDevice is not found in the empty JSON string", V1beta1BasicDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1BasicDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1BasicDevice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("bindingConditions") != null && !jsonObj.get("bindingConditions").isJsonNull() && !jsonObj.get("bindingConditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindingConditions` to be an array in the JSON string but got `%s`", jsonObj.get("bindingConditions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bindingFailureConditions") != null && !jsonObj.get("bindingFailureConditions").isJsonNull() && !jsonObj.get("bindingFailureConditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindingFailureConditions` to be an array in the JSON string but got `%s`", jsonObj.get("bindingFailureConditions").toString()));
      }
      if (jsonObj.get("consumesCounters") != null && !jsonObj.get("consumesCounters").isJsonNull()) {
        JsonArray jsonArrayconsumesCounters = jsonObj.getAsJsonArray("consumesCounters");
        if (jsonArrayconsumesCounters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("consumesCounters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `consumesCounters` to be an array in the JSON string but got `%s`", jsonObj.get("consumesCounters").toString()));
          }

          // validate the optional field `consumesCounters` (array)
          for (int i = 0; i < jsonArrayconsumesCounters.size(); i++) {
            V1beta1DeviceCounterConsumption.validateJsonElement(jsonArrayconsumesCounters.get(i));
          };
        }
      }
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      // validate the optional field `nodeSelector`
      if (jsonObj.get("nodeSelector") != null && !jsonObj.get("nodeSelector").isJsonNull()) {
        V1NodeSelector.validateJsonElement(jsonObj.get("nodeSelector"));
      }
      if (jsonObj.get("taints") != null && !jsonObj.get("taints").isJsonNull()) {
        JsonArray jsonArraytaints = jsonObj.getAsJsonArray("taints");
        if (jsonArraytaints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taints` to be an array in the JSON string but got `%s`", jsonObj.get("taints").toString()));
          }

          // validate the optional field `taints` (array)
          for (int i = 0; i < jsonArraytaints.size(); i++) {
            V1beta1DeviceTaint.validateJsonElement(jsonArraytaints.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1BasicDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1BasicDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1BasicDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1BasicDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1BasicDevice>() {
           @Override
           public void write(JsonWriter out, V1beta1BasicDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1BasicDevice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1BasicDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1BasicDevice
   * @throws IOException if the JSON string is invalid with respect to V1beta1BasicDevice
   */
  public static V1beta1BasicDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1BasicDevice.class);
  }

  /**
   * Convert an instance of V1beta1BasicDevice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
