package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceCapacityBuilder extends V1DeviceCapacityFluent<V1DeviceCapacityBuilder> implements VisitableBuilder<V1DeviceCapacity,V1DeviceCapacityBuilder>{
  public V1DeviceCapacityBuilder() {
    this(new V1DeviceCapacity());
  }
  
  public V1DeviceCapacityBuilder(V1DeviceCapacityFluent<?> fluent) {
    this(fluent, new V1DeviceCapacity());
  }
  
  public V1DeviceCapacityBuilder(V1DeviceCapacityFluent<?> fluent,V1DeviceCapacity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceCapacityBuilder(V1DeviceCapacity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceCapacityFluent<?> fluent;
  
  public V1DeviceCapacity build() {
    V1DeviceCapacity buildable = new V1DeviceCapacity();
    buildable.setRequestPolicy(fluent.buildRequestPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}