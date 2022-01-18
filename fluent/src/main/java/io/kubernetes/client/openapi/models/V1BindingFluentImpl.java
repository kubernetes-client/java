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
public class V1BindingFluentImpl<A extends io.kubernetes.client.openapi.models.V1BindingFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1BindingFluent<A> {
  public V1BindingFluentImpl() {}

  public V1BindingFluentImpl(io.kubernetes.client.openapi.models.V1Binding instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withTarget(instance.getTarget());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder target;

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

  public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1BindingFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1BindingFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public A withTarget(io.kubernetes.client.openapi.models.V1ObjectReference target) {
    _visitables.get("target").remove(this.target);
    if (target != null) {
      this.target = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(target);
      _visitables.get("target").add(this.target);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> withNewTarget() {
    return new io.kubernetes.client.openapi.models.V1BindingFluentImpl.TargetNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> withNewTargetLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1BindingFluentImpl.TargetNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null
            ? getTarget()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<A> editOrNewTargetLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1BindingFluentImpl that = (V1BindingFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, target, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1BindingFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1BindingFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class TargetNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<N>>
      implements io.kubernetes.client.openapi.models.V1BindingFluent.TargetNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TargetNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) V1BindingFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
