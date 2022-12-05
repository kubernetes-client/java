package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EnvVarFluentImpl<A extends V1EnvVarFluent<A>> extends BaseFluent<A> implements V1EnvVarFluent<A>{
  public V1EnvVarFluentImpl() {
  }
  public V1EnvVarFluentImpl(V1EnvVar instance) {
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.withValueFrom(instance.getValueFrom());

  }
  private String name;
  private String value;
  private V1EnvVarSourceBuilder valueFrom;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
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
  
  /**
   * This method has been deprecated, please use method buildValueFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EnvVarSource getValueFrom() {
    return this.valueFrom!=null ?this.valueFrom.build():null;
  }
  public V1EnvVarSource buildValueFrom() {
    return this.valueFrom!=null ?this.valueFrom.build():null;
  }
  public A withValueFrom(V1EnvVarSource valueFrom) {
    _visitables.get("valueFrom").remove(this.valueFrom);
    if (valueFrom!=null){ this.valueFrom= new V1EnvVarSourceBuilder(valueFrom); _visitables.get("valueFrom").add(this.valueFrom);} else { this.valueFrom = null; _visitables.get("valueFrom").remove(this.valueFrom); } return (A) this;
  }
  public Boolean hasValueFrom() {
    return this.valueFrom != null;
  }
  public V1EnvVarFluent.ValueFromNested<A> withNewValueFrom() {
    return new V1EnvVarFluentImpl.ValueFromNestedImpl();
  }
  public V1EnvVarFluent.ValueFromNested<A> withNewValueFromLike(V1EnvVarSource item) {
    return new V1EnvVarFluentImpl.ValueFromNestedImpl(item);
  }
  public V1EnvVarFluent.ValueFromNested<A> editValueFrom() {
    return withNewValueFromLike(getValueFrom());
  }
  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFrom() {
    return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): new V1EnvVarSourceBuilder().build());
  }
  public V1EnvVarFluent.ValueFromNested<A> editOrNewValueFromLike(V1EnvVarSource item) {
    return withNewValueFromLike(getValueFrom() != null ? getValueFrom(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EnvVarFluentImpl that = (V1EnvVarFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    if (valueFrom != null ? !valueFrom.equals(that.valueFrom) :that.valueFrom != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  valueFrom,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (value != null) { sb.append("value:"); sb.append(value + ","); }
    if (valueFrom != null) { sb.append("valueFrom:"); sb.append(valueFrom); }
    sb.append("}");
    return sb.toString();
  }
  class ValueFromNestedImpl<N> extends V1EnvVarSourceFluentImpl<V1EnvVarFluent.ValueFromNested<N>> implements V1EnvVarFluent.ValueFromNested<N>,Nested<N>{
    ValueFromNestedImpl(V1EnvVarSource item) {
      this.builder = new V1EnvVarSourceBuilder(this, item);
    }
    ValueFromNestedImpl() {
      this.builder = new V1EnvVarSourceBuilder(this);
    }
    V1EnvVarSourceBuilder builder;
    public N and() {
      return (N) V1EnvVarFluentImpl.this.withValueFrom(builder.build());
    }
    public N endValueFrom() {
      return and();
    }
    
  }
  
}