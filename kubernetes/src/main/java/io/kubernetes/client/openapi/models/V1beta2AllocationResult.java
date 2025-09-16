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
import io.kubernetes.client.openapi.models.V1beta2DeviceAllocationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * AllocationResult contains attributes of an allocated resource.
 */
@ApiModel(description = "AllocationResult contains attributes of an allocated resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta2AllocationResult {
  public static final String SERIALIZED_NAME_ALLOCATION_TIMESTAMP = "allocationTimestamp";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_TIMESTAMP)
  @jakarta.annotation.Nullable
  private OffsetDateTime allocationTimestamp;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  @jakarta.annotation.Nullable
  private V1beta2DeviceAllocationResult devices;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  @jakarta.annotation.Nullable
  private V1NodeSelector nodeSelector;

  public V1beta2AllocationResult() {
  }

  public V1beta2AllocationResult allocationTimestamp(@jakarta.annotation.Nullable OffsetDateTime allocationTimestamp) {
    this.allocationTimestamp = allocationTimestamp;
    return this;
  }

  /**
   * AllocationTimestamp stores the time when the resources were allocated. This field is not guaranteed to be set, in which case that time is unknown.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gate.
   * @return allocationTimestamp
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllocationTimestamp stores the time when the resources were allocated. This field is not guaranteed to be set, in which case that time is unknown.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gate.")
  public OffsetDateTime getAllocationTimestamp() {
    return allocationTimestamp;
  }

  public void setAllocationTimestamp(@jakarta.annotation.Nullable OffsetDateTime allocationTimestamp) {
    this.allocationTimestamp = allocationTimestamp;
  }


  public V1beta2AllocationResult devices(@jakarta.annotation.Nullable V1beta2DeviceAllocationResult devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Get devices
   * @return devices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2DeviceAllocationResult getDevices() {
    return devices;
  }

  public void setDevices(@jakarta.annotation.Nullable V1beta2DeviceAllocationResult devices) {
    this.devices = devices;
  }


  public V1beta2AllocationResult nodeSelector(@jakarta.annotation.Nullable V1NodeSelector nodeSelector) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2AllocationResult v1beta2AllocationResult = (V1beta2AllocationResult) o;
    return Objects.equals(this.allocationTimestamp, v1beta2AllocationResult.allocationTimestamp) &&
        Objects.equals(this.devices, v1beta2AllocationResult.devices) &&
        Objects.equals(this.nodeSelector, v1beta2AllocationResult.nodeSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationTimestamp, devices, nodeSelector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2AllocationResult {\n");
    sb.append("    allocationTimestamp: ").append(toIndentedString(allocationTimestamp)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
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
    openapiFields.add("allocationTimestamp");
    openapiFields.add("devices");
    openapiFields.add("nodeSelector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2AllocationResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2AllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2AllocationResult is not found in the empty JSON string", V1beta2AllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2AllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2AllocationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `devices`
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        V1beta2DeviceAllocationResult.validateJsonElement(jsonObj.get("devices"));
      }
      // validate the optional field `nodeSelector`
      if (jsonObj.get("nodeSelector") != null && !jsonObj.get("nodeSelector").isJsonNull()) {
        V1NodeSelector.validateJsonElement(jsonObj.get("nodeSelector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2AllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2AllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2AllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2AllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2AllocationResult>() {
           @Override
           public void write(JsonWriter out, V1beta2AllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2AllocationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2AllocationResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2AllocationResult
   * @throws IOException if the JSON string is invalid with respect to V1beta2AllocationResult
   */
  public static V1beta2AllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2AllocationResult.class);
  }

  /**
   * Convert an instance of V1beta2AllocationResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
