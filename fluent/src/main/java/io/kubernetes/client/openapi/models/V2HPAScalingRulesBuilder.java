package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HPAScalingRulesBuilder extends V2HPAScalingRulesFluentImpl<V2HPAScalingRulesBuilder> implements VisitableBuilder<V2HPAScalingRules,V2HPAScalingRulesBuilder>{
  public V2HPAScalingRulesBuilder() {
    this(false);
  }
  public V2HPAScalingRulesBuilder(Boolean validationEnabled) {
    this(new V2HPAScalingRules(), validationEnabled);
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HPAScalingRules(), validationEnabled);
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent,V2HPAScalingRules instance) {
    this(fluent, instance, false);
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent,V2HPAScalingRules instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPolicies(instance.getPolicies());

    fluent.withSelectPolicy(instance.getSelectPolicy());

    fluent.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled; 
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRules instance) {
    this(instance,false);
  }
  public V2HPAScalingRulesBuilder(V2HPAScalingRules instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled; 
  }
  V2HPAScalingRulesFluent<?> fluent;
  Boolean validationEnabled;
  public V2HPAScalingRules build() {
    V2HPAScalingRules buildable = new V2HPAScalingRules();
    buildable.setPolicies(fluent.getPolicies());
    buildable.setSelectPolicy(fluent.getSelectPolicy());
    buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
    return buildable;
  }
  
}