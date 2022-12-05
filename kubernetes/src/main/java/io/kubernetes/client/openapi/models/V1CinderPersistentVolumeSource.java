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
import java.util.Objects;

/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a
 * container. The volume must also be in the same region as the kubelet. Cinder volumes support
 * ownership management and SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CinderPersistentVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretReference secretRef;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";

  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public V1CinderPersistentVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * fsType Filesystem type to mount. Must be a filesystem type supported by the host operating
   * system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly
   * inferred to be \&quot;ext4\&quot; if unspecified. More info:
   * https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsType Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1CinderPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly
   * setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1CinderPersistentVolumeSource secretRef(V1SecretReference secretRef) {

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
  public V1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public V1CinderPersistentVolumeSource volumeID(String volumeID) {

    this.volumeID = volumeID;
    return this;
  }

  /**
   * volumeID used to identify the volume in cinder. More info:
   * https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return volumeID
   */
  @ApiModelProperty(
      required = true,
      value =
          "volumeID used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
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
    V1CinderPersistentVolumeSource v1CinderPersistentVolumeSource =
        (V1CinderPersistentVolumeSource) o;
    return Objects.equals(this.fsType, v1CinderPersistentVolumeSource.fsType)
        && Objects.equals(this.readOnly, v1CinderPersistentVolumeSource.readOnly)
        && Objects.equals(this.secretRef, v1CinderPersistentVolumeSource.secretRef)
        && Objects.equals(this.volumeID, v1CinderPersistentVolumeSource.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CinderPersistentVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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
