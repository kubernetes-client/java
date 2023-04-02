package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CinderPersistentVolumeSourceBuilder extends V1CinderPersistentVolumeSourceFluentImpl<V1CinderPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CinderPersistentVolumeSource,V1CinderPersistentVolumeSourceBuilder>{
  public V1CinderPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1CinderPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CinderPersistentVolumeSource(), validationEnabled);
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CinderPersistentVolumeSource(), validationEnabled);
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent,V1CinderPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent,V1CinderPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  V1CinderPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1CinderPersistentVolumeSource build() {
    V1CinderPersistentVolumeSource buildable = new V1CinderPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}