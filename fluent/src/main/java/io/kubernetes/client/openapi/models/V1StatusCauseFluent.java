package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StatusCauseFluent<A extends io.kubernetes.client.openapi.models.V1StatusCauseFluent<A>> extends BaseFluent<A>{
  public V1StatusCauseFluent() {
  }
  
  public V1StatusCauseFluent(V1StatusCause instance) {
    this.copyInstance(instance);
  }
  private String field;
  private String message;
  private String reason;
  
  protected void copyInstance(V1StatusCause instance) {
    instance = instance != null ? instance : new V1StatusCause();
    if (instance != null) {
        this.withField(instance.getField());
        this.withMessage(instance.getMessage());
        this.withReason(instance.getReason());
    }
  }
  
  public String getField() {
    return this.field;
  }
  
  public A withField(String field) {
    this.field = field;
    return (A) this;
  }
  
  public boolean hasField() {
    return this.field != null;
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
    V1StatusCauseFluent that = (V1StatusCauseFluent) o;
    if (!(Objects.equals(field, that.field))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(field, message, reason);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(field == null)) {
        sb.append("field:");
        sb.append(field);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
    }
    sb.append("}");
    return sb.toString();
  }
  

}