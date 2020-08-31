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

/** CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime */
@ApiModel(
    description = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecCephfs {
  public static final String SERIALIZED_NAME_MONITORS = "monitors";

  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<String>();

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
  private V1ThanosRulerSpecCephfsSecretRef secretRef;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1ThanosRulerSpecCephfs monitors(List<String> monitors) {

    this.monitors = monitors;
    return this;
  }

  public V1ThanosRulerSpecCephfs addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

  /**
   * Required: Monitors is a collection of Ceph monitors More info:
   * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return monitors
   */
  @ApiModelProperty(
      required = true,
      value =
          "Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public V1ThanosRulerSpecCephfs path(String path) {

    this.path = path;
    return this;
  }

  /**
   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   *
   * @return path
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1ThanosRulerSpecCephfs readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
   * VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecCephfs secretFile(String secretFile) {

    this.secretFile = secretFile;
    return this;
  }

  /**
   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More
   * info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return secretFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public String getSecretFile() {
    return secretFile;
  }

  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }

  public V1ThanosRulerSpecCephfs secretRef(V1ThanosRulerSpecCephfsSecretRef secretRef) {

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
  public V1ThanosRulerSpecCephfsSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecCephfsSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public V1ThanosRulerSpecCephfs user(String user) {

    this.user = user;
    return this;
  }

  /**
   * Optional: User is the rados user name, default is admin More info:
   * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
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
    V1ThanosRulerSpecCephfs v1ThanosRulerSpecCephfs = (V1ThanosRulerSpecCephfs) o;
    return Objects.equals(this.monitors, v1ThanosRulerSpecCephfs.monitors)
        && Objects.equals(this.path, v1ThanosRulerSpecCephfs.path)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecCephfs.readOnly)
        && Objects.equals(this.secretFile, v1ThanosRulerSpecCephfs.secretFile)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecCephfs.secretRef)
        && Objects.equals(this.user, v1ThanosRulerSpecCephfs.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecCephfs {\n");
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
