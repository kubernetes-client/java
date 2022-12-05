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
  public class V2beta2ContainerResourceMetricStatusFluentImpl<A extends V2beta2ContainerResourceMetricStatusFluent<A>> extends BaseFluent<A> implements V2beta2ContainerResourceMetricStatusFluent<A>{
  public V2beta2ContainerResourceMetricStatusFluentImpl() {
  }
  public V2beta2ContainerResourceMetricStatusFluentImpl(V2beta2ContainerResourceMetricStatus instance) {
    this.withContainer(instance.getContainer());

    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

  }
  private String container;
  private V2beta2MetricValueStatusBuilder current;
  private String name;
  public String getContainer() {
    return this.container;
  }
  public A withContainer(String container) {
    this.container=container; return (A) this;
  }
  public Boolean hasContainer() {
    return this.container != null;
  }
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public V2beta2MetricValueStatus buildCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public A withCurrent(V2beta2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current!=null){ this.current= new V2beta2MetricValueStatusBuilder(current); _visitables.get("current").add(this.current);} else { this.current = null; _visitables.get("current").remove(this.current); } return (A) this;
  }
  public Boolean hasCurrent() {
    return this.current != null;
  }
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2beta2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl();
  }
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2beta2MetricValueStatus item) {
    return new V2beta2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
  }
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editCurrent() {
    return withNewCurrentLike(getCurrent());
  }
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent() {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): new V2beta2MetricValueStatusBuilder().build());
  }
  public V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2beta2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): item);
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ContainerResourceMetricStatusFluentImpl that = (V2beta2ContainerResourceMetricStatusFluentImpl) o;
    if (container != null ? !container.equals(that.container) :that.container != null) return false;
    if (current != null ? !current.equals(that.current) :that.current != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(container,  current,  name,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (container != null) { sb.append("container:"); sb.append(container + ","); }
    if (current != null) { sb.append("current:"); sb.append(current + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  class CurrentNestedImpl<N> extends V2beta2MetricValueStatusFluentImpl<V2beta2ContainerResourceMetricStatusFluent.CurrentNested<N>> implements V2beta2ContainerResourceMetricStatusFluent.CurrentNested<N>,Nested<N>{
    CurrentNestedImpl(V2beta2MetricValueStatus item) {
      this.builder = new V2beta2MetricValueStatusBuilder(this, item);
    }
    CurrentNestedImpl() {
      this.builder = new V2beta2MetricValueStatusBuilder(this);
    }
    V2beta2MetricValueStatusBuilder builder;
    public N and() {
      return (N) V2beta2ContainerResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
    }
    public N endCurrent() {
      return and();
    }
    
  }
  
}