/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1NetworkPolicyPeerFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent<A> {
  public V1NetworkPolicyPeerFluentImpl() {}

  public V1NetworkPolicyPeerFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeer instance) {
    this.withIpBlock(instance.getIpBlock());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withPodSelector(instance.getPodSelector());
  }

  private io.kubernetes.client.openapi.models.V1IPBlockBuilder ipBlock;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder namespaceSelector;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder podSelector;

  /**
   * This method has been deprecated, please use method buildIpBlock instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IPBlock getIpBlock() {
    return this.ipBlock != null ? this.ipBlock.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1IPBlock buildIpBlock() {
    return this.ipBlock != null ? this.ipBlock.build() : null;
  }

  public A withIpBlock(io.kubernetes.client.openapi.models.V1IPBlock ipBlock) {
    _visitables.get("ipBlock").remove(this.ipBlock);
    if (ipBlock != null) {
      this.ipBlock = new io.kubernetes.client.openapi.models.V1IPBlockBuilder(ipBlock);
      _visitables.get("ipBlock").add(this.ipBlock);
    }
    return (A) this;
  }

  public java.lang.Boolean hasIpBlock() {
    return this.ipBlock != null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A>
      withNewIpBlock() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl
        .IpBlockNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A>
      withNewIpBlockLike(io.kubernetes.client.openapi.models.V1IPBlock item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl.IpBlockNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A>
      editIpBlock() {
    return withNewIpBlockLike(getIpBlock());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A>
      editOrNewIpBlock() {
    return withNewIpBlockLike(
        getIpBlock() != null
            ? getIpBlock()
            : new io.kubernetes.client.openapi.models.V1IPBlockBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<A>
      editOrNewIpBlockLike(io.kubernetes.client.openapi.models.V1IPBlock item) {
    return withNewIpBlockLike(getIpBlock() != null ? getIpBlock() : item);
  }

  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }

  public A withNamespaceSelector(
      io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector) {
    _visitables.get("namespaceSelector").remove(this.namespaceSelector);
    if (namespaceSelector != null) {
      this.namespaceSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(namespaceSelector);
      _visitables.get("namespaceSelector").add(this.namespaceSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelector() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl
        .NamespaceSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl
        .NamespaceSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A>
      editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null
            ? getNamespaceSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null ? getNamespaceSelector() : item);
  }

  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildPodSelector() {
    return this.podSelector != null ? this.podSelector.build() : null;
  }

  public A withPodSelector(io.kubernetes.client.openapi.models.V1LabelSelector podSelector) {
    _visitables.get("podSelector").remove(this.podSelector);
    if (podSelector != null) {
      this.podSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(podSelector);
      _visitables.get("podSelector").add(this.podSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPodSelector() {
    return this.podSelector != null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A>
      withNewPodSelector() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl
        .PodSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A>
      withNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl
        .PodSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A>
      editPodSelector() {
    return withNewPodSelectorLike(getPodSelector());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A>
      editOrNewPodSelector() {
    return withNewPodSelectorLike(
        getPodSelector() != null
            ? getPodSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<A>
      editOrNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyPeerFluentImpl that = (V1NetworkPolicyPeerFluentImpl) o;
    if (ipBlock != null ? !ipBlock.equals(that.ipBlock) : that.ipBlock != null) return false;
    if (namespaceSelector != null
        ? !namespaceSelector.equals(that.namespaceSelector)
        : that.namespaceSelector != null) return false;
    if (podSelector != null ? !podSelector.equals(that.podSelector) : that.podSelector != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ipBlock, namespaceSelector, podSelector, super.hashCode());
  }

  public class IpBlockNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IPBlockFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.IpBlockNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    IpBlockNestedImpl(io.kubernetes.client.openapi.models.V1IPBlock item) {
      this.builder = new io.kubernetes.client.openapi.models.V1IPBlockBuilder(this, item);
    }

    IpBlockNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1IPBlockBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IPBlockBuilder builder;

    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withIpBlock(builder.build());
    }

    public N endIpBlock() {
      return and();
    }
  }

  public class NamespaceSelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.NamespaceSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent
                  .NamespaceSelectorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NamespaceSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    NamespaceSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withNamespaceSelector(builder.build());
    }

    public N endNamespaceSelector() {
      return and();
    }
  }

  public class PodSelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluent.PodSelectorNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PodSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    PodSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1NetworkPolicyPeerFluentImpl.this.withPodSelector(builder.build());
    }

    public N endPodSelector() {
      return and();
    }
  }
}
