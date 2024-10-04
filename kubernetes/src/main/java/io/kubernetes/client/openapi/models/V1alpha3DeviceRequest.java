/*
Copyright 2024 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1alpha3DeviceSelector;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices.  A DeviceClassName is currently required. Clients must check that it is indeed set. It&#39;s absence indicates that something changed in a way that is not supported by the client yet, in which case it must refuse to handle the request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceRequest {
  public static final String SERIALIZED_NAME_ADMIN_ACCESS = "adminAccess";
  @SerializedName(SERIALIZED_NAME_ADMIN_ACCESS)
  private Boolean adminAccess;

  public static final String SERIALIZED_NAME_ALLOCATION_MODE = "allocationMode";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_MODE)
  private String allocationMode;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_DEVICE_CLASS_NAME = "deviceClassName";
  @SerializedName(SERIALIZED_NAME_DEVICE_CLASS_NAME)
  private String deviceClassName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<V1alpha3DeviceSelector> selectors = new ArrayList<>();

  public V1alpha3DeviceRequest() {
  }

  public V1alpha3DeviceRequest adminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

   /**
   * AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.
   * @return adminAccess
  **/
  @jakarta.annotation.Nullable
  public Boolean getAdminAccess() {
    return adminAccess;
  }

  public void setAdminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
  }


  public V1alpha3DeviceRequest allocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

   /**
   * AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:  - ExactCount: This request is for a specific number of devices.   This is the default. The exact number is provided in the   count field.  - All: This request is for all of the matching devices in a pool.   Allocation will fail if some devices are already allocated,   unless adminAccess is requested.  If AlloctionMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.  More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
   * @return allocationMode
  **/
  @jakarta.annotation.Nullable
  public String getAllocationMode() {
    return allocationMode;
  }

  public void setAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
  }


  public V1alpha3DeviceRequest count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Count is used only when the count mode is \&quot;ExactCount\&quot;. Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
   * @return count
  **/
  @jakarta.annotation.Nullable
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  public V1alpha3DeviceRequest deviceClassName(String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

   /**
   * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.  A class is required. Which classes are available depends on the cluster.  Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
   * @return deviceClassName
  **/
  @jakarta.annotation.Nonnull
  public String getDeviceClassName() {
    return deviceClassName;
  }

  public void setDeviceClassName(String deviceClassName) {
    this.deviceClassName = deviceClassName;
  }


  public V1alpha3DeviceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.  Must be a DNS label.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1alpha3DeviceRequest selectors(List<V1alpha3DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1alpha3DeviceRequest addSelectorsItem(V1alpha3DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.
   * @return selectors
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(List<V1alpha3DeviceSelector> selectors) {
    this.selectors = selectors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceRequest v1alpha3DeviceRequest = (V1alpha3DeviceRequest) o;
    return Objects.equals(this.adminAccess, v1alpha3DeviceRequest.adminAccess) &&
        Objects.equals(this.allocationMode, v1alpha3DeviceRequest.allocationMode) &&
        Objects.equals(this.count, v1alpha3DeviceRequest.count) &&
        Objects.equals(this.deviceClassName, v1alpha3DeviceRequest.deviceClassName) &&
        Objects.equals(this.name, v1alpha3DeviceRequest.name) &&
        Objects.equals(this.selectors, v1alpha3DeviceRequest.selectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccess, allocationMode, count, deviceClassName, name, selectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceRequest {\n");
    sb.append("    adminAccess: ").append(toIndentedString(adminAccess)).append("\n");
    sb.append("    allocationMode: ").append(toIndentedString(allocationMode)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceClassName: ").append(toIndentedString(deviceClassName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
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
    openapiFields.add("adminAccess");
    openapiFields.add("allocationMode");
    openapiFields.add("count");
    openapiFields.add("deviceClassName");
    openapiFields.add("name");
    openapiFields.add("selectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deviceClassName");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceRequest is not found in the empty JSON string", V1alpha3DeviceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3DeviceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("allocationMode") != null && !jsonObj.get("allocationMode").isJsonNull()) && !jsonObj.get("allocationMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocationMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocationMode").toString()));
      }
      if (!jsonObj.get("deviceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceClassName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("selectors") != null && !jsonObj.get("selectors").isJsonNull()) {
        JsonArray jsonArrayselectors = jsonObj.getAsJsonArray("selectors");
        if (jsonArrayselectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("selectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `selectors` to be an array in the JSON string but got `%s`", jsonObj.get("selectors").toString()));
          }

          // validate the optional field `selectors` (array)
          for (int i = 0; i < jsonArrayselectors.size(); i++) {
            V1alpha3DeviceSelector.validateJsonElement(jsonArrayselectors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceRequest>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceRequest
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceRequest
  */
  public static V1alpha3DeviceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceRequest.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
