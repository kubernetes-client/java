package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ClientIPConfigFluent<A extends V1ClientIPConfigFluent<A>> extends BaseFluent<A>{
  public V1ClientIPConfigFluent() {
  }
  
  public V1ClientIPConfigFluent(V1ClientIPConfig instance) {
    this.copyInstance(instance);
  }
  private Integer timeoutSeconds;
  
  protected void copyInstance(V1ClientIPConfig instance) {
    instance = (instance != null ? instance : new V1ClientIPConfig());
    if (instance != null) {
          this.withTimeoutSeconds(instance.getTimeoutSeconds());
        }
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ClientIPConfigFluent that = (V1ClientIPConfigFluent) o;
    if (!java.util.Objects.equals(timeoutSeconds, that.timeoutSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(timeoutSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds); }
    sb.append("}");
    return sb.toString();
  }
  

}