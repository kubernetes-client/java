package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetStatusBuilder extends V1StatefulSetStatusFluent<V1StatefulSetStatusBuilder> implements VisitableBuilder<V1StatefulSetStatus,V1StatefulSetStatusBuilder>{
  public V1StatefulSetStatusBuilder() {
    this(new V1StatefulSetStatus());
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatusFluent<?> fluent) {
    this(fluent, new V1StatefulSetStatus());
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatusFluent<?> fluent,V1StatefulSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetStatusFluent<?> fluent;
  
  public V1StatefulSetStatus build() {
    V1StatefulSetStatus buildable = new V1StatefulSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setCurrentRevision(fluent.getCurrentRevision());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUpdateRevision(fluent.getUpdateRevision());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
  

}