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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@ApiModel(description = "PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-12T23:11:52.603861Z[Etc/UTC]")
public class V1PersistentVolumeClaimSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")

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
   * volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string or nil value indicates that no VolumeAttributesClass will be applied to the claim. If the claim enters an Infeasible error state, this field can be reset to its previous value (including nil) to cancel the modification. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/
   * @return volumeAttributesClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeAttributesClassName may be used to set the VolumeAttributesClass used by this claim. If specified, the CSI driver will create or update the volume with the attributes defined in the corresponding VolumeAttributesClass. This has a different purpose than storageClassName, it can be changed after the claim is created. An empty string or nil value indicates that no VolumeAttributesClass will be applied to the claim. If the claim enters an Infeasible error state, this field can be reset to its previous value (including nil) to cancel the modification. If the resource referred to by volumeAttributesClass does not exist, this PersistentVolumeClaim will be set to a Pending state, as reflected by the modifyVolumeStatus field, until such as a resource exists. More info: https://kubernetes.io/docs/concepts/storage/volume-attributes-classes/")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeName is the binding reference to the PersistentVolume backing this claim.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
