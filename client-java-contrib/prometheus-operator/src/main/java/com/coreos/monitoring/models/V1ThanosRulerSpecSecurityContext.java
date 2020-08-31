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
 * Security options the pod should run with. More info:
 * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
 * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
 */
@ApiModel(
    description =
        "Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecSecurityContext {
  public static final String SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION =
      "allowPrivilegeEscalation";

  @SerializedName(SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean allowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";

  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private V1ThanosRulerSpecSecurityContextCapabilities capabilities;

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
  private V1ThanosRulerSpecSecurityContextSeLinuxOptions seLinuxOptions;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIONS = "windowsOptions";

  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIONS)
  private V1ThanosRulerSpecSecurityContextWindowsOptions windowsOptions;

  public V1ThanosRulerSpecSecurityContext allowPrivilegeEscalation(
      Boolean allowPrivilegeEscalation) {

    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent
   * process. This bool directly controls if the no_new_privs flag will be set on the container
   * process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2)
   * has CAP_SYS_ADMIN
   *
   * @return allowPrivilegeEscalation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN")
  public Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public V1ThanosRulerSpecSecurityContext capabilities(
      V1ThanosRulerSpecSecurityContextCapabilities capabilities) {

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
  public V1ThanosRulerSpecSecurityContextCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(V1ThanosRulerSpecSecurityContextCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public V1ThanosRulerSpecSecurityContext privileged(Boolean privileged) {

    this.privileged = privileged;
    return this;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent
   * to root on the host. Defaults to false.
   *
   * @return privileged
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public V1ThanosRulerSpecSecurityContext procMount(String procMount) {

    this.procMount = procMount;
    return this;
  }

  /**
   * procMount denotes the type of proc mount to use for the containers. The default is
   * DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths.
   * This requires the ProcMountType feature flag to be enabled.
   *
   * @return procMount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.")
  public String getProcMount() {
    return procMount;
  }

  public void setProcMount(String procMount) {
    this.procMount = procMount;
  }

  public V1ThanosRulerSpecSecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {

    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false.
   *
   * @return readOnlyRootFilesystem
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Whether this container has a read-only root filesystem. Default is false.")
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public V1ThanosRulerSpecSecurityContext runAsGroup(Long runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also
   * be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value
   * specified in SecurityContext takes precedence.
   *
   * @return runAsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1ThanosRulerSpecSecurityContext runAsNonRoot(Boolean runAsNonRoot) {

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

  public V1ThanosRulerSpecSecurityContext runAsUser(Long runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image
   * metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext
   * and PodSecurityContext, the value specified in SecurityContext takes precedence.
   *
   * @return runAsUser
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1ThanosRulerSpecSecurityContext seLinuxOptions(
      V1ThanosRulerSpecSecurityContextSeLinuxOptions seLinuxOptions) {

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
  public V1ThanosRulerSpecSecurityContextSeLinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(V1ThanosRulerSpecSecurityContextSeLinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public V1ThanosRulerSpecSecurityContext windowsOptions(
      V1ThanosRulerSpecSecurityContextWindowsOptions windowsOptions) {

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
  public V1ThanosRulerSpecSecurityContextWindowsOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(V1ThanosRulerSpecSecurityContextWindowsOptions windowsOptions) {
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
    V1ThanosRulerSpecSecurityContext v1ThanosRulerSpecSecurityContext =
        (V1ThanosRulerSpecSecurityContext) o;
    return Objects.equals(
            this.allowPrivilegeEscalation,
            v1ThanosRulerSpecSecurityContext.allowPrivilegeEscalation)
        && Objects.equals(this.capabilities, v1ThanosRulerSpecSecurityContext.capabilities)
        && Objects.equals(this.privileged, v1ThanosRulerSpecSecurityContext.privileged)
        && Objects.equals(this.procMount, v1ThanosRulerSpecSecurityContext.procMount)
        && Objects.equals(
            this.readOnlyRootFilesystem, v1ThanosRulerSpecSecurityContext.readOnlyRootFilesystem)
        && Objects.equals(this.runAsGroup, v1ThanosRulerSpecSecurityContext.runAsGroup)
        && Objects.equals(this.runAsNonRoot, v1ThanosRulerSpecSecurityContext.runAsNonRoot)
        && Objects.equals(this.runAsUser, v1ThanosRulerSpecSecurityContext.runAsUser)
        && Objects.equals(this.seLinuxOptions, v1ThanosRulerSpecSecurityContext.seLinuxOptions)
        && Objects.equals(this.windowsOptions, v1ThanosRulerSpecSecurityContext.windowsOptions);
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
        windowsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecSecurityContext {\n");
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
