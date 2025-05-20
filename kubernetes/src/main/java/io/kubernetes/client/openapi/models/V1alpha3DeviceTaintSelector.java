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
import io.kubernetes.client.openapi.models.V1alpha3DeviceSelector;
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
 * DeviceTaintSelector defines which device(s) a DeviceTaintRule applies to. The empty selector matches all devices. Without a selector, no devices are matched.
 */
@ApiModel(description = "DeviceTaintSelector defines which device(s) a DeviceTaintRule applies to. The empty selector matches all devices. Without a selector, no devices are matched.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha3DeviceTaintSelector {
  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  @jakarta.annotation.Nullable
  private String device;

  public static final String SERIALIZED_NAME_DEVICE_CLASS_NAME = "deviceClassName";
  @SerializedName(SERIALIZED_NAME_DEVICE_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String deviceClassName;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nullable
  private String driver;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  @jakarta.annotation.Nullable
  private String pool;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  @jakarta.annotation.Nullable
  private List<V1alpha3DeviceSelector> selectors = new ArrayList<>();

  public V1alpha3DeviceTaintSelector() {
  }

  public V1alpha3DeviceTaintSelector device(@jakarta.annotation.Nullable String device) {
    this.device = device;
    return this;
  }

  /**
   * If device is set, only devices with that name are selected. This field corresponds to slice.spec.devices[].name.  Setting also driver and pool may be required to avoid ambiguity, but is not required.
   * @return device
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If device is set, only devices with that name are selected. This field corresponds to slice.spec.devices[].name.  Setting also driver and pool may be required to avoid ambiguity, but is not required.")
  public String getDevice() {
    return device;
  }

  public void setDevice(@jakarta.annotation.Nullable String device) {
    this.device = device;
  }


  public V1alpha3DeviceTaintSelector deviceClassName(@jakarta.annotation.Nullable String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

  /**
   * If DeviceClassName is set, the selectors defined there must be satisfied by a device to be selected. This field corresponds to class.metadata.name.
   * @return deviceClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If DeviceClassName is set, the selectors defined there must be satisfied by a device to be selected. This field corresponds to class.metadata.name.")
  public String getDeviceClassName() {
    return deviceClassName;
  }

  public void setDeviceClassName(@jakarta.annotation.Nullable String deviceClassName) {
    this.deviceClassName = deviceClassName;
  }


  public V1alpha3DeviceTaintSelector driver(@jakarta.annotation.Nullable String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * If driver is set, only devices from that driver are selected. This fields corresponds to slice.spec.driver.
   * @return driver
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If driver is set, only devices from that driver are selected. This fields corresponds to slice.spec.driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nullable String driver) {
    this.driver = driver;
  }


  public V1alpha3DeviceTaintSelector pool(@jakarta.annotation.Nullable String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * If pool is set, only devices in that pool are selected.  Also setting the driver name may be useful to avoid ambiguity when different drivers use the same pool name, but this is not required because selecting pools from different drivers may also be useful, for example when drivers with node-local devices use the node name as their pool name.
   * @return pool
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If pool is set, only devices in that pool are selected.  Also setting the driver name may be useful to avoid ambiguity when different drivers use the same pool name, but this is not required because selecting pools from different drivers may also be useful, for example when drivers with node-local devices use the node name as their pool name.")
  public String getPool() {
    return pool;
  }

  public void setPool(@jakarta.annotation.Nullable String pool) {
    this.pool = pool;
  }


  public V1alpha3DeviceTaintSelector selectors(@jakarta.annotation.Nullable List<V1alpha3DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1alpha3DeviceTaintSelector addSelectorsItem(V1alpha3DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

  /**
   * Selectors contains the same selection criteria as a ResourceClaim. Currently, CEL expressions are supported. All of these selectors must be satisfied.
   * @return selectors
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Selectors contains the same selection criteria as a ResourceClaim. Currently, CEL expressions are supported. All of these selectors must be satisfied.")
  public List<V1alpha3DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(@jakarta.annotation.Nullable List<V1alpha3DeviceSelector> selectors) {
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
    V1alpha3DeviceTaintSelector v1alpha3DeviceTaintSelector = (V1alpha3DeviceTaintSelector) o;
    return Objects.equals(this.device, v1alpha3DeviceTaintSelector.device) &&
        Objects.equals(this.deviceClassName, v1alpha3DeviceTaintSelector.deviceClassName) &&
        Objects.equals(this.driver, v1alpha3DeviceTaintSelector.driver) &&
        Objects.equals(this.pool, v1alpha3DeviceTaintSelector.pool) &&
        Objects.equals(this.selectors, v1alpha3DeviceTaintSelector.selectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, deviceClassName, driver, pool, selectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceTaintSelector {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceClassName: ").append(toIndentedString(deviceClassName)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
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
    openapiFields.add("device");
    openapiFields.add("deviceClassName");
    openapiFields.add("driver");
    openapiFields.add("pool");
    openapiFields.add("selectors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceTaintSelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceTaintSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceTaintSelector is not found in the empty JSON string", V1alpha3DeviceTaintSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceTaintSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceTaintSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) && !jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if ((jsonObj.get("deviceClassName") != null && !jsonObj.get("deviceClassName").isJsonNull()) && !jsonObj.get("deviceClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceClassName").toString()));
      }
      if ((jsonObj.get("driver") != null && !jsonObj.get("driver").isJsonNull()) && !jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
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
       if (!V1alpha3DeviceTaintSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceTaintSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceTaintSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceTaintSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceTaintSelector>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceTaintSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceTaintSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3DeviceTaintSelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3DeviceTaintSelector
   * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceTaintSelector
   */
  public static V1alpha3DeviceTaintSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceTaintSelector.class);
  }

  /**
   * Convert an instance of V1alpha3DeviceTaintSelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
