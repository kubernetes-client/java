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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1DeviceToleration;
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
import java.util.Locale;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceRequestAllocationResult contains the allocation result for one request.
 */
@ApiModel(description = "DeviceRequestAllocationResult contains the allocation result for one request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-11-21T03:25:56.836812Z[Etc/UTC]", comments = "Generator version: 7.16.0")
public class V1DeviceRequestAllocationResult {
  public static final String SERIALIZED_NAME_ADMIN_ACCESS = "adminAccess";
  @SerializedName(SERIALIZED_NAME_ADMIN_ACCESS)
  @jakarta.annotation.Nullable
  private Boolean adminAccess;

  public static final String SERIALIZED_NAME_BINDING_CONDITIONS = "bindingConditions";
  @SerializedName(SERIALIZED_NAME_BINDING_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<String> bindingConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_BINDING_FAILURE_CONDITIONS = "bindingFailureConditions";
  @SerializedName(SERIALIZED_NAME_BINDING_FAILURE_CONDITIONS)
  @jakarta.annotation.Nullable
  private List<String> bindingFailureConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONSUMED_CAPACITY = "consumedCapacity";
  @SerializedName(SERIALIZED_NAME_CONSUMED_CAPACITY)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> consumedCapacity = new HashMap<>();

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  @jakarta.annotation.Nonnull
  private String device;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  @jakarta.annotation.Nonnull
  private String pool;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  @jakarta.annotation.Nonnull
  private String request;

  public static final String SERIALIZED_NAME_SHARE_I_D = "shareID";
  @SerializedName(SERIALIZED_NAME_SHARE_I_D)
  @jakarta.annotation.Nullable
  private String shareID;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  @jakarta.annotation.Nullable
  private List<V1DeviceToleration> tolerations = new ArrayList<>();

  public V1DeviceRequestAllocationResult() {
  }

  public V1DeviceRequestAllocationResult adminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

  /**
   * AdminAccess indicates that this device was allocated for administrative access. See the corresponding request field for a definition of mode.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.
   * @return adminAccess
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AdminAccess indicates that this device was allocated for administrative access. See the corresponding request field for a definition of mode.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.")
  public Boolean getAdminAccess() {
    return adminAccess;
  }

  public void setAdminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
  }


  public V1DeviceRequestAllocationResult bindingConditions(@jakarta.annotation.Nullable List<String> bindingConditions) {
    this.bindingConditions = bindingConditions;
    return this;
  }

  public V1DeviceRequestAllocationResult addBindingConditionsItem(String bindingConditionsItem) {
    if (this.bindingConditions == null) {
      this.bindingConditions = new ArrayList<>();
    }
    this.bindingConditions.add(bindingConditionsItem);
    return this;
  }

  /**
   * BindingConditions contains a copy of the BindingConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.
   * @return bindingConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BindingConditions contains a copy of the BindingConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.")
  public List<String> getBindingConditions() {
    return bindingConditions;
  }

  public void setBindingConditions(@jakarta.annotation.Nullable List<String> bindingConditions) {
    this.bindingConditions = bindingConditions;
  }


  public V1DeviceRequestAllocationResult bindingFailureConditions(@jakarta.annotation.Nullable List<String> bindingFailureConditions) {
    this.bindingFailureConditions = bindingFailureConditions;
    return this;
  }

  public V1DeviceRequestAllocationResult addBindingFailureConditionsItem(String bindingFailureConditionsItem) {
    if (this.bindingFailureConditions == null) {
      this.bindingFailureConditions = new ArrayList<>();
    }
    this.bindingFailureConditions.add(bindingFailureConditionsItem);
    return this;
  }

  /**
   * BindingFailureConditions contains a copy of the BindingFailureConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.
   * @return bindingFailureConditions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "BindingFailureConditions contains a copy of the BindingFailureConditions from the corresponding ResourceSlice at the time of allocation.  This is an alpha field and requires enabling the DRADeviceBindingConditions and DRAResourceClaimDeviceStatus feature gates.")
  public List<String> getBindingFailureConditions() {
    return bindingFailureConditions;
  }

  public void setBindingFailureConditions(@jakarta.annotation.Nullable List<String> bindingFailureConditions) {
    this.bindingFailureConditions = bindingFailureConditions;
  }


  public V1DeviceRequestAllocationResult consumedCapacity(@jakarta.annotation.Nullable Map<String, Quantity> consumedCapacity) {
    this.consumedCapacity = consumedCapacity;
    return this;
  }

  public V1DeviceRequestAllocationResult putConsumedCapacityItem(String key, Quantity consumedCapacityItem) {
    if (this.consumedCapacity == null) {
      this.consumedCapacity = new HashMap<>();
    }
    this.consumedCapacity.put(key, consumedCapacityItem);
    return this;
  }

  /**
   * ConsumedCapacity tracks the amount of capacity consumed per device as part of the claim request. The consumed amount may differ from the requested amount: it is rounded up to the nearest valid value based on the device’s requestPolicy if applicable (i.e., may not be less than the requested amount).  The total consumed capacity for each device must not exceed the DeviceCapacity&#39;s Value.  This field is populated only for devices that allow multiple allocations. All capacity entries are included, even if the consumed amount is zero.
   * @return consumedCapacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ConsumedCapacity tracks the amount of capacity consumed per device as part of the claim request. The consumed amount may differ from the requested amount: it is rounded up to the nearest valid value based on the device’s requestPolicy if applicable (i.e., may not be less than the requested amount).  The total consumed capacity for each device must not exceed the DeviceCapacity's Value.  This field is populated only for devices that allow multiple allocations. All capacity entries are included, even if the consumed amount is zero.")
  public Map<String, Quantity> getConsumedCapacity() {
    return consumedCapacity;
  }

  public void setConsumedCapacity(@jakarta.annotation.Nullable Map<String, Quantity> consumedCapacity) {
    this.consumedCapacity = consumedCapacity;
  }


  public V1DeviceRequestAllocationResult device(@jakarta.annotation.Nonnull String device) {
    this.device = device;
    return this;
  }

  /**
   * Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label.
   * @return device
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Device references one device instance via its name in the driver's resource pool. It must be a DNS label.")
  public String getDevice() {
    return device;
  }

  public void setDevice(@jakarta.annotation.Nonnull String device) {
    this.device = device;
  }


  public V1DeviceRequestAllocationResult driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1DeviceRequestAllocationResult pool(@jakarta.annotation.Nonnull String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
   * @return pool
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This name together with the driver name and the device name field identify which device was allocated (`<driver name>/<pool name>/<device name>`).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.")
  public String getPool() {
    return pool;
  }

  public void setPool(@jakarta.annotation.Nonnull String pool) {
    this.pool = pool;
  }


  public V1DeviceRequestAllocationResult request(@jakarta.annotation.Nonnull String request) {
    this.request = request;
    return this;
  }

  /**
   * Request is the name of the request in the claim which caused this device to be allocated. If it references a subrequest in the firstAvailable list on a DeviceRequest, this field must include both the name of the main request and the subrequest using the format &lt;main request&gt;/&lt;subrequest&gt;.  Multiple devices may have been allocated per request.
   * @return request
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request is the name of the request in the claim which caused this device to be allocated. If it references a subrequest in the firstAvailable list on a DeviceRequest, this field must include both the name of the main request and the subrequest using the format <main request>/<subrequest>.  Multiple devices may have been allocated per request.")
  public String getRequest() {
    return request;
  }

  public void setRequest(@jakarta.annotation.Nonnull String request) {
    this.request = request;
  }


  public V1DeviceRequestAllocationResult shareID(@jakarta.annotation.Nullable String shareID) {
    this.shareID = shareID;
    return this;
  }

  /**
   * ShareID uniquely identifies an individual allocation share of the device, used when the device supports multiple simultaneous allocations. It serves as an additional map key to differentiate concurrent shares of the same device.
   * @return shareID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ShareID uniquely identifies an individual allocation share of the device, used when the device supports multiple simultaneous allocations. It serves as an additional map key to differentiate concurrent shares of the same device.")
  public String getShareID() {
    return shareID;
  }

  public void setShareID(@jakarta.annotation.Nullable String shareID) {
    this.shareID = shareID;
  }


  public V1DeviceRequestAllocationResult tolerations(@jakarta.annotation.Nullable List<V1DeviceToleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1DeviceRequestAllocationResult addTolerationsItem(V1DeviceToleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * A copy of all tolerations specified in the request at the time when the device got allocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.
   * @return tolerations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A copy of all tolerations specified in the request at the time when the device got allocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.")
  public List<V1DeviceToleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(@jakarta.annotation.Nullable List<V1DeviceToleration> tolerations) {
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
    V1DeviceRequestAllocationResult v1DeviceRequestAllocationResult = (V1DeviceRequestAllocationResult) o;
    return Objects.equals(this.adminAccess, v1DeviceRequestAllocationResult.adminAccess) &&
        Objects.equals(this.bindingConditions, v1DeviceRequestAllocationResult.bindingConditions) &&
        Objects.equals(this.bindingFailureConditions, v1DeviceRequestAllocationResult.bindingFailureConditions) &&
        Objects.equals(this.consumedCapacity, v1DeviceRequestAllocationResult.consumedCapacity) &&
        Objects.equals(this.device, v1DeviceRequestAllocationResult.device) &&
        Objects.equals(this.driver, v1DeviceRequestAllocationResult.driver) &&
        Objects.equals(this.pool, v1DeviceRequestAllocationResult.pool) &&
        Objects.equals(this.request, v1DeviceRequestAllocationResult.request) &&
        Objects.equals(this.shareID, v1DeviceRequestAllocationResult.shareID) &&
        Objects.equals(this.tolerations, v1DeviceRequestAllocationResult.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccess, bindingConditions, bindingFailureConditions, consumedCapacity, device, driver, pool, request, shareID, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceRequestAllocationResult {\n");
    sb.append("    adminAccess: ").append(toIndentedString(adminAccess)).append("\n");
    sb.append("    bindingConditions: ").append(toIndentedString(bindingConditions)).append("\n");
    sb.append("    bindingFailureConditions: ").append(toIndentedString(bindingFailureConditions)).append("\n");
    sb.append("    consumedCapacity: ").append(toIndentedString(consumedCapacity)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    shareID: ").append(toIndentedString(shareID)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("adminAccess", "bindingConditions", "bindingFailureConditions", "consumedCapacity", "device", "driver", "pool", "request", "shareID", "tolerations"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("device", "driver", "pool", "request"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeviceRequestAllocationResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeviceRequestAllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field(s) %s in V1DeviceRequestAllocationResult is not found in the empty JSON string", V1DeviceRequestAllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeviceRequestAllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1DeviceRequestAllocationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DeviceRequestAllocationResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("bindingConditions") != null && !jsonObj.get("bindingConditions").isJsonNull() && !jsonObj.get("bindingConditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `bindingConditions` to be an array in the JSON string but got `%s`", jsonObj.get("bindingConditions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bindingFailureConditions") != null && !jsonObj.get("bindingFailureConditions").isJsonNull() && !jsonObj.get("bindingFailureConditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `bindingFailureConditions` to be an array in the JSON string but got `%s`", jsonObj.get("bindingFailureConditions").toString()));
      }
      if (!jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if (!jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if (!jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      if ((jsonObj.get("shareID") != null && !jsonObj.get("shareID").isJsonNull()) && !jsonObj.get("shareID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(Locale.ROOT, "Expected the field `shareID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shareID").toString()));
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
            V1DeviceToleration.validateJsonElement(jsonArraytolerations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeviceRequestAllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeviceRequestAllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeviceRequestAllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeviceRequestAllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeviceRequestAllocationResult>() {
           @Override
           public void write(JsonWriter out, V1DeviceRequestAllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeviceRequestAllocationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeviceRequestAllocationResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeviceRequestAllocationResult
   * @throws IOException if the JSON string is invalid with respect to V1DeviceRequestAllocationResult
   */
  public static V1DeviceRequestAllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeviceRequestAllocationResult.class);
  }

  /**
   * Convert an instance of V1DeviceRequestAllocationResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
