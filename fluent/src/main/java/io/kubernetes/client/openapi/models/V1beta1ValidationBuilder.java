package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidationBuilder extends V1beta1ValidationFluent<V1beta1ValidationBuilder> implements VisitableBuilder<V1beta1Validation,V1beta1ValidationBuilder>{
  public V1beta1ValidationBuilder() {
    this(new V1beta1Validation());
  }
  
  public V1beta1ValidationBuilder(V1beta1ValidationFluent<?> fluent) {
    this(fluent, new V1beta1Validation());
  }
  
  public V1beta1ValidationBuilder(V1beta1ValidationFluent<?> fluent,V1beta1Validation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidationBuilder(V1beta1Validation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidationFluent<?> fluent;
  
  public V1beta1Validation build() {
    V1beta1Validation buildable = new V1beta1Validation();
    buildable.setExpression(fluent.getExpression());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}