package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceSelectorBuilder extends V1alpha3DeviceSelectorFluent<V1alpha3DeviceSelectorBuilder> implements VisitableBuilder<V1alpha3DeviceSelector,V1alpha3DeviceSelectorBuilder>{
  public V1alpha3DeviceSelectorBuilder() {
    this(new V1alpha3DeviceSelector());
  }
  
  public V1alpha3DeviceSelectorBuilder(V1alpha3DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceSelector());
  }
  
  public V1alpha3DeviceSelectorBuilder(V1alpha3DeviceSelectorFluent<?> fluent,V1alpha3DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceSelectorBuilder(V1alpha3DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceSelectorFluent<?> fluent;
  
  public V1alpha3DeviceSelector build() {
    V1alpha3DeviceSelector buildable = new V1alpha3DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  

}