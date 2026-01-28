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
public class V2ObjectMetricStatusFluent<A extends io.kubernetes.client.openapi.models.V2ObjectMetricStatusFluent<A>> extends BaseFluent<A>{

  private V2MetricValueStatusBuilder current;
  private V2CrossVersionObjectReferenceBuilder describedObject;
  private V2MetricIdentifierBuilder metric;

  public V2ObjectMetricStatusFluent() {
  }
  
  public V2ObjectMetricStatusFluent(V2ObjectMetricStatus instance) {
    this.copyInstance(instance);
  }

  public V2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }
  
  public V2CrossVersionObjectReference buildDescribedObject() {
    return this.describedObject != null ? this.describedObject.build() : null;
  }
  
  public V2MetricIdentifier buildMetric() {
    return this.metric != null ? this.metric.build() : null;
  }
  
  protected void copyInstance(V2ObjectMetricStatus instance) {
    instance = instance != null ? instance : new V2ObjectMetricStatus();
    if (instance != null) {
        this.withCurrent(instance.getCurrent());
        this.withDescribedObject(instance.getDescribedObject());
        this.withMetric(instance.getMetric());
    }
  }
  
  public CurrentNested<A> editCurrent() {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(null));
  }
  
  public DescribedObjectNested<A> editDescribedObject() {
    return this.withNewDescribedObjectLike(Optional.ofNullable(this.buildDescribedObject()).orElse(null));
  }
  
  public MetricNested<A> editMetric() {
    return this.withNewMetricLike(Optional.ofNullable(this.buildMetric()).orElse(null));
  }
  
  public CurrentNested<A> editOrNewCurrent() {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(new V2MetricValueStatusBuilder().build()));
  }
  
  public CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item) {
    return this.withNewCurrentLike(Optional.ofNullable(this.buildCurrent()).orElse(item));
  }
  
  public DescribedObjectNested<A> editOrNewDescribedObject() {
    return this.withNewDescribedObjectLike(Optional.ofNullable(this.buildDescribedObject()).orElse(new V2CrossVersionObjectReferenceBuilder().build()));
  }
  
  public DescribedObjectNested<A> editOrNewDescribedObjectLike(V2CrossVersionObjectReference item) {
    return this.withNewDescribedObjectLike(Optional.ofNullable(this.buildDescribedObject()).orElse(item));
  }
  
  public MetricNested<A> editOrNewMetric() {
    return this.withNewMetricLike(Optional.ofNullable(this.buildMetric()).orElse(new V2MetricIdentifierBuilder().build()));
  }
  
  public MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item) {
    return this.withNewMetricLike(Optional.ofNullable(this.buildMetric()).orElse(item));
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
    V2ObjectMetricStatusFluent that = (V2ObjectMetricStatusFluent) o;
    if (!(Objects.equals(current, that.current))) {
      return false;
    }
    if (!(Objects.equals(describedObject, that.describedObject))) {
      return false;
    }
    if (!(Objects.equals(metric, that.metric))) {
      return false;
    }
    return true;
  }
  
  public boolean hasCurrent() {
    return this.current != null;
  }
  
  public boolean hasDescribedObject() {
    return this.describedObject != null;
  }
  
  public boolean hasMetric() {
    return this.metric != null;
  }
  
  public int hashCode() {
    return Objects.hash(current, describedObject, metric);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(current == null)) {
        sb.append("current:");
        sb.append(current);
        sb.append(",");
    }
    if (!(describedObject == null)) {
        sb.append("describedObject:");
        sb.append(describedObject);
        sb.append(",");
    }
    if (!(metric == null)) {
        sb.append("metric:");
        sb.append(metric);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withDescribedObject(V2CrossVersionObjectReference describedObject) {
    this._visitables.remove("describedObject");
    if (describedObject != null) {
        this.describedObject = new V2CrossVersionObjectReferenceBuilder(describedObject);
        this._visitables.get("describedObject").add(this.describedObject);
    } else {
        this.describedObject = null;
        this._visitables.get("describedObject").remove(this.describedObject);
    }
    return (A) this;
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
  
  public CurrentNested<A> withNewCurrent() {
    return new CurrentNested(null);
  }
  
  public CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item) {
    return new CurrentNested(item);
  }
  
  public DescribedObjectNested<A> withNewDescribedObject() {
    return new DescribedObjectNested(null);
  }
  
  public DescribedObjectNested<A> withNewDescribedObjectLike(V2CrossVersionObjectReference item) {
    return new DescribedObjectNested(item);
  }
  
  public MetricNested<A> withNewMetric() {
    return new MetricNested(null);
  }
  
  public MetricNested<A> withNewMetricLike(V2MetricIdentifier item) {
    return new MetricNested(item);
  }
  public class CurrentNested<N> extends V2MetricValueStatusFluent<CurrentNested<N>> implements Nested<N>{
  
    V2MetricValueStatusBuilder builder;
  
    CurrentNested(V2MetricValueStatus item) {
      this.builder = new V2MetricValueStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ObjectMetricStatusFluent.this.withCurrent(builder.build());
    }
    
    public N endCurrent() {
      return and();
    }
    
  }
  public class DescribedObjectNested<N> extends V2CrossVersionObjectReferenceFluent<DescribedObjectNested<N>> implements Nested<N>{
  
    V2CrossVersionObjectReferenceBuilder builder;
  
    DescribedObjectNested(V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ObjectMetricStatusFluent.this.withDescribedObject(builder.build());
    }
    
    public N endDescribedObject() {
      return and();
    }
    
  }
  public class MetricNested<N> extends V2MetricIdentifierFluent<MetricNested<N>> implements Nested<N>{
  
    V2MetricIdentifierBuilder builder;
  
    MetricNested(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ObjectMetricStatusFluent.this.withMetric(builder.build());
    }
    
    public N endMetric() {
      return and();
    }
    
  }
}