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
public class V1PriorityClassFluentImpl<A extends V1PriorityClassFluent<A>> extends BaseFluent<A>
    implements V1PriorityClassFluent<A> {
  public V1PriorityClassFluentImpl() {}

  public V1PriorityClassFluentImpl(io.kubernetes.client.openapi.models.V1PriorityClass instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withDescription(instance.getDescription());

    this.withGlobalDefault(instance.getGlobalDefault());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPreemptionPolicy(instance.getPreemptionPolicy());

    this.withValue(instance.getValue());
  }

  private String apiVersion;
  private java.lang.String description;
  private Boolean globalDefault;
  private java.lang.String kind;
  private V1ObjectMetaBuilder metadata;
  private java.lang.String preemptionPolicy;
  private Integer value;

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

  public java.lang.String getDescription() {
    return this.description;
  }

  public A withDescription(java.lang.String description) {
    this.description = description;
    return (A) this;
  }

  public java.lang.Boolean hasDescription() {
    return this.description != null;
  }

  public java.lang.Boolean getGlobalDefault() {
    return this.globalDefault;
  }

  public A withGlobalDefault(java.lang.Boolean globalDefault) {
    this.globalDefault = globalDefault;
    return (A) this;
  }

  public java.lang.Boolean hasGlobalDefault() {
    return this.globalDefault != null;
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

  public V1PriorityClassFluent.MetadataNested<A> withNewMetadata() {
    return new V1PriorityClassFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new V1PriorityClassFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public java.lang.String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }

  public A withPreemptionPolicy(java.lang.String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }

  public java.lang.Integer getValue() {
    return this.value;
  }

  public A withValue(java.lang.Integer value) {
    this.value = value;
    return (A) this;
  }

  public java.lang.Boolean hasValue() {
    return this.value != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PriorityClassFluentImpl that = (V1PriorityClassFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (description != null ? !description.equals(that.description) : that.description != null)
      return false;
    if (globalDefault != null
        ? !globalDefault.equals(that.globalDefault)
        : that.globalDefault != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (preemptionPolicy != null
        ? !preemptionPolicy.equals(that.preemptionPolicy)
        : that.preemptionPolicy != null) return false;
    if (value != null ? !value.equals(that.value) : that.value != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion,
        description,
        globalDefault,
        kind,
        metadata,
        preemptionPolicy,
        value,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (description != null) {
      sb.append("description:");
      sb.append(description + ",");
    }
    if (globalDefault != null) {
      sb.append("globalDefault:");
      sb.append(globalDefault + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (preemptionPolicy != null) {
      sb.append("preemptionPolicy:");
      sb.append(preemptionPolicy + ",");
    }
    if (value != null) {
      sb.append("value:");
      sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withGlobalDefault() {
    return withGlobalDefault(true);
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V1PriorityClassFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<N>,
          Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1PriorityClassFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
