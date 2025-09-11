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
 * Represents a Persistent Disk resource in Google Compute Engine.  A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a Persistent Disk resource in Google Compute Engine.  A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1GCEPersistentDiskVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  @jakarta.annotation.Nullable
  private Integer partition;

  public static final String SERIALIZED_NAME_PD_NAME = "pdName";
  @SerializedName(SERIALIZED_NAME_PD_NAME)
  @jakarta.annotation.Nonnull
  private String pdName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public V1GCEPersistentDiskVolumeSource() {
  }

  public V1GCEPersistentDiskVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1GCEPersistentDiskVolumeSource partition(@jakarta.annotation.Nullable Integer partition) {
    this.partition = partition;
    return this;
  }

  /**
   * partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \&quot;1\&quot;. Similarly, the volume partition for /dev/sda is \&quot;0\&quot; (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return partition
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "partition is the partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(@jakarta.annotation.Nullable Integer partition) {
    this.partition = partition;
  }


  public V1GCEPersistentDiskVolumeSource pdName(@jakarta.annotation.Nonnull String pdName) {
    this.pdName = pdName;
    return this;
  }

  /**
   * pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return pdName
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "pdName is unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public String getPdName() {
    return pdName;
  }

  public void setPdName(@jakarta.annotation.Nonnull String pdName) {
    this.pdName = pdName;
  }


  public V1GCEPersistentDiskVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
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
    V1GCEPersistentDiskVolumeSource v1GCEPersistentDiskVolumeSource = (V1GCEPersistentDiskVolumeSource) o;
    return Objects.equals(this.fsType, v1GCEPersistentDiskVolumeSource.fsType) &&
        Objects.equals(this.partition, v1GCEPersistentDiskVolumeSource.partition) &&
        Objects.equals(this.pdName, v1GCEPersistentDiskVolumeSource.pdName) &&
        Objects.equals(this.readOnly, v1GCEPersistentDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, pdName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GCEPersistentDiskVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    pdName: ").append(toIndentedString(pdName)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("partition");
    openapiFields.add("pdName");
    openapiFields.add("readOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pdName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1GCEPersistentDiskVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1GCEPersistentDiskVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1GCEPersistentDiskVolumeSource is not found in the empty JSON string", V1GCEPersistentDiskVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1GCEPersistentDiskVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1GCEPersistentDiskVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1GCEPersistentDiskVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("pdName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1GCEPersistentDiskVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1GCEPersistentDiskVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1GCEPersistentDiskVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1GCEPersistentDiskVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1GCEPersistentDiskVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1GCEPersistentDiskVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1GCEPersistentDiskVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1GCEPersistentDiskVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1GCEPersistentDiskVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1GCEPersistentDiskVolumeSource
   */
  public static V1GCEPersistentDiskVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1GCEPersistentDiskVolumeSource.class);
  }

  /**
   * Convert an instance of V1GCEPersistentDiskVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
