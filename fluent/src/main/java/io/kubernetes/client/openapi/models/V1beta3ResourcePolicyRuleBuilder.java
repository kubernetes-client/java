package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3ResourcePolicyRuleBuilder extends V1beta3ResourcePolicyRuleFluent<V1beta3ResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta3ResourcePolicyRule,V1beta3ResourcePolicyRuleBuilder>{
  public V1beta3ResourcePolicyRuleBuilder() {
    this(new V1beta3ResourcePolicyRule());
  }
  
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1beta3ResourcePolicyRule());
  }
  
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRuleFluent<?> fluent,V1beta3ResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3ResourcePolicyRuleBuilder(V1beta3ResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3ResourcePolicyRuleFluent<?> fluent;
  
  public V1beta3ResourcePolicyRule build() {
    V1beta3ResourcePolicyRule buildable = new V1beta3ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}