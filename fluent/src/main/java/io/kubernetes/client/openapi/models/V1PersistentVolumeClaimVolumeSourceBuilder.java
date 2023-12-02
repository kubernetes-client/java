package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimVolumeSourceBuilder extends V1PersistentVolumeClaimVolumeSourceFluent<V1PersistentVolumeClaimVolumeSourceBuilder> implements VisitableBuilder<V1PersistentVolumeClaimVolumeSource,V1PersistentVolumeClaimVolumeSourceBuilder>{
  public V1PersistentVolumeClaimVolumeSourceBuilder() {
    this(new V1PersistentVolumeClaimVolumeSource());
  }
  
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimVolumeSource());
  }
  
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,V1PersistentVolumeClaimVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimVolumeSourceBuilder(V1PersistentVolumeClaimVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimVolumeSourceFluent<?> fluent;
  
  public V1PersistentVolumeClaimVolumeSource build() {
    V1PersistentVolumeClaimVolumeSource buildable = new V1PersistentVolumeClaimVolumeSource();
    buildable.setClaimName(fluent.getClaimName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}