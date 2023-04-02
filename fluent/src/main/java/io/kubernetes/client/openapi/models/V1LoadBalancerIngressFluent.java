package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LoadBalancerIngressFluent<A extends V1LoadBalancerIngressFluent<A>> extends Fluent<A>{
  public String getHostname();
  public A withHostname(String hostname);
  public Boolean hasHostname();
  public String getIp();
  public A withIp(String ip);
  public Boolean hasIp();
  public A addToPorts(Integer index,V1PortStatus item);
  public A setToPorts(Integer index,V1PortStatus item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);
  public A addAllToPorts(Collection<V1PortStatus> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items);
  public A removeAllFromPorts(Collection<V1PortStatus> items);
  public A removeMatchingFromPorts(Predicate<V1PortStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PortStatus> getPorts();
  public List<V1PortStatus> buildPorts();
  public V1PortStatus buildPort(Integer index);
  public V1PortStatus buildFirstPort();
  public V1PortStatus buildLastPort();
  public V1PortStatus buildMatchingPort(Predicate<V1PortStatusBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<V1PortStatusBuilder> predicate);
  public A withPorts(List<V1PortStatus> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports);
  public Boolean hasPorts();
  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPort();
  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPortLike(V1PortStatus item);
  public V1LoadBalancerIngressFluent.PortsNested<A> setNewPortLike(Integer index,V1PortStatus item);
  public V1LoadBalancerIngressFluent.PortsNested<A> editPort(Integer index);
  public V1LoadBalancerIngressFluent.PortsNested<A> editFirstPort();
  public V1LoadBalancerIngressFluent.PortsNested<A> editLastPort();
  public V1LoadBalancerIngressFluent.PortsNested<A> editMatchingPort(Predicate<V1PortStatusBuilder> predicate);
  public interface PortsNested<N> extends Nested<N>,V1PortStatusFluent<V1LoadBalancerIngressFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}