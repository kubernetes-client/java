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
      Integer index, V1PreferredSchedulingTerm item);

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      Collection<V1PreferredSchedulingTerm> items);

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items);

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      Collection<V1PreferredSchedulingTerm> items);

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      Predicate<V1PreferredSchedulingTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution();

  public List<V1PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution();

  public V1PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(
      Integer index);

  public V1PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public V1PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution();

  public V1PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      Predicate<V1PreferredSchedulingTermBuilder> predicate);

  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      Predicate<V1PreferredSchedulingTermBuilder> predicate);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution);

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm...
          preferredDuringSchedulingIgnoredDuringExecution);

  public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1PreferredSchedulingTerm item);

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          Integer index, V1PreferredSchedulingTerm item);

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      editPreferredDuringSchedulingIgnoredDuringExecution(Integer index);

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          Predicate<V1PreferredSchedulingTermBuilder> predicate);

  /**
   * This method has been deprecated, please use method
   * buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution();

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution);

  public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      withNewRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item);

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      editRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecution();

  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item);

  public interface PreferredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends Nested<N>,
          V1PreferredSchedulingTermFluent<
              V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endPreferredDuringSchedulingIgnoredDuringExecution();
  }

  public interface RequiredDuringSchedulingIgnoredDuringExecutionNested<N>
      extends Nested<N>,
          V1NodeSelectorFluent<
              V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> {
    public N and();

    public N endRequiredDuringSchedulingIgnoredDuringExecution();
  }
}
