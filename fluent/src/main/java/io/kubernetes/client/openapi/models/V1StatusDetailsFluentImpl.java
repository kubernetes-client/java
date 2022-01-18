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
public class V1StatusDetailsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1StatusDetailsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1StatusDetailsFluent<A> {
  public V1StatusDetailsFluentImpl() {}

  public V1StatusDetailsFluentImpl(io.kubernetes.client.openapi.models.V1StatusDetails instance) {
    this.withCauses(instance.getCauses());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    this.withUid(instance.getUid());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> causes;
  private java.lang.String group;
  private java.lang.String kind;
  private java.lang.String name;
  private java.lang.Integer retryAfterSeconds;
  private java.lang.String uid;

  public A addToCauses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1StatusCause item) {
    if (this.causes == null) {
      this.causes =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>();
    }
    io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
        new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
    _visitables.get("causes").add(index >= 0 ? index : _visitables.get("causes").size(), builder);
    this.causes.add(index >= 0 ? index : causes.size(), builder);
    return (A) this;
  }

  public A setToCauses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1StatusCause item) {
    if (this.causes == null) {
      this.causes =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>();
    }
    io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
        new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
    if (index < 0 || index >= _visitables.get("causes").size()) {
      _visitables.get("causes").add(builder);
    } else {
      _visitables.get("causes").set(index, builder);
    }
    if (index < 0 || index >= causes.size()) {
      causes.add(builder);
    } else {
      causes.set(index, builder);
    }
    return (A) this;
  }

  public A addToCauses(io.kubernetes.client.openapi.models.V1StatusCause... items) {
    if (this.causes == null) {
      this.causes =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1StatusCause item : items) {
      io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
          new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
      _visitables.get("causes").add(builder);
      this.causes.add(builder);
    }
    return (A) this;
  }

  public A addAllToCauses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items) {
    if (this.causes == null) {
      this.causes =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1StatusCause item : items) {
      io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
          new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
      _visitables.get("causes").add(builder);
      this.causes.add(builder);
    }
    return (A) this;
  }

  public A removeFromCauses(io.kubernetes.client.openapi.models.V1StatusCause... items) {
    for (io.kubernetes.client.openapi.models.V1StatusCause item : items) {
      io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
          new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
      _visitables.get("causes").remove(builder);
      if (this.causes != null) {
        this.causes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromCauses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1StatusCause> items) {
    for (io.kubernetes.client.openapi.models.V1StatusCause item : items) {
      io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder =
          new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(item);
      _visitables.get("causes").remove(builder);
      if (this.causes != null) {
        this.causes.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromCauses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>
          predicate) {
    if (causes == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1StatusCauseBuilder> each =
        causes.iterator();
    final List visitables = _visitables.get("causes");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildCauses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> getCauses() {
    return causes != null ? build(causes) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> buildCauses() {
    return causes != null ? build(causes) : null;
  }

  public io.kubernetes.client.openapi.models.V1StatusCause buildCause(java.lang.Integer index) {
    return this.causes.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1StatusCause buildFirstCause() {
    return this.causes.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1StatusCause buildLastCause() {
    return this.causes.get(causes.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1StatusCause buildMatchingCause(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1StatusCauseBuilder item : causes) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCause(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1StatusCauseBuilder item : causes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withCauses(java.util.List<io.kubernetes.client.openapi.models.V1StatusCause> causes) {
    if (this.causes != null) {
      _visitables.get("causes").removeAll(this.causes);
    }
    if (causes != null) {
      this.causes = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1StatusCause item : causes) {
        this.addToCauses(item);
      }
    } else {
      this.causes = null;
    }
    return (A) this;
  }

  public A withCauses(io.kubernetes.client.openapi.models.V1StatusCause... causes) {
    if (this.causes != null) {
      this.causes.clear();
    }
    if (causes != null) {
      for (io.kubernetes.client.openapi.models.V1StatusCause item : causes) {
        this.addToCauses(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasCauses() {
    return causes != null && !causes.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCause() {
    return new io.kubernetes.client.openapi.models.V1StatusDetailsFluentImpl.CausesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> addNewCauseLike(
      io.kubernetes.client.openapi.models.V1StatusCause item) {
    return new io.kubernetes.client.openapi.models.V1StatusDetailsFluentImpl.CausesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> setNewCauseLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1StatusCause item) {
    return new io.kubernetes.client.openapi.models.V1StatusDetailsFluentImpl.CausesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editCause(
      java.lang.Integer index) {
    if (causes.size() <= index)
      throw new RuntimeException("Can't edit causes. Index exceeds size.");
    return setNewCauseLike(index, buildCause(index));
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A>
      editFirstCause() {
    if (causes.size() == 0)
      throw new RuntimeException("Can't edit first causes. The list is empty.");
    return setNewCauseLike(0, buildCause(0));
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A> editLastCause() {
    int index = causes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last causes. The list is empty.");
    return setNewCauseLike(index, buildCause(index));
  }

  public io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<A>
      editMatchingCause(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1StatusCauseBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < causes.size(); i++) {
      if (predicate.test(causes.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching causes. No match found.");
    return setNewCauseLike(index, buildCause(index));
  }

  public java.lang.String getGroup() {
    return this.group;
  }

  public A withGroup(java.lang.String group) {
    this.group = group;
    return (A) this;
  }

  public java.lang.Boolean hasGroup() {
    return this.group != null;
  }

  /** Method is deprecated. use withGroup instead. */
  @java.lang.Deprecated
  public A withNewGroup(java.lang.String original) {
    return (A) withGroup(new String(original));
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

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public java.lang.Integer getRetryAfterSeconds() {
    return this.retryAfterSeconds;
  }

  public A withRetryAfterSeconds(java.lang.Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasRetryAfterSeconds() {
    return this.retryAfterSeconds != null;
  }

  public java.lang.String getUid() {
    return this.uid;
  }

  public A withUid(java.lang.String uid) {
    this.uid = uid;
    return (A) this;
  }

  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original) {
    return (A) withUid(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatusDetailsFluentImpl that = (V1StatusDetailsFluentImpl) o;
    if (causes != null ? !causes.equals(that.causes) : that.causes != null) return false;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (retryAfterSeconds != null
        ? !retryAfterSeconds.equals(that.retryAfterSeconds)
        : that.retryAfterSeconds != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        causes, group, kind, name, retryAfterSeconds, uid, super.hashCode());
  }

  public class CausesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1StatusCauseFluentImpl<
          io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatusDetailsFluent.CausesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CausesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1StatusCause item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(this, item);
    }

    CausesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1StatusCauseBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StatusCauseBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1StatusDetailsFluentImpl.this.setToCauses(index, builder.build());
    }

    public N endCause() {
      return and();
    }
  }
}
