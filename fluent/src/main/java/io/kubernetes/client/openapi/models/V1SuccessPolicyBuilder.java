package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SuccessPolicyBuilder extends V1SuccessPolicyFluent<V1SuccessPolicyBuilder> implements VisitableBuilder<V1SuccessPolicy,V1SuccessPolicyBuilder>{
  public V1SuccessPolicyBuilder() {
    this(new V1SuccessPolicy());
  }
  
  public V1SuccessPolicyBuilder(V1SuccessPolicyFluent<?> fluent) {
    this(fluent, new V1SuccessPolicy());
  }
  
  public V1SuccessPolicyBuilder(V1SuccessPolicyFluent<?> fluent,V1SuccessPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SuccessPolicyBuilder(V1SuccessPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SuccessPolicyFluent<?> fluent;
  
  public V1SuccessPolicy build() {
    V1SuccessPolicy buildable = new V1SuccessPolicy();
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}