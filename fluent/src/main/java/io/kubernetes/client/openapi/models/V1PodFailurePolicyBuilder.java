package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodFailurePolicyBuilder extends V1PodFailurePolicyFluent<V1PodFailurePolicyBuilder> implements VisitableBuilder<V1PodFailurePolicy,V1PodFailurePolicyBuilder>{
  public V1PodFailurePolicyBuilder() {
    this(new V1PodFailurePolicy());
  }
  
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent) {
    this(fluent, new V1PodFailurePolicy());
  }
  
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent,V1PodFailurePolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodFailurePolicyBuilder(V1PodFailurePolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodFailurePolicyFluent<?> fluent;
  
  public V1PodFailurePolicy build() {
    V1PodFailurePolicy buildable = new V1PodFailurePolicy();
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}