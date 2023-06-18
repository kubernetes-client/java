package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressLoadBalancerIngressFluent<A extends V1IngressLoadBalancerIngressFluent<A>> extends Fluent<A>{
  public String getHostname();
  public A withHostname(String hostname);
  public Boolean hasHostname();
  public String getIp();
  public A withIp(String ip);
  public Boolean hasIp();
  public A addToPorts(int index,V1IngressPortStatus item);
  public A setToPorts(int index,V1IngressPortStatus item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... items);
  public A addAllToPorts(Collection<V1IngressPortStatus> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... items);
  public A removeAllFromPorts(Collection<V1IngressPortStatus> items);
  public A removeMatchingFromPorts(Predicate<V1IngressPortStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressPortStatus> getPorts();
  public List<V1IngressPortStatus> buildPorts();
  public V1IngressPortStatus buildPort(int index);
  public V1IngressPortStatus buildFirstPort();
  public V1IngressPortStatus buildLastPort();
  public V1IngressPortStatus buildMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate);
  public A withPorts(List<V1IngressPortStatus> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... ports);
  public Boolean hasPorts();
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> addNewPort();
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> addNewPortLike(V1IngressPortStatus item);
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> setNewPortLike(int index,V1IngressPortStatus item);
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> editPort(int index);
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> editFirstPort();
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> editLastPort();
  public V1IngressLoadBalancerIngressFluent.PortsNested<A> editMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate);
  public interface PortsNested<N> extends Nested<N>,V1IngressPortStatusFluent<V1IngressLoadBalancerIngressFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}