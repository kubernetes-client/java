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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * VolumeMountStatus shows status of volume mounts.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1VolumeMountStatus {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY = "recursiveReadOnly";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY)
  private String recursiveReadOnly;

  public V1VolumeMountStatus() {
  }

  public V1VolumeMountStatus mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

   /**
   * MountPath corresponds to the original VolumeMount.
   * @return mountPath
  **/
  @jakarta.annotation.Nonnull
  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1VolumeMountStatus name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Name corresponds to the name of the original VolumeMount.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1VolumeMountStatus readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly corresponds to the original VolumeMount.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1VolumeMountStatus recursiveReadOnly(String recursiveReadOnly) {

    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

   /**
   * RecursiveReadOnly must be set to Disabled, Enabled, or unspecified (for non-readonly mounts). An IfPossible value in the original VolumeMount must be translated to Disabled or Enabled, depending on the mount result.
   * @return recursiveReadOnly
  **/
  @jakarta.annotation.Nullable
  public String getRecursiveReadOnly() {
    return recursiveReadOnly;
  }


  public void setRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeMountStatus v1VolumeMountStatus = (V1VolumeMountStatus) o;
    return Objects.equals(this.mountPath, v1VolumeMountStatus.mountPath) &&
        Objects.equals(this.name, v1VolumeMountStatus.name) &&
        Objects.equals(this.readOnly, v1VolumeMountStatus.readOnly) &&
        Objects.equals(this.recursiveReadOnly, v1VolumeMountStatus.recursiveReadOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, name, readOnly, recursiveReadOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeMountStatus {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recursiveReadOnly: ").append(toIndentedString(recursiveReadOnly)).append("\n");
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
    openapiFields.add("mountPath");
    openapiFields.add("name");
    openapiFields.add("readOnly");
    openapiFields.add("recursiveReadOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1VolumeMountStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1VolumeMountStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeMountStatus is not found in the empty JSON string", V1VolumeMountStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeMountStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeMountStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VolumeMountStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("recursiveReadOnly") != null && !jsonObj.get("recursiveReadOnly").isJsonNull()) && !jsonObj.get("recursiveReadOnly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recursiveReadOnly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recursiveReadOnly").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeMountStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeMountStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeMountStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeMountStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeMountStatus>() {
           @Override
           public void write(JsonWriter out, V1VolumeMountStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeMountStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1VolumeMountStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1VolumeMountStatus
  * @throws IOException if the JSON string is invalid with respect to V1VolumeMountStatus
  */
  public static V1VolumeMountStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeMountStatus.class);
  }

 /**
  * Convert an instance of V1VolumeMountStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
