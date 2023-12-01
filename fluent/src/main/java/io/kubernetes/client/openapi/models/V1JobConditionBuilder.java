package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1JobConditionBuilder extends V1JobConditionFluent<V1JobConditionBuilder> implements VisitableBuilder<V1JobCondition,V1JobConditionBuilder>{
  public V1JobConditionBuilder() {
    this(new V1JobCondition());
  }
  
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent) {
    this(fluent, new V1JobCondition());
  }
  
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent,V1JobCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1JobConditionBuilder(V1JobCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1JobConditionFluent<?> fluent;
  
  public V1JobCondition build() {
    V1JobCondition buildable = new V1JobCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}