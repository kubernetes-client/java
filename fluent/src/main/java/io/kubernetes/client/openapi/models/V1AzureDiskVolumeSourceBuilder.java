package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AzureDiskVolumeSourceBuilder extends V1AzureDiskVolumeSourceFluent<V1AzureDiskVolumeSourceBuilder> implements VisitableBuilder<V1AzureDiskVolumeSource,V1AzureDiskVolumeSourceBuilder>{
  public V1AzureDiskVolumeSourceBuilder() {
    this(new V1AzureDiskVolumeSource());
  }
  
  public V1AzureDiskVolumeSourceBuilder(V1AzureDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AzureDiskVolumeSource());
  }
  
  public V1AzureDiskVolumeSourceBuilder(V1AzureDiskVolumeSourceFluent<?> fluent,V1AzureDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AzureDiskVolumeSourceBuilder(V1AzureDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AzureDiskVolumeSourceFluent<?> fluent;
  
  public V1AzureDiskVolumeSource build() {
    V1AzureDiskVolumeSource buildable = new V1AzureDiskVolumeSource();
    buildable.setCachingMode(fluent.getCachingMode());
    buildable.setDiskName(fluent.getDiskName());
    buildable.setDiskURI(fluent.getDiskURI());
    buildable.setFsType(fluent.getFsType());
    buildable.setKind(fluent.getKind());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}