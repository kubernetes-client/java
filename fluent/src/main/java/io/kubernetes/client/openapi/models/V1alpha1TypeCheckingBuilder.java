package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1TypeCheckingBuilder extends V1alpha1TypeCheckingFluentImpl<V1alpha1TypeCheckingBuilder> implements VisitableBuilder<V1alpha1TypeChecking,V1alpha1TypeCheckingBuilder>{
  public V1alpha1TypeCheckingBuilder() {
    this(false);
  }
  public V1alpha1TypeCheckingBuilder(Boolean validationEnabled) {
    this(new V1alpha1TypeChecking(), validationEnabled);
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1TypeChecking(), validationEnabled);
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent,V1alpha1TypeChecking instance) {
    this(fluent, instance, false);
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent,V1alpha1TypeChecking instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withExpressionWarnings(instance.getExpressionWarnings());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeChecking instance) {
    this(instance,false);
  }
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeChecking instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withExpressionWarnings(instance.getExpressionWarnings());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1TypeCheckingFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1TypeChecking build() {
    V1alpha1TypeChecking buildable = new V1alpha1TypeChecking();
    buildable.setExpressionWarnings(fluent.getExpressionWarnings());
    return buildable;
  }
  
}