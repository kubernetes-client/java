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
public class V1DaemonSetStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent<A> {
  public V1DaemonSetStatusFluentImpl() {}

  public V1DaemonSetStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1DaemonSetStatus instance) {
    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());

    this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());

    this.withNumberAvailable(instance.getNumberAvailable());

    this.withNumberMisscheduled(instance.getNumberMisscheduled());

    this.withNumberReady(instance.getNumberReady());

    this.withNumberUnavailable(instance.getNumberUnavailable());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());
  }

  private java.lang.Integer collisionCount;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>
      conditions;
  private java.lang.Integer currentNumberScheduled;
  private java.lang.Integer desiredNumberScheduled;
  private java.lang.Integer numberAvailable;
  private java.lang.Integer numberMisscheduled;
  private java.lang.Integer numberReady;
  private java.lang.Integer numberUnavailable;
  private java.lang.Long observedGeneration;
  private java.lang.Integer updatedNumberScheduled;

  public java.lang.Integer getCollisionCount() {
    return this.collisionCount;
  }

  public A withCollisionCount(java.lang.Integer collisionCount) {
    this.collisionCount = collisionCount;
    return (A) this;
  }

  public java.lang.Boolean hasCollisionCount() {
    return this.collisionCount != null;
  }

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1DaemonSetCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1DaemonSetCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
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

  public A addToConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1DaemonSetCondition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... items) {
    for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1DaemonSetCondition> items) {
    for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition>
      buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1DaemonSetCondition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1DaemonSetCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1DaemonSetCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetStatusFluentImpl
        .ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1DaemonSetCondition item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetStatusFluentImpl.ConditionsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1DaemonSetCondition item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetStatusFluentImpl.ConditionsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder>
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

  public java.lang.Integer getCurrentNumberScheduled() {
    return this.currentNumberScheduled;
  }

  public A withCurrentNumberScheduled(java.lang.Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentNumberScheduled() {
    return this.currentNumberScheduled != null;
  }

  public java.lang.Integer getDesiredNumberScheduled() {
    return this.desiredNumberScheduled;
  }

  public A withDesiredNumberScheduled(java.lang.Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return (A) this;
  }

  public java.lang.Boolean hasDesiredNumberScheduled() {
    return this.desiredNumberScheduled != null;
  }

  public java.lang.Integer getNumberAvailable() {
    return this.numberAvailable;
  }

  public A withNumberAvailable(java.lang.Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return (A) this;
  }

  public java.lang.Boolean hasNumberAvailable() {
    return this.numberAvailable != null;
  }

  public java.lang.Integer getNumberMisscheduled() {
    return this.numberMisscheduled;
  }

  public A withNumberMisscheduled(java.lang.Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return (A) this;
  }

  public java.lang.Boolean hasNumberMisscheduled() {
    return this.numberMisscheduled != null;
  }

  public java.lang.Integer getNumberReady() {
    return this.numberReady;
  }

  public A withNumberReady(java.lang.Integer numberReady) {
    this.numberReady = numberReady;
    return (A) this;
  }

  public java.lang.Boolean hasNumberReady() {
    return this.numberReady != null;
  }

  public java.lang.Integer getNumberUnavailable() {
    return this.numberUnavailable;
  }

  public A withNumberUnavailable(java.lang.Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return (A) this;
  }

  public java.lang.Boolean hasNumberUnavailable() {
    return this.numberUnavailable != null;
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

  public java.lang.Integer getUpdatedNumberScheduled() {
    return this.updatedNumberScheduled;
  }

  public A withUpdatedNumberScheduled(java.lang.Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return (A) this;
  }

  public java.lang.Boolean hasUpdatedNumberScheduled() {
    return this.updatedNumberScheduled != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetStatusFluentImpl that = (V1DaemonSetStatusFluentImpl) o;
    if (collisionCount != null
        ? !collisionCount.equals(that.collisionCount)
        : that.collisionCount != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (currentNumberScheduled != null
        ? !currentNumberScheduled.equals(that.currentNumberScheduled)
        : that.currentNumberScheduled != null) return false;
    if (desiredNumberScheduled != null
        ? !desiredNumberScheduled.equals(that.desiredNumberScheduled)
        : that.desiredNumberScheduled != null) return false;
    if (numberAvailable != null
        ? !numberAvailable.equals(that.numberAvailable)
        : that.numberAvailable != null) return false;
    if (numberMisscheduled != null
        ? !numberMisscheduled.equals(that.numberMisscheduled)
        : that.numberMisscheduled != null) return false;
    if (numberReady != null ? !numberReady.equals(that.numberReady) : that.numberReady != null)
      return false;
    if (numberUnavailable != null
        ? !numberUnavailable.equals(that.numberUnavailable)
        : that.numberUnavailable != null) return false;
    if (observedGeneration != null
        ? !observedGeneration.equals(that.observedGeneration)
        : that.observedGeneration != null) return false;
    if (updatedNumberScheduled != null
        ? !updatedNumberScheduled.equals(that.updatedNumberScheduled)
        : that.updatedNumberScheduled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        collisionCount,
        conditions,
        currentNumberScheduled,
        desiredNumberScheduled,
        numberAvailable,
        numberMisscheduled,
        numberReady,
        numberUnavailable,
        observedGeneration,
        updatedNumberScheduled,
        super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1DaemonSetConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1DaemonSetStatusFluent.ConditionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1DaemonSetCondition item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1DaemonSetConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1DaemonSetStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
