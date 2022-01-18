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
public interface V1HTTPIngressRuleValueFluent<
        A extends io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item);

  public A setToPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item);

  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);

  public A addAllToPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items);

  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items);

  public A removeAllFromPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items);

  public A removeMatchingFromPaths(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildPaths instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> getPaths();

  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> buildPaths();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildPath(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildFirstPath();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildLastPath();

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildMatchingPath(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPath(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate);

  public A withPaths(java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> paths);

  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths);

  public java.lang.Boolean hasPaths();

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      addNewPath();

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      addNewPathLike(io.kubernetes.client.openapi.models.V1HTTPIngressPath item);

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      setNewPathLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item);

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editPath(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editFirstPath();

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editLastPath();

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editMatchingPath(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
              predicate);

  public interface PathsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<
              io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<N>> {
    public N and();

    public N endPath();
  }
}
