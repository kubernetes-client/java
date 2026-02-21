package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceTolerationFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceTolerationFluent<A>> extends BaseFluent<A>{

  private String effect;
  private String key;
  private String operator;
  private Long tolerationSeconds;
  private String value;

  public V1beta2DeviceTolerationFluent() {
  }
  
  public V1beta2DeviceTolerationFluent(V1beta2DeviceToleration instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2DeviceToleration instance) {
    instance = instance != null ? instance : new V1beta2DeviceToleration();
    if (instance != null) {
        this.withEffect(instance.getEffect());
        this.withKey(instance.getKey());
        this.withOperator(instance.getOperator());
        this.withTolerationSeconds(instance.getTolerationSeconds());
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
    V1beta2DeviceTolerationFluent that = (V1beta2DeviceTolerationFluent) o;
    if (!(Objects.equals(effect, that.effect))) {
      return false;
    }
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(operator, that.operator))) {
      return false;
    }
    if (!(Objects.equals(tolerationSeconds, that.tolerationSeconds))) {
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
  
  public String getOperator() {
    return this.operator;
  }
  
  public Long getTolerationSeconds() {
    return this.tolerationSeconds;
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
  
  public boolean hasOperator() {
    return this.operator != null;
  }
  
  public boolean hasTolerationSeconds() {
    return this.tolerationSeconds != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(effect, key, operator, tolerationSeconds, value);
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
    if (!(operator == null)) {
        sb.append("operator:");
        sb.append(operator);
        sb.append(",");
    }
    if (!(tolerationSeconds == null)) {
        sb.append("tolerationSeconds:");
        sb.append(tolerationSeconds);
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
  
  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }
  
  public A withTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return (A) this;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
}