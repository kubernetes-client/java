package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2MetricStatusFluent<A extends V2beta2MetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ContainerResourceMetricStatus getContainerResource();
  public V2beta2ContainerResourceMetricStatus buildContainerResource();
  public A withContainerResource(V2beta2ContainerResourceMetricStatus containerResource);
  public Boolean hasContainerResource();
  public V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource();
  public V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2beta2ContainerResourceMetricStatus item);
  public V2beta2MetricStatusFluent.ContainerResourceNested<A> editContainerResource();
  public V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResource();
  public V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2beta2ContainerResourceMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ExternalMetricStatus getExternal();
  public V2beta2ExternalMetricStatus buildExternal();
  public A withExternal(V2beta2ExternalMetricStatus external);
  public Boolean hasExternal();
  public V2beta2MetricStatusFluent.ExternalNested<A> withNewExternal();
  public V2beta2MetricStatusFluent.ExternalNested<A> withNewExternalLike(V2beta2ExternalMetricStatus item);
  public V2beta2MetricStatusFluent.ExternalNested<A> editExternal();
  public V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternal();
  public V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(V2beta2ExternalMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ObjectMetricStatus getObject();
  public V2beta2ObjectMetricStatus buildObject();
  public A withObject(V2beta2ObjectMetricStatus _object);
  public Boolean hasObject();
  public V2beta2MetricStatusFluent.ObjectNested<A> withNewObject();
  public V2beta2MetricStatusFluent.ObjectNested<A> withNewObjectLike(V2beta2ObjectMetricStatus item);
  public V2beta2MetricStatusFluent.ObjectNested<A> editObject();
  public V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObject();
  public V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(V2beta2ObjectMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2PodsMetricStatus getPods();
  public V2beta2PodsMetricStatus buildPods();
  public A withPods(V2beta2PodsMetricStatus pods);
  public Boolean hasPods();
  public V2beta2MetricStatusFluent.PodsNested<A> withNewPods();
  public V2beta2MetricStatusFluent.PodsNested<A> withNewPodsLike(V2beta2PodsMetricStatus item);
  public V2beta2MetricStatusFluent.PodsNested<A> editPods();
  public V2beta2MetricStatusFluent.PodsNested<A> editOrNewPods();
  public V2beta2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(V2beta2PodsMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2ResourceMetricStatus getResource();
  public V2beta2ResourceMetricStatus buildResource();
  public A withResource(V2beta2ResourceMetricStatus resource);
  public Boolean hasResource();
  public V2beta2MetricStatusFluent.ResourceNested<A> withNewResource();
  public V2beta2MetricStatusFluent.ResourceNested<A> withNewResourceLike(V2beta2ResourceMetricStatus item);
  public V2beta2MetricStatusFluent.ResourceNested<A> editResource();
  public V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResource();
  public V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(V2beta2ResourceMetricStatus item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface ContainerResourceNested<N> extends Nested<N>,V2beta2ContainerResourceMetricStatusFluent<V2beta2MetricStatusFluent.ContainerResourceNested<N>>{
    public N and();
    public N endContainerResource();
    
  }
  public interface ExternalNested<N> extends Nested<N>,V2beta2ExternalMetricStatusFluent<V2beta2MetricStatusFluent.ExternalNested<N>>{
    public N and();
    public N endExternal();
    
  }
  public interface ObjectNested<N> extends Nested<N>,V2beta2ObjectMetricStatusFluent<V2beta2MetricStatusFluent.ObjectNested<N>>{
    public N and();
    public N endObject();
    
  }
  public interface PodsNested<N> extends Nested<N>,V2beta2PodsMetricStatusFluent<V2beta2MetricStatusFluent.PodsNested<N>>{
    public N and();
    public N endPods();
    
  }
  public interface ResourceNested<N> extends Nested<N>,V2beta2ResourceMetricStatusFluent<V2beta2MetricStatusFluent.ResourceNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}