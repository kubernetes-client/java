package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1JobConditionFluentImpl<A extends V1JobConditionFluent<A>> extends BaseFluent<A> implements V1JobConditionFluent<A>{
  public V1JobConditionFluentImpl() {
  }
  public V1JobConditionFluentImpl(V1JobCondition instance) {
    this.withLastProbeTime(instance.getLastProbeTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private OffsetDateTime lastProbeTime;
  private OffsetDateTime lastTransitionTime;
  private String message;
  private String reason;
  private String status;
  private String type;
  public OffsetDateTime getLastProbeTime() {
    return this.lastProbeTime;
  }
  public A withLastProbeTime(OffsetDateTime lastProbeTime) {
    this.lastProbeTime=lastProbeTime; return (A) this;
  }
  public Boolean hasLastProbeTime() {
    return this.lastProbeTime != null;
  }
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
    V1JobConditionFluentImpl that = (V1JobConditionFluentImpl) o;
    if (lastProbeTime != null ? !lastProbeTime.equals(that.lastProbeTime) :that.lastProbeTime != null) return false;
    if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(lastProbeTime,  lastTransitionTime,  message,  reason,  status,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastProbeTime != null) { sb.append("lastProbeTime:"); sb.append(lastProbeTime + ","); }
    if (lastTransitionTime != null) { sb.append("lastTransitionTime:"); sb.append(lastTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}