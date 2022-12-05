package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ObjectMetricStatusFluent<A extends V2beta2ObjectMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent();
  public V2beta2MetricValueStatus buildCurrent();
  public A withCurrent(V2beta2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2beta2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public V2beta2ObjectMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2beta2MetricValueStatus item);
  public V2beta2ObjectMetricStatusFluent.CurrentNested<A> editCurrent();
  public V2beta2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public V2beta2ObjectMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2beta2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2CrossVersionObjectReference getDescribedObject();
  public V2beta2CrossVersionObjectReference buildDescribedObject();
  public A withDescribedObject(V2beta2CrossVersionObjectReference describedObject);
  public Boolean hasDescribedObject();
  public V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObject();
  public V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> withNewDescribedObjectLike(V2beta2CrossVersionObjectReference item);
  public V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editDescribedObject();
  public V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObject();
  public V2beta2ObjectMetricStatusFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(V2beta2CrossVersionObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricIdentifier getMetric();
  public V2beta2MetricIdentifier buildMetric();
  public A withMetric(V2beta2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2beta2ObjectMetricStatusFluent.MetricNested<A> withNewMetric();
  public V2beta2ObjectMetricStatusFluent.MetricNested<A> withNewMetricLike(V2beta2MetricIdentifier item);
  public V2beta2ObjectMetricStatusFluent.MetricNested<A> editMetric();
  public V2beta2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public V2beta2ObjectMetricStatusFluent.MetricNested<A> editOrNewMetricLike(V2beta2MetricIdentifier item);
  public interface CurrentNested<N> extends Nested<N>,V2beta2MetricValueStatusFluent<V2beta2ObjectMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface DescribedObjectNested<N> extends Nested<N>,V2beta2CrossVersionObjectReferenceFluent<V2beta2ObjectMetricStatusFluent.DescribedObjectNested<N>>{
    public N and();
    public N endDescribedObject();
    
  }
  public interface MetricNested<N> extends Nested<N>,V2beta2MetricIdentifierFluent<V2beta2ObjectMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}