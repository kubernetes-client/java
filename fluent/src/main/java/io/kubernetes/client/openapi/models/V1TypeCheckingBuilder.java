package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TypeCheckingBuilder extends V1TypeCheckingFluent<V1TypeCheckingBuilder> implements VisitableBuilder<V1TypeChecking,V1TypeCheckingBuilder>{
  public V1TypeCheckingBuilder() {
    this(new V1TypeChecking());
  }
  
  public V1TypeCheckingBuilder(V1TypeCheckingFluent<?> fluent) {
    this(fluent, new V1TypeChecking());
  }
  
  public V1TypeCheckingBuilder(V1TypeCheckingFluent<?> fluent,V1TypeChecking instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TypeCheckingBuilder(V1TypeChecking instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TypeCheckingFluent<?> fluent;
  
  public V1TypeChecking build() {
    V1TypeChecking buildable = new V1TypeChecking();
    buildable.setExpressionWarnings(fluent.buildExpressionWarnings());
    return buildable;
  }
  

}