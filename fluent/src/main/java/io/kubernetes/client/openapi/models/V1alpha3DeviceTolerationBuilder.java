package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceTolerationBuilder extends V1alpha3DeviceTolerationFluent<V1alpha3DeviceTolerationBuilder> implements VisitableBuilder<V1alpha3DeviceToleration,V1alpha3DeviceTolerationBuilder>{
  public V1alpha3DeviceTolerationBuilder() {
    this(new V1alpha3DeviceToleration());
  }
  
  public V1alpha3DeviceTolerationBuilder(V1alpha3DeviceTolerationFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceToleration());
  }
  
  public V1alpha3DeviceTolerationBuilder(V1alpha3DeviceTolerationFluent<?> fluent,V1alpha3DeviceToleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceTolerationBuilder(V1alpha3DeviceToleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceTolerationFluent<?> fluent;
  
  public V1alpha3DeviceToleration build() {
    V1alpha3DeviceToleration buildable = new V1alpha3DeviceToleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}