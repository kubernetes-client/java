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
import java.util.Locale;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * ExactDeviceRequest is a request for one or more identical devices.
 */
@ApiModel(description = "ExactDeviceRequest is a request for one or more identical devices.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1beta2ExactDeviceRequest {
  public static final String SERIALIZED_NAME_ADMIN_ACCESS = "adminAccess";
  @SerializedName(SERIALIZED_NAME_ADMIN_ACCESS)
  @jakarta.annotation.Nullable
  private Boolean adminAccess;

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

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  @jakarta.annotation.Nullable
  private List<V1beta2DeviceSelector> selectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  @jakarta.annotation.Nullable
  private List<V1beta2DeviceToleration> tolerations = new ArrayList<>();

  public V1beta2ExactDeviceRequest() {
  }

  public V1beta2ExactDeviceRequest adminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

  /**
   * AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.
   * @return adminAccess
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.")
  public Boolean getAdminAccess() {
    return adminAccess;
  }

  public void setAdminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
  }


  public V1beta2ExactDeviceRequest allocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

  /**
   * AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This request is for all of the matching devices in a pool.   At least one device must exist on the node for the allocation to succeed.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
   * @return allocationMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This request is for all of the matching devices in a pool.   At least one device must exist on the node for the allocation to succeed.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.")
  public String getAllocationMode() {
    return allocationMode;
  }

  public void setAllocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1beta2ExactDeviceRequest capacity(@jakarta.annotation.Nullable V1beta2CapacityRequirements capacity) {
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


  public V1beta2ExactDeviceRequest count(@jakarta.annotation.Nullable Long count) {
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


  public V1beta2ExactDeviceRequest deviceClassName(@jakarta.annotation.Nonnull String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

  /**
   * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.  A DeviceClassName is required.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
   * @return deviceClassName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.  A DeviceClassName is required.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.")
  public String getDeviceClassName() {
    return deviceClassName;
  }

  public void setDeviceClassName(@jakarta.annotation.Nonnull String deviceClassName) {
    this.deviceClassName = deviceClassName;
  }


  public V1beta2ExactDeviceRequest selectors(@jakarta.annotation.Nullable List<V1beta2DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1beta2ExactDeviceRequest addSelectorsItem(V1beta2DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

  /**
   * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.")
  public List<V1beta2DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(@jakarta.annotation.Nullable List<V1beta2DeviceSelector> selectors) {
    this.selectors = selectors;
  }


  public V1beta2ExactDeviceRequest tolerations(@jakarta.annotation.Nullable List<V1beta2DeviceToleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1beta2ExactDeviceRequest addTolerationsItem(V1beta2DeviceToleration tolerationsItem) {
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
    V1beta2ExactDeviceRequest v1beta2ExactDeviceRequest = (V1beta2ExactDeviceRequest) o;
    return Objects.equals(this.adminAccess, v1beta2ExactDeviceRequest.adminAccess) &&
        Objects.equals(this.allocationMode, v1beta2ExactDeviceRequest.allocationMode) &&
        Objects.equals(this.capacity, v1beta2ExactDeviceRequest.capacity) &&
        Objects.equals(this.count, v1beta2ExactDeviceRequest.count) &&
        Objects.equals(this.deviceClassName, v1beta2ExactDeviceRequest.deviceClassName) &&
        Objects.equals(this.selectors, v1beta2ExactDeviceRequest.selectors) &&
        Objects.equals(this.tolerations, v1beta2ExactDeviceRequest.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccess, allocationMode, capacity, count, deviceClassName, selectors, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2ExactDeviceRequest {\n");
    sb.append("    adminAccess: ").append(toIndentedString(adminAccess)).append("\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceClassName: ").append(toIndentedString(deviceClassName)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("adminAccess", "allocationMode", "capacity", "count", "deviceClassName", "selectors", "tolerations"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("deviceClassName"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2ExactDeviceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2ExactDeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1beta2ExactDeviceRequest is not found in the empty JSON string", V1beta2ExactDeviceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2ExactDeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta2ExactDeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta2ExactDeviceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("allocationMode") != null && !jsonObj.get("allocationMode").isJsonNull()) && !jsonObj.get("allocationMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `allocationMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocationMode").toString()));
      }
      // validate the optional field `capacity`
      if (jsonObj.get("capacity") != null && !jsonObj.get("capacity").isJsonNull()) {
        V1beta2CapacityRequirements.validateJsonElement(jsonObj.get("capacity"));
      }
      if (!jsonObj.get("deviceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `deviceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceClassName").toString()));
      }
      if (jsonObj.get("selectors") != null && !jsonObj.get("selectors").isJsonNull()) {
        JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
        if (jsonArrayselectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
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
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
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
       if (!V1beta2ExactDeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2ExactDeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2ExactDeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2ExactDeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2ExactDeviceRequest>() {
           @Override
           public void write(JsonWriter out, V1beta2ExactDeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2ExactDeviceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2ExactDeviceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2ExactDeviceRequest
   * @throws IOException if the JSON string is invalid with respect to V1beta2ExactDeviceRequest
   */
  public static V1beta2ExactDeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2ExactDeviceRequest.class);
  }

  /**
   * Convert an instance of V1beta2ExactDeviceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
