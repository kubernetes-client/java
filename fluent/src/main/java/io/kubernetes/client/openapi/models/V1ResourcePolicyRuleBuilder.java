package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourcePolicyRuleBuilder extends V1ResourcePolicyRuleFluent<V1ResourcePolicyRuleBuilder> implements VisitableBuilder<V1ResourcePolicyRule,V1ResourcePolicyRuleBuilder>{
  public V1ResourcePolicyRuleBuilder() {
    this(new V1ResourcePolicyRule());
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1ResourcePolicyRule());
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRuleFluent<?> fluent,V1ResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourcePolicyRuleBuilder(V1ResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourcePolicyRuleFluent<?> fluent;
  
  public V1ResourcePolicyRule build() {
    V1ResourcePolicyRule buildable = new V1ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}