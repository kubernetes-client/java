package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NetworkPolicyPeerFluent<A extends V1NetworkPolicyPeerFluent<A>> extends BaseFluent<A>{
  public V1NetworkPolicyPeerFluent() {
  }
  
  public V1NetworkPolicyPeerFluent(V1NetworkPolicyPeer instance) {
    this.copyInstance(instance);
  }
  private V1IPBlockBuilder ipBlock;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder podSelector;
  
  protected void copyInstance(V1NetworkPolicyPeer instance) {
    instance = (instance != null ? instance : new V1NetworkPolicyPeer());
    if (instance != null) {
          this.withIpBlock(instance.getIpBlock());
          this.withNamespaceSelector(instance.getNamespaceSelector());
          this.withPodSelector(instance.getPodSelector());
        }
  }
  
  public V1IPBlock buildIpBlock() {
    return this.ipBlock != null ? this.ipBlock.build() : null;
  }
  
  public A withIpBlock(V1IPBlock ipBlock) {
    this._visitables.remove("ipBlock");
    if (ipBlock != null) {
        this.ipBlock = new V1IPBlockBuilder(ipBlock);
        this._visitables.get("ipBlock").add(this.ipBlock);
    } else {
        this.ipBlock = null;
        this._visitables.get("ipBlock").remove(this.ipBlock);
    }
    return (A) this;
  }
  
  public boolean hasIpBlock() {
    return this.ipBlock != null;
  }
  
  public IpBlockNested<A> withNewIpBlock() {
    return new IpBlockNested(null);
  }
  
  public IpBlockNested<A> withNewIpBlockLike(V1IPBlock item) {
    return new IpBlockNested(item);
  }
  
  public IpBlockNested<A> editIpBlock() {
    return withNewIpBlockLike(java.util.Optional.ofNullable(buildIpBlock()).orElse(null));
  }
  
  public IpBlockNested<A> editOrNewIpBlock() {
    return withNewIpBlockLike(java.util.Optional.ofNullable(buildIpBlock()).orElse(new V1IPBlockBuilder().build()));
  }
  
  public IpBlockNested<A> editOrNewIpBlockLike(V1IPBlock item) {
    return withNewIpBlockLike(java.util.Optional.ofNullable(buildIpBlock()).orElse(item));
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    this._visitables.remove("namespaceSelector");
    if (namespaceSelector != null) {
        this.namespaceSelector = new V1LabelSelectorBuilder(namespaceSelector);
        this._visitables.get("namespaceSelector").add(this.namespaceSelector);
    } else {
        this.namespaceSelector = null;
        this._visitables.get("namespaceSelector").remove(this.namespaceSelector);
    }
    return (A) this;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(item));
  }
  
  public V1LabelSelector buildPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }
  
  public A withPodSelector(V1LabelSelector podSelector) {
    this._visitables.remove("podSelector");
    if (podSelector != null) {
        this.podSelector = new V1LabelSelectorBuilder(podSelector);
        this._visitables.get("podSelector").add(this.podSelector);
    } else {
        this.podSelector = null;
        this._visitables.get("podSelector").remove(this.podSelector);
    }
    return (A) this;
  }
  
  public boolean hasPodSelector() {
    return this.podSelector != null;
  }
  
  public PodSelectorNested<A> withNewPodSelector() {
    return new PodSelectorNested(null);
  }
  
  public PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item) {
    return new PodSelectorNested(item);
  }
  
  public PodSelectorNested<A> editPodSelector() {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(null));
  }
  
  public PodSelectorNested<A> editOrNewPodSelector() {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item) {
    return withNewPodSelectorLike(java.util.Optional.ofNullable(buildPodSelector()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyPeerFluent that = (V1NetworkPolicyPeerFluent) o;
    if (!java.util.Objects.equals(ipBlock, that.ipBlock)) return false;
    if (!java.util.Objects.equals(namespaceSelector, that.namespaceSelector)) return false;
    if (!java.util.Objects.equals(podSelector, that.podSelector)) return false;
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
  public class IpBlockNested<N> extends V1IPBlockFluent<IpBlockNested<N>> implements Nested<N>{
    IpBlockNested(V1IPBlock item) {
      this.builder = new V1IPBlockBuilder(this, item);
    }
    V1IPBlockBuilder builder;
    
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withIpBlock(builder.build());
    }
    
    public N endIpBlock() {
      return and();
    }
    
  
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  
  }
  public class PodSelectorNested<N> extends V1LabelSelectorFluent<PodSelectorNested<N>> implements Nested<N>{
    PodSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withPodSelector(builder.build());
    }
    
    public N endPodSelector() {
      return and();
    }
    
  
  }

}