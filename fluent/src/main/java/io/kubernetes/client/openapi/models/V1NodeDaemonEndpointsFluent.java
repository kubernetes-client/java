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
public interface V1NodeDaemonEndpointsFluent<
        A extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildKubeletEndpoint instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DaemonEndpoint getKubeletEndpoint();

  public io.kubernetes.client.openapi.models.V1DaemonEndpoint buildKubeletEndpoint();

  public A withKubeletEndpoint(
      io.kubernetes.client.openapi.models.V1DaemonEndpoint kubeletEndpoint);

  public java.lang.Boolean hasKubeletEndpoint();

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A>
      withNewKubeletEndpoint();

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A>
      withNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A>
      editKubeletEndpoint();

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A>
      editOrNewKubeletEndpoint();

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A>
      editOrNewKubeletEndpointLike(io.kubernetes.client.openapi.models.V1DaemonEndpoint item);

  public interface KubeletEndpointNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<
              io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluent.KubeletEndpointNested<
                  N>> {
    public N and();

    public N endKubeletEndpoint();
  }
}
