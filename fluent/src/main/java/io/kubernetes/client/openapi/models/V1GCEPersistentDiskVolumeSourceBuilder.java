package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GCEPersistentDiskVolumeSourceBuilder extends V1GCEPersistentDiskVolumeSourceFluent<V1GCEPersistentDiskVolumeSourceBuilder> implements VisitableBuilder<V1GCEPersistentDiskVolumeSource,V1GCEPersistentDiskVolumeSourceBuilder>{
  public V1GCEPersistentDiskVolumeSourceBuilder() {
    this(new V1GCEPersistentDiskVolumeSource());
  }
  
  public V1GCEPersistentDiskVolumeSourceBuilder(V1GCEPersistentDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GCEPersistentDiskVolumeSource());
  }
  
  public V1GCEPersistentDiskVolumeSourceBuilder(V1GCEPersistentDiskVolumeSourceFluent<?> fluent,V1GCEPersistentDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GCEPersistentDiskVolumeSourceBuilder(V1GCEPersistentDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GCEPersistentDiskVolumeSourceFluent<?> fluent;
  
  public V1GCEPersistentDiskVolumeSource build() {
    V1GCEPersistentDiskVolumeSource buildable = new V1GCEPersistentDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setPdName(fluent.getPdName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}