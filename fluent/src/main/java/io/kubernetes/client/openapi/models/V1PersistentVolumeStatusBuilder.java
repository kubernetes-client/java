package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeStatusBuilder extends V1PersistentVolumeStatusFluentImpl<V1PersistentVolumeStatusBuilder> implements VisitableBuilder<V1PersistentVolumeStatus,V1PersistentVolumeStatusBuilder>{
  public V1PersistentVolumeStatusBuilder() {
    this(false);
  }
  public V1PersistentVolumeStatusBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeStatus(), validationEnabled);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeStatus(), validationEnabled);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent,V1PersistentVolumeStatus instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatusFluent<?> fluent,V1PersistentVolumeStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withPhase(instance.getPhase());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatus instance) {
    this(instance,false);
  }
  public V1PersistentVolumeStatusBuilder(V1PersistentVolumeStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withPhase(instance.getPhase());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeStatus build() {
    V1PersistentVolumeStatus buildable = new V1PersistentVolumeStatus();
    buildable.setMessage(fluent.getMessage());
    buildable.setPhase(fluent.getPhase());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}