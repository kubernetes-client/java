package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceBuilder extends V1beta1DeviceFluent<V1beta1DeviceBuilder> implements VisitableBuilder<V1beta1Device,V1beta1DeviceBuilder>{
  public V1beta1DeviceBuilder() {
    this(new V1beta1Device());
  }
  
  public V1beta1DeviceBuilder(V1beta1DeviceFluent<?> fluent) {
    this(fluent, new V1beta1Device());
  }
  
  public V1beta1DeviceBuilder(V1beta1DeviceFluent<?> fluent,V1beta1Device instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceBuilder(V1beta1Device instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceFluent<?> fluent;
  
  public V1beta1Device build() {
    V1beta1Device buildable = new V1beta1Device();
    buildable.setBasic(fluent.buildBasic());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}