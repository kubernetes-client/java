package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScaleIOPersistentVolumeSourceBuilder extends V1ScaleIOPersistentVolumeSourceFluent<V1ScaleIOPersistentVolumeSourceBuilder> implements VisitableBuilder<V1ScaleIOPersistentVolumeSource,V1ScaleIOPersistentVolumeSourceBuilder>{
  public V1ScaleIOPersistentVolumeSourceBuilder() {
    this(new V1ScaleIOPersistentVolumeSource());
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ScaleIOPersistentVolumeSource());
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSourceFluent<?> fluent,V1ScaleIOPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScaleIOPersistentVolumeSourceFluent<?> fluent;
  
  public V1ScaleIOPersistentVolumeSource build() {
    V1ScaleIOPersistentVolumeSource buildable = new V1ScaleIOPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setGateway(fluent.getGateway());
    buildable.setProtectionDomain(fluent.getProtectionDomain());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setSslEnabled(fluent.getSslEnabled());
    buildable.setStorageMode(fluent.getStorageMode());
    buildable.setStoragePool(fluent.getStoragePool());
    buildable.setSystem(fluent.getSystem());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  

}