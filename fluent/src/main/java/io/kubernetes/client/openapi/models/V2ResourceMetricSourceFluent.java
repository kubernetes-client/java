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
public class V2ResourceMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<A>> extends BaseFluent<A>{

  private String name;
  private V2MetricTargetBuilder target;

  public V2ResourceMetricSourceFluent() {
  }
  
  public V2ResourceMetricSourceFluent(V2ResourceMetricSource instance) {
    this.copyInstance(instance);
  }

  public V2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }
  
  protected void copyInstance(V2ResourceMetricSource instance) {
    instance = instance != null ? instance : new V2ResourceMetricSource();
    if (instance != null) {
        this.withName(instance.getName());
        this.withTarget(instance.getTarget());
    }
  }
  
  public TargetNested<A> editOrNewTarget() {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(new V2MetricTargetBuilder().build()));
  }
  
  public TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(item));
  }
  
  public TargetNested<A> editTarget() {
    return this.withNewTargetLike(Optional.ofNullable(this.buildTarget()).orElse(null));
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
    V2ResourceMetricSourceFluent that = (V2ResourceMetricSourceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(target, that.target))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, target);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
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
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public TargetNested<A> withNewTarget() {
    return new TargetNested(null);
  }
  
  public TargetNested<A> withNewTargetLike(V2MetricTarget item) {
    return new TargetNested(item);
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
  public class TargetNested<N> extends V2MetricTargetFluent<TargetNested<N>> implements Nested<N>{
  
    V2MetricTargetBuilder builder;
  
    TargetNested(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ResourceMetricSourceFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  }
}