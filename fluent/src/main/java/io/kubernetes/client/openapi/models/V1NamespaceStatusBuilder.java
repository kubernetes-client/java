package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamespaceStatusBuilder extends V1NamespaceStatusFluent<V1NamespaceStatusBuilder> implements VisitableBuilder<V1NamespaceStatus,V1NamespaceStatusBuilder>{
  public V1NamespaceStatusBuilder() {
    this(new V1NamespaceStatus());
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent) {
    this(fluent, new V1NamespaceStatus());
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent,V1NamespaceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamespaceStatusBuilder(V1NamespaceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamespaceStatusFluent<?> fluent;
  
  public V1NamespaceStatus build() {
    V1NamespaceStatus buildable = new V1NamespaceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  

}