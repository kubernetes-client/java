package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VolumeErrorFluent<A extends io.kubernetes.client.openapi.models.V1VolumeErrorFluent<A>> extends BaseFluent<A>{
  public V1VolumeErrorFluent() {
  }
  
  public V1VolumeErrorFluent(V1VolumeError instance) {
    this.copyInstance(instance);
  }
  private Integer errorCode;
  private String message;
  private OffsetDateTime time;
  
  protected void copyInstance(V1VolumeError instance) {
    instance = instance != null ? instance : new V1VolumeError();
    if (instance != null) {
        this.withErrorCode(instance.getErrorCode());
        this.withMessage(instance.getMessage());
        this.withTime(instance.getTime());
    }
  }
  
  public Integer getErrorCode() {
    return this.errorCode;
  }
  
  public A withErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return (A) this;
  }
  
  public boolean hasErrorCode() {
    return this.errorCode != null;
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
  

}