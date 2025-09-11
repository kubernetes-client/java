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
 * Local represents directly-attached storage with node affinity
 */
@ApiModel(description = "Local represents directly-attached storage with node affinity")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1LocalVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  @jakarta.annotation.Nonnull
  private String path;

  public V1LocalVolumeSource() {
  }

  public V1LocalVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default value is to auto-select a filesystem if unspecified.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default value is to auto-select a filesystem if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1LocalVolumeSource path(@jakarta.annotation.Nonnull String path) {
    this.path = path;
    return this;
  }

  /**
   * path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
   * @return path
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "path of the full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).")
  public String getPath() {
    return path;
  }

  public void setPath(@jakarta.annotation.Nonnull String path) {
    this.path = path;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LocalVolumeSource v1LocalVolumeSource = (V1LocalVolumeSource) o;
    return Objects.equals(this.fsType, v1LocalVolumeSource.fsType) &&
        Objects.equals(this.path, v1LocalVolumeSource.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LocalVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1LocalVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1LocalVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1LocalVolumeSource is not found in the empty JSON string", V1LocalVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1LocalVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1LocalVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1LocalVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1LocalVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1LocalVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1LocalVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1LocalVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1LocalVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1LocalVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1LocalVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1LocalVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1LocalVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1LocalVolumeSource
   */
  public static V1LocalVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1LocalVolumeSource.class);
  }

  /**
   * Convert an instance of V1LocalVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
