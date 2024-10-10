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
import io.kubernetes.client.openapi.models.V1PodDNSConfigOption;
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
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1PodDNSConfig {
  public static final String SERIALIZED_NAME_NAMESERVERS = "nameservers";
  @SerializedName(SERIALIZED_NAME_NAMESERVERS)
  private List<String> nameservers = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<V1PodDNSConfigOption> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEARCHES = "searches";
  @SerializedName(SERIALIZED_NAME_SEARCHES)
  private List<String> searches = new ArrayList<>();

  public V1PodDNSConfig() {
  }

  public V1PodDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public V1PodDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   * @return nameservers
  **/
  @jakarta.annotation.Nullable
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }


  public V1PodDNSConfig options(List<V1PodDNSConfigOption> options) {
    this.options = options;
    return this;
  }

  public V1PodDNSConfig addOptionsItem(V1PodDNSConfigOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   * @return options
  **/
  @jakarta.annotation.Nullable
  public List<V1PodDNSConfigOption> getOptions() {
    return options;
  }

  public void setOptions(List<V1PodDNSConfigOption> options) {
    this.options = options;
  }


  public V1PodDNSConfig searches(List<String> searches) {
    this.searches = searches;
    return this;
  }

  public V1PodDNSConfig addSearchesItem(String searchesItem) {
    if (this.searches == null) {
      this.searches = new ArrayList<>();
    }
    this.searches.add(searchesItem);
    return this;
  }

   /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   * @return searches
  **/
  @jakarta.annotation.Nullable
  public List<String> getSearches() {
    return searches;
  }

  public void setSearches(List<String> searches) {
    this.searches = searches;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDNSConfig v1PodDNSConfig = (V1PodDNSConfig) o;
    return Objects.equals(this.nameservers, v1PodDNSConfig.nameservers) &&
        Objects.equals(this.options, v1PodDNSConfig.options) &&
        Objects.equals(this.searches, v1PodDNSConfig.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, options, searches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDNSConfig {\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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
    openapiFields.add("nameservers");
    openapiFields.add("options");
    openapiFields.add("searches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1PodDNSConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PodDNSConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PodDNSConfig is not found in the empty JSON string", V1PodDNSConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PodDNSConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PodDNSConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("nameservers") != null && !jsonObj.get("nameservers").isJsonNull() && !jsonObj.get("nameservers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameservers` to be an array in the JSON string but got `%s`", jsonObj.get("nameservers").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            V1PodDNSConfigOption.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("searches") != null && !jsonObj.get("searches").isJsonNull() && !jsonObj.get("searches").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `searches` to be an array in the JSON string but got `%s`", jsonObj.get("searches").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PodDNSConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PodDNSConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PodDNSConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PodDNSConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PodDNSConfig>() {
           @Override
           public void write(JsonWriter out, V1PodDNSConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PodDNSConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PodDNSConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PodDNSConfig
  * @throws IOException if the JSON string is invalid with respect to V1PodDNSConfig
  */
  public static V1PodDNSConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PodDNSConfig.class);
  }

 /**
  * Convert an instance of V1PodDNSConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
