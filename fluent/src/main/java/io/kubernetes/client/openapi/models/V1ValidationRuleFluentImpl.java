package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ValidationRuleFluentImpl<A extends V1ValidationRuleFluent<A>> extends BaseFluent<A> implements V1ValidationRuleFluent<A>{
  public V1ValidationRuleFluentImpl() {
  }
  public V1ValidationRuleFluentImpl(V1ValidationRule instance) {
    if (instance != null) {
      this.withMessage(instance.getMessage());
      this.withMessageExpression(instance.getMessageExpression());
      this.withRule(instance.getRule());
    }
  }
  private String message;
  private String messageExpression;
  private String rule;
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
  }
  public String getMessageExpression() {
    return this.messageExpression;
  }
  public A withMessageExpression(String messageExpression) {
    this.messageExpression=messageExpression; return (A) this;
  }
  public Boolean hasMessageExpression() {
    return this.messageExpression != null;
  }
  public String getRule() {
    return this.rule;
  }
  public A withRule(String rule) {
    this.rule=rule; return (A) this;
  }
  public Boolean hasRule() {
    return this.rule != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidationRuleFluentImpl that = (V1ValidationRuleFluentImpl) o;
    if (!java.util.Objects.equals(message, that.message)) return false;

    if (!java.util.Objects.equals(messageExpression, that.messageExpression)) return false;

    if (!java.util.Objects.equals(rule, that.rule)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(message,  messageExpression,  rule,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (messageExpression != null) { sb.append("messageExpression:"); sb.append(messageExpression + ","); }
    if (rule != null) { sb.append("rule:"); sb.append(rule); }
    sb.append("}");
    return sb.toString();
  }
  
}