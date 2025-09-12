package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CELDeviceSelectorBuilder extends V1CELDeviceSelectorFluent<V1CELDeviceSelectorBuilder> implements VisitableBuilder<V1CELDeviceSelector,V1CELDeviceSelectorBuilder>{
  public V1CELDeviceSelectorBuilder() {
    this(new V1CELDeviceSelector());
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1CELDeviceSelector());
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelectorFluent<?> fluent,V1CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CELDeviceSelectorBuilder(V1CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CELDeviceSelectorFluent<?> fluent;
  
  public V1CELDeviceSelector build() {
    V1CELDeviceSelector buildable = new V1CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}