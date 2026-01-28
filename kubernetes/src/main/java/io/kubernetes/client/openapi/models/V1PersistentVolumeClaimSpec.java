/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1TypedLocalObjectReference;
import io.kubernetes.client.openapi.models.V1TypedObjectReference;
import io.kubernetes.client.openapi.models.V1VolumeResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@ApiModel(description = "PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-01-21T21:30:13.305152Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class V1PersistentVolumeClaimSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  @jakarta.annotation.Nullable
  private List<String> accessModes = new ArrayList<>();

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  @jakarta.annotation.Nullable
  private V1TypedLocalObjectReference dataSource;

  public static final String SERIALIZED_NAME_DATA_SOURCE_REF = "dataSourceRef";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_REF)
  @jakarta.annotation.Nullable
  private V1TypedObjectReference dataSourceRef;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  @jakarta.annotation.Nullable
  private V1VolumeResourceRequirements resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  @jakarta.annotation.Nullable
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME = "volumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String volumeAttributesClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  @jakarta.annotation.Nullable
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  @jakarta.annotation.Nullable
  private String volumeName;

  public V1PersistentVolumeClaimSpec() {
  }

  public V1PersistentVolumeClaimSpec accessModes(@jakarta.annotation.Nullable List<String> accessModes) {
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
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(@jakarta.annotation.Nullable List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1PersistentVolumeClaimSpec dataSource(@jakarta.annotation.Nullable V1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   * @return dataSource
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TypedLocalObjectReference getDataSource() {
    return dataSource;
  }

  public void setDataSource(@jakarta.annotation.Nullable V1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }


  public V1PersistentVolumeClaimSpec dataSourceRef(@jakarta.annotation.Nullable V1TypedObjectReference dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
    return this;
  }

  /**
   * Get dataSourceRef
   * @return dataSourceRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1TypedObjectReference getDataSourceRef() {
    return dataSourceRef;
  }

  public void setDataSourceRef(@jakarta.annotation.Nullable V1TypedObjectReference dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
  }


  public V1PersistentVolumeClaimSpec resources(@jakarta.annotation.Nullable V1VolumeResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeResourceRequirements getResources() {
    return resources;
  }

  public void setResources(@jakarta.annotation.Nullable V1VolumeResourceRequirements resources) {
    this.resources = resources;
  }


  public V1PersistentVolumeClaimSpec selector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   * @return selector
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(@jakarta.annotation.Nullable V1LabelSelector selector) {
    this.selector = selector;
  }


  public V1PersistentVolumeClaimSpec storageClassName(@jakarta.annotation.Nullable String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(@jakarta.annotation.Nullable String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public V1PersistentVolumeClaimSpec volumeAttributesClassName(@jakarta.annotation.Nullable String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
    return this;
  }

  /**
   * volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string or nil value indicates that no VolumeAttributesClass will be applied to the claim. If the claim enters an Infeasible error state, this field can be reset to its previous value (including nil) to cancel the modification. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/
   * @return volumeAttributesClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string or nil value indicates that no VolumeAttributesClass will be applied to the claim. If the claim enters an Infeasible error state, this field can be reset to its previous value (including nil) to cancel the modification. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/")
  public String getVolumeAttributesClassName() {
    return volumeAttributesClassName;
  }

  public void setVolumeAttributesClassName(@jakarta.annotation.Nullable String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
  }


  public V1PersistentVolumeClaimSpec volumeMode(@jakarta.annotation.Nullable String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

  /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
   * @return volumeMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(@jakarta.annotation.Nullable String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public V1PersistentVolumeClaimSpec volumeName(@jakarta.annotation.Nullable String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * volumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeName is the binding reference to the PersistentVolume backing this claim.")
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
    openapiFields = new HashSet<String>(Arrays.asList("accessModes", "dataSource", "dataSourceRef", "resources", "selector", "storageClassName", "volumeAttributesClassName", "volumeMode", "volumeName"));

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>(0);
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PersistentVolumeClaimSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PersistentVolumeClaimSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The required field(s) %s in V1PersistentVolumeClaimSpec is not found in the empty JSON string", V1PersistentVolumeClaimSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PersistentVolumeClaimSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "The field `%s` in the JSON string is not defined in the `V1PersistentVolumeClaimSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessModes") != null && !jsonObj.get("accessModes").isJsonNull() && !jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        V1TypedLocalObjectReference.validateJsonElement(jsonObj.get("dataSource"));
      }
      // validate the optional field `dataSourceRef`
      if (jsonObj.get("dataSourceRef") != null && !jsonObj.get("dataSourceRef").isJsonNull()) {
        V1TypedObjectReference.validateJsonElement(jsonObj.get("dataSourceRef"));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        V1VolumeResourceRequirements.validateJsonElement(jsonObj.get("resources"));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonElement(jsonObj.get("selector"));
      }
      if ((jsonObj.get("storageClassName") != null && !jsonObj.get("storageClassName").isJsonNull()) && !jsonObj.get("storageClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `storageClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClassName").toString()));
      }
      if ((jsonObj.get("volumeAttributesClassName") != null && !jsonObj.get("volumeAttributesClassName").isJsonNull()) && !jsonObj.get("volumeAttributesClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `volumeAttributesClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeAttributesClassName").toString()));
      }
      if ((jsonObj.get("volumeMode") != null && !jsonObj.get("volumeMode").isJsonNull()) && !jsonObj.get("volumeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `volumeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMode").toString()));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format(java.util.Locale.ROOT, "Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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
