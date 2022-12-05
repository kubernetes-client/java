package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ValidationRuleBuilder extends V1ValidationRuleFluentImpl<V1ValidationRuleBuilder> implements VisitableBuilder<V1ValidationRule,V1ValidationRuleBuilder>{
  public V1ValidationRuleBuilder() {
    this(false);
  }
  public V1ValidationRuleBuilder(Boolean validationEnabled) {
    this(new V1ValidationRule(), validationEnabled);
  }
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ValidationRule(), validationEnabled);
  }
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent,V1ValidationRule instance) {
    this(fluent, instance, false);
  }
  public V1ValidationRuleBuilder(V1ValidationRuleFluent<?> fluent,V1ValidationRule instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  public V1ValidationRuleBuilder(V1ValidationRule instance) {
    this(instance,false);
  }
  public V1ValidationRuleBuilder(V1ValidationRule instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  V1ValidationRuleFluent<?> fluent;
  Boolean validationEnabled;
  public V1ValidationRule build() {
    V1ValidationRule buildable = new V1ValidationRule();
    buildable.setMessage(fluent.getMessage());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
  
}