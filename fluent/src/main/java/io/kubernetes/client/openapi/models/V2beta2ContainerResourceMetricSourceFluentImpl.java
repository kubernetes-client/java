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
  public class V2beta2ContainerResourceMetricSourceFluentImpl<A extends V2beta2ContainerResourceMetricSourceFluent<A>> extends BaseFluent<A> implements V2beta2ContainerResourceMetricSourceFluent<A>{
  public V2beta2ContainerResourceMetricSourceFluentImpl() {
  }
  public V2beta2ContainerResourceMetricSourceFluentImpl(V2beta2ContainerResourceMetricSource instance) {
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

  }
  private String container;
  private String name;
  private V2beta2MetricTargetBuilder target;
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
  public V2beta2MetricTarget getTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public V2beta2MetricTarget buildTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public A withTarget(V2beta2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target!=null){ this.target= new V2beta2MetricTargetBuilder(target); _visitables.get("target").add(this.target);} else { this.target = null; _visitables.get("target").remove(this.target); } return (A) this;
  }
  public Boolean hasTarget() {
    return this.target != null;
  }
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new V2beta2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl();
  }
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(V2beta2MetricTarget item) {
    return new V2beta2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new V2beta2MetricTargetBuilder().build());
  }
  public V2beta2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2beta2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ContainerResourceMetricSourceFluentImpl that = (V2beta2ContainerResourceMetricSourceFluentImpl) o;
    if (container != null ? !container.equals(that.container) :that.container != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
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
  class TargetNestedImpl<N> extends V2beta2MetricTargetFluentImpl<V2beta2ContainerResourceMetricSourceFluent.TargetNested<N>> implements V2beta2ContainerResourceMetricSourceFluent.TargetNested<N>,Nested<N>{
    TargetNestedImpl(V2beta2MetricTarget item) {
      this.builder = new V2beta2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new V2beta2MetricTargetBuilder(this);
    }
    V2beta2MetricTargetBuilder builder;
    public N and() {
      return (N) V2beta2ContainerResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}