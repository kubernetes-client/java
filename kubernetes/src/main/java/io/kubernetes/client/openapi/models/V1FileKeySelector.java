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
 * FileKeySelector selects a key of the env file.
 */
@ApiModel(description = "FileKeySelector selects a key of the env file.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1FileKeySelector {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @jakarta.annotation.Nonnull
  private String key;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  @jakarta.annotation.Nullable
  private Boolean optional;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nonnull
  private String path;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  @jakarta.annotation.Nonnull
  private String volumeName;

  public V1FileKeySelector() {
  }

  public V1FileKeySelector key(@jakarta.annotation.Nonnull String key) {
    this.key = key;
    return this;
  }

  /**
   * The key within the env file. An invalid key will prevent the pod from starting. The keys defined within a source may consist of any printable ASCII characters except &#39;&#x3D;&#39;. During Alpha stage of the EnvFiles feature gate, the key size is limited to 128 characters.
   * @return key
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The key within the env file. An invalid key will prevent the pod from starting. The keys defined within a source may consist of any printable ASCII characters except '='. During Alpha stage of the EnvFiles feature gate, the key size is limited to 128 characters.")
  public String getKey() {
    return key;
  }

  public void setKey(@jakarta.annotation.Nonnull String key) {
    this.key = key;
  }


  public V1FileKeySelector optional(@jakarta.annotation.Nullable Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * Specify whether the file or its key must be defined. If the file or key does not exist, then the env var is not published. If optional is set to true and the specified key does not exist, the environment variable will not be set in the Pod&#39;s containers.  If optional is set to false and the specified key does not exist, an error will be returned during Pod creation.
   * @return optional
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the file or its key must be defined. If the file or key does not exist, then the env var is not published. If optional is set to true and the specified key does not exist, the environment variable will not be set in the Pod's containers.  If optional is set to false and the specified key does not exist, an error will be returned during Pod creation.")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(@jakarta.annotation.Nullable Boolean optional) {
    this.optional = optional;
  }


  public V1FileKeySelector path(@jakarta.annotation.Nonnull String path) {
    this.path = path;
    return this;
  }

  /**
   * The path within the volume from which to select the file. Must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return path
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The path within the volume from which to select the file. Must be relative and may not contain the '..' path or start with '..'.")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nonnull String path) {
    this.path = path;
  }


  public V1FileKeySelector volumeName(@jakarta.annotation.Nonnull String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * The name of the volume mount containing the env file.
   * @return volumeName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the volume mount containing the env file.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(@jakarta.annotation.Nonnull String volumeName) {
    this.volumeName = volumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FileKeySelector v1FileKeySelector = (V1FileKeySelector) o;
    return Objects.equals(this.key, v1FileKeySelector.key) &&
        Objects.equals(this.optional, v1FileKeySelector.optional) &&
        Objects.equals(this.path, v1FileKeySelector.path) &&
        Objects.equals(this.volumeName, v1FileKeySelector.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, optional, path, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FileKeySelector {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("optional");
    openapiFields.add("path");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("volumeName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1FileKeySelector
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1FileKeySelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1FileKeySelector is not found in the empty JSON string", V1FileKeySelector.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1FileKeySelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1FileKeySelector` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1FileKeySelector.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1FileKeySelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1FileKeySelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1FileKeySelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1FileKeySelector.class));

       return (TypeAdapter<T>) new TypeAdapter<V1FileKeySelector>() {
           @Override
           public void write(JsonWriter out, V1FileKeySelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1FileKeySelector read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1FileKeySelector given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1FileKeySelector
   * @throws IOException if the JSON string is invalid with respect to V1FileKeySelector
   */
  public static V1FileKeySelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1FileKeySelector.class);
  }

  /**
   * Convert an instance of V1FileKeySelector to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
