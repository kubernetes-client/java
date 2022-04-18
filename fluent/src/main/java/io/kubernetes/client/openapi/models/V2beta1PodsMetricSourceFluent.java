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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V2beta1PodsMetricSourceFluent<A extends V2beta1PodsMetricSourceFluent<A>>
    extends Fluent<A> {
  public String getMetricName();

  public A withMetricName(java.lang.String metricName);

  public Boolean hasMetricName();

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);

  public java.lang.Boolean hasSelector();

  public V2beta1PodsMetricSourceFluent.SelectorNested<A> withNewSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editOrNewSelector();

  public io.kubernetes.client.openapi.models.V2beta1PodsMetricSourceFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public Quantity getTargetAverageValue();

  public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);

  public java.lang.Boolean hasTargetAverageValue();

  public A withNewTargetAverageValue(java.lang.String value);

  public interface SelectorNested<N>
      extends Nested<N>, V1LabelSelectorFluent<V2beta1PodsMetricSourceFluent.SelectorNested<N>> {
    public N and();

    public N endSelector();
  }
}
