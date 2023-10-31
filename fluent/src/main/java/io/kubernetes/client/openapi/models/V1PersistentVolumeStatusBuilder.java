package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeStatusBuilder extends V1PersistentVolumeStatusFluent<V1PersistentVolumeStatusBuilder> implements VisitableBuilder<V1PersistentVolumeStatus,V1PersistentVolumeStatusBuilder>{
  public V1PersistentVolumeStatusBuilder() {
    this(new V1PersistentVolumeStatus());
  }
  
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeStatus());
  }
  
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent,V1PersistentVolumeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeStatusFluent<?> fluent;
  
  public V1PersistentVolumeStatus build() {
    V1PersistentVolumeStatus buildable = new V1PersistentVolumeStatus();
    buildable.setLastPhaseTransitionTime(fluent.getLastPhaseTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setPhase(fluent.getPhase());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}