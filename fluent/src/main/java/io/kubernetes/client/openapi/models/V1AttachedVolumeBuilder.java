package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AttachedVolumeBuilder extends V1AttachedVolumeFluent<V1AttachedVolumeBuilder> implements VisitableBuilder<V1AttachedVolume,V1AttachedVolumeBuilder>{
  public V1AttachedVolumeBuilder() {
    this(new V1AttachedVolume());
  }
  
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent) {
    this(fluent, new V1AttachedVolume());
  }
  
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent,V1AttachedVolume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AttachedVolumeBuilder(V1AttachedVolume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AttachedVolumeFluent<?> fluent;
  
  public V1AttachedVolume build() {
    V1AttachedVolume buildable = new V1AttachedVolume();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}