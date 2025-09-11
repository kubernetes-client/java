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
 * Adds and removes POSIX capabilities from running containers.
 */
@ApiModel(description = "Adds and removes POSIX capabilities from running containers.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Capabilities {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  @jakarta.annotation.Nullable
  private List<String> add = new ArrayList<>();

  public static final String SERIALIZED_NAME_DROP = "drop";
  @SerializedName(SERIALIZED_NAME_DROP)
  @jakarta.annotation.Nullable
  private List<String> drop = new ArrayList<>();

  public V1Capabilities() {
  }

  public V1Capabilities add(@jakarta.annotation.Nullable List<String> add) {
    this.add = add;
    return this;
  }

  public V1Capabilities addAddItem(String addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

  /**
   * Added capabilities
   * @return add
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Added capabilities")
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(@jakarta.annotation.Nullable List<String> add) {
    this.add = add;
  }


  public V1Capabilities drop(@jakarta.annotation.Nullable List<String> drop) {
    this.drop = drop;
    return this;
  }

  public V1Capabilities addDropItem(String dropItem) {
    if (this.drop == null) {
      this.drop = new ArrayList<>();
    }
    this.drop.add(dropItem);
    return this;
  }

  /**
   * Removed capabilities
   * @return drop
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Removed capabilities")
  public List<String> getDrop() {
    return drop;
  }

  public void setDrop(@jakarta.annotation.Nullable List<String> drop) {
    this.drop = drop;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Capabilities v1Capabilities = (V1Capabilities) o;
    return Objects.equals(this.add, v1Capabilities.add) &&
        Objects.equals(this.drop, v1Capabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Capabilities {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("drop");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Capabilities
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Capabilities.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Capabilities is not found in the empty JSON string", V1Capabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Capabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Capabilities` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("add") != null && !jsonObj.get("add").isJsonNull() && !jsonObj.get("add").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("drop") != null && !jsonObj.get("drop").isJsonNull() && !jsonObj.get("drop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drop` to be an array in the JSON string but got `%s`", jsonObj.get("drop").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Capabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Capabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Capabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Capabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Capabilities>() {
           @Override
           public void write(JsonWriter out, V1Capabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Capabilities read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Capabilities given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Capabilities
   * @throws IOException if the JSON string is invalid with respect to V1Capabilities
   */
  public static V1Capabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Capabilities.class);
  }

  /**
   * Convert an instance of V1Capabilities to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
