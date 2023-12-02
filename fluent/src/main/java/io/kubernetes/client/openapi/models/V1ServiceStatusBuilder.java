package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceStatusBuilder extends V1ServiceStatusFluent<V1ServiceStatusBuilder> implements VisitableBuilder<V1ServiceStatus,V1ServiceStatusBuilder>{
  public V1ServiceStatusBuilder() {
    this(new V1ServiceStatus());
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent) {
    this(fluent, new V1ServiceStatus());
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatusFluent<?> fluent,V1ServiceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceStatusBuilder(V1ServiceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceStatusFluent<?> fluent;
  
  public V1ServiceStatus build() {
    V1ServiceStatus buildable = new V1ServiceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setLoadBalancer(fluent.buildLoadBalancer());
    return buildable;
  }
  

}