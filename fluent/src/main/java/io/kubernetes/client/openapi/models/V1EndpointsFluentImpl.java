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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1EndpointsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1EndpointsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EndpointsFluent<A> {
  public V1EndpointsFluentImpl() {}

  public V1EndpointsFluentImpl(io.kubernetes.client.openapi.models.V1Endpoints instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSubsets(instance.getSubsets());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder> subsets;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1EndpointsFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1EndpointsFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToSubsets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item) {
    if (this.subsets == null) {
      this.subsets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
    _visitables.get("subsets").add(index >= 0 ? index : _visitables.get("subsets").size(), builder);
    this.subsets.add(index >= 0 ? index : subsets.size(), builder);
    return (A) this;
  }

  public A setToSubsets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item) {
    if (this.subsets == null) {
      this.subsets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
    if (index < 0 || index >= _visitables.get("subsets").size()) {
      _visitables.get("subsets").add(builder);
    } else {
      _visitables.get("subsets").set(index, builder);
    }
    if (index < 0 || index >= subsets.size()) {
      subsets.add(builder);
    } else {
      subsets.set(index, builder);
    }
    return (A) this;
  }

  public A addToSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items) {
    if (this.subsets == null) {
      this.subsets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointSubset item : items) {
      io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
      _visitables.get("subsets").add(builder);
      this.subsets.add(builder);
    }
    return (A) this;
  }

  public A addAllToSubsets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSubset> items) {
    if (this.subsets == null) {
      this.subsets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointSubset item : items) {
      io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
      _visitables.get("subsets").add(builder);
      this.subsets.add(builder);
    }
    return (A) this;
  }

  public A removeFromSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... items) {
    for (io.kubernetes.client.openapi.models.V1EndpointSubset item : items) {
      io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
      _visitables.get("subsets").remove(builder);
      if (this.subsets != null) {
        this.subsets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSubsets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointSubset> items) {
    for (io.kubernetes.client.openapi.models.V1EndpointSubset item : items) {
      io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(item);
      _visitables.get("subsets").remove(builder);
      if (this.subsets != null) {
        this.subsets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSubsets(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate) {
    if (subsets == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder> each =
        subsets.iterator();
    final List visitables = _visitables.get("subsets");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSubsets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> getSubsets() {
    return subsets != null ? build(subsets) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> buildSubsets() {
    return subsets != null ? build(subsets) : null;
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildSubset(java.lang.Integer index) {
    return this.subsets.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildFirstSubset() {
    return this.subsets.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildLastSubset() {
    return this.subsets.get(subsets.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubset buildMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder item : subsets) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder item : subsets) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSubsets(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointSubset> subsets) {
    if (this.subsets != null) {
      _visitables.get("subsets").removeAll(this.subsets);
    }
    if (subsets != null) {
      this.subsets = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EndpointSubset item : subsets) {
        this.addToSubsets(item);
      }
    } else {
      this.subsets = null;
    }
    return (A) this;
  }

  public A withSubsets(io.kubernetes.client.openapi.models.V1EndpointSubset... subsets) {
    if (this.subsets != null) {
      this.subsets.clear();
    }
    if (subsets != null) {
      for (io.kubernetes.client.openapi.models.V1EndpointSubset item : subsets) {
        this.addToSubsets(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSubsets() {
    return subsets != null && !subsets.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> addNewSubset() {
    return new io.kubernetes.client.openapi.models.V1EndpointsFluentImpl.SubsetsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> addNewSubsetLike(
      io.kubernetes.client.openapi.models.V1EndpointSubset item) {
    return new io.kubernetes.client.openapi.models.V1EndpointsFluentImpl.SubsetsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> setNewSubsetLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item) {
    return new io.kubernetes.client.openapi.models.V1EndpointsFluentImpl.SubsetsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editSubset(
      java.lang.Integer index) {
    if (subsets.size() <= index)
      throw new RuntimeException("Can't edit subsets. Index exceeds size.");
    return setNewSubsetLike(index, buildSubset(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editFirstSubset() {
    if (subsets.size() == 0)
      throw new RuntimeException("Can't edit first subsets. The list is empty.");
    return setNewSubsetLike(0, buildSubset(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editLastSubset() {
    int index = subsets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last subsets. The list is empty.");
    return setNewSubsetLike(index, buildSubset(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<A> editMatchingSubset(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < subsets.size(); i++) {
      if (predicate.test(subsets.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching subsets. No match found.");
    return setNewSubsetLike(index, buildSubset(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EndpointsFluentImpl that = (V1EndpointsFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (subsets != null ? !subsets.equals(that.subsets) : that.subsets != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, subsets, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointsFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1EndpointsFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class SubsetsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointsFluent.SubsetsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SubsetsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointSubset item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(this, item);
    }

    SubsetsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointsFluentImpl.this.setToSubsets(index, builder.build());
    }

    public N endSubset() {
      return and();
    }
  }
}
