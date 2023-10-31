package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TolerationBuilder extends V1TolerationFluent<V1TolerationBuilder> implements VisitableBuilder<V1Toleration,V1TolerationBuilder>{
  public V1TolerationBuilder() {
    this(new V1Toleration());
  }
  
  public V1TolerationBuilder(V1TolerationFluent<?> fluent) {
    this(fluent, new V1Toleration());
  }
  
  public V1TolerationBuilder(V1TolerationFluent<?> fluent,V1Toleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TolerationBuilder(V1Toleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TolerationFluent<?> fluent;
  
  public V1Toleration build() {
    V1Toleration buildable = new V1Toleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}