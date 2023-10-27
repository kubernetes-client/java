package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodFailurePolicyRuleBuilder extends V1PodFailurePolicyRuleFluent<V1PodFailurePolicyRuleBuilder> implements VisitableBuilder<V1PodFailurePolicyRule,V1PodFailurePolicyRuleBuilder>{
  public V1PodFailurePolicyRuleBuilder() {
    this(new V1PodFailurePolicyRule());
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent) {
    this(fluent, new V1PodFailurePolicyRule());
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRuleFluent<?> fluent,V1PodFailurePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodFailurePolicyRuleBuilder(V1PodFailurePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodFailurePolicyRuleFluent<?> fluent;
  
  public V1PodFailurePolicyRule build() {
    V1PodFailurePolicyRule buildable = new V1PodFailurePolicyRule();
    buildable.setAction(fluent.getAction());
    buildable.setOnExitCodes(fluent.buildOnExitCodes());
    buildable.setOnPodConditions(fluent.buildOnPodConditions());
    return buildable;
  }
  

}