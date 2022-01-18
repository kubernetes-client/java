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
public interface V1APIGroupListFluent<
        A extends io.kubernetes.client.openapi.models.V1APIGroupListFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public A addToGroups(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item);

  public A setToGroups(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item);

  public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);

  public A addAllToGroups(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);

  public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);

  public A removeAllFromGroups(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);

  public A removeMatchingFromGroups(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildGroups instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> getGroups();

  public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> buildGroups();

  public io.kubernetes.client.openapi.models.V1APIGroup buildGroup(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIGroup buildFirstGroup();

  public io.kubernetes.client.openapi.models.V1APIGroup buildLastGroup();

  public io.kubernetes.client.openapi.models.V1APIGroup buildMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate);

  public java.lang.Boolean hasMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate);

  public A withGroups(java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> groups);

  public A withGroups(io.kubernetes.client.openapi.models.V1APIGroup... groups);

  public java.lang.Boolean hasGroups();

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroup();

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroupLike(
      io.kubernetes.client.openapi.models.V1APIGroup item);

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> setNewGroupLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item);

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editGroup(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editFirstGroup();

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editLastGroup();

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public interface GroupsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1APIGroupFluent<
              io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<N>> {
    public N and();

    public N endGroup();
  }
}
