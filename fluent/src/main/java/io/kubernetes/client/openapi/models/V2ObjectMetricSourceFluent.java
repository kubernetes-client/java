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
public class V2ObjectMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<A>> extends BaseFluent<A>{

  private V2CrossVersionObjectReferenceBuilder describedObject;
  private V2MetricIdentifierBuilder metric;
  private V2MetricTargetBuilder target;

  public V2ObjectMetricSourceFluent() {
  }
  
  public V2ObjectMetricSourceFluent(V2ObjectMetricSource instance) {
    this.copyInstance(instance);
  }

  public V2CrossVersionObjectReference buildDescribedObject() {
    return this.describedObject != null ? this.describedObject.build() : null;
  }
  
  public V2MetricIdentifier buildMetric() {
    return this.metric != null ? this.metric.build() : null;
  }
  
  public V2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }
  
  protected void copyInstance(V2ObjectMetricSource instance) {
    instance = instance != null ? instance : new V2ObjectMetricSource();
    if (instance != null) {
        this.withDescribedObject(instance.getDescribedObject());
        this.withMetric(instance.getMetric());
        this.withTarget(instance.getTarget());
    }
  }
  
  public DescribedObjectNested<A> editDescribedObject() {
    return this.withNewDescribedObjectLike(Optional.ofNullable(this.buildDescribedObject()).orElse(null));
  }
  
  public MetricNested<A> editMetric() {
    return this.withNewMetricLike(Optional.ofNullable(this.buildMetric()).orElse(null));
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
    V2ObjectMetricSourceFluent that = (V2ObjectMetricSourceFluent) o;
    if (!(Objects.equals(describedObject, that.describedObject))) {
      return false;
    }
    if (!(Objects.equals(metric, that.metric))) {
      return false;
    }
    if (!(Objects.equals(target, that.target))) {
      return false;
    }
    return true;
  }
  
  public boolean hasDescribedObject() {
    return this.describedObject != null;
  }
  
  public boolean hasMetric() {
    return this.metric != null;
  }
  
  public boolean hasTarget() {
    return this.target != null;
  }
  
  public int hashCode() {
    return Objects.hash(describedObject, metric, target);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(describedObject == null)) {
        sb.append("describedObject:");
        sb.append(describedObject);
        sb.append(",");
    }
    if (!(metric == null)) {
        sb.append("metric:");
        sb.append(metric);
        sb.append(",");
    }
    if (!(target == null)) {
        sb.append("target:");
        sb.append(target);
    }
    sb.append("}");
    return sb.toString();
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
  public class DescribedObjectNested<N> extends V2CrossVersionObjectReferenceFluent<DescribedObjectNested<N>> implements Nested<N>{
  
    V2CrossVersionObjectReferenceBuilder builder;
  
    DescribedObjectNested(V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ObjectMetricSourceFluent.this.withDescribedObject(builder.build());
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
      return (N) V2ObjectMetricSourceFluent.this.withMetric(builder.build());
    }
    
    public N endMetric() {
      return and();
    }
    
  }
  public class TargetNested<N> extends V2MetricTargetFluent<TargetNested<N>> implements Nested<N>{
  
    V2MetricTargetBuilder builder;
  
    TargetNested(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
  
    public N and() {
      return (N) V2ObjectMetricSourceFluent.this.withTarget(builder.build());
    }
    
    public N endTarget() {
      return and();
    }
    
  }
}