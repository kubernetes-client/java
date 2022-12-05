package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1NetworkPolicyEgressRuleFluent<A extends V1NetworkPolicyEgressRuleFluent<A>> extends Fluent<A>{
  public A addToPorts(Integer index,V1NetworkPolicyPort item);
  public A setToPorts(Integer index,V1NetworkPolicyPort item);
  public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);
  public A addAllToPorts(Collection<V1NetworkPolicyPort> items);
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items);
  public A removeAllFromPorts(Collection<V1NetworkPolicyPort> items);
  public A removeMatchingFromPorts(Predicate<V1NetworkPolicyPortBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyPort> getPorts();
  public List<V1NetworkPolicyPort> buildPorts();
  public V1NetworkPolicyPort buildPort(Integer index);
  public V1NetworkPolicyPort buildFirstPort();
  public V1NetworkPolicyPort buildLastPort();
  public V1NetworkPolicyPort buildMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate);
  public Boolean hasMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate);
  public A withPorts(List<V1NetworkPolicyPort> ports);
  public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports);
  public Boolean hasPorts();
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPort();
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> addNewPortLike(V1NetworkPolicyPort item);
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> setNewPortLike(Integer index,V1NetworkPolicyPort item);
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> editPort(Integer index);
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> editFirstPort();
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> editLastPort();
  public V1NetworkPolicyEgressRuleFluent.PortsNested<A> editMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate);
  public A addToTo(Integer index,V1NetworkPolicyPeer item);
  public A setToTo(Integer index,V1NetworkPolicyPeer item);
  public A addToTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
  public A addAllToTo(Collection<V1NetworkPolicyPeer> items);
  public A removeFromTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
  public A removeAllFromTo(Collection<V1NetworkPolicyPeer> items);
  public A removeMatchingFromTo(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildTo instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyPeer> getTo();
  public List<V1NetworkPolicyPeer> buildTo();
  public V1NetworkPolicyPeer buildTo(Integer index);
  public V1NetworkPolicyPeer buildFirstTo();
  public V1NetworkPolicyPeer buildLastTo();
  public V1NetworkPolicyPeer buildMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  public Boolean hasMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  public A withTo(List<V1NetworkPolicyPeer> to);
  public A withTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... to);
  public Boolean hasTo();
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> addNewTo();
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> addNewToLike(V1NetworkPolicyPeer item);
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> setNewToLike(Integer index,V1NetworkPolicyPeer item);
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> editTo(Integer index);
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> editFirstTo();
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> editLastTo();
  public V1NetworkPolicyEgressRuleFluent.ToNested<A> editMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  public interface PortsNested<N> extends Nested<N>,V1NetworkPolicyPortFluent<V1NetworkPolicyEgressRuleFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  public interface ToNested<N> extends Nested<N>,V1NetworkPolicyPeerFluent<V1NetworkPolicyEgressRuleFluent.ToNested<N>>{
    public N and();
    public N endTo();
    
  }
  
}