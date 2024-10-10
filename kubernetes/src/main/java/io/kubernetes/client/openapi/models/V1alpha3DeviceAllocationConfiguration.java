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
import io.kubernetes.client.openapi.models.V1alpha3OpaqueDeviceConfiguration;
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
 * DeviceAllocationConfiguration gets embedded in an AllocationResult.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceAllocationConfiguration {
  public static final String SERIALIZED_NAME_OPAQUE = "opaque";
  @SerializedName(SERIALIZED_NAME_OPAQUE)
  private V1alpha3OpaqueDeviceConfiguration opaque;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private List<String> requests = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public V1alpha3DeviceAllocationConfiguration() {
  }

  public V1alpha3DeviceAllocationConfiguration opaque(V1alpha3OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
    return this;
  }

   /**
   * Get opaque
   * @return opaque
  **/
  @jakarta.annotation.Nullable
  public V1alpha3OpaqueDeviceConfiguration getOpaque() {
    return opaque;
  }

  public void setOpaque(V1alpha3OpaqueDeviceConfiguration opaque) {
    this.opaque = opaque;
  }


  public V1alpha3DeviceAllocationConfiguration requests(List<String> requests) {
    this.requests = requests;
    return this;
  }

  public V1alpha3DeviceAllocationConfiguration addRequestsItem(String requestsItem) {
    if (this.requests == null) {
      this.requests = new ArrayList<>();
    }
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Requests lists the names of requests where the configuration applies. If empty, its applies to all requests.
   * @return requests
  **/
  @jakarta.annotation.Nullable
  public List<String> getRequests() {
    return requests;
  }

  public void setRequests(List<String> requests) {
    this.requests = requests;
  }


  public V1alpha3DeviceAllocationConfiguration source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source records whether the configuration comes from a class and thus is not something that a normal user would have been able to set or from a claim.
   * @return source
  **/
  @jakarta.annotation.Nonnull
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
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
    V1alpha3DeviceAllocationConfiguration v1alpha3DeviceAllocationConfiguration = (V1alpha3DeviceAllocationConfiguration) o;
    return Objects.equals(this.opaque, v1alpha3DeviceAllocationConfiguration.opaque) &&
        Objects.equals(this.requests, v1alpha3DeviceAllocationConfiguration.requests) &&
        Objects.equals(this.source, v1alpha3DeviceAllocationConfiguration.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opaque, requests, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceAllocationConfiguration {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceAllocationConfiguration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceAllocationConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceAllocationConfiguration is not found in the empty JSON string", V1alpha3DeviceAllocationConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceAllocationConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceAllocationConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3DeviceAllocationConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `opaque`
      if (jsonObj.get("opaque") != null && !jsonObj.get("opaque").isJsonNull()) {
        V1alpha3OpaqueDeviceConfiguration.validateJsonElement(jsonObj.get("opaque"));
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
       if (!V1alpha3DeviceAllocationConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceAllocationConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceAllocationConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceAllocationConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceAllocationConfiguration>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceAllocationConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceAllocationConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceAllocationConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceAllocationConfiguration
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceAllocationConfiguration
  */
  public static V1alpha3DeviceAllocationConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceAllocationConfiguration.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceAllocationConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
