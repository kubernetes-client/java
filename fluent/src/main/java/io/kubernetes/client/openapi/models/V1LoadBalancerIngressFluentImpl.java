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
public class V1LoadBalancerIngressFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<A> {
  public V1LoadBalancerIngressFluentImpl() {}

  public V1LoadBalancerIngressFluentImpl(
      io.kubernetes.client.openapi.models.V1LoadBalancerIngress instance) {
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withPorts(instance.getPorts());
  }

  private java.lang.String hostname;
  private java.lang.String ip;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PortStatusBuilder> ports;

  public java.lang.String getHostname() {
    return this.hostname;
  }

  public A withHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return (A) this;
  }

  public java.lang.Boolean hasHostname() {
    return this.hostname != null;
  }

  /** Method is deprecated. use withHostname instead. */
  @java.lang.Deprecated
  public A withNewHostname(java.lang.String original) {
    return (A) withHostname(new String(original));
  }

  public java.lang.String getIp() {
    return this.ip;
  }

  public A withIp(java.lang.String ip) {
    this.ip = ip;
    return (A) this;
  }

  public java.lang.Boolean hasIp() {
    return this.ip != null;
  }

  /** Method is deprecated. use withIp instead. */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String original) {
    return (A) withIp(new String(original));
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PortStatusBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
        new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PortStatusBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
        new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
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

  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PortStatusBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PortStatus item : items) {
      io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
          new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PortStatus> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PortStatusBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PortStatus item : items) {
      io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
          new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items) {
    for (io.kubernetes.client.openapi.models.V1PortStatus item : items) {
      io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
          new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PortStatus> items) {
    for (io.kubernetes.client.openapi.models.V1PortStatus item : items) {
      io.kubernetes.client.openapi.models.V1PortStatusBuilder builder =
          new io.kubernetes.client.openapi.models.V1PortStatusBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PortStatusBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PortStatusBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.V1PortStatus buildPort(java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PortStatus buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PortStatus buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PortStatus buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PortStatusBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PortStatusBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.V1PortStatus> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PortStatus item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.V1PortStatus item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      addNewPort() {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluentImpl
        .PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      addNewPortLike(io.kubernetes.client.openapi.models.V1PortStatus item) {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluentImpl.PortsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      setNewPortLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item) {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluentImpl.PortsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A> editPort(
      java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<A>
      editMatchingPort(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PortStatusBuilder>
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
    V1LoadBalancerIngressFluentImpl that = (V1LoadBalancerIngressFluentImpl) o;
    if (hostname != null ? !hostname.equals(that.hostname) : that.hostname != null) return false;
    if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(hostname, ip, ports, super.hashCode());
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PortStatusFluentImpl<
          io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent.PortsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PortStatus item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1PortStatusBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PortStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PortStatusBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1LoadBalancerIngressFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }
}
