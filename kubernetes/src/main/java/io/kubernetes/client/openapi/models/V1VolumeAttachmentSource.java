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
import io.kubernetes.client.openapi.models.V1PersistentVolumeSpec;
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
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistentVolumes can be attached via external attacher, in the future we may allow also inline volumes in pods. Exactly one member can be set.
 */
@ApiModel(description = "VolumeAttachmentSource represents a volume that should be attached. Right now only PersistentVolumes can be attached via external attacher, in the future we may allow also inline volumes in pods. Exactly one member can be set.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1VolumeAttachmentSource {
  public static final String SERIALIZED_NAME_INLINE_VOLUME_SPEC = "inlineVolumeSpec";
  @SerializedName(SERIALIZED_NAME_INLINE_VOLUME_SPEC)
  @jakarta.annotation.Nullable
  private V1PersistentVolumeSpec inlineVolumeSpec;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_NAME = "persistentVolumeName";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_NAME)
  @jakarta.annotation.Nullable
  private String persistentVolumeName;

  public V1VolumeAttachmentSource() {
  }

  public V1VolumeAttachmentSource inlineVolumeSpec(@jakarta.annotation.Nullable V1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
    return this;
  }

  /**
   * Get inlineVolumeSpec
   * @return inlineVolumeSpec
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PersistentVolumeSpec getInlineVolumeSpec() {
    return inlineVolumeSpec;
  }

  public void setInlineVolumeSpec(@jakarta.annotation.Nullable V1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
  }


  public V1VolumeAttachmentSource persistentVolumeName(@jakarta.annotation.Nullable String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return this;
  }

  /**
   * persistentVolumeName represents the name of the persistent volume to attach.
   * @return persistentVolumeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "persistentVolumeName represents the name of the persistent volume to attach.")
  public String getPersistentVolumeName() {
    return persistentVolumeName;
  }

  public void setPersistentVolumeName(@jakarta.annotation.Nullable String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeAttachmentSource v1VolumeAttachmentSource = (V1VolumeAttachmentSource) o;
    return Objects.equals(this.inlineVolumeSpec, v1VolumeAttachmentSource.inlineVolumeSpec) &&
        Objects.equals(this.persistentVolumeName, v1VolumeAttachmentSource.persistentVolumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineVolumeSpec, persistentVolumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeAttachmentSource {\n");
    sb.append("    inlineVolumeSpec: ").append(toIndentedString(inlineVolumeSpec)).append("\n");
    sb.append("    persistentVolumeName: ").append(toIndentedString(persistentVolumeName)).append("\n");
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
    openapiFields.add("inlineVolumeSpec");
    openapiFields.add("persistentVolumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1VolumeAttachmentSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1VolumeAttachmentSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VolumeAttachmentSource is not found in the empty JSON string", V1VolumeAttachmentSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1VolumeAttachmentSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VolumeAttachmentSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `inlineVolumeSpec`
      if (jsonObj.get("inlineVolumeSpec") != null && !jsonObj.get("inlineVolumeSpec").isJsonNull()) {
        V1PersistentVolumeSpec.validateJsonElement(jsonObj.get("inlineVolumeSpec"));
      }
      if ((jsonObj.get("persistentVolumeName") != null && !jsonObj.get("persistentVolumeName").isJsonNull()) && !jsonObj.get("persistentVolumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `persistentVolumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("persistentVolumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VolumeAttachmentSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VolumeAttachmentSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VolumeAttachmentSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VolumeAttachmentSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VolumeAttachmentSource>() {
           @Override
           public void write(JsonWriter out, V1VolumeAttachmentSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VolumeAttachmentSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1VolumeAttachmentSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1VolumeAttachmentSource
   * @throws IOException if the JSON string is invalid with respect to V1VolumeAttachmentSource
   */
  public static V1VolumeAttachmentSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VolumeAttachmentSource.class);
  }

  /**
   * Convert an instance of V1VolumeAttachmentSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
