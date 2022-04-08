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
public interface V1ClusterRoleFluent<A extends V1ClusterRoleFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAggregationRule instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1AggregationRule getAggregationRule();

  public io.kubernetes.client.openapi.models.V1AggregationRule buildAggregationRule();

  public A withAggregationRule(
      io.kubernetes.client.openapi.models.V1AggregationRule aggregationRule);

  public Boolean hasAggregationRule();

  public V1ClusterRoleFluent.AggregationRuleNested<A> withNewAggregationRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A>
      withNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1AggregationRule item);

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A>
      editAggregationRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A>
      editOrNewAggregationRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.AggregationRuleNested<A>
      editOrNewAggregationRuleLike(io.kubernetes.client.openapi.models.V1AggregationRule item);

  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1ClusterRoleFluent.MetadataNested<A> withNewMetadata();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToRules(Integer index, V1PolicyRule item);

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item);

  public A addToRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);

  public A addAllToRules(Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items);

  public A removeFromRules(io.kubernetes.client.openapi.models.V1PolicyRule... items);

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PolicyRule> items);

  public A removeMatchingFromRules(Predicate<V1PolicyRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1PolicyRule> getRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> buildRules();

  public io.kubernetes.client.openapi.models.V1PolicyRule buildRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PolicyRule buildFirstRule();

  public io.kubernetes.client.openapi.models.V1PolicyRule buildLastRule();

  public io.kubernetes.client.openapi.models.V1PolicyRule buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate);

  public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1PolicyRule> rules);

  public A withRules(io.kubernetes.client.openapi.models.V1PolicyRule... rules);

  public java.lang.Boolean hasRules();

  public V1ClusterRoleFluent.RulesNested<A> addNewRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> addNewRuleLike(
      io.kubernetes.client.openapi.models.V1PolicyRule item);

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> setNewRuleLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PolicyRule item);

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editFirstRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editLastRule();

  public io.kubernetes.client.openapi.models.V1ClusterRoleFluent.RulesNested<A> editMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>
          predicate);

  public interface AggregationRuleNested<N>
      extends Nested<N>, V1AggregationRuleFluent<V1ClusterRoleFluent.AggregationRuleNested<N>> {
    public N and();

    public N endAggregationRule();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectMetaFluent<V1ClusterRoleFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface RulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PolicyRuleFluent<V1ClusterRoleFluent.RulesNested<N>> {
    public N and();

    public N endRule();
  }
}
