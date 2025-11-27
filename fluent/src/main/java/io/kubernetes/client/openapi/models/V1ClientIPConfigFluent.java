package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ClientIPConfigFluent<A extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A>> extends BaseFluent<A>{

  private Integer timeoutSeconds;

  public V1ClientIPConfigFluent() {
  }
  
  public V1ClientIPConfigFluent(V1ClientIPConfig instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ClientIPConfig instance) {
    instance = instance != null ? instance : new V1ClientIPConfig();
    if (instance != null) {
      this.withTimeoutSeconds(instance.getTimeoutSeconds());
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
    V1ClientIPConfigFluent that = (V1ClientIPConfigFluent) o;
    if (!(Objects.equals(timeoutSeconds, that.timeoutSeconds))) {
      return false;
    }
    return true;
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public int hashCode() {
    return Objects.hash(timeoutSeconds);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(timeoutSeconds == null)) {
        sb.append("timeoutSeconds:");
        sb.append(timeoutSeconds);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  
}