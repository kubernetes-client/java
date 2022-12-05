package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HPAScalingPolicyBuilder extends V2HPAScalingPolicyFluentImpl<V2HPAScalingPolicyBuilder> implements VisitableBuilder<V2HPAScalingPolicy,V2HPAScalingPolicyBuilder>{
  public V2HPAScalingPolicyBuilder() {
    this(false);
  }
  public V2HPAScalingPolicyBuilder(Boolean validationEnabled) {
    this(new V2HPAScalingPolicy(), validationEnabled);
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HPAScalingPolicy(), validationEnabled);
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent,V2HPAScalingPolicy instance) {
    this(fluent, instance, false);
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent,V2HPAScalingPolicy instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPeriodSeconds(instance.getPeriodSeconds());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicy instance) {
    this(instance,false);
  }
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicy instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V2HPAScalingPolicyFluent<?> fluent;
  Boolean validationEnabled;
  public V2HPAScalingPolicy build() {
    V2HPAScalingPolicy buildable = new V2HPAScalingPolicy();
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}