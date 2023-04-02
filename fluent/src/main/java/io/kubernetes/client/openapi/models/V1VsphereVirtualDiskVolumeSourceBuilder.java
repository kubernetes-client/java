package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VsphereVirtualDiskVolumeSourceBuilder extends V1VsphereVirtualDiskVolumeSourceFluentImpl<V1VsphereVirtualDiskVolumeSourceBuilder> implements VisitableBuilder<V1VsphereVirtualDiskVolumeSource,V1VsphereVirtualDiskVolumeSourceBuilder>{
  public V1VsphereVirtualDiskVolumeSourceBuilder() {
    this(false);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1VsphereVirtualDiskVolumeSource(), validationEnabled);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VsphereVirtualDiskVolumeSource(), validationEnabled);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,V1VsphereVirtualDiskVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,V1VsphereVirtualDiskVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withStoragePolicyID(instance.getStoragePolicyID());

    fluent.withStoragePolicyName(instance.getStoragePolicyName());

    fluent.withVolumePath(instance.getVolumePath());

    this.validationEnabled = validationEnabled; 
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSource instance) {
    this(instance,false);
  }
  public V1VsphereVirtualDiskVolumeSourceBuilder(V1VsphereVirtualDiskVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withStoragePolicyID(instance.getStoragePolicyID());

    this.withStoragePolicyName(instance.getStoragePolicyName());

    this.withVolumePath(instance.getVolumePath());

    this.validationEnabled = validationEnabled; 
  }
  V1VsphereVirtualDiskVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1VsphereVirtualDiskVolumeSource build() {
    V1VsphereVirtualDiskVolumeSource buildable = new V1VsphereVirtualDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setStoragePolicyID(fluent.getStoragePolicyID());
    buildable.setStoragePolicyName(fluent.getStoragePolicyName());
    buildable.setVolumePath(fluent.getVolumePath());
    return buildable;
  }
  
}