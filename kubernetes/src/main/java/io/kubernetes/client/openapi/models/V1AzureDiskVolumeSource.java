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
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1AzureDiskVolumeSource {
  public static final String SERIALIZED_NAME_CACHING_MODE = "cachingMode";
  @SerializedName(SERIALIZED_NAME_CACHING_MODE)
  @jakarta.annotation.Nullable
  private String cachingMode;

  public static final String SERIALIZED_NAME_DISK_NAME = "diskName";
  @SerializedName(SERIALIZED_NAME_DISK_NAME)
  @jakarta.annotation.Nonnull
  private String diskName;

  public static final String SERIALIZED_NAME_DISK_U_R_I = "diskURI";
  @SerializedName(SERIALIZED_NAME_DISK_U_R_I)
  @jakarta.annotation.Nonnull
  private String diskURI;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public V1AzureDiskVolumeSource() {
  }

  public V1AzureDiskVolumeSource cachingMode(@jakarta.annotation.Nullable String cachingMode) {
    this.cachingMode = cachingMode;
    return this;
  }

  /**
   * cachingMode is the Host Caching mode: None, Read Only, Read Write.
   * @return cachingMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "cachingMode is the Host Caching mode: None, Read Only, Read Write.")
  public String getCachingMode() {
    return cachingMode;
  }

  public void setCachingMode(@jakarta.annotation.Nullable String cachingMode) {
    this.cachingMode = cachingMode;
  }


  public V1AzureDiskVolumeSource diskName(@jakarta.annotation.Nonnull String diskName) {
    this.diskName = diskName;
    return this;
  }

  /**
   * diskName is the Name of the data disk in the blob storage
   * @return diskName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "diskName is the Name of the data disk in the blob storage")
  public String getDiskName() {
    return diskName;
  }

  public void setDiskName(@jakarta.annotation.Nonnull String diskName) {
    this.diskName = diskName;
  }


  public V1AzureDiskVolumeSource diskURI(@jakarta.annotation.Nonnull String diskURI) {
    this.diskURI = diskURI;
    return this;
  }

  /**
   * diskURI is the URI of data disk in the blob storage
   * @return diskURI
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "diskURI is the URI of data disk in the blob storage")
  public String getDiskURI() {
    return diskURI;
  }

  public void setDiskURI(@jakarta.annotation.Nonnull String diskURI) {
    this.diskURI = diskURI;
  }


  public V1AzureDiskVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1AzureDiskVolumeSource kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "kind expected values are Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public V1AzureDiskVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureDiskVolumeSource v1AzureDiskVolumeSource = (V1AzureDiskVolumeSource) o;
    return Objects.equals(this.cachingMode, v1AzureDiskVolumeSource.cachingMode) &&
        Objects.equals(this.diskName, v1AzureDiskVolumeSource.diskName) &&
        Objects.equals(this.diskURI, v1AzureDiskVolumeSource.diskURI) &&
        Objects.equals(this.fsType, v1AzureDiskVolumeSource.fsType) &&
        Objects.equals(this.kind, v1AzureDiskVolumeSource.kind) &&
        Objects.equals(this.readOnly, v1AzureDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureDiskVolumeSource {\n");
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
    openapiFields.add("cachingMode");
    openapiFields.add("diskName");
    openapiFields.add("diskURI");
    openapiFields.add("fsType");
    openapiFields.add("kind");
    openapiFields.add("readOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("diskName");
    openapiRequiredFields.add("diskURI");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1AzureDiskVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1AzureDiskVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1AzureDiskVolumeSource is not found in the empty JSON string", V1AzureDiskVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1AzureDiskVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1AzureDiskVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1AzureDiskVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cachingMode") != null && !jsonObj.get("cachingMode").isJsonNull()) && !jsonObj.get("cachingMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cachingMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cachingMode").toString()));
      }
      if (!jsonObj.get("diskName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diskName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diskName").toString()));
      }
      if (!jsonObj.get("diskURI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `diskURI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("diskURI").toString()));
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1AzureDiskVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1AzureDiskVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1AzureDiskVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1AzureDiskVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1AzureDiskVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1AzureDiskVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1AzureDiskVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1AzureDiskVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1AzureDiskVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1AzureDiskVolumeSource
   */
  public static V1AzureDiskVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1AzureDiskVolumeSource.class);
  }

  /**
   * Convert an instance of V1AzureDiskVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
