package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EnvVarFluent<A extends V1EnvVarFluent<A>> extends BaseFluent<A>{
  public V1EnvVarFluent() {
  }
  
  public V1EnvVarFluent(V1EnvVar instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String value;
  private V1EnvVarSourceBuilder valueFrom;
  
  protected void copyInstance(V1EnvVar instance) {
    instance = (instance != null ? instance : new V1EnvVar());
    if (instance != null) {
          this.withName(instance.getName());
          this.withValue(instance.getValue());
          this.withValueFrom(instance.getValueFrom());
        }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
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
  
  public V1EnvVarSource buildValueFrom() {
    return this.valueFrom != null ? this.valueFrom.build() : null;
  }
  
  public A withValueFrom(V1EnvVarSource valueFrom) {
    this._visitables.remove("valueFrom");
    if (valueFrom != null) {
        this.valueFrom = new V1EnvVarSourceBuilder(valueFrom);
        this._visitables.get("valueFrom").add(this.valueFrom);
    } else {
        this.valueFrom = null;
        this._visitables.get("valueFrom").remove(this.valueFrom);
    }
    return (A) this;
  }
  
  public boolean hasValueFrom() {
    return this.valueFrom != null;
  }
  
  public ValueFromNested<A> withNewValueFrom() {
    return new ValueFromNested(null);
  }
  
  public ValueFromNested<A> withNewValueFromLike(V1EnvVarSource item) {
    return new ValueFromNested(item);
  }
  
  public ValueFromNested<A> editValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(null));
  }
  
  public ValueFromNested<A> editOrNewValueFrom() {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(new V1EnvVarSourceBuilder().build()));
  }
  
  public ValueFromNested<A> editOrNewValueFromLike(V1EnvVarSource item) {
    return withNewValueFromLike(java.util.Optional.ofNullable(buildValueFrom()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarFluent that = (V1EnvVarFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    if (!java.util.Objects.equals(valueFrom, that.valueFrom)) return false;
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
  public class ValueFromNested<N> extends V1EnvVarSourceFluent<ValueFromNested<N>> implements Nested<N>{
    ValueFromNested(V1EnvVarSource item) {
      this.builder = new V1EnvVarSourceBuilder(this, item);
    }
    V1EnvVarSourceBuilder builder;
    
    public N and() {
      return (N) V1EnvVarFluent.this.withValueFrom(builder.build());
    }
    
    public N endValueFrom() {
      return and();
    }
    
  
  }

}