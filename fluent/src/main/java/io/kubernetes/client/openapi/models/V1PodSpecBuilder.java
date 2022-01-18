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

public class V1PodSpecBuilder
    extends io.kubernetes.client.openapi.models.V1PodSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1PodSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodSpec,
        io.kubernetes.client.openapi.models.V1PodSpecBuilder> {
  public V1PodSpecBuilder() {
    this(false);
  }

  public V1PodSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodSpec(), validationEnabled);
  }

  public V1PodSpecBuilder(io.kubernetes.client.openapi.models.V1PodSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodSpec(), validationEnabled);
  }

  public V1PodSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodSpec instance) {
    this(fluent, instance, false);
  }

  public V1PodSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    fluent.withAffinity(instance.getAffinity());

    fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    fluent.withContainers(instance.getContainers());

    fluent.withDnsConfig(instance.getDnsConfig());

    fluent.withDnsPolicy(instance.getDnsPolicy());

    fluent.withEnableServiceLinks(instance.getEnableServiceLinks());

    fluent.withEphemeralContainers(instance.getEphemeralContainers());

    fluent.withHostAliases(instance.getHostAliases());

    fluent.withHostIPC(instance.getHostIPC());

    fluent.withHostNetwork(instance.getHostNetwork());

    fluent.withHostPID(instance.getHostPID());

    fluent.withHostname(instance.getHostname());

    fluent.withImagePullSecrets(instance.getImagePullSecrets());

    fluent.withInitContainers(instance.getInitContainers());

    fluent.withNodeName(instance.getNodeName());

    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withOs(instance.getOs());

    fluent.withOverhead(instance.getOverhead());

    fluent.withPreemptionPolicy(instance.getPreemptionPolicy());

    fluent.withPriority(instance.getPriority());

    fluent.withPriorityClassName(instance.getPriorityClassName());

    fluent.withReadinessGates(instance.getReadinessGates());

    fluent.withRestartPolicy(instance.getRestartPolicy());

    fluent.withRuntimeClassName(instance.getRuntimeClassName());

    fluent.withSchedulerName(instance.getSchedulerName());

    fluent.withSecurityContext(instance.getSecurityContext());

    fluent.withServiceAccount(instance.getServiceAccount());

    fluent.withServiceAccountName(instance.getServiceAccountName());

    fluent.withSetHostnameAsFQDN(instance.getSetHostnameAsFQDN());

    fluent.withShareProcessNamespace(instance.getShareProcessNamespace());

    fluent.withSubdomain(instance.getSubdomain());

    fluent.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());

    fluent.withTolerations(instance.getTolerations());

    fluent.withTopologySpreadConstraints(instance.getTopologySpreadConstraints());

    fluent.withVolumes(instance.getVolumes());

    this.validationEnabled = validationEnabled;
  }

  public V1PodSpecBuilder(io.kubernetes.client.openapi.models.V1PodSpec instance) {
    this(instance, false);
  }

  public V1PodSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodSpec instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    this.withAffinity(instance.getAffinity());

    this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    this.withContainers(instance.getContainers());

    this.withDnsConfig(instance.getDnsConfig());

    this.withDnsPolicy(instance.getDnsPolicy());

    this.withEnableServiceLinks(instance.getEnableServiceLinks());

    this.withEphemeralContainers(instance.getEphemeralContainers());

    this.withHostAliases(instance.getHostAliases());

    this.withHostIPC(instance.getHostIPC());

    this.withHostNetwork(instance.getHostNetwork());

    this.withHostPID(instance.getHostPID());

    this.withHostname(instance.getHostname());

    this.withImagePullSecrets(instance.getImagePullSecrets());

    this.withInitContainers(instance.getInitContainers());

    this.withNodeName(instance.getNodeName());

    this.withNodeSelector(instance.getNodeSelector());

    this.withOs(instance.getOs());

    this.withOverhead(instance.getOverhead());

    this.withPreemptionPolicy(instance.getPreemptionPolicy());

    this.withPriority(instance.getPriority());

    this.withPriorityClassName(instance.getPriorityClassName());

    this.withReadinessGates(instance.getReadinessGates());

    this.withRestartPolicy(instance.getRestartPolicy());

    this.withRuntimeClassName(instance.getRuntimeClassName());

    this.withSchedulerName(instance.getSchedulerName());

    this.withSecurityContext(instance.getSecurityContext());

    this.withServiceAccount(instance.getServiceAccount());

    this.withServiceAccountName(instance.getServiceAccountName());

    this.withSetHostnameAsFQDN(instance.getSetHostnameAsFQDN());

    this.withShareProcessNamespace(instance.getShareProcessNamespace());

    this.withSubdomain(instance.getSubdomain());

    this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());

    this.withTolerations(instance.getTolerations());

    this.withTopologySpreadConstraints(instance.getTopologySpreadConstraints());

    this.withVolumes(instance.getVolumes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodSpec build() {
    V1PodSpec buildable = new V1PodSpec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setAffinity(fluent.getAffinity());
    buildable.setAutomountServiceAccountToken(fluent.getAutomountServiceAccountToken());
    buildable.setContainers(fluent.getContainers());
    buildable.setDnsConfig(fluent.getDnsConfig());
    buildable.setDnsPolicy(fluent.getDnsPolicy());
    buildable.setEnableServiceLinks(fluent.getEnableServiceLinks());
    buildable.setEphemeralContainers(fluent.getEphemeralContainers());
    buildable.setHostAliases(fluent.getHostAliases());
    buildable.setHostIPC(fluent.getHostIPC());
    buildable.setHostNetwork(fluent.getHostNetwork());
    buildable.setHostPID(fluent.getHostPID());
    buildable.setHostname(fluent.getHostname());
    buildable.setImagePullSecrets(fluent.getImagePullSecrets());
    buildable.setInitContainers(fluent.getInitContainers());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setOs(fluent.getOs());
    buildable.setOverhead(fluent.getOverhead());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setReadinessGates(fluent.getReadinessGates());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    buildable.setRuntimeClassName(fluent.getRuntimeClassName());
    buildable.setSchedulerName(fluent.getSchedulerName());
    buildable.setSecurityContext(fluent.getSecurityContext());
    buildable.setServiceAccount(fluent.getServiceAccount());
    buildable.setServiceAccountName(fluent.getServiceAccountName());
    buildable.setSetHostnameAsFQDN(fluent.getSetHostnameAsFQDN());
    buildable.setShareProcessNamespace(fluent.getShareProcessNamespace());
    buildable.setSubdomain(fluent.getSubdomain());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTolerations(fluent.getTolerations());
    buildable.setTopologySpreadConstraints(fluent.getTopologySpreadConstraints());
    buildable.setVolumes(fluent.getVolumes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodSpecBuilder that = (V1PodSpecBuilder) o;
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
