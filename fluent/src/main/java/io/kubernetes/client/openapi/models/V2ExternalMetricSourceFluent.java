package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ExternalMetricSourceFluent<A extends V2ExternalMetricSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric();
  public V2MetricIdentifier buildMetric();
  public A withMetric(V2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2ExternalMetricSourceFluent.MetricNested<A> withNewMetric();
  public V2ExternalMetricSourceFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item);
  public V2ExternalMetricSourceFluent.MetricNested<A> editMetric();
  public V2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetric();
  public V2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();
  public V2MetricTarget buildTarget();
  public A withTarget(V2MetricTarget target);
  public Boolean hasTarget();
  public V2ExternalMetricSourceFluent.TargetNested<A> withNewTarget();
  public V2ExternalMetricSourceFluent.TargetNested<A> withNewTargetLike(V2MetricTarget item);
  public V2ExternalMetricSourceFluent.TargetNested<A> editTarget();
  public V2ExternalMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public V2ExternalMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2MetricTarget item);
  public interface MetricNested<N> extends Nested<N>,V2MetricIdentifierFluent<V2ExternalMetricSourceFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface TargetNested<N> extends Nested<N>,V2MetricTargetFluent<V2ExternalMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}