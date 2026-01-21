package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
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
public class V1alpha3DeviceTaintFluent<A extends io.kubernetes.client.openapi.models.V1alpha3DeviceTaintFluent<A>> extends BaseFluent<A>{

  private String effect;
  private String key;
  private OffsetDateTime timeAdded;
  private String value;

  public V1alpha3DeviceTaintFluent() {
  }
  
  public V1alpha3DeviceTaintFluent(V1alpha3DeviceTaint instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3DeviceTaint instance) {
    instance = instance != null ? instance : new V1alpha3DeviceTaint();
    if (instance != null) {
        this.withEffect(instance.getEffect());
        this.withKey(instance.getKey());
        this.withTimeAdded(instance.getTimeAdded());
        this.withValue(instance.getValue());
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
    V1alpha3DeviceTaintFluent that = (V1alpha3DeviceTaintFluent) o;
    if (!(Objects.equals(effect, that.effect))) {
      return false;
    }
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(timeAdded, that.timeAdded))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public String getEffect() {
    return this.effect;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public OffsetDateTime getTimeAdded() {
    return this.timeAdded;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public boolean hasEffect() {
    return this.effect != null;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasTimeAdded() {
    return this.timeAdded != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(effect, key, timeAdded, value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(effect == null)) {
        sb.append("effect:");
        sb.append(effect);
        sb.append(",");
    }
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(timeAdded == null)) {
        sb.append("timeAdded:");
        sb.append(timeAdded);
        sb.append(",");
    }
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEffect(String effect) {
    this.effect = effect;
    return (A) this;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withTimeAdded(OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
    return (A) this;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
}