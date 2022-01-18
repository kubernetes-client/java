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
public class V1beta1RuntimeClassFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent<A> {
  public V1beta1RuntimeClassFluentImpl() {}

  public V1beta1RuntimeClassFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1RuntimeClass instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withHandler(instance.getHandler());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withOverhead(instance.getOverhead());

    this.withScheduling(instance.getScheduling());
  }

  private java.lang.String apiVersion;
  private java.lang.String handler;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1beta1OverheadBuilder overhead;
  private io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder scheduling;

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

  public java.lang.String getHandler() {
    return this.handler;
  }

  public A withHandler(java.lang.String handler) {
    this.handler = handler;
    return (A) this;
  }

  public java.lang.Boolean hasHandler() {
    return this.handler != null;
  }

  /** Method is deprecated. use withHandler instead. */
  @java.lang.Deprecated
  public A withNewHandler(java.lang.String original) {
    return (A) withHandler(new String(original));
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

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl
        .MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl.MetadataNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildOverhead instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1Overhead getOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1Overhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }

  public A withOverhead(io.kubernetes.client.openapi.models.V1beta1Overhead overhead) {
    _visitables.get("overhead").remove(this.overhead);
    if (overhead != null) {
      this.overhead = new io.kubernetes.client.openapi.models.V1beta1OverheadBuilder(overhead);
      _visitables.get("overhead").add(this.overhead);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOverhead() {
    return this.overhead != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A>
      withNewOverhead() {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl
        .OverheadNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A>
      withNewOverheadLike(io.kubernetes.client.openapi.models.V1beta1Overhead item) {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl.OverheadNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A>
      editOverhead() {
    return withNewOverheadLike(getOverhead());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A>
      editOrNewOverhead() {
    return withNewOverheadLike(
        getOverhead() != null
            ? getOverhead()
            : new io.kubernetes.client.openapi.models.V1beta1OverheadBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<A>
      editOrNewOverheadLike(io.kubernetes.client.openapi.models.V1beta1Overhead item) {
    return withNewOverheadLike(getOverhead() != null ? getOverhead() : item);
  }

  /**
   * This method has been deprecated, please use method buildScheduling instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1Scheduling getScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1Scheduling buildScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }

  public A withScheduling(io.kubernetes.client.openapi.models.V1beta1Scheduling scheduling) {
    _visitables.get("scheduling").remove(this.scheduling);
    if (scheduling != null) {
      this.scheduling =
          new io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder(scheduling);
      _visitables.get("scheduling").add(this.scheduling);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScheduling() {
    return this.scheduling != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A>
      withNewScheduling() {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl
        .SchedulingNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A>
      withNewSchedulingLike(io.kubernetes.client.openapi.models.V1beta1Scheduling item) {
    return new io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluentImpl
        .SchedulingNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A>
      editScheduling() {
    return withNewSchedulingLike(getScheduling());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A>
      editOrNewScheduling() {
    return withNewSchedulingLike(
        getScheduling() != null
            ? getScheduling()
            : new io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<A>
      editOrNewSchedulingLike(io.kubernetes.client.openapi.models.V1beta1Scheduling item) {
    return withNewSchedulingLike(getScheduling() != null ? getScheduling() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1RuntimeClassFluentImpl that = (V1beta1RuntimeClassFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (handler != null ? !handler.equals(that.handler) : that.handler != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (overhead != null ? !overhead.equals(that.overhead) : that.overhead != null) return false;
    if (scheduling != null ? !scheduling.equals(that.scheduling) : that.scheduling != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, handler, kind, metadata, overhead, scheduling, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1beta1RuntimeClassFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class OverheadNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1OverheadFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.OverheadNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    OverheadNestedImpl(io.kubernetes.client.openapi.models.V1beta1Overhead item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1OverheadBuilder(this, item);
    }

    OverheadNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1OverheadBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1OverheadBuilder builder;

    public N and() {
      return (N) V1beta1RuntimeClassFluentImpl.this.withOverhead(builder.build());
    }

    public N endOverhead() {
      return and();
    }
  }

  public class SchedulingNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1SchedulingFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1RuntimeClassFluent.SchedulingNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SchedulingNestedImpl(io.kubernetes.client.openapi.models.V1beta1Scheduling item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder(this, item);
    }

    SchedulingNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder builder;

    public N and() {
      return (N) V1beta1RuntimeClassFluentImpl.this.withScheduling(builder.build());
    }

    public N endScheduling() {
      return and();
    }
  }
}
