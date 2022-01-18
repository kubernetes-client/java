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
public class V1PodDisruptionBudgetStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<A> {
  public V1PodDisruptionBudgetStatusFluentImpl() {}

  public V1PodDisruptionBudgetStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus instance) {
    this.withConditions(instance.getConditions());

    this.withCurrentHealthy(instance.getCurrentHealthy());

    this.withDesiredHealthy(instance.getDesiredHealthy());

    this.withDisruptedPods(instance.getDisruptedPods());

    this.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    this.withExpectedPods(instance.getExpectedPods());

    this.withObservedGeneration(instance.getObservedGeneration());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder> conditions;
  private java.lang.Integer currentHealthy;
  private java.lang.Integer desiredHealthy;
  private java.util.Map<java.lang.String, java.time.OffsetDateTime> disruptedPods;
  private java.lang.Integer disruptionsAllowed;
  private java.lang.Integer expectedPods;
  private java.lang.Long observedGeneration;

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
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

  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items) {
    for (io.kubernetes.client.openapi.models.V1Condition item : items) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ConditionBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1Condition buildCondition(java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Condition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1Condition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Condition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1Condition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluentImpl
        .ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1Condition item) {
    return new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluentImpl
        .ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
    return new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluentImpl
        .ConditionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder>
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

  public java.lang.Integer getCurrentHealthy() {
    return this.currentHealthy;
  }

  public A withCurrentHealthy(java.lang.Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentHealthy() {
    return this.currentHealthy != null;
  }

  public java.lang.Integer getDesiredHealthy() {
    return this.desiredHealthy;
  }

  public A withDesiredHealthy(java.lang.Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return (A) this;
  }

  public java.lang.Boolean hasDesiredHealthy() {
    return this.desiredHealthy != null;
  }

  public A addToDisruptedPods(java.lang.String key, java.time.OffsetDateTime value) {
    if (this.disruptedPods == null && key != null && value != null) {
      this.disruptedPods = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.disruptedPods.put(key, value);
    }
    return (A) this;
  }

  public A addToDisruptedPods(java.util.Map<java.lang.String, java.time.OffsetDateTime> map) {
    if (this.disruptedPods == null && map != null) {
      this.disruptedPods = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.disruptedPods.putAll(map);
    }
    return (A) this;
  }

  public A removeFromDisruptedPods(java.lang.String key) {
    if (this.disruptedPods == null) {
      return (A) this;
    }
    if (key != null && this.disruptedPods != null) {
      this.disruptedPods.remove(key);
    }
    return (A) this;
  }

  public A removeFromDisruptedPods(java.util.Map<java.lang.String, java.time.OffsetDateTime> map) {
    if (this.disruptedPods == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.disruptedPods != null) {
          this.disruptedPods.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.time.OffsetDateTime> getDisruptedPods() {
    return this.disruptedPods;
  }

  public <K, V> A withDisruptedPods(
      java.util.Map<java.lang.String, java.time.OffsetDateTime> disruptedPods) {
    if (disruptedPods == null) {
      this.disruptedPods = null;
    } else {
      this.disruptedPods = new java.util.LinkedHashMap(disruptedPods);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDisruptedPods() {
    return this.disruptedPods != null;
  }

  public java.lang.Integer getDisruptionsAllowed() {
    return this.disruptionsAllowed;
  }

  public A withDisruptionsAllowed(java.lang.Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return (A) this;
  }

  public java.lang.Boolean hasDisruptionsAllowed() {
    return this.disruptionsAllowed != null;
  }

  public java.lang.Integer getExpectedPods() {
    return this.expectedPods;
  }

  public A withExpectedPods(java.lang.Integer expectedPods) {
    this.expectedPods = expectedPods;
    return (A) this;
  }

  public java.lang.Boolean hasExpectedPods() {
    return this.expectedPods != null;
  }

  public java.lang.Long getObservedGeneration() {
    return this.observedGeneration;
  }

  public A withObservedGeneration(java.lang.Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }

  public java.lang.Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodDisruptionBudgetStatusFluentImpl that = (V1PodDisruptionBudgetStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (currentHealthy != null
        ? !currentHealthy.equals(that.currentHealthy)
        : that.currentHealthy != null) return false;
    if (desiredHealthy != null
        ? !desiredHealthy.equals(that.desiredHealthy)
        : that.desiredHealthy != null) return false;
    if (disruptedPods != null
        ? !disruptedPods.equals(that.disruptedPods)
        : that.disruptedPods != null) return false;
    if (disruptionsAllowed != null
        ? !disruptionsAllowed.equals(that.disruptionsAllowed)
        : that.disruptionsAllowed != null) return false;
    if (expectedPods != null ? !expectedPods.equals(that.expectedPods) : that.expectedPods != null)
      return false;
    if (observedGeneration != null
        ? !observedGeneration.equals(that.observedGeneration)
        : that.observedGeneration != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        conditions,
        currentHealthy,
        desiredHealthy,
        disruptedPods,
        disruptionsAllowed,
        expectedPods,
        observedGeneration,
        super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent
                  .ConditionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1Condition item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1PodDisruptionBudgetStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
