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
public interface V2PodsMetricSourceFluent<
        A extends io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricIdentifier getMetric();

  public io.kubernetes.client.openapi.models.V2MetricIdentifier buildMetric();

  public A withMetric(io.kubernetes.client.openapi.models.V2MetricIdentifier metric);

  public java.lang.Boolean hasMetric();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<A>
      withNewMetric();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<A> editMetric();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<A>
      editOrNewMetric();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2MetricIdentifier item);

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2MetricTarget getTarget();

  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget();

  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target);

  public java.lang.Boolean hasTarget();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<A>
      withNewTarget();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<A> editTarget();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<A>
      editOrNewTarget();

  public io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public interface MetricNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2MetricIdentifierFluent<
              io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }

  public interface TargetNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2MetricTargetFluent<
              io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
