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
  public class V2ContainerResourceMetricSourceFluentImpl<A extends V2ContainerResourceMetricSourceFluent<A>> extends BaseFluent<A> implements V2ContainerResourceMetricSourceFluent<A>{
  public V2ContainerResourceMetricSourceFluentImpl() {
  }
  public V2ContainerResourceMetricSourceFluentImpl(V2ContainerResourceMetricSource instance) {
    if (instance != null) {
      this.withContainer(instance.getContainer());
      this.withName(instance.getName());
      this.withTarget(instance.getTarget());
    }
  }
  private String container;
  private String name;
  private V2MetricTargetBuilder target;
  public String getContainer() {
    return this.container;
  }
  public A withContainer(String container) {
    this.container=container; return (A) this;
  }
  public Boolean hasContainer() {
    return this.container != null;
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
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public V2MetricTarget buildTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public A withTarget(V2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target!=null){ this.target= new V2MetricTargetBuilder(target); _visitables.get("target").add(this.target);} else { this.target = null; _visitables.get("target").remove(this.target); } return (A) this;
  }
  public Boolean hasTarget() {
    return this.target != null;
  }
  public V2ContainerResourceMetricSourceFluentImpl.TargetNested<A> withNewTarget() {
    return new V2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl();
  }
  public V2ContainerResourceMetricSourceFluentImpl.TargetNested<A> withNewTargetLike(V2MetricTarget item) {
    return new V2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public V2ContainerResourceMetricSourceFluentImpl.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public V2ContainerResourceMetricSourceFluentImpl.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new V2MetricTargetBuilder().build());
  }
  public V2ContainerResourceMetricSourceFluentImpl.TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ContainerResourceMetricSourceFluentImpl that = (V2ContainerResourceMetricSourceFluentImpl) o;
    if (!java.util.Objects.equals(container, that.container)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(target, that.target)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(container,  name,  target,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (container != null) { sb.append("container:"); sb.append(container + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (target != null) { sb.append("target:"); sb.append(target); }
    sb.append("}");
    return sb.toString();
  }
  class TargetNestedImpl<N> extends V2MetricTargetFluentImpl<V2ContainerResourceMetricSourceFluentImpl.TargetNested<N>> implements V2ContainerResourceMetricSourceFluentImpl.TargetNested<N>,Nested<N>{
    TargetNestedImpl(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new V2MetricTargetBuilder(this);
    }
    V2MetricTargetBuilder builder;
    public N and() {
      return (N) V2ContainerResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}