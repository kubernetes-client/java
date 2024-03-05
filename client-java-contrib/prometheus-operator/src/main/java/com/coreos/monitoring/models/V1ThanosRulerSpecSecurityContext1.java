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
 * SecurityContext holds pod-level security attributes and common container settings. This defaults
 * to the default PodSecurityContext.
 */
@ApiModel(
    description =
        "SecurityContext holds pod-level security attributes and common container settings. This defaults to the default PodSecurityContext.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecSecurityContext1 {
  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";

  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  private Long fsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_GROUP = "runAsGroup";

  @SerializedName(SERIALIZED_NAME_RUN_AS_GROUP)
  private Long runAsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_NON_ROOT = "runAsNonRoot";

  @SerializedName(SERIALIZED_NAME_RUN_AS_NON_ROOT)
  private Boolean runAsNonRoot;

  public static final String SERIALIZED_NAME_RUN_AS_USER = "runAsUser";

  @SerializedName(SERIALIZED_NAME_RUN_AS_USER)
  private Long runAsUser;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";

  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  private V1ThanosRulerSpecSecurityContext1SeLinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";

  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private List<Long> supplementalGroups = null;

  public static final String SERIALIZED_NAME_SYSCTLS = "sysctls";

  @SerializedName(SERIALIZED_NAME_SYSCTLS)
  private List<V1ThanosRulerSpecSecurityContext1Sysctls> sysctls = null;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";

  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  private V1ThanosRulerSpecSecurityContext1WindowsOptions windowsOptions;

  public V1ThanosRulerSpecSecurityContext1 fsGroup(Long fsGroup) {

    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow
   * the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID
   * will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by
   * FSGroup) 3. The permission bits are OR&#39;d with rw-rw---- If unset, the Kubelet will not
   * modify the ownership and permissions of any volume.
   *
   * @return fsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:   1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----   If unset, the Kubelet will not modify the ownership and permissions of any volume.")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  public V1ThanosRulerSpecSecurityContext1 runAsGroup(Long runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence for that container.
   *
   * @return runAsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1ThanosRulerSpecSecurityContext1 runAsNonRoot(Boolean runAsNonRoot) {

    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified
   * in SecurityContext takes precedence.
   *
   * @return runAsNonRoot
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public V1ThanosRulerSpecSecurityContext1 runAsUser(Long runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and
   * PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   *
   * @return runAsUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1ThanosRulerSpecSecurityContext1 seLinuxOptions(
      V1ThanosRulerSpecSecurityContext1SeLinuxOptions seLinuxOptions) {

    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  /**
   * Get seLinuxOptions
   *
   * @return seLinuxOptions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecSecurityContext1SeLinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1ThanosRulerSpecSecurityContext1SeLinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public V1ThanosRulerSpecSecurityContext1 supplementalGroups(List<Long> supplementalGroups) {

    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1ThanosRulerSpecSecurityContext1 addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<Long>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the
   * container&#39;s primary GID. If unspecified, no groups will be added to any container.
   *
   * @return supplementalGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public V1ThanosRulerSpecSecurityContext1 sysctls(
      List<V1ThanosRulerSpecSecurityContext1Sysctls> sysctls) {

    this.sysctls = sysctls;
    return this;
  }

  public V1ThanosRulerSpecSecurityContext1 addSysctlsItem(
      V1ThanosRulerSpecSecurityContext1Sysctls sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<V1ThanosRulerSpecSecurityContext1Sysctls>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

  /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by
   * the container runtime) might fail to launch.
   *
   * @return sysctls
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.")
  public List<V1ThanosRulerSpecSecurityContext1Sysctls> getSysctls() {
    return sysctls;
  }

  public void setSysctls(List<V1ThanosRulerSpecSecurityContext1Sysctls> sysctls) {
    this.sysctls = sysctls;
  }

  public V1ThanosRulerSpecSecurityContext1 windowsOptions(
      V1ThanosRulerSpecSecurityContext1WindowsOptions windowsOptions) {

    this.windowsOptions = windowsOptions;
    return this;
  }

  /**
   * Get windowsOptions
   *
   * @return windowsOptions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ThanosRulerSpecSecurityContext1WindowsOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(V1ThanosRulerSpecSecurityContext1WindowsOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecSecurityContext1 v1ThanosRulerSpecSecurityContext1 =
        (V1ThanosRulerSpecSecurityContext1) o;
    return Objects.equals(this.fsGroup, v1ThanosRulerSpecSecurityContext1.fsGroup)
        && Objects.equals(this.runAsGroup, v1ThanosRulerSpecSecurityContext1.runAsGroup)
        && Objects.equals(this.runAsNonRoot, v1ThanosRulerSpecSecurityContext1.runAsNonRoot)
        && Objects.equals(this.runAsUser, v1ThanosRulerSpecSecurityContext1.runAsUser)
        && Objects.equals(this.seLinuxOptions, v1ThanosRulerSpecSecurityContext1.seLinuxOptions)
        && Objects.equals(
            this.supplementalGroups, v1ThanosRulerSpecSecurityContext1.supplementalGroups)
        && Objects.equals(this.sysctls, v1ThanosRulerSpecSecurityContext1.sysctls)
        && Objects.equals(this.windowsOptions, v1ThanosRulerSpecSecurityContext1.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fsGroup,
        runAsGroup,
        runAsNonRoot,
        runAsUser,
        seLinuxOptions,
        supplementalGroups,
        sysctls,
        windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecSecurityContext1 {\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
    sb.append("    windowsOptions: ").append(toIndentedString(windowsOptions)).append("\n");
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
