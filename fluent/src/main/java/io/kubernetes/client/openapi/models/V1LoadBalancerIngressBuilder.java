package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LoadBalancerIngressBuilder extends V1LoadBalancerIngressFluentImpl<V1LoadBalancerIngressBuilder> implements VisitableBuilder<V1LoadBalancerIngress,V1LoadBalancerIngressBuilder>{
  public V1LoadBalancerIngressBuilder() {
    this(false);
  }
  public V1LoadBalancerIngressBuilder(Boolean validationEnabled) {
    this(new V1LoadBalancerIngress(), validationEnabled);
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LoadBalancerIngress(), validationEnabled);
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent,V1LoadBalancerIngress instance) {
    this(fluent, instance, false);
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent,V1LoadBalancerIngress instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHostname(instance.getHostname());

    fluent.withIp(instance.getIp());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance) {
    this(instance,false);
  }
  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled; 
  }
  V1LoadBalancerIngressFluent<?> fluent;
  Boolean validationEnabled;
  public V1LoadBalancerIngress build() {
    V1LoadBalancerIngress buildable = new V1LoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
  
}