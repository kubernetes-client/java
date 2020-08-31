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

/** VolumeMount describes a mounting of a Volume within a container. */
@ApiModel(description = "VolumeMount describes a mounting of a Volume within a container.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecVolumeMounts {
  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";

  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_MOUNT_PROPAGATION = "mountPropagation";

  @SerializedName(SERIALIZED_NAME_MOUNT_PROPAGATION)
  private String mountPropagation;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";

  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_SUB_PATH_EXPR = "subPathExpr";

  @SerializedName(SERIALIZED_NAME_SUB_PATH_EXPR)
  private String subPathExpr;

  public V1ThanosRulerSpecVolumeMounts mountPath(String mountPath) {

    this.mountPath = mountPath;
    return this;
  }

  /**
   * Path within the container at which the volume should be mounted. Must not contain &#39;:&#39;.
   *
   * @return mountPath
   */
  @ApiModelProperty(
      required = true,
      value =
          "Path within the container at which the volume should be mounted.  Must not contain ':'.")
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  public V1ThanosRulerSpecVolumeMounts mountPropagation(String mountPropagation) {

    this.mountPropagation = mountPropagation;
    return this;
  }

  /**
   * mountPropagation determines how mounts are propagated from the host to container and the other
   * way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
   *
   * @return mountPropagation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.")
  public String getMountPropagation() {
    return mountPropagation;
  }

  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }

  public V1ThanosRulerSpecVolumeMounts name(String name) {

    this.name = name;
    return this;
  }

  /**
   * This must match the Name of a Volume.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "This must match the Name of a Volume.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecVolumeMounts readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ThanosRulerSpecVolumeMounts subPath(String subPath) {

    this.subPath = subPath;
    return this;
  }

  /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to
   * \&quot;\&quot; (volume&#39;s root).
   *
   * @return subPath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }

  public V1ThanosRulerSpecVolumeMounts subPathExpr(String subPathExpr) {

    this.subPathExpr = subPathExpr;
    return this;
  }

  /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted.
   * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using
   * the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr
   * and SubPath are mutually exclusive.
   *
   * @return subPathExpr
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.")
  public String getSubPathExpr() {
    return subPathExpr;
  }

  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecVolumeMounts v1ThanosRulerSpecVolumeMounts = (V1ThanosRulerSpecVolumeMounts) o;
    return Objects.equals(this.mountPath, v1ThanosRulerSpecVolumeMounts.mountPath)
        && Objects.equals(this.mountPropagation, v1ThanosRulerSpecVolumeMounts.mountPropagation)
        && Objects.equals(this.name, v1ThanosRulerSpecVolumeMounts.name)
        && Objects.equals(this.readOnly, v1ThanosRulerSpecVolumeMounts.readOnly)
        && Objects.equals(this.subPath, v1ThanosRulerSpecVolumeMounts.subPath)
        && Objects.equals(this.subPathExpr, v1ThanosRulerSpecVolumeMounts.subPathExpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, subPath, subPathExpr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecVolumeMounts {\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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
