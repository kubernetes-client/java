package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2ObjectMetricSourceFluentImpl<A extends V2ObjectMetricSourceFluent<A>> extends BaseFluent<A> implements V2ObjectMetricSourceFluent<A>{
  public V2ObjectMetricSourceFluentImpl() {
  }
  public V2ObjectMetricSourceFluentImpl(V2ObjectMetricSource instance) {
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

  }
  private V2CrossVersionObjectReferenceBuilder describedObject;
  private V2MetricIdentifierBuilder metric;
  private V2MetricTargetBuilder target;
  
  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getDescribedObject() {
    return this.describedObject!=null ?this.describedObject.build():null;
  }
  public V2CrossVersionObjectReference buildDescribedObject() {
    return this.describedObject!=null ?this.describedObject.build():null;
  }
  public A withDescribedObject(V2CrossVersionObjectReference describedObject) {
    _visitables.get("describedObject").remove(this.describedObject);
    if (describedObject!=null){ this.describedObject= new V2CrossVersionObjectReferenceBuilder(describedObject); _visitables.get("describedObject").add(this.describedObject);} else { this.describedObject = null; _visitables.get("describedObject").remove(this.describedObject); } return (A) this;
  }
  public Boolean hasDescribedObject() {
    return this.describedObject != null;
  }
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObject() {
    return new V2ObjectMetricSourceFluentImpl.DescribedObjectNestedImpl();
  }
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObjectLike(V2CrossVersionObjectReference item) {
    return new V2ObjectMetricSourceFluentImpl.DescribedObjectNestedImpl(item);
  }
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editDescribedObject() {
    return withNewDescribedObjectLike(getDescribedObject());
  }
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObject() {
    return withNewDescribedObjectLike(getDescribedObject() != null ? getDescribedObject(): new V2CrossVersionObjectReferenceBuilder().build());
  }
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(V2CrossVersionObjectReference item) {
    return withNewDescribedObjectLike(getDescribedObject() != null ? getDescribedObject(): item);
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
  public V2ObjectMetricSourceFluent.MetricNested<A> withNewMetric() {
    return new V2ObjectMetricSourceFluentImpl.MetricNestedImpl();
  }
  public V2ObjectMetricSourceFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item) {
    return new V2ObjectMetricSourceFluentImpl.MetricNestedImpl(item);
  }
  public V2ObjectMetricSourceFluent.MetricNested<A> editMetric() {
    return withNewMetricLike(getMetric());
  }
  public V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetric() {
    return withNewMetricLike(getMetric() != null ? getMetric(): new V2MetricIdentifierBuilder().build());
  }
  public V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item) {
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
  public V2ObjectMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new V2ObjectMetricSourceFluentImpl.TargetNestedImpl();
  }
  public V2ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(V2MetricTarget item) {
    return new V2ObjectMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public V2ObjectMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new V2MetricTargetBuilder().build());
  }
  public V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ObjectMetricSourceFluentImpl that = (V2ObjectMetricSourceFluentImpl) o;
    if (describedObject != null ? !describedObject.equals(that.describedObject) :that.describedObject != null) return false;
    if (metric != null ? !metric.equals(that.metric) :that.metric != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(describedObject,  metric,  target,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (describedObject != null) { sb.append("describedObject:"); sb.append(describedObject + ","); }
    if (metric != null) { sb.append("metric:"); sb.append(metric + ","); }
    if (target != null) { sb.append("target:"); sb.append(target); }
    sb.append("}");
    return sb.toString();
  }
  class DescribedObjectNestedImpl<N> extends V2CrossVersionObjectReferenceFluentImpl<V2ObjectMetricSourceFluent.DescribedObjectNested<N>> implements V2ObjectMetricSourceFluent.DescribedObjectNested<N>,Nested<N>{
    DescribedObjectNestedImpl(V2CrossVersionObjectReference item) {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this, item);
    }
    DescribedObjectNestedImpl() {
      this.builder = new V2CrossVersionObjectReferenceBuilder(this);
    }
    V2CrossVersionObjectReferenceBuilder builder;
    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withDescribedObject(builder.build());
    }
    public N endDescribedObject() {
      return and();
    }
    
  }
  class MetricNestedImpl<N> extends V2MetricIdentifierFluentImpl<V2ObjectMetricSourceFluent.MetricNested<N>> implements V2ObjectMetricSourceFluent.MetricNested<N>,Nested<N>{
    MetricNestedImpl(V2MetricIdentifier item) {
      this.builder = new V2MetricIdentifierBuilder(this, item);
    }
    MetricNestedImpl() {
      this.builder = new V2MetricIdentifierBuilder(this);
    }
    V2MetricIdentifierBuilder builder;
    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withMetric(builder.build());
    }
    public N endMetric() {
      return and();
    }
    
  }
  class TargetNestedImpl<N> extends V2MetricTargetFluentImpl<V2ObjectMetricSourceFluent.TargetNested<N>> implements V2ObjectMetricSourceFluent.TargetNested<N>,Nested<N>{
    TargetNestedImpl(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new V2MetricTargetBuilder(this);
    }
    V2MetricTargetBuilder builder;
    public N and() {
      return (N) V2ObjectMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}