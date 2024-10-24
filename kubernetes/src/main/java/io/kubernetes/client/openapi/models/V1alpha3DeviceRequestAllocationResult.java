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
import java.io.IOException;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * DeviceRequestAllocationResult contains the allocation result for one request.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceRequestAllocationResult {
  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public V1alpha3DeviceRequestAllocationResult() {
  }

  public V1alpha3DeviceRequestAllocationResult device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label.
   * @return device
  **/
  @jakarta.annotation.Nonnull
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }


  public V1alpha3DeviceRequestAllocationResult driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   * @return driver
  **/
  @jakarta.annotation.Nonnull
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1alpha3DeviceRequestAllocationResult pool(String pool) {
    this.pool = pool;
    return this;
  }

   /**
   * This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
   * @return pool
  **/
  @jakarta.annotation.Nonnull
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }


  public V1alpha3DeviceRequestAllocationResult request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Request is the name of the request in the claim which caused this device to be allocated. Multiple devices may have been allocated per request.
   * @return request
  **/
  @jakarta.annotation.Nonnull
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceRequestAllocationResult v1alpha3DeviceRequestAllocationResult = (V1alpha3DeviceRequestAllocationResult) o;
    return Objects.equals(this.device, v1alpha3DeviceRequestAllocationResult.device) &&
        Objects.equals(this.driver, v1alpha3DeviceRequestAllocationResult.driver) &&
        Objects.equals(this.pool, v1alpha3DeviceRequestAllocationResult.pool) &&
        Objects.equals(this.request, v1alpha3DeviceRequestAllocationResult.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, driver, pool, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceRequestAllocationResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
    openapiFields.add("driver");
    openapiFields.add("pool");
    openapiFields.add("request");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("pool");
    openapiRequiredFields.add("request");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceRequestAllocationResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceRequestAllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceRequestAllocationResult is not found in the empty JSON string", V1alpha3DeviceRequestAllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceRequestAllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceRequestAllocationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3DeviceRequestAllocationResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if (!jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if (!jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceRequestAllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceRequestAllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceRequestAllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceRequestAllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceRequestAllocationResult>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceRequestAllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceRequestAllocationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceRequestAllocationResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceRequestAllocationResult
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceRequestAllocationResult
  */
  public static V1alpha3DeviceRequestAllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceRequestAllocationResult.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceRequestAllocationResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
