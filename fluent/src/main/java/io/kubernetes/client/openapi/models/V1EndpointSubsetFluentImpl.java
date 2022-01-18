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
public class V1EndpointSubsetFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<A> {
  public V1EndpointSubsetFluentImpl() {}

  public V1EndpointSubsetFluentImpl(io.kubernetes.client.openapi.models.V1EndpointSubset instance) {
    this.withAddresses(instance.getAddresses());

    this.withNotReadyAddresses(instance.getNotReadyAddresses());

    this.withPorts(instance.getPorts());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
      addresses;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
      notReadyAddresses;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder> ports;

  public A addToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
    _visitables
        .get("addresses")
        .add(index >= 0 ? index : _visitables.get("addresses").size(), builder);
    this.addresses.add(index >= 0 ? index : addresses.size(), builder);
    return (A) this;
  }

  public A setToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
    if (index < 0 || index >= _visitables.get("addresses").size()) {
      _visitables.get("addresses").add(builder);
    } else {
      _visitables.get("addresses").set(index, builder);
    }
    if (index < 0 || index >= addresses.size()) {
      addresses.add(builder);
    } else {
      addresses.set(index, builder);
    }
    return (A) this;
  }

  public A addToAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("addresses").add(builder);
      this.addresses.add(builder);
    }
    return (A) this;
  }

  public A addAllToAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("addresses").add(builder);
      this.addresses.add(builder);
    }
    return (A) this;
  }

  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("addresses").remove(builder);
      if (this.addresses != null) {
        this.addresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("addresses").remove(builder);
      if (this.addresses != null) {
        this.addresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    if (addresses == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> each =
        addresses.iterator();
    final List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildAddresses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> getAddresses() {
    return addresses != null ? build(addresses) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> buildAddresses() {
    return addresses != null ? build(addresses) : null;
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildAddress(
      java.lang.Integer index) {
    return this.addresses.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstAddress() {
    return this.addresses.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastAddress() {
    return this.addresses.get(addresses.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddressBuilder item : addresses) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddressBuilder item : addresses) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> addresses) {
    if (this.addresses != null) {
      _visitables.get("addresses").removeAll(this.addresses);
    }
    if (addresses != null) {
      this.addresses = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EndpointAddress item : addresses) {
        this.addToAddresses(item);
      }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }

  public A withAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... addresses) {
    if (this.addresses != null) {
      this.addresses.clear();
    }
    if (addresses != null) {
      for (io.kubernetes.client.openapi.models.V1EndpointAddress item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      addNewAddress() {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.AddressesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      addNewAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.AddressesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      setNewAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.AddressesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A> editAddress(
      java.lang.Integer index) {
    if (addresses.size() <= index)
      throw new RuntimeException("Can't edit addresses. Index exceeds size.");
    return setNewAddressLike(index, buildAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editFirstAddress() {
    if (addresses.size() == 0)
      throw new RuntimeException("Can't edit first addresses. The list is empty.");
    return setNewAddressLike(0, buildAddress(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
    return setNewAddressLike(index, buildAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<A>
      editMatchingAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < addresses.size(); i++) {
      if (predicate.test(addresses.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching addresses. No match found.");
    return setNewAddressLike(index, buildAddress(index));
  }

  public A addToNotReadyAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
    _visitables
        .get("notReadyAddresses")
        .add(index >= 0 ? index : _visitables.get("notReadyAddresses").size(), builder);
    this.notReadyAddresses.add(index >= 0 ? index : notReadyAddresses.size(), builder);
    return (A) this;
  }

  public A setToNotReadyAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
    if (index < 0 || index >= _visitables.get("notReadyAddresses").size()) {
      _visitables.get("notReadyAddresses").add(builder);
    } else {
      _visitables.get("notReadyAddresses").set(index, builder);
    }
    if (index < 0 || index >= notReadyAddresses.size()) {
      notReadyAddresses.add(builder);
    } else {
      notReadyAddresses.set(index, builder);
    }
    return (A) this;
  }

  public A addToNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("notReadyAddresses").add(builder);
      this.notReadyAddresses.add(builder);
    }
    return (A) this;
  }

  public A addAllToNotReadyAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("notReadyAddresses").add(builder);
      this.notReadyAddresses.add(builder);
    }
    return (A) this;
  }

  public A removeFromNotReadyAddresses(
      io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("notReadyAddresses").remove(builder);
      if (this.notReadyAddresses != null) {
        this.notReadyAddresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromNotReadyAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1EndpointAddress> items) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddress item : items) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(item);
      _visitables.get("notReadyAddresses").remove(builder);
      if (this.notReadyAddresses != null) {
        this.notReadyAddresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromNotReadyAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    if (notReadyAddresses == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> each =
        notReadyAddresses.iterator();
    final List visitables = _visitables.get("notReadyAddresses");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildNotReadyAddresses instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress>
      getNotReadyAddresses() {
    return notReadyAddresses != null ? build(notReadyAddresses) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress>
      buildNotReadyAddresses() {
    return notReadyAddresses != null ? build(notReadyAddresses) : null;
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildNotReadyAddress(
      java.lang.Integer index) {
    return this.notReadyAddresses.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildFirstNotReadyAddress() {
    return this.notReadyAddresses.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildLastNotReadyAddress() {
    return this.notReadyAddresses.get(notReadyAddresses.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1EndpointAddress buildMatchingNotReadyAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddressBuilder item : notReadyAddresses) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingNotReadyAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1EndpointAddressBuilder item : notReadyAddresses) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withNotReadyAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1EndpointAddress> notReadyAddresses) {
    if (this.notReadyAddresses != null) {
      _visitables.get("notReadyAddresses").removeAll(this.notReadyAddresses);
    }
    if (notReadyAddresses != null) {
      this.notReadyAddresses = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1EndpointAddress item : notReadyAddresses) {
        this.addToNotReadyAddresses(item);
      }
    } else {
      this.notReadyAddresses = null;
    }
    return (A) this;
  }

  public A withNotReadyAddresses(
      io.kubernetes.client.openapi.models.V1EndpointAddress... notReadyAddresses) {
    if (this.notReadyAddresses != null) {
      this.notReadyAddresses.clear();
    }
    if (notReadyAddresses != null) {
      for (io.kubernetes.client.openapi.models.V1EndpointAddress item : notReadyAddresses) {
        this.addToNotReadyAddresses(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasNotReadyAddresses() {
    return notReadyAddresses != null && !notReadyAddresses.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      addNewNotReadyAddress() {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl
        .NotReadyAddressesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      addNewNotReadyAddressLike(io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl
        .NotReadyAddressesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      setNewNotReadyAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl
        .NotReadyAddressesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editNotReadyAddress(java.lang.Integer index) {
    if (notReadyAddresses.size() <= index)
      throw new RuntimeException("Can't edit notReadyAddresses. Index exceeds size.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editFirstNotReadyAddress() {
    if (notReadyAddresses.size() == 0)
      throw new RuntimeException("Can't edit first notReadyAddresses. The list is empty.");
    return setNewNotReadyAddressLike(0, buildNotReadyAddress(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editLastNotReadyAddress() {
    int index = notReadyAddresses.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last notReadyAddresses. The list is empty.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<A>
      editMatchingNotReadyAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < notReadyAddresses.size(); i++) {
      if (predicate.test(notReadyAddresses.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching notReadyAddresses. No match found.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }

  public A addToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>();
    }
    io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
        new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
    _visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);
    this.ports.add(index >= 0 ? index : ports.size(), builder);
    return (A) this;
  }

  public A setToPorts(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>();
    }
    io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
        new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
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

  public A addToPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A addAllToPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.CoreV1EndpointPort> items) {
    if (this.ports == null) {
      this.ports =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>();
    }
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
      _visitables.get("ports").add(builder);
      this.ports.add(builder);
    }
    return (A) this;
  }

  public A removeFromPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items) {
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPorts(
      java.util.Collection<io.kubernetes.client.openapi.models.CoreV1EndpointPort> items) {
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : items) {
      io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder =
          new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(item);
      _visitables.get("ports").remove(builder);
      if (this.ports != null) {
        this.ports.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPorts(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate) {
    if (ports == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder> each =
        ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> getPorts() {
    return ports != null ? build(ports) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildPort(java.lang.Integer index) {
    return this.ports.get(index).build();
  }

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildFirstPort() {
    return this.ports.get(0).build();
  }

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.CoreV1EndpointPort buildMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder item : ports) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder item : ports) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPorts(java.util.List<io.kubernetes.client.openapi.models.CoreV1EndpointPort> ports) {
    if (this.ports != null) {
      _visitables.get("ports").removeAll(this.ports);
    }
    if (ports != null) {
      this.ports = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : ports) {
        this.addToPorts(item);
      }
    } else {
      this.ports = null;
    }
    return (A) this;
  }

  public A withPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... ports) {
    if (this.ports != null) {
      this.ports.clear();
    }
    if (ports != null) {
      for (io.kubernetes.client.openapi.models.CoreV1EndpointPort item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPort() {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.PortsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> addNewPortLike(
      io.kubernetes.client.openapi.models.CoreV1EndpointPort item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.PortsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> setNewPortLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item) {
    return new io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl.PortsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editPort(
      java.lang.Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }

  public io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<A> editMatchingPort(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder>
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
    V1EndpointSubsetFluentImpl that = (V1EndpointSubsetFluentImpl) o;
    if (addresses != null ? !addresses.equals(that.addresses) : that.addresses != null)
      return false;
    if (notReadyAddresses != null
        ? !notReadyAddresses.equals(that.notReadyAddresses)
        : that.notReadyAddresses != null) return false;
    if (ports != null ? !ports.equals(that.ports) : that.ports != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(addresses, notReadyAddresses, ports, super.hashCode());
  }

  public class AddressesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EndpointAddressFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.AddressesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AddressesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(this, item);
    }

    AddressesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToAddresses(index, builder.build());
    }

    public N endAddress() {
      return and();
    }
  }

  public class NotReadyAddressesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EndpointAddressFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.NotReadyAddressesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NotReadyAddressesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1EndpointAddress item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(this, item);
    }

    NotReadyAddressesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1EndpointAddressBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EndpointAddressBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToNotReadyAddresses(index, builder.build());
    }

    public N endNotReadyAddress() {
      return and();
    }
  }

  public class PortsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.CoreV1EndpointPortFluentImpl<
          io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<N>>
      implements io.kubernetes.client.openapi.models.V1EndpointSubsetFluent.PortsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.CoreV1EndpointPort item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(this, item);
    }

    PortsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder(this);
    }

    io.kubernetes.client.openapi.models.CoreV1EndpointPortBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToPorts(index, builder.build());
    }

    public N endPort() {
      return and();
    }
  }
}
