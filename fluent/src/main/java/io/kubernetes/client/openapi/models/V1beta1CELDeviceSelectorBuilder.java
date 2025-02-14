package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1CELDeviceSelectorBuilder extends V1beta1CELDeviceSelectorFluent<V1beta1CELDeviceSelectorBuilder> implements VisitableBuilder<V1beta1CELDeviceSelector,V1beta1CELDeviceSelectorBuilder>{
  public V1beta1CELDeviceSelectorBuilder() {
    this(new V1beta1CELDeviceSelector());
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1beta1CELDeviceSelector());
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelectorFluent<?> fluent,V1beta1CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1CELDeviceSelectorBuilder(V1beta1CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1CELDeviceSelectorFluent<?> fluent;
  
  public V1beta1CELDeviceSelector build() {
    V1beta1CELDeviceSelector buildable = new V1beta1CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}