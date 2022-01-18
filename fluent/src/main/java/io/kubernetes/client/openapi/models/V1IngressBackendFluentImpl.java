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
public class V1IngressBackendFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1IngressBackendFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1IngressBackendFluent<A> {
  public V1IngressBackendFluentImpl() {}

  public V1IngressBackendFluentImpl(io.kubernetes.client.openapi.models.V1IngressBackend instance) {
    this.withResource(instance.getResource());

    this.withService(instance.getService());
  }

  private io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder resource;
  private io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder service;

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }

  public A withResource(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource != null) {
      this.resource =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(resource);
      _visitables.get("resource").add(this.resource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResource() {
    return this.resource != null;
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      withNewResource() {
    return new io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl.ResourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl.ResourceNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editResource() {
    return withNewResourceLike(getResource());
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editOrNewResource() {
    return withNewResourceLike(
        getResource() != null
            ? getResource()
            : new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
    return withNewResourceLike(getResource() != null ? getResource() : item);
  }

  /**
   * This method has been deprecated, please use method buildService instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressServiceBackend getService() {
    return this.service != null ? this.service.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1IngressServiceBackend buildService() {
    return this.service != null ? this.service.build() : null;
  }

  public A withService(io.kubernetes.client.openapi.models.V1IngressServiceBackend service) {
    _visitables.get("service").remove(this.service);
    if (service != null) {
      this.service =
          new io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder(service);
      _visitables.get("service").add(this.service);
    }
    return (A) this;
  }

  public java.lang.Boolean hasService() {
    return this.service != null;
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      withNewService() {
    return new io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl.ServiceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      withNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item) {
    return new io.kubernetes.client.openapi.models.V1IngressBackendFluentImpl.ServiceNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> editService() {
    return withNewServiceLike(getService());
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      editOrNewService() {
    return withNewServiceLike(
        getService() != null
            ? getService()
            : new io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      editOrNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item) {
    return withNewServiceLike(getService() != null ? getService() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressBackendFluentImpl that = (V1IngressBackendFluentImpl) o;
    if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
    if (service != null ? !service.equals(that.service) : that.service != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(resource, service, super.hashCode());
  }

  public class ResourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceNestedImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this, item);
    }

    ResourceNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1IngressBackendFluentImpl.this.withResource(builder.build());
    }

    public N endResource() {
      return and();
    }
  }

  public class ServiceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1IngressServiceBackendFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ServiceNestedImpl(io.kubernetes.client.openapi.models.V1IngressServiceBackend item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder(this, item);
    }

    ServiceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1IngressServiceBackendBuilder builder;

    public N and() {
      return (N) V1IngressBackendFluentImpl.this.withService(builder.build());
    }

    public N endService() {
      return and();
    }
  }
}
