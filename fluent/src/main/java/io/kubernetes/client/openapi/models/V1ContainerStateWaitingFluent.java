package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateWaitingFluent<A extends V1ContainerStateWaitingFluent<A>> extends BaseFluent<A>{
  public V1ContainerStateWaitingFluent() {
  }
  
  public V1ContainerStateWaitingFluent(V1ContainerStateWaiting instance) {
    this.copyInstance(instance);
  }
  private String message;
  private String reason;
  
  protected void copyInstance(V1ContainerStateWaiting instance) {
    instance = (instance != null ? instance : new V1ContainerStateWaiting());
    if (instance != null) {
          this.withMessage(instance.getMessage());
          this.withReason(instance.getReason());
        }
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStateWaitingFluent that = (V1ContainerStateWaitingFluent) o;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(message,  reason,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  

}