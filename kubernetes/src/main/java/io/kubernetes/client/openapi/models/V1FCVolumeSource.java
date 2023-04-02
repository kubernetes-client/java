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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once.
 * Fibre Channel volumes support ownership management and SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1FCVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_LUN = "lun";

  @SerializedName(SERIALIZED_NAME_LUN)
  private Integer lun;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_TARGET_W_W_NS = "targetWWNs";

  @SerializedName(SERIALIZED_NAME_TARGET_W_W_NS)
  private List<String> targetWWNs = null;

  public static final String SERIALIZED_NAME_WWIDS = "wwids";

  @SerializedName(SERIALIZED_NAME_WWIDS)
  private List<String> wwids = null;

  public V1FCVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * fsType is the filesystem type to mount. Must be a filesystem type supported by the host
   * operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly
   * inferred to be \&quot;ext4\&quot; if unspecified.
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType is the filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1FCVolumeSource lun(Integer lun) {

    this.lun = lun;
    return this;
  }

  /**
   * lun is Optional: FC target lun number
   *
   * @return lun
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "lun is Optional: FC target lun number")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1FCVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly
   * setting in VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1FCVolumeSource targetWWNs(List<String> targetWWNs) {

    this.targetWWNs = targetWWNs;
    return this;
  }

  public V1FCVolumeSource addTargetWWNsItem(String targetWWNsItem) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList<>();
    }
    this.targetWWNs.add(targetWWNsItem);
    return this;
  }

  /**
   * targetWWNs is Optional: FC target worldwide names (WWNs)
   *
   * @return targetWWNs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "targetWWNs is Optional: FC target worldwide names (WWNs)")
  public List<String> getTargetWWNs() {
    return targetWWNs;
  }

  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }

  public V1FCVolumeSource wwids(List<String> wwids) {

    this.wwids = wwids;
    return this;
  }

  public V1FCVolumeSource addWwidsItem(String wwidsItem) {
    if (this.wwids == null) {
      this.wwids = new ArrayList<>();
    }
    this.wwids.add(wwidsItem);
    return this;
  }

  /**
   * wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
   * targetWWNs and lun must be set, but not both simultaneously.
   *
   * @return wwids
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "wwids Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
  public List<String> getWwids() {
    return wwids;
  }

  public void setWwids(List<String> wwids) {
    this.wwids = wwids;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FCVolumeSource v1FCVolumeSource = (V1FCVolumeSource) o;
    return Objects.equals(this.fsType, v1FCVolumeSource.fsType)
        && Objects.equals(this.lun, v1FCVolumeSource.lun)
        && Objects.equals(this.readOnly, v1FCVolumeSource.readOnly)
        && Objects.equals(this.targetWWNs, v1FCVolumeSource.targetWWNs)
        && Objects.equals(this.wwids, v1FCVolumeSource.wwids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs, wwids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FCVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetWWNs: ").append(toIndentedString(targetWWNs)).append("\n");
    sb.append("    wwids: ").append(toIndentedString(wwids)).append("\n");
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
