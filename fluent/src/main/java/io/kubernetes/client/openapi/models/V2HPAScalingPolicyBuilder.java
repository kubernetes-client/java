package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HPAScalingPolicyBuilder extends V2HPAScalingPolicyFluent<V2HPAScalingPolicyBuilder> implements VisitableBuilder<V2HPAScalingPolicy,V2HPAScalingPolicyBuilder>{
  public V2HPAScalingPolicyBuilder() {
    this(new V2HPAScalingPolicy());
  }
  
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent) {
    this(fluent, new V2HPAScalingPolicy());
  }
  
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicyFluent<?> fluent,V2HPAScalingPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HPAScalingPolicyBuilder(V2HPAScalingPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HPAScalingPolicyFluent<?> fluent;
  
  public V2HPAScalingPolicy build() {
    V2HPAScalingPolicy buildable = new V2HPAScalingPolicy();
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}