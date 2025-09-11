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
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
 * Represents a StorageOS persistent volume resource.
 */
@ApiModel(description = "Represents a StorageOS persistent volume resource.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1StorageOSPersistentVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  @jakarta.annotation.Nullable
  private V1ObjectReference secretRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  @jakarta.annotation.Nullable
  private String volumeName;

  public static final String SERIALIZED_NAME_VOLUME_NAMESPACE = "volumeNamespace";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAMESPACE)
  @jakarta.annotation.Nullable
  private String volumeNamespace;

  public V1StorageOSPersistentVolumeSource() {
  }

  public V1StorageOSPersistentVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1StorageOSPersistentVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(@jakarta.annotation.Nullable Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1StorageOSPersistentVolumeSource secretRef(@jakarta.annotation.Nullable V1ObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   * @return secretRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(@jakarta.annotation.Nullable V1ObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1StorageOSPersistentVolumeSource volumeName(@jakarta.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   * @return volumeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(@jakarta.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
  }


  public V1StorageOSPersistentVolumeSource volumeNamespace(@jakarta.annotation.Nullable String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }

  /**
   * volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   * @return volumeNamespace
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
  public String getVolumeNamespace() {
    return volumeNamespace;
  }

  public void setVolumeNamespace(@jakarta.annotation.Nullable String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StorageOSPersistentVolumeSource v1StorageOSPersistentVolumeSource = (V1StorageOSPersistentVolumeSource) o;
    return Objects.equals(this.fsType, v1StorageOSPersistentVolumeSource.fsType) &&
        Objects.equals(this.readOnly, v1StorageOSPersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1StorageOSPersistentVolumeSource.secretRef) &&
        Objects.equals(this.volumeName, v1StorageOSPersistentVolumeSource.volumeName) &&
        Objects.equals(this.volumeNamespace, v1StorageOSPersistentVolumeSource.volumeNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StorageOSPersistentVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
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
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("volumeName");
    openapiFields.add("volumeNamespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1StorageOSPersistentVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1StorageOSPersistentVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1StorageOSPersistentVolumeSource is not found in the empty JSON string", V1StorageOSPersistentVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1StorageOSPersistentVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1StorageOSPersistentVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      // validate the optional field `secretRef`
      if (jsonObj.get("secretRef") != null && !jsonObj.get("secretRef").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("secretRef"));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
      if ((jsonObj.get("volumeNamespace") != null && !jsonObj.get("volumeNamespace").isJsonNull()) && !jsonObj.get("volumeNamespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeNamespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeNamespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1StorageOSPersistentVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1StorageOSPersistentVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1StorageOSPersistentVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1StorageOSPersistentVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1StorageOSPersistentVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1StorageOSPersistentVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1StorageOSPersistentVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1StorageOSPersistentVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1StorageOSPersistentVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1StorageOSPersistentVolumeSource
   */
  public static V1StorageOSPersistentVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1StorageOSPersistentVolumeSource.class);
  }

  /**
   * Convert an instance of V1StorageOSPersistentVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
