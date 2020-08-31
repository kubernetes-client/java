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
 * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet&#39;s host
 * machine and then exposed to the pod. More info:
 * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
 */
@ApiModel(
    description =
        "AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecAwsElasticBlockStore {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PARTITION = "partition";

  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";

  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public V1ThanosRulerSpecAwsElasticBlockStore fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is
   * supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;,
   * \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore TODO: how do we
   * prevent errors in the filesystem from compromising the machine
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore TODO: how do we prevent errors in the filesystem from compromising the machine")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecAwsElasticBlockStore partition(Integer partition) {

    this.partition = partition;
    return this;
  }

  /**
   * The partition in the volume that you want to mount. If omitted, the default is to mount by
   * volume name. Examples: For volume /dev/sda1, you specify the partition as \&quot;1\&quot;.
   * Similarly, the volume partition for /dev/sda is \&quot;0\&quot; (or you can leave the property
   * empty).
   *
   * @return partition
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty).")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public V1ThanosRulerSpecAwsElasticBlockStore readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Specify \&quot;true\&quot; to force and set the ReadOnly property in VolumeMounts to
   * \&quot;true\&quot;. If omitted, the default is \&quot;false\&quot;. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specify \"true\" to force and set the ReadOnly property in VolumeMounts to \"true\". If omitted, the default is \"false\". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecAwsElasticBlockStore volumeID(String volumeID) {

    this.volumeID = volumeID;
    return this;
  }

  /**
   * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   *
   * @return volumeID
   */
  @ApiModelProperty(
      required = true,
      value =
          "Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  public String getVolumeID() {
    return volumeID;
  }

  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecAwsElasticBlockStore v1ThanosRulerSpecAwsElasticBlockStore =
        (V1ThanosRulerSpecAwsElasticBlockStore) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecAwsElasticBlockStore.fsType)
        && Objects.equals(this.partition, v1ThanosRulerSpecAwsElasticBlockStore.partition)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecAwsElasticBlockStore.readOnly)
        && Objects.equals(this.volumeID, v1ThanosRulerSpecAwsElasticBlockStore.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, readOnly, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecAwsElasticBlockStore {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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
