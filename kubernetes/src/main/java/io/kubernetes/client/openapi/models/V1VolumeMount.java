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
 * VolumeMount describes a mounting of a Volume within a container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1VolumeMount {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";
  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY = "recursiveReadOnly";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY)
  private String recursiveReadOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";
  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  private String subPathExpr;

  public V1VolumeMount() {
  }

  public V1VolumeMount mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

   /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
  **/
  @jakarta.annotation.Nonnull
  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public V1VolumeMount mountPropagation(String mountPropagation) {

    this.mountPropagation = mountPropagation;
    return this;
  }

   /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).
   * @return mountPropagation
  **/
  @jakarta.annotation.Nullable
  public String getMountPropagation() {
    return mountPropagation;
  }


  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }


  public V1VolumeMount name(String name) {

    this.name = name;
    return this;
  }

   /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1VolumeMount readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1VolumeMount recursiveReadOnly(String recursiveReadOnly) {

    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

   /**
   * RecursiveReadOnly specifies whether read-only mounts should be handled recursively.  If ReadOnly is false, this field has no meaning and must be unspecified.  If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.  If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).  If this field is not specified, it is treated as an equivalent of Disabled.
   * @return recursiveReadOnly
  **/
  @jakarta.annotation.Nullable
  public String getRecursiveReadOnly() {
    return recursiveReadOnly;
  }


  public void setRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
  }


  public V1VolumeMount subPath(String subPath) {

    this.subPath = subPath;
    return this;
  }

   /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
  **/
  @jakarta.annotation.Nullable
  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public V1VolumeMount subPathExpr(String subPathExpr) {

    this.subPathExpr = subPathExpr;
    return this;
  }

   /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   * @return subPathExpr
  **/
  @jakarta.annotation.Nullable
  public String getSubPathExpr() {
    return subPathExpr;
  }


  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeMount v1VolumeMount = (V1VolumeMount) o;
    return Objects.equals(this.mountPath, v1VolumeMount.mountPath) &&
        Objects.equals(this.mountPropagation, v1VolumeMount.mountPropagation) &&
        Objects.equals(this.name, v1VolumeMount.name) &&
        Objects.equals(this.readOnly, v1VolumeMount.readOnly) &&
        Objects.equals(this.recursiveReadOnly, v1VolumeMount.recursiveReadOnly) &&
        Objects.equals(this.subPath, v1VolumeMount.subPath) &&
        Objects.equals(this.subPathExpr, v1VolumeMount.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, recursiveReadOnly, subPath, subPathExpr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeMount {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    recursiveReadOnly: ").append(toIndentedString(recursiveReadOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
    openapiFields.add("mountPropagation");
    openapiFields.add("name");
    openapiFields.add("readOnly");
    openapiFields.add("recursiveReadOnly");
    openapiFields.add("subPath");
    openapiFields.add("subPathExpr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1VolumeMount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1VolumeMount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeMount is not found in the empty JSON string", V1VolumeMount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeMount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeMount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VolumeMount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if ((jsonObj.get("mountPropagation") != null && !jsonObj.get("mountPropagation").isJsonNull()) && !jsonObj.get("mountPropagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPropagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPropagation").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("recursiveReadOnly") != null && !jsonObj.get("recursiveReadOnly").isJsonNull()) && !jsonObj.get("recursiveReadOnly").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recursiveReadOnly` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recursiveReadOnly").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
      if ((jsonObj.get("subPathExpr") != null && !jsonObj.get("subPathExpr").isJsonNull()) && !jsonObj.get("subPathExpr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPathExpr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPathExpr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeMount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeMount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeMount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeMount.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeMount>() {
           @Override
           public void write(JsonWriter out, V1VolumeMount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeMount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1VolumeMount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1VolumeMount
  * @throws IOException if the JSON string is invalid with respect to V1VolumeMount
  */
  public static V1VolumeMount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeMount.class);
  }

 /**
  * Convert an instance of V1VolumeMount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
