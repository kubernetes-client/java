package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressLoadBalancerStatusBuilder extends V1IngressLoadBalancerStatusFluent<V1IngressLoadBalancerStatusBuilder> implements VisitableBuilder<V1IngressLoadBalancerStatus,V1IngressLoadBalancerStatusBuilder>{
  public V1IngressLoadBalancerStatusBuilder() {
    this(new V1IngressLoadBalancerStatus());
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent) {
    this(fluent, new V1IngressLoadBalancerStatus());
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatusFluent<?> fluent,V1IngressLoadBalancerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressLoadBalancerStatusBuilder(V1IngressLoadBalancerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressLoadBalancerStatusFluent<?> fluent;
  
  public V1IngressLoadBalancerStatus build() {
    V1IngressLoadBalancerStatus buildable = new V1IngressLoadBalancerStatus();
    buildable.setIngress(fluent.buildIngress());
    return buildable;
  }
  

}