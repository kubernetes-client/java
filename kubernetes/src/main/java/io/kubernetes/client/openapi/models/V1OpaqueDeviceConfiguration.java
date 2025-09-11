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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * OpaqueDeviceConfiguration contains configuration parameters for a driver in a format defined by the driver vendor.
 */
@ApiModel(description = "OpaqueDeviceConfiguration contains configuration parameters for a driver in a format defined by the driver vendor.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1OpaqueDeviceConfiguration {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  @jakarta.annotation.Nonnull
  private Object parameters;

  public V1OpaqueDeviceConfiguration() {
  }

  public V1OpaqueDeviceConfiguration driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.  An admission policy provided by the driver developer could use this to decide whether it needs to validate them.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver is used to determine which kubelet plugin needs to be passed these configuration parameters.  An admission policy provided by the driver developer could use this to decide whether it needs to validate them.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1OpaqueDeviceConfiguration parameters(@jakarta.annotation.Nonnull Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (\&quot;kind\&quot; + \&quot;apiVersion\&quot; for Kubernetes types), with conversion between different versions.  The length of the raw data must be smaller or equal to 10 Ki.
   * @return parameters
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Parameters can contain arbitrary data. It is the responsibility of the driver developer to handle validation and versioning. Typically this includes self-identification and a version (\"kind\" + \"apiVersion\" for Kubernetes types), with conversion between different versions.  The length of the raw data must be smaller or equal to 10 Ki.")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(@jakarta.annotation.Nonnull Object parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OpaqueDeviceConfiguration v1OpaqueDeviceConfiguration = (V1OpaqueDeviceConfiguration) o;
    return Objects.equals(this.driver, v1OpaqueDeviceConfiguration.driver) &&
        Objects.equals(this.parameters, v1OpaqueDeviceConfiguration.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OpaqueDeviceConfiguration {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("driver");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("parameters");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1OpaqueDeviceConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1OpaqueDeviceConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1OpaqueDeviceConfiguration is not found in the empty JSON string", V1OpaqueDeviceConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1OpaqueDeviceConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1OpaqueDeviceConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1OpaqueDeviceConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1OpaqueDeviceConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1OpaqueDeviceConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1OpaqueDeviceConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1OpaqueDeviceConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1OpaqueDeviceConfiguration>() {
           @Override
           public void write(JsonWriter out, V1OpaqueDeviceConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1OpaqueDeviceConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1OpaqueDeviceConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1OpaqueDeviceConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1OpaqueDeviceConfiguration
   */
  public static V1OpaqueDeviceConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1OpaqueDeviceConfiguration.class);
  }

  /**
   * Convert an instance of V1OpaqueDeviceConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
