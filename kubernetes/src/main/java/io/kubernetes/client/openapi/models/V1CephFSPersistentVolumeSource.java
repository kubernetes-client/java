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
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support
 * ownership management or SELinux relabeling.
 */
@ApiModel(
    description =
        "Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1CephFSPersistentVolumeSource {
  public static final String SERIALIZED_NAME_MONITORS = "monitors";

  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";

  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_FILE = "secretFile";

  @SerializedName(SERIALIZED_NAME_SECRET_FILE)
  private String secretFile;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1SecretReference secretRef;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1CephFSPersistentVolumeSource monitors(List<String> monitors) {

    this.monitors = monitors;
    return this;
  }

  public V1CephFSPersistentVolumeSource addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

  /**
   * monitors is Required: Monitors is a collection of Ceph monitors More info:
   * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return monitors
   */
  @ApiModelProperty(
      required = true,
      value =
          "monitors is Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public V1CephFSPersistentVolumeSource path(String path) {

    this.path = path;
    return this;
  }

  /**
   * path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "path is Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1CephFSPersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly
   * setting in VolumeMounts. More info:
   * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnly is Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1CephFSPersistentVolumeSource secretFile(String secretFile) {

    this.secretFile = secretFile;
    return this;
  }

  /**
   * secretFile is Optional: SecretFile is the path to key ring for User, default is
   * /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return secretFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "secretFile is Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public String getSecretFile() {
    return secretFile;
  }

  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }

  public V1CephFSPersistentVolumeSource secretRef(V1SecretReference secretRef) {

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

  public V1CephFSPersistentVolumeSource user(String user) {

    this.user = user;
    return this;
  }

  /**
   * user is Optional: User is the rados user name, default is admin More info:
   * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "user is Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CephFSPersistentVolumeSource v1CephFSPersistentVolumeSource =
        (V1CephFSPersistentVolumeSource) o;
    return Objects.equals(this.monitors, v1CephFSPersistentVolumeSource.monitors)
        && Objects.equals(this.path, v1CephFSPersistentVolumeSource.path)
        && Objects.equals(this.readOnly, v1CephFSPersistentVolumeSource.readOnly)
        && Objects.equals(this.secretFile, v1CephFSPersistentVolumeSource.secretFile)
        && Objects.equals(this.secretRef, v1CephFSPersistentVolumeSource.secretRef)
        && Objects.equals(this.user, v1CephFSPersistentVolumeSource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CephFSPersistentVolumeSource {\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
