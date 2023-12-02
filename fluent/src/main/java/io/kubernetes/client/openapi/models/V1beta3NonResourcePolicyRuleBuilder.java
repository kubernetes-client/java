package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3NonResourcePolicyRuleBuilder extends V1beta3NonResourcePolicyRuleFluent<V1beta3NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta3NonResourcePolicyRule,V1beta3NonResourcePolicyRuleBuilder>{
  public V1beta3NonResourcePolicyRuleBuilder() {
    this(new V1beta3NonResourcePolicyRule());
  }
  
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1beta3NonResourcePolicyRule());
  }
  
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRuleFluent<?> fluent,V1beta3NonResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3NonResourcePolicyRuleBuilder(V1beta3NonResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3NonResourcePolicyRuleFluent<?> fluent;
  
  public V1beta3NonResourcePolicyRule build() {
    V1beta3NonResourcePolicyRule buildable = new V1beta3NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}