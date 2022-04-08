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
public interface V1NodeAffinityFluent<A extends V1NodeAffinityFluent<A>> extends Fluent<A> {
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      Integer index, V1PreferredSchedulingTerm item);

  public A setToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items);

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items);

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      Predicate<V1PreferredSchedulingTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
      getPreferredDuringSchedulingIgnoredDuringExecution();

  public java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
      buildPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildLastPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
              predicate);

  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
          predicate);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
          preferredDuringSchedulingIgnoredDuringExecution);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm...
          preferredDuringSchedulingIgnoredDuringExecution);

  public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item);

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
              predicate);

  /**
   * This method has been deprecated, please use method
   * buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeSelector
      buildRequiredDuringSchedulingIgnoredDuringExecution();

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1NodeSelector
          requiredDuringSchedulingIgnoredDuringExecution);

  public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      withNewRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1NodeSelector item);

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecution();

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1NodeSelector item);

  public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends Nested<N>,
          V1PreferredSchedulingTermFluent<
              V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endPreferredDuringSchedulingIgnoredDuringExecution();
  }

  public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1NodeSelectorFluent<
              V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endRequiredDuringSchedulingIgnoredDuringExecution();
  }
}
