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

/** Generated */
public interface V2ExternalMetricStatusFluent<A extends V2ExternalMetricStatusFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();

  public V2MetricValueStatus buildCurrent();

  public A withCurrent(V2MetricValueStatus current);

  public Boolean hasCurrent();

  public V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrent();

  public V2ExternalMetricStatusFluent.CurrentNested<A> withNewCurrentLike(V2MetricValueStatus item);

  public V2ExternalMetricStatusFluent.CurrentNested<A> editCurrent();

  public V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrent();

  public V2ExternalMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(
      V2MetricValueStatus item);

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricIdentifier getMetric();

  public V2MetricIdentifier buildMetric();

  public A withMetric(V2MetricIdentifier metric);

  public Boolean hasMetric();

  public V2ExternalMetricStatusFluent.MetricNested<A> withNewMetric();

  public V2ExternalMetricStatusFluent.MetricNested<A> withNewMetricLike(V2MetricIdentifier item);

  public V2ExternalMetricStatusFluent.MetricNested<A> editMetric();

  public V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetric();

  public V2ExternalMetricStatusFluent.MetricNested<A> editOrNewMetricLike(V2MetricIdentifier item);

  public interface CurrentNested<N>
      extends Nested<N>, V2MetricValueStatusFluent<V2ExternalMetricStatusFluent.CurrentNested<N>> {
    public N and();

    public N endCurrent();
  }

  public interface MetricNested<N>
      extends Nested<N>, V2MetricIdentifierFluent<V2ExternalMetricStatusFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }
}
