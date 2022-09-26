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
public interface V2ContainerResourceMetricStatusFluent<
        A extends V2ContainerResourceMetricStatusFluent<A>>
    extends Fluent<A> {
  public String getContainer();

  public A withContainer(String container);

  public Boolean hasContainer();

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

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent();

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(
      V2MetricValueStatus item);

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editCurrent();

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent();

  public V2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(
      V2MetricValueStatus item);

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public interface CurrentNested<N>
      extends Nested<N>,
          V2MetricValueStatusFluent<V2ContainerResourceMetricStatusFluent.CurrentNested<N>> {
    public N and();

    public N endCurrent();
  }
}
