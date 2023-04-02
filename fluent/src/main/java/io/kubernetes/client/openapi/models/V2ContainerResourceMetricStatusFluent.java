package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2ContainerResourceMetricStatusFluent<A extends V2ContainerResourceMetricStatusFluent<A>> extends Fluent<A>{
  public String getContainer();
  public A withContainer(String container);
  public Boolean hasContainer();
  
  /**
   * This method has been deprecated, please use method buildCurrent instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();
  public V2MetricValueStatus buildCurrent();
  public A withCurrent(V2MetricValueStatus current);
  public Boolean hasCurrent();
  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();
  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item);
  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editCurrent();
  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent();
  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(V2MetricValueStatus item);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public interface CurrentNested<N> extends Nested<N>,V2MetricValueStatusFluent<V2ContainerResourceMetricStatusFluent.CurrentNested<N>>{
    public N and();
    public N endCurrent();
    
  }
  
}