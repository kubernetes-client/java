package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyEgressRuleBuilder extends V1NetworkPolicyEgressRuleFluent<V1NetworkPolicyEgressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyEgressRule,V1NetworkPolicyEgressRuleBuilder>{
  public V1NetworkPolicyEgressRuleBuilder() {
    this(new V1NetworkPolicyEgressRule());
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyEgressRule());
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRuleFluent<?> fluent,V1NetworkPolicyEgressRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyEgressRuleBuilder(V1NetworkPolicyEgressRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyEgressRuleFluent<?> fluent;
  
  public V1NetworkPolicyEgressRule build() {
    V1NetworkPolicyEgressRule buildable = new V1NetworkPolicyEgressRule();
    buildable.setPorts(fluent.buildPorts());
    buildable.setTo(fluent.buildTo());
    return buildable;
  }
  

}