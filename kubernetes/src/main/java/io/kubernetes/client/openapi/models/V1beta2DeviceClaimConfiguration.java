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
import io.kubernetes.client.openapi.models.V1beta2OpaqueDeviceConfiguration;
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
 * DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.
 */
@ApiModel(description = "DeviceClaimConfiguration is used for configuration parameters in DeviceClaim.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1beta2DeviceClaimConfiguration {
  public static final String SERIALIZED_NAME_OPAQUE = "opaque";
  @SerializedName(SERIALIZED_NAME_OPAQUE)
  @jakarta.annotation.Nullable
  private V1beta2OpaqueDeviceConfiguration opaque;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  @jakarta.annotation.Nullable
  private List<String> requests = new ArrayList<>();

  public V1beta2DeviceClaimConfiguration() {
  }

  public V1beta2DeviceClaimConfiguration opaque(@jakarta.annotation.Nullable V1beta2OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

  /**
   * Get opaque
   * @return opaque
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta2OpaqueDeviceConfiguration getOpaque() {
    return opaque;
  }

  public void setOpaque(@jakarta.annotation.Nullable V1beta2OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
  }


  public V1beta2DeviceClaimConfiguration requests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
    return this;
  }

  public V1beta2DeviceClaimConfiguration addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format &lt;main request&gt;[/&lt;subrequest&gt;]. If just the main request is given, the configuration applies to all subrequests.
   * @return requests
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Requests lists the names of requests where the configuration applies. If empty, it applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format <main request>[/<subrequest>]. If just the main request is given, the configuration applies to all subrequests.")
  public List<String> getRequests() {
    return requests;
  }

  public void setRequests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeviceClaimConfiguration v1beta2DeviceClaimConfiguration = (V1beta2DeviceClaimConfiguration) o;
    return Objects.equals(this.opaque, v1beta2DeviceClaimConfiguration.opaque) &&
        Objects.equals(this.requests, v1beta2DeviceClaimConfiguration.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opaque, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeviceClaimConfiguration {\n");
    sb.append("    opaque: ").append(toIndentedString(opaque)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
    openapiFields.add("opaque");
    openapiFields.add("requests");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta2DeviceClaimConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta2DeviceClaimConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta2DeviceClaimConfiguration is not found in the empty JSON string", V1beta2DeviceClaimConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta2DeviceClaimConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta2DeviceClaimConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `opaque`
      if (jsonObj.get("opaque") != null && !jsonObj.get("opaque").isJsonNull()) {
        V1beta2OpaqueDeviceConfiguration.validateJsonElement(jsonObj.get("opaque"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull() && !jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta2DeviceClaimConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta2DeviceClaimConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta2DeviceClaimConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta2DeviceClaimConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta2DeviceClaimConfiguration>() {
           @Override
           public void write(JsonWriter out, V1beta2DeviceClaimConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta2DeviceClaimConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta2DeviceClaimConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta2DeviceClaimConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1beta2DeviceClaimConfiguration
   */
  public static V1beta2DeviceClaimConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta2DeviceClaimConfiguration.class);
  }

  /**
   * Convert an instance of V1beta2DeviceClaimConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
