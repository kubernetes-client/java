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
public class V1VolumeErrorFluent<A extends V1VolumeErrorFluent<A>> extends BaseFluent<A>{
  public V1VolumeErrorFluent() {
  }
  
  public V1VolumeErrorFluent(V1VolumeError instance) {
    this.copyInstance(instance);
  }
  private String message;
  private OffsetDateTime time;
  
  protected void copyInstance(V1VolumeError instance) {
    instance = (instance != null ? instance : new V1VolumeError());
    if (instance != null) {
          this.withMessage(instance.getMessage());
          this.withTime(instance.getTime());
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
  
  public OffsetDateTime getTime() {
    return this.time;
  }
  
  public A withTime(OffsetDateTime time) {
    this.time = time;
    return (A) this;
  }
  
  public boolean hasTime() {
    return this.time != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeErrorFluent that = (V1VolumeErrorFluent) o;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(time, that.time)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(message,  time,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (time != null) { sb.append("time:"); sb.append(time); }
    sb.append("}");
    return sb.toString();
  }
  

}