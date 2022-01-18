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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1APIGroupListFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1APIGroupListFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1APIGroupListFluent<A> {
  public V1APIGroupListFluentImpl() {}

  public V1APIGroupListFluentImpl(io.kubernetes.client.openapi.models.V1APIGroupList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withGroups(instance.getGroups());

    this.withKind(instance.getKind());
  }

  private java.lang.String apiVersion;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIGroupBuilder> groups;
  private java.lang.String kind;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public A addToGroups(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item) {
    if (this.groups == null) {
      this.groups =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIGroupBuilder>();
    }
    io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
        new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
    _visitables.get("groups").add(index >= 0 ? index : _visitables.get("groups").size(), builder);
    this.groups.add(index >= 0 ? index : groups.size(), builder);
    return (A) this;
  }

  public A setToGroups(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item) {
    if (this.groups == null) {
      this.groups =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIGroupBuilder>();
    }
    io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
        new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
    if (index < 0 || index >= _visitables.get("groups").size()) {
      _visitables.get("groups").add(builder);
    } else {
      _visitables.get("groups").set(index, builder);
    }
    if (index < 0 || index >= groups.size()) {
      groups.add(builder);
    } else {
      groups.set(index, builder);
    }
    return (A) this;
  }

  public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items) {
    if (this.groups == null) {
      this.groups =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIGroupBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1APIGroup item : items) {
      io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
      _visitables.get("groups").add(builder);
      this.groups.add(builder);
    }
    return (A) this;
  }

  public A addAllToGroups(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items) {
    if (this.groups == null) {
      this.groups =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIGroupBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1APIGroup item : items) {
      io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
      _visitables.get("groups").add(builder);
      this.groups.add(builder);
    }
    return (A) this;
  }

  public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items) {
    for (io.kubernetes.client.openapi.models.V1APIGroup item : items) {
      io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
      _visitables.get("groups").remove(builder);
      if (this.groups != null) {
        this.groups.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromGroups(
      java.util.Collection<io.kubernetes.client.openapi.models.V1APIGroup> items) {
    for (io.kubernetes.client.openapi.models.V1APIGroup item : items) {
      io.kubernetes.client.openapi.models.V1APIGroupBuilder builder =
          new io.kubernetes.client.openapi.models.V1APIGroupBuilder(item);
      _visitables.get("groups").remove(builder);
      if (this.groups != null) {
        this.groups.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromGroups(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate) {
    if (groups == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1APIGroupBuilder> each = groups.iterator();
    final List visitables = _visitables.get("groups");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1APIGroupBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildGroups instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> getGroups() {
    return groups != null ? build(groups) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> buildGroups() {
    return groups != null ? build(groups) : null;
  }

  public io.kubernetes.client.openapi.models.V1APIGroup buildGroup(java.lang.Integer index) {
    return this.groups.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1APIGroup buildFirstGroup() {
    return this.groups.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1APIGroup buildLastGroup() {
    return this.groups.get(groups.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1APIGroup buildMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1APIGroupBuilder item : groups) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1APIGroupBuilder item : groups) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withGroups(java.util.List<io.kubernetes.client.openapi.models.V1APIGroup> groups) {
    if (this.groups != null) {
      _visitables.get("groups").removeAll(this.groups);
    }
    if (groups != null) {
      this.groups = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1APIGroup item : groups) {
        this.addToGroups(item);
      }
    } else {
      this.groups = null;
    }
    return (A) this;
  }

  public A withGroups(io.kubernetes.client.openapi.models.V1APIGroup... groups) {
    if (this.groups != null) {
      this.groups.clear();
    }
    if (groups != null) {
      for (io.kubernetes.client.openapi.models.V1APIGroup item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasGroups() {
    return groups != null && !groups.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroup() {
    return new io.kubernetes.client.openapi.models.V1APIGroupListFluentImpl.GroupsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> addNewGroupLike(
      io.kubernetes.client.openapi.models.V1APIGroup item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupListFluentImpl.GroupsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> setNewGroupLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item) {
    return new io.kubernetes.client.openapi.models.V1APIGroupListFluentImpl.GroupsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editGroup(
      java.lang.Integer index) {
    if (groups.size() <= index)
      throw new RuntimeException("Can't edit groups. Index exceeds size.");
    return setNewGroupLike(index, buildGroup(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editFirstGroup() {
    if (groups.size() == 0)
      throw new RuntimeException("Can't edit first groups. The list is empty.");
    return setNewGroupLike(0, buildGroup(0));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editLastGroup() {
    int index = groups.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last groups. The list is empty.");
    return setNewGroupLike(index, buildGroup(index));
  }

  public io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<A> editMatchingGroup(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIGroupBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < groups.size(); i++) {
      if (predicate.test(groups.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching groups. No match found.");
    return setNewGroupLike(index, buildGroup(index));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIGroupListFluentImpl that = (V1APIGroupListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (groups != null ? !groups.equals(that.groups) : that.groups != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, groups, kind, super.hashCode());
  }

  public class GroupsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1APIGroupFluentImpl<
          io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<N>>
      implements io.kubernetes.client.openapi.models.V1APIGroupListFluent.GroupsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    GroupsNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1APIGroup item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1APIGroupBuilder(this, item);
    }

    GroupsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1APIGroupBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1APIGroupBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1APIGroupListFluentImpl.this.setToGroups(index, builder.build());
    }

    public N endGroup() {
      return and();
    }
  }
}
