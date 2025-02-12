package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1BasicDeviceBuilder extends V1beta1BasicDeviceFluent<V1beta1BasicDeviceBuilder> implements VisitableBuilder<V1beta1BasicDevice,V1beta1BasicDeviceBuilder>{
  public V1beta1BasicDeviceBuilder() {
    this(new V1beta1BasicDevice());
  }
  
  public V1beta1BasicDeviceBuilder(V1beta1BasicDeviceFluent<?> fluent) {
    this(fluent, new V1beta1BasicDevice());
  }
  
  public V1beta1BasicDeviceBuilder(V1beta1BasicDeviceFluent<?> fluent,V1beta1BasicDevice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1BasicDeviceBuilder(V1beta1BasicDevice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1BasicDeviceFluent<?> fluent;
  
  public V1beta1BasicDevice build() {
    V1beta1BasicDevice buildable = new V1beta1BasicDevice();
    buildable.setAttributes(fluent.getAttributes());
    buildable.setCapacity(fluent.getCapacity());
    return buildable;
  }
  

}