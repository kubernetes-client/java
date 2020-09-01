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
 * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More
 * info: https://examples.k8s.io/volumes/rbd/README.md
 */
@ApiModel(
    description =
        "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecRbd {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";

  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_KEYRING = "keyring";

  @SerializedName(SERIALIZED_NAME_KEYRING)
  private String keyring;

  public static final String SERIALIZED_NAME_MONITORS = "monitors";

  @SerializedName(SERIALIZED_NAME_MONITORS)
  private List<String> monitors = new ArrayList<String>();

  public static final String SERIALIZED_NAME_POOL = "pool";

  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";

  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ThanosRulerSpecRbdSecretRef secretRef;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public V1ThanosRulerSpecRbd fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is
   * supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;,
   * \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info:
   * https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the
   * filesystem from compromising the machine
   *
   * @return fsType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd TODO: how do we prevent errors in the filesystem from compromising the machine")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ThanosRulerSpecRbd image(String image) {

    this.image = image;
    return this;
  }

  /**
   * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return image
   */
  @ApiModelProperty(
      required = true,
      value =
          "The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1ThanosRulerSpecRbd keyring(String keyring) {

    this.keyring = keyring;
    return this;
  }

  /**
   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
   * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return keyring
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getKeyring() {
    return keyring;
  }

  public void setKeyring(String keyring) {
    this.keyring = keyring;
  }

  public V1ThanosRulerSpecRbd monitors(List<String> monitors) {

    this.monitors = monitors;
    return this;
  }

  public V1ThanosRulerSpecRbd addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

  /**
   * A collection of Ceph monitors. More info:
   * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return monitors
   */
  @ApiModelProperty(
      required = true,
      value =
          "A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public V1ThanosRulerSpecRbd pool(String pool) {

    this.pool = pool;
    return this;
  }

  /**
   * The rados pool name. Default is rbd. More info:
   * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return pool
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public V1ThanosRulerSpecRbd readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info:
   * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecRbd secretRef(V1ThanosRulerSpecRbdSecretRef secretRef) {

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
  public V1ThanosRulerSpecRbdSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1ThanosRulerSpecRbdSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public V1ThanosRulerSpecRbd user(String user) {

    this.user = user;
    return this;
  }

  /**
   * The rados user name. Default is admin. More info:
   * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
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
    V1ThanosRulerSpecRbd v1ThanosRulerSpecRbd = (V1ThanosRulerSpecRbd) o;
    return Objects.equals(this.fsType, v1ThanosRulerSpecRbd.fsType)
        && Objects.equals(this.image, v1ThanosRulerSpecRbd.image)
        && Objects.equals(this.keyring, v1ThanosRulerSpecRbd.keyring)
        && Objects.equals(this.monitors, v1ThanosRulerSpecRbd.monitors)
        && Objects.equals(this.pool, v1ThanosRulerSpecRbd.pool)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecRbd.readOnly)
        && Objects.equals(this.secretRef, v1ThanosRulerSpecRbd.secretRef)
        && Objects.equals(this.user, v1ThanosRulerSpecRbd.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecRbd {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keyring: ").append(toIndentedString(keyring)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
