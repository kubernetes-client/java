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
public interface V1WeightedPodAffinityTermFluent<A extends V1WeightedPodAffinityTermFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildPodAffinityTerm instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAffinityTerm getPodAffinityTerm();

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm buildPodAffinityTerm();

  public A withPodAffinityTerm(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm podAffinityTerm);

  public Boolean hasPodAffinityTerm();

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<
          A>
      withNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<
          A>
      editPodAffinityTerm();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<
          A>
      editOrNewPodAffinityTerm();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent.PodAffinityTermNested<
          A>
      editOrNewPodAffinityTermLike(io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public Integer getWeight();

  public A withWeight(java.lang.Integer weight);

  public java.lang.Boolean hasWeight();

  public interface PodAffinityTermNested<N>
      extends Nested<N>,
          V1PodAffinityTermFluent<V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>> {
    public N and();

    public N endPodAffinityTerm();
  }
}
