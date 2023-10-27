package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressLoadBalancerIngressBuilder extends V1IngressLoadBalancerIngressFluent<V1IngressLoadBalancerIngressBuilder> implements VisitableBuilder<V1IngressLoadBalancerIngress,V1IngressLoadBalancerIngressBuilder>{
  public V1IngressLoadBalancerIngressBuilder() {
    this(new V1IngressLoadBalancerIngress());
  }
  
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent) {
    this(fluent, new V1IngressLoadBalancerIngress());
  }
  
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent,V1IngressLoadBalancerIngress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressLoadBalancerIngressFluent<?> fluent;
  
  public V1IngressLoadBalancerIngress build() {
    V1IngressLoadBalancerIngress buildable = new V1IngressLoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  

}