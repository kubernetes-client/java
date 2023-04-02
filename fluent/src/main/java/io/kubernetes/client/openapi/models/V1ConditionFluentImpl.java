package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ConditionFluentImpl<A extends V1ConditionFluent<A>> extends BaseFluent<A> implements V1ConditionFluent<A>{
  public V1ConditionFluentImpl() {
  }
  public V1ConditionFluentImpl(V1Condition instance) {
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private OffsetDateTime lastTransitionTime;
  private String message;
  private Long observedGeneration;
  private String reason;
  private String status;
  private String type;
  public OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime=lastTransitionTime; return (A) this;
  }
  public Boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
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
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration=observedGeneration; return (A) this;
  }
  public Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
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
  public String getStatus() {
    return this.status;
  }
  public A withStatus(String status) {
    this.status=status; return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ConditionFluentImpl that = (V1ConditionFluentImpl) o;
    if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  message,  observedGeneration,  reason,  status,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}