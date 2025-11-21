package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceDefinitionConditionFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime lastTransitionTime;
  private String message;
  private String reason;
  private String status;
  private String type;

  public V1CustomResourceDefinitionConditionFluent() {
  }
  
  public V1CustomResourceDefinitionConditionFluent(V1CustomResourceDefinitionCondition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1CustomResourceDefinitionCondition instance) {
    instance = instance != null ? instance : new V1CustomResourceDefinitionCondition();
    if (instance != null) {
        this.withLastTransitionTime(instance.getLastTransitionTime());
        this.withMessage(instance.getMessage());
        this.withReason(instance.getReason());
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
    V1CustomResourceDefinitionConditionFluent that = (V1CustomResourceDefinitionConditionFluent) o;
    if (!(Objects.equals(lastTransitionTime, that.lastTransitionTime))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
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
  
  public OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(lastTransitionTime == null)) {
        sb.append("lastTransitionTime:");
        sb.append(lastTransitionTime);
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
  
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
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