package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodSpecBuilder extends V1PodSpecFluentImpl<V1PodSpecBuilder> implements VisitableBuilder<V1PodSpec,V1PodSpecBuilder>{
  public V1PodSpecBuilder() {
    this(false);
  }
  public V1PodSpecBuilder(Boolean validationEnabled) {
    this(new V1PodSpec(), validationEnabled);
  }
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodSpec(), validationEnabled);
  }
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent,V1PodSpec instance) {
    this(fluent, instance, false);
  }
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent,V1PodSpec instance,Boolean validationEnabled) {
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

    fluent.withHostUsers(instance.getHostUsers());

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
  public V1PodSpecBuilder(V1PodSpec instance) {
    this(instance,false);
  }
  public V1PodSpecBuilder(V1PodSpec instance,Boolean validationEnabled) {
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

    this.withHostUsers(instance.getHostUsers());

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
  V1PodSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodSpec build() {
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
    buildable.setHostUsers(fluent.getHostUsers());
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
  
}