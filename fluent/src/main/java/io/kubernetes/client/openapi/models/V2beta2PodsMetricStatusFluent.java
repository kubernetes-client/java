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
public interface V2beta2PodsMetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent();

  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent();

  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current);

  public java.lang.Boolean hasCurrent();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      withNewCurrent();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editCurrent();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item);

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier getMetric();

  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric();

  public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric);

  public java.lang.Boolean hasMetric();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      withNewMetric();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editMetric();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editOrNewMetric();

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item);

  public interface CurrentNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<
              io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<N>> {
    public N and();

    public N endCurrent();
  }

  public interface MetricNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluent<
              io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }
}
