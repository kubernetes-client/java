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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1PodAntiAffinityFluent<A extends V1PodAntiAffinityFluent<A>> extends Fluent<A> {
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      Integer index, V1WeightedPodAffinityTerm item);

  public A setToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      Predicate<V1WeightedPodAffinityTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
      getPreferredDuringSchedulingIgnoredDuringExecution();

  public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
      buildPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildLastPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
              predicate);

  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
          predicate);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
          preferredDuringSchedulingIgnoredDuringExecution);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm...
          preferredDuringSchedulingIgnoredDuringExecution);

  public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();

  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
              predicate);

  public A addToRequiredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, V1PodAffinityTerm item);

  public A setToRequiredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public A addToRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);

  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items);

  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm... items);

  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items);

  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<V1PodAffinityTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method
   * buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
      getRequiredDuringSchedulingIgnoredDuringExecution();

  public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
      buildRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildRequiredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildFirstRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildLastRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
              predicate);

  public java.lang.Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
          predicate);

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
          requiredDuringSchedulingIgnoredDuringExecution);

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm...
          requiredDuringSchedulingIgnoredDuringExecution);

  public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();

  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      addNewRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editRequiredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingRequiredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
              predicate);

  public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends Nested<N>,
          V1WeightedPodAffinityTermFluent<
              V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endPreferredDuringSchedulingIgnoredDuringExecution();
  }

  public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1PodAffinityTermFluent<
              V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endRequiredDuringSchedulingIgnoredDuringExecution();
  }
}
