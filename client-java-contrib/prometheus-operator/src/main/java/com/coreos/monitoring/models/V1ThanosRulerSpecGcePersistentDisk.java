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

/**
 * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine
 * and then exposed to the pod. More info:
 * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
 */
@ApiModel(
    description =
        "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecGcePersistentDisk {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";

  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_PD_NAME = "pdName";

  @SerializedName(SERIALIZED_NAME_PD_NAME)
  private String pdName;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public V1ThanosRulerSpecGcePersistentDisk fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is
   * supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;,
   * \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent
   * errors in the filesystem from compromising the machine
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk TODO: how do we prevent errors in the filesystem from compromising the machine")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecGcePersistentDisk partition(Integer partition) {

    this.partition = partition;
    return this;
  }

  /**
   * The partition in the volume that you want to mount. If omitted, the default is to mount by
   * volume name. Examples: For volume /dev/sda1, you specify the partition as \&quot;1\&quot;.
   * Similarly, the volume partition for /dev/sda is \&quot;0\&quot; (or you can leave the property
   * empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   *
   * @return partition
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public V1ThanosRulerSpecGcePersistentDisk pdName(String pdName) {

    this.pdName = pdName;
    return this;
  }

  /**
   * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   *
   * @return pdName
   */
  @ApiModelProperty(
      required = true,
      value =
          "Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public String getPdName() {
    return pdName;
  }

  public void setPdName(String pdName) {
    this.pdName = pdName;
  }

  public V1ThanosRulerSpecGcePersistentDisk readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
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
    V1ThanosRulerSpecGcePersistentDisk v1ThanosRulerSpecGcePersistentDisk =
        (V1ThanosRulerSpecGcePersistentDisk) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecGcePersistentDisk.fsType)
        && Objects.equals(this.partition, v1ThanosRulerSpecGcePersistentDisk.partition)
        && Objects.equals(this.pdName, v1ThanosRulerSpecGcePersistentDisk.pdName)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecGcePersistentDisk.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, pdName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecGcePersistentDisk {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    pdName: ").append(toIndentedString(pdName)).append("\n");
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
