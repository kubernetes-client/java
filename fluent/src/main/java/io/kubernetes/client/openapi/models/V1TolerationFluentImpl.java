package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TolerationFluentImpl<A extends V1TolerationFluent<A>> extends BaseFluent<A> implements V1TolerationFluent<A>{
  public V1TolerationFluentImpl() {
  }
  public V1TolerationFluentImpl(V1Toleration instance) {
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withTolerationSeconds(instance.getTolerationSeconds());

    this.withValue(instance.getValue());

  }
  private String effect;
  private String key;
  private String operator;
  private Long tolerationSeconds;
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
  public String getOperator() {
    return this.operator;
  }
  public A withOperator(String operator) {
    this.operator=operator; return (A) this;
  }
  public Boolean hasOperator() {
    return this.operator != null;
  }
  public Long getTolerationSeconds() {
    return this.tolerationSeconds;
  }
  public A withTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds=tolerationSeconds; return (A) this;
  }
  public Boolean hasTolerationSeconds() {
    return this.tolerationSeconds != null;
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
    V1TolerationFluentImpl that = (V1TolerationFluentImpl) o;
    if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
    if (tolerationSeconds != null ? !tolerationSeconds.equals(that.tolerationSeconds) :that.tolerationSeconds != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
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