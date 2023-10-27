package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressStatusBuilder extends V1IngressStatusFluent<V1IngressStatusBuilder> implements VisitableBuilder<V1IngressStatus,V1IngressStatusBuilder>{
  public V1IngressStatusBuilder() {
    this(new V1IngressStatus());
  }
  
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent) {
    this(fluent, new V1IngressStatus());
  }
  
  public V1IngressStatusBuilder(V1IngressStatusFluent<?> fluent,V1IngressStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressStatusBuilder(V1IngressStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressStatusFluent<?> fluent;
  
  public V1IngressStatus build() {
    V1IngressStatus buildable = new V1IngressStatus();
    buildable.setLoadBalancer(fluent.buildLoadBalancer());
    return buildable;
  }
  

}