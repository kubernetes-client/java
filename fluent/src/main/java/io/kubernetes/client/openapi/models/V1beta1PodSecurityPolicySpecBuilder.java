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

public class V1beta1PodSecurityPolicySpecBuilder
    extends io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec,
        io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder> {
  public V1beta1PodSecurityPolicySpecBuilder() {
    this(false);
  }

  public V1beta1PodSecurityPolicySpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1PodSecurityPolicySpec(), validationEnabled);
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PodSecurityPolicySpec(), validationEnabled);
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec instance) {
    this(fluent, instance, false);
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    fluent.withAllowedCSIDrivers(instance.getAllowedCSIDrivers());

    fluent.withAllowedCapabilities(instance.getAllowedCapabilities());

    fluent.withAllowedFlexVolumes(instance.getAllowedFlexVolumes());

    fluent.withAllowedHostPaths(instance.getAllowedHostPaths());

    fluent.withAllowedProcMountTypes(instance.getAllowedProcMountTypes());

    fluent.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls());

    fluent.withDefaultAddCapabilities(instance.getDefaultAddCapabilities());

    fluent.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation());

    fluent.withForbiddenSysctls(instance.getForbiddenSysctls());

    fluent.withFsGroup(instance.getFsGroup());

    fluent.withHostIPC(instance.getHostIPC());

    fluent.withHostNetwork(instance.getHostNetwork());

    fluent.withHostPID(instance.getHostPID());

    fluent.withHostPorts(instance.getHostPorts());

    fluent.withPrivileged(instance.getPrivileged());

    fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    fluent.withRequiredDropCapabilities(instance.getRequiredDropCapabilities());

    fluent.withRunAsGroup(instance.getRunAsGroup());

    fluent.withRunAsUser(instance.getRunAsUser());

    fluent.withRuntimeClass(instance.getRuntimeClass());

    fluent.withSeLinux(instance.getSeLinux());

    fluent.withSupplementalGroups(instance.getSupplementalGroups());

    fluent.withVolumes(instance.getVolumes());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec instance) {
    this(instance, false);
  }

  public V1beta1PodSecurityPolicySpecBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    this.withAllowedCSIDrivers(instance.getAllowedCSIDrivers());

    this.withAllowedCapabilities(instance.getAllowedCapabilities());

    this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes());

    this.withAllowedHostPaths(instance.getAllowedHostPaths());

    this.withAllowedProcMountTypes(instance.getAllowedProcMountTypes());

    this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls());

    this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities());

    this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation());

    this.withForbiddenSysctls(instance.getForbiddenSysctls());

    this.withFsGroup(instance.getFsGroup());

    this.withHostIPC(instance.getHostIPC());

    this.withHostNetwork(instance.getHostNetwork());

    this.withHostPID(instance.getHostPID());

    this.withHostPorts(instance.getHostPorts());

    this.withPrivileged(instance.getPrivileged());

    this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsUser(instance.getRunAsUser());

    this.withRuntimeClass(instance.getRuntimeClass());

    this.withSeLinux(instance.getSeLinux());

    this.withSupplementalGroups(instance.getSupplementalGroups());

    this.withVolumes(instance.getVolumes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec build() {
    V1beta1PodSecurityPolicySpec buildable = new V1beta1PodSecurityPolicySpec();
    buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
    buildable.setAllowedCSIDrivers(fluent.getAllowedCSIDrivers());
    buildable.setAllowedCapabilities(fluent.getAllowedCapabilities());
    buildable.setAllowedFlexVolumes(fluent.getAllowedFlexVolumes());
    buildable.setAllowedHostPaths(fluent.getAllowedHostPaths());
    buildable.setAllowedProcMountTypes(fluent.getAllowedProcMountTypes());
    buildable.setAllowedUnsafeSysctls(fluent.getAllowedUnsafeSysctls());
    buildable.setDefaultAddCapabilities(fluent.getDefaultAddCapabilities());
    buildable.setDefaultAllowPrivilegeEscalation(fluent.getDefaultAllowPrivilegeEscalation());
    buildable.setForbiddenSysctls(fluent.getForbiddenSysctls());
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setHostIPC(fluent.getHostIPC());
    buildable.setHostNetwork(fluent.getHostNetwork());
    buildable.setHostPID(fluent.getHostPID());
    buildable.setHostPorts(fluent.getHostPorts());
    buildable.setPrivileged(fluent.getPrivileged());
    buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
    buildable.setRequiredDropCapabilities(fluent.getRequiredDropCapabilities());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setRuntimeClass(fluent.getRuntimeClass());
    buildable.setSeLinux(fluent.getSeLinux());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setVolumes(fluent.getVolumes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1PodSecurityPolicySpecBuilder that = (V1beta1PodSecurityPolicySpecBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
