package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceSelectorBuilder extends V1beta2DeviceSelectorFluent<V1beta2DeviceSelectorBuilder> implements VisitableBuilder<V1beta2DeviceSelector,V1beta2DeviceSelectorBuilder>{
  public V1beta2DeviceSelectorBuilder() {
    this(new V1beta2DeviceSelector());
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta2DeviceSelector());
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelectorFluent<?> fluent,V1beta2DeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceSelectorBuilder(V1beta2DeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceSelectorFluent<?> fluent;
  
  public V1beta2DeviceSelector build() {
    V1beta2DeviceSelector buildable = new V1beta2DeviceSelector();
    buildable.setCel(fluent.buildCel());
    return buildable;
  }
  

}