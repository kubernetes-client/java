package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceTolerationFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceTolerationFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceTolerationFluent() {
  }
  
  public V1beta1DeviceTolerationFluent(V1beta1DeviceToleration instance) {
    this.copyInstance(instance);
  }
  private String effect;
  private String key;
  private String operator;
  private Long tolerationSeconds;
  private String value;
  
  protected void copyInstance(V1beta1DeviceToleration instance) {
    instance = instance != null ? instance : new V1beta1DeviceToleration();
    if (instance != null) {
        this.withEffect(instance.getEffect());
        this.withKey(instance.getKey());
        this.withOperator(instance.getOperator());
        this.withTolerationSeconds(instance.getTolerationSeconds());
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
  
  public String getOperator() {
    return this.operator;
  }
  
  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }
  
  public boolean hasOperator() {
    return this.operator != null;
  }
  
  public Long getTolerationSeconds() {
    return this.tolerationSeconds;
  }
  
  public A withTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return (A) this;
  }
  
  public boolean hasTolerationSeconds() {
    return this.tolerationSeconds != null;
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1beta1DeviceTolerationFluent that = (V1beta1DeviceTolerationFluent) o;
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
  

}