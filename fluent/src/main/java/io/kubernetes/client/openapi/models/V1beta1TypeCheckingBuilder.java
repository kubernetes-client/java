package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1TypeCheckingBuilder extends V1beta1TypeCheckingFluent<V1beta1TypeCheckingBuilder> implements VisitableBuilder<V1beta1TypeChecking,V1beta1TypeCheckingBuilder>{
  public V1beta1TypeCheckingBuilder() {
    this(new V1beta1TypeChecking());
  }
  
  public V1beta1TypeCheckingBuilder(V1beta1TypeCheckingFluent<?> fluent) {
    this(fluent, new V1beta1TypeChecking());
  }
  
  public V1beta1TypeCheckingBuilder(V1beta1TypeCheckingFluent<?> fluent,V1beta1TypeChecking instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1TypeCheckingBuilder(V1beta1TypeChecking instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1TypeCheckingFluent<?> fluent;
  
  public V1beta1TypeChecking build() {
    V1beta1TypeChecking buildable = new V1beta1TypeChecking();
    buildable.setExpressionWarnings(fluent.buildExpressionWarnings());
    return buildable;
  }
  

}