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
public interface V2beta1PodsMetricStatusFluent<
        A extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public io.kubernetes.client.custom.Quantity getCurrentAverageValue();

  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);

  public java.lang.Boolean hasCurrentAverageValue();

  public A withNewCurrentAverageValue(java.lang.String value);

  public java.lang.String getMetricName();

  public A withMetricName(java.lang.String metricName);

  public java.lang.Boolean hasMetricName();

  /** Method is deprecated. use withMetricName instead. */
  @java.lang.Deprecated
  public A withNewMetricName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);

  public java.lang.Boolean hasSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      withNewSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editOrNewSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public interface SelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LabelSelectorFluent<
              io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<N>> {
    public N and();

    public N endSelector();
  }
}
