package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeClaimVolumeSourceBuilder extends V1PersistentVolumeClaimVolumeSourceFluentImpl<V1PersistentVolumeClaimVolumeSourceBuilder> implements VisitableBuilder<V1PersistentVolumeClaimVolumeSource,V1PersistentVolumeClaimVolumeSourceBuilder>{
  public V1PersistentVolumeClaimVolumeSourceBuilder() {
    this(false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,V1PersistentVolumeClaimVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,V1PersistentVolumeClaimVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withClaimName(instance.getClaimName());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSource instance) {
    this(instance,false);
  }
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withClaimName(instance.getClaimName());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeClaimVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeClaimVolumeSource build() {
    V1PersistentVolumeClaimVolumeSource buildable = new V1PersistentVolumeClaimVolumeSource();
    buildable.setClaimName(fluent.getClaimName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  
}