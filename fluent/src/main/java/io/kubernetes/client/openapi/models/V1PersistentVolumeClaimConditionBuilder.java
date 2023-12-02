package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimConditionBuilder extends V1PersistentVolumeClaimConditionFluent<V1PersistentVolumeClaimConditionBuilder> implements VisitableBuilder<V1PersistentVolumeClaimCondition,V1PersistentVolumeClaimConditionBuilder>{
  public V1PersistentVolumeClaimConditionBuilder() {
    this(new V1PersistentVolumeClaimCondition());
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimConditionFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimCondition());
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimConditionFluent<?> fluent,V1PersistentVolumeClaimCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimConditionFluent<?> fluent;
  
  public V1PersistentVolumeClaimCondition build() {
    V1PersistentVolumeClaimCondition buildable = new V1PersistentVolumeClaimCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}