package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamespaceConditionBuilder extends V1NamespaceConditionFluent<V1NamespaceConditionBuilder> implements VisitableBuilder<V1NamespaceCondition,V1NamespaceConditionBuilder>{
  public V1NamespaceConditionBuilder() {
    this(new V1NamespaceCondition());
  }
  
  public V1NamespaceConditionBuilder(V1NamespaceConditionFluent<?> fluent) {
    this(fluent, new V1NamespaceCondition());
  }
  
  public V1NamespaceConditionBuilder(V1NamespaceConditionFluent<?> fluent,V1NamespaceCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamespaceConditionBuilder(V1NamespaceCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamespaceConditionFluent<?> fluent;
  
  public V1NamespaceCondition build() {
    V1NamespaceCondition buildable = new V1NamespaceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}