package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NetworkPolicyPeerFluentImpl<A extends V1NetworkPolicyPeerFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyPeerFluent<A>{
  public V1NetworkPolicyPeerFluentImpl() {
  }
  public V1NetworkPolicyPeerFluentImpl(V1NetworkPolicyPeer instance) {
    this.withIpBlock(instance.getIpBlock());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withPodSelector(instance.getPodSelector());

  }
  private V1IPBlockBuilder ipBlock;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder podSelector;
  
  /**
   * This method has been deprecated, please use method buildIpBlock instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IPBlock getIpBlock() {
    return this.ipBlock!=null ?this.ipBlock.build():null;
  }
  public V1IPBlock buildIpBlock() {
    return this.ipBlock!=null ?this.ipBlock.build():null;
  }
  public A withIpBlock(V1IPBlock ipBlock) {
    _visitables.get("ipBlock").remove(this.ipBlock);
    if (ipBlock!=null){ this.ipBlock= new V1IPBlockBuilder(ipBlock); _visitables.get("ipBlock").add(this.ipBlock);} else { this.ipBlock = null; _visitables.get("ipBlock").remove(this.ipBlock); } return (A) this;
  }
  public Boolean hasIpBlock() {
    return this.ipBlock != null;
  }
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlock() {
    return new V1NetworkPolicyPeerFluentImpl.IpBlockNestedImpl();
  }
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> withNewIpBlockLike(V1IPBlock item) {
    return new V1NetworkPolicyPeerFluentImpl.IpBlockNestedImpl(item);
  }
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editIpBlock() {
    return withNewIpBlockLike(getIpBlock());
  }
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlock() {
    return withNewIpBlockLike(getIpBlock() != null ? getIpBlock(): new V1IPBlockBuilder().build());
  }
  public V1NetworkPolicyPeerFluent.IpBlockNested<A> editOrNewIpBlockLike(V1IPBlock item) {
    return withNewIpBlockLike(getIpBlock() != null ? getIpBlock(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    _visitables.get("namespaceSelector").remove(this.namespaceSelector);
    if (namespaceSelector!=null){ this.namespaceSelector= new V1LabelSelectorBuilder(namespaceSelector); _visitables.get("namespaceSelector").add(this.namespaceSelector);} else { this.namespaceSelector = null; _visitables.get("namespaceSelector").remove(this.namespaceSelector); } return (A) this;
  }
  public Boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new V1NetworkPolicyPeerFluentImpl.NamespaceSelectorNestedImpl();
  }
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new V1NetworkPolicyPeerFluentImpl.NamespaceSelectorNestedImpl(item);
  }
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getPodSelector() {
    return this.podSelector!=null ?this.podSelector.build():null;
  }
  public V1LabelSelector buildPodSelector() {
    return this.podSelector!=null ?this.podSelector.build():null;
  }
  public A withPodSelector(V1LabelSelector podSelector) {
    _visitables.get("podSelector").remove(this.podSelector);
    if (podSelector!=null){ this.podSelector= new V1LabelSelectorBuilder(podSelector); _visitables.get("podSelector").add(this.podSelector);} else { this.podSelector = null; _visitables.get("podSelector").remove(this.podSelector); } return (A) this;
  }
  public Boolean hasPodSelector() {
    return this.podSelector != null;
  }
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelector() {
    return new V1NetworkPolicyPeerFluentImpl.PodSelectorNestedImpl();
  }
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item) {
    return new V1NetworkPolicyPeerFluentImpl.PodSelectorNestedImpl(item);
  }
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editPodSelector() {
    return withNewPodSelectorLike(getPodSelector());
  }
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelector() {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1NetworkPolicyPeerFluent.PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item) {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyPeerFluentImpl that = (V1NetworkPolicyPeerFluentImpl) o;
    if (ipBlock != null ? !ipBlock.equals(that.ipBlock) :that.ipBlock != null) return false;
    if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
    if (podSelector != null ? !podSelector.equals(that.podSelector) :that.podSelector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(ipBlock,  namespaceSelector,  podSelector,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ipBlock != null) { sb.append("ipBlock:"); sb.append(ipBlock + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (podSelector != null) { sb.append("podSelector:"); sb.append(podSelector); }
    sb.append("}");
    return sb.toString();
  }
  class IpBlockNestedImpl<N> extends V1IPBlockFluentImpl<V1NetworkPolicyPeerFluent.IpBlockNested<N>> implements V1NetworkPolicyPeerFluent.IpBlockNested<N>,Nested<N>{
    IpBlockNestedImpl(V1IPBlock item) {
      this.builder = new V1IPBlockBuilder(this, item);
    }
    IpBlockNestedImpl() {
      this.builder = new V1IPBlockBuilder(this);
    }
    V1IPBlockBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withIpBlock(builder.build());
    }
    public N endIpBlock() {
      return and();
    }
    
  }
  class NamespaceSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1NetworkPolicyPeerFluent.NamespaceSelectorNested<N>> implements V1NetworkPolicyPeerFluent.NamespaceSelectorNested<N>,Nested<N>{
    NamespaceSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    NamespaceSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  class PodSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1NetworkPolicyPeerFluent.PodSelectorNested<N>> implements V1NetworkPolicyPeerFluent.PodSelectorNested<N>,Nested<N>{
    PodSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    PodSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withPodSelector(builder.build());
    }
    public N endPodSelector() {
      return and();
    }
    
  }
  
}