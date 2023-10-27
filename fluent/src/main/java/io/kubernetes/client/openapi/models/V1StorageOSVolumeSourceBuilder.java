package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StorageOSVolumeSourceBuilder extends V1StorageOSVolumeSourceFluent<V1StorageOSVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSVolumeSource,V1StorageOSVolumeSourceBuilder>{
  public V1StorageOSVolumeSourceBuilder() {
    this(new V1StorageOSVolumeSource());
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent) {
    this(fluent, new V1StorageOSVolumeSource());
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent,V1StorageOSVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StorageOSVolumeSourceFluent<?> fluent;
  
  public V1StorageOSVolumeSource build() {
    V1StorageOSVolumeSource buildable = new V1StorageOSVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  

}