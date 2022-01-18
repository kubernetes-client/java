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
public class V1PersistentVolumeClaimTemplateFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<A> {
  public V1PersistentVolumeClaimTemplateFluentImpl() {}

  public V1PersistentVolumeClaimTemplateFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate instance) {
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());
  }

  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder spec;

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluentImpl
        .MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluentImpl
        .MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A>
      withNewSpec() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluentImpl
        .SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A>
      withNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluentImpl
        .SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A>
      editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A>
      editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<A>
      editOrNewSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeClaimTemplateFluentImpl that = (V1PersistentVolumeClaimTemplateFluentImpl) o;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(metadata, spec, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.MetadataNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent
                  .MetadataNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimTemplateFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class SpecNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent
                  .SpecNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeClaimTemplateFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }
}
