package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SuccessPolicyRuleBuilder extends V1SuccessPolicyRuleFluent<V1SuccessPolicyRuleBuilder> implements VisitableBuilder<V1SuccessPolicyRule,V1SuccessPolicyRuleBuilder>{
  public V1SuccessPolicyRuleBuilder() {
    this(new V1SuccessPolicyRule());
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRuleFluent<?> fluent) {
    this(fluent, new V1SuccessPolicyRule());
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRuleFluent<?> fluent,V1SuccessPolicyRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SuccessPolicyRuleBuilder(V1SuccessPolicyRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SuccessPolicyRuleFluent<?> fluent;
  
  public V1SuccessPolicyRule build() {
    V1SuccessPolicyRule buildable = new V1SuccessPolicyRule();
    buildable.setSucceededCount(fluent.getSucceededCount());
    buildable.setSucceededIndexes(fluent.getSucceededIndexes());
    return buildable;
  }
  

}