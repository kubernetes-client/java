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
import io.kubernetes.client.openapi.models.V1SecretReference;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CSIPersistentVolumeSource {
  public static final String SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF = "controllerExpandSecretRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF)
  private V1SecretReference controllerExpandSecretRef;

  public static final String SERIALIZED_NAME_CONTROLLER_PUBLISH_SECRET_REF = "controllerPublishSecretRef";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_PUBLISH_SECRET_REF)
  private V1SecretReference controllerPublishSecretRef;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_NODE_EXPAND_SECRET_REF = "nodeExpandSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_EXPAND_SECRET_REF)
  private V1SecretReference nodeExpandSecretRef;

  public static final String SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF = "nodePublishSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF)
  private V1SecretReference nodePublishSecretRef;

  public static final String SERIALIZED_NAME_NODE_STAGE_SECRET_REF = "nodeStageSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_STAGE_SECRET_REF)
  private V1SecretReference nodeStageSecretRef;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES = "volumeAttributes";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES)
  private Map<String, String> volumeAttributes = new HashMap<>();

  public static final String SERIALIZED_NAME_VOLUME_HANDLE = "volumeHandle";
  @SerializedName(SERIALIZED_NAME_VOLUME_HANDLE)
  private String volumeHandle;

  public V1CSIPersistentVolumeSource() {
  }

  public V1CSIPersistentVolumeSource controllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {

    this.controllerExpandSecretRef = controllerExpandSecretRef;
    return this;
  }

   /**
   * Get controllerExpandSecretRef
   * @return controllerExpandSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getControllerExpandSecretRef() {
    return controllerExpandSecretRef;
  }


  public void setControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
  }


  public V1CSIPersistentVolumeSource controllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {

    this.controllerPublishSecretRef = controllerPublishSecretRef;
    return this;
  }

   /**
   * Get controllerPublishSecretRef
   * @return controllerPublishSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getControllerPublishSecretRef() {
    return controllerPublishSecretRef;
  }


  public void setControllerPublishSecretRef(V1SecretReference controllerPublishSecretRef) {
    this.controllerPublishSecretRef = controllerPublishSecretRef;
  }


  public V1CSIPersistentVolumeSource driver(String driver) {

    this.driver = driver;
    return this;
  }

   /**
   * driver is the name of the driver to use for this volume. Required.
   * @return driver
  **/
  @jakarta.annotation.Nonnull
  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1CSIPersistentVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;.
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1CSIPersistentVolumeSource nodeExpandSecretRef(V1SecretReference nodeExpandSecretRef) {

    this.nodeExpandSecretRef = nodeExpandSecretRef;
    return this;
  }

   /**
   * Get nodeExpandSecretRef
   * @return nodeExpandSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getNodeExpandSecretRef() {
    return nodeExpandSecretRef;
  }


  public void setNodeExpandSecretRef(V1SecretReference nodeExpandSecretRef) {
    this.nodeExpandSecretRef = nodeExpandSecretRef;
  }


  public V1CSIPersistentVolumeSource nodePublishSecretRef(V1SecretReference nodePublishSecretRef) {

    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

   /**
   * Get nodePublishSecretRef
   * @return nodePublishSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }


  public void setNodePublishSecretRef(V1SecretReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }


  public V1CSIPersistentVolumeSource nodeStageSecretRef(V1SecretReference nodeStageSecretRef) {

    this.nodeStageSecretRef = nodeStageSecretRef;
    return this;
  }

   /**
   * Get nodeStageSecretRef
   * @return nodeStageSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1SecretReference getNodeStageSecretRef() {
    return nodeStageSecretRef;
  }


  public void setNodeStageSecretRef(V1SecretReference nodeStageSecretRef) {
    this.nodeStageSecretRef = nodeStageSecretRef;
  }


  public V1CSIPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1CSIPersistentVolumeSource volumeAttributes(Map<String, String> volumeAttributes) {

    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public V1CSIPersistentVolumeSource putVolumeAttributesItem(String key, String volumeAttributesItem) {
    if (this.volumeAttributes == null) {
      this.volumeAttributes = new HashMap<>();
    }
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

   /**
   * volumeAttributes of the volume to publish.
   * @return volumeAttributes
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }


  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }


  public V1CSIPersistentVolumeSource volumeHandle(String volumeHandle) {

    this.volumeHandle = volumeHandle;
    return this;
  }

   /**
   * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
   * @return volumeHandle
  **/
  @jakarta.annotation.Nonnull
  public String getVolumeHandle() {
    return volumeHandle;
  }


  public void setVolumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIPersistentVolumeSource v1CSIPersistentVolumeSource = (V1CSIPersistentVolumeSource) o;
    return Objects.equals(this.controllerExpandSecretRef, v1CSIPersistentVolumeSource.controllerExpandSecretRef) &&
        Objects.equals(this.controllerPublishSecretRef, v1CSIPersistentVolumeSource.controllerPublishSecretRef) &&
        Objects.equals(this.driver, v1CSIPersistentVolumeSource.driver) &&
        Objects.equals(this.fsType, v1CSIPersistentVolumeSource.fsType) &&
        Objects.equals(this.nodeExpandSecretRef, v1CSIPersistentVolumeSource.nodeExpandSecretRef) &&
        Objects.equals(this.nodePublishSecretRef, v1CSIPersistentVolumeSource.nodePublishSecretRef) &&
        Objects.equals(this.nodeStageSecretRef, v1CSIPersistentVolumeSource.nodeStageSecretRef) &&
        Objects.equals(this.readOnly, v1CSIPersistentVolumeSource.readOnly) &&
        Objects.equals(this.volumeAttributes, v1CSIPersistentVolumeSource.volumeAttributes) &&
        Objects.equals(this.volumeHandle, v1CSIPersistentVolumeSource.volumeHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controllerExpandSecretRef, controllerPublishSecretRef, driver, fsType, nodeExpandSecretRef, nodePublishSecretRef, nodeStageSecretRef, readOnly, volumeAttributes, volumeHandle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIPersistentVolumeSource {\n");
    sb.append("    controllerExpandSecretRef: ").append(toIndentedString(controllerExpandSecretRef)).append("\n");
    sb.append("    controllerPublishSecretRef: ").append(toIndentedString(controllerPublishSecretRef)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodeExpandSecretRef: ").append(toIndentedString(nodeExpandSecretRef)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    nodeStageSecretRef: ").append(toIndentedString(nodeStageSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
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
    openapiFields.add("controllerExpandSecretRef");
    openapiFields.add("controllerPublishSecretRef");
    openapiFields.add("driver");
    openapiFields.add("fsType");
    openapiFields.add("nodeExpandSecretRef");
    openapiFields.add("nodePublishSecretRef");
    openapiFields.add("nodeStageSecretRef");
    openapiFields.add("readOnly");
    openapiFields.add("volumeAttributes");
    openapiFields.add("volumeHandle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("volumeHandle");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CSIPersistentVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CSIPersistentVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CSIPersistentVolumeSource is not found in the empty JSON string", V1CSIPersistentVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CSIPersistentVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CSIPersistentVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CSIPersistentVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `controllerExpandSecretRef`
      if (jsonObj.get("controllerExpandSecretRef") != null && !jsonObj.get("controllerExpandSecretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("controllerExpandSecretRef"));
      }
      // validate the optional field `controllerPublishSecretRef`
      if (jsonObj.get("controllerPublishSecretRef") != null && !jsonObj.get("controllerPublishSecretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("controllerPublishSecretRef"));
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      // validate the optional field `nodeExpandSecretRef`
      if (jsonObj.get("nodeExpandSecretRef") != null && !jsonObj.get("nodeExpandSecretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("nodeExpandSecretRef"));
      }
      // validate the optional field `nodePublishSecretRef`
      if (jsonObj.get("nodePublishSecretRef") != null && !jsonObj.get("nodePublishSecretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("nodePublishSecretRef"));
      }
      // validate the optional field `nodeStageSecretRef`
      if (jsonObj.get("nodeStageSecretRef") != null && !jsonObj.get("nodeStageSecretRef").isJsonNull()) {
        V1SecretReference.validateJsonObject(jsonObj.getAsJsonObject("nodeStageSecretRef"));
      }
      if (!jsonObj.get("volumeHandle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeHandle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeHandle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CSIPersistentVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CSIPersistentVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CSIPersistentVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CSIPersistentVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CSIPersistentVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1CSIPersistentVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CSIPersistentVolumeSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CSIPersistentVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CSIPersistentVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1CSIPersistentVolumeSource
  */
  public static V1CSIPersistentVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CSIPersistentVolumeSource.class);
  }

 /**
  * Convert an instance of V1CSIPersistentVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
