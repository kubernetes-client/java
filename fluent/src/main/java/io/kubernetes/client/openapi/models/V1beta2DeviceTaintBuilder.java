package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceTaintBuilder extends V1beta2DeviceTaintFluent<V1beta2DeviceTaintBuilder> implements VisitableBuilder<V1beta2DeviceTaint,V1beta2DeviceTaintBuilder>{
  public V1beta2DeviceTaintBuilder() {
    this(new V1beta2DeviceTaint());
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaintFluent<?> fluent) {
    this(fluent, new V1beta2DeviceTaint());
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaintFluent<?> fluent,V1beta2DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceTaintBuilder(V1beta2DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceTaintFluent<?> fluent;
  
  public V1beta2DeviceTaint build() {
    V1beta2DeviceTaint buildable = new V1beta2DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}