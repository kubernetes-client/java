package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicationControllerStatusBuilder extends V1ReplicationControllerStatusFluent<V1ReplicationControllerStatusBuilder> implements VisitableBuilder<V1ReplicationControllerStatus,V1ReplicationControllerStatusBuilder>{
  public V1ReplicationControllerStatusBuilder() {
    this(new V1ReplicationControllerStatus());
  }
  
  public V1ReplicationControllerStatusBuilder(V1ReplicationControllerStatusFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerStatus());
  }
  
  public V1ReplicationControllerStatusBuilder(V1ReplicationControllerStatusFluent<?> fluent,V1ReplicationControllerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicationControllerStatusBuilder(V1ReplicationControllerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicationControllerStatusFluent<?> fluent;
  
  public V1ReplicationControllerStatus build() {
    V1ReplicationControllerStatus buildable = new V1ReplicationControllerStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setConditions(fluent.buildConditions());
    buildable.setFullyLabeledReplicas(fluent.getFullyLabeledReplicas());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
  

}