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
public interface V1NetworkPolicySpecFluent<A extends V1NetworkPolicySpecFluent<A>>
    extends Fluent<A> {
  public A addToEgress(Integer index, V1NetworkPolicyEgressRule item);

  public A setToEgress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item);

  public A addToEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items);

  public A addAllToEgress(
      Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> items);

  public A removeFromEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... items);

  public A removeAllFromEgress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> items);

  public A removeMatchingFromEgress(Predicate<V1NetworkPolicyEgressRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildEgress instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> getEgress();

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule>
      buildEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildEgress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildFirstEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildLastEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule buildMatchingEgress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
          predicate);

  public Boolean hasMatchingEgress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
          predicate);

  public A withEgress(
      java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule> egress);

  public A withEgress(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule... egress);

  public java.lang.Boolean hasEgress();

  public V1NetworkPolicySpecFluent.EgressNested<A> addNewEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      addNewEgressLike(io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      setNewEgressLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A> editEgress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editFirstEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editLastEgress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.EgressNested<A>
      editMatchingEgress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleBuilder>
              predicate);

  public A addToIngress(java.lang.Integer index, V1NetworkPolicyIngressRule item);

  public A setToIngress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item);

  public A addToIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items);

  public A addAllToIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> items);

  public A removeFromIngress(
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... items);

  public A removeAllFromIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> items);

  public A removeMatchingFromIngress(
      java.util.function.Predicate<V1NetworkPolicyIngressRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildIngress instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule>
      getIngress();

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule>
      buildIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildIngress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildFirstIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildLastIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule buildMatchingIngress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingIngress(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
          predicate);

  public A withIngress(
      java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule> ingress);

  public A withIngress(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule... ingress);

  public java.lang.Boolean hasIngress();

  public V1NetworkPolicySpecFluent.IngressNested<A> addNewIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      addNewIngressLike(io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      setNewIngressLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A> editIngress(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editFirstIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editLastIngress();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.IngressNested<A>
      editMatchingIngress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleBuilder>
              predicate);

  /**
   * This method has been deprecated, please use method buildPodSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1LabelSelector getPodSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildPodSelector();

  public A withPodSelector(io.kubernetes.client.openapi.models.V1LabelSelector podSelector);

  public java.lang.Boolean hasPodSelector();

  public V1NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelector();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      withNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editPodSelector();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editOrNewPodSelector();

  public io.kubernetes.client.openapi.models.V1NetworkPolicySpecFluent.PodSelectorNested<A>
      editOrNewPodSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public A addToPolicyTypes(java.lang.Integer index, String item);

  public A setToPolicyTypes(java.lang.Integer index, java.lang.String item);

  public A addToPolicyTypes(java.lang.String... items);

  public A addAllToPolicyTypes(java.util.Collection<java.lang.String> items);

  public A removeFromPolicyTypes(java.lang.String... items);

  public A removeAllFromPolicyTypes(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getPolicyTypes();

  public java.lang.String getPolicyType(java.lang.Integer index);

  public java.lang.String getFirstPolicyType();

  public java.lang.String getLastPolicyType();

  public java.lang.String getMatchingPolicyType(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingPolicyType(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withPolicyTypes(java.util.List<java.lang.String> policyTypes);

  public A withPolicyTypes(java.lang.String... policyTypes);

  public java.lang.Boolean hasPolicyTypes();

  public interface EgressNested<N>
      extends Nested<N>,
          V1NetworkPolicyEgressRuleFluent<V1NetworkPolicySpecFluent.EgressNested<N>> {
    public N and();

    public N endEgress();
  }

  public interface IngressNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1NetworkPolicyIngressRuleFluent<V1NetworkPolicySpecFluent.IngressNested<N>> {
    public N and();

    public N endIngress();
  }

  public interface PodSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1LabelSelectorFluent<V1NetworkPolicySpecFluent.PodSelectorNested<N>> {
    public N and();

    public N endPodSelector();
  }
}
