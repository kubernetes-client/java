package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodSchedulingGateBuilder extends V1PodSchedulingGateFluent<V1PodSchedulingGateBuilder> implements VisitableBuilder<V1PodSchedulingGate,V1PodSchedulingGateBuilder>{
  public V1PodSchedulingGateBuilder() {
    this(new V1PodSchedulingGate());
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent) {
    this(fluent, new V1PodSchedulingGate());
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent,V1PodSchedulingGate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodSchedulingGateBuilder(V1PodSchedulingGate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodSchedulingGateFluent<?> fluent;
  
  public V1PodSchedulingGate build() {
    V1PodSchedulingGate buildable = new V1PodSchedulingGate();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}