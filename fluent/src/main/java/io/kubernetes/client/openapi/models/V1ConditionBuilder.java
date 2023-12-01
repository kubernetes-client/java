package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConditionBuilder extends V1ConditionFluent<V1ConditionBuilder> implements VisitableBuilder<V1Condition,V1ConditionBuilder>{
  public V1ConditionBuilder() {
    this(new V1Condition());
  }
  
  public V1ConditionBuilder(V1ConditionFluent<?> fluent) {
    this(fluent, new V1Condition());
  }
  
  public V1ConditionBuilder(V1ConditionFluent<?> fluent,V1Condition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConditionBuilder(V1Condition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConditionFluent<?> fluent;
  
  public V1Condition build() {
    V1Condition buildable = new V1Condition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}