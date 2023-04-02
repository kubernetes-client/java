package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressBackendFluent<A extends V1IngressBackendFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getResource();
  public V1TypedLocalObjectReference buildResource();
  public A withResource(V1TypedLocalObjectReference resource);
  public Boolean hasResource();
  public V1IngressBackendFluent.ResourceNested<A> withNewResource();
  public V1IngressBackendFluent.ResourceNested<A> withNewResourceLike(V1TypedLocalObjectReference item);
  public V1IngressBackendFluent.ResourceNested<A> editResource();
  public V1IngressBackendFluent.ResourceNested<A> editOrNewResource();
  public V1IngressBackendFluent.ResourceNested<A> editOrNewResourceLike(V1TypedLocalObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressServiceBackend getService();
  public V1IngressServiceBackend buildService();
  public A withService(V1IngressServiceBackend service);
  public Boolean hasService();
  public V1IngressBackendFluent.ServiceNested<A> withNewService();
  public V1IngressBackendFluent.ServiceNested<A> withNewServiceLike(V1IngressServiceBackend item);
  public V1IngressBackendFluent.ServiceNested<A> editService();
  public V1IngressBackendFluent.ServiceNested<A> editOrNewService();
  public V1IngressBackendFluent.ServiceNested<A> editOrNewServiceLike(V1IngressServiceBackend item);
  public interface ResourceNested<N> extends Nested<N>,V1TypedLocalObjectReferenceFluent<V1IngressBackendFluent.ResourceNested<N>>{
    public N and();
    public N endResource();
    
  }
  public interface ServiceNested<N> extends Nested<N>,V1IngressServiceBackendFluent<V1IngressBackendFluent.ServiceNested<N>>{
    public N and();
    public N endService();
    
  }
  
}