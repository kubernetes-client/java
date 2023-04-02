package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressServiceBackendFluent<A extends V1IngressServiceBackendFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildPort instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceBackendPort getPort();
  public V1ServiceBackendPort buildPort();
  public A withPort(V1ServiceBackendPort port);
  public Boolean hasPort();
  public V1IngressServiceBackendFluent.PortNested<A> withNewPort();
  public V1IngressServiceBackendFluent.PortNested<A> withNewPortLike(V1ServiceBackendPort item);
  public V1IngressServiceBackendFluent.PortNested<A> editPort();
  public V1IngressServiceBackendFluent.PortNested<A> editOrNewPort();
  public V1IngressServiceBackendFluent.PortNested<A> editOrNewPortLike(V1ServiceBackendPort item);
  public interface PortNested<N> extends Nested<N>,V1ServiceBackendPortFluent<V1IngressServiceBackendFluent.PortNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}