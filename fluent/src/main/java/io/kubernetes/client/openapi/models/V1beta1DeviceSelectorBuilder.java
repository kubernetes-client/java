package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceSelectorBuilder extends V1beta1DeviceSelectorFluent<V1beta1DeviceSelectorBuilder> implements VisitableBuilder<V1beta1DeviceSelector,V1beta1DeviceSelectorBuilder>{
  public V1beta1DeviceSelectorBuilder() {
    this(new V1beta1DeviceSelector());
  }
  
  public V1beta1DeviceSelectorBuilder(V1beta1DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta1DeviceSelector());
  }
  
  public V1beta1DeviceSelectorBuilder(V1beta1DeviceSelectorFluent<?> fluent,V1beta1DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceSelectorBuilder(V1beta1DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceSelectorFluent<?> fluent;
  
  public V1beta1DeviceSelector build() {
    V1beta1DeviceSelector buildable = new V1beta1DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  

}