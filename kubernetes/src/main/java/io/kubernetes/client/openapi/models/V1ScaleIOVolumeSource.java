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
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
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
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1ScaleIOVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_PROTECTION_DOMAIN = "protectionDomain";
  @SerializedName(SERIALIZED_NAME_PROTECTION_DOMAIN)
  private String protectionDomain;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1LocalObjectReference secretRef;

  public static final String SERIALIZED_NAME_SSL_ENABLED = "sslEnabled";
  @SerializedName(SERIALIZED_NAME_SSL_ENABLED)
  private Boolean sslEnabled;

  public static final String SERIALIZED_NAME_STORAGE_MODE = "storageMode";
  @SerializedName(SERIALIZED_NAME_STORAGE_MODE)
  private String storageMode;

  public static final String SERIALIZED_NAME_STORAGE_POOL = "storagePool";
  @SerializedName(SERIALIZED_NAME_STORAGE_POOL)
  private String storagePool;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private String system;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1ScaleIOVolumeSource() {
  }

  public V1ScaleIOVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;.
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1ScaleIOVolumeSource gateway(String gateway) {

    this.gateway = gateway;
    return this;
  }

   /**
   * gateway is the host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @jakarta.annotation.Nonnull
  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public V1ScaleIOVolumeSource protectionDomain(String protectionDomain) {

    this.protectionDomain = protectionDomain;
    return this;
  }

   /**
   * protectionDomain is the name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
  **/
  @jakarta.annotation.Nullable
  public String getProtectionDomain() {
    return protectionDomain;
  }


  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }


  public V1ScaleIOVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1ScaleIOVolumeSource secretRef(V1LocalObjectReference secretRef) {

    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nonnull
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  public V1ScaleIOVolumeSource sslEnabled(Boolean sslEnabled) {

    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * sslEnabled Flag enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @jakarta.annotation.Nullable
  public Boolean getSslEnabled() {
    return sslEnabled;
  }


  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }


  public V1ScaleIOVolumeSource storageMode(String storageMode) {

    this.storageMode = storageMode;
    return this;
  }

   /**
   * storageMode indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
  **/
  @jakarta.annotation.Nullable
  public String getStorageMode() {
    return storageMode;
  }


  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }


  public V1ScaleIOVolumeSource storagePool(String storagePool) {

    this.storagePool = storagePool;
    return this;
  }

   /**
   * storagePool is the ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
  **/
  @jakarta.annotation.Nullable
  public String getStoragePool() {
    return storagePool;
  }


  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }


  public V1ScaleIOVolumeSource system(String system) {

    this.system = system;
    return this;
  }

   /**
   * system is the name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @jakarta.annotation.Nonnull
  public String getSystem() {
    return system;
  }


  public void setSystem(String system) {
    this.system = system;
  }


  public V1ScaleIOVolumeSource volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

   /**
   * volumeName is the name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @jakarta.annotation.Nullable
  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ScaleIOVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ScaleIOVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ScaleIOVolumeSource is not found in the empty JSON string", V1ScaleIOVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ScaleIOVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ScaleIOVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ScaleIOVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
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
      V1LocalObjectReference.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
