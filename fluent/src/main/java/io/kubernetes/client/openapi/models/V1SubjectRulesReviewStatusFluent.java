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
public interface V1SubjectRulesReviewStatusFluent<A extends V1SubjectRulesReviewStatusFluent<A>>
    extends Fluent<A> {
  public String getEvaluationError();

  public A withEvaluationError(java.lang.String evaluationError);

  public Boolean hasEvaluationError();

  public java.lang.Boolean getIncomplete();

  public A withIncomplete(java.lang.Boolean incomplete);

  public java.lang.Boolean hasIncomplete();

  public A addToNonResourceRules(Integer index, V1NonResourceRule item);

  public A setToNonResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item);

  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items);

  public A addAllToNonResourceRules(
      Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items);

  public A removeFromNonResourceRules(
      io.kubernetes.client.openapi.models.V1NonResourceRule... items);

  public A removeAllFromNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NonResourceRule> items);

  public A removeMatchingFromNonResourceRules(Predicate<V1NonResourceRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1NonResourceRule> getNonResourceRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule>
      buildNonResourceRules();

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildNonResourceRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildFirstNonResourceRule();

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildLastNonResourceRule();

  public io.kubernetes.client.openapi.models.V1NonResourceRule buildMatchingNonResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingNonResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
          predicate);

  public A withNonResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1NonResourceRule> nonResourceRules);

  public A withNonResourceRules(
      io.kubernetes.client.openapi.models.V1NonResourceRule... nonResourceRules);

  public java.lang.Boolean hasNonResourceRules();

  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1NonResourceRule item);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      setNewNonResourceRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NonResourceRule item);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editNonResourceRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editFirstNonResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editLastNonResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent
              .NonResourceRulesNested<
          A>
      editMatchingNonResourceRule(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NonResourceRuleBuilder>
              predicate);

  public A addToResourceRules(java.lang.Integer index, V1ResourceRule item);

  public A setToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item);

  public A addToResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);

  public A addAllToResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items);

  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);

  public A removeAllFromResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ResourceRule> items);

  public A removeMatchingFromResourceRules(
      java.util.function.Predicate<V1ResourceRuleBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> getResourceRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> buildResourceRules();

  public io.kubernetes.client.openapi.models.V1ResourceRule buildResourceRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ResourceRule buildFirstResourceRule();

  public io.kubernetes.client.openapi.models.V1ResourceRule buildLastResourceRule();

  public io.kubernetes.client.openapi.models.V1ResourceRule buildMatchingResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingResourceRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
          predicate);

  public A withResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1ResourceRule> resourceRules);

  public A withResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... resourceRules);

  public java.lang.Boolean hasResourceRules();

  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1ResourceRule item);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      setNewResourceRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ResourceRule item);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editResourceRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editFirstResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editLastResourceRule();

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A>
      editMatchingResourceRule(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ResourceRuleBuilder>
              predicate);

  public A withIncomplete();

  public interface NonResourceRulesNested<N>
      extends Nested<N>,
          V1NonResourceRuleFluent<V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>> {
    public N and();

    public N endNonResourceRule();
  }

  public interface ResourceRulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ResourceRuleFluent<V1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>> {
    public N and();

    public N endResourceRule();
  }
}
