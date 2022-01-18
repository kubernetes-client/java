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
public interface V2beta1HorizontalPodAutoscalerSpecFluent<
        A extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getMaxReplicas();

  public A withMaxReplicas(java.lang.Integer maxReplicas);

  public java.lang.Boolean hasMaxReplicas();

  public A addToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item);

  public A setToMetrics(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item);

  public A addToMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items);

  public A addAllToMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items);

  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items);

  public A removeAllFromMetrics(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items);

  public A removeMatchingFromMetrics(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildMetrics instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> getMetrics();

  public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> buildMetrics();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildFirstMetric();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildLastMetric();

  public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate);

  public java.lang.Boolean hasMatchingMetric(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
          predicate);

  public A withMetrics(
      java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> metrics);

  public A withMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... metrics);

  public java.lang.Boolean hasMetrics();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      addNewMetricLike(io.kubernetes.client.openapi.models.V2beta1MetricSpec item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      setNewMetricLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta1MetricSpec item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMetric(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editFirstMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editLastMetric();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<
          A>
      editMatchingMetric(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder>
              predicate);

  public java.lang.Integer getMinReplicas();

  public A withMinReplicas(java.lang.Integer minReplicas);

  public java.lang.Boolean hasMinReplicas();

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference getScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference
      buildScaleTargetRef();

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference scaleTargetRef);

  public java.lang.Boolean hasScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);

  public interface MetricsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                      .MetricsNested<
                  N>> {
    public N and();

    public N endMetric();
  }

  public interface ScaleTargetRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent
                      .ScaleTargetRefNested<
                  N>> {
    public N and();

    public N endScaleTargetRef();
  }
}
