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
public interface V2beta1HorizontalPodAutoscalerStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition item);

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition item);

  public A addToConditions(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition... items);

  public A addAllToConditions(
      java.util.Collection<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition>
          items);

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition... items);

  public A removeAllFromConditions(
      java.util.Collection<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition>
          items);

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition>
      getConditions();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition>
      buildConditions();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition buildCondition(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition
      buildFirstCondition();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition
      buildLastCondition();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V2beta1HorizontalPodAutoscalerConditionBuilder>
              predicate);

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionBuilder>
          predicate);

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition>
          conditions);

  public A withConditions(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition... conditions);

  public java.lang.Boolean hasConditions();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      addNewCondition();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerCondition item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editCondition(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editFirstCondition();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editLastCondition();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .ConditionsNested<
          A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models
                      .V2beta1HorizontalPodAutoscalerConditionBuilder>
              predicate);

  public A addToCurrentMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricStatus item);

  public A setToCurrentMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricStatus item);

  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2beta1MetricStatus... items);

  public A addAllToCurrentMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricStatus> items);

  public A removeFromCurrentMetrics(
      io.kubernetes.client.openapi.models.V2beta1MetricStatus... items);

  public A removeAllFromCurrentMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricStatus> items);

  public A removeMatchingFromCurrentMetrics(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricStatusBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricStatus>
      getCurrentMetrics();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricStatus>
      buildCurrentMetrics();

  public io.kubernetes.client.openapi.models.V2beta1MetricStatus buildCurrentMetric(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1MetricStatus buildFirstCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta1MetricStatus buildLastCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta1MetricStatus buildMatchingCurrentMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricStatusBuilder>
          predicate);

  public java.lang.Boolean hasMatchingCurrentMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricStatusBuilder>
          predicate);

  public A withCurrentMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricStatus> currentMetrics);

  public A withCurrentMetrics(
      io.kubernetes.client.openapi.models.V2beta1MetricStatus... currentMetrics);

  public java.lang.Boolean hasCurrentMetrics();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      addNewCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      addNewCurrentMetricLike(io.kubernetes.client.openapi.models.V2beta1MetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      setNewCurrentMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricStatus item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editCurrentMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editFirstCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editLastCurrentMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
              .CurrentMetricsNested<
          A>
      editMatchingCurrentMetric(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V2beta1MetricStatusBuilder>
              predicate);

  public java.lang.Integer getCurrentReplicas();

  public A withCurrentReplicas(java.lang.Integer currentReplicas);

  public java.lang.Boolean hasCurrentReplicas();

  public java.lang.Integer getDesiredReplicas();

  public A withDesiredReplicas(java.lang.Integer desiredReplicas);

  public java.lang.Boolean hasDesiredReplicas();

  public java.time.OffsetDateTime getLastScaleTime();

  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime);

  public java.lang.Boolean hasLastScaleTime();

  public java.lang.Long getObservedGeneration();

  public A withObservedGeneration(java.lang.Long observedGeneration);

  public java.lang.Boolean hasObservedGeneration();

  public interface ConditionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerConditionFluent<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
                      .ConditionsNested<
                  N>> {
    public N and();

    public N endCondition();
  }

  public interface CurrentMetricsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta1MetricStatusFluent<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent
                      .CurrentMetricsNested<
                  N>> {
    public N and();

    public N endCurrentMetric();
  }
}
