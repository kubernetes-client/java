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
import io.kubernetes.client.openapi.models.V1ObjectFieldSelector;
import io.kubernetes.client.openapi.models.V1ResourceFieldSelector;
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
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 */
@ApiModel(description = "DownwardAPIVolumeFile represents information to create the file containing the pod field")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1DownwardAPIVolumeFile {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  @jakarta.annotation.Nullable
  private V1ObjectFieldSelector fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  @jakarta.annotation.Nullable
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nonnull
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  @jakarta.annotation.Nullable
  private V1ResourceFieldSelector resourceFieldRef;

  public V1DownwardAPIVolumeFile() {
  }

  public V1DownwardAPIVolumeFile fieldRef(@jakarta.annotation.Nullable V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  /**
   * Get fieldRef
   * @return fieldRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(@jakarta.annotation.Nullable V1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1DownwardAPIVolumeFile mode(@jakarta.annotation.Nullable Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(@jakarta.annotation.Nullable Integer mode) {
    this.mode = mode;
  }


  public V1DownwardAPIVolumeFile path(@jakarta.annotation.Nonnull String path) {
    this.path = path;
    return this;
  }

  /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
   * @return path
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nonnull String path) {
    this.path = path;
  }


  public V1DownwardAPIVolumeFile resourceFieldRef(@jakarta.annotation.Nullable V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  /**
   * Get resourceFieldRef
   * @return resourceFieldRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(@jakarta.annotation.Nullable V1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DownwardAPIVolumeFile v1DownwardAPIVolumeFile = (V1DownwardAPIVolumeFile) o;
    return Objects.equals(this.fieldRef, v1DownwardAPIVolumeFile.fieldRef) &&
        Objects.equals(this.mode, v1DownwardAPIVolumeFile.mode) &&
        Objects.equals(this.path, v1DownwardAPIVolumeFile.path) &&
        Objects.equals(this.resourceFieldRef, v1DownwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIVolumeFile {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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
    openapiFields.add("fieldRef");
    openapiFields.add("mode");
    openapiFields.add("path");
    openapiFields.add("resourceFieldRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1DownwardAPIVolumeFile
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1DownwardAPIVolumeFile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1DownwardAPIVolumeFile is not found in the empty JSON string", V1DownwardAPIVolumeFile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1DownwardAPIVolumeFile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1DownwardAPIVolumeFile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1DownwardAPIVolumeFile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `fieldRef`
      if (jsonObj.get("fieldRef") != null && !jsonObj.get("fieldRef").isJsonNull()) {
        V1ObjectFieldSelector.validateJsonElement(jsonObj.get("fieldRef"));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      // validate the optional field `resourceFieldRef`
      if (jsonObj.get("resourceFieldRef") != null && !jsonObj.get("resourceFieldRef").isJsonNull()) {
        V1ResourceFieldSelector.validateJsonElement(jsonObj.get("resourceFieldRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1DownwardAPIVolumeFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1DownwardAPIVolumeFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1DownwardAPIVolumeFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1DownwardAPIVolumeFile.class));

       return (TypeAdapter<T>) new TypeAdapter<V1DownwardAPIVolumeFile>() {
           @Override
           public void write(JsonWriter out, V1DownwardAPIVolumeFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1DownwardAPIVolumeFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1DownwardAPIVolumeFile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1DownwardAPIVolumeFile
   * @throws IOException if the JSON string is invalid with respect to V1DownwardAPIVolumeFile
   */
  public static V1DownwardAPIVolumeFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1DownwardAPIVolumeFile.class);
  }

  /**
   * Convert an instance of V1DownwardAPIVolumeFile to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
