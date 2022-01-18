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
public class V1NodeSelectorTermFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent<A> {
  public V1NodeSelectorTermFluentImpl() {}

  public V1NodeSelectorTermFluentImpl(
      io.kubernetes.client.openapi.models.V1NodeSelectorTerm instance) {
    this.withMatchExpressions(instance.getMatchExpressions());

    this.withMatchFields(instance.getMatchFields());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
      matchExpressions;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
      matchFields;

  public A addToMatchExpressions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
    _visitables
        .get("matchExpressions")
        .add(index >= 0 ? index : _visitables.get("matchExpressions").size(), builder);
    this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder);
    return (A) this;
  }

  public A setToMatchExpressions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
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
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").add(builder);
      this.matchExpressions.add(builder);
    }
    return (A) this;
  }

  public A addAllToMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items) {
    if (this.matchExpressions == null) {
      this.matchExpressions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").add(builder);
      this.matchExpressions.add(builder);
    }
    return (A) this;
  }

  public A removeFromMatchExpressions(
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").remove(builder);
      if (this.matchExpressions != null) {
        this.matchExpressions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromMatchExpressions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchExpressions").remove(builder);
      if (this.matchExpressions != null) {
        this.matchExpressions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromMatchExpressions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    if (matchExpressions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> each =
        matchExpressions.iterator();
    final List visitables = _visitables.get("matchExpressions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement>
      getMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement>
      buildMatchExpressions() {
    return matchExpressions != null ? build(matchExpressions) : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchExpression(
      java.lang.Integer index) {
    return this.matchExpressions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildFirstMatchExpression() {
    return this.matchExpressions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildLastMatchExpression() {
    return this.matchExpressions.get(matchExpressions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchingMatchExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder item :
        matchExpressions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMatchExpression(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder item :
        matchExpressions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMatchExpressions(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement>
          matchExpressions) {
    if (this.matchExpressions != null) {
      _visitables.get("matchExpressions").removeAll(this.matchExpressions);
    }
    if (matchExpressions != null) {
      this.matchExpressions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    } else {
      this.matchExpressions = null;
    }
    return (A) this;
  }

  public A withMatchExpressions(
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchExpressions) {
    if (this.matchExpressions != null) {
      this.matchExpressions.clear();
    }
    if (matchExpressions != null) {
      for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : matchExpressions) {
        this.addToMatchExpressions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMatchExpressions() {
    return matchExpressions != null && !matchExpressions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      addNewMatchExpression() {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchExpressionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      addNewMatchExpressionLike(
          io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchExpressionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      setNewMatchExpressionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchExpressionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      editMatchExpression(java.lang.Integer index) {
    if (matchExpressions.size() <= index)
      throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      editFirstMatchExpression() {
    if (matchExpressions.size() == 0)
      throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(0, buildMatchExpression(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      editLastMatchExpression() {
    int index = matchExpressions.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
    return setNewMatchExpressionLike(index, buildMatchExpression(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<A>
      editMatchingMatchExpression(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
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

  public A addToMatchFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {
      this.matchFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
    _visitables
        .get("matchFields")
        .add(index >= 0 ? index : _visitables.get("matchFields").size(), builder);
    this.matchFields.add(index >= 0 ? index : matchFields.size(), builder);
    return (A) this;
  }

  public A setToMatchFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    if (this.matchFields == null) {
      this.matchFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
    if (index < 0 || index >= _visitables.get("matchFields").size()) {
      _visitables.get("matchFields").add(builder);
    } else {
      _visitables.get("matchFields").set(index, builder);
    }
    if (index < 0 || index >= matchFields.size()) {
      matchFields.add(builder);
    } else {
      matchFields.set(index, builder);
    }
    return (A) this;
  }

  public A addToMatchFields(
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    if (this.matchFields == null) {
      this.matchFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchFields").add(builder);
      this.matchFields.add(builder);
    }
    return (A) this;
  }

  public A addAllToMatchFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items) {
    if (this.matchFields == null) {
      this.matchFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchFields").add(builder);
      this.matchFields.add(builder);
    }
    return (A) this;
  }

  public A removeFromMatchFields(
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchFields").remove(builder);
      if (this.matchFields != null) {
        this.matchFields.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromMatchFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> items) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : items) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(item);
      _visitables.get("matchFields").remove(builder);
      if (this.matchFields != null) {
        this.matchFields.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromMatchFields(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    if (matchFields == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder> each =
        matchFields.iterator();
    final List visitables = _visitables.get("matchFields");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildMatchFields instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement>
      getMatchFields() {
    return matchFields != null ? build(matchFields) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement>
      buildMatchFields() {
    return matchFields != null ? build(matchFields) : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchField(
      java.lang.Integer index) {
    return this.matchFields.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildFirstMatchField() {
    return this.matchFields.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildLastMatchField() {
    return this.matchFields.get(matchFields.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorRequirement buildMatchingMatchField(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder item : matchFields) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMatchField(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder item : matchFields) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMatchFields(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeSelectorRequirement> matchFields) {
    if (this.matchFields != null) {
      _visitables.get("matchFields").removeAll(this.matchFields);
    }
    if (matchFields != null) {
      this.matchFields = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : matchFields) {
        this.addToMatchFields(item);
      }
    } else {
      this.matchFields = null;
    }
    return (A) this;
  }

  public A withMatchFields(
      io.kubernetes.client.openapi.models.V1NodeSelectorRequirement... matchFields) {
    if (this.matchFields != null) {
      this.matchFields.clear();
    }
    if (matchFields != null) {
      for (io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item : matchFields) {
        this.addToMatchFields(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMatchFields() {
    return matchFields != null && !matchFields.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      addNewMatchField() {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchFieldsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      addNewMatchFieldLike(io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchFieldsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      setNewMatchFieldLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
    return new io.kubernetes.client.openapi.models.V1NodeSelectorTermFluentImpl
        .MatchFieldsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      editMatchField(java.lang.Integer index) {
    if (matchFields.size() <= index)
      throw new RuntimeException("Can't edit matchFields. Index exceeds size.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      editFirstMatchField() {
    if (matchFields.size() == 0)
      throw new RuntimeException("Can't edit first matchFields. The list is empty.");
    return setNewMatchFieldLike(0, buildMatchField(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      editLastMatchField() {
    int index = matchFields.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchFields. The list is empty.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<A>
      editMatchingMatchField(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < matchFields.size(); i++) {
      if (predicate.test(matchFields.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching matchFields. No match found.");
    return setNewMatchFieldLike(index, buildMatchField(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSelectorTermFluentImpl that = (V1NodeSelectorTermFluentImpl) o;
    if (matchExpressions != null
        ? !matchExpressions.equals(that.matchExpressions)
        : that.matchExpressions != null) return false;
    if (matchFields != null ? !matchFields.equals(that.matchFields) : that.matchFields != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(matchExpressions, matchFields, super.hashCode());
  }

  public class MatchExpressionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchExpressionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent
                  .MatchExpressionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MatchExpressionsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(this, item);
    }

    MatchExpressionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeSelectorTermFluentImpl.this.setToMatchExpressions(index, builder.build());
    }

    public N endMatchExpression() {
      return and();
    }
  }

  public class MatchFieldsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSelectorRequirementFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeSelectorTermFluent.MatchFieldsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MatchFieldsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1NodeSelectorRequirement item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(this, item);
    }

    MatchFieldsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSelectorRequirementBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeSelectorTermFluentImpl.this.setToMatchFields(index, builder.build());
    }

    public N endMatchField() {
      return and();
    }
  }
}
