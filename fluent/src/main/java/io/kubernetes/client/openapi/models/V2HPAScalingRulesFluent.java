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
public interface V2HPAScalingRulesFluent<A extends V2HPAScalingRulesFluent<A>> extends Fluent<A> {
  public A addToPolicies(Integer index, V2HPAScalingPolicy item);

  public A setToPolicies(Integer index, V2HPAScalingPolicy item);

  public A addToPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items);

  public A addAllToPolicies(Collection<V2HPAScalingPolicy> items);

  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items);

  public A removeAllFromPolicies(Collection<V2HPAScalingPolicy> items);

  public A removeMatchingFromPolicies(Predicate<V2HPAScalingPolicyBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPolicies instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V2HPAScalingPolicy> getPolicies();

  public List<V2HPAScalingPolicy> buildPolicies();

  public V2HPAScalingPolicy buildPolicy(Integer index);

  public V2HPAScalingPolicy buildFirstPolicy();

  public V2HPAScalingPolicy buildLastPolicy();

  public V2HPAScalingPolicy buildMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate);

  public Boolean hasMatchingPolicy(Predicate<V2HPAScalingPolicyBuilder> predicate);

  public A withPolicies(List<V2HPAScalingPolicy> policies);

  public A withPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... policies);

  public Boolean hasPolicies();

  public V2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicy();

  public V2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicyLike(V2HPAScalingPolicy item);

  public V2HPAScalingRulesFluent.PoliciesNested<A> setNewPolicyLike(
      Integer index, V2HPAScalingPolicy item);

  public V2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(Integer index);

  public V2HPAScalingRulesFluent.PoliciesNested<A> editFirstPolicy();

  public V2HPAScalingRulesFluent.PoliciesNested<A> editLastPolicy();

  public V2HPAScalingRulesFluent.PoliciesNested<A> editMatchingPolicy(
      Predicate<V2HPAScalingPolicyBuilder> predicate);

  public String getSelectPolicy();

  public A withSelectPolicy(String selectPolicy);

  public Boolean hasSelectPolicy();

  public Integer getStabilizationWindowSeconds();

  public A withStabilizationWindowSeconds(Integer stabilizationWindowSeconds);

  public Boolean hasStabilizationWindowSeconds();

  public interface PoliciesNested<N>
      extends Nested<N>, V2HPAScalingPolicyFluent<V2HPAScalingRulesFluent.PoliciesNested<N>> {
    public N and();

    public N endPolicy();
  }
}
