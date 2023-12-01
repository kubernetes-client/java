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
public class V2PodsMetricStatusFluent<A extends V2PodsMetricStatusFluent<A>> extends BaseFluent<A>{
  public V2PodsMetricStatusFluent() {
  }
  
  public V2PodsMetricStatusFluent(V2PodsMetricStatus instance) {
    this.copyInstance(instance);
  }
  private V2MetricValueStatusBuilder current;
  private V2MetricIdentifierBuilder metric;
  
  protected void copyInstance(V2PodsMetricStatus instance) {
    instance = (instance != null ? instance : new V2PodsMetricStatus());
    if (instance != null) {
          this.withCurrent(instance.getCurrent());
          this.withMetric(instance.getMetric());
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2PodsMetricStatusFluent that = (V2PodsMetricStatusFluent) o;
    if (!java.util.Objects.equals(current, that.current)) return false;
    if (!java.util.Objects.equals(metric, that.metric)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(current,  metric,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) { sb.append("current:"); sb.append(current + ","); }
    if (metric != null) { sb.append("metric:"); sb.append(metric); }
    sb.append("}");
    return sb.toString();
  }
  public class CurrentNested<N> extends V2MetricValueStatusFluent<CurrentNested<N>> implements Nested<N>{
    CurrentNested(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
    V2MetricValueStatusBuilder builder;
    
    public N and() {
      return (N) V2PodsMetricStatusFluent.this.withCurrent(builder.build());
    }
    
    public N endCurrent() {
      return and();
    }
    
  
  }
  public class MetricNested<N> extends V2MetricIdentifierFluent<MetricNested<N>> implements Nested<N>{
    MetricNested(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
    V2MetricIdentifierBuilder builder;
    
    public N and() {
      return (N) V2PodsMetricStatusFluent.this.withMetric(builder.build());
    }
    
    public N endMetric() {
      return and();
    }
    
  
  }

}