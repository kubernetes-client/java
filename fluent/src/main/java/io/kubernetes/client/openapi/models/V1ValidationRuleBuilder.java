package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidationRuleBuilder extends V1ValidationRuleFluent<V1ValidationRuleBuilder> implements VisitableBuilder<V1ValidationRule,V1ValidationRuleBuilder>{
  public V1ValidationRuleBuilder() {
    this(new V1ValidationRule());
  }
  
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent) {
    this(fluent, new V1ValidationRule());
  }
  
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent,V1ValidationRule instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidationRuleBuilder(V1ValidationRule instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidationRuleFluent<?> fluent;
  
  public V1ValidationRule build() {
    V1ValidationRule buildable = new V1ValidationRule();
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setMessage(fluent.getMessage());
    buildable.setMessageExpression(fluent.getMessageExpression());
    buildable.setOptionalOldSelf(fluent.getOptionalOldSelf());
    buildable.setReason(fluent.getReason());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
  

}