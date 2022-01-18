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
public class V1NodeSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1NodeSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeSpecFluent<A> {
  public V1NodeSpecFluentImpl() {}

  public V1NodeSpecFluentImpl(io.kubernetes.client.openapi.models.V1NodeSpec instance) {
    this.withConfigSource(instance.getConfigSource());

    this.withExternalID(instance.getExternalID());

    this.withPodCIDR(instance.getPodCIDR());

    this.withPodCIDRs(instance.getPodCIDRs());

    this.withProviderID(instance.getProviderID());

    this.withTaints(instance.getTaints());

    this.withUnschedulable(instance.getUnschedulable());
  }

  private io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder configSource;
  private java.lang.String externalID;
  private java.lang.String podCIDR;
  private java.util.List<java.lang.String> podCIDRs;
  private java.lang.String providerID;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1TaintBuilder> taints;
  private java.lang.Boolean unschedulable;

  /**
   * This method has been deprecated, please use method buildConfigSource instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getConfigSource() {
    return this.configSource != null ? this.configSource.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildConfigSource() {
    return this.configSource != null ? this.configSource.build() : null;
  }

  public A withConfigSource(io.kubernetes.client.openapi.models.V1NodeConfigSource configSource) {
    _visitables.get("configSource").remove(this.configSource);
    if (configSource != null) {
      this.configSource =
          new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(configSource);
      _visitables.get("configSource").add(this.configSource);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConfigSource() {
    return this.configSource != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      withNewConfigSource() {
    return new io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl.ConfigSourceNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      withNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return new io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl.ConfigSourceNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editConfigSource() {
    return withNewConfigSourceLike(getConfigSource());
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editOrNewConfigSource() {
    return withNewConfigSourceLike(
        getConfigSource() != null
            ? getConfigSource()
            : new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<A>
      editOrNewConfigSourceLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
    return withNewConfigSourceLike(getConfigSource() != null ? getConfigSource() : item);
  }

  public java.lang.String getExternalID() {
    return this.externalID;
  }

  public A withExternalID(java.lang.String externalID) {
    this.externalID = externalID;
    return (A) this;
  }

  public java.lang.Boolean hasExternalID() {
    return this.externalID != null;
  }

  /** Method is deprecated. use withExternalID instead. */
  @java.lang.Deprecated
  public A withNewExternalID(java.lang.String original) {
    return (A) withExternalID(new String(original));
  }

  public java.lang.String getPodCIDR() {
    return this.podCIDR;
  }

  public A withPodCIDR(java.lang.String podCIDR) {
    this.podCIDR = podCIDR;
    return (A) this;
  }

  public java.lang.Boolean hasPodCIDR() {
    return this.podCIDR != null;
  }

  /** Method is deprecated. use withPodCIDR instead. */
  @java.lang.Deprecated
  public A withNewPodCIDR(java.lang.String original) {
    return (A) withPodCIDR(new String(original));
  }

  public A addToPodCIDRs(java.lang.Integer index, java.lang.String item) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new java.util.ArrayList<java.lang.String>();
    }
    this.podCIDRs.add(index, item);
    return (A) this;
  }

  public A setToPodCIDRs(java.lang.Integer index, java.lang.String item) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new java.util.ArrayList<java.lang.String>();
    }
    this.podCIDRs.set(index, item);
    return (A) this;
  }

  public A addToPodCIDRs(java.lang.String... items) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.podCIDRs.add(item);
    }
    return (A) this;
  }

  public A addAllToPodCIDRs(java.util.Collection<java.lang.String> items) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.podCIDRs.add(item);
    }
    return (A) this;
  }

  public A removeFromPodCIDRs(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.podCIDRs != null) {
        this.podCIDRs.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromPodCIDRs(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.podCIDRs != null) {
        this.podCIDRs.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getPodCIDRs() {
    return this.podCIDRs;
  }

  public java.lang.String getPodCIDR(java.lang.Integer index) {
    return this.podCIDRs.get(index);
  }

  public java.lang.String getFirstPodCIDR() {
    return this.podCIDRs.get(0);
  }

  public java.lang.String getLastPodCIDR() {
    return this.podCIDRs.get(podCIDRs.size() - 1);
  }

  public java.lang.String getMatchingPodCIDR(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : podCIDRs) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPodCIDR(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : podCIDRs) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPodCIDRs(java.util.List<java.lang.String> podCIDRs) {
    if (podCIDRs != null) {
      this.podCIDRs = new java.util.ArrayList();
      for (java.lang.String item : podCIDRs) {
        this.addToPodCIDRs(item);
      }
    } else {
      this.podCIDRs = null;
    }
    return (A) this;
  }

  public A withPodCIDRs(java.lang.String... podCIDRs) {
    if (this.podCIDRs != null) {
      this.podCIDRs.clear();
    }
    if (podCIDRs != null) {
      for (java.lang.String item : podCIDRs) {
        this.addToPodCIDRs(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPodCIDRs() {
    return podCIDRs != null && !podCIDRs.isEmpty();
  }

  public A addNewPodCIDR(java.lang.String original) {
    return (A) addToPodCIDRs(new String(original));
  }

  public java.lang.String getProviderID() {
    return this.providerID;
  }

  public A withProviderID(java.lang.String providerID) {
    this.providerID = providerID;
    return (A) this;
  }

  public java.lang.Boolean hasProviderID() {
    return this.providerID != null;
  }

  /** Method is deprecated. use withProviderID instead. */
  @java.lang.Deprecated
  public A withNewProviderID(java.lang.String original) {
    return (A) withProviderID(new String(original));
  }

  public A addToTaints(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item) {
    if (this.taints == null) {
      this.taints = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TaintBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TaintBuilder builder =
        new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
    _visitables.get("taints").add(index >= 0 ? index : _visitables.get("taints").size(), builder);
    this.taints.add(index >= 0 ? index : taints.size(), builder);
    return (A) this;
  }

  public A setToTaints(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item) {
    if (this.taints == null) {
      this.taints = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TaintBuilder>();
    }
    io.kubernetes.client.openapi.models.V1TaintBuilder builder =
        new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
    if (index < 0 || index >= _visitables.get("taints").size()) {
      _visitables.get("taints").add(builder);
    } else {
      _visitables.get("taints").set(index, builder);
    }
    if (index < 0 || index >= taints.size()) {
      taints.add(builder);
    } else {
      taints.set(index, builder);
    }
    return (A) this;
  }

  public A addToTaints(io.kubernetes.client.openapi.models.V1Taint... items) {
    if (this.taints == null) {
      this.taints = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TaintBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Taint item : items) {
      io.kubernetes.client.openapi.models.V1TaintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
      _visitables.get("taints").add(builder);
      this.taints.add(builder);
    }
    return (A) this;
  }

  public A addAllToTaints(java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items) {
    if (this.taints == null) {
      this.taints = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TaintBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Taint item : items) {
      io.kubernetes.client.openapi.models.V1TaintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
      _visitables.get("taints").add(builder);
      this.taints.add(builder);
    }
    return (A) this;
  }

  public A removeFromTaints(io.kubernetes.client.openapi.models.V1Taint... items) {
    for (io.kubernetes.client.openapi.models.V1Taint item : items) {
      io.kubernetes.client.openapi.models.V1TaintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
      _visitables.get("taints").remove(builder);
      if (this.taints != null) {
        this.taints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTaints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Taint> items) {
    for (io.kubernetes.client.openapi.models.V1Taint item : items) {
      io.kubernetes.client.openapi.models.V1TaintBuilder builder =
          new io.kubernetes.client.openapi.models.V1TaintBuilder(item);
      _visitables.get("taints").remove(builder);
      if (this.taints != null) {
        this.taints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTaints(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate) {
    if (taints == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1TaintBuilder> each = taints.iterator();
    final List visitables = _visitables.get("taints");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1TaintBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildTaints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Taint> getTaints() {
    return taints != null ? build(taints) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Taint> buildTaints() {
    return taints != null ? build(taints) : null;
  }

  public io.kubernetes.client.openapi.models.V1Taint buildTaint(java.lang.Integer index) {
    return this.taints.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Taint buildFirstTaint() {
    return this.taints.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Taint buildLastTaint() {
    return this.taints.get(taints.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Taint buildMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1TaintBuilder item : taints) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate) {
    for (io.kubernetes.client.openapi.models.V1TaintBuilder item : taints) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTaints(java.util.List<io.kubernetes.client.openapi.models.V1Taint> taints) {
    if (this.taints != null) {
      _visitables.get("taints").removeAll(this.taints);
    }
    if (taints != null) {
      this.taints = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Taint item : taints) {
        this.addToTaints(item);
      }
    } else {
      this.taints = null;
    }
    return (A) this;
  }

  public A withTaints(io.kubernetes.client.openapi.models.V1Taint... taints) {
    if (this.taints != null) {
      this.taints.clear();
    }
    if (taints != null) {
      for (io.kubernetes.client.openapi.models.V1Taint item : taints) {
        this.addToTaints(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTaints() {
    return taints != null && !taints.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaint() {
    return new io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl.TaintsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> addNewTaintLike(
      io.kubernetes.client.openapi.models.V1Taint item) {
    return new io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl.TaintsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> setNewTaintLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item) {
    return new io.kubernetes.client.openapi.models.V1NodeSpecFluentImpl.TaintsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editTaint(
      java.lang.Integer index) {
    if (taints.size() <= index)
      throw new RuntimeException("Can't edit taints. Index exceeds size.");
    return setNewTaintLike(index, buildTaint(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editFirstTaint() {
    if (taints.size() == 0)
      throw new RuntimeException("Can't edit first taints. The list is empty.");
    return setNewTaintLike(0, buildTaint(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editLastTaint() {
    int index = taints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last taints. The list is empty.");
    return setNewTaintLike(index, buildTaint(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<A> editMatchingTaint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TaintBuilder> predicate) {
    int index = -1;
    for (int i = 0; i < taints.size(); i++) {
      if (predicate.test(taints.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching taints. No match found.");
    return setNewTaintLike(index, buildTaint(index));
  }

  public java.lang.Boolean getUnschedulable() {
    return this.unschedulable;
  }

  public A withUnschedulable(java.lang.Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return (A) this;
  }

  public java.lang.Boolean hasUnschedulable() {
    return this.unschedulable != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSpecFluentImpl that = (V1NodeSpecFluentImpl) o;
    if (configSource != null ? !configSource.equals(that.configSource) : that.configSource != null)
      return false;
    if (externalID != null ? !externalID.equals(that.externalID) : that.externalID != null)
      return false;
    if (podCIDR != null ? !podCIDR.equals(that.podCIDR) : that.podCIDR != null) return false;
    if (podCIDRs != null ? !podCIDRs.equals(that.podCIDRs) : that.podCIDRs != null) return false;
    if (providerID != null ? !providerID.equals(that.providerID) : that.providerID != null)
      return false;
    if (taints != null ? !taints.equals(that.taints) : that.taints != null) return false;
    if (unschedulable != null
        ? !unschedulable.equals(that.unschedulable)
        : that.unschedulable != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        configSource,
        externalID,
        podCIDR,
        podCIDRs,
        providerID,
        taints,
        unschedulable,
        super.hashCode());
  }

  public class ConfigSourceNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConfigSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeSpecFluent.ConfigSourceNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConfigSourceNestedImpl(io.kubernetes.client.openapi.models.V1NodeConfigSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this, item);
    }

    ConfigSourceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConfigSourceBuilder builder;

    public N and() {
      return (N) V1NodeSpecFluentImpl.this.withConfigSource(builder.build());
    }

    public N endConfigSource() {
      return and();
    }
  }

  public class TaintsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1TaintFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeSpecFluent.TaintsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TaintsNestedImpl(java.lang.Integer index, io.kubernetes.client.openapi.models.V1Taint item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1TaintBuilder(this, item);
    }

    TaintsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1TaintBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1TaintBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeSpecFluentImpl.this.setToTaints(index, builder.build());
    }

    public N endTaint() {
      return and();
    }
  }
}
