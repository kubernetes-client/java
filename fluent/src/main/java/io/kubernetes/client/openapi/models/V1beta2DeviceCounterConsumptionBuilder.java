package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceCounterConsumptionBuilder extends V1beta2DeviceCounterConsumptionFluent<V1beta2DeviceCounterConsumptionBuilder> implements VisitableBuilder<V1beta2DeviceCounterConsumption,V1beta2DeviceCounterConsumptionBuilder>{
  public V1beta2DeviceCounterConsumptionBuilder() {
    this(new V1beta2DeviceCounterConsumption());
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumptionFluent<?> fluent) {
    this(fluent, new V1beta2DeviceCounterConsumption());
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumptionFluent<?> fluent,V1beta2DeviceCounterConsumption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceCounterConsumptionBuilder(V1beta2DeviceCounterConsumption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceCounterConsumptionFluent<?> fluent;
  
  public V1beta2DeviceCounterConsumption build() {
    V1beta2DeviceCounterConsumption buildable = new V1beta2DeviceCounterConsumption();
    buildable.setCounterSet(fluent.getCounterSet());
    buildable.setCounters(fluent.getCounters());
    return buildable;
  }
  

}