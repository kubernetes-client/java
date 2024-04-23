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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
import io.kubernetes.client.openapi.models.V1TypedObjectReference;
import io.kubernetes.client.openapi.models.V1VolumeResourceRequirements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1PersistentVolumeClaimSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private V1TypedLocalObjectReference dataSource;

  public static final String SERIALIZED_NAME_DATA_SOURCE_REF = "dataSourceRef";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_REF)
  private V1TypedObjectReference dataSourceRef;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1VolumeResourceRequirements resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME = "volumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME)
  private String volumeAttributesClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1PersistentVolumeClaimSpec() {
  }

  public V1PersistentVolumeClaimSpec accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public V1PersistentVolumeClaimSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @jakarta.annotation.Nullable
  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1PersistentVolumeClaimSpec dataSource(V1TypedLocalObjectReference dataSource) {

    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @jakarta.annotation.Nullable
  public V1TypedLocalObjectReference getDataSource() {
    return dataSource;
  }


  public void setDataSource(V1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }


  public V1PersistentVolumeClaimSpec dataSourceRef(V1TypedObjectReference dataSourceRef) {

    this.dataSourceRef = dataSourceRef;
    return this;
  }

   /**
   * Get dataSourceRef
   * @return dataSourceRef
  **/
  @jakarta.annotation.Nullable
  public V1TypedObjectReference getDataSourceRef() {
    return dataSourceRef;
  }


  public void setDataSourceRef(V1TypedObjectReference dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
  }


  public V1PersistentVolumeClaimSpec resources(V1VolumeResourceRequirements resources) {

    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  public V1VolumeResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1VolumeResourceRequirements resources) {
    this.resources = resources;
  }


  public V1PersistentVolumeClaimSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1PersistentVolumeClaimSpec storageClassName(String storageClassName) {

    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @jakarta.annotation.Nullable
  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public V1PersistentVolumeClaimSpec volumeAttributesClassName(String volumeAttributesClassName) {

    this.volumeAttributesClassName = volumeAttributesClassName;
    return this;
  }

   /**
   * volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string value means that no VolumeAttributesClass will be applied to the claim but it&#39;s not allowed to reset this field to empty string once it is set. If unspecified and the PersistentVolumeClaim is unbound, the default VolumeAttributesClass will be set by the persistentvolume controller if it exists. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/ (Alpha) Using this field requires the VolumeAttributesClass feature gate to be enabled.
   * @return volumeAttributesClassName
  **/
  @jakarta.annotation.Nullable
  public String getVolumeAttributesClassName() {
    return volumeAttributesClassName;
  }


  public void setVolumeAttributesClassName(String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
  }


  public V1PersistentVolumeClaimSpec volumeMode(String volumeMode) {

    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
   * @return volumeMode
  **/
  @jakarta.annotation.Nullable
  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public V1PersistentVolumeClaimSpec volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

   /**
   * volumeName is the binding reference to the PersistentVolume backing this claim.
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
    V1PersistentVolumeClaimSpec v1PersistentVolumeClaimSpec = (V1PersistentVolumeClaimSpec) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeClaimSpec.accessModes) &&
        Objects.equals(this.dataSource, v1PersistentVolumeClaimSpec.dataSource) &&
        Objects.equals(this.dataSourceRef, v1PersistentVolumeClaimSpec.dataSourceRef) &&
        Objects.equals(this.resources, v1PersistentVolumeClaimSpec.resources) &&
        Objects.equals(this.selector, v1PersistentVolumeClaimSpec.selector) &&
        Objects.equals(this.storageClassName, v1PersistentVolumeClaimSpec.storageClassName) &&
        Objects.equals(this.volumeAttributesClassName, v1PersistentVolumeClaimSpec.volumeAttributesClassName) &&
        Objects.equals(this.volumeMode, v1PersistentVolumeClaimSpec.volumeMode) &&
        Objects.equals(this.volumeName, v1PersistentVolumeClaimSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, dataSourceRef, resources, selector, storageClassName, volumeAttributesClassName, volumeMode, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    dataSourceRef: ").append(toIndentedString(dataSourceRef)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeAttributesClassName: ").append(toIndentedString(volumeAttributesClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
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
    openapiFields.add("accessModes");
    openapiFields.add("dataSource");
    openapiFields.add("dataSourceRef");
    openapiFields.add("resources");
    openapiFields.add("selector");
    openapiFields.add("storageClassName");
    openapiFields.add("volumeAttributesClassName");
    openapiFields.add("volumeMode");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1PersistentVolumeClaimSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1PersistentVolumeClaimSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PersistentVolumeClaimSpec is not found in the empty JSON string", V1PersistentVolumeClaimSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1PersistentVolumeClaimSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PersistentVolumeClaimSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessModes") != null && !jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        V1TypedLocalObjectReference.validateJsonObject(jsonObj.getAsJsonObject("dataSource"));
      }
      // validate the optional field `dataSourceRef`
      if (jsonObj.get("dataSourceRef") != null && !jsonObj.get("dataSourceRef").isJsonNull()) {
        V1TypedObjectReference.validateJsonObject(jsonObj.getAsJsonObject("dataSourceRef"));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1VolumeResourceRequirements.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
      if ((jsonObj.get("storageClassName") != null && !jsonObj.get("storageClassName").isJsonNull()) && !jsonObj.get("storageClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClassName").toString()));
      }
      if ((jsonObj.get("volumeAttributesClassName") != null && !jsonObj.get("volumeAttributesClassName").isJsonNull()) && !jsonObj.get("volumeAttributesClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeAttributesClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeAttributesClassName").toString()));
      }
      if ((jsonObj.get("volumeMode") != null && !jsonObj.get("volumeMode").isJsonNull()) && !jsonObj.get("volumeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMode").toString()));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PersistentVolumeClaimSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PersistentVolumeClaimSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PersistentVolumeClaimSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PersistentVolumeClaimSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PersistentVolumeClaimSpec>() {
           @Override
           public void write(JsonWriter out, V1PersistentVolumeClaimSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PersistentVolumeClaimSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1PersistentVolumeClaimSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1PersistentVolumeClaimSpec
  * @throws IOException if the JSON string is invalid with respect to V1PersistentVolumeClaimSpec
  */
  public static V1PersistentVolumeClaimSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PersistentVolumeClaimSpec.class);
  }

 /**
  * Convert an instance of V1PersistentVolumeClaimSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
