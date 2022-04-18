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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1PodSecurityPolicyFluentImpl<A extends V1beta1PodSecurityPolicyFluent<A>>
    extends BaseFluent<A> implements V1beta1PodSecurityPolicyFluent<A> {
  public V1beta1PodSecurityPolicyFluentImpl() {}

  public V1beta1PodSecurityPolicyFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicy instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());
  }

  private String apiVersion;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;
  private V1beta1PodSecurityPolicySpecBuilder spec;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
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

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1beta1PodSecurityPolicyFluent.MetadataNested<A> withNewMetadata() {
    return new V1beta1PodSecurityPolicyFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1beta1PodSecurityPolicyFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta1PodSecurityPolicySpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public V1beta1PodSecurityPolicyFluent.SpecNested<A> withNewSpec() {
    return new V1beta1PodSecurityPolicyFluentImpl.SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A>
      withNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec item) {
    return new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluentImpl
        .SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A>
      editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A>
      editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<A>
      editOrNewSpecLike(io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PodSecurityPolicyFluentImpl that = (V1beta1PodSecurityPolicyFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, spec, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (spec != null) {
      sb.append("spec:");
      sb.append(spec);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1beta1PodSecurityPolicyFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.MetadataNested<
              N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicyFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N>
      extends V1beta1PodSecurityPolicySpecFluentImpl<V1beta1PodSecurityPolicyFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyFluent.SpecNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(V1beta1PodSecurityPolicySpec item) {
      this.builder = new V1beta1PodSecurityPolicySpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecBuilder builder;

    public N and() {
      return (N) V1beta1PodSecurityPolicyFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }
}
