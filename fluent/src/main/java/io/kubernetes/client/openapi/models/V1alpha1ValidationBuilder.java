package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidationBuilder extends V1alpha1ValidationFluentImpl<V1alpha1ValidationBuilder> implements VisitableBuilder<V1alpha1Validation,V1alpha1ValidationBuilder>{
  public V1alpha1ValidationBuilder() {
    this(false);
  }
  public V1alpha1ValidationBuilder(Boolean validationEnabled) {
    this(new V1alpha1Validation(), validationEnabled);
  }
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1Validation(), validationEnabled);
  }
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent,V1alpha1Validation instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidationBuilder(V1alpha1ValidationFluent<?> fluent,V1alpha1Validation instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withExpression(instance.getExpression());
      fluent.withMessage(instance.getMessage());
      fluent.withMessageExpression(instance.getMessageExpression());
      fluent.withReason(instance.getReason());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidationBuilder(V1alpha1Validation instance) {
    this(instance,false);
  }
  public V1alpha1ValidationBuilder(V1alpha1Validation instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withExpression(instance.getExpression());
      this.withMessage(instance.getMessage());
      this.withMessageExpression(instance.getMessageExpression());
      this.withReason(instance.getReason());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidationFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1Validation build() {
    V1alpha1Validation buildable = new V1alpha1Validation();
    buildable.setExpression(fluent.getExpression());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}