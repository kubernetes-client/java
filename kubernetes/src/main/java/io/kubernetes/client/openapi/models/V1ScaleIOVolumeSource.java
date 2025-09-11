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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
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
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 */
@ApiModel(description = "ScaleIOVolumeSource represents a persistent ScaleIO volume")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ScaleIOVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  @jakarta.annotation.Nullable
  private String fsType;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  @jakarta.annotation.Nonnull
  private String gateway;

  public static final String SERIALIZED_NAME_PROTECTION_DOMAIN = "protectionDomain";
  @SerializedName(SERIALIZED_NAME_PROTECTION_DOMAIN)
  @jakarta.annotation.Nullable
  private String protectionDomain;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  @jakarta.annotation.Nullable
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  @jakarta.annotation.Nonnull
  private V1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_SSL_ENABLED = "sslEnabled";
  @SerializedName(SERIALIZED_NAME_SSL_ENABLED)
  @jakarta.annotation.Nullable
  private Boolean sslEnabled;

  public static final String SERIALIZED_NAME_STORAGE_MODE = "storageMode";
  @SerializedName(SERIALIZED_NAME_STORAGE_MODE)
  @jakarta.annotation.Nullable
  private String storageMode;

  public static final String SERIALIZED_NAME_STORAGE_POOL = "storagePool";
  @SerializedName(SERIALIZED_NAME_STORAGE_POOL)
  @jakarta.annotation.Nullable
  private String storagePool;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  @jakarta.annotation.Nonnull
  private String system;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  @jakarta.annotation.Nullable
  private String volumeName;

  public V1ScaleIOVolumeSource() {
  }

  public V1ScaleIOVolumeSource fsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;.
   * @return fsType
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\".")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(@jakarta.annotation.Nullable String fsType) {
    this.fsType = fsType;
  }


  public V1ScaleIOVolumeSource gateway(@jakarta.annotation.Nonnull String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * gateway is the host address of the ScaleIO API Gateway.
   * @return gateway
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "gateway is the host address of the ScaleIO API Gateway.")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(@jakarta.annotation.Nonnull String gateway) {
    this.gateway = gateway;
  }


  public V1ScaleIOVolumeSource protectionDomain(@jakarta.annotation.Nullable String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

  /**
   * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.")
  public String getProtectionDomain() {
    return protectionDomain;
  }

  public void setProtectionDomain(@jakarta.annotation.Nullable String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }


  public V1ScaleIOVolumeSource readOnly(@jakarta.annotation.Nullable Boolean readOnly) {
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


  public V1ScaleIOVolumeSource secretRef(@jakarta.annotation.Nonnull V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   * @return secretRef
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(@jakarta.annotation.Nonnull V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1ScaleIOVolumeSource sslEnabled(@jakarta.annotation.Nullable Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

  /**
   * sslEnabled Flag enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "sslEnabled Flag enable/disable SSL communication with Gateway, default false")
  public Boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(@jakarta.annotation.Nullable Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }


  public V1ScaleIOVolumeSource storageMode(@jakarta.annotation.Nullable String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  /**
   * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
  public String getStorageMode() {
    return storageMode;
  }

  public void setStorageMode(@jakarta.annotation.Nullable String storageMode) {
    this.storageMode = storageMode;
  }


  public V1ScaleIOVolumeSource storagePool(@jakarta.annotation.Nullable String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  /**
   * storagePool is the ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storagePool is the ScaleIO Storage Pool associated with the protection domain.")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(@jakarta.annotation.Nullable String storagePool) {
    this.storagePool = storagePool;
  }


  public V1ScaleIOVolumeSource system(@jakarta.annotation.Nonnull String system) {
    this.system = system;
    return this;
  }

  /**
   * system is the name of the storage system as configured in ScaleIO.
   * @return system
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "system is the name of the storage system as configured in ScaleIO.")
  public String getSystem() {
    return system;
  }

  public void setSystem(@jakarta.annotation.Nonnull String system) {
    this.system = system;
  }


  public V1ScaleIOVolumeSource volumeName(@jakarta.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(@jakarta.annotation.Nullable String volumeName) {
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
    V1ScaleIOVolumeSource v1ScaleIOVolumeSource = (V1ScaleIOVolumeSource) o;
    return Objects.equals(this.fsType, v1ScaleIOVolumeSource.fsType) &&
        Objects.equals(this.gateway, v1ScaleIOVolumeSource.gateway) &&
        Objects.equals(this.protectionDomain, v1ScaleIOVolumeSource.protectionDomain) &&
        Objects.equals(this.readOnly, v1ScaleIOVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ScaleIOVolumeSource.secretRef) &&
        Objects.equals(this.sslEnabled, v1ScaleIOVolumeSource.sslEnabled) &&
        Objects.equals(this.storageMode, v1ScaleIOVolumeSource.storageMode) &&
        Objects.equals(this.storagePool, v1ScaleIOVolumeSource.storagePool) &&
        Objects.equals(this.system, v1ScaleIOVolumeSource.system) &&
        Objects.equals(this.volumeName, v1ScaleIOVolumeSource.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScaleIOVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
    openapiFields.add("fsType");
    openapiFields.add("gateway");
    openapiFields.add("protectionDomain");
    openapiFields.add("readOnly");
    openapiFields.add("secretRef");
    openapiFields.add("sslEnabled");
    openapiFields.add("storageMode");
    openapiFields.add("storagePool");
    openapiFields.add("system");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gateway");
    openapiRequiredFields.add("secretRef");
    openapiRequiredFields.add("system");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ScaleIOVolumeSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ScaleIOVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ScaleIOVolumeSource is not found in the empty JSON string", V1ScaleIOVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ScaleIOVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ScaleIOVolumeSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ScaleIOVolumeSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      if (!jsonObj.get("gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
      }
      if ((jsonObj.get("protectionDomain") != null && !jsonObj.get("protectionDomain").isJsonNull()) && !jsonObj.get("protectionDomain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protectionDomain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protectionDomain").toString()));
      }
      // validate the required field `secretRef`
      V1LocalObjectReference.validateJsonElement(jsonObj.get("secretRef"));
      if ((jsonObj.get("storageMode") != null && !jsonObj.get("storageMode").isJsonNull()) && !jsonObj.get("storageMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageMode").toString()));
      }
      if ((jsonObj.get("storagePool") != null && !jsonObj.get("storagePool").isJsonNull()) && !jsonObj.get("storagePool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storagePool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storagePool").toString()));
      }
      if (!jsonObj.get("system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system").toString()));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ScaleIOVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ScaleIOVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ScaleIOVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ScaleIOVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ScaleIOVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1ScaleIOVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ScaleIOVolumeSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ScaleIOVolumeSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ScaleIOVolumeSource
   * @throws IOException if the JSON string is invalid with respect to V1ScaleIOVolumeSource
   */
  public static V1ScaleIOVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ScaleIOVolumeSource.class);
  }

  /**
   * Convert an instance of V1ScaleIOVolumeSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
