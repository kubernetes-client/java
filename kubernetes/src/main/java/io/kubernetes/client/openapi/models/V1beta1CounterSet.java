/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1beta1Counter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * CounterSet defines a named set of counters that are available to be used by devices defined in the ResourcePool.  The counters are not allocatable by themselves, but can be referenced by devices. When a device is allocated, the portion of counters it uses will no longer be available for use by other devices.
 */
@ApiModel(description = "CounterSet defines a named set of counters that are available to be used by devices defined in the ResourcePool.  The counters are not allocatable by themselves, but can be referenced by devices. When a device is allocated, the portion of counters it uses will no longer be available for use by other devices.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1beta1CounterSet {
  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  @jakarta.annotation.Nonnull
  private Map<String, V1beta1Counter> counters = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public V1beta1CounterSet() {
  }

  public V1beta1CounterSet counters(@jakarta.annotation.Nonnull Map<String, V1beta1Counter> counters) {
    this.counters = counters;
    return this;
  }

  public V1beta1CounterSet putCountersItem(String key, V1beta1Counter countersItem) {
    if (this.counters == null) {
      this.counters = new HashMap<>();
    }
    this.counters.put(key, countersItem);
    return this;
  }

  /**
   * Counters defines the set of counters for this CounterSet The name of each counter must be unique in that set and must be a DNS label.  The maximum number of counters is 32.
   * @return counters
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Counters defines the set of counters for this CounterSet The name of each counter must be unique in that set and must be a DNS label.  The maximum number of counters is 32.")
  public Map<String, V1beta1Counter> getCounters() {
    return counters;
  }

  public void setCounters(@jakarta.annotation.Nonnull Map<String, V1beta1Counter> counters) {
    this.counters = counters;
  }


  public V1beta1CounterSet name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name defines the name of the counter set. It must be a DNS label.
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name defines the name of the counter set. It must be a DNS label.")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CounterSet v1beta1CounterSet = (V1beta1CounterSet) o;
    return Objects.equals(this.counters, v1beta1CounterSet.counters) &&
        Objects.equals(this.name, v1beta1CounterSet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CounterSet {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields = new HashSet<String>(Arrays.asList("counters", "name"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(Arrays.asList("counters", "name"));
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1beta1CounterSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1beta1CounterSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1beta1CounterSet is not found in the empty JSON string", V1beta1CounterSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1beta1CounterSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1beta1CounterSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1CounterSet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1CounterSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1CounterSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1CounterSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1CounterSet.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1CounterSet>() {
           @Override
           public void write(JsonWriter out, V1beta1CounterSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1CounterSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1beta1CounterSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1beta1CounterSet
   * @throws IOException if the JSON string is invalid with respect to V1beta1CounterSet
   */
  public static V1beta1CounterSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1CounterSet.class);
  }

  /**
   * Convert an instance of V1beta1CounterSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
