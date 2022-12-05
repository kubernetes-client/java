package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ContainerResourceMetricSourceFluent<A extends V2ContainerResourceMetricSourceFluent<A>> extends Fluent<A>{
  public String getContainer();
  public A withContainer(String container);
  public Boolean hasContainer();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();
  public V2MetricTarget buildTarget();
  public A withTarget(V2MetricTarget target);
  public Boolean hasTarget();
  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget();
  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(V2MetricTarget item);
  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget();
  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();
  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(V2MetricTarget item);
  public interface TargetNested<N> extends Nested<N>,V2MetricTargetFluent<V2ContainerResourceMetricSourceFluent.TargetNested<N>>{
    public N and();
    public N endTarget();
    
  }
  
}