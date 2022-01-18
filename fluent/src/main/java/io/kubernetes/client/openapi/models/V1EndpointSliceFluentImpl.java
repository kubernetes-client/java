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
public class V1EndpointSliceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1EndpointSliceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EndpointSliceFluent<A> {
  public V1EndpointSliceFluentImpl() {}

  public V1EndpointSliceFluentImpl(io.kubernetes.client.openapi.models.V1EndpointSlice instance) {
    this.withAddressType(instance.getAddressType());

    this.withApiVersion(instance.getApiVersion());

    this.withEndpoints(instance.getEndpoints());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPorts(instance.getPorts());
  }

  private io.kubernetes.client.openapi.models.V1EndpointSlice.AddressTypeEnum addressType;
  private java.lang.String apiVersion;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointBuilder> endpoints;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>
      ports;

  public io.kubernetes.client.openapi.models.V1EndpointSlice.AddressTypeEnum getAddressType() {
    return this.addressType;
  }

  public A withAddressType(
      io.kubernetes.client.openapi.models.V1EndpointSlice.AddressTypeEnum addressType) {
    this.addressType = addressType;
    return (A) this;
  }

  public java.lang.Boolean hasAddressType() {
    return this.addressType != null;
  }

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public A addToEndpoints(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Endpoint item) {
    if (this.endpoints == null) {
      this.endpoints =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
    _visitables
        .get("endpoints")
        .add(index >= 0 ? index : _visitables.get("endpoints").size(), builder);
    this.endpoints.add(index >= 0 ? index : endpoints.size(), builder);
    return (A) this;
  }

  public A setToEndpoints(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Endpoint item) {
    if (this.endpoints == null) {
      this.endpoints =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
    if (index < 0 || index >= _visitables.get("endpoints").size()) {
      _visitables.get("endpoints").add(builder);
    } else {
      _visitables.get("endpoints").set(index, builder);
    }
    if (index < 0 || index >= endpoints.size()) {
      endpoints.add(builder);
    } else {
      endpoints.set(index, builder);
    }
    return (A) this;
  }

  public A addToEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items) {
    if (this.endpoints == null) {
      this.endpoints =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Endpoint item : items) {
      io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
      _visitables.get("endpoints").add(builder);
      this.endpoints.add(builder);
    }
    return (A) this;
  }

  public A addAllToEndpoints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Endpoint> items) {
    if (this.endpoints == null) {
      this.endpoints =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1Endpoint item : items) {
      io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
      _visitables.get("endpoints").add(builder);
      this.endpoints.add(builder);
    }
    return (A) this;
  }

  public A removeFromEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... items) {
    for (io.kubernetes.client.openapi.models.V1Endpoint item : items) {
      io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
      _visitables.get("endpoints").remove(builder);
      if (this.endpoints != null) {
        this.endpoints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromEndpoints(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Endpoint> items) {
    for (io.kubernetes.client.openapi.models.V1Endpoint item : items) {
      io.kubernetes.client.openapi.models.V1EndpointBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointBuilder(item);
      _visitables.get("endpoints").remove(builder);
      if (this.endpoints != null) {
        this.endpoints.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromEndpoints(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointBuilder>
          predicate) {
    if (endpoints == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EndpointBuilder> each =
        endpoints.iterator();
    final List visitables = _visitables.get("endpoints");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EndpointBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildEndpoints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Endpoint> getEndpoints() {
    return endpoints != null ? build(endpoints) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1Endpoint> buildEndpoints() {
    return endpoints != null ? build(endpoints) : null;
  }

  public io.kubernetes.client.openapi.models.V1Endpoint buildEndpoint(java.lang.Integer index) {
    return this.endpoints.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1Endpoint buildFirstEndpoint() {
    return this.endpoints.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1Endpoint buildLastEndpoint() {
    return this.endpoints.get(endpoints.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1Endpoint buildMatchingEndpoint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointBuilder item : endpoints) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingEndpoint(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointBuilder item : endpoints) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withEndpoints(java.util.List<io.kubernetes.client.openapi.models.V1Endpoint> endpoints) {
    if (this.endpoints != null) {
      _visitables.get("endpoints").removeAll(this.endpoints);
    }
    if (endpoints != null) {
      this.endpoints = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1Endpoint item : endpoints) {
        this.addToEndpoints(item);
      }
    } else {
      this.endpoints = null;
    }
    return (A) this;
  }

  public A withEndpoints(io.kubernetes.client.openapi.models.V1Endpoint... endpoints) {
    if (this.endpoints != null) {
      this.endpoints.clear();
    }
    if (endpoints != null) {
      for (io.kubernetes.client.openapi.models.V1Endpoint item : endpoints) {
        this.addToEndpoints(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasEndpoints() {
    return endpoints != null && !endpoints.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      addNewEndpoint() {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.EndpointsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      addNewEndpointLike(io.kubernetes.client.openapi.models.V1Endpoint item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.EndpointsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      setNewEndpointLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Endpoint item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.EndpointsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A> editEndpoint(
      java.lang.Integer index) {
    if (endpoints.size() <= index)
      throw new RuntimeException("Can't edit endpoints. Index exceeds size.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      editFirstEndpoint() {
    if (endpoints.size() == 0)
      throw new RuntimeException("Can't edit first endpoints. The list is empty.");
    return setNewEndpointLike(0, buildEndpoint(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      editLastEndpoint() {
    int index = endpoints.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last endpoints. The list is empty.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<A>
      editMatchingEndpoint(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < endpoints.size(); i++) {
      if (predicate.test(endpoints.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching endpoints. No match found.");
    return setNewEndpointLike(index, buildEndpoint(index));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.MetadataNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>();
    }
    io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
        new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>();
    }
    io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
        new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
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

  public A addToPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... items) {
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort> items) {
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder> each =
        ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort buildPort(
      java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort buildMatchingPort(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(
      java.util.List<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> addNewPort() {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.PortsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl.PortsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> editPort(
      java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>
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
    V1EndpointSliceFluentImpl that = (V1EndpointSliceFluentImpl) o;
    if (addressType != null ? !addressType.equals(that.addressType) : that.addressType != null)
      return false;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (endpoints != null ? !endpoints.equals(that.endpoints) : that.endpoints != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        addressType, apiVersion, endpoints, kind, metadata, ports, super.hashCode());
  }

  public class EndpointsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EndpointFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSliceFluent.EndpointsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EndpointsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1Endpoint item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointBuilder(this, item);
    }

    EndpointsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EndpointBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.setToEndpoints(index, builder.build());
    }

    public N endEndpoint() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSliceFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSliceFluent.PortsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder(this);
    }

    io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointSliceFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }
}
