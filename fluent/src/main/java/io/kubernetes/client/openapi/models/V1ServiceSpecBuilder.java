package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceSpecBuilder extends V1ServiceSpecFluentImpl<V1ServiceSpecBuilder> implements VisitableBuilder<V1ServiceSpec,V1ServiceSpecBuilder>{
  public V1ServiceSpecBuilder() {
    this(false);
  }
  public V1ServiceSpecBuilder(Boolean validationEnabled) {
    this(new V1ServiceSpec(), validationEnabled);
  }
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceSpec(), validationEnabled);
  }
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent,V1ServiceSpec instance) {
    this(fluent, instance, false);
  }
  public V1ServiceSpecBuilder(V1ServiceSpecFluent<?> fluent,V1ServiceSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());

    fluent.withClusterIP(instance.getClusterIP());

    fluent.withClusterIPs(instance.getClusterIPs());

    fluent.withExternalIPs(instance.getExternalIPs());

    fluent.withExternalName(instance.getExternalName());

    fluent.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());

    fluent.withHealthCheckNodePort(instance.getHealthCheckNodePort());

    fluent.withInternalTrafficPolicy(instance.getInternalTrafficPolicy());

    fluent.withIpFamilies(instance.getIpFamilies());

    fluent.withIpFamilyPolicy(instance.getIpFamilyPolicy());

    fluent.withLoadBalancerClass(instance.getLoadBalancerClass());

    fluent.withLoadBalancerIP(instance.getLoadBalancerIP());

    fluent.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());

    fluent.withPorts(instance.getPorts());

    fluent.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());

    fluent.withSelector(instance.getSelector());

    fluent.withSessionAffinity(instance.getSessionAffinity());

    fluent.withSessionAffinityConfig(instance.getSessionAffinityConfig());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceSpecBuilder(V1ServiceSpec instance) {
    this(instance,false);
  }
  public V1ServiceSpecBuilder(V1ServiceSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllocateLoadBalancerNodePorts(instance.getAllocateLoadBalancerNodePorts());

    this.withClusterIP(instance.getClusterIP());

    this.withClusterIPs(instance.getClusterIPs());

    this.withExternalIPs(instance.getExternalIPs());

    this.withExternalName(instance.getExternalName());

    this.withExternalTrafficPolicy(instance.getExternalTrafficPolicy());

    this.withHealthCheckNodePort(instance.getHealthCheckNodePort());

    this.withInternalTrafficPolicy(instance.getInternalTrafficPolicy());

    this.withIpFamilies(instance.getIpFamilies());

    this.withIpFamilyPolicy(instance.getIpFamilyPolicy());

    this.withLoadBalancerClass(instance.getLoadBalancerClass());

    this.withLoadBalancerIP(instance.getLoadBalancerIP());

    this.withLoadBalancerSourceRanges(instance.getLoadBalancerSourceRanges());

    this.withPorts(instance.getPorts());

    this.withPublishNotReadyAddresses(instance.getPublishNotReadyAddresses());

    this.withSelector(instance.getSelector());

    this.withSessionAffinity(instance.getSessionAffinity());

    this.withSessionAffinityConfig(instance.getSessionAffinityConfig());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceSpecFluent<?> fluent;
  Boolean validationEnabled;
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
    buildable.setPorts(fluent.getPorts());
    buildable.setPublishNotReadyAddresses(fluent.getPublishNotReadyAddresses());
    buildable.setSelector(fluent.getSelector());
    buildable.setSessionAffinity(fluent.getSessionAffinity());
    buildable.setSessionAffinityConfig(fluent.getSessionAffinityConfig());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}