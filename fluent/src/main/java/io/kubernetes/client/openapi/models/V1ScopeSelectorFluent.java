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
public interface V1ScopeSelectorFluent<A extends V1ScopeSelectorFluent<A>> extends Fluent<A> {
  public A addToMatchExpressions(Integer index, V1ScopedResourceSelectorRequirement item);

  public A setToMatchExpressions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);

  public A addToMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);

  public A addAllToMatchExpressions(
      Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement> items);

  public A removeFromMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items);

  public A removeAllFromMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
          items);

  public A removeMatchingFromMatchExpressions(
      Predicate<V1ScopedResourceSelectorRequirementBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
      getMatchExpressions();

  public java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
      buildMatchExpressions();

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildMatchExpression(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildFirstMatchExpression();

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildLastMatchExpression();

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
              predicate);

  public Boolean hasMatchingMatchExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
          predicate);

  public A withMatchExpressions(
      java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
          matchExpressions);

  public A withMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... matchExpressions);

  public java.lang.Boolean hasMatchExpressions();

  public V1ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      addNewMatchExpressionLike(
          io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      setNewMatchExpressionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item);

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editMatchExpression(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editFirstMatchExpression();

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editLastMatchExpression();

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
              predicate);

  public interface MatchExpressionsNested<N>
      extends Nested<N>,
          V1ScopedResourceSelectorRequirementFluent<
              V1ScopeSelectorFluent.MatchExpressionsNested<N>> {
    public N and();

    public N endMatchExpression();
  }
}
