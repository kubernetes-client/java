package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HPAScalingRulesBuilder extends V2HPAScalingRulesFluent<V2HPAScalingRulesBuilder> implements VisitableBuilder<V2HPAScalingRules,V2HPAScalingRulesBuilder>{
  public V2HPAScalingRulesBuilder() {
    this(new V2HPAScalingRules());
  }
  
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent) {
    this(fluent, new V2HPAScalingRules());
  }
  
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent,V2HPAScalingRules instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HPAScalingRulesBuilder(V2HPAScalingRules instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HPAScalingRulesFluent<?> fluent;
  
  public V2HPAScalingRules build() {
    V2HPAScalingRules buildable = new V2HPAScalingRules();
    buildable.setPolicies(fluent.buildPolicies());
    buildable.setSelectPolicy(fluent.getSelectPolicy());
    buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
    return buildable;
  }
  

}