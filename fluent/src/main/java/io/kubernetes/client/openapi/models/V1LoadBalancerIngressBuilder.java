package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LoadBalancerIngressBuilder extends V1LoadBalancerIngressFluent<V1LoadBalancerIngressBuilder> implements VisitableBuilder<V1LoadBalancerIngress,V1LoadBalancerIngressBuilder>{
  public V1LoadBalancerIngressBuilder() {
    this(new V1LoadBalancerIngress());
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent) {
    this(fluent, new V1LoadBalancerIngress());
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent,V1LoadBalancerIngress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LoadBalancerIngressFluent<?> fluent;
  
  public V1LoadBalancerIngress build() {
    V1LoadBalancerIngress buildable = new V1LoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setIpMode(fluent.getIpMode());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  

}