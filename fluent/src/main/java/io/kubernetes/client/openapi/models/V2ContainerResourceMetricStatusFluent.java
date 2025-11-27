package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2ContainerResourceMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<A>> extends BaseFluent<A>{

  private String container;
  private V2MetricValueStatusBuilder current;
  private String name;

  public V2ContainerResourceMetricStatusFluent() {
  }
  
  public V2ContainerResourceMetricStatusFluent(V2ContainerResourceMetricStatus instance) {
    this.copyInstance(instance);
  }

  public V2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }
  
  protected void copyInstance(V2ContainerResourceMetricStatus instance) {
    instance = instance != null ? instance : new V2ContainerResourceMetricStatus();
    if (instance != null) {
        this.withContainer(instance.getContainer());
        this.withCurrent(instance.getCurrent());
        this.withName(instance.getName());
    }
  }
  
  public CurrentNested<A> editCurrent() {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(null));
  }
  
  public CurrentNested<A> editOrNewCurrent() {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(new V2MetricValueStatusBuilder().build()));
  }
  
  public CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item) {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(item));
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
    V2ContainerResourceMetricStatusFluent that = (V2ContainerResourceMetricStatusFluent) o;
    if (!(Objects.equals(container, that.container))) {
      return false;
    }
    if (!(Objects.equals(current, that.current))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getContainer() {
    return this.container;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasContainer() {
    return this.container != null;
  }
  
  public boolean hasCurrent() {
    return this.current != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(container, current, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(container == null)) {
        sb.append("container:");
        sb.append(container);
        sb.append(",");
    }
    if (!(current == null)) {
        sb.append("current:");
        sb.append(current);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainer(String container) {
    this.container = container;
    return (A) this;
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
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public CurrentNested<A> withNewCurrent() {
    return new CurrentNested(null);
  }
  
  public CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item) {
    return new CurrentNested(item);
  }
  public class CurrentNested<N> extends V2MetricValueStatusFluent<CurrentNested<N>> implements Nested<N>{
  
    V2MetricValueStatusBuilder builder;
  
    CurrentNested(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ContainerResourceMetricStatusFluent.this.withCurrent(builder.build());
    }
    
    public N endCurrent() {
      return and();
    }
    
  }
}