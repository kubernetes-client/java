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
 * ObjectFieldSelector selects an APIVersioned field of an object.
 */
@ApiModel(description = "ObjectFieldSelector selects an APIVersioned field of an object.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ObjectFieldSelector {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  @jakarta.annotation.Nonnull
  private String fieldPath;

  public V1ObjectFieldSelector() {
  }

  public V1ObjectFieldSelector apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1ObjectFieldSelector fieldPath(@jakarta.annotation.Nonnull String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Path of the field to select in the specified API version.
   * @return fieldPath
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path of the field to select in the specified API version.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(@jakarta.annotation.Nonnull String fieldPath) {
    this.fieldPath = fieldPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectFieldSelector v1ObjectFieldSelector = (V1ObjectFieldSelector) o;
    return Objects.equals(this.apiVersion, v1ObjectFieldSelector.apiVersion) &&
        Objects.equals(this.fieldPath, v1ObjectFieldSelector.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectFieldSelector {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("fieldPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldPath");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ObjectFieldSelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ObjectFieldSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ObjectFieldSelector is not found in the empty JSON string", V1ObjectFieldSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ObjectFieldSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ObjectFieldSelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ObjectFieldSelector.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (!jsonObj.get("fieldPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ObjectFieldSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ObjectFieldSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ObjectFieldSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ObjectFieldSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ObjectFieldSelector>() {
           @Override
           public void write(JsonWriter out, V1ObjectFieldSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ObjectFieldSelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ObjectFieldSelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ObjectFieldSelector
   * @throws IOException if the JSON string is invalid with respect to V1ObjectFieldSelector
   */
  public static V1ObjectFieldSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ObjectFieldSelector.class);
  }

  /**
   * Convert an instance of V1ObjectFieldSelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
