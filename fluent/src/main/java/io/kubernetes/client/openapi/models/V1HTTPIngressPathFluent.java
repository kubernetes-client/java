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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1HTTPIngressPathFluent<A extends V1HTTPIngressPathFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildBackend instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressBackend getBackend();

  public V1IngressBackend buildBackend();

  public A withBackend(V1IngressBackend backend);

  public Boolean hasBackend();

  public V1HTTPIngressPathFluent.BackendNested<A> withNewBackend();

  public V1HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(V1IngressBackend item);

  public V1HTTPIngressPathFluent.BackendNested<A> editBackend();

  public V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackend();

  public V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(V1IngressBackend item);

  public String getPath();

  public A withPath(String path);

  public Boolean hasPath();

  public String getPathType();

  public A withPathType(String pathType);

  public Boolean hasPathType();

  public interface BackendNested<N>
      extends Nested<N>, V1IngressBackendFluent<V1HTTPIngressPathFluent.BackendNested<N>> {
    public N and();

    public N endBackend();
  }
}
