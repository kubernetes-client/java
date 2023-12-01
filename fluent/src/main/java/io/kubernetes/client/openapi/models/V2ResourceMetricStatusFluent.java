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
public class V2ResourceMetricStatusFluent<A extends V2ResourceMetricStatusFluent<A>> extends BaseFluent<A>{
  public V2ResourceMetricStatusFluent() {
  }
  
  public V2ResourceMetricStatusFluent(V2ResourceMetricStatus instance) {
    this.copyInstance(instance);
  }
  private V2MetricValueStatusBuilder current;
  private String name;
  
  protected void copyInstance(V2ResourceMetricStatus instance) {
    instance = (instance != null ? instance : new V2ResourceMetricStatus());
    if (instance != null) {
          this.withCurrent(instance.getCurrent());
          this.withName(instance.getName());
        }
  }
  
  public V2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }
  
  public A withCurrent(V2MetricValueStatus current) {
    this._visitables.remove("current");
    if (current != null) {
        this.current = new V2MetricValueStatusBuilder(current);
        this._visitables.get("current").add(this.current);
    } else {
        this.current = null;
        this._visitables.get("current").remove(this.current);
    }
    return (A) this;
  }
  
  public boolean hasCurrent() {
    return this.current != null;
  }
  
  public CurrentNested<A> withNewCurrent() {
    return new CurrentNested(null);
  }
  
  public CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item) {
    return new CurrentNested(item);
  }
  
  public CurrentNested<A> editCurrent() {
    return withNewCurrentLike(java.util.Optional.ofNullable(buildCurrent()).orElse(null));
  }
  
  public CurrentNested<A> editOrNewCurrent() {
    return withNewCurrentLike(java.util.Optional.ofNullable(buildCurrent()).orElse(new V2MetricValueStatusBuilder().build()));
  }
  
  public CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item) {
    return withNewCurrentLike(java.util.Optional.ofNullable(buildCurrent()).orElse(item));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ResourceMetricStatusFluent that = (V2ResourceMetricStatusFluent) o;
    if (!java.util.Objects.equals(current, that.current)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(current,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) { sb.append("current:"); sb.append(current + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class CurrentNested<N> extends V2MetricValueStatusFluent<CurrentNested<N>> implements Nested<N>{
    CurrentNested(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
    V2MetricValueStatusBuilder builder;
    
    public N and() {
      return (N) V2ResourceMetricStatusFluent.this.withCurrent(builder.build());
    }
    
    public N endCurrent() {
      return and();
    }
    
  
  }

}