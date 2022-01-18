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
public interface V1PodAffinityFluent<
        A extends io.kubernetes.client.openapi.models.V1PodAffinityFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public A setToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items);

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items);

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
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

  public java.lang.Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
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

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
              predicate);

  public A addToRequiredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

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
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
          predicate);

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

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editRequiredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PodAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingRequiredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
              predicate);

  public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<
              io.kubernetes.client.openapi.models.V1PodAffinityFluent
                      .PreferredDuringSchedulingIgnoredDuringExecutionNested<
                  N>> {
    public N and();

    public N endPreferredDuringSchedulingIgnoredDuringExecution();
  }

  public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<
              io.kubernetes.client.openapi.models.V1PodAffinityFluent
                      .RequiredDuringSchedulingIgnoredDuringExecutionNested<
                  N>> {
    public N and();

    public N endRequiredDuringSchedulingIgnoredDuringExecution();
  }
}
