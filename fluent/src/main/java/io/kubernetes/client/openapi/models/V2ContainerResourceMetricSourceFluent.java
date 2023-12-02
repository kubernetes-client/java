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
public class V2ContainerResourceMetricSourceFluent<A extends V2ContainerResourceMetricSourceFluent<A>> extends BaseFluent<A>{
  public V2ContainerResourceMetricSourceFluent() {
  }
  
  public V2ContainerResourceMetricSourceFluent(V2ContainerResourceMetricSource instance) {
    this.copyInstance(instance);
  }
  private String container;
  private String name;
  private V2MetricTargetBuilder target;
  
  protected void copyInstance(V2ContainerResourceMetricSource instance) {
    instance = (instance != null ? instance : new V2ContainerResourceMetricSource());
    if (instance != null) {
          this.withContainer(instance.getContainer());
          this.withName(instance.getName());
          this.withTarget(instance.getTarget());
        }
  }
  
  public String getContainer() {
    return this.container;
  }
  
  public A withContainer(String container) {
    this.container = container;
    return (A) this;
  }
  
  public boolean hasContainer() {
    return this.container != null;
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
  
  public V2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }
  
  public A withTarget(V2MetricTarget target) {
    this._visitables.remove("target");
    if (target != null) {
        this.target = new V2MetricTargetBuilder(target);
        this._visitables.get("target").add(this.target);
    } else {
        this.target = null;
        this._visitables.get("target").remove(this.target);
    }
    return (A) this;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public TargetNested<A> withNewTarget() {
    return new TargetNested(null);
  }
  
  public TargetNested<A> withNewTargetLike(V2MetricTarget item) {
    return new TargetNested(item);
  }
  
  public TargetNested<A> editTarget() {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(null));
  }
  
  public TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(new V2MetricTargetBuilder().build()));
  }
  
  public TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return withNewTargetLike(java.util.Optional.ofNullable(buildTarget()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ContainerResourceMetricSourceFluent that = (V2ContainerResourceMetricSourceFluent) o;
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
  public class TargetNested<N> extends V2MetricTargetFluent<TargetNested<N>> implements Nested<N>{
    TargetNested(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
    V2MetricTargetBuilder builder;
    
    public N and() {
      return (N) V2ContainerResourceMetricSourceFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  
  }

}