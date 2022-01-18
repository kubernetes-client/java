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
public class V1ResourceQuotaFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ResourceQuotaFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ResourceQuotaFluent<A> {
  public V1ResourceQuotaFluentImpl() {}

  public V1ResourceQuotaFluentImpl(io.kubernetes.client.openapi.models.V1ResourceQuota instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder spec;
  private io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder status;

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

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.MetadataNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1ResourceQuotaSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<A> withNewSpec() {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec item) {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<A> editOrNewSpecLike(
      io.kubernetes.client.openapi.models.V1ResourceQuotaSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceQuotaStatus getStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public A withStatus(io.kubernetes.client.openapi.models.V1ResourceQuotaStatus status) {
    _visitables.get("status").remove(this.status);
    if (status != null) {
      this.status = new io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder(status);
      _visitables.get("status").add(this.status);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<A> withNewStatus() {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.StatusNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<A>
      withNewStatusLike(io.kubernetes.client.openapi.models.V1ResourceQuotaStatus item) {
    return new io.kubernetes.client.openapi.models.V1ResourceQuotaFluentImpl.StatusNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<A>
      editOrNewStatus() {
    return withNewStatusLike(
        getStatus() != null
            ? getStatus()
            : new io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<A>
      editOrNewStatusLike(io.kubernetes.client.openapi.models.V1ResourceQuotaStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceQuotaFluentImpl that = (V1ResourceQuotaFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, spec, status, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ResourceQuotaFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class SpecNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluentImpl<
          io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.SpecNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(io.kubernetes.client.openapi.models.V1ResourceQuotaSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceQuotaSpecBuilder builder;

    public N and() {
      return (N) V1ResourceQuotaFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }

  public class StatusNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceQuotaStatusFluentImpl<
          io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<N>>
      implements io.kubernetes.client.openapi.models.V1ResourceQuotaFluent.StatusNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StatusNestedImpl(io.kubernetes.client.openapi.models.V1ResourceQuotaStatus item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder(this, item);
    }

    StatusNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceQuotaStatusBuilder builder;

    public N and() {
      return (N) V1ResourceQuotaFluentImpl.this.withStatus(builder.build());
    }

    public N endStatus() {
      return and();
    }
  }
}
