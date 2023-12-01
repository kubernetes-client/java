package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicaSetConditionBuilder extends V1ReplicaSetConditionFluent<V1ReplicaSetConditionBuilder> implements VisitableBuilder<V1ReplicaSetCondition,V1ReplicaSetConditionBuilder>{
  public V1ReplicaSetConditionBuilder() {
    this(new V1ReplicaSetCondition());
  }
  
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent) {
    this(fluent, new V1ReplicaSetCondition());
  }
  
  public V1ReplicaSetConditionBuilder(V1ReplicaSetConditionFluent<?> fluent,V1ReplicaSetCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicaSetConditionBuilder(V1ReplicaSetCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicaSetConditionFluent<?> fluent;
  
  public V1ReplicaSetCondition build() {
    V1ReplicaSetCondition buildable = new V1ReplicaSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}