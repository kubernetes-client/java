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
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationConfiguration;
import io.kubernetes.client.openapi.models.V1alpha3DeviceRequestAllocationResult;
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
 * DeviceAllocationResult is the result of allocating devices.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceAllocationResult {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<V1alpha3DeviceAllocationConfiguration> config = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<V1alpha3DeviceRequestAllocationResult> results = new ArrayList<>();

  public V1alpha3DeviceAllocationResult() {
  }

  public V1alpha3DeviceAllocationResult config(List<V1alpha3DeviceAllocationConfiguration> config) {
    this.config = config;
    return this;
  }

  public V1alpha3DeviceAllocationResult addConfigItem(V1alpha3DeviceAllocationConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters.
   * @return config
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3DeviceAllocationConfiguration> getConfig() {
    return config;
  }

  public void setConfig(List<V1alpha3DeviceAllocationConfiguration> config) {
    this.config = config;
  }


  public V1alpha3DeviceAllocationResult results(List<V1alpha3DeviceRequestAllocationResult> results) {
    this.results = results;
    return this;
  }

  public V1alpha3DeviceAllocationResult addResultsItem(V1alpha3DeviceRequestAllocationResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Results lists all allocated devices.
   * @return results
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3DeviceRequestAllocationResult> getResults() {
    return results;
  }

  public void setResults(List<V1alpha3DeviceRequestAllocationResult> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceAllocationResult v1alpha3DeviceAllocationResult = (V1alpha3DeviceAllocationResult) o;
    return Objects.equals(this.config, v1alpha3DeviceAllocationResult.config) &&
        Objects.equals(this.results, v1alpha3DeviceAllocationResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceAllocationResult {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceAllocationResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceAllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceAllocationResult is not found in the empty JSON string", V1alpha3DeviceAllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceAllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceAllocationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        JsonArray jsonArrayconfig = jsonObj.getAsJsonArray("config");
        if (jsonArrayconfig != null) {
          // ensure the json data is an array
          if (!jsonObj.get("config").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `config` to be an array in the JSON string but got `%s`", jsonObj.get("config").toString()));
          }

          // validate the optional field `config` (array)
          for (int i = 0; i < jsonArrayconfig.size(); i++) {
            V1alpha3DeviceAllocationConfiguration.validateJsonElement(jsonArrayconfig.get(i));
          };
        }
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            V1alpha3DeviceRequestAllocationResult.validateJsonElement(jsonArrayresults.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceAllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceAllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceAllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceAllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceAllocationResult>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceAllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceAllocationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceAllocationResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceAllocationResult
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceAllocationResult
  */
  public static V1alpha3DeviceAllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceAllocationResult.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceAllocationResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
