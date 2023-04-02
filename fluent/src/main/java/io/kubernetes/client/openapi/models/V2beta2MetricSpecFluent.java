package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2MetricSpecFluent<A extends V2beta2MetricSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ContainerResourceMetricSource getContainerResource();
  public V2beta2ContainerResourceMetricSource buildContainerResource();
  public A withContainerResource(V2beta2ContainerResourceMetricSource containerResource);
  public Boolean hasContainerResource();
  public V2beta2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResource();
  public V2beta2MetricSpecFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2beta2ContainerResourceMetricSource item);
  public V2beta2MetricSpecFluent.ContainerResourceNested<A> editContainerResource();
  public V2beta2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResource();
  public V2beta2MetricSpecFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2beta2ContainerResourceMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ExternalMetricSource getExternal();
  public V2beta2ExternalMetricSource buildExternal();
  public A withExternal(V2beta2ExternalMetricSource external);
  public Boolean hasExternal();
  public V2beta2MetricSpecFluent.ExternalNested<A> withNewExternal();
  public V2beta2MetricSpecFluent.ExternalNested<A> withNewExternalLike(V2beta2ExternalMetricSource item);
  public V2beta2MetricSpecFluent.ExternalNested<A> editExternal();
  public V2beta2MetricSpecFluent.ExternalNested<A> editOrNewExternal();
  public V2beta2MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(V2beta2ExternalMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ObjectMetricSource getObject();
  public V2beta2ObjectMetricSource buildObject();
  public A withObject(V2beta2ObjectMetricSource _object);
  public Boolean hasObject();
  public V2beta2MetricSpecFluent.ObjectNested<A> withNewObject();
  public V2beta2MetricSpecFluent.ObjectNested<A> withNewObjectLike(V2beta2ObjectMetricSource item);
  public V2beta2MetricSpecFluent.ObjectNested<A> editObject();
  public V2beta2MetricSpecFluent.ObjectNested<A> editOrNewObject();
  public V2beta2MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(V2beta2ObjectMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2PodsMetricSource getPods();
  public V2beta2PodsMetricSource buildPods();
  public A withPods(V2beta2PodsMetricSource pods);
  public Boolean hasPods();
  public V2beta2MetricSpecFluent.PodsNested<A> withNewPods();
  public V2beta2MetricSpecFluent.PodsNested<A> withNewPodsLike(V2beta2PodsMetricSource item);
  public V2beta2MetricSpecFluent.PodsNested<A> editPods();
  public V2beta2MetricSpecFluent.PodsNested<A> editOrNewPods();
  public V2beta2MetricSpecFluent.PodsNested<A> editOrNewPodsLike(V2beta2PodsMetricSource item);
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ResourceMetricSource getResource();
  public V2beta2ResourceMetricSource buildResource();
  public A withResource(V2beta2ResourceMetricSource resource);
  public Boolean hasResource();
  public V2beta2MetricSpecFluent.ResourceNested<A> withNewResource();
  public V2beta2MetricSpecFluent.ResourceNested<A> withNewResourceLike(V2beta2ResourceMetricSource item);
  public V2beta2MetricSpecFluent.ResourceNested<A> editResource();
  public V2beta2MetricSpecFluent.ResourceNested<A> editOrNewResource();
  public V2beta2MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(V2beta2ResourceMetricSource item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface ContainerResourceNested<N> extends Nested<N>,V2beta2ContainerResourceMetricSourceFluent<V2beta2MetricSpecFluent.ContainerResourceNested<N>>{
    public N and();
    public N endContainerResource();
    
  }
  public interface ExternalNested<N> extends Nested<N>,V2beta2ExternalMetricSourceFluent<V2beta2MetricSpecFluent.ExternalNested<N>>{
    public N and();
    public N endExternal();
    
  }
  public interface ObjectNested<N> extends Nested<N>,V2beta2ObjectMetricSourceFluent<V2beta2MetricSpecFluent.ObjectNested<N>>{
    public N and();
    public N endObject();
    
  }
  public interface PodsNested<N> extends Nested<N>,V2beta2PodsMetricSourceFluent<V2beta2MetricSpecFluent.PodsNested<N>>{
    public N and();
    public N endPods();
    
  }
  public interface ResourceNested<N> extends Nested<N>,V2beta2ResourceMetricSourceFluent<V2beta2MetricSpecFluent.ResourceNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}