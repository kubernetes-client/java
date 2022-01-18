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
public class V1NodeSelectorFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeSelectorFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeSelectorFluent<A> {
  public V1NodeSelectorFluentImpl() {}

  public V1NodeSelectorFluentImpl(io.kubernetes.client.openapi.models.V1NodeSelector instance) {
    this.withNodeSelectorTerms(instance.getNodeSelectorTerms());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
      nodeSelectorTerms;

  public A addToNodeSelectorTerms(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
    _visitables
        .get("nodeSelectorTerms")
        .add(index >= 0 ? index : _visitables.get("nodeSelectorTerms").size(), builder);
    this.nodeSelectorTerms.add(index >= 0 ? index : nodeSelectorTerms.size(), builder);
    return (A) this;
  }

  public A setToNodeSelectorTerms(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= _visitables.get("nodeSelectorTerms").size()) {
      _visitables.get("nodeSelectorTerms").add(builder);
    } else {
      _visitables.get("nodeSelectorTerms").set(index, builder);
    }
    if (index < 0 || index >= nodeSelectorTerms.size()) {
      nodeSelectorTerms.add(builder);
    } else {
      nodeSelectorTerms.set(index, builder);
    }
    return (A) this;
  }

  public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
      _visitables.get("nodeSelectorTerms").add(builder);
      this.nodeSelectorTerms.add(builder);
    }
    return (A) this;
  }

  public A addAllToNodeSelectorTerms(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
      _visitables.get("nodeSelectorTerms").add(builder);
      this.nodeSelectorTerms.add(builder);
    }
    return (A) this;
  }

  public A removeFromNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
      _visitables.get("nodeSelectorTerms").remove(builder);
      if (this.nodeSelectorTerms != null) {
        this.nodeSelectorTerms.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromNodeSelectorTerms(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(item);
      _visitables.get("nodeSelectorTerms").remove(builder);
      if (this.nodeSelectorTerms != null) {
        this.nodeSelectorTerms.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromNodeSelectorTerms(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate) {
    if (nodeSelectorTerms == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder> each =
        nodeSelectorTerms.iterator();
    final List visitables = _visitables.get("nodeSelectorTerms");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildNodeSelectorTerms instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm>
      getNodeSelectorTerms() {
    return nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm>
      buildNodeSelectorTerms() {
    return nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildNodeSelectorTerm(
      java.lang.Integer index) {
    return this.nodeSelectorTerms.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildFirstNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildLastNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(nodeSelectorTerms.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTerm buildMatchingNodeSelectorTerm(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder item : nodeSelectorTerms) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNodeSelectorTerm(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder item : nodeSelectorTerms) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNodeSelectorTerms(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorTerm> nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
      _visitables.get("nodeSelectorTerms").removeAll(this.nodeSelectorTerms);
    }
    if (nodeSelectorTerms != null) {
      this.nodeSelectorTerms = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : nodeSelectorTerms) {
        this.addToNodeSelectorTerms(item);
      }
    } else {
      this.nodeSelectorTerms = null;
    }
    return (A) this;
  }

  public A withNodeSelectorTerms(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
      this.nodeSelectorTerms.clear();
    }
    if (nodeSelectorTerms != null) {
      for (io.kubernetes.client.openapi.models.V1NodeSelectorTerm item : nodeSelectorTerms) {
        this.addToNodeSelectorTerms(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeSelectorTerms() {
    return nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      addNewNodeSelectorTerm() {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorFluentImpl
        .NodeSelectorTermsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      addNewNodeSelectorTermLike(io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorFluentImpl
        .NodeSelectorTermsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      setNewNodeSelectorTermLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorFluentImpl
        .NodeSelectorTermsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editNodeSelectorTerm(java.lang.Integer index) {
    if (nodeSelectorTerms.size() <= index)
      throw new RuntimeException("Can't edit nodeSelectorTerms. Index exceeds size.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editFirstNodeSelectorTerm() {
    if (nodeSelectorTerms.size() == 0)
      throw new RuntimeException("Can't edit first nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(0, buildNodeSelectorTerm(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editLastNodeSelectorTerm() {
    int index = nodeSelectorTerms.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<A>
      editMatchingNodeSelectorTerm(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < nodeSelectorTerms.size(); i++) {
      if (predicate.test(nodeSelectorTerms.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching nodeSelectorTerms. No match found.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSelectorFluentImpl that = (V1NodeSelectorFluentImpl) o;
    if (nodeSelectorTerms != null
        ? !nodeSelectorTerms.equals(that.nodeSelectorTerms)
        : that.nodeSelectorTerms != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(nodeSelectorTerms, super.hashCode());
  }

  public class NodeSelectorTermsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeSelectorFluent.NodeSelectorTermsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeSelectorTermsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorTerm item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(this, item);
    }

    NodeSelectorTermsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorTermBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeSelectorFluentImpl.this.setToNodeSelectorTerms(index, builder.build());
    }

    public N endNodeSelectorTerm() {
      return and();
    }
  }
}
