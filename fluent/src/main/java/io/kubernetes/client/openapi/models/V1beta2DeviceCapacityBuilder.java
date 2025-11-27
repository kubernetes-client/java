package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceCapacityBuilder extends V1beta2DeviceCapacityFluent<V1beta2DeviceCapacityBuilder> implements VisitableBuilder<V1beta2DeviceCapacity,V1beta2DeviceCapacityBuilder>{

  V1beta2DeviceCapacityFluent<?> fluent;

  public V1beta2DeviceCapacityBuilder() {
    this(new V1beta2DeviceCapacity());
  }
  
  public V1beta2DeviceCapacityBuilder(V1beta2DeviceCapacityFluent<?> fluent) {
    this(fluent, new V1beta2DeviceCapacity());
  }
  
  public V1beta2DeviceCapacityBuilder(V1beta2DeviceCapacity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceCapacityBuilder(V1beta2DeviceCapacityFluent<?> fluent,V1beta2DeviceCapacity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceCapacity build() {
    V1beta2DeviceCapacity buildable = new V1beta2DeviceCapacity();
    buildable.setRequestPolicy(fluent.buildRequestPolicy());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}