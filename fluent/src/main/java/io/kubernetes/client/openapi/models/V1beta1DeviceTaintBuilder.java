package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1DeviceTaintBuilder extends V1beta1DeviceTaintFluent<V1beta1DeviceTaintBuilder> implements VisitableBuilder<V1beta1DeviceTaint,V1beta1DeviceTaintBuilder>{

  V1beta1DeviceTaintFluent<?> fluent;

  public V1beta1DeviceTaintBuilder() {
    this(new V1beta1DeviceTaint());
  }
  
  public V1beta1DeviceTaintBuilder(V1beta1DeviceTaintFluent<?> fluent) {
    this(fluent, new V1beta1DeviceTaint());
  }
  
  public V1beta1DeviceTaintBuilder(V1beta1DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceTaintBuilder(V1beta1DeviceTaintFluent<?> fluent,V1beta1DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceTaint build() {
    V1beta1DeviceTaint buildable = new V1beta1DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}