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
public class V1CronJobStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CronJobStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CronJobStatusFluent<A> {
  public V1CronJobStatusFluentImpl() {}

  public V1CronJobStatusFluentImpl(io.kubernetes.client.openapi.models.V1CronJobStatus instance) {
    this.withActive(instance.getActive());

    this.withLastScheduleTime(instance.getLastScheduleTime());

    this.withLastSuccessfulTime(instance.getLastSuccessfulTime());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> active;
  private java.time.OffsetDateTime lastScheduleTime;
  private java.time.OffsetDateTime lastSuccessfulTime;

  public A addToActive(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    if (this.active == null) {
      this.active =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
    _visitables.get("active").add(index >= 0 ? index : _visitables.get("active").size(), builder);
    this.active.add(index >= 0 ? index : active.size(), builder);
    return (A) this;
  }

  public A setToActive(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    if (this.active == null) {
      this.active =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("active").size()) {
      _visitables.get("active").add(builder);
    } else {
      _visitables.get("active").set(index, builder);
    }
    if (index < 0 || index >= active.size()) {
      active.add(builder);
    } else {
      active.set(index, builder);
    }
    return (A) this;
  }

  public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.active == null) {
      this.active =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("active").add(builder);
      this.active.add(builder);
    }
    return (A) this;
  }

  public A addAllToActive(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
    if (this.active == null) {
      this.active =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("active").add(builder);
      this.active.add(builder);
    }
    return (A) this;
  }

  public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("active").remove(builder);
      if (this.active != null) {
        this.active.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromActive(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("active").remove(builder);
      if (this.active != null) {
        this.active.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromActive(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    if (active == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> each =
        active.iterator();
    final List visitables = _visitables.get("active");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildActive instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> getActive() {
    return active != null ? build(active) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildActive() {
    return active != null ? build(active) : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildActive(
      java.lang.Integer index) {
    return this.active.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstActive() {
    return this.active.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildLastActive() {
    return this.active.get(active.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingActive(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item : active) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingActive(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item : active) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withActive(
      java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> active) {
    if (this.active != null) {
      _visitables.get("active").removeAll(this.active);
    }
    if (active != null) {
      this.active = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ObjectReference item : active) {
        this.addToActive(item);
      }
    } else {
      this.active = null;
    }
    return (A) this;
  }

  public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active) {
    if (this.active != null) {
      this.active.clear();
    }
    if (active != null) {
      for (io.kubernetes.client.openapi.models.V1ObjectReference item : active) {
        this.addToActive(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasActive() {
    return active != null && !active.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> addNewActive() {
    return new io.kubernetes.client.openapi.models.V1CronJobStatusFluentImpl.ActiveNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(
      io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1CronJobStatusFluentImpl.ActiveNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1CronJobStatusFluentImpl.ActiveNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A> editActive(
      java.lang.Integer index) {
    if (active.size() <= index)
      throw new RuntimeException("Can't edit active. Index exceeds size.");
    return setNewActiveLike(index, buildActive(index));
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A>
      editFirstActive() {
    if (active.size() == 0)
      throw new RuntimeException("Can't edit first active. The list is empty.");
    return setNewActiveLike(0, buildActive(0));
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A>
      editLastActive() {
    int index = active.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last active. The list is empty.");
    return setNewActiveLike(index, buildActive(index));
  }

  public io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<A>
      editMatchingActive(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < active.size(); i++) {
      if (predicate.test(active.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching active. No match found.");
    return setNewActiveLike(index, buildActive(index));
  }

  public java.time.OffsetDateTime getLastScheduleTime() {
    return this.lastScheduleTime;
  }

  public A withLastScheduleTime(java.time.OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastScheduleTime() {
    return this.lastScheduleTime != null;
  }

  public java.time.OffsetDateTime getLastSuccessfulTime() {
    return this.lastSuccessfulTime;
  }

  public A withLastSuccessfulTime(java.time.OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastSuccessfulTime() {
    return this.lastSuccessfulTime != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CronJobStatusFluentImpl that = (V1CronJobStatusFluentImpl) o;
    if (active != null ? !active.equals(that.active) : that.active != null) return false;
    if (lastScheduleTime != null
        ? !lastScheduleTime.equals(that.lastScheduleTime)
        : that.lastScheduleTime != null) return false;
    if (lastSuccessfulTime != null
        ? !lastSuccessfulTime.equals(that.lastSuccessfulTime)
        : that.lastSuccessfulTime != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(active, lastScheduleTime, lastSuccessfulTime, super.hashCode());
  }

  public class ActiveNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<N>>
      implements io.kubernetes.client.openapi.models.V1CronJobStatusFluent.ActiveNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ActiveNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    ActiveNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1CronJobStatusFluentImpl.this.setToActive(index, builder.build());
    }

    public N endActive() {
      return and();
    }
  }
}
