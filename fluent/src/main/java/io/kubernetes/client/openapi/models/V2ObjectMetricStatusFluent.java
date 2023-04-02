package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ObjectMetricStatusFluent<A extends V2ObjectMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();
  public V2MetricValueStatus buildCurrent();
  public A withCurrent(V2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public V2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item);
  public V2ObjectMetricStatusFluent.CurrentNested<A> editCurrent();
  public V2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public V2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getDescribedObject();
  public V2CrossVersionObjectReference buildDescribedObject();
  public A withDescribedObject(V2CrossVersionObjectReference describedObject);
  public Boolean hasDescribedObject();
  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObject();
  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObjectLike(V2CrossVersionObjectReference item);
  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> editDescribedObject();
  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObject();
  public V2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(V2CrossVersionObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric();
  public V2MetricIdentifier buildMetric();
  public A withMetric(V2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2ObjectMetricStatusFluent.MetricNested<A> withNewMetric();
  public V2ObjectMetricStatusFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item);
  public V2ObjectMetricStatusFluent.MetricNested<A> editMetric();
  public V2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public V2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item);
  public interface CurrentNested<N> extends Nested<N>,V2MetricValueStatusFluent<V2ObjectMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface DescribedObjectNested<N> extends Nested<N>,V2CrossVersionObjectReferenceFluent<V2ObjectMetricStatusFluent.DescribedObjectNested<N>>{
    public N and();
    public N endDescribedObject();
    
  }
  public interface MetricNested<N> extends Nested<N>,V2MetricIdentifierFluent<V2ObjectMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}