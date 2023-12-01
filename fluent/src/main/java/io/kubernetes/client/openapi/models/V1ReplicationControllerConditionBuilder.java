package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicationControllerConditionBuilder extends V1ReplicationControllerConditionFluent<V1ReplicationControllerConditionBuilder> implements VisitableBuilder<V1ReplicationControllerCondition,V1ReplicationControllerConditionBuilder>{
  public V1ReplicationControllerConditionBuilder() {
    this(new V1ReplicationControllerCondition());
  }
  
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerCondition());
  }
  
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerConditionFluent<?> fluent,V1ReplicationControllerCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicationControllerConditionBuilder(V1ReplicationControllerCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicationControllerConditionFluent<?> fluent;
  
  public V1ReplicationControllerCondition build() {
    V1ReplicationControllerCondition buildable = new V1ReplicationControllerCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}