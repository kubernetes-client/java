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
public class V1HTTPIngressRuleValueFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent<A> {
  public V1HTTPIngressRuleValueFluentImpl() {}

  public V1HTTPIngressRuleValueFluentImpl(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue instance) {
    this.withPaths(instance.getPaths());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> paths;

  public A addToPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item) {
    if (this.paths == null) {
      this.paths =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
    _visitables.get("paths").add(index >= 0 ? index : _visitables.get("paths").size(), builder);
    this.paths.add(index >= 0 ? index : paths.size(), builder);
    return (A) this;
  }

  public A setToPaths(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item) {
    if (this.paths == null) {
      this.paths =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
        new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
    if (index < 0 || index >= _visitables.get("paths").size()) {
      _visitables.get("paths").add(builder);
    } else {
      _visitables.get("paths").set(index, builder);
    }
    if (index < 0 || index >= paths.size()) {
      paths.add(builder);
    } else {
      paths.set(index, builder);
    }
    return (A) this;
  }

  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items) {
    if (this.paths == null) {
      this.paths =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : items) {
      io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
      _visitables.get("paths").add(builder);
      this.paths.add(builder);
    }
    return (A) this;
  }

  public A addAllToPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items) {
    if (this.paths == null) {
      this.paths =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : items) {
      io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
      _visitables.get("paths").add(builder);
      this.paths.add(builder);
    }
    return (A) this;
  }

  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items) {
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : items) {
      io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
      _visitables.get("paths").remove(builder);
      if (this.paths != null) {
        this.paths.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPaths(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPIngressPath> items) {
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : items) {
      io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(item);
      _visitables.get("paths").remove(builder);
      if (this.paths != null) {
        this.paths.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPaths(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate) {
    if (paths == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder> each =
        paths.iterator();
    final List visitables = _visitables.get("paths");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildPaths instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> getPaths() {
    return paths != null ? build(paths) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> buildPaths() {
    return paths != null ? build(paths) : null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildPath(java.lang.Integer index) {
    return this.paths.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildFirstPath() {
    return this.paths.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildLastPath() {
    return this.paths.get(paths.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressPath buildMatchingPath(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder item : paths) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPath(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder item : paths) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPaths(java.util.List<io.kubernetes.client.openapi.models.V1HTTPIngressPath> paths) {
    if (this.paths != null) {
      _visitables.get("paths").removeAll(this.paths);
    }
    if (paths != null) {
      this.paths = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : paths) {
        this.addToPaths(item);
      }
    } else {
      this.paths = null;
    }
    return (A) this;
  }

  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths) {
    if (this.paths != null) {
      this.paths.clear();
    }
    if (paths != null) {
      for (io.kubernetes.client.openapi.models.V1HTTPIngressPath item : paths) {
        this.addToPaths(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPaths() {
    return paths != null && !paths.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      addNewPath() {
    return new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluentImpl
        .PathsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      addNewPathLike(io.kubernetes.client.openapi.models.V1HTTPIngressPath item) {
    return new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluentImpl.PathsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      setNewPathLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item) {
    return new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluentImpl.PathsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A> editPath(
      java.lang.Integer index) {
    if (paths.size() <= index) throw new RuntimeException("Can't edit paths. Index exceeds size.");
    return setNewPathLike(index, buildPath(index));
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editFirstPath() {
    if (paths.size() == 0) throw new RuntimeException("Can't edit first paths. The list is empty.");
    return setNewPathLike(0, buildPath(0));
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editLastPath() {
    int index = paths.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last paths. The list is empty.");
    return setNewPathLike(index, buildPath(index));
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<A>
      editMatchingPath(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < paths.size(); i++) {
      if (predicate.test(paths.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching paths. No match found.");
    return setNewPathLike(index, buildPath(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPIngressRuleValueFluentImpl that = (V1HTTPIngressRuleValueFluentImpl) o;
    if (paths != null ? !paths.equals(that.paths) : that.paths != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(paths, super.hashCode());
  }

  public class PathsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluentImpl<
          io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<N>>
      implements io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluent.PathsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PathsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPIngressPath item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(this, item);
    }

    PathsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HTTPIngressPathBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1HTTPIngressRuleValueFluentImpl.this.setToPaths(index, builder.build());
    }

    public N endPath() {
      return and();
    }
  }
}
