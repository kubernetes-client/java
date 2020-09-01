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
import java.util.Objects;

/** StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes. */
@ApiModel(
    description =
        "StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecStorageos {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ThanosRulerSpecStorageosSecretRef secretRef;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";

  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public static final String SERIALIZED_NAME_VOLUME_NAMESPACE = "volumeNamespace";

  @SerializedName(SERIALIZED_NAME_VOLUME_NAMESPACE)
  private String volumeNamespace;

  public V1ThanosRulerSpecStorageos fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex.
   * \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be
   * \&quot;ext4\&quot; if unspecified.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecStorageos readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecStorageos secretRef(V1ThanosRulerSpecStorageosSecretRef secretRef) {

    this.secretRef = secretRef;
    return this;
  }

  /**
   * Get secretRef
   *
   * @return secretRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecStorageosSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecStorageosSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public V1ThanosRulerSpecStorageos volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

  /**
   * VolumeName is the human-readable name of the StorageOS volume. Volume names are only unique
   * within a namespace.
   *
   * @return volumeName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public V1ThanosRulerSpecStorageos volumeNamespace(String volumeNamespace) {

    this.volumeNamespace = volumeNamespace;
    return this;
  }

  /**
   * VolumeNamespace specifies the scope of the volume within StorageOS. If no namespace is
   * specified then the Pod&#39;s namespace will be used. This allows the Kubernetes name scoping to
   * be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override
   * the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within
   * StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   *
   * @return volumeNamespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
  public String getVolumeNamespace() {
    return volumeNamespace;
  }

  public void setVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecStorageos v1ThanosRulerSpecStorageos = (V1ThanosRulerSpecStorageos) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecStorageos.fsType)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecStorageos.readOnly)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecStorageos.secretRef)
        && Objects.equals(this.volumeName, v1ThanosRulerSpecStorageos.volumeName)
        && Objects.equals(this.volumeNamespace, v1ThanosRulerSpecStorageos.volumeNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecStorageos {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
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
