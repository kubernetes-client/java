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
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 */
@ApiModel(description = "NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1NonResourceAttributes {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nullable
  private String path;

  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  @jakarta.annotation.Nullable
  private String verb;

  public V1NonResourceAttributes() {
  }

  public V1NonResourceAttributes path(@jakarta.annotation.Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * Path is the URL path of the request
   * @return path
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Path is the URL path of the request")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nullable String path) {
    this.path = path;
  }


  public V1NonResourceAttributes verb(@jakarta.annotation.Nullable String verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Verb is the standard HTTP verb
   * @return verb
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Verb is the standard HTTP verb")
  public String getVerb() {
    return verb;
  }

  public void setVerb(@jakarta.annotation.Nullable String verb) {
    this.verb = verb;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NonResourceAttributes v1NonResourceAttributes = (V1NonResourceAttributes) o;
    return Objects.equals(this.path, v1NonResourceAttributes.path) &&
        Objects.equals(this.verb, v1NonResourceAttributes.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, verb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NonResourceAttributes {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
    openapiFields.add("path");
    openapiFields.add("verb");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1NonResourceAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1NonResourceAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1NonResourceAttributes is not found in the empty JSON string", V1NonResourceAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1NonResourceAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1NonResourceAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("verb") != null && !jsonObj.get("verb").isJsonNull()) && !jsonObj.get("verb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verb").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1NonResourceAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1NonResourceAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1NonResourceAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1NonResourceAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<V1NonResourceAttributes>() {
           @Override
           public void write(JsonWriter out, V1NonResourceAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1NonResourceAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1NonResourceAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1NonResourceAttributes
   * @throws IOException if the JSON string is invalid with respect to V1NonResourceAttributes
   */
  public static V1NonResourceAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1NonResourceAttributes.class);
  }

  /**
   * Convert an instance of V1NonResourceAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
