package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodSchedulingGateBuilder extends V1PodSchedulingGateFluentImpl<V1PodSchedulingGateBuilder> implements VisitableBuilder<V1PodSchedulingGate,V1PodSchedulingGateBuilder>{
  public V1PodSchedulingGateBuilder() {
    this(false);
  }
  public V1PodSchedulingGateBuilder(Boolean validationEnabled) {
    this(new V1PodSchedulingGate(), validationEnabled);
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodSchedulingGate(), validationEnabled);
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent,V1PodSchedulingGate instance) {
    this(fluent, instance, false);
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGateFluent<?> fluent,V1PodSchedulingGate instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGate instance) {
    this(instance,false);
  }
  public V1PodSchedulingGateBuilder(V1PodSchedulingGate instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1PodSchedulingGateFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodSchedulingGate build() {
    V1PodSchedulingGate buildable = new V1PodSchedulingGate();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}