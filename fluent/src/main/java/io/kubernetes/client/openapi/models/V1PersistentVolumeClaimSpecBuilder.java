package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimSpecBuilder extends V1PersistentVolumeClaimSpecFluent<V1PersistentVolumeClaimSpecBuilder> implements VisitableBuilder<V1PersistentVolumeClaimSpec,V1PersistentVolumeClaimSpecBuilder>{
  public V1PersistentVolumeClaimSpecBuilder() {
    this(new V1PersistentVolumeClaimSpec());
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpecFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimSpec());
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpecFluent<?> fluent,V1PersistentVolumeClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimSpecBuilder(V1PersistentVolumeClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimSpecFluent<?> fluent;
  
  public V1PersistentVolumeClaimSpec build() {
    V1PersistentVolumeClaimSpec buildable = new V1PersistentVolumeClaimSpec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setDataSource(fluent.buildDataSource());
    buildable.setDataSourceRef(fluent.buildDataSourceRef());
    buildable.setResources(fluent.buildResources());
    buildable.setSelector(fluent.buildSelector());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setVolumeAttributesClassName(fluent.getVolumeAttributesClassName());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  

}