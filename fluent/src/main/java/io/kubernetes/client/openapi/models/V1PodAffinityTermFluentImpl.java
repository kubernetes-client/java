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
public class V1PodAffinityTermFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<A> {
  public V1PodAffinityTermFluentImpl() {}

  public V1PodAffinityTermFluentImpl(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm instance) {
    this.withLabelSelector(instance.getLabelSelector());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withNamespaces(instance.getNamespaces());

    this.withTopologyKey(instance.getTopologyKey());
  }

  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder labelSelector;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder namespaceSelector;
  private java.util.List<java.lang.String> namespaces;
  private java.lang.String topologyKey;

  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }

  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector) {
    _visitables.get("labelSelector").remove(this.labelSelector);
    if (labelSelector != null) {
      this.labelSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(labelSelector);
      _visitables.get("labelSelector").add(this.labelSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLabelSelector() {
    return this.labelSelector != null;
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      withNewLabelSelector() {
    return new io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl
        .LabelSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl
        .LabelSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector());
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editOrNewLabelSelector() {
    return withNewLabelSelectorLike(
        getLabelSelector() != null
            ? getLabelSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<A>
      editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector() : item);
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

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelector() {
    return new io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl
        .NamespaceSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl
        .NamespaceSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null
            ? getNamespaceSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null ? getNamespaceSelector() : item);
  }

  public A addToNamespaces(java.lang.Integer index, java.lang.String item) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    this.namespaces.add(index, item);
    return (A) this;
  }

  public A setToNamespaces(java.lang.Integer index, java.lang.String item) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    this.namespaces.set(index, item);
    return (A) this;
  }

  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }

  public A addAllToNamespaces(java.util.Collection<java.lang.String> items) {
    if (this.namespaces == null) {
      this.namespaces = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }

  public A removeFromNamespaces(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.namespaces != null) {
        this.namespaces.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromNamespaces(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.namespaces != null) {
        this.namespaces.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getNamespaces() {
    return this.namespaces;
  }

  public java.lang.String getNamespace(java.lang.Integer index) {
    return this.namespaces.get(index);
  }

  public java.lang.String getFirstNamespace() {
    return this.namespaces.get(0);
  }

  public java.lang.String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }

  public java.lang.String getMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : namespaces) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNamespace(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : namespaces) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNamespaces(java.util.List<java.lang.String> namespaces) {
    if (namespaces != null) {
      this.namespaces = new java.util.ArrayList();
      for (java.lang.String item : namespaces) {
        this.addToNamespaces(item);
      }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }

  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {
      this.namespaces.clear();
    }
    if (namespaces != null) {
      for (java.lang.String item : namespaces) {
        this.addToNamespaces(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNamespaces() {
    return namespaces != null && !namespaces.isEmpty();
  }

  public A addNewNamespace(java.lang.String original) {
    return (A) addToNamespaces(new String(original));
  }

  public java.lang.String getTopologyKey() {
    return this.topologyKey;
  }

  public A withTopologyKey(java.lang.String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }

  public java.lang.Boolean hasTopologyKey() {
    return this.topologyKey != null;
  }

  /** Method is deprecated. use withTopologyKey instead. */
  @java.lang.Deprecated
  public A withNewTopologyKey(java.lang.String original) {
    return (A) withTopologyKey(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodAffinityTermFluentImpl that = (V1PodAffinityTermFluentImpl) o;
    if (labelSelector != null
        ? !labelSelector.equals(that.labelSelector)
        : that.labelSelector != null) return false;
    if (namespaceSelector != null
        ? !namespaceSelector.equals(that.namespaceSelector)
        : that.namespaceSelector != null) return false;
    if (namespaces != null ? !namespaces.equals(that.namespaces) : that.namespaces != null)
      return false;
    if (topologyKey != null ? !topologyKey.equals(that.topologyKey) : that.topologyKey != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        labelSelector, namespaceSelector, namespaces, topologyKey, super.hashCode());
  }

  public class LabelSelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.LabelSelectorNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    LabelSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    LabelSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1PodAffinityTermFluentImpl.this.withLabelSelector(builder.build());
    }

    public N endLabelSelector() {
      return and();
    }
  }

  public class NamespaceSelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1PodAffinityTermFluent.NamespaceSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodAffinityTermFluent
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
      return (N) V1PodAffinityTermFluentImpl.this.withNamespaceSelector(builder.build());
    }

    public N endNamespaceSelector() {
      return and();
    }
  }
}
