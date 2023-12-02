package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ComponentStatusBuilder extends V1ComponentStatusFluent<V1ComponentStatusBuilder> implements VisitableBuilder<V1ComponentStatus,V1ComponentStatusBuilder>{
  public V1ComponentStatusBuilder() {
    this(new V1ComponentStatus());
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent) {
    this(fluent, new V1ComponentStatus());
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent,V1ComponentStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ComponentStatusBuilder(V1ComponentStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ComponentStatusFluent<?> fluent;
  
  public V1ComponentStatus build() {
    V1ComponentStatus buildable = new V1ComponentStatus();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setConditions(fluent.buildConditions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}