package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidationRuleFluent<A extends io.kubernetes.client.openapi.models.V1ValidationRuleFluent<A>> extends BaseFluent<A>{

  private String fieldPath;
  private String message;
  private String messageExpression;
  private Boolean optionalOldSelf;
  private String reason;
  private String rule;

  public V1ValidationRuleFluent() {
  }
  
  public V1ValidationRuleFluent(V1ValidationRule instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ValidationRule instance) {
    instance = instance != null ? instance : new V1ValidationRule();
    if (instance != null) {
        this.withFieldPath(instance.getFieldPath());
        this.withMessage(instance.getMessage());
        this.withMessageExpression(instance.getMessageExpression());
        this.withOptionalOldSelf(instance.getOptionalOldSelf());
        this.withReason(instance.getReason());
        this.withRule(instance.getRule());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ValidationRuleFluent that = (V1ValidationRuleFluent) o;
    if (!(Objects.equals(fieldPath, that.fieldPath))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(messageExpression, that.messageExpression))) {
      return false;
    }
    if (!(Objects.equals(optionalOldSelf, that.optionalOldSelf))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    if (!(Objects.equals(rule, that.rule))) {
      return false;
    }
    return true;
  }
  
  public String getFieldPath() {
    return this.fieldPath;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getMessageExpression() {
    return this.messageExpression;
  }
  
  public Boolean getOptionalOldSelf() {
    return this.optionalOldSelf;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public String getRule() {
    return this.rule;
  }
  
  public boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasMessageExpression() {
    return this.messageExpression != null;
  }
  
  public boolean hasOptionalOldSelf() {
    return this.optionalOldSelf != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean hasRule() {
    return this.rule != null;
  }
  
  public int hashCode() {
    return Objects.hash(fieldPath, message, messageExpression, optionalOldSelf, reason, rule);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fieldPath == null)) {
        sb.append("fieldPath:");
        sb.append(fieldPath);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(messageExpression == null)) {
        sb.append("messageExpression:");
        sb.append(messageExpression);
        sb.append(",");
    }
    if (!(optionalOldSelf == null)) {
        sb.append("optionalOldSelf:");
        sb.append(optionalOldSelf);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
        sb.append(",");
    }
    if (!(rule == null)) {
        sb.append("rule:");
        sb.append(rule);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withMessageExpression(String messageExpression) {
    this.messageExpression = messageExpression;
    return (A) this;
  }
  
  public A withOptionalOldSelf() {
    return withOptionalOldSelf(true);
  }
  
  public A withOptionalOldSelf(Boolean optionalOldSelf) {
    this.optionalOldSelf = optionalOldSelf;
    return (A) this;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public A withRule(String rule) {
    this.rule = rule;
    return (A) this;
  }
  
}