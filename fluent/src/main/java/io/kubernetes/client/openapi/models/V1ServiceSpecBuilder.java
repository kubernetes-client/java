package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceSpecBuilder extends V1ServiceSpecFluent<V1ServiceSpecBuilder> implements VisitableBuilder<V1ServiceSpec,V1ServiceSpecBuilder>{
  public V1ServiceSpecBuilder() {
    this(new V1ServiceSpec());
  }
  
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent) {
    this(fluent, new V1ServiceSpec());
  }
  
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent,V1ServiceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceSpecBuilder(V1ServiceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceSpecFluent<?> fluent;
  
  public V1ServiceSpec build() {
    V1ServiceSpec buildable = new V1ServiceSpec();
    buildable.setAllocateLoadBalancerNodePorts(fluent.getAllocateLoadBalancerNodePorts());
    buildable.setClusterIP(fluent.getClusterIP());
    buildable.setClusterIPs(fluent.getClusterIPs());
    buildable.setExternalIPs(fluent.getExternalIPs());
    buildable.setExternalName(fluent.getExternalName());
    buildable.setExternalTrafficPolicy(fluent.getExternalTrafficPolicy());
    buildable.setHealthCheckNodePort(fluent.getHealthCheckNodePort());
    buildable.setInternalTrafficPolicy(fluent.getInternalTrafficPolicy());
    buildable.setIpFamilies(fluent.getIpFamilies());
    buildable.setIpFamilyPolicy(fluent.getIpFamilyPolicy());
    buildable.setLoadBalancerClass(fluent.getLoadBalancerClass());
    buildable.setLoadBalancerIP(fluent.getLoadBalancerIP());
    buildable.setLoadBalancerSourceRanges(fluent.getLoadBalancerSourceRanges());
    buildable.setPorts(fluent.buildPorts());
    buildable.setPublishNotReadyAddresses(fluent.getPublishNotReadyAddresses());
    buildable.setSelector(fluent.getSelector());
    buildable.setSessionAffinity(fluent.getSessionAffinity());
    buildable.setSessionAffinityConfig(fluent.buildSessionAffinityConfig());
    buildable.setTrafficDistribution(fluent.getTrafficDistribution());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}