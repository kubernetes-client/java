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
public class V1EvictionFluentImpl<A extends io.kubernetes.client.openapi.models.V1EvictionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EvictionFluent<A> {
  public V1EvictionFluentImpl() {}

  public V1EvictionFluentImpl(io.kubernetes.client.openapi.models.V1Eviction instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withDeleteOptions(instance.getDeleteOptions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());
  }

  private java.lang.String apiVersion;
  private io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder deleteOptions;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;

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

  /**
   * This method has been deprecated, please use method buildDeleteOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DeleteOptions getDeleteOptions() {
    return this.deleteOptions != null ? this.deleteOptions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1DeleteOptions buildDeleteOptions() {
    return this.deleteOptions != null ? this.deleteOptions.build() : null;
  }

  public A withDeleteOptions(io.kubernetes.client.openapi.models.V1DeleteOptions deleteOptions) {
    _visitables.get("deleteOptions").remove(this.deleteOptions);
    if (deleteOptions != null) {
      this.deleteOptions =
          new io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder(deleteOptions);
      _visitables.get("deleteOptions").add(this.deleteOptions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDeleteOptions() {
    return this.deleteOptions != null;
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      withNewDeleteOptions() {
    return new io.kubernetes.client.openapi.models.V1EvictionFluentImpl.DeleteOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      withNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item) {
    return new io.kubernetes.client.openapi.models.V1EvictionFluentImpl.DeleteOptionsNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editDeleteOptions() {
    return withNewDeleteOptionsLike(getDeleteOptions());
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editOrNewDeleteOptions() {
    return withNewDeleteOptionsLike(
        getDeleteOptions() != null
            ? getDeleteOptions()
            : new io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<A>
      editOrNewDeleteOptionsLike(io.kubernetes.client.openapi.models.V1DeleteOptions item) {
    return withNewDeleteOptionsLike(getDeleteOptions() != null ? getDeleteOptions() : item);
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

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1EvictionFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1EvictionFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EvictionFluentImpl that = (V1EvictionFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (deleteOptions != null
        ? !deleteOptions.equals(that.deleteOptions)
        : that.deleteOptions != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, deleteOptions, kind, metadata, super.hashCode());
  }

  public class DeleteOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1DeleteOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1EvictionFluent.DeleteOptionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DeleteOptionsNestedImpl(io.kubernetes.client.openapi.models.V1DeleteOptions item) {
      this.builder = new io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder(this, item);
    }

    DeleteOptionsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1DeleteOptionsBuilder builder;

    public N and() {
      return (N) V1EvictionFluentImpl.this.withDeleteOptions(builder.build());
    }

    public N endDeleteOptions() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1EvictionFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1EvictionFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
