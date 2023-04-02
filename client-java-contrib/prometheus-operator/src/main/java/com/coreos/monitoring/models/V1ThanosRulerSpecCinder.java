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
 * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info:
 * https://examples.k8s.io/mysql-cinder-pd/README.md
 */
@ApiModel(
    description =
        "Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecCinder {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ThanosRulerSpecCinderSecretRef secretRef;

  public static final String SERIALIZED_NAME_VOLUME_I_D = "volumeID";

  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public V1ThanosRulerSpecCinder fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
   * Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be
   * \&quot;ext4\&quot; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecCinder readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
   * VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecCinder secretRef(V1ThanosRulerSpecCinderSecretRef secretRef) {

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
  public V1ThanosRulerSpecCinderSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecCinderSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public V1ThanosRulerSpecCinder volumeID(String volumeID) {

    this.volumeID = volumeID;
    return this;
  }

  /**
   * volume id used to identify the volume in cinder. More info:
   * https://examples.k8s.io/mysql-cinder-pd/README.md
   *
   * @return volumeID
   */
  @ApiModelProperty(
      required = true,
      value =
          "volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
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
    V1ThanosRulerSpecCinder v1ThanosRulerSpecCinder = (V1ThanosRulerSpecCinder) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecCinder.fsType)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecCinder.readOnly)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecCinder.secretRef)
        && Objects.equals(this.volumeID, v1ThanosRulerSpecCinder.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecCinder {\n");
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
