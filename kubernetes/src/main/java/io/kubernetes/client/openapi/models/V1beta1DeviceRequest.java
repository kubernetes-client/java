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
import io.kubernetes.client.openapi.models.V1beta1CapacityRequirements;
import io.kubernetes.client.openapi.models.V1beta1DeviceSelector;
import io.kubernetes.client.openapi.models.V1beta1DeviceSubRequest;
import io.kubernetes.client.openapi.models.V1beta1DeviceToleration;
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
 * DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices.
 */
@ApiModel(description = "DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta1DeviceRequest {
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
  private V1beta1CapacityRequirements capacity;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Long count;

  public static final String SERIALIZED_NAME_DEVICE_CLASS_NAME = "deviceClassName";
  @SerializedName(SERIALIZED_NAME_DEVICE_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String deviceClassName;

  public static final String SERIALIZED_NAME_FIRST_AVAILABLE = "firstAvailable";
  @SerializedName(SERIALIZED_NAME_FIRST_AVAILABLE)
  @jakarta.annotation.Nullable
  private List<V1beta1DeviceSubRequest> firstAvailable = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  @jakarta.annotation.Nullable
  private List<V1beta1DeviceSelector> selectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  @jakarta.annotation.Nullable
  private List<V1beta1DeviceToleration> tolerations = new ArrayList<>();

  public V1beta1DeviceRequest() {
  }

  public V1beta1DeviceRequest adminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

  /**
   * AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.
   * @return adminAccess
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.")
  public Boolean getAdminAccess() {
    return adminAccess;
  }

  public void setAdminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
  }


  public V1beta1DeviceRequest allocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

  /**
   * AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This request is for all of the matching devices in a pool.   At least one device must exist on the node for the allocation to succeed.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
   * @return allocationMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This request is for all of the matching devices in a pool.   At least one device must exist on the node for the allocation to succeed.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AllocationMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.")
  public String getAllocationMode() {
    return allocationMode;
  }

  public void setAllocationMode(@jakarta.annotation.Nullable String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1beta1DeviceRequest capacity(@jakarta.annotation.Nullable V1beta1CapacityRequirements capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1CapacityRequirements getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable V1beta1CapacityRequirements capacity) {
    this.capacity = capacity;
  }


  public V1beta1DeviceRequest count(@jakarta.annotation.Nullable Long count) {
    this.count = count;
    return this;
  }

  /**
   * Count is used only when the count mode is \&quot;ExactCount\&quot;. Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.
   * @return count
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Count is used only when the count mode is \"ExactCount\". Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.")
  public Long getCount() {
    return count;
  }

  public void setCount(@jakarta.annotation.Nullable Long count) {
    this.count = count;
  }


  public V1beta1DeviceRequest deviceClassName(@jakarta.annotation.Nullable String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

  /**
   * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.  A class is required if no subrequests are specified in the firstAvailable list and no class can be set if subrequests are specified in the firstAvailable list. Which classes are available depends on the cluster.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
   * @return deviceClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.  A class is required if no subrequests are specified in the firstAvailable list and no class can be set if subrequests are specified in the firstAvailable list. Which classes are available depends on the cluster.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.")
  public String getDeviceClassName() {
    return deviceClassName;
  }

  public void setDeviceClassName(@jakarta.annotation.Nullable String deviceClassName) {
    this.deviceClassName = deviceClassName;
  }


  public V1beta1DeviceRequest firstAvailable(@jakarta.annotation.Nullable List<V1beta1DeviceSubRequest> firstAvailable) {
    this.firstAvailable = firstAvailable;
    return this;
  }

  public V1beta1DeviceRequest addFirstAvailableItem(V1beta1DeviceSubRequest firstAvailableItem) {
    if (this.firstAvailable == null) {
      this.firstAvailable = new ArrayList<>();
    }
    this.firstAvailable.add(firstAvailableItem);
    return this;
  }

  /**
   * FirstAvailable contains subrequests, of which exactly one will be satisfied by the scheduler to satisfy this request. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one cannot be used.  This field may only be set in the entries of DeviceClaim.Requests.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.
   * @return firstAvailable
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "FirstAvailable contains subrequests, of which exactly one will be satisfied by the scheduler to satisfy this request. It tries to satisfy them in the order in which they are listed here. So if there are two entries in the list, the scheduler will only check the second one if it determines that the first one cannot be used.  This field may only be set in the entries of DeviceClaim.Requests.  DRA does not yet implement scoring, so the scheduler will select the first set of devices that satisfies all the requests in the claim. And if the requirements can be satisfied on more than one node, other scheduling features will determine which node is chosen. This means that the set of devices allocated to a claim might not be the optimal set available to the cluster. Scoring will be implemented later.")
  public List<V1beta1DeviceSubRequest> getFirstAvailable() {
    return firstAvailable;
  }

  public void setFirstAvailable(@jakarta.annotation.Nullable List<V1beta1DeviceSubRequest> firstAvailable) {
    this.firstAvailable = firstAvailable;
  }


  public V1beta1DeviceRequest name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  Must be a DNS label and unique among all DeviceRequests in a ResourceClaim.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  Must be a DNS label and unique among all DeviceRequests in a ResourceClaim.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1beta1DeviceRequest selectors(@jakarta.annotation.Nullable List<V1beta1DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1beta1DeviceRequest addSelectorsItem(V1beta1DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

  /**
   * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.")
  public List<V1beta1DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(@jakarta.annotation.Nullable List<V1beta1DeviceSelector> selectors) {
    this.selectors = selectors;
  }


  public V1beta1DeviceRequest tolerations(@jakarta.annotation.Nullable List<V1beta1DeviceToleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1beta1DeviceRequest addTolerationsItem(V1beta1DeviceToleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * If specified, the request&#39;s tolerations.  Tolerations for NoSchedule are required to allocate a device which has a taint with that effect. The same applies to NoExecute.  In addition, should any of the allocated devices get tainted with NoExecute after allocation and that effect is not tolerated, then all pods consuming the ResourceClaim get deleted to evict them. The scheduler will not let new pods reserve the claim while it has these tainted devices. Once all pods are evicted, the claim will get deallocated.  The maximum number of tolerations is 16.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.
   * @return tolerations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, the request's tolerations.  Tolerations for NoSchedule are required to allocate a device which has a taint with that effect. The same applies to NoExecute.  In addition, should any of the allocated devices get tainted with NoExecute after allocation and that effect is not tolerated, then all pods consuming the ResourceClaim get deleted to evict them. The scheduler will not let new pods reserve the claim while it has these tainted devices. Once all pods are evicted, the claim will get deallocated.  The maximum number of tolerations is 16.  This field can only be set when deviceClassName is set and no subrequests are specified in the firstAvailable list.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.")
  public List<V1beta1DeviceToleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(@jakarta.annotation.Nullable List<V1beta1DeviceToleration> tolerations) {
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
    V1beta1DeviceRequest v1beta1DeviceRequest = (V1beta1DeviceRequest) o;
    return Objects.equals(this.adminAccess, v1beta1DeviceRequest.adminAccess) &&
        Objects.equals(this.allocationMode, v1beta1DeviceRequest.allocationMode) &&
        Objects.equals(this.capacity, v1beta1DeviceRequest.capacity) &&
        Objects.equals(this.count, v1beta1DeviceRequest.count) &&
        Objects.equals(this.deviceClassName, v1beta1DeviceRequest.deviceClassName) &&
        Objects.equals(this.firstAvailable, v1beta1DeviceRequest.firstAvailable) &&
        Objects.equals(this.name, v1beta1DeviceRequest.name) &&
        Objects.equals(this.selectors, v1beta1DeviceRequest.selectors) &&
        Objects.equals(this.tolerations, v1beta1DeviceRequest.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccess, allocationMode, capacity, count, deviceClassName, firstAvailable, name, selectors, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DeviceRequest {\n");
    sb.append("    adminAccess: ").append(toIndentedString(adminAccess)).append("\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceClassName: ").append(toIndentedString(deviceClassName)).append("\n");
    sb.append("    firstAvailable: ").append(toIndentedString(firstAvailable)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("adminAccess", "allocationMode", "capacity", "count", "deviceClassName", "firstAvailable", "name", "selectors", "tolerations"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1DeviceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1DeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta1DeviceRequest is not found in the empty JSON string", V1beta1DeviceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1DeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta1DeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1DeviceRequest.openapiRequiredFields) {
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
        V1beta1CapacityRequirements.validateJsonElement(jsonObj.get("capacity"));
      }
      if ((jsonObj.get("deviceClassName") != null && !jsonObj.get("deviceClassName").isJsonNull()) && !jsonObj.get("deviceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `deviceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceClassName").toString()));
      }
      if (jsonObj.get("firstAvailable") != null && !jsonObj.get("firstAvailable").isJsonNull()) {
        JsonArray jsonArrayfirstAvailable = jsonObj.getAsJsonArray("firstAvailable");
        if (jsonArrayfirstAvailable != null) {
          // ensure the json data is an array
          if (!jsonObj.get("firstAvailable").isJsonArray()) {
            throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `firstAvailable` to be an array in the JSON string but got `%s`", jsonObj.get("firstAvailable").toString()));
          }

          // validate the optional field `firstAvailable` (array)
          for (int i = 0; i < jsonArrayfirstAvailable.size(); i++) {
            V1beta1DeviceSubRequest.validateJsonElement(jsonArrayfirstAvailable.get(i));
          };
        }
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
            V1beta1DeviceSelector.validateJsonElement(jsonArrayselectors.get(i));
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
            V1beta1DeviceToleration.validateJsonElement(jsonArraytolerations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1DeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1DeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1DeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1DeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1DeviceRequest>() {
           @Override
           public void write(JsonWriter out, V1beta1DeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1DeviceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1DeviceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1DeviceRequest
   * @throws IOException if the JSON string is invalid with respect to V1beta1DeviceRequest
   */
  public static V1beta1DeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1DeviceRequest.class);
  }

  /**
   * Convert an instance of V1beta1DeviceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
