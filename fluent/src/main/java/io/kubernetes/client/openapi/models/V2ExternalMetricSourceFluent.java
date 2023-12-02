package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2ExternalMetricSourceFluent<A extends V2ExternalMetricSourceFluent<A>> extends BaseFluent<A>{
  public V2ExternalMetricSourceFluent() {
  }
  
  public V2ExternalMetricSourceFluent(V2ExternalMetricSource instance) {
    this.copyInstance(instance);
  }
  private V2MetricIdentifierBuilder metric;
  private V2MetricTargetBuilder target;
  
  protected void copyInstance(V2ExternalMetricSource instance) {
    instance = (instance != null ? instance : new V2ExternalMetricSource());
    if (instance != null) {
          this.withMetric(instance.getMetric());
          this.withTarget(instance.getTarget());
        }
  }
  
  public V2MetricIdentifier buildMetric() {
    return this.metric != null ? this.metric.build() : null;
  }
  
  public A withMetric(V2MetricIdentifier metric) {
    this._visitables.remove("metric");
    if (metric != null) {
        this.metric = new V2MetricIdentifierBuilder(metric);
        this._visitables.get("metric").add(this.metric);
    } else {
        this.metric = null;
        this._visitables.get("metric").remove(this.metric);
    }
    return (A) this;
  }
  
  public boolean hasMetric() {
    return this.metric != null;
  }
  
  public MetricNested<A> withNewMetric() {
    return new MetricNested(null);
  }
  
  public MetricNested<A> withNewMetricLike(V2MetricIdentifier item) {
    return new MetricNested(item);
  }
  
  public MetricNested<A> editMetric() {
    return withNewMetricLike(java.util.Optional.ofNullable(buildMetric()).orElse(null));
  }
  
  public MetricNested<A> editOrNewMetric() {
    return withNewMetricLike(java.util.Optional.ofNullable(buildMetric()).orElse(new V2MetricIdentifierBuilder().build()));
  }
  
  public MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item) {
    return withNewMetricLike(java.util.Optional.ofNullable(buildMetric()).orElse(item));
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
    V2ExternalMetricSourceFluent that = (V2ExternalMetricSourceFluent) o;
    if (!java.util.Objects.equals(metric, that.metric)) return false;
    if (!java.util.Objects.equals(target, that.target)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(metric,  target,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (metric != null) { sb.append("metric:"); sb.append(metric + ","); }
    if (target != null) { sb.append("target:"); sb.append(target); }
    sb.append("}");
    return sb.toString();
  }
  public class MetricNested<N> extends V2MetricIdentifierFluent<MetricNested<N>> implements Nested<N>{
    MetricNested(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
    V2MetricIdentifierBuilder builder;
    
    public N and() {
      return (N) V2ExternalMetricSourceFluent.this.withMetric(builder.build());
    }
    
    public N endMetric() {
      return and();
    }
    
  
  }
  public class TargetNested<N> extends V2MetricTargetFluent<TargetNested<N>> implements Nested<N>{
    TargetNested(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
    V2MetricTargetBuilder builder;
    
    public N and() {
      return (N) V2ExternalMetricSourceFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  
  }

}