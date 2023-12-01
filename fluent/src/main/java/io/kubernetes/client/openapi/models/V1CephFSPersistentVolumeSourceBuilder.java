package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CephFSPersistentVolumeSourceBuilder extends V1CephFSPersistentVolumeSourceFluent<V1CephFSPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CephFSPersistentVolumeSource,V1CephFSPersistentVolumeSourceBuilder>{
  public V1CephFSPersistentVolumeSourceBuilder() {
    this(new V1CephFSPersistentVolumeSource());
  }
  
  public V1CephFSPersistentVolumeSourceBuilder(V1CephFSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CephFSPersistentVolumeSource());
  }
  
  public V1CephFSPersistentVolumeSourceBuilder(V1CephFSPersistentVolumeSourceFluent<?> fluent,V1CephFSPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CephFSPersistentVolumeSourceBuilder(V1CephFSPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CephFSPersistentVolumeSourceFluent<?> fluent;
  
  public V1CephFSPersistentVolumeSource build() {
    V1CephFSPersistentVolumeSource buildable = new V1CephFSPersistentVolumeSource();
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretFile(fluent.getSecretFile());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}