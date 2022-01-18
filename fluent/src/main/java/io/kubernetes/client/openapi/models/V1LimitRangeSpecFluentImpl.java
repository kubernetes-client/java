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
public class V1LimitRangeSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent<A> {
  public V1LimitRangeSpecFluentImpl() {}

  public V1LimitRangeSpecFluentImpl(io.kubernetes.client.openapi.models.V1LimitRangeSpec instance) {
    this.withLimits(instance.getLimits());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> limits;

  public A addToLimits(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item) {
    if (this.limits == null) {
      this.limits =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
        new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
    _visitables.get("limits").add(index >= 0 ? index : _visitables.get("limits").size(), builder);
    this.limits.add(index >= 0 ? index : limits.size(), builder);
    return (A) this;
  }

  public A setToLimits(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item) {
    if (this.limits == null) {
      this.limits =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
        new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
    if (index < 0 || index >= _visitables.get("limits").size()) {
      _visitables.get("limits").add(builder);
    } else {
      _visitables.get("limits").set(index, builder);
    }
    if (index < 0 || index >= limits.size()) {
      limits.add(builder);
    } else {
      limits.set(index, builder);
    }
    return (A) this;
  }

  public A addToLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items) {
    if (this.limits == null) {
      this.limits =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : items) {
      io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
          new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
      _visitables.get("limits").add(builder);
      this.limits.add(builder);
    }
    return (A) this;
  }

  public A addAllToLimits(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items) {
    if (this.limits == null) {
      this.limits =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : items) {
      io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
          new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
      _visitables.get("limits").add(builder);
      this.limits.add(builder);
    }
    return (A) this;
  }

  public A removeFromLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... items) {
    for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : items) {
      io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
          new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
      _visitables.get("limits").remove(builder);
      if (this.limits != null) {
        this.limits.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromLimits(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LimitRangeItem> items) {
    for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : items) {
      io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder =
          new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(item);
      _visitables.get("limits").remove(builder);
      if (this.limits != null) {
        this.limits.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromLimits(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate) {
    if (limits == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder> each =
        limits.iterator();
    final List visitables = _visitables.get("limits");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildLimits instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> getLimits() {
    return limits != null ? build(limits) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> buildLimits() {
    return limits != null ? build(limits) : null;
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLimit(java.lang.Integer index) {
    return this.limits.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildFirstLimit() {
    return this.limits.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildLastLimit() {
    return this.limits.get(limits.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeItem buildMatchingLimit(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder item : limits) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingLimit(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder item : limits) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withLimits(java.util.List<io.kubernetes.client.openapi.models.V1LimitRangeItem> limits) {
    if (this.limits != null) {
      _visitables.get("limits").removeAll(this.limits);
    }
    if (limits != null) {
      this.limits = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : limits) {
        this.addToLimits(item);
      }
    } else {
      this.limits = null;
    }
    return (A) this;
  }

  public A withLimits(io.kubernetes.client.openapi.models.V1LimitRangeItem... limits) {
    if (this.limits != null) {
      this.limits.clear();
    }
    if (limits != null) {
      for (io.kubernetes.client.openapi.models.V1LimitRangeItem item : limits) {
        this.addToLimits(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasLimits() {
    return limits != null && !limits.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimit() {
    return new io.kubernetes.client.openapi.models.V1LimitRangeSpecFluentImpl.LimitsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> addNewLimitLike(
      io.kubernetes.client.openapi.models.V1LimitRangeItem item) {
    return new io.kubernetes.client.openapi.models.V1LimitRangeSpecFluentImpl.LimitsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> setNewLimitLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item) {
    return new io.kubernetes.client.openapi.models.V1LimitRangeSpecFluentImpl.LimitsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A> editLimit(
      java.lang.Integer index) {
    if (limits.size() <= index)
      throw new RuntimeException("Can't edit limits. Index exceeds size.");
    return setNewLimitLike(index, buildLimit(index));
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A>
      editFirstLimit() {
    if (limits.size() == 0)
      throw new RuntimeException("Can't edit first limits. The list is empty.");
    return setNewLimitLike(0, buildLimit(0));
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A>
      editLastLimit() {
    int index = limits.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last limits. The list is empty.");
    return setNewLimitLike(index, buildLimit(index));
  }

  public io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<A>
      editMatchingLimit(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < limits.size(); i++) {
      if (predicate.test(limits.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching limits. No match found.");
    return setNewLimitLike(index, buildLimit(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LimitRangeSpecFluentImpl that = (V1LimitRangeSpecFluentImpl) o;
    if (limits != null ? !limits.equals(that.limits) : that.limits != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(limits, super.hashCode());
  }

  public class LimitsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LimitRangeItemFluentImpl<
          io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<N>>
      implements io.kubernetes.client.openapi.models.V1LimitRangeSpecFluent.LimitsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    LimitsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1LimitRangeItem item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(this, item);
    }

    LimitsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LimitRangeItemBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1LimitRangeSpecFluentImpl.this.setToLimits(index, builder.build());
    }

    public N endLimit() {
      return and();
    }
  }
}
