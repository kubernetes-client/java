package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceDefinitionConditionFluent<A extends V1CustomResourceDefinitionConditionFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceDefinitionConditionFluent() {
  }
  
  public V1CustomResourceDefinitionConditionFluent(V1CustomResourceDefinitionCondition instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime lastTransitionTime;
  private String message;
  private String reason;
  private String status;
  private String type;
  
  protected void copyInstance(V1CustomResourceDefinitionCondition instance) {
    instance = (instance != null ? instance : new V1CustomResourceDefinitionCondition());
    if (instance != null) {
          this.withLastTransitionTime(instance.getLastTransitionTime());
          this.withMessage(instance.getMessage());
          this.withReason(instance.getReason());
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
        }
  }
  
  public OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
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
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceDefinitionConditionFluent that = (V1CustomResourceDefinitionConditionFluent) o;
    if (!java.util.Objects.equals(lastTransitionTime, that.lastTransitionTime)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  message,  reason,  status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}