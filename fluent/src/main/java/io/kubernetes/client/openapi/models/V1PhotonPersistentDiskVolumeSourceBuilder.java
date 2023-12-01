package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PhotonPersistentDiskVolumeSourceBuilder extends V1PhotonPersistentDiskVolumeSourceFluent<V1PhotonPersistentDiskVolumeSourceBuilder> implements VisitableBuilder<V1PhotonPersistentDiskVolumeSource,V1PhotonPersistentDiskVolumeSourceBuilder>{
  public V1PhotonPersistentDiskVolumeSourceBuilder() {
    this(new V1PhotonPersistentDiskVolumeSource());
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1PhotonPersistentDiskVolumeSource());
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,V1PhotonPersistentDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PhotonPersistentDiskVolumeSourceFluent<?> fluent;
  
  public V1PhotonPersistentDiskVolumeSource build() {
    V1PhotonPersistentDiskVolumeSource buildable = new V1PhotonPersistentDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPdID(fluent.getPdID());
    return buildable;
  }
  

}