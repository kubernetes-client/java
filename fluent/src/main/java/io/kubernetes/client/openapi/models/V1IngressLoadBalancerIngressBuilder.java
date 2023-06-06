package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressLoadBalancerIngressBuilder extends V1IngressLoadBalancerIngressFluentImpl<V1IngressLoadBalancerIngressBuilder> implements VisitableBuilder<V1IngressLoadBalancerIngress,V1IngressLoadBalancerIngressBuilder>{
  public V1IngressLoadBalancerIngressBuilder() {
    this(false);
  }
  public V1IngressLoadBalancerIngressBuilder(Boolean validationEnabled) {
    this(new V1IngressLoadBalancerIngress(), validationEnabled);
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressLoadBalancerIngress(), validationEnabled);
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent,V1IngressLoadBalancerIngress instance) {
    this(fluent, instance, false);
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngressFluent<?> fluent,V1IngressLoadBalancerIngress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withHostname(instance.getHostname());
      fluent.withIp(instance.getIp());
      fluent.withPorts(instance.getPorts());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngress instance) {
    this(instance,false);
  }
  public V1IngressLoadBalancerIngressBuilder(V1IngressLoadBalancerIngress instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withHostname(instance.getHostname());
      this.withIp(instance.getIp());
      this.withPorts(instance.getPorts());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1IngressLoadBalancerIngressFluent<?> fluent;
  Boolean validationEnabled;
  public V1IngressLoadBalancerIngress build() {
    V1IngressLoadBalancerIngress buildable = new V1IngressLoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
  
}