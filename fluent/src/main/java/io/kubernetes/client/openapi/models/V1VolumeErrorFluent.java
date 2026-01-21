package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
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
public class V1VolumeErrorFluent<A extends io.kubernetes.client.openapi.models.V1VolumeErrorFluent<A>> extends BaseFluent<A>{

  private Integer errorCode;
  private String message;
  private OffsetDateTime time;

  public V1VolumeErrorFluent() {
  }
  
  public V1VolumeErrorFluent(V1VolumeError instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1VolumeError instance) {
    instance = instance != null ? instance : new V1VolumeError();
    if (instance != null) {
        this.withErrorCode(instance.getErrorCode());
        this.withMessage(instance.getMessage());
        this.withTime(instance.getTime());
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
    V1VolumeErrorFluent that = (V1VolumeErrorFluent) o;
    if (!(Objects.equals(errorCode, that.errorCode))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(time, that.time))) {
      return false;
    }
    return true;
  }
  
  public Integer getErrorCode() {
    return this.errorCode;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public OffsetDateTime getTime() {
    return this.time;
  }
  
  public boolean hasErrorCode() {
    return this.errorCode != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasTime() {
    return this.time != null;
  }
  
  public int hashCode() {
    return Objects.hash(errorCode, message, time);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(errorCode == null)) {
        sb.append("errorCode:");
        sb.append(errorCode);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(time == null)) {
        sb.append("time:");
        sb.append(time);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withTime(OffsetDateTime time) {
    this.time = time;
    return (A) this;
  }
  
}