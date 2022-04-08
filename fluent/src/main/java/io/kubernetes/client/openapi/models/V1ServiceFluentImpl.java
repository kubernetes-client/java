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
public class V1ServiceFluentImpl<A extends V1ServiceFluent<A>> extends BaseFluent<A>
    implements V1ServiceFluent<A> {
  public V1ServiceFluentImpl() {}

  public V1ServiceFluentImpl(io.kubernetes.client.openapi.models.V1Service instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());
  }

  private String apiVersion;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;
  private V1ServiceSpecBuilder spec;
  private V1ServiceStatusBuilder status;

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

  public V1ServiceFluent.MetadataNested<A> withNewMetadata() {
    return new V1ServiceFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1ServiceFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ServiceSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ServiceSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(io.kubernetes.client.openapi.models.V1ServiceSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new V1ServiceSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }

  public V1ServiceFluent.SpecNested<A> withNewSpec() {
    return new V1ServiceFluentImpl.SpecNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> withNewSpecLike(
      io.kubernetes.client.openapi.models.V1ServiceSpec item) {
    return new io.kubernetes.client.openapi.models.V1ServiceFluentImpl.SpecNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null
            ? getSpec()
            : new io.kubernetes.client.openapi.models.V1ServiceSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<A> editOrNewSpecLike(
      io.kubernetes.client.openapi.models.V1ServiceSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ServiceStatus getStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ServiceStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public A withStatus(io.kubernetes.client.openapi.models.V1ServiceStatus status) {
    _visitables.get("status").remove(this.status);
    if (status != null) {
      this.status = new io.kubernetes.client.openapi.models.V1ServiceStatusBuilder(status);
      _visitables.get("status").add(this.status);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public V1ServiceFluent.StatusNested<A> withNewStatus() {
    return new V1ServiceFluentImpl.StatusNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> withNewStatusLike(
      io.kubernetes.client.openapi.models.V1ServiceStatus item) {
    return new io.kubernetes.client.openapi.models.V1ServiceFluentImpl.StatusNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(
        getStatus() != null
            ? getStatus()
            : new io.kubernetes.client.openapi.models.V1ServiceStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<A> editOrNewStatusLike(
      io.kubernetes.client.openapi.models.V1ServiceStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceFluentImpl that = (V1ServiceFluentImpl) o;
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
      sb.append(spec + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ServiceFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceFluent.MetadataNested<N>, Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ServiceFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N> extends V1ServiceSpecFluentImpl<V1ServiceFluent.SpecNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceFluent.SpecNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SpecNestedImpl(V1ServiceSpec item) {
      this.builder = new V1ServiceSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ServiceSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ServiceSpecBuilder builder;

    public N and() {
      return (N) V1ServiceFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }

  class StatusNestedImpl<N> extends V1ServiceStatusFluentImpl<V1ServiceFluent.StatusNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceFluent.StatusNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StatusNestedImpl(io.kubernetes.client.openapi.models.V1ServiceStatus item) {
      this.builder = new V1ServiceStatusBuilder(this, item);
    }

    StatusNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ServiceStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ServiceStatusBuilder builder;

    public N and() {
      return (N) V1ServiceFluentImpl.this.withStatus(builder.build());
    }

    public N endStatus() {
      return and();
    }
  }
}
