package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TaintBuilder extends V1TaintFluent<V1TaintBuilder> implements VisitableBuilder<V1Taint,V1TaintBuilder>{
  public V1TaintBuilder() {
    this(new V1Taint());
  }
  
  public V1TaintBuilder(V1TaintFluent<?> fluent) {
    this(fluent, new V1Taint());
  }
  
  public V1TaintBuilder(V1TaintFluent<?> fluent,V1Taint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TaintBuilder(V1Taint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TaintFluent<?> fluent;
  
  public V1Taint build() {
    V1Taint buildable = new V1Taint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}