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
public class V1VolumeAttachmentStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<A> {
  public V1VolumeAttachmentStatusFluentImpl() {}

  public V1VolumeAttachmentStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance) {
    this.withAttachError(instance.getAttachError());

    this.withAttached(instance.getAttached());

    this.withAttachmentMetadata(instance.getAttachmentMetadata());

    this.withDetachError(instance.getDetachError());
  }

  private io.kubernetes.client.openapi.models.V1VolumeErrorBuilder attachError;
  private java.lang.Boolean attached;
  private java.util.Map<java.lang.String, java.lang.String> attachmentMetadata;
  private io.kubernetes.client.openapi.models.V1VolumeErrorBuilder detachError;

  /**
   * This method has been deprecated, please use method buildAttachError instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeError getAttachError() {
    return this.attachError != null ? this.attachError.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeError buildAttachError() {
    return this.attachError != null ? this.attachError.build() : null;
  }

  public A withAttachError(io.kubernetes.client.openapi.models.V1VolumeError attachError) {
    _visitables.get("attachError").remove(this.attachError);
    if (attachError != null) {
      this.attachError = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(attachError);
      _visitables.get("attachError").add(this.attachError);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAttachError() {
    return this.attachError != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      withNewAttachError() {
    return new io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl
        .AttachErrorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      withNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item) {
    return new io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl
        .AttachErrorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editAttachError() {
    return withNewAttachErrorLike(getAttachError());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editOrNewAttachError() {
    return withNewAttachErrorLike(
        getAttachError() != null
            ? getAttachError()
            : new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<A>
      editOrNewAttachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item) {
    return withNewAttachErrorLike(getAttachError() != null ? getAttachError() : item);
  }

  public java.lang.Boolean getAttached() {
    return this.attached;
  }

  public A withAttached(java.lang.Boolean attached) {
    this.attached = attached;
    return (A) this;
  }

  public java.lang.Boolean hasAttached() {
    return this.attached != null;
  }

  public A addToAttachmentMetadata(java.lang.String key, java.lang.String value) {
    if (this.attachmentMetadata == null && key != null && value != null) {
      this.attachmentMetadata = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.attachmentMetadata.put(key, value);
    }
    return (A) this;
  }

  public A addToAttachmentMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.attachmentMetadata == null && map != null) {
      this.attachmentMetadata = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.attachmentMetadata.putAll(map);
    }
    return (A) this;
  }

  public A removeFromAttachmentMetadata(java.lang.String key) {
    if (this.attachmentMetadata == null) {
      return (A) this;
    }
    if (key != null && this.attachmentMetadata != null) {
      this.attachmentMetadata.remove(key);
    }
    return (A) this;
  }

  public A removeFromAttachmentMetadata(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.attachmentMetadata == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.attachmentMetadata != null) {
          this.attachmentMetadata.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata() {
    return this.attachmentMetadata;
  }

  public <K, V> A withAttachmentMetadata(
      java.util.Map<java.lang.String, java.lang.String> attachmentMetadata) {
    if (attachmentMetadata == null) {
      this.attachmentMetadata = null;
    } else {
      this.attachmentMetadata = new java.util.LinkedHashMap(attachmentMetadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAttachmentMetadata() {
    return this.attachmentMetadata != null;
  }

  /**
   * This method has been deprecated, please use method buildDetachError instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeError getDetachError() {
    return this.detachError != null ? this.detachError.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeError buildDetachError() {
    return this.detachError != null ? this.detachError.build() : null;
  }

  public A withDetachError(io.kubernetes.client.openapi.models.V1VolumeError detachError) {
    _visitables.get("detachError").remove(this.detachError);
    if (detachError != null) {
      this.detachError = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(detachError);
      _visitables.get("detachError").add(this.detachError);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDetachError() {
    return this.detachError != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      withNewDetachError() {
    return new io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl
        .DetachErrorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      withNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item) {
    return new io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl
        .DetachErrorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editDetachError() {
    return withNewDetachErrorLike(getDetachError());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editOrNewDetachError() {
    return withNewDetachErrorLike(
        getDetachError() != null
            ? getDetachError()
            : new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<A>
      editOrNewDetachErrorLike(io.kubernetes.client.openapi.models.V1VolumeError item) {
    return withNewDetachErrorLike(getDetachError() != null ? getDetachError() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeAttachmentStatusFluentImpl that = (V1VolumeAttachmentStatusFluentImpl) o;
    if (attachError != null ? !attachError.equals(that.attachError) : that.attachError != null)
      return false;
    if (attached != null ? !attached.equals(that.attached) : that.attached != null) return false;
    if (attachmentMetadata != null
        ? !attachmentMetadata.equals(that.attachmentMetadata)
        : that.attachmentMetadata != null) return false;
    if (detachError != null ? !detachError.equals(that.detachError) : that.detachError != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        attachError, attached, attachmentMetadata, detachError, super.hashCode());
  }

  public class AttachErrorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeErrorFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.AttachErrorNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent
                  .AttachErrorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AttachErrorNestedImpl(io.kubernetes.client.openapi.models.V1VolumeError item) {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(this, item);
    }

    AttachErrorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeErrorBuilder builder;

    public N and() {
      return (N) V1VolumeAttachmentStatusFluentImpl.this.withAttachError(builder.build());
    }

    public N endAttachError() {
      return and();
    }
  }

  public class DetachErrorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeErrorFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent.DetachErrorNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent
                  .DetachErrorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    DetachErrorNestedImpl(io.kubernetes.client.openapi.models.V1VolumeError item) {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(this, item);
    }

    DetachErrorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeErrorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeErrorBuilder builder;

    public N and() {
      return (N) V1VolumeAttachmentStatusFluentImpl.this.withDetachError(builder.build());
    }

    public N endDetachError() {
      return and();
    }
  }
}
