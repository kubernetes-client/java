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
public interface V1PodFailurePolicyFluent<A extends V1PodFailurePolicyFluent<A>> extends Fluent<A> {
  public A addToRules(Integer index, V1PodFailurePolicyRule item);

  public A setToRules(Integer index, V1PodFailurePolicyRule item);

  public A addToRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... items);

  public A addAllToRules(Collection<V1PodFailurePolicyRule> items);

  public A removeFromRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... items);

  public A removeAllFromRules(Collection<V1PodFailurePolicyRule> items);

  public A removeMatchingFromRules(Predicate<V1PodFailurePolicyRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodFailurePolicyRule> getRules();

  public List<V1PodFailurePolicyRule> buildRules();

  public V1PodFailurePolicyRule buildRule(Integer index);

  public V1PodFailurePolicyRule buildFirstRule();

  public V1PodFailurePolicyRule buildLastRule();

  public V1PodFailurePolicyRule buildMatchingRule(
      Predicate<V1PodFailurePolicyRuleBuilder> predicate);

  public Boolean hasMatchingRule(Predicate<V1PodFailurePolicyRuleBuilder> predicate);

  public A withRules(List<V1PodFailurePolicyRule> rules);

  public A withRules(io.kubernetes.client.openapi.models.V1PodFailurePolicyRule... rules);

  public Boolean hasRules();

  public V1PodFailurePolicyFluent.RulesNested<A> addNewRule();

  public V1PodFailurePolicyFluent.RulesNested<A> addNewRuleLike(V1PodFailurePolicyRule item);

  public V1PodFailurePolicyFluent.RulesNested<A> setNewRuleLike(
      Integer index, V1PodFailurePolicyRule item);

  public V1PodFailurePolicyFluent.RulesNested<A> editRule(Integer index);

  public V1PodFailurePolicyFluent.RulesNested<A> editFirstRule();

  public V1PodFailurePolicyFluent.RulesNested<A> editLastRule();

  public V1PodFailurePolicyFluent.RulesNested<A> editMatchingRule(
      Predicate<V1PodFailurePolicyRuleBuilder> predicate);

  public interface RulesNested<N>
      extends Nested<N>, V1PodFailurePolicyRuleFluent<V1PodFailurePolicyFluent.RulesNested<N>> {
    public N and();

    public N endRule();
  }
}
