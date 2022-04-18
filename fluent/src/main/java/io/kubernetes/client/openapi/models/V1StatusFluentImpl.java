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
public class V1StatusFluentImpl<A extends V1StatusFluent<A>> extends BaseFluent<A>
    implements V1StatusFluent<A> {
  public V1StatusFluentImpl() {}

  public V1StatusFluentImpl(io.kubernetes.client.openapi.models.V1Status instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withCode(instance.getCode());

    this.withDetails(instance.getDetails());

    this.withKind(instance.getKind());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());
  }

  private String apiVersion;
  private Integer code;
  private V1StatusDetailsBuilder details;
  private java.lang.String kind;
  private java.lang.String message;
  private V1ListMetaBuilder metadata;
  private java.lang.String reason;
  private java.lang.String status;

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

  public java.lang.Integer getCode() {
    return this.code;
  }

  public A withCode(java.lang.Integer code) {
    this.code = code;
    return (A) this;
  }

  public java.lang.Boolean hasCode() {
    return this.code != null;
  }

  /**
   * This method has been deprecated, please use method buildDetails instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1StatusDetails getDetails() {
    return this.details != null ? this.details.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1StatusDetails buildDetails() {
    return this.details != null ? this.details.build() : null;
  }

  public A withDetails(io.kubernetes.client.openapi.models.V1StatusDetails details) {
    _visitables.get("details").remove(this.details);
    if (details != null) {
      this.details = new V1StatusDetailsBuilder(details);
      _visitables.get("details").add(this.details);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDetails() {
    return this.details != null;
  }

  public V1StatusFluent.DetailsNested<A> withNewDetails() {
    return new V1StatusFluentImpl.DetailsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> withNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item) {
    return new V1StatusFluentImpl.DetailsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editDetails() {
    return withNewDetailsLike(getDetails());
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetails() {
    return withNewDetailsLike(
        getDetails() != null
            ? getDetails()
            : new io.kubernetes.client.openapi.models.V1StatusDetailsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<A> editOrNewDetailsLike(
      io.kubernetes.client.openapi.models.V1StatusDetails item) {
    return withNewDetailsLike(getDetails() != null ? getDetails() : item);
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

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ListMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1StatusFluent.MetadataNested<A> withNewMetadata() {
    return new V1StatusFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item) {
    return new io.kubernetes.client.openapi.models.V1StatusFluentImpl.MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ListMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<A> editOrNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public java.lang.String getReason() {
    return this.reason;
  }

  public A withReason(java.lang.String reason) {
    this.reason = reason;
    return (A) this;
  }

  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public A withStatus(java.lang.String status) {
    this.status = status;
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatusFluentImpl that = (V1StatusFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (code != null ? !code.equals(that.code) : that.code != null) return false;
    if (details != null ? !details.equals(that.details) : that.details != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, code, details, kind, message, metadata, reason, status, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (code != null) {
      sb.append("code:");
      sb.append(code + ",");
    }
    if (details != null) {
      sb.append("details:");
      sb.append(details + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (reason != null) {
      sb.append("reason:");
      sb.append(reason + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }

  class DetailsNestedImpl<N> extends V1StatusDetailsFluentImpl<V1StatusFluent.DetailsNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatusFluent.DetailsNested<N>, Nested<N> {
    DetailsNestedImpl(io.kubernetes.client.openapi.models.V1StatusDetails item) {
      this.builder = new V1StatusDetailsBuilder(this, item);
    }

    DetailsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1StatusDetailsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StatusDetailsBuilder builder;

    public N and() {
      return (N) V1StatusFluentImpl.this.withDetails(builder.build());
    }

    public N endDetails() {
      return and();
    }
  }

  class MetadataNestedImpl<N> extends V1ListMetaFluentImpl<V1StatusFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatusFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ListMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ListMetaBuilder builder;

    public N and() {
      return (N) V1StatusFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
