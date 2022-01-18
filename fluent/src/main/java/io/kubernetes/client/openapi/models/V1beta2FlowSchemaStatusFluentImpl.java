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
public class V1beta2FlowSchemaStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent<A> {
  public V1beta2FlowSchemaStatusFluentImpl() {}

  public V1beta2FlowSchemaStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatus instance) {
    this.withConditions(instance.getConditions());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
      conditions;

  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) {
      _visitables.get("conditions").add(builder);
    } else {
      _visitables.get("conditions").set(index, builder);
    }
    if (index < 0 || index >= conditions.size()) {
      conditions.add(builder);
    } else {
      conditions.set(index, builder);
    }
    return (A) this;
  }

  public A addToConditions(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : items) {
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : items) {
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... items) {
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : items) {
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> items) {
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : items) {
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition>
      getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition>
      buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition buildMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluentImpl
        .ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluentImpl
        .ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item) {
    return new io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluentImpl
        .ConditionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < conditions.size(); i++) {
      if (predicate.test(conditions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2FlowSchemaStatusFluentImpl that = (V1beta2FlowSchemaStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(conditions, super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2FlowSchemaStatusFluent.ConditionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1beta2FlowSchemaStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
