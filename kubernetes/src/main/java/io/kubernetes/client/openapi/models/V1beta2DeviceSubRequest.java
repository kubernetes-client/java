/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1beta2CapacityRequirements;
import io.kubernetes.client.openapi.models.V1beta2DeviceSelector;
import io.kubernetes.client.openapi.models.V1beta2DeviceToleration;
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
 * DeviceSubRequest describes a request for device provided in the claim.spec.devices.requests[].firstAvailable array. Each is typically a request for a single resource like a device, but can also ask for several identical devices.  DeviceSubRequest is similar to ExactDeviceRequest, but doesn&#39;t expose the AdminAccess field as that one is only supported when requesting a specific device.
 */
@ApiModel(description = "DeviceSubRequest describes a request for device provided in the claim.spec.devices.requests[].firstAvailable array. Each is typically a request for a single resource like a device, but can also ask for several identical devices.  DeviceSubRequest is similar to ExactDeviceRequest, but doesn't expose the AdminAccess field as that one is only supported when requesting a specific device.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta2DeviceSubRequest {
  public static final String SERIALIZED_NAME_ALLOCATION_MODE = "allocationMode";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_MODE)
  @jakarta.annotation.Nullable
  private String allocationMode;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @jakarta.annotation.Nullable
  private V1beta2CapacityRequirements capacity;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Long count;

  public static final String SERIALIZED_NAME_DEVICE_CLASS_NAME = "deviceClassName";
  @SerializedName(SERIALIZED_NAME_DEVICE_CLASS_NAME)
  @jakarta.annotation.Nonnull
  private String deviceClassName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  @jakarta.annotation.Nullable
  private List<V1beta2DeviceSelector> selectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  @jakarta.annotation.Nullable
  private List<V1beta2DeviceToleration> tolerations = new ArrayList<>();

  public V1beta2DeviceSubRequest() {
  }

  public V1beta2DeviceSubRequest allocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

  /**
   * AllocationMode and its related fields define how devices are allocated to satisfy this subrequest. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This subrequest is for all of the matching devices in a pool.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other subrequests must specify this field.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
   * @return allocationMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllocationMode and its related fields define how devices are allocated to satisfy this subrequest. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This subrequest is for all of the matching devices in a pool.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other subrequests must specify this field.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.")
  public String getAllocationMode() {
    return allocationMode;
  }

  public void setAllocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1beta2DeviceSubRequest capacity(@jakarta.annotation.Nullable V1beta2CapacityRequirements capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2CapacityRequirements getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable V1beta2CapacityRequirements capacity) {
    this.capacity = capacity;
  }


  public V1beta2DeviceSubRequest count(@jakarta.annotation.Nullable Long count) {
    this.count = count;
    return this;
  }

  /**
   * Count is used only when the count mode is \&quot;ExactCount\&quot;. Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
   * @return count
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Count is used only when the count mode is \"ExactCount\". Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.")
  public Long getCount() {
    return count;
  }

  public void setCount(@jakarta.annotation.Nullable Long count) {
    this.count = count;
  }


  public V1beta2DeviceSubRequest deviceClassName(@jakarta.annotation.Nonnull String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

  /**
   * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this subrequest.  A class is required. Which classes are available depends on the cluster.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
   * @return deviceClassName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this subrequest.  A class is required. Which classes are available depends on the cluster.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.")
  public String getDeviceClassName() {
    return deviceClassName;
  }

  public void setDeviceClassName(@jakarta.annotation.Nonnull String deviceClassName) {
    this.deviceClassName = deviceClassName;
  }


  public V1beta2DeviceSubRequest name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name can be used to reference this subrequest in the list of constraints or the list of configurations for the claim. References must use the format &lt;main request&gt;/&lt;subrequest&gt;.  Must be a DNS label.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name can be used to reference this subrequest in the list of constraints or the list of configurations for the claim. References must use the format <main request>/<subrequest>.  Must be a DNS label.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1beta2DeviceSubRequest selectors(@jakarta.annotation.Nullable List<V1beta2DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1beta2DeviceSubRequest addSelectorsItem(V1beta2DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

  /**
   * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this subrequest. All selectors must be satisfied for a device to be considered.
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this subrequest. All selectors must be satisfied for a device to be considered.")
  public List<V1beta2DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(@jakarta.annotation.Nullable List<V1beta2DeviceSelector> selectors) {
    this.selectors = selectors;
  }


  public V1beta2DeviceSubRequest tolerations(@jakarta.annotation.Nullable List<V1beta2DeviceToleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1beta2DeviceSubRequest addTolerationsItem(V1beta2DeviceToleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * If specified, the request&#39;s tolerations.  Tolerations for NoSchedule are required to allocate a device which has a taint with that effect. The same applies to NoExecute.  In addition, should any of the allocated devices get tainted with NoExecute after allocation and that effect is not tolerated, then all pods consuming the ResourceClaim get deleted to evict them. The scheduler will not let new pods reserve the claim while it has these tainted devices. Once all pods are evicted, the claim will get deallocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.
   * @return tolerations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, the request's tolerations.  Tolerations for NoSchedule are required to allocate a device which has a taint with that effect. The same applies to NoExecute.  In addition, should any of the allocated devices get tainted with NoExecute after allocation and that effect is not tolerated, then all pods consuming the ResourceClaim get deleted to evict them. The scheduler will not let new pods reserve the claim while it has these tainted devices. Once all pods are evicted, the claim will get deallocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.")
  public List<V1beta2DeviceToleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(@jakarta.annotation.Nullable List<V1beta2DeviceToleration> tolerations) {
    this.tolerations = tolerations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceSubRequest v1beta2DeviceSubRequest = (V1beta2DeviceSubRequest) o;
    return Objects.equals(this.allocationMode, v1beta2DeviceSubRequest.allocationMode) &&
        Objects.equals(this.capacity, v1beta2DeviceSubRequest.capacity) &&
        Objects.equals(this.count, v1beta2DeviceSubRequest.count) &&
        Objects.equals(this.deviceClassName, v1beta2DeviceSubRequest.deviceClassName) &&
        Objects.equals(this.name, v1beta2DeviceSubRequest.name) &&
        Objects.equals(this.selectors, v1beta2DeviceSubRequest.selectors) &&
        Objects.equals(this.tolerations, v1beta2DeviceSubRequest.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMode, capacity, count, deviceClassName, name, selectors, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceSubRequest {\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceClassName: ").append(toIndentedString(deviceClassName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("allocationMode", "capacity", "count", "deviceClassName", "name", "selectors", "tolerations"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("deviceClassName", "name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceSubRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceSubRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta2DeviceSubRequest is not found in the empty JSON string", V1beta2DeviceSubRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceSubRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2DeviceSubRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2DeviceSubRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("allocationMode") != null && !jsonObj.get("allocationMode").isJsonNull()) && !jsonObj.get("allocationMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `allocationMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocationMode").toString()));
      }
      // validate the optional field `capacity`
      if (jsonObj.get("capacity") != null && !jsonObj.get("capacity").isJsonNull()) {
        V1beta2CapacityRequirements.validateJsonElement(jsonObj.get("capacity"));
      }
      if (!jsonObj.get("deviceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `deviceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceClassName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("selectors") != null && !jsonObj.get("selectors").isJsonNull()) {
        JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
        if (jsonArrayselectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
          }

          // validate the optional field `selectors` (array)
          for (int i = 0; i < jsonArrayselectors.size(); i++) {
            V1beta2DeviceSelector.validateJsonElement(jsonArrayselectors.get(i));
          };
        }
      }
      if (jsonObj.get("tolerations") != null && !jsonObj.get("tolerations").isJsonNull()) {
        JsonArray jsonArraytolerations = jsonObj.getAsJsonArray("tolerations");
        if (jsonArraytolerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tolerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
          }

          // validate the optional field `tolerations` (array)
          for (int i = 0; i < jsonArraytolerations.size(); i++) {
            V1beta2DeviceToleration.validateJsonElement(jsonArraytolerations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceSubRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceSubRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceSubRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceSubRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceSubRequest>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceSubRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceSubRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceSubRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceSubRequest
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceSubRequest
   */
  public static V1beta2DeviceSubRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceSubRequest.class);
  }

  /**
   * Convert an instance of V1beta2DeviceSubRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
