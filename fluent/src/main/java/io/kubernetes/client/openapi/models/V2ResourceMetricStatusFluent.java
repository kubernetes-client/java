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
public interface V2ResourceMetricStatusFluent<A extends V2ResourceMetricStatusFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricValueStatus getCurrent();

  public io.kubernetes.client.openapi.models.V2MetricValueStatus buildCurrent();

  public A withCurrent(io.kubernetes.client.openapi.models.V2MetricValueStatus current);

  public Boolean hasCurrent();

  public V2ResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      editCurrent();

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent();

  public io.kubernetes.client.openapi.models.V2ResourceMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2MetricValueStatus item);

  public String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  public interface CurrentNested<N>
      extends Nested<N>, V2MetricValueStatusFluent<V2ResourceMetricStatusFluent.CurrentNested<N>> {
    public N and();

    public N endCurrent();
  }
}
