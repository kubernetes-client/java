package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ValidationRuleBuilder extends io.kubernetes.client.openapi.models.V1ValidationRuleFluentImpl<io.kubernetes.client.openapi.models.V1ValidationRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ValidationRule,io.kubernetes.client.openapi.models.V1ValidationRuleBuilder>{
  public V1ValidationRuleBuilder() {
    this(false);
  }
  public V1ValidationRuleBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ValidationRule(), validationEnabled);
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ValidationRule(), validationEnabled);
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1ValidationRule instance) {
    this(fluent, instance, false);
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1ValidationRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRule instance) {
    this(instance,false);
  }
  public V1ValidationRuleBuilder(io.kubernetes.client.openapi.models.V1ValidationRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withRule(instance.getRule());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ValidationRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ValidationRule build() {
    V1ValidationRule buildable = new V1ValidationRule();
    buildable.setMessage(fluent.getMessage());
    buildable.setRule(fluent.getRule());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidationRuleBuilder that = (V1ValidationRuleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}