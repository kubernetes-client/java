package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScaleIOVolumeSourceBuilder extends V1ScaleIOVolumeSourceFluent<V1ScaleIOVolumeSourceBuilder> implements VisitableBuilder<V1ScaleIOVolumeSource,V1ScaleIOVolumeSourceBuilder>{
  public V1ScaleIOVolumeSourceBuilder() {
    this(new V1ScaleIOVolumeSource());
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ScaleIOVolumeSource());
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent,V1ScaleIOVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScaleIOVolumeSourceFluent<?> fluent;
  
  public V1ScaleIOVolumeSource build() {
    V1ScaleIOVolumeSource buildable = new V1ScaleIOVolumeSource();
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