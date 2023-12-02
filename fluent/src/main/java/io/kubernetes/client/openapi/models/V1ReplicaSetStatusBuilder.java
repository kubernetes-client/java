package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicaSetStatusBuilder extends V1ReplicaSetStatusFluent<V1ReplicaSetStatusBuilder> implements VisitableBuilder<V1ReplicaSetStatus,V1ReplicaSetStatusBuilder>{
  public V1ReplicaSetStatusBuilder() {
    this(new V1ReplicaSetStatus());
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatusFluent<?> fluent) {
    this(fluent, new V1ReplicaSetStatus());
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatusFluent<?> fluent,V1ReplicaSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicaSetStatusFluent<?> fluent;
  
  public V1ReplicaSetStatus build() {
    V1ReplicaSetStatus buildable = new V1ReplicaSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setConditions(fluent.buildConditions());
    buildable.setFullyLabeledReplicas(fluent.getFullyLabeledReplicas());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
  

}