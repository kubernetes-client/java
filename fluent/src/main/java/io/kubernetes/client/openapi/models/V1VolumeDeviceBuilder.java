package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeDeviceBuilder extends V1VolumeDeviceFluentImpl<V1VolumeDeviceBuilder> implements VisitableBuilder<V1VolumeDevice,V1VolumeDeviceBuilder>{
  public V1VolumeDeviceBuilder() {
    this(false);
  }
  public V1VolumeDeviceBuilder(Boolean validationEnabled) {
    this(new V1VolumeDevice(), validationEnabled);
  }
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeDevice(), validationEnabled);
  }
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent,V1VolumeDevice instance) {
    this(fluent, instance, false);
  }
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent,V1VolumeDevice instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDevicePath(instance.getDevicePath());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeDeviceBuilder(V1VolumeDevice instance) {
    this(instance,false);
  }
  public V1VolumeDeviceBuilder(V1VolumeDevice instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeDeviceFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeDevice build() {
    V1VolumeDevice buildable = new V1VolumeDevice();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}