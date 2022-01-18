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
public interface V1IngressStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1IngressStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus getLoadBalancer();

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatus buildLoadBalancer();

  public A withLoadBalancer(io.kubernetes.client.openapi.models.V1LoadBalancerStatus loadBalancer);

  public java.lang.Boolean hasLoadBalancer();

  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A>
      withNewLoadBalancer();

  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A>
      withNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);

  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A>
      editLoadBalancer();

  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A>
      editOrNewLoadBalancer();

  public io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<A>
      editOrNewLoadBalancerLike(io.kubernetes.client.openapi.models.V1LoadBalancerStatus item);

  public interface LoadBalancerNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<
              io.kubernetes.client.openapi.models.V1IngressStatusFluent.LoadBalancerNested<N>> {
    public N and();

    public N endLoadBalancer();
  }
}
