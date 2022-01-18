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
public interface V1TopologySelectorTermFluent<
        A extends io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToMatchLabelExpressions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);

  public A setToMatchLabelExpressions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);

  public A addToMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);

  public A addAllToMatchLabelExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement>
          items);

  public A removeFromMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement... items);

  public A removeAllFromMatchLabelExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement>
          items);

  public A removeMatchingFromMatchLabelExpressions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildMatchLabelExpressions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement>
      getMatchLabelExpressions();

  public java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement>
      buildMatchLabelExpressions();

  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement
      buildMatchLabelExpression(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement
      buildFirstMatchLabelExpression();

  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement
      buildLastMatchLabelExpression();

  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement
      buildMatchingMatchLabelExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>
              predicate);

  public java.lang.Boolean hasMatchingMatchLabelExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>
          predicate);

  public A withMatchLabelExpressions(
      java.util.List<io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement>
          matchLabelExpressions);

  public A withMatchLabelExpressions(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement...
          matchLabelExpressions);

  public java.lang.Boolean hasMatchLabelExpressions();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      addNewMatchLabelExpression();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      addNewMatchLabelExpressionLike(
          io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      setNewMatchLabelExpressionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement item);

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      editMatchLabelExpression(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      editFirstMatchLabelExpression();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      editLastMatchLabelExpression();

  public io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
              .MatchLabelExpressionsNested<
          A>
      editMatchingMatchLabelExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>
              predicate);

  public interface MatchLabelExpressionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<
              io.kubernetes.client.openapi.models.V1TopologySelectorTermFluent
                      .MatchLabelExpressionsNested<
                  N>> {
    public N and();

    public N endMatchLabelExpression();
  }
}
