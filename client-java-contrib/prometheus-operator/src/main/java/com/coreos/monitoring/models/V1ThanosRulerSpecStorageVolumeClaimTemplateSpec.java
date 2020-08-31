/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Spec defines the desired characteristics of a volume requested by a pod author. More info:
 * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@ApiModel(
    description =
        "Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecStorageVolumeClaimTemplateSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";

  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";

  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private V1ThanosRulerSpecStorageVolumeClaimTemplateSpecDataSource dataSource;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ThanosRulerSpecStorageVolumeClaimTemplateSpecResources resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1ThanosRulerSpecStorageVolumeClaimTemplateSpecSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";

  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";

  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";

  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec addAccessModesItem(
      String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<String>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

  /**
   * AccessModes contains the desired access modes the volume should have. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   *
   * @return accessModes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec dataSource(
      V1ThanosRulerSpecStorageVolumeClaimTemplateSpecDataSource dataSource) {

    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   *
   * @return dataSource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpecDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(V1ThanosRulerSpecStorageVolumeClaimTemplateSpecDataSource dataSource) {
    this.dataSource = dataSource;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec resources(
      V1ThanosRulerSpecStorageVolumeClaimTemplateSpecResources resources) {

    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpecResources getResources() {
    return resources;
  }

  public void setResources(V1ThanosRulerSpecStorageVolumeClaimTemplateSpecResources resources) {
    this.resources = resources;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec selector(
      V1ThanosRulerSpecStorageVolumeClaimTemplateSpecSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpecSelector getSelector() {
    return selector;
  }

  public void setSelector(V1ThanosRulerSpecStorageVolumeClaimTemplateSpecSelector selector) {
    this.selector = selector;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec storageClassName(String storageClassName) {

    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * Name of the StorageClass required by the claim. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   *
   * @return storageClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec volumeMode(String volumeMode) {

    this.volumeMode = volumeMode;
    return this;
  }

  /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied
   * when not included in claim spec. This is a beta feature.
   *
   * @return volumeMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public V1ThanosRulerSpecStorageVolumeClaimTemplateSpec volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

  /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   *
   * @return volumeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")
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
    V1ThanosRulerSpecStorageVolumeClaimTemplateSpec
        v1ThanosRulerSpecStorageVolumeClaimTemplateSpec =
            (V1ThanosRulerSpecStorageVolumeClaimTemplateSpec) o;
    return Objects.equals(
            this.accessModes, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.accessModes)
        && Objects.equals(
            this.dataSource, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.dataSource)
        && Objects.equals(this.resources, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.resources)
        && Objects.equals(this.selector, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.selector)
        && Objects.equals(
            this.storageClassName, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.storageClassName)
        && Objects.equals(
            this.volumeMode, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.volumeMode)
        && Objects.equals(
            this.volumeName, v1ThanosRulerSpecStorageVolumeClaimTemplateSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessModes, dataSource, resources, selector, storageClassName, volumeMode, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecStorageVolumeClaimTemplateSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
