package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodReadinessGateBuilder extends V1PodReadinessGateFluentImpl<V1PodReadinessGateBuilder> implements VisitableBuilder<V1PodReadinessGate,V1PodReadinessGateBuilder>{
  public V1PodReadinessGateBuilder() {
    this(false);
  }
  public V1PodReadinessGateBuilder(Boolean validationEnabled) {
    this(new V1PodReadinessGate(), validationEnabled);
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodReadinessGate(), validationEnabled);
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent,V1PodReadinessGate instance) {
    this(fluent, instance, false);
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGateFluent<?> fluent,V1PodReadinessGate instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditionType(instance.getConditionType());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGate instance) {
    this(instance,false);
  }
  public V1PodReadinessGateBuilder(V1PodReadinessGate instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditionType(instance.getConditionType());

    this.validationEnabled = validationEnabled; 
  }
  V1PodReadinessGateFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodReadinessGate build() {
    V1PodReadinessGate buildable = new V1PodReadinessGate();
    buildable.setConditionType(fluent.getConditionType());
    return buildable;
  }
  
}