package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ValidationRuleFluentImpl<A extends io.kubernetes.client.openapi.models.V1ValidationRuleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ValidationRuleFluent<A>{
  public V1ValidationRuleFluentImpl() {
  }
  public V1ValidationRuleFluentImpl(io.kubernetes.client.openapi.models.V1ValidationRule instance) {
    this.withMessage(instance.getMessage());

    this.withRule(instance.getRule());

  }
  private java.lang.String message;
  private java.lang.String rule;
  public java.lang.String getMessage() {
    return this.message;
  }
  public A withMessage(java.lang.String message) {
    this.message=message; return (A) this;
  }
  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original) {
    return (A)withMessage(new String(original));
  }
  public java.lang.String getRule() {
    return this.rule;
  }
  public A withRule(java.lang.String rule) {
    this.rule=rule; return (A) this;
  }
  public java.lang.Boolean hasRule() {
    return this.rule != null;
  }
  
  /**
   * Method is deprecated. use withRule instead.
   */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original) {
    return (A)withRule(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ValidationRuleFluentImpl that = (V1ValidationRuleFluentImpl) o;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (rule != null ? !rule.equals(that.rule) :that.rule != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(message,  rule,  super.hashCode());
  }
  
}