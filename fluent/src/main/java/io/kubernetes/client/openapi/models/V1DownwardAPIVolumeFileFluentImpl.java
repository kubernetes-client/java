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
public class V1DownwardAPIVolumeFileFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<A> {
  public V1DownwardAPIVolumeFileFluentImpl() {}

  public V1DownwardAPIVolumeFileFluentImpl(
      io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile instance) {
    this.withFieldRef(instance.getFieldRef());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

    this.withResourceFieldRef(instance.getResourceFieldRef());
  }

  private io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder fieldRef;
  private java.lang.Integer mode;
  private java.lang.String path;
  private io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder resourceFieldRef;

  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector getFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }

  public A withFieldRef(io.kubernetes.client.openapi.models.V1ObjectFieldSelector fieldRef) {
    _visitables.get("fieldRef").remove(this.fieldRef);
    if (fieldRef != null) {
      this.fieldRef =
          new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(fieldRef);
      _visitables.get("fieldRef").add(this.fieldRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFieldRef() {
    return this.fieldRef != null;
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      withNewFieldRef() {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl
        .FieldRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      withNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl
        .FieldRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editFieldRef() {
    return withNewFieldRefLike(getFieldRef());
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editOrNewFieldRef() {
    return withNewFieldRefLike(
        getFieldRef() != null
            ? getFieldRef()
            : new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<A>
      editOrNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef() : item);
  }

  public java.lang.Integer getMode() {
    return this.mode;
  }

  public A withMode(java.lang.Integer mode) {
    this.mode = mode;
    return (A) this;
  }

  public java.lang.Boolean hasMode() {
    return this.mode != null;
  }

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector getResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }

  public A withResourceFieldRef(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector resourceFieldRef) {
    _visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    if (resourceFieldRef != null) {
      this.resourceFieldRef =
          new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(resourceFieldRef);
      _visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRef() {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl
        .ResourceFieldRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
    return new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl
        .ResourceFieldRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef());
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(
        getResourceFieldRef() != null
            ? getResourceFieldRef()
            : new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(
        getResourceFieldRef() != null ? getResourceFieldRef() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DownwardAPIVolumeFileFluentImpl that = (V1DownwardAPIVolumeFileFluentImpl) o;
    if (fieldRef != null ? !fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
    if (mode != null ? !mode.equals(that.mode) : that.mode != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (resourceFieldRef != null
        ? !resourceFieldRef.equals(that.resourceFieldRef)
        : that.resourceFieldRef != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fieldRef, mode, path, resourceFieldRef, super.hashCode());
  }

  public class FieldRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.FieldRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    FieldRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(this, item);
    }

    FieldRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder builder;

    public N and() {
      return (N) V1DownwardAPIVolumeFileFluentImpl.this.withFieldRef(builder.build());
    }

    public N endFieldRef() {
      return and();
    }
  }

  public class ResourceFieldRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent
                  .ResourceFieldRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceFieldRefNestedImpl(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(this, item);
    }

    ResourceFieldRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder builder;

    public N and() {
      return (N) V1DownwardAPIVolumeFileFluentImpl.this.withResourceFieldRef(builder.build());
    }

    public N endResourceFieldRef() {
      return and();
    }
  }
}
