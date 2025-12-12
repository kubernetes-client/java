package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidationFluent<A extends io.kubernetes.client.openapi.models.V1ValidationFluent<A>> extends BaseFluent<A>{

  private String expression;
  private String message;
  private String messageExpression;
  private String reason;

  public V1ValidationFluent() {
  }
  
  public V1ValidationFluent(V1Validation instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1Validation instance) {
    instance = instance != null ? instance : new V1Validation();
    if (instance != null) {
        this.withExpression(instance.getExpression());
        this.withMessage(instance.getMessage());
        this.withMessageExpression(instance.getMessageExpression());
        this.withReason(instance.getReason());
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
    V1ValidationFluent that = (V1ValidationFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(messageExpression, that.messageExpression))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    return true;
  }
  
  public String getExpression() {
    return this.expression;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getMessageExpression() {
    return this.messageExpression;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public boolean hasExpression() {
    return this.expression != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasMessageExpression() {
    return this.messageExpression != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public int hashCode() {
    return Objects.hash(expression, message, messageExpression, reason);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expression == null)) {
        sb.append("expression:");
        sb.append(expression);
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
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpression(String expression) {
    this.expression = expression;
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
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
}