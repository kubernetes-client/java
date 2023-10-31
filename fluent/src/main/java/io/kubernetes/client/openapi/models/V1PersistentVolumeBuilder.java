package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeBuilder extends V1PersistentVolumeFluent<V1PersistentVolumeBuilder> implements VisitableBuilder<V1PersistentVolume,V1PersistentVolumeBuilder>{
  public V1PersistentVolumeBuilder() {
    this(new V1PersistentVolume());
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent) {
    this(fluent, new V1PersistentVolume());
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent,V1PersistentVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeBuilder(V1PersistentVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeFluent<?> fluent;
  
  public V1PersistentVolume build() {
    V1PersistentVolume buildable = new V1PersistentVolume();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}