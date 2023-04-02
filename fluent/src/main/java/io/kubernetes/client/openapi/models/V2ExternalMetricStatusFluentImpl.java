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
  public class V2ExternalMetricStatusFluentImpl<A extends V2ExternalMetricStatusFluent<A>> extends BaseFluent<A> implements V2ExternalMetricStatusFluent<A>{
  public V2ExternalMetricStatusFluentImpl() {
  }
  public V2ExternalMetricStatusFluentImpl(V2ExternalMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

  }
  private V2MetricValueStatusBuilder current;
  private V2MetricIdentifierBuilder metric;
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public V2MetricValueStatus buildCurrent() {
    return this.current!=null ?this.current.build():null;
  }
  public A withCurrent(V2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current!=null){ this.current= new V2MetricValueStatusBuilder(current); _visitables.get("current").add(this.current);} else { this.current = null; _visitables.get("current").remove(this.current); } return (A) this;
  }
  public Boolean hasCurrent() {
    return this.current != null;
  }
  public V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2ExternalMetricStatusFluentImpl.CurrentNestedImpl();
  }
  public V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item) {
    return new V2ExternalMetricStatusFluentImpl.CurrentNestedImpl(item);
  }
  public V2ExternalMetricStatusFluent.CurrentNested<A> editCurrent() {
    return withNewCurrentLike(getCurrent());
  }
  public V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrent() {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): new V2MetricValueStatusBuilder().build());
  }
  public V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent(): item);
  }
  
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
  public V2ExternalMetricStatusFluent.MetricNested<A> withNewMetric() {
    return new V2ExternalMetricStatusFluentImpl.MetricNestedImpl();
  }
  public V2ExternalMetricStatusFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item) {
    return new V2ExternalMetricStatusFluentImpl.MetricNestedImpl(item);
  }
  public V2ExternalMetricStatusFluent.MetricNested<A> editMetric() {
    return withNewMetricLike(getMetric());
  }
  public V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetric() {
    return withNewMetricLike(getMetric() != null ? getMetric(): new V2MetricIdentifierBuilder().build());
  }
  public V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ExternalMetricStatusFluentImpl that = (V2ExternalMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) :that.current != null) return false;
    if (metric != null ? !metric.equals(that.metric) :that.metric != null) return false;
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
  class CurrentNestedImpl<N> extends V2MetricValueStatusFluentImpl<V2ExternalMetricStatusFluent.CurrentNested<N>> implements V2ExternalMetricStatusFluent.CurrentNested<N>,Nested<N>{
    CurrentNestedImpl(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
    CurrentNestedImpl() {
      this.builder = new V2MetricValueStatusBuilder(this);
    }
    V2MetricValueStatusBuilder builder;
    public N and() {
      return (N) V2ExternalMetricStatusFluentImpl.this.withCurrent(builder.build());
    }
    public N endCurrent() {
      return and();
    }
    
  }
  class MetricNestedImpl<N> extends V2MetricIdentifierFluentImpl<V2ExternalMetricStatusFluent.MetricNested<N>> implements V2ExternalMetricStatusFluent.MetricNested<N>,Nested<N>{
    MetricNestedImpl(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
    MetricNestedImpl() {
      this.builder = new V2MetricIdentifierBuilder(this);
    }
    V2MetricIdentifierBuilder builder;
    public N and() {
      return (N) V2ExternalMetricStatusFluentImpl.this.withMetric(builder.build());
    }
    public N endMetric() {
      return and();
    }
    
  }
  
}