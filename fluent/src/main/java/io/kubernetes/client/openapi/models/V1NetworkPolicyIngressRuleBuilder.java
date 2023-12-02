package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyIngressRuleBuilder extends V1NetworkPolicyIngressRuleFluent<V1NetworkPolicyIngressRuleBuilder> implements VisitableBuilder<V1NetworkPolicyIngressRule,V1NetworkPolicyIngressRuleBuilder>{
  public V1NetworkPolicyIngressRuleBuilder() {
    this(new V1NetworkPolicyIngressRule());
  }
  
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyIngressRule());
  }
  
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRuleFluent<?> fluent,V1NetworkPolicyIngressRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyIngressRuleBuilder(V1NetworkPolicyIngressRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyIngressRuleFluent<?> fluent;
  
  public V1NetworkPolicyIngressRule build() {
    V1NetworkPolicyIngressRule buildable = new V1NetworkPolicyIngressRule();
    buildable.setFrom(fluent.buildFrom());
    buildable.setPorts(fluent.buildPorts());
    return buildable;
  }
  

}