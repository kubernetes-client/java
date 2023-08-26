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
  public class V1alpha1ValidationFluentImpl<A extends V1alpha1ValidationFluent<A>> extends BaseFluent<A> implements V1alpha1ValidationFluent<A>{
  public V1alpha1ValidationFluentImpl() {
  }
  public V1alpha1ValidationFluentImpl(V1alpha1Validation instance) {
    if (instance != null) {
      this.withExpression(instance.getExpression());
      this.withMessage(instance.getMessage());
      this.withMessageExpression(instance.getMessageExpression());
      this.withReason(instance.getReason());
    }
  }
  private String expression;
  private String message;
  private String messageExpression;
  private String reason;
  public String getExpression() {
    return this.expression;
  }
  public A withExpression(String expression) {
    this.expression=expression; return (A) this;
  }
  public Boolean hasExpression() {
    return this.expression != null;
  }
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
  public String getReason() {
    return this.reason;
  }
  public A withReason(String reason) {
    this.reason=reason; return (A) this;
  }
  public Boolean hasReason() {
    return this.reason != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidationFluentImpl that = (V1alpha1ValidationFluentImpl) o;
    if (!java.util.Objects.equals(expression, that.expression)) return false;

    if (!java.util.Objects.equals(message, that.message)) return false;

    if (!java.util.Objects.equals(messageExpression, that.messageExpression)) return false;

    if (!java.util.Objects.equals(reason, that.reason)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(expression,  message,  messageExpression,  reason,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expression != null) { sb.append("expression:"); sb.append(expression + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (messageExpression != null) { sb.append("messageExpression:"); sb.append(messageExpression + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  
}