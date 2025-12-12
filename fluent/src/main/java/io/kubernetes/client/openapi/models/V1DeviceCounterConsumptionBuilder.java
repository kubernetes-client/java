package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceCounterConsumptionBuilder extends V1DeviceCounterConsumptionFluent<V1DeviceCounterConsumptionBuilder> implements VisitableBuilder<V1DeviceCounterConsumption,V1DeviceCounterConsumptionBuilder>{

  V1DeviceCounterConsumptionFluent<?> fluent;

  public V1DeviceCounterConsumptionBuilder() {
    this(new V1DeviceCounterConsumption());
  }
  
  public V1DeviceCounterConsumptionBuilder(V1DeviceCounterConsumptionFluent<?> fluent) {
    this(fluent, new V1DeviceCounterConsumption());
  }
  
  public V1DeviceCounterConsumptionBuilder(V1DeviceCounterConsumption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceCounterConsumptionBuilder(V1DeviceCounterConsumptionFluent<?> fluent,V1DeviceCounterConsumption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceCounterConsumption build() {
    V1DeviceCounterConsumption buildable = new V1DeviceCounterConsumption();
    buildable.setCounterSet(fluent.getCounterSet());
    buildable.setCounters(fluent.getCounters());
    return buildable;
  }
  
}