/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Represents storage that is managed by an external CSI volume driver (Beta feature) */
@ApiModel(
    description =
        "Represents storage that is managed by an external CSI volume driver (Beta feature)")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CSIPersistentVolumeSource {
  public static final String SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF =
      "controllerExpandSecretRef";

  @SerializedName(SERIALIZED_NAME_CONTROLLER_EXPAND_SECRET_REF)
  private V1SecretReference controllerExpandSecretRef;

  public static final String SERIALIZED_NAME_CONTROLLER_PUBLISH_SECRET_REF =
      "controllerPublishSecretRef";

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
  private Map<String, String> volumeAttributes = null;

  public static final String SERIALIZED_NAME_VOLUME_HANDLE = "volumeHandle";

  @SerializedName(SERIALIZED_NAME_VOLUME_HANDLE)
  private String volumeHandle;

  public V1CSIPersistentVolumeSource controllerExpandSecretRef(
      V1SecretReference controllerExpandSecretRef) {

    this.controllerExpandSecretRef = controllerExpandSecretRef;
    return this;
  }

  /**
   * Get controllerExpandSecretRef
   *
   * @return controllerExpandSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SecretReference getControllerExpandSecretRef() {
    return controllerExpandSecretRef;
  }

  public void setControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
  }

  public V1CSIPersistentVolumeSource controllerPublishSecretRef(
      V1SecretReference controllerPublishSecretRef) {

    this.controllerPublishSecretRef = controllerPublishSecretRef;
    return this;
  }

  /**
   * Get controllerPublishSecretRef
   *
   * @return controllerPublishSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   *
   * @return driver
   */
  @ApiModelProperty(
      required = true,
      value = "driver is the name of the driver to use for this volume. Required.")
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
   * fsType to mount. Must be a filesystem type supported by the host operating system. Ex.
   * \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\".")
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
   *
   * @return nodeExpandSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   *
   * @return nodePublishSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   *
   * @return nodeStageSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).")
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

  public V1CSIPersistentVolumeSource putVolumeAttributesItem(
      String key, String volumeAttributesItem) {
    if (this.volumeAttributes == null) {
      this.volumeAttributes = new HashMap<>();
    }
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

  /**
   * volumeAttributes of the volume to publish.
   *
   * @return volumeAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeAttributes of the volume to publish.")
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
   * volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to
   * refer to the volume on all subsequent calls. Required.
   *
   * @return volumeHandle
   */
  @ApiModelProperty(
      required = true,
      value =
          "volumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.")
  public String getVolumeHandle() {
    return volumeHandle;
  }

  public void setVolumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIPersistentVolumeSource v1CSIPersistentVolumeSource = (V1CSIPersistentVolumeSource) o;
    return Objects.equals(
            this.controllerExpandSecretRef, v1CSIPersistentVolumeSource.controllerExpandSecretRef)
        && Objects.equals(
            this.controllerPublishSecretRef, v1CSIPersistentVolumeSource.controllerPublishSecretRef)
        && Objects.equals(this.driver, v1CSIPersistentVolumeSource.driver)
        && Objects.equals(this.fsType, v1CSIPersistentVolumeSource.fsType)
        && Objects.equals(this.nodeExpandSecretRef, v1CSIPersistentVolumeSource.nodeExpandSecretRef)
        && Objects.equals(
            this.nodePublishSecretRef, v1CSIPersistentVolumeSource.nodePublishSecretRef)
        && Objects.equals(this.nodeStageSecretRef, v1CSIPersistentVolumeSource.nodeStageSecretRef)
        && Objects.equals(this.readOnly, v1CSIPersistentVolumeSource.readOnly)
        && Objects.equals(this.volumeAttributes, v1CSIPersistentVolumeSource.volumeAttributes)
        && Objects.equals(this.volumeHandle, v1CSIPersistentVolumeSource.volumeHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        controllerExpandSecretRef,
        controllerPublishSecretRef,
        driver,
        fsType,
        nodeExpandSecretRef,
        nodePublishSecretRef,
        nodeStageSecretRef,
        readOnly,
        volumeAttributes,
        volumeHandle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CSIPersistentVolumeSource {\n");
    sb.append("    controllerExpandSecretRef: ")
        .append(toIndentedString(controllerExpandSecretRef))
        .append("\n");
    sb.append("    controllerPublishSecretRef: ")
        .append(toIndentedString(controllerPublishSecretRef))
        .append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodeExpandSecretRef: ")
        .append(toIndentedString(nodeExpandSecretRef))
        .append("\n");
    sb.append("    nodePublishSecretRef: ")
        .append(toIndentedString(nodePublishSecretRef))
        .append("\n");
    sb.append("    nodeStageSecretRef: ").append(toIndentedString(nodeStageSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
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
