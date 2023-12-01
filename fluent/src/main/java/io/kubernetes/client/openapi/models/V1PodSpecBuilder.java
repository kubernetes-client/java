package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodSpecBuilder extends V1PodSpecFluent<V1PodSpecBuilder> implements VisitableBuilder<V1PodSpec,V1PodSpecBuilder>{
  public V1PodSpecBuilder() {
    this(new V1PodSpec());
  }
  
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent) {
    this(fluent, new V1PodSpec());
  }
  
  public V1PodSpecBuilder(V1PodSpecFluent<?> fluent,V1PodSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodSpecBuilder(V1PodSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodSpecFluent<?> fluent;
  
  public V1PodSpec build() {
    V1PodSpec buildable = new V1PodSpec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setAffinity(fluent.buildAffinity());
    buildable.setAutomountServiceAccountToken(fluent.getAutomountServiceAccountToken());
    buildable.setContainers(fluent.buildContainers());
    buildable.setDnsConfig(fluent.buildDnsConfig());
    buildable.setDnsPolicy(fluent.getDnsPolicy());
    buildable.setEnableServiceLinks(fluent.getEnableServiceLinks());
    buildable.setEphemeralContainers(fluent.buildEphemeralContainers());
    buildable.setHostAliases(fluent.buildHostAliases());
    buildable.setHostIPC(fluent.getHostIPC());
    buildable.setHostNetwork(fluent.getHostNetwork());
    buildable.setHostPID(fluent.getHostPID());
    buildable.setHostUsers(fluent.getHostUsers());
    buildable.setHostname(fluent.getHostname());
    buildable.setImagePullSecrets(fluent.buildImagePullSecrets());
    buildable.setInitContainers(fluent.buildInitContainers());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setOs(fluent.buildOs());
    buildable.setOverhead(fluent.getOverhead());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setReadinessGates(fluent.buildReadinessGates());
    buildable.setResourceClaims(fluent.buildResourceClaims());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    buildable.setRuntimeClassName(fluent.getRuntimeClassName());
    buildable.setSchedulerName(fluent.getSchedulerName());
    buildable.setSchedulingGates(fluent.buildSchedulingGates());
    buildable.setSecurityContext(fluent.buildSecurityContext());
    buildable.setServiceAccount(fluent.getServiceAccount());
    buildable.setServiceAccountName(fluent.getServiceAccountName());
    buildable.setSetHostnameAsFQDN(fluent.getSetHostnameAsFQDN());
    buildable.setShareProcessNamespace(fluent.getShareProcessNamespace());
    buildable.setSubdomain(fluent.getSubdomain());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTolerations(fluent.buildTolerations());
    buildable.setTopologySpreadConstraints(fluent.buildTopologySpreadConstraints());
    buildable.setVolumes(fluent.buildVolumes());
    return buildable;
  }
  

}