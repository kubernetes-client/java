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
public class V1NodeAffinityFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeAffinityFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeAffinityFluent<A> {
  public V1NodeAffinityFluentImpl() {}

  public V1NodeAffinityFluentImpl(io.kubernetes.client.openapi.models.V1NodeAffinity instance) {
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
      preferredDuringSchedulingIgnoredDuringExecution;
  private io.kubernetes.client.openapi.models.V1NodeSelectorBuilder
      requiredDuringSchedulingIgnoredDuringExecution;

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
    _visitables
        .get("preferredDuringSchedulingIgnoredDuringExecution")
        .add(
            index >= 0
                ? index
                : _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size(),
            builder);
    this.preferredDuringSchedulingIgnoredDuringExecution.add(
        index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder);
    return (A) this;
  }

  public A setToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
    if (index < 0
        || index >= _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size()) {
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
    } else {
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder);
    }
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) {
      preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
      preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);
    }
    return (A) this;
  }

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item : items) {
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item : items) {
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items) {
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item : items) {
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm> items) {
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item : items) {
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
          predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder> each =
        preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
      getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        ? build(preferredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
      buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        ? build(preferredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution
        .get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1)
        .build();
  }

  public io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm
      buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder item :
        preferredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder item :
        preferredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm>
          preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      _visitables
          .get("preferredDuringSchedulingIgnoredDuringExecution")
          .removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item :
          preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm...
          preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this.preferredDuringSchedulingIgnoredDuringExecution.clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item :
          preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item) {
    return new io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item) {
    return new io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index)
      throw new RuntimeException(
          "Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0)
      throw new RuntimeException(
          "Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0)
      throw new RuntimeException(
          "Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < preferredDuringSchedulingIgnoredDuringExecution.size(); i++) {
      if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException(
          "Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  /**
   * This method has been deprecated, please use method
   * buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeSelector
      getRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null
        ? this.requiredDuringSchedulingIgnoredDuringExecution.build()
        : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelector
      buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null
        ? this.requiredDuringSchedulingIgnoredDuringExecution.build()
        : null;
  }

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1NodeSelector
          requiredDuringSchedulingIgnoredDuringExecution) {
    _visitables
        .get("requiredDuringSchedulingIgnoredDuringExecution")
        .remove(this.requiredDuringSchedulingIgnoredDuringExecution);
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(
              requiredDuringSchedulingIgnoredDuringExecution);
      _visitables
          .get("requiredDuringSchedulingIgnoredDuringExecution")
          .add(this.requiredDuringSchedulingIgnoredDuringExecution);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      withNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl
        .RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1NodeSelector item) {
    return new io.kubernetes.client.openapi.models.V1NodeAffinityFluentImpl
        .RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        getRequiredDuringSchedulingIgnoredDuringExecution());
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        getRequiredDuringSchedulingIgnoredDuringExecution() != null
            ? getRequiredDuringSchedulingIgnoredDuringExecution()
            : new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1NodeSelector item) {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        getRequiredDuringSchedulingIgnoredDuringExecution() != null
            ? getRequiredDuringSchedulingIgnoredDuringExecution()
            : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeAffinityFluentImpl that = (V1NodeAffinityFluentImpl) o;
    if (preferredDuringSchedulingIgnoredDuringExecution != null
        ? !preferredDuringSchedulingIgnoredDuringExecution.equals(
            that.preferredDuringSchedulingIgnoredDuringExecution)
        : that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
    if (requiredDuringSchedulingIgnoredDuringExecution != null
        ? !requiredDuringSchedulingIgnoredDuringExecution.equals(
            that.requiredDuringSchedulingIgnoredDuringExecution)
        : that.requiredDuringSchedulingIgnoredDuringExecution != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        preferredDuringSchedulingIgnoredDuringExecution,
        requiredDuringSchedulingIgnoredDuringExecution,
        super.hashCode());
  }

  public class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PreferredSchedulingTermFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeAffinityFluent
                  .PreferredDuringSchedulingIgnoredDuringExecutionNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1NodeAffinityFluent
                  .PreferredDuringSchedulingIgnoredDuringExecutionNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(this, item);
    }

    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PreferredSchedulingTermBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1NodeAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(
              index, builder.build());
    }

    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
  }

  public class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeAffinityFluent
                  .RequiredDuringSchedulingIgnoredDuringExecutionNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1NodeAffinityFluent
                  .RequiredDuringSchedulingIgnoredDuringExecutionNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(
        io.kubernetes.client.openapi.models.V1NodeSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(this, item);
    }

    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorBuilder builder;

    public N and() {
      return (N)
          V1NodeAffinityFluentImpl.this.withRequiredDuringSchedulingIgnoredDuringExecution(
              builder.build());
    }

    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
  }
}
