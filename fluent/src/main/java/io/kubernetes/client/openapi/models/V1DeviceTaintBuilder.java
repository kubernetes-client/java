package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceTaintBuilder extends V1DeviceTaintFluent<V1DeviceTaintBuilder> implements VisitableBuilder<V1DeviceTaint,V1DeviceTaintBuilder>{
  public V1DeviceTaintBuilder() {
    this(new V1DeviceTaint());
  }
  
  public V1DeviceTaintBuilder(V1DeviceTaintFluent<?> fluent) {
    this(fluent, new V1DeviceTaint());
  }
  
  public V1DeviceTaintBuilder(V1DeviceTaintFluent<?> fluent,V1DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceTaintBuilder(V1DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceTaintFluent<?> fluent;
  
  public V1DeviceTaint build() {
    V1DeviceTaint buildable = new V1DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}