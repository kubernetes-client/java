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
public interface V1SessionAffinityConfigFluent<
        A extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildClientIP instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ClientIPConfig getClientIP();

  public io.kubernetes.client.openapi.models.V1ClientIPConfig buildClientIP();

  public A withClientIP(io.kubernetes.client.openapi.models.V1ClientIPConfig clientIP);

  public java.lang.Boolean hasClientIP();

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      withNewClientIP();

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      withNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item);

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editClientIP();

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editOrNewClientIP();

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editOrNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item);

  public interface ClientIPNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<
              io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<N>> {
    public N and();

    public N endClientIP();
  }
}
