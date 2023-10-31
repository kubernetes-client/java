package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodReadinessGateBuilder extends V1PodReadinessGateFluent<V1PodReadinessGateBuilder> implements VisitableBuilder<V1PodReadinessGate,V1PodReadinessGateBuilder>{
  public V1PodReadinessGateBuilder() {
    this(new V1PodReadinessGate());
  }
  
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent) {
    this(fluent, new V1PodReadinessGate());
  }
  
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent,V1PodReadinessGate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodReadinessGateBuilder(V1PodReadinessGate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodReadinessGateFluent<?> fluent;
  
  public V1PodReadinessGate build() {
    V1PodReadinessGate buildable = new V1PodReadinessGate();
    buildable.setConditionType(fluent.getConditionType());
    return buildable;
  }
  

}