package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceSelectorBuilder extends V1DeviceSelectorFluent<V1DeviceSelectorBuilder> implements VisitableBuilder<V1DeviceSelector,V1DeviceSelectorBuilder>{
  public V1DeviceSelectorBuilder() {
    this(new V1DeviceSelector());
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1DeviceSelector());
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelectorFluent<?> fluent,V1DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceSelectorBuilder(V1DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceSelectorFluent<?> fluent;
  
  public V1DeviceSelector build() {
    V1DeviceSelector buildable = new V1DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  

}