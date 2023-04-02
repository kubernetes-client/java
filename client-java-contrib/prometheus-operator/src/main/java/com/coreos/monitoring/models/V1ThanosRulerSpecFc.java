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
 * FC represents a Fibre Channel resource that is attached to a kubelet&#39;s host machine and then
 * exposed to the pod.
 */
@ApiModel(
    description =
        "FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecFc {
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

  public V1ThanosRulerSpecFc fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex.
   * \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be
   * \&quot;ext4\&quot; if unspecified. TODO: how do we prevent errors in the filesystem from
   * compromising the machine
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. TODO: how do we prevent errors in the filesystem from compromising the machine")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecFc lun(Integer lun) {

    this.lun = lun;
    return this;
  }

  /**
   * Optional: FC target lun number
   *
   * @return lun
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: FC target lun number")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1ThanosRulerSpecFc readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
   * VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecFc targetWWNs(List<String> targetWWNs) {

    this.targetWWNs = targetWWNs;
    return this;
  }

  public V1ThanosRulerSpecFc addTargetWWNsItem(String targetWWNsItem) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList<String>();
    }
    this.targetWWNs.add(targetWWNsItem);
    return this;
  }

  /**
   * Optional: FC target worldwide names (WWNs)
   *
   * @return targetWWNs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: FC target worldwide names (WWNs)")
  public List<String> getTargetWWNs() {
    return targetWWNs;
  }

  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }

  public V1ThanosRulerSpecFc wwids(List<String> wwids) {

    this.wwids = wwids;
    return this;
  }

  public V1ThanosRulerSpecFc addWwidsItem(String wwidsItem) {
    if (this.wwids == null) {
      this.wwids = new ArrayList<String>();
    }
    this.wwids.add(wwidsItem);
    return this;
  }

  /**
   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs
   * and lun must be set, but not both simultaneously.
   *
   * @return wwids
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
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
    V1ThanosRulerSpecFc v1ThanosRulerSpecFc = (V1ThanosRulerSpecFc) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecFc.fsType)
        && Objects.equals(this.lun, v1ThanosRulerSpecFc.lun)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecFc.readOnly)
        && Objects.equals(this.targetWWNs, v1ThanosRulerSpecFc.targetWWNs)
        && Objects.equals(this.wwids, v1ThanosRulerSpecFc.wwids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs, wwids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecFc {\n");
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
