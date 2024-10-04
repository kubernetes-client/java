package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceBuilder extends V1alpha3DeviceFluent<V1alpha3DeviceBuilder> implements VisitableBuilder<V1alpha3Device,V1alpha3DeviceBuilder>{
  public V1alpha3DeviceBuilder() {
    this(new V1alpha3Device());
  }
  
  public V1alpha3DeviceBuilder(V1alpha3DeviceFluent<?> fluent) {
    this(fluent, new V1alpha3Device());
  }
  
  public V1alpha3DeviceBuilder(V1alpha3DeviceFluent<?> fluent,V1alpha3Device instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceBuilder(V1alpha3Device instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceFluent<?> fluent;
  
  public V1alpha3Device build() {
    V1alpha3Device buildable = new V1alpha3Device();
    buildable.setBasic(fluent.buildBasic());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}