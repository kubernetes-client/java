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
  public class V1TaintFluentImpl<A extends V1TaintFluent<A>> extends BaseFluent<A> implements V1TaintFluent<A>{
  public V1TaintFluentImpl() {
  }
  public V1TaintFluentImpl(V1Taint instance) {
    if (instance != null) {
      this.withEffect(instance.getEffect());
      this.withKey(instance.getKey());
      this.withTimeAdded(instance.getTimeAdded());
      this.withValue(instance.getValue());
    }
  }
  private String effect;
  private String key;
  private OffsetDateTime timeAdded;
  private String value;
  public String getEffect() {
    return this.effect;
  }
  public A withEffect(String effect) {
    this.effect=effect; return (A) this;
  }
  public Boolean hasEffect() {
    return this.effect != null;
  }
  public String getKey() {
    return this.key;
  }
  public A withKey(String key) {
    this.key=key; return (A) this;
  }
  public Boolean hasKey() {
    return this.key != null;
  }
  public OffsetDateTime getTimeAdded() {
    return this.timeAdded;
  }
  public A withTimeAdded(OffsetDateTime timeAdded) {
    this.timeAdded=timeAdded; return (A) this;
  }
  public Boolean hasTimeAdded() {
    return this.timeAdded != null;
  }
  public String getValue() {
    return this.value;
  }
  public A withValue(String value) {
    this.value=value; return (A) this;
  }
  public Boolean hasValue() {
    return this.value != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TaintFluentImpl that = (V1TaintFluentImpl) o;
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