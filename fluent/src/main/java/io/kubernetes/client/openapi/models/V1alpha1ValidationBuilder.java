package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidationBuilder extends V1alpha1ValidationFluent<V1alpha1ValidationBuilder> implements VisitableBuilder<V1alpha1Validation,V1alpha1ValidationBuilder>{
  public V1alpha1ValidationBuilder() {
    this(new V1alpha1Validation());
  }
  
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent) {
    this(fluent, new V1alpha1Validation());
  }
  
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent,V1alpha1Validation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidationBuilder(V1alpha1Validation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidationFluent<?> fluent;
  
  public V1alpha1Validation build() {
    V1alpha1Validation buildable = new V1alpha1Validation();
    buildable.setExpression(fluent.getExpression());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}