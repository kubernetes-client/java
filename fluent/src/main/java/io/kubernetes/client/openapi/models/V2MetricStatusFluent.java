package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2MetricStatusFluent<A extends V2MetricStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildContainerResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ContainerResourceMetricStatus getContainerResource();
  public V2ContainerResourceMetricStatus buildContainerResource();
  public A withContainerResource(V2ContainerResourceMetricStatus containerResource);
  public Boolean hasContainerResource();
  public V2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource();
  public V2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResourceLike(V2ContainerResourceMetricStatus item);
  public V2MetricStatusFluent.ContainerResourceNested<A> editContainerResource();
  public V2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResource();
  public V2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(V2ContainerResourceMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildExternal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ExternalMetricStatus getExternal();
  public V2ExternalMetricStatus buildExternal();
  public A withExternal(V2ExternalMetricStatus external);
  public Boolean hasExternal();
  public V2MetricStatusFluent.ExternalNested<A> withNewExternal();
  public V2MetricStatusFluent.ExternalNested<A> withNewExternalLike(V2ExternalMetricStatus item);
  public V2MetricStatusFluent.ExternalNested<A> editExternal();
  public V2MetricStatusFluent.ExternalNested<A> editOrNewExternal();
  public V2MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(V2ExternalMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildObject instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ObjectMetricStatus getObject();
  public V2ObjectMetricStatus buildObject();
  public A withObject(V2ObjectMetricStatus _object);
  public Boolean hasObject();
  public V2MetricStatusFluent.ObjectNested<A> withNewObject();
  public V2MetricStatusFluent.ObjectNested<A> withNewObjectLike(V2ObjectMetricStatus item);
  public V2MetricStatusFluent.ObjectNested<A> editObject();
  public V2MetricStatusFluent.ObjectNested<A> editOrNewObject();
  public V2MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(V2ObjectMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildPods instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2PodsMetricStatus getPods();
  public V2PodsMetricStatus buildPods();
  public A withPods(V2PodsMetricStatus pods);
  public Boolean hasPods();
  public V2MetricStatusFluent.PodsNested<A> withNewPods();
  public V2MetricStatusFluent.PodsNested<A> withNewPodsLike(V2PodsMetricStatus item);
  public V2MetricStatusFluent.PodsNested<A> editPods();
  public V2MetricStatusFluent.PodsNested<A> editOrNewPods();
  public V2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(V2PodsMetricStatus item);
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2ResourceMetricStatus getResource();
  public V2ResourceMetricStatus buildResource();
  public A withResource(V2ResourceMetricStatus resource);
  public Boolean hasResource();
  public V2MetricStatusFluent.ResourceNested<A> withNewResource();
  public V2MetricStatusFluent.ResourceNested<A> withNewResourceLike(V2ResourceMetricStatus item);
  public V2MetricStatusFluent.ResourceNested<A> editResource();
  public V2MetricStatusFluent.ResourceNested<A> editOrNewResource();
  public V2MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(V2ResourceMetricStatus item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface ContainerResourceNested<N> extends Nested<N>,V2ContainerResourceMetricStatusFluent<V2MetricStatusFluent.ContainerResourceNested<N>>{
    public N and();
    public N endContainerResource();
    
  }
  public interface ExternalNested<N> extends Nested<N>,V2ExternalMetricStatusFluent<V2MetricStatusFluent.ExternalNested<N>>{
    public N and();
    public N endExternal();
    
  }
  public interface ObjectNested<N> extends Nested<N>,V2ObjectMetricStatusFluent<V2MetricStatusFluent.ObjectNested<N>>{
    public N and();
    public N endObject();
    
  }
  public interface PodsNested<N> extends Nested<N>,V2PodsMetricStatusFluent<V2MetricStatusFluent.PodsNested<N>>{
    public N and();
    public N endPods();
    
  }
  public interface ResourceNested<N> extends Nested<N>,V2ResourceMetricStatusFluent<V2MetricStatusFluent.ResourceNested<N>>{
    public N and();
    public N endResource();
    
  }
  
}