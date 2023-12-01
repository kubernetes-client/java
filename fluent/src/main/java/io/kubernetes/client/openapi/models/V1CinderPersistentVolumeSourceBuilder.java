package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CinderPersistentVolumeSourceBuilder extends V1CinderPersistentVolumeSourceFluent<V1CinderPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CinderPersistentVolumeSource,V1CinderPersistentVolumeSourceBuilder>{
  public V1CinderPersistentVolumeSourceBuilder() {
    this(new V1CinderPersistentVolumeSource());
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CinderPersistentVolumeSource());
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSourceFluent<?> fluent,V1CinderPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CinderPersistentVolumeSourceBuilder(V1CinderPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CinderPersistentVolumeSourceFluent<?> fluent;
  
  public V1CinderPersistentVolumeSource build() {
    V1CinderPersistentVolumeSource buildable = new V1CinderPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}