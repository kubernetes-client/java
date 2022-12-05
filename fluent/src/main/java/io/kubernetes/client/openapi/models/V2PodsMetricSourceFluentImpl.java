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
  public class V2PodsMetricSourceFluentImpl<A extends V2PodsMetricSourceFluent<A>> extends BaseFluent<A> implements V2PodsMetricSourceFluent<A>{
  public V2PodsMetricSourceFluentImpl() {
  }
  public V2PodsMetricSourceFluentImpl(V2PodsMetricSource instance) {
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

  }
  private V2MetricIdentifierBuilder metric;
  private V2MetricTargetBuilder target;
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric() {
    return this.metric!=null ?this.metric.build():null;
  }
  public V2MetricIdentifier buildMetric() {
    return this.metric!=null ?this.metric.build():null;
  }
  public A withMetric(V2MetricIdentifier metric) {
    _visitables.get("metric").remove(this.metric);
    if (metric!=null){ this.metric= new V2MetricIdentifierBuilder(metric); _visitables.get("metric").add(this.metric);} else { this.metric = null; _visitables.get("metric").remove(this.metric); } return (A) this;
  }
  public Boolean hasMetric() {
    return this.metric != null;
  }
  public V2PodsMetricSourceFluent.MetricNested<A> withNewMetric() {
    return new V2PodsMetricSourceFluentImpl.MetricNestedImpl();
  }
  public V2PodsMetricSourceFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item) {
    return new V2PodsMetricSourceFluentImpl.MetricNestedImpl(item);
  }
  public V2PodsMetricSourceFluent.MetricNested<A> editMetric() {
    return withNewMetricLike(getMetric());
  }
  public V2PodsMetricSourceFluent.MetricNested<A> editOrNewMetric() {
    return withNewMetricLike(getMetric() != null ? getMetric(): new V2MetricIdentifierBuilder().build());
  }
  public V2PodsMetricSourceFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric(): item);
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
  public V2PodsMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new V2PodsMetricSourceFluentImpl.TargetNestedImpl();
  }
  public V2PodsMetricSourceFluent.TargetNested<A> withNewTargetLike(V2MetricTarget item) {
    return new V2PodsMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public V2PodsMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public V2PodsMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new V2MetricTargetBuilder().build());
  }
  public V2PodsMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2PodsMetricSourceFluentImpl that = (V2PodsMetricSourceFluentImpl) o;
    if (metric != null ? !metric.equals(that.metric) :that.metric != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
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
  class MetricNestedImpl<N> extends V2MetricIdentifierFluentImpl<V2PodsMetricSourceFluent.MetricNested<N>> implements V2PodsMetricSourceFluent.MetricNested<N>,Nested<N>{
    MetricNestedImpl(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
    MetricNestedImpl() {
      this.builder = new V2MetricIdentifierBuilder(this);
    }
    V2MetricIdentifierBuilder builder;
    public N and() {
      return (N) V2PodsMetricSourceFluentImpl.this.withMetric(builder.build());
    }
    public N endMetric() {
      return and();
    }
    
  }
  class TargetNestedImpl<N> extends V2MetricTargetFluentImpl<V2PodsMetricSourceFluent.TargetNested<N>> implements V2PodsMetricSourceFluent.TargetNested<N>,Nested<N>{
    TargetNestedImpl(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new V2MetricTargetBuilder(this);
    }
    V2MetricTargetBuilder builder;
    public N and() {
      return (N) V2PodsMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}