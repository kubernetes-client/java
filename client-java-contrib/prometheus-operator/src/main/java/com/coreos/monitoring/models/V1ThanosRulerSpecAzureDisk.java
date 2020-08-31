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

/** AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod. */
@ApiModel(
    description =
        "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAzureDisk {
  public static final String SERIALIZED_NAME_CACHING_MODE = "cachingMode";

  @SerializedName(SERIALIZED_NAME_CACHING_MODE)
  private String cachingMode;

  public static final String SERIALIZED_NAME_DISK_NAME = "diskName";

  @SerializedName(SERIALIZED_NAME_DISK_NAME)
  private String diskName;

  public static final String SERIALIZED_NAME_DISK_U_R_I = "diskURI";

  @SerializedName(SERIALIZED_NAME_DISK_U_R_I)
  private String diskURI;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1ThanosRulerSpecAzureDisk cachingMode(String cachingMode) {

    this.cachingMode = cachingMode;
    return this;
  }

  /**
   * Host Caching mode: None, Read Only, Read Write.
   *
   * @return cachingMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host Caching mode: None, Read Only, Read Write.")
  public String getCachingMode() {
    return cachingMode;
  }

  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }

  public V1ThanosRulerSpecAzureDisk diskName(String diskName) {

    this.diskName = diskName;
    return this;
  }

  /**
   * The Name of the data disk in the blob storage
   *
   * @return diskName
   */
  @ApiModelProperty(required = true, value = "The Name of the data disk in the blob storage")
  public String getDiskName() {
    return diskName;
  }

  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }

  public V1ThanosRulerSpecAzureDisk diskURI(String diskURI) {

    this.diskURI = diskURI;
    return this;
  }

  /**
   * The URI the data disk in the blob storage
   *
   * @return diskURI
   */
  @ApiModelProperty(required = true, value = "The URI the data disk in the blob storage")
  public String getDiskURI() {
    return diskURI;
  }

  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }

  public V1ThanosRulerSpecAzureDisk fsType(String fsType) {

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

  public V1ThanosRulerSpecAzureDisk kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Expected values Shared: multiple blob disks per storage account Dedicated: single blob disk per
   * storage account Managed: azure managed data disk (only in managed availability set). defaults
   * to shared
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ThanosRulerSpecAzureDisk readOnly(Boolean readOnly) {

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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAzureDisk v1ThanosRulerSpecAzureDisk = (V1ThanosRulerSpecAzureDisk) o;
    return Objects.equals(this.cachingMode, v1ThanosRulerSpecAzureDisk.cachingMode)
        && Objects.equals(this.diskName, v1ThanosRulerSpecAzureDisk.diskName)
        && Objects.equals(this.diskURI, v1ThanosRulerSpecAzureDisk.diskURI)
        && Objects.equals(this.fsType, v1ThanosRulerSpecAzureDisk.fsType)
        && Objects.equals(this.kind, v1ThanosRulerSpecAzureDisk.kind)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecAzureDisk.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecAzureDisk {\n");
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
