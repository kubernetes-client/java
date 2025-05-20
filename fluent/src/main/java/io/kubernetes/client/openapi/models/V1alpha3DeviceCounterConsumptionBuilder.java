package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceCounterConsumptionBuilder extends V1alpha3DeviceCounterConsumptionFluent<V1alpha3DeviceCounterConsumptionBuilder> implements VisitableBuilder<V1alpha3DeviceCounterConsumption,V1alpha3DeviceCounterConsumptionBuilder>{
  public V1alpha3DeviceCounterConsumptionBuilder() {
    this(new V1alpha3DeviceCounterConsumption());
  }
  
  public V1alpha3DeviceCounterConsumptionBuilder(V1alpha3DeviceCounterConsumptionFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceCounterConsumption());
  }
  
  public V1alpha3DeviceCounterConsumptionBuilder(V1alpha3DeviceCounterConsumptionFluent<?> fluent,V1alpha3DeviceCounterConsumption instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceCounterConsumptionBuilder(V1alpha3DeviceCounterConsumption instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceCounterConsumptionFluent<?> fluent;
  
  public V1alpha3DeviceCounterConsumption build() {
    V1alpha3DeviceCounterConsumption buildable = new V1alpha3DeviceCounterConsumption();
    buildable.setCounterSet(fluent.getCounterSet());
    buildable.setCounters(fluent.getCounters());
    return buildable;
  }
  

}