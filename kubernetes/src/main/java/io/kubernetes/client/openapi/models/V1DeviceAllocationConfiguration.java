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
import io.kubernetes.client.openapi.models.V1OpaqueDeviceConfiguration;
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
 * DeviceAllocationConfiguration gets embedded in an AllocationResult.
 */
@ApiModel(description = "DeviceAllocationConfiguration gets embedded in an AllocationResult.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DeviceAllocationConfiguration {
  public static final String SERIALIZED_NAME_OPAQUE = "opaque";
  @SerializedName(SERIALIZED_NAME_OPAQUE)
  @jakarta.annotation.Nullable
  private V1OpaqueDeviceConfiguration opaque;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  @jakarta.annotation.Nullable
  private List<String> requests = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  @jakarta.annotation.Nonnull
  private String source;

  public V1DeviceAllocationConfiguration() {
  }

  public V1DeviceAllocationConfiguration opaque(@jakarta.annotation.Nullable V1OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

  /**
   * Get opaque
   * @return opaque
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1OpaqueDeviceConfiguration getOpaque() {
    return opaque;
  }

  public void setOpaque(@jakarta.annotation.Nullable V1OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
  }


  public V1DeviceAllocationConfiguration requests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
    return this;
  }

  public V1DeviceAllocationConfiguration addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format &lt;main request&gt;[/&lt;subrequest&gt;]. If just the main request is given, the configuration applies to all subrequests.
   * @return requests
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.  References to subrequests must include the name of the main request and may include the subrequest using the format <main request>[/<subrequest>]. If just the main request is given, the configuration applies to all subrequests.")
  public List<String> getRequests() {
    return requests;
  }

  public void setRequests(@jakarta.annotation.Nullable List<String> requests) {
    this.requests = requests;
  }


  public V1DeviceAllocationConfiguration source(@jakarta.annotation.Nonnull String source) {
    this.source = source;
    return this;
  }

  /**
   * Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim.
   * @return source
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim.")
  public String getSource() {
    return source;
  }

  public void setSource(@jakarta.annotation.Nonnull String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DeviceAllocationConfiguration v1DeviceAllocationConfiguration = (V1DeviceAllocationConfiguration) o;
    return Objects.equals(this.opaque, v1DeviceAllocationConfiguration.opaque) &&
        Objects.equals(this.requests, v1DeviceAllocationConfiguration.requests) &&
        Objects.equals(this.source, v1DeviceAllocationConfiguration.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opaque, requests, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DeviceAllocationConfiguration {\n");
    sb.append("    opaque: ").append(toIndentedString(opaque)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DeviceAllocationConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DeviceAllocationConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DeviceAllocationConfiguration is not found in the empty JSON string", V1DeviceAllocationConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DeviceAllocationConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DeviceAllocationConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DeviceAllocationConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `opaque`
      if (jsonObj.get("opaque") != null && !jsonObj.get("opaque").isJsonNull()) {
        V1OpaqueDeviceConfiguration.validateJsonElement(jsonObj.get("opaque"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requests") != null && !jsonObj.get("requests").isJsonNull() && !jsonObj.get("requests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requests` to be an array in the JSON string but got `%s`", jsonObj.get("requests").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DeviceAllocationConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DeviceAllocationConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DeviceAllocationConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DeviceAllocationConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DeviceAllocationConfiguration>() {
           @Override
           public void write(JsonWriter out, V1DeviceAllocationConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DeviceAllocationConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DeviceAllocationConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DeviceAllocationConfiguration
   * @throws IOException if the JSON string is invalid with respect to V1DeviceAllocationConfiguration
   */
  public static V1DeviceAllocationConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DeviceAllocationConfiguration.class);
  }

  /**
   * Convert an instance of V1DeviceAllocationConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
