package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SleepActionFluent<A extends V1SleepActionFluent<A>> extends BaseFluent<A>{
  public V1SleepActionFluent() {
  }
  
  public V1SleepActionFluent(V1SleepAction instance) {
    this.copyInstance(instance);
  }
  private Long seconds;
  
  protected void copyInstance(V1SleepAction instance) {
    instance = (instance != null ? instance : new V1SleepAction());
    if (instance != null) {
          this.withSeconds(instance.getSeconds());
        }
  }
  
  public Long getSeconds() {
    return this.seconds;
  }
  
  public A withSeconds(Long seconds) {
    this.seconds = seconds;
    return (A) this;
  }
  
  public boolean hasSeconds() {
    return this.seconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SleepActionFluent that = (V1SleepActionFluent) o;
    if (!java.util.Objects.equals(seconds, that.seconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(seconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (seconds != null) { sb.append("seconds:"); sb.append(seconds); }
    sb.append("}");
    return sb.toString();
  }
  

}