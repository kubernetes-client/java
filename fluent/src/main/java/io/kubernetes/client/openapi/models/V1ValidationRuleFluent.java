package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidationRuleFluent<A extends V1ValidationRuleFluent<A>> extends BaseFluent<A>{
  public V1ValidationRuleFluent() {
  }
  
  public V1ValidationRuleFluent(V1ValidationRule instance) {
    this.copyInstance(instance);
  }
  private String fieldPath;
  private String message;
  private String messageExpression;
  private Boolean optionalOldSelf;
  private String reason;
  private String rule;
  
  protected void copyInstance(V1ValidationRule instance) {
    instance = (instance != null ? instance : new V1ValidationRule());
    if (instance != null) {
          this.withFieldPath(instance.getFieldPath());
          this.withMessage(instance.getMessage());
          this.withMessageExpression(instance.getMessageExpression());
          this.withOptionalOldSelf(instance.getOptionalOldSelf());
          this.withReason(instance.getReason());
          this.withRule(instance.getRule());
        }
  }
  
  public String getFieldPath() {
    return this.fieldPath;
  }
  
  public A withFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return (A) this;
  }
  
  public boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getMessageExpression() {
    return this.messageExpression;
  }
  
  public A withMessageExpression(String messageExpression) {
    this.messageExpression = messageExpression;
    return (A) this;
  }
  
  public boolean hasMessageExpression() {
    return this.messageExpression != null;
  }
  
  public Boolean getOptionalOldSelf() {
    return this.optionalOldSelf;
  }
  
  public A withOptionalOldSelf(Boolean optionalOldSelf) {
    this.optionalOldSelf = optionalOldSelf;
    return (A) this;
  }
  
  public boolean hasOptionalOldSelf() {
    return this.optionalOldSelf != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public String getRule() {
    return this.rule;
  }
  
  public A withRule(String rule) {
    this.rule = rule;
    return (A) this;
  }
  
  public boolean hasRule() {
    return this.rule != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidationRuleFluent that = (V1ValidationRuleFluent) o;
    if (!java.util.Objects.equals(fieldPath, that.fieldPath)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(messageExpression, that.messageExpression)) return false;
    if (!java.util.Objects.equals(optionalOldSelf, that.optionalOldSelf)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(rule, that.rule)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fieldPath,  message,  messageExpression,  optionalOldSelf,  reason,  rule,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fieldPath != null) { sb.append("fieldPath:"); sb.append(fieldPath + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (messageExpression != null) { sb.append("messageExpression:"); sb.append(messageExpression + ","); }
    if (optionalOldSelf != null) { sb.append("optionalOldSelf:"); sb.append(optionalOldSelf + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (rule != null) { sb.append("rule:"); sb.append(rule); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptionalOldSelf() {
    return withOptionalOldSelf(true);
  }
  

}