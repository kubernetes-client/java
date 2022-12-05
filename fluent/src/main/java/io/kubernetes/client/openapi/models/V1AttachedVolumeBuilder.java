package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AttachedVolumeBuilder extends V1AttachedVolumeFluentImpl<V1AttachedVolumeBuilder> implements VisitableBuilder<V1AttachedVolume,V1AttachedVolumeBuilder>{
  public V1AttachedVolumeBuilder() {
    this(false);
  }
  public V1AttachedVolumeBuilder(Boolean validationEnabled) {
    this(new V1AttachedVolume(), validationEnabled);
  }
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1AttachedVolume(), validationEnabled);
  }
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent,V1AttachedVolume instance) {
    this(fluent, instance, false);
  }
  public V1AttachedVolumeBuilder(V1AttachedVolumeFluent<?> fluent,V1AttachedVolume instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDevicePath(instance.getDevicePath());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1AttachedVolumeBuilder(V1AttachedVolume instance) {
    this(instance,false);
  }
  public V1AttachedVolumeBuilder(V1AttachedVolume instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1AttachedVolumeFluent<?> fluent;
  Boolean validationEnabled;
  public V1AttachedVolume build() {
    V1AttachedVolume buildable = new V1AttachedVolume();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}