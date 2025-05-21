package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceTaintBuilder extends V1alpha3DeviceTaintFluent<V1alpha3DeviceTaintBuilder> implements VisitableBuilder<V1alpha3DeviceTaint,V1alpha3DeviceTaintBuilder>{
  public V1alpha3DeviceTaintBuilder() {
    this(new V1alpha3DeviceTaint());
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaintFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaint());
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaintFluent<?> fluent,V1alpha3DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceTaintFluent<?> fluent;
  
  public V1alpha3DeviceTaint build() {
    V1alpha3DeviceTaint buildable = new V1alpha3DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}