package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1DeviceCounterConsumptionBuilder extends V1beta1DeviceCounterConsumptionFluent<V1beta1DeviceCounterConsumptionBuilder> implements VisitableBuilder<V1beta1DeviceCounterConsumption,V1beta1DeviceCounterConsumptionBuilder>{

  V1beta1DeviceCounterConsumptionFluent<?> fluent;

  public V1beta1DeviceCounterConsumptionBuilder() {
    this(new V1beta1DeviceCounterConsumption());
  }
  
  public V1beta1DeviceCounterConsumptionBuilder(V1beta1DeviceCounterConsumptionFluent<?> fluent) {
    this(fluent, new V1beta1DeviceCounterConsumption());
  }
  
  public V1beta1DeviceCounterConsumptionBuilder(V1beta1DeviceCounterConsumption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceCounterConsumptionBuilder(V1beta1DeviceCounterConsumptionFluent<?> fluent,V1beta1DeviceCounterConsumption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceCounterConsumption build() {
    V1beta1DeviceCounterConsumption buildable = new V1beta1DeviceCounterConsumption();
    buildable.setCounterSet(fluent.getCounterSet());
    buildable.setCounters(fluent.getCounters());
    return buildable;
  }
  
}