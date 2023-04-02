package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SessionAffinityConfigFluent<A extends V1SessionAffinityConfigFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildClientIP instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ClientIPConfig getClientIP();
  public V1ClientIPConfig buildClientIP();
  public A withClientIP(V1ClientIPConfig clientIP);
  public Boolean hasClientIP();
  public V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIP();
  public V1SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIPLike(V1ClientIPConfig item);
  public V1SessionAffinityConfigFluent.ClientIPNested<A> editClientIP();
  public V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIP();
  public V1SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIPLike(V1ClientIPConfig item);
  public interface ClientIPNested<N> extends Nested<N>,V1ClientIPConfigFluent<V1SessionAffinityConfigFluent.ClientIPNested<N>>{
    public N and();
    public N endClientIP();
    
  }
  
}