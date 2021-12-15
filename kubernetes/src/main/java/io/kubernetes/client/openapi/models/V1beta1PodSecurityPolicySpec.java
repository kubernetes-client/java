/*
Copyright 2021 The Kubernetes Authors.
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

/** PodSecurityPolicySpec defines the policy enforced. */
@ApiModel(description = "PodSecurityPolicySpec defines the policy enforced.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1PodSecurityPolicySpec {
  public static final String SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION =
      "allowPrivilegeEscalation";

  @SerializedName(SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean allowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_ALLOWED_C_S_I_DRIVERS = "allowedCSIDrivers";

  @SerializedName(SERIALIZED_NAME_ALLOWED_C_S_I_DRIVERS)
  private List<V1beta1AllowedCSIDriver> allowedCSIDrivers = null;

  public static final String SERIALIZED_NAME_ALLOWED_CAPABILITIES = "allowedCapabilities";

  @SerializedName(SERIALIZED_NAME_ALLOWED_CAPABILITIES)
  private List<String> allowedCapabilities = null;

  public static final String SERIALIZED_NAME_ALLOWED_FLEX_VOLUMES = "allowedFlexVolumes";

  @SerializedName(SERIALIZED_NAME_ALLOWED_FLEX_VOLUMES)
  private List<V1beta1AllowedFlexVolume> allowedFlexVolumes = null;

  public static final String SERIALIZED_NAME_ALLOWED_HOST_PATHS = "allowedHostPaths";

  @SerializedName(SERIALIZED_NAME_ALLOWED_HOST_PATHS)
  private List<V1beta1AllowedHostPath> allowedHostPaths = null;

  public static final String SERIALIZED_NAME_ALLOWED_PROC_MOUNT_TYPES = "allowedProcMountTypes";

  @SerializedName(SERIALIZED_NAME_ALLOWED_PROC_MOUNT_TYPES)
  private List<String> allowedProcMountTypes = null;

  public static final String SERIALIZED_NAME_ALLOWED_UNSAFE_SYSCTLS = "allowedUnsafeSysctls";

  @SerializedName(SERIALIZED_NAME_ALLOWED_UNSAFE_SYSCTLS)
  private List<String> allowedUnsafeSysctls = null;

  public static final String SERIALIZED_NAME_DEFAULT_ADD_CAPABILITIES = "defaultAddCapabilities";

  @SerializedName(SERIALIZED_NAME_DEFAULT_ADD_CAPABILITIES)
  private List<String> defaultAddCapabilities = null;

  public static final String SERIALIZED_NAME_DEFAULT_ALLOW_PRIVILEGE_ESCALATION =
      "defaultAllowPrivilegeEscalation";

  @SerializedName(SERIALIZED_NAME_DEFAULT_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean defaultAllowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_FORBIDDEN_SYSCTLS = "forbiddenSysctls";

  @SerializedName(SERIALIZED_NAME_FORBIDDEN_SYSCTLS)
  private List<String> forbiddenSysctls = null;

  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";

  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  private V1beta1FSGroupStrategyOptions fsGroup;

  public static final String SERIALIZED_NAME_HOST_I_P_C = "hostIPC";

  @SerializedName(SERIALIZED_NAME_HOST_I_P_C)
  private Boolean hostIPC;

  public static final String SERIALIZED_NAME_HOST_NETWORK = "hostNetwork";

  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_HOST_P_I_D = "hostPID";

  @SerializedName(SERIALIZED_NAME_HOST_P_I_D)
  private Boolean hostPID;

  public static final String SERIALIZED_NAME_HOST_PORTS = "hostPorts";

  @SerializedName(SERIALIZED_NAME_HOST_PORTS)
  private List<V1beta1HostPortRange> hostPorts = null;

  public static final String SERIALIZED_NAME_PRIVILEGED = "privileged";

  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged;

  public static final String SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM = "readOnlyRootFilesystem";

  @SerializedName(SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM)
  private Boolean readOnlyRootFilesystem;

  public static final String SERIALIZED_NAME_REQUIRED_DROP_CAPABILITIES =
      "requiredDropCapabilities";

  @SerializedName(SERIALIZED_NAME_REQUIRED_DROP_CAPABILITIES)
  private List<String> requiredDropCapabilities = null;

  public static final String SERIALIZED_NAME_RUN_AS_GROUP = "runAsGroup";

  @SerializedName(SERIALIZED_NAME_RUN_AS_GROUP)
  private V1beta1RunAsGroupStrategyOptions runAsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_USER = "runAsUser";

  @SerializedName(SERIALIZED_NAME_RUN_AS_USER)
  private V1beta1RunAsUserStrategyOptions runAsUser;

  public static final String SERIALIZED_NAME_RUNTIME_CLASS = "runtimeClass";

  @SerializedName(SERIALIZED_NAME_RUNTIME_CLASS)
  private V1beta1RuntimeClassStrategyOptions runtimeClass;

  public static final String SERIALIZED_NAME_SE_LINUX = "seLinux";

  @SerializedName(SERIALIZED_NAME_SE_LINUX)
  private V1beta1SELinuxStrategyOptions seLinux;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";

  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private V1beta1SupplementalGroupsStrategyOptions supplementalGroups;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";

  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<String> volumes = null;

  public V1beta1PodSecurityPolicySpec allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {

    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  /**
   * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If
   * unspecified, defaults to true.
   *
   * @return allowPrivilegeEscalation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.")
  public Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public V1beta1PodSecurityPolicySpec allowedCSIDrivers(
      List<V1beta1AllowedCSIDriver> allowedCSIDrivers) {

    this.allowedCSIDrivers = allowedCSIDrivers;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedCSIDriversItem(
      V1beta1AllowedCSIDriver allowedCSIDriversItem) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers = new ArrayList<>();
    }
    this.allowedCSIDrivers.add(allowedCSIDriversItem);
    return this;
  }

  /**
   * AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be
   * embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline
   * ephemeral volumes. This is a beta field, and is only honored if the API server enables the
   * CSIInlineVolume feature gate.
   *
   * @return allowedCSIDrivers
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is a beta field, and is only honored if the API server enables the CSIInlineVolume feature gate.")
  public List<V1beta1AllowedCSIDriver> getAllowedCSIDrivers() {
    return allowedCSIDrivers;
  }

  public void setAllowedCSIDrivers(List<V1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
  }

  public V1beta1PodSecurityPolicySpec allowedCapabilities(List<String> allowedCapabilities) {

    this.allowedCapabilities = allowedCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedCapabilitiesItem(String allowedCapabilitiesItem) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new ArrayList<>();
    }
    this.allowedCapabilities.add(allowedCapabilitiesItem);
    return this;
  }

  /**
   * allowedCapabilities is a list of capabilities that can be requested to add to the container.
   * Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a
   * capability in both allowedCapabilities and requiredDropCapabilities.
   *
   * @return allowedCapabilities
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.")
  public List<String> getAllowedCapabilities() {
    return allowedCapabilities;
  }

  public void setAllowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
  }

  public V1beta1PodSecurityPolicySpec allowedFlexVolumes(
      List<V1beta1AllowedFlexVolume> allowedFlexVolumes) {

    this.allowedFlexVolumes = allowedFlexVolumes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedFlexVolumesItem(
      V1beta1AllowedFlexVolume allowedFlexVolumesItem) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes = new ArrayList<>();
    }
    this.allowedFlexVolumes.add(allowedFlexVolumesItem);
    return this;
  }

  /**
   * allowedFlexVolumes is an allowlist of Flexvolumes. Empty or nil indicates that all Flexvolumes
   * may be used. This parameter is effective only when the usage of the Flexvolumes is allowed in
   * the \&quot;volumes\&quot; field.
   *
   * @return allowedFlexVolumes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "allowedFlexVolumes is an allowlist of Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \"volumes\" field.")
  public List<V1beta1AllowedFlexVolume> getAllowedFlexVolumes() {
    return allowedFlexVolumes;
  }

  public void setAllowedFlexVolumes(List<V1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
  }

  public V1beta1PodSecurityPolicySpec allowedHostPaths(
      List<V1beta1AllowedHostPath> allowedHostPaths) {

    this.allowedHostPaths = allowedHostPaths;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedHostPathsItem(
      V1beta1AllowedHostPath allowedHostPathsItem) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths = new ArrayList<>();
    }
    this.allowedHostPaths.add(allowedHostPathsItem);
    return this;
  }

  /**
   * allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be
   * used.
   *
   * @return allowedHostPaths
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be used.")
  public List<V1beta1AllowedHostPath> getAllowedHostPaths() {
    return allowedHostPaths;
  }

  public void setAllowedHostPaths(List<V1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
  }

  public V1beta1PodSecurityPolicySpec allowedProcMountTypes(List<String> allowedProcMountTypes) {

    this.allowedProcMountTypes = allowedProcMountTypes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedProcMountTypesItem(
      String allowedProcMountTypesItem) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new ArrayList<>();
    }
    this.allowedProcMountTypes.add(allowedProcMountTypesItem);
    return this;
  }

  /**
   * AllowedProcMountTypes is an allowlist of allowed ProcMountTypes. Empty or nil indicates that
   * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be
   * enabled.
   *
   * @return allowedProcMountTypes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "AllowedProcMountTypes is an allowlist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.")
  public List<String> getAllowedProcMountTypes() {
    return allowedProcMountTypes;
  }

  public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
  }

  public V1beta1PodSecurityPolicySpec allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {

    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedUnsafeSysctlsItem(String allowedUnsafeSysctlsItem) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new ArrayList<>();
    }
    this.allowedUnsafeSysctls.add(allowedUnsafeSysctlsItem);
    return this;
  }

  /**
   * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
   * entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered
   * as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
   * allowlist all allowed unsafe sysctls explicitly to avoid rejection. Examples: e.g.
   * \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g.
   * \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   *
   * @return allowedUnsafeSysctls
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to allowlist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \"foo/_*\" allows \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" allows \"foo.bar\", \"foo.baz\", etc.")
  public List<String> getAllowedUnsafeSysctls() {
    return allowedUnsafeSysctls;
  }

  public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
  }

  public V1beta1PodSecurityPolicySpec defaultAddCapabilities(List<String> defaultAddCapabilities) {

    this.defaultAddCapabilities = defaultAddCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addDefaultAddCapabilitiesItem(
      String defaultAddCapabilitiesItem) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new ArrayList<>();
    }
    this.defaultAddCapabilities.add(defaultAddCapabilitiesItem);
    return this;
  }

  /**
   * defaultAddCapabilities is the default set of capabilities that will be added to the container
   * unless the pod spec specifically drops the capability. You may not list a capability in both
   * defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly
   * allowed, and need not be included in the allowedCapabilities list.
   *
   * @return defaultAddCapabilities
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.")
  public List<String> getDefaultAddCapabilities() {
    return defaultAddCapabilities;
  }

  public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
  }

  public V1beta1PodSecurityPolicySpec defaultAllowPrivilegeEscalation(
      Boolean defaultAllowPrivilegeEscalation) {

    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return this;
  }

  /**
   * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
   * more privileges than its parent process.
   *
   * @return defaultAllowPrivilegeEscalation
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.")
  public Boolean getDefaultAllowPrivilegeEscalation() {
    return defaultAllowPrivilegeEscalation;
  }

  public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
  }

  public V1beta1PodSecurityPolicySpec forbiddenSysctls(List<String> forbiddenSysctls) {

    this.forbiddenSysctls = forbiddenSysctls;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addForbiddenSysctlsItem(String forbiddenSysctlsItem) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new ArrayList<>();
    }
    this.forbiddenSysctls.add(forbiddenSysctlsItem);
    return this;
  }

  /**
   * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
   * either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a
   * prefix of forbidden sysctls. Single * means all sysctls are forbidden. Examples: e.g.
   * \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g.
   * \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   *
   * @return forbiddenSysctls
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \"foo/_*\" forbids \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" forbids \"foo.bar\", \"foo.baz\", etc.")
  public List<String> getForbiddenSysctls() {
    return forbiddenSysctls;
  }

  public void setForbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
  }

  public V1beta1PodSecurityPolicySpec fsGroup(V1beta1FSGroupStrategyOptions fsGroup) {

    this.fsGroup = fsGroup;
    return this;
  }

  /**
   * Get fsGroup
   *
   * @return fsGroup
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1FSGroupStrategyOptions getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(V1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
  }

  public V1beta1PodSecurityPolicySpec hostIPC(Boolean hostIPC) {

    this.hostIPC = hostIPC;
    return this;
  }

  /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
   *
   * @return hostIPC
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "hostIPC determines if the policy allows the use of HostIPC in the pod spec.")
  public Boolean getHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public V1beta1PodSecurityPolicySpec hostNetwork(Boolean hostNetwork) {

    this.hostNetwork = hostNetwork;
    return this;
  }

  /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
   *
   * @return hostNetwork
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.")
  public Boolean getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public V1beta1PodSecurityPolicySpec hostPID(Boolean hostPID) {

    this.hostPID = hostPID;
    return this;
  }

  /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
   *
   * @return hostPID
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "hostPID determines if the policy allows the use of HostPID in the pod spec.")
  public Boolean getHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public V1beta1PodSecurityPolicySpec hostPorts(List<V1beta1HostPortRange> hostPorts) {

    this.hostPorts = hostPorts;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addHostPortsItem(V1beta1HostPortRange hostPortsItem) {
    if (this.hostPorts == null) {
      this.hostPorts = new ArrayList<>();
    }
    this.hostPorts.add(hostPortsItem);
    return this;
  }

  /**
   * hostPorts determines which host port ranges are allowed to be exposed.
   *
   * @return hostPorts
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "hostPorts determines which host port ranges are allowed to be exposed.")
  public List<V1beta1HostPortRange> getHostPorts() {
    return hostPorts;
  }

  public void setHostPorts(List<V1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
  }

  public V1beta1PodSecurityPolicySpec privileged(Boolean privileged) {

    this.privileged = privileged;
    return this;
  }

  /**
   * privileged determines if a pod can request to be run as privileged.
   *
   * @return privileged
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "privileged determines if a pod can request to be run as privileged.")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public V1beta1PodSecurityPolicySpec readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {

    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  /**
   * readOnlyRootFilesystem when set to true will force containers to run with a read only root file
   * system. If the container specifically requests to run with a non-read only root file system the
   * PSP should deny the pod. If set to false the container may run with a read only root file
   * system if it wishes but it will not be forced to.
   *
   * @return readOnlyRootFilesystem
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.")
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public V1beta1PodSecurityPolicySpec requiredDropCapabilities(
      List<String> requiredDropCapabilities) {

    this.requiredDropCapabilities = requiredDropCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addRequiredDropCapabilitiesItem(
      String requiredDropCapabilitiesItem) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new ArrayList<>();
    }
    this.requiredDropCapabilities.add(requiredDropCapabilitiesItem);
    return this;
  }

  /**
   * requiredDropCapabilities are the capabilities that will be dropped from the container. These
   * are required to be dropped and cannot be added.
   *
   * @return requiredDropCapabilities
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.")
  public List<String> getRequiredDropCapabilities() {
    return requiredDropCapabilities;
  }

  public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
  }

  public V1beta1PodSecurityPolicySpec runAsGroup(V1beta1RunAsGroupStrategyOptions runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

  /**
   * Get runAsGroup
   *
   * @return runAsGroup
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1RunAsGroupStrategyOptions getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(V1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public V1beta1PodSecurityPolicySpec runAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

  /**
   * Get runAsUser
   *
   * @return runAsUser
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1RunAsUserStrategyOptions getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
  }

  public V1beta1PodSecurityPolicySpec runtimeClass(
      V1beta1RuntimeClassStrategyOptions runtimeClass) {

    this.runtimeClass = runtimeClass;
    return this;
  }

  /**
   * Get runtimeClass
   *
   * @return runtimeClass
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1beta1RuntimeClassStrategyOptions getRuntimeClass() {
    return runtimeClass;
  }

  public void setRuntimeClass(V1beta1RuntimeClassStrategyOptions runtimeClass) {
    this.runtimeClass = runtimeClass;
  }

  public V1beta1PodSecurityPolicySpec seLinux(V1beta1SELinuxStrategyOptions seLinux) {

    this.seLinux = seLinux;
    return this;
  }

  /**
   * Get seLinux
   *
   * @return seLinux
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1SELinuxStrategyOptions getSeLinux() {
    return seLinux;
  }

  public void setSeLinux(V1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
  }

  public V1beta1PodSecurityPolicySpec supplementalGroups(
      V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {

    this.supplementalGroups = supplementalGroups;
    return this;
  }

  /**
   * Get supplementalGroups
   *
   * @return supplementalGroups
   */
  @ApiModelProperty(required = true, value = "")
  public V1beta1SupplementalGroupsStrategyOptions getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public V1beta1PodSecurityPolicySpec volumes(List<String> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * volumes is an allowlist of volume plugins. Empty indicates that no volumes may be used. To
   * allow all volumes you may use &#39;*&#39;.
   *
   * @return volumes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumes is an allowlist of volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodSecurityPolicySpec v1beta1PodSecurityPolicySpec = (V1beta1PodSecurityPolicySpec) o;
    return Objects.equals(
            this.allowPrivilegeEscalation, v1beta1PodSecurityPolicySpec.allowPrivilegeEscalation)
        && Objects.equals(this.allowedCSIDrivers, v1beta1PodSecurityPolicySpec.allowedCSIDrivers)
        && Objects.equals(
            this.allowedCapabilities, v1beta1PodSecurityPolicySpec.allowedCapabilities)
        && Objects.equals(this.allowedFlexVolumes, v1beta1PodSecurityPolicySpec.allowedFlexVolumes)
        && Objects.equals(this.allowedHostPaths, v1beta1PodSecurityPolicySpec.allowedHostPaths)
        && Objects.equals(
            this.allowedProcMountTypes, v1beta1PodSecurityPolicySpec.allowedProcMountTypes)
        && Objects.equals(
            this.allowedUnsafeSysctls, v1beta1PodSecurityPolicySpec.allowedUnsafeSysctls)
        && Objects.equals(
            this.defaultAddCapabilities, v1beta1PodSecurityPolicySpec.defaultAddCapabilities)
        && Objects.equals(
            this.defaultAllowPrivilegeEscalation,
            v1beta1PodSecurityPolicySpec.defaultAllowPrivilegeEscalation)
        && Objects.equals(this.forbiddenSysctls, v1beta1PodSecurityPolicySpec.forbiddenSysctls)
        && Objects.equals(this.fsGroup, v1beta1PodSecurityPolicySpec.fsGroup)
        && Objects.equals(this.hostIPC, v1beta1PodSecurityPolicySpec.hostIPC)
        && Objects.equals(this.hostNetwork, v1beta1PodSecurityPolicySpec.hostNetwork)
        && Objects.equals(this.hostPID, v1beta1PodSecurityPolicySpec.hostPID)
        && Objects.equals(this.hostPorts, v1beta1PodSecurityPolicySpec.hostPorts)
        && Objects.equals(this.privileged, v1beta1PodSecurityPolicySpec.privileged)
        && Objects.equals(
            this.readOnlyRootFilesystem, v1beta1PodSecurityPolicySpec.readOnlyRootFilesystem)
        && Objects.equals(
            this.requiredDropCapabilities, v1beta1PodSecurityPolicySpec.requiredDropCapabilities)
        && Objects.equals(this.runAsGroup, v1beta1PodSecurityPolicySpec.runAsGroup)
        && Objects.equals(this.runAsUser, v1beta1PodSecurityPolicySpec.runAsUser)
        && Objects.equals(this.runtimeClass, v1beta1PodSecurityPolicySpec.runtimeClass)
        && Objects.equals(this.seLinux, v1beta1PodSecurityPolicySpec.seLinux)
        && Objects.equals(this.supplementalGroups, v1beta1PodSecurityPolicySpec.supplementalGroups)
        && Objects.equals(this.volumes, v1beta1PodSecurityPolicySpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowPrivilegeEscalation,
        allowedCSIDrivers,
        allowedCapabilities,
        allowedFlexVolumes,
        allowedHostPaths,
        allowedProcMountTypes,
        allowedUnsafeSysctls,
        defaultAddCapabilities,
        defaultAllowPrivilegeEscalation,
        forbiddenSysctls,
        fsGroup,
        hostIPC,
        hostNetwork,
        hostPID,
        hostPorts,
        privileged,
        readOnlyRootFilesystem,
        requiredDropCapabilities,
        runAsGroup,
        runAsUser,
        runtimeClass,
        seLinux,
        supplementalGroups,
        volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodSecurityPolicySpec {\n");
    sb.append("    allowPrivilegeEscalation: ")
        .append(toIndentedString(allowPrivilegeEscalation))
        .append("\n");
    sb.append("    allowedCSIDrivers: ").append(toIndentedString(allowedCSIDrivers)).append("\n");
    sb.append("    allowedCapabilities: ")
        .append(toIndentedString(allowedCapabilities))
        .append("\n");
    sb.append("    allowedFlexVolumes: ").append(toIndentedString(allowedFlexVolumes)).append("\n");
    sb.append("    allowedHostPaths: ").append(toIndentedString(allowedHostPaths)).append("\n");
    sb.append("    allowedProcMountTypes: ")
        .append(toIndentedString(allowedProcMountTypes))
        .append("\n");
    sb.append("    allowedUnsafeSysctls: ")
        .append(toIndentedString(allowedUnsafeSysctls))
        .append("\n");
    sb.append("    defaultAddCapabilities: ")
        .append(toIndentedString(defaultAddCapabilities))
        .append("\n");
    sb.append("    defaultAllowPrivilegeEscalation: ")
        .append(toIndentedString(defaultAllowPrivilegeEscalation))
        .append("\n");
    sb.append("    forbiddenSysctls: ").append(toIndentedString(forbiddenSysctls)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostPorts: ").append(toIndentedString(hostPorts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ")
        .append(toIndentedString(readOnlyRootFilesystem))
        .append("\n");
    sb.append("    requiredDropCapabilities: ")
        .append(toIndentedString(requiredDropCapabilities))
        .append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    runtimeClass: ").append(toIndentedString(runtimeClass)).append("\n");
    sb.append("    seLinux: ").append(toIndentedString(seLinux)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
