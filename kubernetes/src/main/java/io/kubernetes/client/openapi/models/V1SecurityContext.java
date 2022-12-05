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
 * SecurityContext holds security configuration that will be applied to a container. Some fields are
 * present in both SecurityContext and PodSecurityContext. When both are set, the values in
 * SecurityContext take precedence.
 */
@ApiModel(
    description =
        "SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1SecurityContext {
  public static final String SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION =
      "allowPrivilegeEscalation";

  @SerializedName(SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean allowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";

  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private V1Capabilities capabilities;

  public static final String SERIALIZED_NAME_PRIVILEGED = "privileged";

  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged;

  public static final String SERIALIZED_NAME_PROC_MOUNT = "procMount";

  @SerializedName(SERIALIZED_NAME_PROC_MOUNT)
  private String procMount;

  public static final String SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM = "readOnlyRootFilesystem";

  @SerializedName(SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM)
  private Boolean readOnlyRootFilesystem;

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

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";

  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  private V1WindowsSecurityContextOptions windowsOptions;

  public V1SecurityContext allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {

    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent
   * process. This bool directly controls if the no_new_privs flag will be set on the container
   * process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2)
   * has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
   *
   * @return allowPrivilegeEscalation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public V1SecurityContext capabilities(V1Capabilities capabilities) {

    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   *
   * @return capabilities
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(V1Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public V1SecurityContext privileged(Boolean privileged) {

    this.privileged = privileged;
    return this;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent
   * to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is
   * windows.
   *
   * @return privileged
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public V1SecurityContext procMount(String procMount) {

    this.procMount = procMount;
    return this;
  }

  /**
   * procMount denotes the type of proc mount to use for the containers. The default is
   * DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths.
   * This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set
   * when spec.os.name is windows.
   *
   * @return procMount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.")
  public String getProcMount() {
    return procMount;
  }

  public void setProcMount(String procMount) {
    this.procMount = procMount;
  }

  public V1SecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {

    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false. Note that this field
   * cannot be set when spec.os.name is windows.
   *
   * @return readOnlyRootFilesystem
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.")
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public V1SecurityContext runAsGroup(Long runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence. Note that this field cannot be set when
   * spec.os.name is windows.
   *
   * @return runAsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1SecurityContext runAsNonRoot(Boolean runAsNonRoot) {

    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate
   * the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the
   * container if it does. If unset or false, no such validation will be performed. May also be set
   * in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence.
   *
   * @return runAsNonRoot
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Boolean getRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public V1SecurityContext runAsUser(Long runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext
   * and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this
   * field cannot be set when spec.os.name is windows.
   *
   * @return runAsUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1SecurityContext seLinuxOptions(V1SELinuxOptions seLinuxOptions) {

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

  public V1SecurityContext seccompProfile(V1SeccompProfile seccompProfile) {

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

  public V1SecurityContext windowsOptions(V1WindowsSecurityContextOptions windowsOptions) {

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
    V1SecurityContext v1SecurityContext = (V1SecurityContext) o;
    return Objects.equals(this.allowPrivilegeEscalation, v1SecurityContext.allowPrivilegeEscalation)
        && Objects.equals(this.capabilities, v1SecurityContext.capabilities)
        && Objects.equals(this.privileged, v1SecurityContext.privileged)
        && Objects.equals(this.procMount, v1SecurityContext.procMount)
        && Objects.equals(this.readOnlyRootFilesystem, v1SecurityContext.readOnlyRootFilesystem)
        && Objects.equals(this.runAsGroup, v1SecurityContext.runAsGroup)
        && Objects.equals(this.runAsNonRoot, v1SecurityContext.runAsNonRoot)
        && Objects.equals(this.runAsUser, v1SecurityContext.runAsUser)
        && Objects.equals(this.seLinuxOptions, v1SecurityContext.seLinuxOptions)
        && Objects.equals(this.seccompProfile, v1SecurityContext.seccompProfile)
        && Objects.equals(this.windowsOptions, v1SecurityContext.windowsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowPrivilegeEscalation,
        capabilities,
        privileged,
        procMount,
        readOnlyRootFilesystem,
        runAsGroup,
        runAsNonRoot,
        runAsUser,
        seLinuxOptions,
        seccompProfile,
        windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecurityContext {\n");
    sb.append("    allowPrivilegeEscalation: ")
        .append(toIndentedString(allowPrivilegeEscalation))
        .append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    procMount: ").append(toIndentedString(procMount)).append("\n");
    sb.append("    readOnlyRootFilesystem: ")
        .append(toIndentedString(readOnlyRootFilesystem))
        .append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    seccompProfile: ").append(toIndentedString(seccompProfile)).append("\n");
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
