package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VsphereVirtualDiskVolumeSourceBuilder extends V1VsphereVirtualDiskVolumeSourceFluent<V1VsphereVirtualDiskVolumeSourceBuilder> implements VisitableBuilder<V1VsphereVirtualDiskVolumeSource,V1VsphereVirtualDiskVolumeSourceBuilder>{
  public V1VsphereVirtualDiskVolumeSourceBuilder() {
    this(new V1VsphereVirtualDiskVolumeSource());
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent) {
    this(fluent, new V1VsphereVirtualDiskVolumeSource());
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,V1VsphereVirtualDiskVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VsphereVirtualDiskVolumeSourceFluent<?> fluent;
  
  public V1VsphereVirtualDiskVolumeSource build() {
    V1VsphereVirtualDiskVolumeSource buildable = new V1VsphereVirtualDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setStoragePolicyID(fluent.getStoragePolicyID());
    buildable.setStoragePolicyName(fluent.getStoragePolicyName());
    buildable.setVolumePath(fluent.getVolumePath());
    return buildable;
  }
  

}