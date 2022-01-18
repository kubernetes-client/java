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
public interface V1LoadBalancerStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToIngress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);

  public A setToIngress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);

  public A addToIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);

  public A addAllToIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items);

  public A removeFromIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);

  public A removeAllFromIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items);

  public A removeMatchingFromIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildIngress instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> getIngress();

  public java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> buildIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildIngress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildFirstIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildLastIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildMatchingIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate);

  public java.lang.Boolean hasMatchingIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate);

  public A withIngress(
      java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> ingress);

  public A withIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... ingress);

  public java.lang.Boolean hasIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      addNewIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      addNewIngressLike(io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      setNewIngressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item);

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editIngress(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editFirstIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editLastIngress();

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editMatchingIngress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
              predicate);

  public interface IngressNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<
              io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<N>> {
    public N and();

    public N endIngress();
  }
}
