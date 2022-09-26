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

  public A setToMatchExpressions(Integer index, V1LabelSelectorRequirement item);

  public A addToMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);

  public A addAllToMatchExpressions(Collection<V1LabelSelectorRequirement> items);

  public A removeFromMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... items);

  public A removeAllFromMatchExpressions(Collection<V1LabelSelectorRequirement> items);

  public A removeMatchingFromMatchExpressions(
      Predicate<V1LabelSelectorRequirementBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LabelSelectorRequirement> getMatchExpressions();

  public List<V1LabelSelectorRequirement> buildMatchExpressions();

  public V1LabelSelectorRequirement buildMatchExpression(Integer index);

  public V1LabelSelectorRequirement buildFirstMatchExpression();

  public V1LabelSelectorRequirement buildLastMatchExpression();

  public V1LabelSelectorRequirement buildMatchingMatchExpression(
      Predicate<V1LabelSelectorRequirementBuilder> predicate);

  public Boolean hasMatchingMatchExpression(Predicate<V1LabelSelectorRequirementBuilder> predicate);

  public A withMatchExpressions(List<V1LabelSelectorRequirement> matchExpressions);

  public A withMatchExpressions(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement... matchExpressions);

  public Boolean hasMatchExpressions();

  public V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();

  public V1LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(
      V1LabelSelectorRequirement item);

  public V1LabelSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(
      Integer index, V1LabelSelectorRequirement item);

  public V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchExpression(Integer index);

  public V1LabelSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();

  public V1LabelSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();

  public V1LabelSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(
      Predicate<V1LabelSelectorRequirementBuilder> predicate);

  public A addToMatchLabels(String key, String value);

  public A addToMatchLabels(Map<String, String> map);

  public A removeFromMatchLabels(String key);

  public A removeFromMatchLabels(Map<String, String> map);

  public Map<String, String> getMatchLabels();

  public <K, V> A withMatchLabels(Map<String, String> matchLabels);

  public Boolean hasMatchLabels();

  public interface MatchExpressionsNested<N>
      extends Nested<N>,
          V1LabelSelectorRequirementFluent<V1LabelSelectorFluent.MatchExpressionsNested<N>> {
    public N and();

    public N endMatchExpression();
  }
}
