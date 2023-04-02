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
public interface V1NetworkPolicyIngressRuleFluent<A extends V1NetworkPolicyIngressRuleFluent<A>> extends Fluent<A>{
  public A addToFrom(Integer index,V1NetworkPolicyPeer item);
  public A setToFrom(Integer index,V1NetworkPolicyPeer item);
  public A addToFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
  public A addAllToFrom(Collection<V1NetworkPolicyPeer> items);
  public A removeFromFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items);
  public A removeAllFromFrom(Collection<V1NetworkPolicyPeer> items);
  public A removeMatchingFromFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyPeer> getFrom();
  public List<V1NetworkPolicyPeer> buildFrom();
  public V1NetworkPolicyPeer buildFrom(Integer index);
  public V1NetworkPolicyPeer buildFirstFrom();
  public V1NetworkPolicyPeer buildLastFrom();
  public V1NetworkPolicyPeer buildMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  public Boolean hasMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate);
  public A withFrom(List<V1NetworkPolicyPeer> from);
  public A withFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... from);
  public Boolean hasFrom();
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom();
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFromLike(V1NetworkPolicyPeer item);
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> setNewFromLike(Integer index,V1NetworkPolicyPeer item);
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editFrom(Integer index);
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editFirstFrom();
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editLastFrom();
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate);
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
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort();
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPortLike(V1NetworkPolicyPort item);
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> setNewPortLike(Integer index,V1NetworkPolicyPort item);
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editPort(Integer index);
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editFirstPort();
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editLastPort();
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate);
  public interface FromNested<N> extends Nested<N>,V1NetworkPolicyPeerFluent<V1NetworkPolicyIngressRuleFluent.FromNested<N>>{
    public N and();
    public N endFrom();
    
  }
  public interface PortsNested<N> extends Nested<N>,V1NetworkPolicyPortFluent<V1NetworkPolicyIngressRuleFluent.PortsNested<N>>{
    public N and();
    public N endPort();
    
  }
  
}