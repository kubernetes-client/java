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
public class V1HTTPIngressPathFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<A> {
  public V1HTTPIngressPathFluentImpl() {}

  public V1HTTPIngressPathFluentImpl(
      io.kubernetes.client.openapi.models.V1HTTPIngressPath instance) {
    this.withBackend(instance.getBackend());

    this.withPath(instance.getPath());

    this.withPathType(instance.getPathType());
  }

  private io.kubernetes.client.openapi.models.V1IngressBackendBuilder backend;
  private java.lang.String path;
  private java.lang.String pathType;

  /**
   * This method has been deprecated, please use method buildBackend instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressBackend getBackend() {
    return this.backend != null ? this.backend.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressBackend buildBackend() {
    return this.backend != null ? this.backend.build() : null;
  }

  public A withBackend(io.kubernetes.client.openapi.models.V1IngressBackend backend) {
    _visitables.get("backend").remove(this.backend);
    if (backend != null) {
      this.backend = new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(backend);
      _visitables.get("backend").add(this.backend);
    }
    return (A) this;
  }

  public java.lang.Boolean hasBackend() {
    return this.backend != null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      withNewBackend() {
    return new io.kubernetes.client.openapi.models.V1HTTPIngressPathFluentImpl.BackendNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      withNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item) {
    return new io.kubernetes.client.openapi.models.V1HTTPIngressPathFluentImpl.BackendNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      editBackend() {
    return withNewBackendLike(getBackend());
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      editOrNewBackend() {
    return withNewBackendLike(
        getBackend() != null
            ? getBackend()
            : new io.kubernetes.client.openapi.models.V1IngressBackendBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      editOrNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item) {
    return withNewBackendLike(getBackend() != null ? getBackend() : item);
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

  public java.lang.String getPathType() {
    return this.pathType;
  }

  public A withPathType(java.lang.String pathType) {
    this.pathType = pathType;
    return (A) this;
  }

  public java.lang.Boolean hasPathType() {
    return this.pathType != null;
  }

  /** Method is deprecated. use withPathType instead. */
  @java.lang.Deprecated
  public A withNewPathType(java.lang.String original) {
    return (A) withPathType(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPIngressPathFluentImpl that = (V1HTTPIngressPathFluentImpl) o;
    if (backend != null ? !backend.equals(that.backend) : that.backend != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (pathType != null ? !pathType.equals(that.pathType) : that.pathType != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(backend, path, pathType, super.hashCode());
  }

  public class BackendNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl<
          io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<N>>
      implements io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    BackendNestedImpl(io.kubernetes.client.openapi.models.V1IngressBackend item) {
      this.builder = new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(this, item);
    }

    BackendNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1IngressBackendBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressBackendBuilder builder;

    public N and() {
      return (N) V1HTTPIngressPathFluentImpl.this.withBackend(builder.build());
    }

    public N endBackend() {
      return and();
    }
  }
}
