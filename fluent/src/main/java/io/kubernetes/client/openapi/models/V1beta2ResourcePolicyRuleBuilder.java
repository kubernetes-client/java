package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourcePolicyRuleBuilder extends V1beta2ResourcePolicyRuleFluent<V1beta2ResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta2ResourcePolicyRule,V1beta2ResourcePolicyRuleBuilder>{
  public V1beta2ResourcePolicyRuleBuilder() {
    this(new V1beta2ResourcePolicyRule());
  }
  
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1beta2ResourcePolicyRule());
  }
  
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRuleFluent<?> fluent,V1beta2ResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourcePolicyRuleBuilder(V1beta2ResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourcePolicyRuleFluent<?> fluent;
  
  public V1beta2ResourcePolicyRule build() {
    V1beta2ResourcePolicyRule buildable = new V1beta2ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}