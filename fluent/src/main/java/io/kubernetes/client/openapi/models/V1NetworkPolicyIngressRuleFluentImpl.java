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
public class V1NetworkPolicyIngressRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<A> {
  public V1NetworkPolicyIngressRuleFluentImpl() {}

  public V1NetworkPolicyIngressRuleFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule instance) {
    this.withFrom(instance.getFrom());

    this.withPorts(instance.getPorts());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> from;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> ports;

  public A addToFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    if (this.from == null) {
      this.from =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
    _visitables.get("from").add(index >= 0 ? index : _visitables.get("from").size(), builder);
    this.from.add(index >= 0 ? index : from.size(), builder);
    return (A) this;
  }

  public A setToFrom(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    if (this.from == null) {
      this.from =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= _visitables.get("from").size()) {
      _visitables.get("from").add(builder);
    } else {
      _visitables.get("from").set(index, builder);
    }
    if (index < 0 || index >= from.size()) {
      from.add(builder);
    } else {
      from.set(index, builder);
    }
    return (A) this;
  }

  public A addToFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    if (this.from == null) {
      this.from =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("from").add(builder);
      this.from.add(builder);
    }
    return (A) this;
  }

  public A addAllToFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items) {
    if (this.from == null) {
      this.from =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("from").add(builder);
      this.from.add(builder);
    }
    return (A) this;
  }

  public A removeFromFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("from").remove(builder);
      if (this.from != null) {
        this.from.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromFrom(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("from").remove(builder);
      if (this.from != null) {
        this.from.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    if (from == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> each =
        from.iterator();
    final List visitables = _visitables.get("from");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildFrom instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> getFrom() {
    return from != null ? build(from) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> buildFrom() {
    return from != null ? build(from) : null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFrom(
      java.lang.Integer index) {
    return this.from.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFirstFrom() {
    return this.from.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildLastFrom() {
    return this.from.get(from.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildMatchingFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder item : from) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingFrom(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder item : from) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withFrom(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> from) {
    if (this.from != null) {
      _visitables.get("from").removeAll(this.from);
    }
    if (from != null) {
      this.from = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : from) {
        this.addToFrom(item);
      }
    } else {
      this.from = null;
    }
    return (A) this;
  }

  public A withFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... from) {
    if (this.from != null) {
      this.from.clear();
    }
    if (from != null) {
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : from) {
        this.addToFrom(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasFrom() {
    return from != null && !from.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      addNewFrom() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .FromNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      addNewFromLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .FromNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      setNewFromLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .FromNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editFrom(java.lang.Integer index) {
    if (from.size() <= index) throw new RuntimeException("Can't edit from. Index exceeds size.");
    return setNewFromLike(index, buildFrom(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editFirstFrom() {
    if (from.size() == 0) throw new RuntimeException("Can't edit first from. The list is empty.");
    return setNewFromLike(0, buildFrom(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editLastFrom() {
    int index = from.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last from. The list is empty.");
    return setNewFromLike(index, buildFrom(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<A>
      editMatchingFrom(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < from.size(); i++) {
      if (predicate.test(from.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching from. No match found.");
    return setNewFromLike(index, buildFrom(index));
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) {
      _visitables.get("ports").add(builder);
    } else {
      _visitables.get("ports").set(index, builder);
    }
    if (index < 0 || index >= ports.size()) {
      ports.add(builder);
    } else {
      ports.set(index, builder);
    }
    return (A) this;
  }

  public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> each =
        ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildPorts instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildPort(
      java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(
      java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPort> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      addNewPort() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .PortsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluentImpl
        .PortsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editPort(java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ports.size(); i++) {
      if (predicate.test(ports.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyIngressRuleFluentImpl that = (V1NetworkPolicyIngressRuleFluentImpl) o;
    if (from != null ? !from.equals(that.from) : that.from != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(from, ports, super.hashCode());
  }

  public class FromNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.FromNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FromNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(this, item);
    }

    FromNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluentImpl.this.setToFrom(index, builder.build());
    }

    public N endFrom() {
      return and();
    }
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent.PortsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }
}
