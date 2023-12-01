package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2NonResourcePolicyRuleBuilder extends V1beta2NonResourcePolicyRuleFluent<V1beta2NonResourcePolicyRuleBuilder> implements VisitableBuilder<V1beta2NonResourcePolicyRule,V1beta2NonResourcePolicyRuleBuilder>{
  public V1beta2NonResourcePolicyRuleBuilder() {
    this(new V1beta2NonResourcePolicyRule());
  }
  
  public V1beta2NonResourcePolicyRuleBuilder(V1beta2NonResourcePolicyRuleFluent<?> fluent) {
    this(fluent, new V1beta2NonResourcePolicyRule());
  }
  
  public V1beta2NonResourcePolicyRuleBuilder(V1beta2NonResourcePolicyRuleFluent<?> fluent,V1beta2NonResourcePolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2NonResourcePolicyRuleBuilder(V1beta2NonResourcePolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2NonResourcePolicyRuleFluent<?> fluent;
  
  public V1beta2NonResourcePolicyRule build() {
    V1beta2NonResourcePolicyRule buildable = new V1beta2NonResourcePolicyRule();
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  

}