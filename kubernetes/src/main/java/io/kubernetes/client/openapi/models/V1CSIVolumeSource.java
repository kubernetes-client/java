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
 * Represents a source location of a volume to mount, managed by an external CSI driver
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1CSIVolumeSource {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF = "nodePublishSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF)
  private V1LocalObjectReference nodePublishSecretRef;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES = "volumeAttributes";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES)
  private Map<String, String> volumeAttributes = new HashMap<>();

  public V1CSIVolumeSource() {
  }

  public V1CSIVolumeSource driver(String driver) {

    this.driver = driver;
    return this;
  }

   /**
   * driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
   * @return driver
  **/
  @jakarta.annotation.Nonnull
  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public V1CSIVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * fsType to mount. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
   * @return fsType
  **/
  @jakarta.annotation.Nullable
  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public V1CSIVolumeSource nodePublishSecretRef(V1LocalObjectReference nodePublishSecretRef) {

    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

   /**
   * Get nodePublishSecretRef
   * @return nodePublishSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1LocalObjectReference getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }


  public void setNodePublishSecretRef(V1LocalObjectReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }


  public V1CSIVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1CSIVolumeSource volumeAttributes(Map<String, String> volumeAttributes) {

    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public V1CSIVolumeSource putVolumeAttributesItem(String key, String volumeAttributesItem) {
    if (this.volumeAttributes == null) {
      this.volumeAttributes = new HashMap<>();
    }
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

   /**
   * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
   * @return volumeAttributes
  **/
  @jakarta.annotation.Nullable
  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }


  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIVolumeSource v1CSIVolumeSource = (V1CSIVolumeSource) o;
    return Objects.equals(this.driver, v1CSIVolumeSource.driver) &&
        Objects.equals(this.fsType, v1CSIVolumeSource.fsType) &&
        Objects.equals(this.nodePublishSecretRef, v1CSIVolumeSource.nodePublishSecretRef) &&
        Objects.equals(this.readOnly, v1CSIVolumeSource.readOnly) &&
        Objects.equals(this.volumeAttributes, v1CSIVolumeSource.volumeAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIVolumeSource {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
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
    openapiFields.add("driver");
    openapiFields.add("fsType");
    openapiFields.add("nodePublishSecretRef");
    openapiFields.add("readOnly");
    openapiFields.add("volumeAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("driver");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CSIVolumeSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CSIVolumeSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CSIVolumeSource is not found in the empty JSON string", V1CSIVolumeSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CSIVolumeSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CSIVolumeSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1CSIVolumeSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if ((jsonObj.get("fsType") != null && !jsonObj.get("fsType").isJsonNull()) && !jsonObj.get("fsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fsType").toString()));
      }
      // validate the optional field `nodePublishSecretRef`
      if (jsonObj.get("nodePublishSecretRef") != null && !jsonObj.get("nodePublishSecretRef").isJsonNull()) {
        V1LocalObjectReference.validateJsonObject(jsonObj.getAsJsonObject("nodePublishSecretRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CSIVolumeSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CSIVolumeSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CSIVolumeSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CSIVolumeSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CSIVolumeSource>() {
           @Override
           public void write(JsonWriter out, V1CSIVolumeSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CSIVolumeSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CSIVolumeSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CSIVolumeSource
  * @throws IOException if the JSON string is invalid with respect to V1CSIVolumeSource
  */
  public static V1CSIVolumeSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CSIVolumeSource.class);
  }

 /**
  * Convert an instance of V1CSIVolumeSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
