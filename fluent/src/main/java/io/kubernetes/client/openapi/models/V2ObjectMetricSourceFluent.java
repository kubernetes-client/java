package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ObjectMetricSourceFluent<A extends V2ObjectMetricSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getDescribedObject();
  public V2CrossVersionObjectReference buildDescribedObject();
  public A withDescribedObject(V2CrossVersionObjectReference describedObject);
  public Boolean hasDescribedObject();
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObject();
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObjectLike(V2CrossVersionObjectReference item);
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editDescribedObject();
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObject();
  public V2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(V2CrossVersionObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric();
  public V2MetricIdentifier buildMetric();
  public A withMetric(V2MetricIdentifier metric);
  public Boolean hasMetric();
  public V2ObjectMetricSourceFluent.MetricNested<A> withNewMetric();
  public V2ObjectMetricSourceFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item);
  public V2ObjectMetricSourceFluent.MetricNested<A> editMetric();
  public V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetric();
  public V2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item);
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();
  public V2MetricTarget buildTarget();
  public A withTarget(V2MetricTarget target);
  public Boolean hasTarget();
  public V2ObjectMetricSourceFluent.TargetNested<A> withNewTarget();
  public V2ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(V2MetricTarget item);
  public V2ObjectMetricSourceFluent.TargetNested<A> editTarget();
  public V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public V2ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2MetricTarget item);
  public interface DescribedObjectNested<N> extends Nested<N>,V2CrossVersionObjectReferenceFluent<V2ObjectMetricSourceFluent.DescribedObjectNested<N>>{
    public N and();
    public N endDescribedObject();
    
  }
  public interface MetricNested<N> extends Nested<N>,V2MetricIdentifierFluent<V2ObjectMetricSourceFluent.MetricNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface TargetNested<N> extends Nested<N>,V2MetricTargetFluent<V2ObjectMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}