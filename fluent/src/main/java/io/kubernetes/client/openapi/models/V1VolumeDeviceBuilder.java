package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeDeviceBuilder extends V1VolumeDeviceFluent<V1VolumeDeviceBuilder> implements VisitableBuilder<V1VolumeDevice,V1VolumeDeviceBuilder>{
  public V1VolumeDeviceBuilder() {
    this(new V1VolumeDevice());
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent) {
    this(fluent, new V1VolumeDevice());
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDeviceFluent<?> fluent,V1VolumeDevice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeDeviceBuilder(V1VolumeDevice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeDeviceFluent<?> fluent;
  
  public V1VolumeDevice build() {
    V1VolumeDevice buildable = new V1VolumeDevice();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}