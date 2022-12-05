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
  public class V1VolumeErrorFluentImpl<A extends V1VolumeErrorFluent<A>> extends BaseFluent<A> implements V1VolumeErrorFluent<A>{
  public V1VolumeErrorFluentImpl() {
  }
  public V1VolumeErrorFluentImpl(V1VolumeError instance) {
    this.withMessage(instance.getMessage());

    this.withTime(instance.getTime());

  }
  private String message;
  private OffsetDateTime time;
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
  }
  public OffsetDateTime getTime() {
    return this.time;
  }
  public A withTime(OffsetDateTime time) {
    this.time=time; return (A) this;
  }
  public Boolean hasTime() {
    return this.time != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeErrorFluentImpl that = (V1VolumeErrorFluentImpl) o;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (time != null ? !time.equals(that.time) :that.time != null) return false;
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