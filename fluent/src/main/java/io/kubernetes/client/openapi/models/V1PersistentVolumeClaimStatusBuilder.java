package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimStatusBuilder extends V1PersistentVolumeClaimStatusFluent<V1PersistentVolumeClaimStatusBuilder> implements VisitableBuilder<V1PersistentVolumeClaimStatus,V1PersistentVolumeClaimStatusBuilder>{
  public V1PersistentVolumeClaimStatusBuilder() {
    this(new V1PersistentVolumeClaimStatus());
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimStatus());
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent,V1PersistentVolumeClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimStatusFluent<?> fluent;
  
  public V1PersistentVolumeClaimStatus build() {
    V1PersistentVolumeClaimStatus buildable = new V1PersistentVolumeClaimStatus();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAllocatedResourceStatuses(fluent.getAllocatedResourceStatuses());
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentVolumeAttributesClassName(fluent.getCurrentVolumeAttributesClassName());
    buildable.setModifyVolumeStatus(fluent.buildModifyVolumeStatus());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  

}