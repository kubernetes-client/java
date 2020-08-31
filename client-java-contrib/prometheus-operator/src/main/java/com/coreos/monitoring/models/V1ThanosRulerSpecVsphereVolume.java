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

/** VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine */
@ApiModel(
    description =
        "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecVsphereVolume {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_I_D = "storagePolicyID";

  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_I_D)
  private String storagePolicyID;

  public static final String SERIALIZED_NAME_STORAGE_POLICY_NAME = "storagePolicyName";

  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NAME)
  private String storagePolicyName;

  public static final String SERIALIZED_NAME_VOLUME_PATH = "volumePath";

  @SerializedName(SERIALIZED_NAME_VOLUME_PATH)
  private String volumePath;

  public V1ThanosRulerSpecVsphereVolume fsType(String fsType) {

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

  public V1ThanosRulerSpecVsphereVolume storagePolicyID(String storagePolicyID) {

    this.storagePolicyID = storagePolicyID;
    return this;
  }

  /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   *
   * @return storagePolicyID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }

  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }

  public V1ThanosRulerSpecVsphereVolume storagePolicyName(String storagePolicyName) {

    this.storagePolicyName = storagePolicyName;
    return this;
  }

  /**
   * Storage Policy Based Management (SPBM) profile name.
   *
   * @return storagePolicyName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  public V1ThanosRulerSpecVsphereVolume volumePath(String volumePath) {

    this.volumePath = volumePath;
    return this;
  }

  /**
   * Path that identifies vSphere volume vmdk
   *
   * @return volumePath
   */
  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")
  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecVsphereVolume v1ThanosRulerSpecVsphereVolume =
        (V1ThanosRulerSpecVsphereVolume) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecVsphereVolume.fsType)
        && Objects.equals(this.storagePolicyID, v1ThanosRulerSpecVsphereVolume.storagePolicyID)
        && Objects.equals(this.storagePolicyName, v1ThanosRulerSpecVsphereVolume.storagePolicyName)
        && Objects.equals(this.volumePath, v1ThanosRulerSpecVsphereVolume.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecVsphereVolume {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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
