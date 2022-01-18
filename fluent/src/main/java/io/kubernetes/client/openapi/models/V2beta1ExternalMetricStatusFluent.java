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
public interface V2beta1ExternalMetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public io.kubernetes.client.custom.Quantity getCurrentAverageValue();

  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);

  public java.lang.Boolean hasCurrentAverageValue();

  public A withNewCurrentAverageValue(java.lang.String value);

  public io.kubernetes.client.custom.Quantity getCurrentValue();

  public A withCurrentValue(io.kubernetes.client.custom.Quantity currentValue);

  public java.lang.Boolean hasCurrentValue();

  public A withNewCurrentValue(java.lang.String value);

  public java.lang.String getMetricName();

  public A withMetricName(java.lang.String metricName);

  public java.lang.Boolean hasMetricName();

  /** Method is deprecated. use withMetricName instead. */
  @java.lang.Deprecated
  public A withNewMetricName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetricSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getMetricSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildMetricSelector();

  public A withMetricSelector(io.kubernetes.client.openapi.models.V1LabelSelector metricSelector);

  public java.lang.Boolean hasMetricSelector();

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      withNewMetricSelector();

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      withNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editMetricSelector();

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelector();

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent.MetricSelectorNested<
          A>
      editOrNewMetricSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public interface MetricSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent
                      .MetricSelectorNested<
                  N>> {
    public N and();

    public N endMetricSelector();
  }
}
