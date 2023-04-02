package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricSpecFluent<A extends V2MetricSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ContainerResourceMetricSource getContainerResource();
  public V2ContainerResourceMetricSource buildContainerResource();
  public A withContainerResource(V2ContainerResourceMetricSource containerResource);
  public Boolean hasContainerResource();
  public V2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource();
  public V2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricSource item);
  public V2MetricSpecFluent.ContainerResourceNested<A> editContainerResource();
  public V2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResource();
  public V2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ExternalMetricSource getExternal();
  public V2ExternalMetricSource buildExternal();
  public A withExternal(V2ExternalMetricSource external);
  public Boolean hasExternal();
  public V2MetricSpecFluent.ExternalNested<A> withNewExternal();
  public V2MetricSpecFluent.ExternalNested<A> withNewExternalLike(V2ExternalMetricSource item);
  public V2MetricSpecFluent.ExternalNested<A> editExternal();
  public V2MetricSpecFluent.ExternalNested<A> editOrNewExternal();
  public V2MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(V2ExternalMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ObjectMetricSource getObject();
  public V2ObjectMetricSource buildObject();
  public A withObject(V2ObjectMetricSource _object);
  public Boolean hasObject();
  public V2MetricSpecFluent.ObjectNested<A> withNewObject();
  public V2MetricSpecFluent.ObjectNested<A> withNewObjectLike(V2ObjectMetricSource item);
  public V2MetricSpecFluent.ObjectNested<A> editObject();
  public V2MetricSpecFluent.ObjectNested<A> editOrNewObject();
  public V2MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(V2ObjectMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2PodsMetricSource getPods();
  public V2PodsMetricSource buildPods();
  public A withPods(V2PodsMetricSource pods);
  public Boolean hasPods();
  public V2MetricSpecFluent.PodsNested<A> withNewPods();
  public V2MetricSpecFluent.PodsNested<A> withNewPodsLike(V2PodsMetricSource item);
  public V2MetricSpecFluent.PodsNested<A> editPods();
  public V2MetricSpecFluent.PodsNested<A> editOrNewPods();
  public V2MetricSpecFluent.PodsNested<A> editOrNewPodsLike(V2PodsMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ResourceMetricSource getResource();
  public V2ResourceMetricSource buildResource();
  public A withResource(V2ResourceMetricSource resource);
  public Boolean hasResource();
  public V2MetricSpecFluent.ResourceNested<A> withNewResource();
  public V2MetricSpecFluent.ResourceNested<A> withNewResourceLike(V2ResourceMetricSource item);
  public V2MetricSpecFluent.ResourceNested<A> editResource();
  public V2MetricSpecFluent.ResourceNested<A> editOrNewResource();
  public V2MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(V2ResourceMetricSource item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface ContainerResourceNested<N> extends Nested<N>,V2ContainerResourceMetricSourceFluent<V2MetricSpecFluent.ContainerResourceNested<N>>{
    public N and();
    public N endContainerResource();
    
  }
  public interface ExternalNested<N> extends Nested<N>,V2ExternalMetricSourceFluent<V2MetricSpecFluent.ExternalNested<N>>{
    public N and();
    public N endExternal();
    
  }
  public interface ObjectNested<N> extends Nested<N>,V2ObjectMetricSourceFluent<V2MetricSpecFluent.ObjectNested<N>>{
    public N and();
    public N endObject();
    
  }
  public interface PodsNested<N> extends Nested<N>,V2PodsMetricSourceFluent<V2MetricSpecFluent.PodsNested<N>>{
    public N and();
    public N endPods();
    
  }
  public interface ResourceNested<N> extends Nested<N>,V2ResourceMetricSourceFluent<V2MetricSpecFluent.ResourceNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}