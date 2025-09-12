package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CELDeviceSelectorBuilder extends V1beta2CELDeviceSelectorFluent<V1beta2CELDeviceSelectorBuilder> implements VisitableBuilder<V1beta2CELDeviceSelector,V1beta2CELDeviceSelectorBuilder>{
  public V1beta2CELDeviceSelectorBuilder() {
    this(new V1beta2CELDeviceSelector());
  }
  
  public V1beta2CELDeviceSelectorBuilder(V1beta2CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta2CELDeviceSelector());
  }
  
  public V1beta2CELDeviceSelectorBuilder(V1beta2CELDeviceSelectorFluent<?> fluent,V1beta2CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2CELDeviceSelectorBuilder(V1beta2CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2CELDeviceSelectorFluent<?> fluent;
  
  public V1beta2CELDeviceSelector build() {
    V1beta2CELDeviceSelector buildable = new V1beta2CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}