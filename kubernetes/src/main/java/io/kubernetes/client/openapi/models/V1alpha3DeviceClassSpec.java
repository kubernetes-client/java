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
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClassConfiguration;
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
 * DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3DeviceClassSpec {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<V1alpha3DeviceClassConfiguration> config = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<V1alpha3DeviceSelector> selectors = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUITABLE_NODES = "suitableNodes";
  @SerializedName(SERIALIZED_NAME_SUITABLE_NODES)
  private V1NodeSelector suitableNodes;

  public V1alpha3DeviceClassSpec() {
  }

  public V1alpha3DeviceClassSpec config(List<V1alpha3DeviceClassConfiguration> config) {
    this.config = config;
    return this;
  }

  public V1alpha3DeviceClassSpec addConfigItem(V1alpha3DeviceClassConfiguration configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim.
   * @return config
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3DeviceClassConfiguration> getConfig() {
    return config;
  }

  public void setConfig(List<V1alpha3DeviceClassConfiguration> config) {
    this.config = config;
  }


  public V1alpha3DeviceClassSpec selectors(List<V1alpha3DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public V1alpha3DeviceClassSpec addSelectorsItem(V1alpha3DeviceSelector selectorsItem) {
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Each selector must be satisfied by a device which is claimed via this class.
   * @return selectors
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha3DeviceSelector> getSelectors() {
    return selectors;
  }

  public void setSelectors(List<V1alpha3DeviceSelector> selectors) {
    this.selectors = selectors;
  }


  public V1alpha3DeviceClassSpec suitableNodes(V1NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
    return this;
  }

   /**
   * Get suitableNodes
   * @return suitableNodes
  **/
  @jakarta.annotation.Nullable
  public V1NodeSelector getSuitableNodes() {
    return suitableNodes;
  }

  public void setSuitableNodes(V1NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceClassSpec v1alpha3DeviceClassSpec = (V1alpha3DeviceClassSpec) o;
    return Objects.equals(this.config, v1alpha3DeviceClassSpec.config) &&
        Objects.equals(this.selectors, v1alpha3DeviceClassSpec.selectors) &&
        Objects.equals(this.suitableNodes, v1alpha3DeviceClassSpec.suitableNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, selectors, suitableNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceClassSpec {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    suitableNodes: ").append(toIndentedString(suitableNodes)).append("\n");
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
    openapiFields.add("selectors");
    openapiFields.add("suitableNodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceClassSpec
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceClassSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceClassSpec is not found in the empty JSON string", V1alpha3DeviceClassSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceClassSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceClassSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
            V1alpha3DeviceClassConfiguration.validateJsonElement(jsonArrayconfig.get(i));
          };
        }
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
      // validate the optional field `suitableNodes`
      if (jsonObj.get("suitableNodes") != null && !jsonObj.get("suitableNodes").isJsonNull()) {
        V1NodeSelector.validateJsonElement(jsonObj.get("suitableNodes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceClassSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceClassSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceClassSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceClassSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceClassSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceClassSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceClassSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3DeviceClassSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3DeviceClassSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceClassSpec
  */
  public static V1alpha3DeviceClassSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceClassSpec.class);
  }

 /**
  * Convert an instance of V1alpha3DeviceClassSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
