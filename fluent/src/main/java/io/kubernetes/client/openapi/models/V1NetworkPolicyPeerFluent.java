package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NetworkPolicyPeerFluent<A extends V1NetworkPolicyPeerFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildIpBlock instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IPBlock getIpBlock();
  public V1IPBlock buildIpBlock();
  public A withIpBlock(V1IPBlock ipBlock);
  public Boolean hasIpBlock();
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlock();
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlockLike(V1IPBlock item);
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editIpBlock();
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlock();
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlockLike(V1IPBlock item);
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector();
  public V1LabelSelector buildNamespaceSelector();
  public A withNamespaceSelector(V1LabelSelector namespaceSelector);
  public Boolean hasNamespaceSelector();
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item);
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editNamespaceSelector();
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getPodSelector();
  public V1LabelSelector buildPodSelector();
  public A withPodSelector(V1LabelSelector podSelector);
  public Boolean hasPodSelector();
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelector();
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item);
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editPodSelector();
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelector();
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item);
  public interface IpBlockNested<N> extends Nested<N>,V1IPBlockFluent<V1NetworkPolicyPeerFluent.IpBlockNested<N>>{
    public N and();
    public N endIpBlock();
    
  }
  public interface NamespaceSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1NetworkPolicyPeerFluent.NamespaceSelectorNested<N>>{
    public N and();
    public N endNamespaceSelector();
    
  }
  public interface PodSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1NetworkPolicyPeerFluent.PodSelectorNested<N>>{
    public N and();
    public N endPodSelector();
    
  }
  
}