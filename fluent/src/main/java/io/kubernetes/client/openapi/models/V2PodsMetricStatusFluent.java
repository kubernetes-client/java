package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2PodsMetricStatusFluent<A extends V2PodsMetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();
  public V2MetricValueStatus buildCurrent();
  public A withCurrent(V2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2PodsMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public V2PodsMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item);
  public V2PodsMetricStatusFluent.CurrentNested<A> editCurrent();
  public V2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public V2PodsMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric();
  public V2MetricIdentifier buildMetric();
  public A withMetric(V2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2PodsMetricStatusFluent.MetricNested<A> withNewMetric();
  public V2PodsMetricStatusFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item);
  public V2PodsMetricStatusFluent.MetricNested<A> editMetric();
  public V2PodsMetricStatusFluent.MetricNested<A> editOrNewMetric();
  public V2PodsMetricStatusFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item);
  public interface CurrentNested<N> extends Nested<N>,V2MetricValueStatusFluent<V2PodsMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  public interface MetricNested<N> extends Nested<N>,V2MetricIdentifierFluent<V2PodsMetricStatusFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  
}