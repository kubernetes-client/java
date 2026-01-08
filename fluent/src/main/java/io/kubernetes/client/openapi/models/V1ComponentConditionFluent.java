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
public class V1ComponentConditionFluent<A extends io.kubernetes.client.openapi.models.V1ComponentConditionFluent<A>> extends BaseFluent<A>{

  private String error;
  private String message;
  private String status;
  private String type;

  public V1ComponentConditionFluent() {
  }
  
  public V1ComponentConditionFluent(V1ComponentCondition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ComponentCondition instance) {
    instance = instance != null ? instance : new V1ComponentCondition();
    if (instance != null) {
        this.withError(instance.getError());
        this.withMessage(instance.getMessage());
        this.withStatus(instance.getStatus());
        this.withType(instance.getType());
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
    V1ComponentConditionFluent that = (V1ComponentConditionFluent) o;
    if (!(Objects.equals(error, that.error))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getError() {
    return this.error;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(error, message, status, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(error == null)) {
        sb.append("error:");
        sb.append(error);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}