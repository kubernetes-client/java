package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeDaemonEndpointsFluent<A extends V1NodeDaemonEndpointsFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildKubeletEndpoint instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonEndpoint getKubeletEndpoint();
  public V1DaemonEndpoint buildKubeletEndpoint();
  public A withKubeletEndpoint(V1DaemonEndpoint kubeletEndpoint);
  public Boolean hasKubeletEndpoint();
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint();
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(V1DaemonEndpoint item);
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint();
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint();
  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(V1DaemonEndpoint item);
  public interface KubeletEndpointNested<N> extends Nested<N>,V1DaemonEndpointFluent<V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>>{
    public N and();
    public N endKubeletEndpoint();
    
  }
  
}