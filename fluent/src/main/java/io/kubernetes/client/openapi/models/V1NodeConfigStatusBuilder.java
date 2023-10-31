package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeConfigStatusBuilder extends V1NodeConfigStatusFluent<V1NodeConfigStatusBuilder> implements VisitableBuilder<V1NodeConfigStatus,V1NodeConfigStatusBuilder>{
  public V1NodeConfigStatusBuilder() {
    this(new V1NodeConfigStatus());
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent) {
    this(fluent, new V1NodeConfigStatus());
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent,V1NodeConfigStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeConfigStatusBuilder(V1NodeConfigStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeConfigStatusFluent<?> fluent;
  
  public V1NodeConfigStatus build() {
    V1NodeConfigStatus buildable = new V1NodeConfigStatus();
    buildable.setActive(fluent.buildActive());
    buildable.setAssigned(fluent.buildAssigned());
    buildable.setError(fluent.getError());
    buildable.setLastKnownGood(fluent.buildLastKnownGood());
    return buildable;
  }
  

}