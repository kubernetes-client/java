package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha3DeviceTaintSelectorBuilder extends V1alpha3DeviceTaintSelectorFluent<V1alpha3DeviceTaintSelectorBuilder> implements VisitableBuilder<V1alpha3DeviceTaintSelector,V1alpha3DeviceTaintSelectorBuilder>{

  V1alpha3DeviceTaintSelectorFluent<?> fluent;

  public V1alpha3DeviceTaintSelectorBuilder() {
    this(new V1alpha3DeviceTaintSelector());
  }
  
  public V1alpha3DeviceTaintSelectorBuilder(V1alpha3DeviceTaintSelectorFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaintSelector());
  }
  
  public V1alpha3DeviceTaintSelectorBuilder(V1alpha3DeviceTaintSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintSelectorBuilder(V1alpha3DeviceTaintSelectorFluent<?> fluent,V1alpha3DeviceTaintSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaintSelector build() {
    V1alpha3DeviceTaintSelector buildable = new V1alpha3DeviceTaintSelector();
    buildable.setDevice(fluent.getDevice());
    buildable.setDeviceClassName(fluent.getDeviceClassName());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  
}