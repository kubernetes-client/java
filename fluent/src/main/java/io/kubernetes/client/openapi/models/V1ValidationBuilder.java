package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidationBuilder extends V1ValidationFluent<V1ValidationBuilder> implements VisitableBuilder<V1Validation,V1ValidationBuilder>{
  public V1ValidationBuilder() {
    this(new V1Validation());
  }
  
  public V1ValidationBuilder(V1ValidationFluent<?> fluent) {
    this(fluent, new V1Validation());
  }
  
  public V1ValidationBuilder(V1ValidationFluent<?> fluent,V1Validation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidationBuilder(V1Validation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidationFluent<?> fluent;
  
  public V1Validation build() {
    V1Validation buildable = new V1Validation();
    buildable.setExpression(fluent.getExpression());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}