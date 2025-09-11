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
 * Represents a vSphere volume resource.
 */
@ApiModel(description = "Represents a vSphere volume resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1VsphereVirtualDiskVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_I_D = "storagePolicyID";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_I_D)
  @jakarta.annotation.Nullable
  private String storagePolicyID;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_NAME = "storagePolicyName";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NAME)
  @jakarta.annotation.Nullable
  private String storagePolicyName;

  public static final String SERIALIZED_NAME_VOLUME_PATH = "volumePath";
  @SerializedName(SERIALIZED_NAME_VOLUME_PATH)
  @jakarta.annotation.Nonnull
  private String volumePath;

  public V1VsphereVirtualDiskVolumeSource() {
  }

  public V1VsphereVirtualDiskVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1VsphereVirtualDiskVolumeSource storagePolicyID(@jakarta.annotation.Nullable String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

  /**
   * storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   * @return storagePolicyID
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storagePolicyID is the storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }

  public void setStoragePolicyID(@jakarta.annotation.Nullable String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }


  public V1VsphereVirtualDiskVolumeSource storagePolicyName(@jakarta.annotation.Nullable String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

  /**
   * storagePolicyName is the storage Policy Based Management (SPBM) profile name.
   * @return storagePolicyName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storagePolicyName is the storage Policy Based Management (SPBM) profile name.")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(@jakarta.annotation.Nullable String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }


  public V1VsphereVirtualDiskVolumeSource volumePath(@jakarta.annotation.Nonnull String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

  /**
   * volumePath is the path that identifies vSphere volume vmdk
   * @return volumePath
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "volumePath is the path that identifies vSphere volume vmdk")
  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(@jakarta.annotation.Nonnull String volumePath) {
    this.volumePath = volumePath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereVirtualDiskVolumeSource v1VsphereVirtualDiskVolumeSource = (V1VsphereVirtualDiskVolumeSource) o;
    return Objects.equals(this.fsType, v1VsphereVirtualDiskVolumeSource.fsType) &&
        Objects.equals(this.storagePolicyID, v1VsphereVirtualDiskVolumeSource.storagePolicyID) &&
        Objects.equals(this.storagePolicyName, v1VsphereVirtualDiskVolumeSource.storagePolicyName) &&
        Objects.equals(this.volumePath, v1VsphereVirtualDiskVolumeSource.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereVirtualDiskVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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
    openapiFields.add("storagePolicyID");
    openapiFields.add("storagePolicyName");
    openapiFields.add("volumePath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("volumePath");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1VsphereVirtualDiskVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1VsphereVirtualDiskVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VsphereVirtualDiskVolumeSource is not found in the empty JSON string", V1VsphereVirtualDiskVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1VsphereVirtualDiskVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VsphereVirtualDiskVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VsphereVirtualDiskVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if ((jsonObj.get("storagePolicyID") != null && !jsonObj.get("storagePolicyID").isJsonNull()) && !jsonObj.get("storagePolicyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storagePolicyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storagePolicyID").toString()));
      }
      if ((jsonObj.get("storagePolicyName") != null && !jsonObj.get("storagePolicyName").isJsonNull()) && !jsonObj.get("storagePolicyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storagePolicyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storagePolicyName").toString()));
      }
      if (!jsonObj.get("volumePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumePath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VsphereVirtualDiskVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VsphereVirtualDiskVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VsphereVirtualDiskVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VsphereVirtualDiskVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VsphereVirtualDiskVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1VsphereVirtualDiskVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VsphereVirtualDiskVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1VsphereVirtualDiskVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1VsphereVirtualDiskVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1VsphereVirtualDiskVolumeSource
   */
  public static V1VsphereVirtualDiskVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VsphereVirtualDiskVolumeSource.class);
  }

  /**
   * Convert an instance of V1VsphereVirtualDiskVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
