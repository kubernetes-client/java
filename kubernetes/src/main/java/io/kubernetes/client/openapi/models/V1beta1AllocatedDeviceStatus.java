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
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1beta1NetworkDeviceData;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * AllocatedDeviceStatus contains the status of an allocated device, if the driver chooses to report it. This may include driver-specific information.
 */
@ApiModel(description = "AllocatedDeviceStatus contains the status of an allocated device, if the driver chooses to report it. This may include driver-specific information.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:15:49.397498Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1beta1AllocatedDeviceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1Condition> conditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_NETWORK_DATA = "networkData";
  @SerializedName(SERIALIZED_NAME_NETWORK_DATA)
  private V1beta1NetworkDeviceData networkData;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public V1beta1AllocatedDeviceStatus() {
  }

  public V1beta1AllocatedDeviceStatus conditions(List<V1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1beta1AllocatedDeviceStatus addConditionsItem(V1Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions contains the latest observation of the device&#39;s state. If the device has been configured according to the class and claim config references, the &#x60;Ready&#x60; condition should be True.
   * @return conditions
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Conditions contains the latest observation of the device's state. If the device has been configured according to the class and claim config references, the `Ready` condition should be True.")
  public List<V1Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1Condition> conditions) {
    this.conditions = conditions;
  }


  public V1beta1AllocatedDeviceStatus data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Data contains arbitrary driver-specific data.  The length of the raw data must be smaller or equal to 10 Ki.
   * @return data
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Data contains arbitrary driver-specific data.  The length of the raw data must be smaller or equal to 10 Ki.")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  public V1beta1AllocatedDeviceStatus device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label.
   * @return device
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Device references one device instance via its name in the driver's resource pool. It must be a DNS label.")
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public V1beta1AllocatedDeviceStatus driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   * @return driver
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1beta1AllocatedDeviceStatus networkData(V1beta1NetworkDeviceData networkData) {
    this.networkData = networkData;
    return this;
  }

   /**
   * Get networkData
   * @return networkData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1NetworkDeviceData getNetworkData() {
    return networkData;
  }

  public void setNetworkData(V1beta1NetworkDeviceData networkData) {
    this.networkData = networkData;
  }


  public V1beta1AllocatedDeviceStatus pool(String pool) {
    this.pool = pool;
    return this;
  }

   /**
   * This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
   * @return pool
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This name together with the driver name and the device name field identify which device was allocated (`<driver name>/<pool name>/<device name>`).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1AllocatedDeviceStatus v1beta1AllocatedDeviceStatus = (V1beta1AllocatedDeviceStatus) o;
    return Objects.equals(this.conditions, v1beta1AllocatedDeviceStatus.conditions) &&
        Objects.equals(this.data, v1beta1AllocatedDeviceStatus.data) &&
        Objects.equals(this.device, v1beta1AllocatedDeviceStatus.device) &&
        Objects.equals(this.driver, v1beta1AllocatedDeviceStatus.driver) &&
        Objects.equals(this.networkData, v1beta1AllocatedDeviceStatus.networkData) &&
        Objects.equals(this.pool, v1beta1AllocatedDeviceStatus.pool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, data, device, driver, networkData, pool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1AllocatedDeviceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    networkData: ").append(toIndentedString(networkData)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("data");
    openapiFields.add("device");
    openapiFields.add("driver");
    openapiFields.add("networkData");
    openapiFields.add("pool");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("pool");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1beta1AllocatedDeviceStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1AllocatedDeviceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1AllocatedDeviceStatus is not found in the empty JSON string", V1beta1AllocatedDeviceStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1AllocatedDeviceStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1AllocatedDeviceStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1AllocatedDeviceStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            V1Condition.validateJsonElement(jsonArrayconditions.get(i));
          };
        }
      }
      if (!jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      // validate the optional field `networkData`
      if (jsonObj.get("networkData") != null && !jsonObj.get("networkData").isJsonNull()) {
        V1beta1NetworkDeviceData.validateJsonElement(jsonObj.get("networkData"));
      }
      if (!jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1AllocatedDeviceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1AllocatedDeviceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1AllocatedDeviceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1AllocatedDeviceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1AllocatedDeviceStatus>() {
           @Override
           public void write(JsonWriter out, V1beta1AllocatedDeviceStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1AllocatedDeviceStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1AllocatedDeviceStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1AllocatedDeviceStatus
  * @throws IOException if the JSON string is invalid with respect to V1beta1AllocatedDeviceStatus
  */
  public static V1beta1AllocatedDeviceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1AllocatedDeviceStatus.class);
  }

 /**
  * Convert an instance of V1beta1AllocatedDeviceStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
