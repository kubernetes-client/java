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
public class V1AggregationRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1AggregationRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AggregationRuleFluent<A> {
  public V1AggregationRuleFluentImpl() {}

  public V1AggregationRuleFluentImpl(
      io.kubernetes.client.openapi.models.V1AggregationRule instance) {
    this.withClusterRoleSelectors(instance.getClusterRoleSelectors());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
      clusterRoleSelectors;

  public A addToClusterRoleSelectors(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
        new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
    _visitables
        .get("clusterRoleSelectors")
        .add(index >= 0 ? index : _visitables.get("clusterRoleSelectors").size(), builder);
    this.clusterRoleSelectors.add(index >= 0 ? index : clusterRoleSelectors.size(), builder);
    return (A) this;
  }

  public A setToClusterRoleSelectors(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
        new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
    if (index < 0 || index >= _visitables.get("clusterRoleSelectors").size()) {
      _visitables.get("clusterRoleSelectors").add(builder);
    } else {
      _visitables.get("clusterRoleSelectors").set(index, builder);
    }
    if (index < 0 || index >= clusterRoleSelectors.size()) {
      clusterRoleSelectors.add(builder);
    } else {
      clusterRoleSelectors.set(index, builder);
    }
    return (A) this;
  }

  public A addToClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LabelSelector item : items) {
      io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
      _visitables.get("clusterRoleSelectors").add(builder);
      this.clusterRoleSelectors.add(builder);
    }
    return (A) this;
  }

  public A addAllToClusterRoleSelectors(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LabelSelector item : items) {
      io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
      _visitables.get("clusterRoleSelectors").add(builder);
      this.clusterRoleSelectors.add(builder);
    }
    return (A) this;
  }

  public A removeFromClusterRoleSelectors(
      io.kubernetes.client.openapi.models.V1LabelSelector... items) {
    for (io.kubernetes.client.openapi.models.V1LabelSelector item : items) {
      io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
      _visitables.get("clusterRoleSelectors").remove(builder);
      if (this.clusterRoleSelectors != null) {
        this.clusterRoleSelectors.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromClusterRoleSelectors(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LabelSelector> items) {
    for (io.kubernetes.client.openapi.models.V1LabelSelector item : items) {
      io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(item);
      _visitables.get("clusterRoleSelectors").remove(builder);
      if (this.clusterRoleSelectors != null) {
        this.clusterRoleSelectors.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromClusterRoleSelectors(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
          predicate) {
    if (clusterRoleSelectors == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder> each =
        clusterRoleSelectors.iterator();
    final List visitables = _visitables.get("clusterRoleSelectors");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildClusterRoleSelectors instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector>
      getClusterRoleSelectors() {
    return clusterRoleSelectors != null ? build(clusterRoleSelectors) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector>
      buildClusterRoleSelectors() {
    return clusterRoleSelectors != null ? build(clusterRoleSelectors) : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildClusterRoleSelector(
      java.lang.Integer index) {
    return this.clusterRoleSelectors.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildFirstClusterRoleSelector() {
    return this.clusterRoleSelectors.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLastClusterRoleSelector() {
    return this.clusterRoleSelectors.get(clusterRoleSelectors.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildMatchingClusterRoleSelector(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LabelSelectorBuilder item : clusterRoleSelectors) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingClusterRoleSelector(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LabelSelectorBuilder item : clusterRoleSelectors) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withClusterRoleSelectors(
      java.util.List<io.kubernetes.client.openapi.models.V1LabelSelector> clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) {
      _visitables.get("clusterRoleSelectors").removeAll(this.clusterRoleSelectors);
    }
    if (clusterRoleSelectors != null) {
      this.clusterRoleSelectors = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1LabelSelector item : clusterRoleSelectors) {
        this.addToClusterRoleSelectors(item);
      }
    } else {
      this.clusterRoleSelectors = null;
    }
    return (A) this;
  }

  public A withClusterRoleSelectors(
      io.kubernetes.client.openapi.models.V1LabelSelector... clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) {
      this.clusterRoleSelectors.clear();
    }
    if (clusterRoleSelectors != null) {
      for (io.kubernetes.client.openapi.models.V1LabelSelector item : clusterRoleSelectors) {
        this.addToClusterRoleSelectors(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasClusterRoleSelectors() {
    return clusterRoleSelectors != null && !clusterRoleSelectors.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      addNewClusterRoleSelector() {
    return new io.kubernetes.client.openapi.models.V1AggregationRuleFluentImpl
        .ClusterRoleSelectorsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      addNewClusterRoleSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1AggregationRuleFluentImpl
        .ClusterRoleSelectorsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      setNewClusterRoleSelectorLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1AggregationRuleFluentImpl
        .ClusterRoleSelectorsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editClusterRoleSelector(java.lang.Integer index) {
    if (clusterRoleSelectors.size() <= index)
      throw new RuntimeException("Can't edit clusterRoleSelectors. Index exceeds size.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editFirstClusterRoleSelector() {
    if (clusterRoleSelectors.size() == 0)
      throw new RuntimeException("Can't edit first clusterRoleSelectors. The list is empty.");
    return setNewClusterRoleSelectorLike(0, buildClusterRoleSelector(0));
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editLastClusterRoleSelector() {
    int index = clusterRoleSelectors.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last clusterRoleSelectors. The list is empty.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }

  public io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<A>
      editMatchingClusterRoleSelector(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LabelSelectorBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < clusterRoleSelectors.size(); i++) {
      if (predicate.test(clusterRoleSelectors.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching clusterRoleSelectors. No match found.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AggregationRuleFluentImpl that = (V1AggregationRuleFluentImpl) o;
    if (clusterRoleSelectors != null
        ? !clusterRoleSelectors.equals(that.clusterRoleSelectors)
        : that.clusterRoleSelectors != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(clusterRoleSelectors, super.hashCode());
  }

  public class ClusterRoleSelectorsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1AggregationRuleFluent.ClusterRoleSelectorsNested<N>>
      implements io.kubernetes.client.openapi.models.V1AggregationRuleFluent
                  .ClusterRoleSelectorsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ClusterRoleSelectorsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    ClusterRoleSelectorsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1AggregationRuleFluentImpl.this.setToClusterRoleSelectors(index, builder.build());
    }

    public N endClusterRoleSelector() {
      return and();
    }
  }
}
