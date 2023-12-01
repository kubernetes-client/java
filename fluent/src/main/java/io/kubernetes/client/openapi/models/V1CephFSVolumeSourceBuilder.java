package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CephFSVolumeSourceBuilder extends V1CephFSVolumeSourceFluent<V1CephFSVolumeSourceBuilder> implements VisitableBuilder<V1CephFSVolumeSource,V1CephFSVolumeSourceBuilder>{
  public V1CephFSVolumeSourceBuilder() {
    this(new V1CephFSVolumeSource());
  }
  
  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CephFSVolumeSource());
  }
  
  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSourceFluent<?> fluent,V1CephFSVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CephFSVolumeSourceBuilder(V1CephFSVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CephFSVolumeSourceFluent<?> fluent;
  
  public V1CephFSVolumeSource build() {
    V1CephFSVolumeSource buildable = new V1CephFSVolumeSource();
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretFile(fluent.getSecretFile());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}