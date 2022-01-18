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
public class V1ScopeSelectorFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ScopeSelectorFluent<A> {
  public V1ScopeSelectorFluentImpl() {}

  public V1ScopeSelectorFluentImpl(io.kubernetes.client.openapi.models.V1ScopeSelector instance) {
    this.withMatchExpressions(instance.getMatchExpressions());
  }

  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
      matchExpressions;

  public A addToMatchExpressions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
    _visitables
        .get("matchExpressions")
        .add(index >= 0 ? index : _visitables.get("matchExpressions").size(), builder);
    this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder);
    return (A) this;
  }

  public A setToMatchExpressions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
    if (index < 0 || index >= _visitables.get("matchExpressions").size()) {
      _visitables.get("matchExpressions").add(builder);
    } else {
      _visitables.get("matchExpressions").set(index, builder);
    }
    if (index < 0 || index >= matchExpressions.size()) {
      matchExpressions.add(builder);
    } else {
      matchExpressions.set(index, builder);
    }
    return (A) this;
  }

  public A addToMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").add(builder);
      this.matchExpressions.add(builder);
    }
    return (A) this;
  }

  public A addAllToMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
          items) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").add(builder);
      this.matchExpressions.add(builder);
    }
    return (A) this;
  }

  public A removeFromMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... items) {
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").remove(builder);
      if (this.matchExpressions != null) {
        this.matchExpressions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
          items) {
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").remove(builder);
      if (this.matchExpressions != null) {
        this.matchExpressions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromMatchExpressions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
          predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
        each = matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder =
          each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildMatchExpressions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
      getMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
      buildMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildMatchExpression(java.lang.Integer index) {
    return this.matchExpressions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement
      buildMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder item :
        matchExpressions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMatchExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder item :
        matchExpressions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMatchExpressions(
      java.util.List<io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement>
          matchExpressions) {
    if (this.matchExpressions != null) {
      _visitables.get("matchExpressions").removeAll(this.matchExpressions);
    }
    if (matchExpressions != null) {
      this.matchExpressions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item :
          matchExpressions) {
        this.addToMatchExpressions(item);
      }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }

  public A withMatchExpressions(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {
      this.matchExpressions.clear();
    }
    if (matchExpressions != null) {
      for (io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item :
          matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMatchExpressions() {
    return matchExpressions != null && !matchExpressions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      addNewMatchExpression() {
    return new io.kubernetes.client.openapi.models.V1ScopeSelectorFluentImpl
        .MatchExpressionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      addNewMatchExpressionLike(
          io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1ScopeSelectorFluentImpl
        .MatchExpressionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      setNewMatchExpressionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1ScopeSelectorFluentImpl
        .MatchExpressionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editMatchExpression(java.lang.Integer index) {
    if (matchExpressions.size() <= index)
      throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editFirstMatchExpression() {
    if (matchExpressions.size() == 0)
      throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }

  public io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<A>
      editMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < matchExpressions.size(); i++) {
      if (predicate.test(matchExpressions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScopeSelectorFluentImpl that = (V1ScopeSelectorFluentImpl) o;
    if (matchExpressions != null
        ? !matchExpressions.equals(that.matchExpressions)
        : that.matchExpressions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(matchExpressions, super.hashCode());
  }

  public class MatchExpressionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluentImpl<
          io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ScopeSelectorFluent.MatchExpressionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MatchExpressionsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(
              this, item);
    }

    MatchExpressionsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ScopeSelectorFluentImpl.this.setToMatchExpressions(index, builder.build());
    }

    public N endMatchExpression() {
      return and();
    }
  }
}
