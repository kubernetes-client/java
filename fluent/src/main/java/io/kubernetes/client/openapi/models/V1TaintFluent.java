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
public class V1TaintFluent<A extends V1TaintFluent<A>> extends BaseFluent<A>{
  public V1TaintFluent() {
  }
  
  public V1TaintFluent(V1Taint instance) {
    this.copyInstance(instance);
  }
  private String effect;
  private String key;
  private OffsetDateTime timeAdded;
  private String value;
  
  protected void copyInstance(V1Taint instance) {
    instance = (instance != null ? instance : new V1Taint());
    if (instance != null) {
          this.withEffect(instance.getEffect());
          this.withKey(instance.getKey());
          this.withTimeAdded(instance.getTimeAdded());
          this.withValue(instance.getValue());
        }
  }
  
  public String getEffect() {
    return this.effect;
  }
  
  public A withEffect(String effect) {
    this.effect = effect;
    return (A) this;
  }
  
  public boolean hasEffect() {
    return this.effect != null;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public OffsetDateTime getTimeAdded() {
    return this.timeAdded;
  }
  
  public A withTimeAdded(OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
    return (A) this;
  }
  
  public boolean hasTimeAdded() {
    return this.timeAdded != null;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TaintFluent that = (V1TaintFluent) o;
    if (!java.util.Objects.equals(effect, that.effect)) return false;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(timeAdded, that.timeAdded)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(effect,  key,  timeAdded,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (effect != null) { sb.append("effect:"); sb.append(effect + ","); }
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (timeAdded != null) { sb.append("timeAdded:"); sb.append(timeAdded + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}