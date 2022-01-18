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
public class V1PersistentVolumeClaimStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<A> {
  public V1PersistentVolumeClaimStatusFluentImpl() {}

  public V1PersistentVolumeClaimStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
    this.withAccessModes(instance.getAccessModes());

    this.withAllocatedResources(instance.getAllocatedResources());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.withResizeStatus(instance.getResizeStatus());
  }

  private java.util.List<java.lang.String> accessModes;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatedResources;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity;
  private java.util.ArrayList<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
      conditions;
  private io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus.PhaseEnum phase;
  private java.lang.String resizeStatus;

  public A addToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.add(index, item);
    return (A) this;
  }

  public A setToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.set(index, item);
    return (A) this;
  }

  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A addAllToAccessModes(java.util.Collection<java.lang.String> items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A removeFromAccessModes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAccessModes() {
    return this.accessModes;
  }

  public java.lang.String getAccessMode(java.lang.Integer index) {
    return this.accessModes.get(index);
  }

  public java.lang.String getFirstAccessMode() {
    return this.accessModes.get(0);
  }

  public java.lang.String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }

  public java.lang.String getMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAccessModes(java.util.List<java.lang.String> accessModes) {
    if (accessModes != null) {
      this.accessModes = new java.util.ArrayList();
      for (java.lang.String item : accessModes) {
        this.addToAccessModes(item);
      }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }

  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
      this.accessModes.clear();
    }
    if (accessModes != null) {
      for (java.lang.String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
  }

  public A addNewAccessMode(java.lang.String original) {
    return (A) addToAccessModes(new String(original));
  }

  public A addToAllocatedResources(
      java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.allocatedResources == null && key != null && value != null) {
      this.allocatedResources = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.allocatedResources.put(key, value);
    }
    return (A) this;
  }

  public A addToAllocatedResources(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.allocatedResources == null && map != null) {
      this.allocatedResources = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.allocatedResources.putAll(map);
    }
    return (A) this;
  }

  public A removeFromAllocatedResources(java.lang.String key) {
    if (this.allocatedResources == null) {
      return (A) this;
    }
    if (key != null && this.allocatedResources != null) {
      this.allocatedResources.remove(key);
    }
    return (A) this;
  }

  public A removeFromAllocatedResources(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.allocatedResources == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.allocatedResources != null) {
          this.allocatedResources.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity>
      getAllocatedResources() {
    return this.allocatedResources;
  }

  public <K, V> A withAllocatedResources(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatedResources) {
    if (allocatedResources == null) {
      this.allocatedResources = null;
    } else {
      this.allocatedResources = new java.util.LinkedHashMap(allocatedResources);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllocatedResources() {
    return this.allocatedResources != null;
  }

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.capacity == null && key != null && value != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.capacity.put(key, value);
    }
    return (A) this;
  }

  public A addToCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null && map != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.capacity.putAll(map);
    }
    return (A) this;
  }

  public A removeFromCapacity(java.lang.String key) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (key != null && this.capacity != null) {
      this.capacity.remove(key);
    }
    return (A) this;
  }

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.capacity != null) {
          this.capacity.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity() {
    return this.capacity;
  }

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new java.util.LinkedHashMap(capacity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCapacity() {
    return this.capacity != null;
  }

  public A addToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
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
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          items) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
        each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder =
          each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
      getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
      buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition
      buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition
      buildMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder item :
        conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder item :
        conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition>
          conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl
        .ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      addNewConditionLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl
        .ConditionsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl
        .ConditionsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editCondition(java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus.PhaseEnum getPhase() {
    return this.phase;
  }

  public A withPhase(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus.PhaseEnum phase) {
    this.phase = phase;
    return (A) this;
  }

  public java.lang.Boolean hasPhase() {
    return this.phase != null;
  }

  public java.lang.String getResizeStatus() {
    return this.resizeStatus;
  }

  public A withResizeStatus(java.lang.String resizeStatus) {
    this.resizeStatus = resizeStatus;
    return (A) this;
  }

  public java.lang.Boolean hasResizeStatus() {
    return this.resizeStatus != null;
  }

  /** Method is deprecated. use withResizeStatus instead. */
  @java.lang.Deprecated
  public A withNewResizeStatus(java.lang.String original) {
    return (A) withResizeStatus(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeClaimStatusFluentImpl that = (V1PersistentVolumeClaimStatusFluentImpl) o;
    if (accessModes != null ? !accessModes.equals(that.accessModes) : that.accessModes != null)
      return false;
    if (allocatedResources != null
        ? !allocatedResources.equals(that.allocatedResources)
        : that.allocatedResources != null) return false;
    if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (phase != null ? !phase.equals(that.phase) : that.phase != null) return false;
    if (resizeStatus != null ? !resizeStatus.equals(that.resizeStatus) : that.resizeStatus != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        accessModes,
        allocatedResources,
        capacity,
        conditions,
        phase,
        resizeStatus,
        super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent
                  .ConditionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(
              this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1PersistentVolumeClaimStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }
}
