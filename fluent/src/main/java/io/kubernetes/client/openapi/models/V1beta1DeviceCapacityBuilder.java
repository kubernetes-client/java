package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceCapacityBuilder extends V1beta1DeviceCapacityFluent<V1beta1DeviceCapacityBuilder> implements VisitableBuilder<V1beta1DeviceCapacity,V1beta1DeviceCapacityBuilder>{
  public V1beta1DeviceCapacityBuilder() {
    this(new V1beta1DeviceCapacity());
  }
  
  public V1beta1DeviceCapacityBuilder(V1beta1DeviceCapacityFluent<?> fluent) {
    this(fluent, new V1beta1DeviceCapacity());
  }
  
  public V1beta1DeviceCapacityBuilder(V1beta1DeviceCapacityFluent<?> fluent,V1beta1DeviceCapacity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceCapacityBuilder(V1beta1DeviceCapacity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceCapacityFluent<?> fluent;
  
  public V1beta1DeviceCapacity build() {
    V1beta1DeviceCapacity buildable = new V1beta1DeviceCapacity();
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}