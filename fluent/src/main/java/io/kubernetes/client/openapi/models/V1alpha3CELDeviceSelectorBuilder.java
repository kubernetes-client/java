package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3CELDeviceSelectorBuilder extends V1alpha3CELDeviceSelectorFluent<V1alpha3CELDeviceSelectorBuilder> implements VisitableBuilder<V1alpha3CELDeviceSelector,V1alpha3CELDeviceSelectorBuilder>{
  public V1alpha3CELDeviceSelectorBuilder() {
    this(new V1alpha3CELDeviceSelector());
  }
  
  public V1alpha3CELDeviceSelectorBuilder(V1alpha3CELDeviceSelectorFluent<?> fluent) {
    this(fluent, new V1alpha3CELDeviceSelector());
  }
  
  public V1alpha3CELDeviceSelectorBuilder(V1alpha3CELDeviceSelectorFluent<?> fluent,V1alpha3CELDeviceSelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3CELDeviceSelectorBuilder(V1alpha3CELDeviceSelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3CELDeviceSelectorFluent<?> fluent;
  
  public V1alpha3CELDeviceSelector build() {
    V1alpha3CELDeviceSelector buildable = new V1alpha3CELDeviceSelector();
    buildable.setExpression(fluent.getExpression());
    return buildable;
  }
  

}