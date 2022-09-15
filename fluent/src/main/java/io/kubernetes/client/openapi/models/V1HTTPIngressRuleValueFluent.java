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
public interface V1HTTPIngressRuleValueFluent<A extends V1HTTPIngressRuleValueFluent<A>>
    extends Fluent<A> {
  public A addToPaths(Integer index, V1HTTPIngressPath item);

  public A setToPaths(Integer index, V1HTTPIngressPath item);

  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);

  public A addAllToPaths(Collection<V1HTTPIngressPath> items);

  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);

  public A removeAllFromPaths(Collection<V1HTTPIngressPath> items);

  public A removeMatchingFromPaths(Predicate<V1HTTPIngressPathBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildPaths instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HTTPIngressPath> getPaths();

  public List<V1HTTPIngressPath> buildPaths();

  public V1HTTPIngressPath buildPath(Integer index);

  public V1HTTPIngressPath buildFirstPath();

  public V1HTTPIngressPath buildLastPath();

  public V1HTTPIngressPath buildMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate);

  public Boolean hasMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate);

  public A withPaths(List<V1HTTPIngressPath> paths);

  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths);

  public Boolean hasPaths();

  public V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPath();

  public V1HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(V1HTTPIngressPath item);

  public V1HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(
      Integer index, V1HTTPIngressPath item);

  public V1HTTPIngressRuleValueFluent.PathsNested<A> editPath(Integer index);

  public V1HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath();

  public V1HTTPIngressRuleValueFluent.PathsNested<A> editLastPath();

  public V1HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(
      Predicate<V1HTTPIngressPathBuilder> predicate);

  public interface PathsNested<N>
      extends Nested<N>, V1HTTPIngressPathFluent<V1HTTPIngressRuleValueFluent.PathsNested<N>> {
    public N and();

    public N endPath();
  }
}
