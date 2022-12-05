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
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields
 * are also present in container.securityContext. Field values of container.securityContext take
 * precedence over field values of PodSecurityContext.
 */
@ApiModel(
    description =
        "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PodSecurityContext {
  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";

  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  private Long fsGroup;

  public static final String SERIALIZED_NAME_FS_GROUP_CHANGE_POLICY = "fsGroupChangePolicy";

  @SerializedName(SERIALIZED_NAME_FS_GROUP_CHANGE_POLICY)
  private String fsGroupChangePolicy;

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
  private V1SELinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_SECCOMP_PROFILE = "seccompProfile";

  @SerializedName(SERIALIZED_NAME_SECCOMP_PROFILE)
  private V1SeccompProfile seccompProfile;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";

  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private List<Long> supplementalGroups = null;

  public static final String SERIALIZED_NAME_SYSCTLS = "sysctls";

  @SerializedName(SERIALIZED_NAME_SYSCTLS)
  private List<V1Sysctl> sysctls = null;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";

  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  private V1WindowsSecurityContextOptions windowsOptions;

  public V1PodSecurityContext fsGroup(Long fsGroup) {

    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow
   * the Kubelet to change the ownership of that volume to be owned by the pod: 1. The owning GID
   * will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by
   * FSGroup) 3. The permission bits are OR&#39;d with rw-rw---- If unset, the Kubelet will not
   * modify the ownership and permissions of any volume. Note that this field cannot be set when
   * spec.os.name is windows.
   *
   * @return fsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume. Note that this field cannot be set when spec.os.name is windows.")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  public V1PodSecurityContext fsGroupChangePolicy(String fsGroupChangePolicy) {

    this.fsGroupChangePolicy = fsGroupChangePolicy;
    return this;
  }

  /**
   * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before
   * being exposed inside Pod. This field will only apply to volume types which support fsGroup
   * based ownership(and permissions). It will have no effect on ephemeral volume types such as:
   * secret, configmaps and emptydir. Valid values are \&quot;OnRootMismatch\&quot; and
   * \&quot;Always\&quot;. If not specified, \&quot;Always\&quot; is used. Note that this field
   * cannot be set when spec.os.name is windows.
   *
   * @return fsGroupChangePolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are \"OnRootMismatch\" and \"Always\". If not specified, \"Always\" is used. Note that this field cannot be set when spec.os.name is windows.")
  public String getFsGroupChangePolicy() {
    return fsGroupChangePolicy;
  }

  public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
    this.fsGroupChangePolicy = fsGroupChangePolicy;
  }

  public V1PodSecurityContext runAsGroup(Long runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in SecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence for that container. Note that this field cannot
   * be set when spec.os.name is windows.
   *
   * @return runAsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {

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

  public V1PodSecurityContext runAsUser(Long runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in SecurityContext. If set in both SecurityContext and
   * PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * Note that this field cannot be set when spec.os.name is windows.
   *
   * @return runAsUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1PodSecurityContext seLinuxOptions(V1SELinuxOptions seLinuxOptions) {

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
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public V1PodSecurityContext seccompProfile(V1SeccompProfile seccompProfile) {

    this.seccompProfile = seccompProfile;
    return this;
  }

  /**
   * Get seccompProfile
   *
   * @return seccompProfile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SeccompProfile getSeccompProfile() {
    return seccompProfile;
  }

  public void setSeccompProfile(V1SeccompProfile seccompProfile) {
    this.seccompProfile = seccompProfile;
  }

  public V1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {

    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public V1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    if (this.supplementalGroups == null) {
      this.supplementalGroups = new ArrayList<>();
    }
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the
   * container&#39;s primary GID. If unspecified, no groups will be added to any container. Note
   * that this field cannot be set when spec.os.name is windows.
   *
   * @return supplementalGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container. Note that this field cannot be set when spec.os.name is windows.")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public V1PodSecurityContext sysctls(List<V1Sysctl> sysctls) {

    this.sysctls = sysctls;
    return this;
  }

  public V1PodSecurityContext addSysctlsItem(V1Sysctl sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new ArrayList<>();
    }
    this.sysctls.add(sysctlsItem);
    return this;
  }

  /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by
   * the container runtime) might fail to launch. Note that this field cannot be set when
   * spec.os.name is windows.
   *
   * @return sysctls
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch. Note that this field cannot be set when spec.os.name is windows.")
  public List<V1Sysctl> getSysctls() {
    return sysctls;
  }

  public void setSysctls(List<V1Sysctl> sysctls) {
    this.sysctls = sysctls;
  }

  public V1PodSecurityContext windowsOptions(V1WindowsSecurityContextOptions windowsOptions) {

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
  public V1WindowsSecurityContextOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(V1WindowsSecurityContextOptions windowsOptions) {
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
    V1PodSecurityContext v1PodSecurityContext = (V1PodSecurityContext) o;
    return Objects.equals(this.fsGroup, v1PodSecurityContext.fsGroup)
        && Objects.equals(this.fsGroupChangePolicy, v1PodSecurityContext.fsGroupChangePolicy)
        && Objects.equals(this.runAsGroup, v1PodSecurityContext.runAsGroup)
        && Objects.equals(this.runAsNonRoot, v1PodSecurityContext.runAsNonRoot)
        && Objects.equals(this.runAsUser, v1PodSecurityContext.runAsUser)
        && Objects.equals(this.seLinuxOptions, v1PodSecurityContext.seLinuxOptions)
        && Objects.equals(this.seccompProfile, v1PodSecurityContext.seccompProfile)
        && Objects.equals(this.supplementalGroups, v1PodSecurityContext.supplementalGroups)
        && Objects.equals(this.sysctls, v1PodSecurityContext.sysctls)
        && Objects.equals(this.windowsOptions, v1PodSecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fsGroup,
        fsGroupChangePolicy,
        runAsGroup,
        runAsNonRoot,
        runAsUser,
        seLinuxOptions,
        seccompProfile,
        supplementalGroups,
        sysctls,
        windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodSecurityContext {\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    fsGroupChangePolicy: ")
        .append(toIndentedString(fsGroupChangePolicy))
        .append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    seccompProfile: ").append(toIndentedString(seccompProfile)).append("\n");
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
