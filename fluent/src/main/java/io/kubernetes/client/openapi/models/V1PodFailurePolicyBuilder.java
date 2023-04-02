package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodFailurePolicyBuilder extends V1PodFailurePolicyFluentImpl<V1PodFailurePolicyBuilder> implements VisitableBuilder<V1PodFailurePolicy,V1PodFailurePolicyBuilder>{
  public V1PodFailurePolicyBuilder() {
    this(false);
  }
  public V1PodFailurePolicyBuilder(Boolean validationEnabled) {
    this(new V1PodFailurePolicy(), validationEnabled);
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodFailurePolicy(), validationEnabled);
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent,V1PodFailurePolicy instance) {
    this(fluent, instance, false);
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicyFluent<?> fluent,V1PodFailurePolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicy instance) {
    this(instance,false);
  }
  public V1PodFailurePolicyBuilder(V1PodFailurePolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  V1PodFailurePolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodFailurePolicy build() {
    V1PodFailurePolicy buildable = new V1PodFailurePolicy();
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  
}