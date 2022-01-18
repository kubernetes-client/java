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
public class V1CustomResourceSubresourcesFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<A> {
  public V1CustomResourceSubresourcesFluentImpl() {}

  public V1CustomResourceSubresourcesFluentImpl(
      io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance) {
    this.withScale(instance.getScale());

    this.withStatus(instance.getStatus());
  }

  private io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder scale;
  private java.lang.Object status;

  /**
   * This method has been deprecated, please use method buildScale instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale getScale() {
    return this.scale != null ? this.scale.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale buildScale() {
    return this.scale != null ? this.scale.build() : null;
  }

  public A withScale(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale scale) {
    _visitables.get("scale").remove(this.scale);
    if (scale != null) {
      this.scale =
          new io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder(scale);
      _visitables.get("scale").add(this.scale);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScale() {
    return this.scale != null;
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      withNewScale() {
    return new io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluentImpl
        .ScaleNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      withNewScaleLike(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale item) {
    return new io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluentImpl
        .ScaleNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editScale() {
    return withNewScaleLike(getScale());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editOrNewScale() {
    return withNewScaleLike(
        getScale() != null
            ? getScale()
            : new io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editOrNewScaleLike(
          io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale item) {
    return withNewScaleLike(getScale() != null ? getScale() : item);
  }

  public java.lang.Object getStatus() {
    return this.status;
  }

  public A withStatus(java.lang.Object status) {
    this.status = status;
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceSubresourcesFluentImpl that = (V1CustomResourceSubresourcesFluentImpl) o;
    if (scale != null ? !scale.equals(that.scale) : that.scale != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(scale, status, super.hashCode());
  }

  public class ScaleNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluentImpl<
          io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<N>>
      implements io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleNestedImpl(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder(
              this, item);
    }

    ScaleNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleBuilder builder;

    public N and() {
      return (N) V1CustomResourceSubresourcesFluentImpl.this.withScale(builder.build());
    }

    public N endScale() {
      return and();
    }
  }
}
