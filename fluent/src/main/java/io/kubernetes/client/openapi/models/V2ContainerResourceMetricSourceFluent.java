package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2ContainerResourceMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<A>> extends BaseFluent<A>{
  public V2ContainerResourceMetricSourceFluent() {
  }
  
  public V2ContainerResourceMetricSourceFluent(V2ContainerResourceMetricSource instance) {
    this.copyInstance(instance);
  }
  private String container;
  private String name;
  private V2MetricTargetBuilder target;
  
  protected void copyInstance(V2ContainerResourceMetricSource instance) {
    instance = instance != null ? instance : new V2ContainerResourceMetricSource();
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
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(null));
  }
  
  public TargetNested<A> editOrNewTarget() {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(new V2MetricTargetBuilder().build()));
  }
  
  public TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(item));
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
    V2ContainerResourceMetricSourceFluent that = (V2ContainerResourceMetricSourceFluent) o;
    if (!(Objects.equals(container, that.container))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(target, that.target))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(container, name, target);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(container == null)) {
        sb.append("container:");
        sb.append(container);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(target == null)) {
        sb.append("target:");
        sb.append(target);
    }
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