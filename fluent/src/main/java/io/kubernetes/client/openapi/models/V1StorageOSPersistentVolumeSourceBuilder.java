package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1StorageOSPersistentVolumeSourceBuilder extends V1StorageOSPersistentVolumeSourceFluent<V1StorageOSPersistentVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSPersistentVolumeSource,V1StorageOSPersistentVolumeSourceBuilder>{

  V1StorageOSPersistentVolumeSourceFluent<?> fluent;

  public V1StorageOSPersistentVolumeSourceBuilder() {
    this(new V1StorageOSPersistentVolumeSource());
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1StorageOSPersistentVolumeSource());
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent,V1StorageOSPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageOSPersistentVolumeSource build() {
    V1StorageOSPersistentVolumeSource buildable = new V1StorageOSPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  
}