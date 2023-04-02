package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeClaimStatusBuilder extends V1PersistentVolumeClaimStatusFluentImpl<V1PersistentVolumeClaimStatusBuilder> implements VisitableBuilder<V1PersistentVolumeClaimStatus,V1PersistentVolumeClaimStatusBuilder>{
  public V1PersistentVolumeClaimStatusBuilder() {
    this(false);
  }
  public V1PersistentVolumeClaimStatusBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimStatus(), validationEnabled);
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimStatus(), validationEnabled);
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent,V1PersistentVolumeClaimStatus instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent,V1PersistentVolumeClaimStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAccessModes(instance.getAccessModes());

    fluent.withAllocatedResources(instance.getAllocatedResources());

    fluent.withCapacity(instance.getCapacity());

    fluent.withConditions(instance.getConditions());

    fluent.withPhase(instance.getPhase());

    fluent.withResizeStatus(instance.getResizeStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatus instance) {
    this(instance,false);
  }
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAccessModes(instance.getAccessModes());

    this.withAllocatedResources(instance.getAllocatedResources());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.withResizeStatus(instance.getResizeStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeClaimStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeClaimStatus build() {
    V1PersistentVolumeClaimStatus buildable = new V1PersistentVolumeClaimStatus();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.getConditions());
    buildable.setPhase(fluent.getPhase());
    buildable.setResizeStatus(fluent.getResizeStatus());
    return buildable;
  }
  
}