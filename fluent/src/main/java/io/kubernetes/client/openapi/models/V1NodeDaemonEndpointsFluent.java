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
public interface V1NodeDaemonEndpointsFluent<A extends V1NodeDaemonEndpointsFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildKubeletEndpoint instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1DaemonEndpoint getKubeletEndpoint();

  public V1DaemonEndpoint buildKubeletEndpoint();

  public A withKubeletEndpoint(V1DaemonEndpoint kubeletEndpoint);

  public Boolean hasKubeletEndpoint();

  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint();

  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(
      V1DaemonEndpoint item);

  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint();

  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint();

  public V1NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(
      V1DaemonEndpoint item);

  public interface KubeletEndpointNested<N>
      extends Nested<N>,
          V1DaemonEndpointFluent<V1NodeDaemonEndpointsFluent.KubeletEndpointNested<N>> {
    public N and();

    public N endKubeletEndpoint();
  }
}
