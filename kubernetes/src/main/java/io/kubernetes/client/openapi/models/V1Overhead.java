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
import io.kubernetes.client.custom.Quantity;
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
 * Overhead structure represents the resource overhead associated with running a pod.
 */
@ApiModel(description = "Overhead structure represents the resource overhead associated with running a pod.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Overhead {
  public static final String SERIALIZED_NAME_POD_FIXED = "podFixed";
  @SerializedName(SERIALIZED_NAME_POD_FIXED)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> podFixed = new HashMap<>();

  public V1Overhead() {
  }

  public V1Overhead podFixed(@jakarta.annotation.Nullable Map<String, Quantity> podFixed) {
    this.podFixed = podFixed;
    return this;
  }

  public V1Overhead putPodFixedItem(String key, Quantity podFixedItem) {
    if (this.podFixed == null) {
      this.podFixed = new HashMap<>();
    }
    this.podFixed.put(key, podFixedItem);
    return this;
  }

  /**
   * podFixed represents the fixed resource overhead associated with running a pod.
   * @return podFixed
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "podFixed represents the fixed resource overhead associated with running a pod.")
  public Map<String, Quantity> getPodFixed() {
    return podFixed;
  }

  public void setPodFixed(@jakarta.annotation.Nullable Map<String, Quantity> podFixed) {
    this.podFixed = podFixed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Overhead v1Overhead = (V1Overhead) o;
    return Objects.equals(this.podFixed, v1Overhead.podFixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podFixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Overhead {\n");
    sb.append("    podFixed: ").append(toIndentedString(podFixed)).append("\n");
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
    openapiFields.add("podFixed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Overhead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Overhead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Overhead is not found in the empty JSON string", V1Overhead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Overhead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Overhead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Overhead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Overhead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Overhead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Overhead.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Overhead>() {
           @Override
           public void write(JsonWriter out, V1Overhead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Overhead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Overhead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Overhead
   * @throws IOException if the JSON string is invalid with respect to V1Overhead
   */
  public static V1Overhead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Overhead.class);
  }

  /**
   * Convert an instance of V1Overhead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
