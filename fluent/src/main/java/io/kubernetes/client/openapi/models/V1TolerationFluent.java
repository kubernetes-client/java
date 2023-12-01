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
public class V1TolerationFluent<A extends V1TolerationFluent<A>> extends BaseFluent<A>{
  public V1TolerationFluent() {
  }
  
  public V1TolerationFluent(V1Toleration instance) {
    this.copyInstance(instance);
  }
  private String effect;
  private String key;
  private String operator;
  private Long tolerationSeconds;
  private String value;
  
  protected void copyInstance(V1Toleration instance) {
    instance = (instance != null ? instance : new V1Toleration());
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TolerationFluent that = (V1TolerationFluent) o;
    if (!java.util.Objects.equals(effect, that.effect)) return false;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(operator, that.operator)) return false;
    if (!java.util.Objects.equals(tolerationSeconds, that.tolerationSeconds)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(effect,  key,  operator,  tolerationSeconds,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (effect != null) { sb.append("effect:"); sb.append(effect + ","); }
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (operator != null) { sb.append("operator:"); sb.append(operator + ","); }
    if (tolerationSeconds != null) { sb.append("tolerationSeconds:"); sb.append(tolerationSeconds + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}