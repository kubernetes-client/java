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

  public A withContainer(java.lang.String container);

  public Boolean hasContainer();

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget();

  public io.kubernetes.client.openapi.models.V2MetricTarget buildTarget();

  public A withTarget(io.kubernetes.client.openapi.models.V2MetricTarget target);

  public java.lang.Boolean hasTarget();

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget();

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent.TargetNested<A>
      withNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent.TargetNested<A>
      editTarget();

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent.TargetNested<A>
      editOrNewTarget();

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent.TargetNested<A>
      editOrNewTargetLike(io.kubernetes.client.openapi.models.V2MetricTarget item);

  public interface TargetNested<N>
      extends Nested<N>,
          V2MetricTargetFluent<V2ContainerResourceMetricSourceFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
