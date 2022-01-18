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
public interface V1HTTPIngressPathFluent<
        A extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildBackend instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1IngressBackend getBackend();

  public io.kubernetes.client.openapi.models.V1IngressBackend buildBackend();

  public A withBackend(io.kubernetes.client.openapi.models.V1IngressBackend backend);

  public java.lang.Boolean hasBackend();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      withNewBackend();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      withNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A> editBackend();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      editOrNewBackend();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<A>
      editOrNewBackendLike(io.kubernetes.client.openapi.models.V1IngressBackend item);

  public java.lang.String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original);

  public java.lang.String getPathType();

  public A withPathType(java.lang.String pathType);

  public java.lang.Boolean hasPathType();

  /** Method is deprecated. use withPathType instead. */
  @java.lang.Deprecated
  public A withNewPathType(java.lang.String original);

  public interface BackendNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1IngressBackendFluent<
              io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent.BackendNested<N>> {
    public N and();

    public N endBackend();
  }
}
