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
public class V1beta1RunAsGroupStrategyOptionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<A> {
  public V1beta1RunAsGroupStrategyOptionsFluentImpl() {}

  public V1beta1RunAsGroupStrategyOptionsFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions instance) {
    this.withRanges(instance.getRanges());

    this.withRule(instance.getRule());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> ranges;
  private java.lang.String rule;

  public A addToRanges(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item) {
    if (this.ranges == null) {
      this.ranges =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
    _visitables.get("ranges").add(index >= 0 ? index : _visitables.get("ranges").size(), builder);
    this.ranges.add(index >= 0 ? index : ranges.size(), builder);
    return (A) this;
  }

  public A setToRanges(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item) {
    if (this.ranges == null) {
      this.ranges =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
        new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
    if (index < 0 || index >= _visitables.get("ranges").size()) {
      _visitables.get("ranges").add(builder);
    } else {
      _visitables.get("ranges").set(index, builder);
    }
    if (index < 0 || index >= ranges.size()) {
      ranges.add(builder);
    } else {
      ranges.set(index, builder);
    }
    return (A) this;
  }

  public A addToRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items) {
    if (this.ranges == null) {
      this.ranges =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1IDRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
      _visitables.get("ranges").add(builder);
      this.ranges.add(builder);
    }
    return (A) this;
  }

  public A addAllToRanges(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items) {
    if (this.ranges == null) {
      this.ranges =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1beta1IDRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
      _visitables.get("ranges").add(builder);
      this.ranges.add(builder);
    }
    return (A) this;
  }

  public A removeFromRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... items) {
    for (io.kubernetes.client.openapi.models.V1beta1IDRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
      _visitables.get("ranges").remove(builder);
      if (this.ranges != null) {
        this.ranges.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRanges(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1IDRange> items) {
    for (io.kubernetes.client.openapi.models.V1beta1IDRange item : items) {
      io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder =
          new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(item);
      _visitables.get("ranges").remove(builder);
      if (this.ranges != null) {
        this.ranges.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRanges(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate) {
    if (ranges == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder> each =
        ranges.iterator();
    final List visitables = _visitables.get("ranges");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildRanges instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> getRanges() {
    return ranges != null ? build(ranges) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> buildRanges() {
    return ranges != null ? build(ranges) : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildRange(java.lang.Integer index) {
    return this.ranges.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildFirstRange() {
    return this.ranges.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildLastRange() {
    return this.ranges.get(ranges.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1beta1IDRange buildMatchingRange(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder item : ranges) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRange(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder item : ranges) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRanges(java.util.List<io.kubernetes.client.openapi.models.V1beta1IDRange> ranges) {
    if (this.ranges != null) {
      _visitables.get("ranges").removeAll(this.ranges);
    }
    if (ranges != null) {
      this.ranges = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1beta1IDRange item : ranges) {
        this.addToRanges(item);
      }
    } else {
      this.ranges = null;
    }
    return (A) this;
  }

  public A withRanges(io.kubernetes.client.openapi.models.V1beta1IDRange... ranges) {
    if (this.ranges != null) {
      this.ranges.clear();
    }
    if (ranges != null) {
      for (io.kubernetes.client.openapi.models.V1beta1IDRange item : ranges) {
        this.addToRanges(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRanges() {
    return ranges != null && !ranges.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      addNewRange() {
    return new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluentImpl
        .RangesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      addNewRangeLike(io.kubernetes.client.openapi.models.V1beta1IDRange item) {
    return new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluentImpl
        .RangesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      setNewRangeLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item) {
    return new io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluentImpl
        .RangesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editRange(java.lang.Integer index) {
    if (ranges.size() <= index)
      throw new RuntimeException("Can't edit ranges. Index exceeds size.");
    return setNewRangeLike(index, buildRange(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editFirstRange() {
    if (ranges.size() == 0)
      throw new RuntimeException("Can't edit first ranges. The list is empty.");
    return setNewRangeLike(0, buildRange(0));
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editLastRange() {
    int index = ranges.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ranges. The list is empty.");
    return setNewRangeLike(index, buildRange(index));
  }

  public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<A>
      editMatchingRange(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ranges.size(); i++) {
      if (predicate.test(ranges.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ranges. No match found.");
    return setNewRangeLike(index, buildRange(index));
  }

  public java.lang.String getRule() {
    return this.rule;
  }

  public A withRule(java.lang.String rule) {
    this.rule = rule;
    return (A) this;
  }

  public java.lang.Boolean hasRule() {
    return this.rule != null;
  }

  /** Method is deprecated. use withRule instead. */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original) {
    return (A) withRule(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1RunAsGroupStrategyOptionsFluentImpl that =
        (V1beta1RunAsGroupStrategyOptionsFluentImpl) o;
    if (ranges != null ? !ranges.equals(that.ranges) : that.ranges != null) return false;
    if (rule != null ? !rule.equals(that.rule) : that.rule != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ranges, rule, super.hashCode());
  }

  public class RangesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1IDRangeFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent.RangesNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent
                  .RangesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RangesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1IDRange item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(this, item);
    }

    RangesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1IDRangeBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1beta1RunAsGroupStrategyOptionsFluentImpl.this.setToRanges(index, builder.build());
    }

    public N endRange() {
      return and();
    }
  }
}
