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
public interface V1IngressServiceBackendFluent<A extends V1IngressServiceBackendFluent<A>>
    extends Fluent<A> {
  public String getName();

  public A withName(java.lang.String name);

  public Boolean hasName();

  /**
   * This method has been deprecated, please use method buildPort instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceBackendPort getPort();

  public io.kubernetes.client.openapi.models.V1ServiceBackendPort buildPort();

  public A withPort(io.kubernetes.client.openapi.models.V1ServiceBackendPort port);

  public java.lang.Boolean hasPort();

  public V1IngressServiceBackendFluent.PortNested<A> withNewPort();

  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A>
      withNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);

  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A> editPort();

  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A>
      editOrNewPort();

  public io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent.PortNested<A>
      editOrNewPortLike(io.kubernetes.client.openapi.models.V1ServiceBackendPort item);

  public interface PortNested<N>
      extends Nested<N>, V1ServiceBackendPortFluent<V1IngressServiceBackendFluent.PortNested<N>> {
    public N and();

    public N endPort();
  }
}
