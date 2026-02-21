package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NetworkPolicyPeerFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<A>> extends BaseFluent<A>{

  private V1IPBlockBuilder ipBlock;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder podSelector;

  public V1NetworkPolicyPeerFluent() {
  }
  
  public V1NetworkPolicyPeerFluent(V1NetworkPolicyPeer instance) {
    this.copyInstance(instance);
  }

  public V1IPBlock buildIpBlock() {
    return this.ipBlock != null ? this.ipBlock.build() : null;
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public V1LabelSelector buildPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }
  
  protected void copyInstance(V1NetworkPolicyPeer instance) {
    instance = instance != null ? instance : new V1NetworkPolicyPeer();
    if (instance != null) {
        this.withIpBlock(instance.getIpBlock());
        this.withNamespaceSelector(instance.getNamespaceSelector());
        this.withPodSelector(instance.getPodSelector());
    }
  }
  
  public IpBlockNested<A> editIpBlock() {
    return this.withNewIpBlockLike(Optional.ofNullable(this.buildIpBlock()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(null));
  }
  
  public IpBlockNested<A> editOrNewIpBlock() {
    return this.withNewIpBlockLike(Optional.ofNullable(this.buildIpBlock()).orElse(new V1IPBlockBuilder().build()));
  }
  
  public IpBlockNested<A> editOrNewIpBlockLike(V1IPBlock item) {
    return this.withNewIpBlockLike(Optional.ofNullable(this.buildIpBlock()).orElse(item));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(item));
  }
  
  public PodSelectorNested<A> editOrNewPodSelector() {
    return this.withNewPodSelectorLike(Optional.ofNullable(this.buildPodSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public PodSelectorNested<A> editOrNewPodSelectorLike(V1LabelSelector item) {
    return this.withNewPodSelectorLike(Optional.ofNullable(this.buildPodSelector()).orElse(item));
  }
  
  public PodSelectorNested<A> editPodSelector() {
    return this.withNewPodSelectorLike(Optional.ofNullable(this.buildPodSelector()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1NetworkPolicyPeerFluent that = (V1NetworkPolicyPeerFluent) o;
    if (!(Objects.equals(ipBlock, that.ipBlock))) {
      return false;
    }
    if (!(Objects.equals(namespaceSelector, that.namespaceSelector))) {
      return false;
    }
    if (!(Objects.equals(podSelector, that.podSelector))) {
      return false;
    }
    return true;
  }
  
  public boolean hasIpBlock() {
    return this.ipBlock != null;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public boolean hasPodSelector() {
    return this.podSelector != null;
  }
  
  public int hashCode() {
    return Objects.hash(ipBlock, namespaceSelector, podSelector);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(ipBlock == null)) {
        sb.append("ipBlock:");
        sb.append(ipBlock);
        sb.append(",");
    }
    if (!(namespaceSelector == null)) {
        sb.append("namespaceSelector:");
        sb.append(namespaceSelector);
        sb.append(",");
    }
    if (!(podSelector == null)) {
        sb.append("podSelector:");
        sb.append(podSelector);
    }
    sb.append("}");
    return sb.toString();
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
  
  public IpBlockNested<A> withNewIpBlock() {
    return new IpBlockNested(null);
  }
  
  public IpBlockNested<A> withNewIpBlockLike(V1IPBlock item) {
    return new IpBlockNested(item);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public PodSelectorNested<A> withNewPodSelector() {
    return new PodSelectorNested(null);
  }
  
  public PodSelectorNested<A> withNewPodSelectorLike(V1LabelSelector item) {
    return new PodSelectorNested(item);
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
  public class IpBlockNested<N> extends V1IPBlockFluent<IpBlockNested<N>> implements Nested<N>{
  
    V1IPBlockBuilder builder;
  
    IpBlockNested(V1IPBlock item) {
      this.builder = new V1IPBlockBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withIpBlock(builder.build());
    }
    
    public N endIpBlock() {
      return and();
    }
    
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  public class PodSelectorNested<N> extends V1LabelSelectorFluent<PodSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    PodSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NetworkPolicyPeerFluent.this.withPodSelector(builder.build());
    }
    
    public N endPodSelector() {
      return and();
    }
    
  }
}