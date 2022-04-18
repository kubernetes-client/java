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
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1LabelSelectorFluent<A extends V1LabelSelectorFluent<A>> extends Fluent<A> {
  public A addToMatchExpressions(Integer index, V1LabelSelectorRequirement item);

  public A setToMatchExpressions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);

  public A addToMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);

  public A addAllToMatchExpressions(
      Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items);

  public A removeFromMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);

  public A removeAllFromMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> items);

  public A removeMatchingFromMatchExpressions(
      Predicate<V1LabelSelectorRequirementBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement> getMatchExpressions();

  public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement>
      buildMatchExpressions();

  public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildMatchExpression(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildFirstMatchExpression();

  public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement buildLastMatchExpression();

  public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement
      buildMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>
              predicate);

  public Boolean hasMatchingMatchExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>
          predicate);

  public A withMatchExpressions(
      java.util.List<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement>
          matchExpressions);

  public A withMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... matchExpressions);

  public java.lang.Boolean hasMatchExpressions();

  public V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      addNewMatchExpressionLike(
          io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      setNewMatchExpressionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1LabelSelectorRequirement item);

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      editMatchExpression(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      editFirstMatchExpression();

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      editLastMatchExpression();

  public io.kubernetes.client.openapi.models.V1LabelSelectorFluent.MatchExpressionsNested<A>
      editMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder>
              predicate);

  public A addToMatchLabels(String key, java.lang.String value);

  public A addToMatchLabels(Map<java.lang.String, java.lang.String> map);

  public A removeFromMatchLabels(java.lang.String key);

  public A removeFromMatchLabels(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getMatchLabels();

  public <K, V> A withMatchLabels(java.util.Map<java.lang.String, java.lang.String> matchLabels);

  public java.lang.Boolean hasMatchLabels();

  public interface MatchExpressionsNested<N>
      extends Nested<N>,
          V1LabelSelectorRequirementFluent<V1LabelSelectorFluent.MatchExpressionsNested<N>> {
    public N and();

    public N endMatchExpression();
  }
}
