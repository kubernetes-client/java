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
public class V1NetworkPolicyEgressRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent<A> {
  public V1NetworkPolicyEgressRuleFluentImpl() {}

  public V1NetworkPolicyEgressRuleFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule instance) {
    this.withPorts(instance.getPorts());

    this.withTo(instance.getTo());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> ports;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> to;

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

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      addNewPort() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl
        .PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl
        .PortsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPort item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl
        .PortsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editPort(java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
      editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<A>
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

  public A addToTo(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    if (this.to == null) {
      this.to =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
    _visitables.get("to").add(index >= 0 ? index : _visitables.get("to").size(), builder);
    this.to.add(index >= 0 ? index : to.size(), builder);
    return (A) this;
  }

  public A setToTo(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    if (this.to == null) {
      this.to =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
        new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= _visitables.get("to").size()) {
      _visitables.get("to").add(builder);
    } else {
      _visitables.get("to").set(index, builder);
    }
    if (index < 0 || index >= to.size()) {
      to.add(builder);
    } else {
      to.set(index, builder);
    }
    return (A) this;
  }

  public A addToTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    if (this.to == null) {
      this.to =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("to").add(builder);
      this.to.add(builder);
    }
    return (A) this;
  }

  public A addAllToTo(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items) {
    if (this.to == null) {
      this.to =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("to").add(builder);
      this.to.add(builder);
    }
    return (A) this;
  }

  public A removeFromTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("to").remove(builder);
      if (this.to != null) {
        this.to.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromTo(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> items) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : items) {
      io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder =
          new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(item);
      _visitables.get("to").remove(builder);
      if (this.to != null) {
        this.to.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    if (to == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder> each =
        to.iterator();
    final List visitables = _visitables.get("to");
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
   * This method has been deprecated, please use method buildTo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> getTo() {
    return to != null ? build(to) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> buildTo() {
    return to != null ? build(to) : null;
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildTo(java.lang.Integer index) {
    return this.to.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildFirstTo() {
    return this.to.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildLastTo() {
    return this.to.get(to.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyPeer buildMatchingTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder item : to) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTo(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder item : to) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTo(java.util.List<io.kubernetes.client.openapi.models.V1NetworkPolicyPeer> to) {
    if (this.to != null) {
      _visitables.get("to").removeAll(this.to);
    }
    if (to != null) {
      this.to = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : to) {
        this.addToTo(item);
      }
    } else {
      this.to = null;
    }
    return (A) this;
  }

  public A withTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... to) {
    if (this.to != null) {
      this.to.clear();
    }
    if (to != null) {
      for (io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item : to) {
        this.addToTo(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTo() {
    return to != null && !to.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      addNewTo() {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl
        .ToNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      addNewToLike(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl.ToNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      setNewToLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
    return new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluentImpl.ToNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A> editTo(
      java.lang.Integer index) {
    if (to.size() <= index) throw new RuntimeException("Can't edit to. Index exceeds size.");
    return setNewToLike(index, buildTo(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editFirstTo() {
    if (to.size() == 0) throw new RuntimeException("Can't edit first to. The list is empty.");
    return setNewToLike(0, buildTo(0));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editLastTo() {
    int index = to.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last to. The list is empty.");
    return setNewToLike(index, buildTo(index));
  }

  public io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<A>
      editMatchingTo(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < to.size(); i++) {
      if (predicate.test(to.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching to. No match found.");
    return setNewToLike(index, buildTo(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyEgressRuleFluentImpl that = (V1NetworkPolicyEgressRuleFluentImpl) o;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    if (to != null ? !to.equals(that.to) : that.to != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ports, to, super.hashCode());
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.PortsNested<N>,
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
      return (N) V1NetworkPolicyEgressRuleFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }

  public class ToNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NetworkPolicyPeerFluentImpl<
          io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<N>>
      implements io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRuleFluent.ToNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ToNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NetworkPolicyPeer item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(this, item);
    }

    ToNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NetworkPolicyPeerBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NetworkPolicyEgressRuleFluentImpl.this.setToTo(index, builder.build());
    }

    public N endTo() {
      return and();
    }
  }
}
