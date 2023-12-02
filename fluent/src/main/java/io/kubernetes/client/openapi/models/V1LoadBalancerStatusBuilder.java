package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LoadBalancerStatusBuilder extends V1LoadBalancerStatusFluent<V1LoadBalancerStatusBuilder> implements VisitableBuilder<V1LoadBalancerStatus,V1LoadBalancerStatusBuilder>{
  public V1LoadBalancerStatusBuilder() {
    this(new V1LoadBalancerStatus());
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent) {
    this(fluent, new V1LoadBalancerStatus());
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatusFluent<?> fluent,V1LoadBalancerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LoadBalancerStatusBuilder(V1LoadBalancerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LoadBalancerStatusFluent<?> fluent;
  
  public V1LoadBalancerStatus build() {
    V1LoadBalancerStatus buildable = new V1LoadBalancerStatus();
    buildable.setIngress(fluent.buildIngress());
    return buildable;
  }
  

}