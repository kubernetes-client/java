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
public interface V2ContainerResourceMetricSourceFluent<
        A extends V2ContainerResourceMetricSourceFluent<A>>
    extends Fluent<A> {
  public String getContainer();

  public A withContainer(String container);

  public Boolean hasContainer();

  public String getName();

  public A withName(String name);

  public Boolean hasName();

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();

  public V2MetricTarget buildTarget();

  public A withTarget(V2MetricTarget target);

  public Boolean hasTarget();

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget();

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(
      V2MetricTarget item);

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget();

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget();

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(
      V2MetricTarget item);

  public interface TargetNested<N>
      extends Nested<N>,
          V2MetricTargetFluent<V2ContainerResourceMetricSourceFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
