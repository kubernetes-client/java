package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ClientIPConfigFluentImpl<A extends V1ClientIPConfigFluent<A>> extends BaseFluent<A> implements V1ClientIPConfigFluent<A>{
  public V1ClientIPConfigFluentImpl() {
  }
  public V1ClientIPConfigFluentImpl(V1ClientIPConfig instance) {
    this.withTimeoutSeconds(instance.getTimeoutSeconds());

  }
  private Integer timeoutSeconds;
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds=timeoutSeconds; return (A) this;
  }
  public Boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ClientIPConfigFluentImpl that = (V1ClientIPConfigFluentImpl) o;
    if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
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