package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeConditionBuilder extends V1NodeConditionFluent<V1NodeConditionBuilder> implements VisitableBuilder<V1NodeCondition,V1NodeConditionBuilder>{
  public V1NodeConditionBuilder() {
    this(new V1NodeCondition());
  }
  
  public V1NodeConditionBuilder(V1NodeConditionFluent<?> fluent) {
    this(fluent, new V1NodeCondition());
  }
  
  public V1NodeConditionBuilder(V1NodeConditionFluent<?> fluent,V1NodeCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeConditionBuilder(V1NodeCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeConditionFluent<?> fluent;
  
  public V1NodeCondition build() {
    V1NodeCondition buildable = new V1NodeCondition();
    buildable.setLastHeartbeatTime(fluent.getLastHeartbeatTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}