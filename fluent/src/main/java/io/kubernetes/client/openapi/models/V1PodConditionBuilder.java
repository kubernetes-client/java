package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodConditionBuilder extends V1PodConditionFluent<V1PodConditionBuilder> implements VisitableBuilder<V1PodCondition,V1PodConditionBuilder>{
  public V1PodConditionBuilder() {
    this(new V1PodCondition());
  }
  
  public V1PodConditionBuilder(V1PodConditionFluent<?> fluent) {
    this(fluent, new V1PodCondition());
  }
  
  public V1PodConditionBuilder(V1PodConditionFluent<?> fluent,V1PodCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodConditionBuilder(V1PodCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodConditionFluent<?> fluent;
  
  public V1PodCondition build() {
    V1PodCondition buildable = new V1PodCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}