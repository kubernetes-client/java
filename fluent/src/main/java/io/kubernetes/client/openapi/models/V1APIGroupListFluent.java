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
public interface V1APIGroupListFluent<A extends V1APIGroupListFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public A addToGroups(Integer index, V1APIGroup item);

  public A setToGroups(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item);

  public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);

  public A addAllToGroups(Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);

  public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items);

  public A removeAllFromGroups(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items);

  public A removeMatchingFromGroups(Predicate<V1APIGroupBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildGroups instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1APIGroup> getGroups();

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

  public V1APIGroupListFluent.GroupsNested<A> addNewGroup();

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

  public interface GroupsNested<N>
      extends Nested<N>, V1APIGroupFluent<V1APIGroupListFluent.GroupsNested<N>> {
    public N and();

    public N endGroup();
  }
}
