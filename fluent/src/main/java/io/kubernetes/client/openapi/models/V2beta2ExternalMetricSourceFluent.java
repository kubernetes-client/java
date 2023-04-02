package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2ExternalMetricSourceFluent<A extends V2beta2ExternalMetricSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricIdentifier getMetric();
  public V2beta2MetricIdentifier buildMetric();
  public A withMetric(V2beta2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetric();
  public V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetricLike(V2beta2MetricIdentifier item);
  public V2beta2ExternalMetricSourceFluent.MetricNested<A> editMetric();
  public V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetric();
  public V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetricLike(V2beta2MetricIdentifier item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricTarget getTarget();
  public V2beta2MetricTarget buildTarget();
  public A withTarget(V2beta2MetricTarget target);
  public Boolean hasTarget();
  public V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTarget();
  public V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTargetLike(V2beta2MetricTarget item);
  public V2beta2ExternalMetricSourceFluent.TargetNested<A> editTarget();
  public V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2beta2MetricTarget item);
  public interface MetricNested<N> extends Nested<N>,V2beta2MetricIdentifierFluent<V2beta2ExternalMetricSourceFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface TargetNested<N> extends Nested<N>,V2beta2MetricTargetFluent<V2beta2ExternalMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}