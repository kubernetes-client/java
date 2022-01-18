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
public interface V1IngressBackendFluent<
        A extends io.kubernetes.client.openapi.models.V1IngressBackendFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildResource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference getResource();

  public io.kubernetes.client.openapi.models.V1TypedLocalObjectReference buildResource();

  public A withResource(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference resource);

  public java.lang.Boolean hasResource();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      withNewResource();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      withNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editResource();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editOrNewResource();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<A>
      editOrNewResourceLike(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference item);

  /**
   * This method has been deprecated, please use method buildService instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressServiceBackend getService();

  public io.kubernetes.client.openapi.models.V1IngressServiceBackend buildService();

  public A withService(io.kubernetes.client.openapi.models.V1IngressServiceBackend service);

  public java.lang.Boolean hasService();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      withNewService();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      withNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item);

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A> editService();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      editOrNewService();

  public io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<A>
      editOrNewServiceLike(io.kubernetes.client.openapi.models.V1IngressServiceBackend item);

  public interface ResourceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1IngressBackendFluent.ResourceNested<N>> {
    public N and();

    public N endResource();
  }

  public interface ServiceNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<
              io.kubernetes.client.openapi.models.V1IngressBackendFluent.ServiceNested<N>> {
    public N and();

    public N endService();
  }
}
