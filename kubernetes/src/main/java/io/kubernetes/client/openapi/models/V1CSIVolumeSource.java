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

/** Represents a source location of a volume to mount, managed by an external CSI driver */
@ApiModel(
    description =
        "Represents a source location of a volume to mount, managed by an external CSI driver")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
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
  private Map<String, String> volumeAttributes = null;

  public V1CSIVolumeSource driver(String driver) {

    this.driver = driver;
    return this;
  }

  /**
   * driver is the name of the CSI driver that handles this volume. Consult with your admin for the
   * correct name as registered in the cluster.
   *
   * @return driver
   */
  @ApiModelProperty(
      required = true,
      value =
          "driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.")
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
   * fsType to mount. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. If not
   * provided, the empty value is passed to the associated CSI driver which will determine the
   * default filesystem to apply.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.")
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
   *
   * @return nodePublishSecretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly specifies a read-only configuration for the volume. Defaults to false (read/write).")
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
   * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult
   * your driver&#39;s documentation for supported values.
   *
   * @return volumeAttributes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.")
  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }

  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CSIVolumeSource v1CSIVolumeSource = (V1CSIVolumeSource) o;
    return Objects.equals(this.driver, v1CSIVolumeSource.driver)
        && Objects.equals(this.fsType, v1CSIVolumeSource.fsType)
        && Objects.equals(this.nodePublishSecretRef, v1CSIVolumeSource.nodePublishSecretRef)
        && Objects.equals(this.readOnly, v1CSIVolumeSource.readOnly)
        && Objects.equals(this.volumeAttributes, v1CSIVolumeSource.volumeAttributes);
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
    sb.append("    nodePublishSecretRef: ")
        .append(toIndentedString(nodePublishSecretRef))
        .append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
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
