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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1LoadBalancerStatusFluent<A extends V1LoadBalancerStatusFluent<A>>
    extends Fluent<A> {
  public A addToIngress(Integer index, V1LoadBalancerIngress item);

  public A setToIngress(Integer index, V1LoadBalancerIngress item);

  public A addToIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);

  public A addAllToIngress(Collection<V1LoadBalancerIngress> items);

  public A removeFromIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items);

  public A removeAllFromIngress(Collection<V1LoadBalancerIngress> items);

  public A removeMatchingFromIngress(Predicate<V1LoadBalancerIngressBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildIngress instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LoadBalancerIngress> getIngress();

  public List<V1LoadBalancerIngress> buildIngress();

  public V1LoadBalancerIngress buildIngress(Integer index);

  public V1LoadBalancerIngress buildFirstIngress();

  public V1LoadBalancerIngress buildLastIngress();

  public V1LoadBalancerIngress buildMatchingIngress(
      Predicate<V1LoadBalancerIngressBuilder> predicate);

  public Boolean hasMatchingIngress(Predicate<V1LoadBalancerIngressBuilder> predicate);

  public A withIngress(List<V1LoadBalancerIngress> ingress);

  public A withIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... ingress);

  public Boolean hasIngress();

  public V1LoadBalancerStatusFluent.IngressNested<A> addNewIngress();

  public V1LoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(V1LoadBalancerIngress item);

  public V1LoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(
      Integer index, V1LoadBalancerIngress item);

  public V1LoadBalancerStatusFluent.IngressNested<A> editIngress(Integer index);

  public V1LoadBalancerStatusFluent.IngressNested<A> editFirstIngress();

  public V1LoadBalancerStatusFluent.IngressNested<A> editLastIngress();

  public V1LoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(
      Predicate<V1LoadBalancerIngressBuilder> predicate);

  public interface IngressNested<N>
      extends Nested<N>, V1LoadBalancerIngressFluent<V1LoadBalancerStatusFluent.IngressNested<N>> {
    public N and();

    public N endIngress();
  }
}
