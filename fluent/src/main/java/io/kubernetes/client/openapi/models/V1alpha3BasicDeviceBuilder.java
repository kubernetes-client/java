package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3BasicDeviceBuilder extends V1alpha3BasicDeviceFluent<V1alpha3BasicDeviceBuilder> implements VisitableBuilder<V1alpha3BasicDevice,V1alpha3BasicDeviceBuilder>{
  public V1alpha3BasicDeviceBuilder() {
    this(new V1alpha3BasicDevice());
  }
  
  public V1alpha3BasicDeviceBuilder(V1alpha3BasicDeviceFluent<?> fluent) {
    this(fluent, new V1alpha3BasicDevice());
  }
  
  public V1alpha3BasicDeviceBuilder(V1alpha3BasicDeviceFluent<?> fluent,V1alpha3BasicDevice instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3BasicDeviceBuilder(V1alpha3BasicDevice instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3BasicDeviceFluent<?> fluent;
  
  public V1alpha3BasicDevice build() {
    V1alpha3BasicDevice buildable = new V1alpha3BasicDevice();
    buildable.setAttributes(fluent.getAttributes());
    buildable.setCapacity(fluent.getCapacity());
    return buildable;
  }
  

}