package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1TypeCheckingBuilder extends V1alpha1TypeCheckingFluent<V1alpha1TypeCheckingBuilder> implements VisitableBuilder<V1alpha1TypeChecking,V1alpha1TypeCheckingBuilder>{
  public V1alpha1TypeCheckingBuilder() {
    this(new V1alpha1TypeChecking());
  }
  
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent) {
    this(fluent, new V1alpha1TypeChecking());
  }
  
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeCheckingFluent<?> fluent,V1alpha1TypeChecking instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1TypeCheckingBuilder(V1alpha1TypeChecking instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1TypeCheckingFluent<?> fluent;
  
  public V1alpha1TypeChecking build() {
    V1alpha1TypeChecking buildable = new V1alpha1TypeChecking();
    buildable.setExpressionWarnings(fluent.buildExpressionWarnings());
    return buildable;
  }
  

}