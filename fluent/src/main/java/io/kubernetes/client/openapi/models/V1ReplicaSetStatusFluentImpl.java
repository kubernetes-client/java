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
public class V1ReplicaSetStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<A> {
  public V1ReplicaSetStatusFluentImpl() {}

  public V1ReplicaSetStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatus instance) {
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withConditions(instance.getConditions());

    this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());
  }

  private java.lang.Integer availableReplicas;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
      conditions;
  private java.lang.Integer fullyLabeledReplicas;
  private java.lang.Long observedGeneration;
  private java.lang.Integer readyReplicas;
  private java.lang.Integer replicas;

  public java.lang.Integer getAvailableReplicas() {
    return this.availableReplicas;
  }

  public A withAvailableReplicas(java.lang.Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasAvailableReplicas() {
    return this.availableReplicas != null;
  }

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ReplicaSetCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ReplicaSetCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
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

  public A addToConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1ReplicaSetCondition... items) {
    for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> items) {
    for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : items) {
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition>
      buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1ReplicaSetCondition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1ReplicaSetCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1ReplicaSetCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluentImpl
        .ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1ReplicaSetCondition item) {
    return new io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluentImpl
        .ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ReplicaSetCondition item) {
    return new io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluentImpl
        .ConditionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder>
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

  public java.lang.Integer getFullyLabeledReplicas() {
    return this.fullyLabeledReplicas;
  }

  public A withFullyLabeledReplicas(java.lang.Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasFullyLabeledReplicas() {
    return this.fullyLabeledReplicas != null;
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

  public java.lang.Integer getReadyReplicas() {
    return this.readyReplicas;
  }

  public A withReadyReplicas(java.lang.Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasReadyReplicas() {
    return this.readyReplicas != null;
  }

  public java.lang.Integer getReplicas() {
    return this.replicas;
  }

  public A withReplicas(java.lang.Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }

  public java.lang.Boolean hasReplicas() {
    return this.replicas != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ReplicaSetStatusFluentImpl that = (V1ReplicaSetStatusFluentImpl) o;
    if (availableReplicas != null
        ? !availableReplicas.equals(that.availableReplicas)
        : that.availableReplicas != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (fullyLabeledReplicas != null
        ? !fullyLabeledReplicas.equals(that.fullyLabeledReplicas)
        : that.fullyLabeledReplicas != null) return false;
    if (observedGeneration != null
        ? !observedGeneration.equals(that.observedGeneration)
        : that.observedGeneration != null) return false;
    if (readyReplicas != null
        ? !readyReplicas.equals(that.readyReplicas)
        : that.readyReplicas != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) : that.replicas != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        availableReplicas,
        conditions,
        fullyLabeledReplicas,
        observedGeneration,
        readyReplicas,
        replicas,
        super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ReplicaSetConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent.ConditionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ReplicaSetCondition item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ReplicaSetConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ReplicaSetStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
