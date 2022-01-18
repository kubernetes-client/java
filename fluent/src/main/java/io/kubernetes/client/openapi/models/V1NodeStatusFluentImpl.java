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
public class V1NodeStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeStatusFluent<A> {
  public V1NodeStatusFluentImpl() {}

  public V1NodeStatusFluentImpl(io.kubernetes.client.openapi.models.V1NodeStatus instance) {
    this.withAddresses(instance.getAddresses());

    this.withAllocatable(instance.getAllocatable());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withConfig(instance.getConfig());

    this.withDaemonEndpoints(instance.getDaemonEndpoints());

    this.withImages(instance.getImages());

    this.withNodeInfo(instance.getNodeInfo());

    this.withPhase(instance.getPhase());

    this.withVolumesAttached(instance.getVolumesAttached());

    this.withVolumesInUse(instance.getVolumesInUse());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeAddressBuilder> addresses;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatable;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
      conditions;
  private io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder config;
  private io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder daemonEndpoints;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerImageBuilder> images;
  private io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder nodeInfo;
  private io.kubernetes.client.openapi.models.V1NodeStatus.PhaseEnum phase;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
      volumesAttached;
  private java.util.List<java.lang.String> volumesInUse;

  public A addToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
    _visitables
        .get("addresses")
        .add(index >= 0 ? index : _visitables.get("addresses").size(), builder);
    this.addresses.add(index >= 0 ? index : addresses.size(), builder);
    return (A) this;
  }

  public A setToAddresses(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
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

  public A addToAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeAddress item : items) {
      io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
      _visitables.get("addresses").add(builder);
      this.addresses.add(builder);
    }
    return (A) this;
  }

  public A addAllToAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeAddress> items) {
    if (this.addresses == null) {
      this.addresses =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeAddress item : items) {
      io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
      _visitables.get("addresses").add(builder);
      this.addresses.add(builder);
    }
    return (A) this;
  }

  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... items) {
    for (io.kubernetes.client.openapi.models.V1NodeAddress item : items) {
      io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
      _visitables.get("addresses").remove(builder);
      if (this.addresses != null) {
        this.addresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromAddresses(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeAddress> items) {
    for (io.kubernetes.client.openapi.models.V1NodeAddress item : items) {
      io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(item);
      _visitables.get("addresses").remove(builder);
      if (this.addresses != null) {
        this.addresses.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromAddresses(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate) {
    if (addresses == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NodeAddressBuilder> each =
        addresses.iterator();
    final List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder = each.next();
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
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> getAddresses() {
    return addresses != null ? build(addresses) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> buildAddresses() {
    return addresses != null ? build(addresses) : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeAddress buildAddress(java.lang.Integer index) {
    return this.addresses.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeAddress buildFirstAddress() {
    return this.addresses.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeAddress buildLastAddress() {
    return this.addresses.get(addresses.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeAddress buildMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeAddressBuilder item : addresses) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAddress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeAddressBuilder item : addresses) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAddresses(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeAddress> addresses) {
    if (this.addresses != null) {
      _visitables.get("addresses").removeAll(this.addresses);
    }
    if (addresses != null) {
      this.addresses = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NodeAddress item : addresses) {
        this.addToAddresses(item);
      }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }

  public A withAddresses(io.kubernetes.client.openapi.models.V1NodeAddress... addresses) {
    if (this.addresses != null) {
      this.addresses.clear();
    }
    if (addresses != null) {
      for (io.kubernetes.client.openapi.models.V1NodeAddress item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A> addNewAddress() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.AddressesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      addNewAddressLike(io.kubernetes.client.openapi.models.V1NodeAddress item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.AddressesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      setNewAddressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.AddressesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A> editAddress(
      java.lang.Integer index) {
    if (addresses.size() <= index)
      throw new RuntimeException("Can't edit addresses. Index exceeds size.");
    return setNewAddressLike(index, buildAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editFirstAddress() {
    if (addresses.size() == 0)
      throw new RuntimeException("Can't edit first addresses. The list is empty.");
    return setNewAddressLike(0, buildAddress(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
    return setNewAddressLike(index, buildAddress(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<A>
      editMatchingAddress(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeAddressBuilder>
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

  public A addToAllocatable(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.allocatable == null && key != null && value != null) {
      this.allocatable = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.allocatable.put(key, value);
    }
    return (A) this;
  }

  public A addToAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.allocatable == null && map != null) {
      this.allocatable = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.allocatable.putAll(map);
    }
    return (A) this;
  }

  public A removeFromAllocatable(java.lang.String key) {
    if (this.allocatable == null) {
      return (A) this;
    }
    if (key != null && this.allocatable != null) {
      this.allocatable.remove(key);
    }
    return (A) this;
  }

  public A removeFromAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.allocatable == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.allocatable != null) {
          this.allocatable.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getAllocatable() {
    return this.allocatable;
  }

  public <K, V> A withAllocatable(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> allocatable) {
    if (allocatable == null) {
      this.allocatable = null;
    } else {
      this.allocatable = new java.util.LinkedHashMap(allocatable);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAllocatable() {
    return this.allocatable != null;
  }

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.capacity == null && key != null && value != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.capacity.put(key, value);
    }
    return (A) this;
  }

  public A addToCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null && map != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.capacity.putAll(map);
    }
    return (A) this;
  }

  public A removeFromCapacity(java.lang.String key) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (key != null && this.capacity != null) {
      this.capacity.remove(key);
    }
    return (A) this;
  }

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.capacity != null) {
          this.capacity.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity() {
    return this.capacity;
  }

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new java.util.LinkedHashMap(capacity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCapacity() {
    return this.capacity != null;
  }

  public A addToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
    _visitables
        .get("conditions")
        .add(index >= 0 ? index : _visitables.get("conditions").size(), builder);
    this.conditions.add(index >= 0 ? index : conditions.size(), builder);
    return (A) this;
  }

  public A setToConditions(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>();
    }
    io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
        new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) {
      _visitables.get("conditions").add(builder);
    } else {
      _visitables.get("conditions").set(index, builder);
    }
    if (index < 0 || index >= conditions.size()) {
      conditions.add(builder);
    } else {
      conditions.set(index, builder);
    }
    return (A) this;
  }

  public A addToConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeCondition item : items) {
      io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A addAllToConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeCondition> items) {
    if (this.conditions == null) {
      this.conditions =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1NodeCondition item : items) {
      io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
      _visitables.get("conditions").add(builder);
      this.conditions.add(builder);
    }
    return (A) this;
  }

  public A removeFromConditions(io.kubernetes.client.openapi.models.V1NodeCondition... items) {
    for (io.kubernetes.client.openapi.models.V1NodeCondition item : items) {
      io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromConditions(
      java.util.Collection<io.kubernetes.client.openapi.models.V1NodeCondition> items) {
    for (io.kubernetes.client.openapi.models.V1NodeCondition item : items) {
      io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder =
          new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(item);
      _visitables.get("conditions").remove(builder);
      if (this.conditions != null) {
        this.conditions.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromConditions(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1NodeConditionBuilder> each =
        conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeCondition buildCondition(
      java.lang.Integer index) {
    return this.conditions.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1NodeCondition buildMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingCondition(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1NodeConditionBuilder item : conditions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConditions(
      java.util.List<io.kubernetes.client.openapi.models.V1NodeCondition> conditions) {
    if (this.conditions != null) {
      _visitables.get("conditions").removeAll(this.conditions);
    }
    if (conditions != null) {
      this.conditions = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1NodeCondition item : conditions) {
        this.addToConditions(item);
      }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }

  public A withConditions(io.kubernetes.client.openapi.models.V1NodeCondition... conditions) {
    if (this.conditions != null) {
      this.conditions.clear();
    }
    if (conditions != null) {
      for (io.kubernetes.client.openapi.models.V1NodeCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      addNewCondition() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      addNewConditionLike(io.kubernetes.client.openapi.models.V1NodeCondition item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ConditionsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      setNewConditionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ConditionsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A> editCondition(
      java.lang.Integer index) {
    if (conditions.size() <= index)
      throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editFirstCondition() {
    if (conditions.size() == 0)
      throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<A>
      editMatchingCondition(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NodeConditionBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < conditions.size(); i++) {
      if (predicate.test(conditions.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }

  /**
   * This method has been deprecated, please use method buildConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigStatus getConfig() {
    return this.config != null ? this.config.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeConfigStatus buildConfig() {
    return this.config != null ? this.config.build() : null;
  }

  public A withConfig(io.kubernetes.client.openapi.models.V1NodeConfigStatus config) {
    _visitables.get("config").remove(this.config);
    if (config != null) {
      this.config = new io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder(config);
      _visitables.get("config").add(this.config);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConfig() {
    return this.config != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> withNewConfig() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ConfigNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> withNewConfigLike(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ConfigNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editConfig() {
    return withNewConfigLike(getConfig());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editOrNewConfig() {
    return withNewConfigLike(
        getConfig() != null
            ? getConfig()
            : new io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(
      io.kubernetes.client.openapi.models.V1NodeConfigStatus item) {
    return withNewConfigLike(getConfig() != null ? getConfig() : item);
  }

  /**
   * This method has been deprecated, please use method buildDaemonEndpoints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints getDaemonEndpoints() {
    return this.daemonEndpoints != null ? this.daemonEndpoints.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints buildDaemonEndpoints() {
    return this.daemonEndpoints != null ? this.daemonEndpoints.build() : null;
  }

  public A withDaemonEndpoints(
      io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints daemonEndpoints) {
    _visitables.get("daemonEndpoints").remove(this.daemonEndpoints);
    if (daemonEndpoints != null) {
      this.daemonEndpoints =
          new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder(daemonEndpoints);
      _visitables.get("daemonEndpoints").add(this.daemonEndpoints);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDaemonEndpoints() {
    return this.daemonEndpoints != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      withNewDaemonEndpoints() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl
        .DaemonEndpointsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      withNewDaemonEndpointsLike(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.DaemonEndpointsNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editDaemonEndpoints() {
    return withNewDaemonEndpointsLike(getDaemonEndpoints());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editOrNewDaemonEndpoints() {
    return withNewDaemonEndpointsLike(
        getDaemonEndpoints() != null
            ? getDaemonEndpoints()
            : new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<A>
      editOrNewDaemonEndpointsLike(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints item) {
    return withNewDaemonEndpointsLike(getDaemonEndpoints() != null ? getDaemonEndpoints() : item);
  }

  public A addToImages(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item) {
    if (this.images == null) {
      this.images =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
    _visitables.get("images").add(index >= 0 ? index : _visitables.get("images").size(), builder);
    this.images.add(index >= 0 ? index : images.size(), builder);
    return (A) this;
  }

  public A setToImages(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item) {
    if (this.images == null) {
      this.images =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
        new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
    if (index < 0 || index >= _visitables.get("images").size()) {
      _visitables.get("images").add(builder);
    } else {
      _visitables.get("images").set(index, builder);
    }
    if (index < 0 || index >= images.size()) {
      images.add(builder);
    } else {
      images.set(index, builder);
    }
    return (A) this;
  }

  public A addToImages(io.kubernetes.client.openapi.models.V1ContainerImage... items) {
    if (this.images == null) {
      this.images =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ContainerImage item : items) {
      io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
      _visitables.get("images").add(builder);
      this.images.add(builder);
    }
    return (A) this;
  }

  public A addAllToImages(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerImage> items) {
    if (this.images == null) {
      this.images =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ContainerImage item : items) {
      io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
      _visitables.get("images").add(builder);
      this.images.add(builder);
    }
    return (A) this;
  }

  public A removeFromImages(io.kubernetes.client.openapi.models.V1ContainerImage... items) {
    for (io.kubernetes.client.openapi.models.V1ContainerImage item : items) {
      io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
      _visitables.get("images").remove(builder);
      if (this.images != null) {
        this.images.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromImages(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ContainerImage> items) {
    for (io.kubernetes.client.openapi.models.V1ContainerImage item : items) {
      io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder =
          new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(item);
      _visitables.get("images").remove(builder);
      if (this.images != null) {
        this.images.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromImages(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate) {
    if (images == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ContainerImageBuilder> each =
        images.iterator();
    final List visitables = _visitables.get("images");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildImages instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> getImages() {
    return images != null ? build(images) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> buildImages() {
    return images != null ? build(images) : null;
  }

  public io.kubernetes.client.openapi.models.V1ContainerImage buildImage(java.lang.Integer index) {
    return this.images.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerImage buildFirstImage() {
    return this.images.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerImage buildLastImage() {
    return this.images.get(images.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ContainerImage buildMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerImageBuilder item : images) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ContainerImageBuilder item : images) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withImages(java.util.List<io.kubernetes.client.openapi.models.V1ContainerImage> images) {
    if (this.images != null) {
      _visitables.get("images").removeAll(this.images);
    }
    if (images != null) {
      this.images = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ContainerImage item : images) {
        this.addToImages(item);
      }
    } else {
      this.images = null;
    }
    return (A) this;
  }

  public A withImages(io.kubernetes.client.openapi.models.V1ContainerImage... images) {
    if (this.images != null) {
      this.images.clear();
    }
    if (images != null) {
      for (io.kubernetes.client.openapi.models.V1ContainerImage item : images) {
        this.addToImages(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasImages() {
    return images != null && !images.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> addNewImage() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ImagesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> addNewImageLike(
      io.kubernetes.client.openapi.models.V1ContainerImage item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ImagesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> setNewImageLike(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.ImagesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editImage(
      java.lang.Integer index) {
    if (images.size() <= index)
      throw new RuntimeException("Can't edit images. Index exceeds size.");
    return setNewImageLike(index, buildImage(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editFirstImage() {
    if (images.size() == 0)
      throw new RuntimeException("Can't edit first images. The list is empty.");
    return setNewImageLike(0, buildImage(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editLastImage() {
    int index = images.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
    return setNewImageLike(index, buildImage(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<A> editMatchingImage(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ContainerImageBuilder>
          predicate) {
    int index = -1;
    for (int i = 0; i < images.size(); i++) {
      if (predicate.test(images.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
    return setNewImageLike(index, buildImage(index));
  }

  /**
   * This method has been deprecated, please use method buildNodeInfo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeSystemInfo getNodeInfo() {
    return this.nodeInfo != null ? this.nodeInfo.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NodeSystemInfo buildNodeInfo() {
    return this.nodeInfo != null ? this.nodeInfo.build() : null;
  }

  public A withNodeInfo(io.kubernetes.client.openapi.models.V1NodeSystemInfo nodeInfo) {
    _visitables.get("nodeInfo").remove(this.nodeInfo);
    if (nodeInfo != null) {
      this.nodeInfo = new io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder(nodeInfo);
      _visitables.get("nodeInfo").add(this.nodeInfo);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeInfo() {
    return this.nodeInfo != null;
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      withNewNodeInfo() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.NodeInfoNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      withNewNodeInfoLike(io.kubernetes.client.openapi.models.V1NodeSystemInfo item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.NodeInfoNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A> editNodeInfo() {
    return withNewNodeInfoLike(getNodeInfo());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      editOrNewNodeInfo() {
    return withNewNodeInfoLike(
        getNodeInfo() != null
            ? getNodeInfo()
            : new io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<A>
      editOrNewNodeInfoLike(io.kubernetes.client.openapi.models.V1NodeSystemInfo item) {
    return withNewNodeInfoLike(getNodeInfo() != null ? getNodeInfo() : item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatus.PhaseEnum getPhase() {
    return this.phase;
  }

  public A withPhase(io.kubernetes.client.openapi.models.V1NodeStatus.PhaseEnum phase) {
    this.phase = phase;
    return (A) this;
  }

  public java.lang.Boolean hasPhase() {
    return this.phase != null;
  }

  public A addToVolumesAttached(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item) {
    if (this.volumesAttached == null) {
      this.volumesAttached =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
    _visitables
        .get("volumesAttached")
        .add(index >= 0 ? index : _visitables.get("volumesAttached").size(), builder);
    this.volumesAttached.add(index >= 0 ? index : volumesAttached.size(), builder);
    return (A) this;
  }

  public A setToVolumesAttached(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item) {
    if (this.volumesAttached == null) {
      this.volumesAttached =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>();
    }
    io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
        new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
    if (index < 0 || index >= _visitables.get("volumesAttached").size()) {
      _visitables.get("volumesAttached").add(builder);
    } else {
      _visitables.get("volumesAttached").set(index, builder);
    }
    if (index < 0 || index >= volumesAttached.size()) {
      volumesAttached.add(builder);
    } else {
      volumesAttached.set(index, builder);
    }
    return (A) this;
  }

  public A addToVolumesAttached(io.kubernetes.client.openapi.models.V1AttachedVolume... items) {
    if (this.volumesAttached == null) {
      this.volumesAttached =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1AttachedVolume item : items) {
      io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
      _visitables.get("volumesAttached").add(builder);
      this.volumesAttached.add(builder);
    }
    return (A) this;
  }

  public A addAllToVolumesAttached(
      java.util.Collection<io.kubernetes.client.openapi.models.V1AttachedVolume> items) {
    if (this.volumesAttached == null) {
      this.volumesAttached =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1AttachedVolume item : items) {
      io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
      _visitables.get("volumesAttached").add(builder);
      this.volumesAttached.add(builder);
    }
    return (A) this;
  }

  public A removeFromVolumesAttached(
      io.kubernetes.client.openapi.models.V1AttachedVolume... items) {
    for (io.kubernetes.client.openapi.models.V1AttachedVolume item : items) {
      io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
      _visitables.get("volumesAttached").remove(builder);
      if (this.volumesAttached != null) {
        this.volumesAttached.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumesAttached(
      java.util.Collection<io.kubernetes.client.openapi.models.V1AttachedVolume> items) {
    for (io.kubernetes.client.openapi.models.V1AttachedVolume item : items) {
      io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder =
          new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(item);
      _visitables.get("volumesAttached").remove(builder);
      if (this.volumesAttached != null) {
        this.volumesAttached.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate) {
    if (volumesAttached == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder> each =
        volumesAttached.iterator();
    final List visitables = _visitables.get("volumesAttached");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVolumesAttached instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume> getVolumesAttached() {
    return volumesAttached != null ? build(volumesAttached) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume>
      buildVolumesAttached() {
    return volumesAttached != null ? build(volumesAttached) : null;
  }

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildVolumesAttached(
      java.lang.Integer index) {
    return this.volumesAttached.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildFirstVolumesAttached() {
    return this.volumesAttached.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildLastVolumesAttached() {
    return this.volumesAttached.get(volumesAttached.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1AttachedVolume buildMatchingVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder item : volumesAttached) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumesAttached(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder item : volumesAttached) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumesAttached(
      java.util.List<io.kubernetes.client.openapi.models.V1AttachedVolume> volumesAttached) {
    if (this.volumesAttached != null) {
      _visitables.get("volumesAttached").removeAll(this.volumesAttached);
    }
    if (volumesAttached != null) {
      this.volumesAttached = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1AttachedVolume item : volumesAttached) {
        this.addToVolumesAttached(item);
      }
    } else {
      this.volumesAttached = null;
    }
    return (A) this;
  }

  public A withVolumesAttached(
      io.kubernetes.client.openapi.models.V1AttachedVolume... volumesAttached) {
    if (this.volumesAttached != null) {
      this.volumesAttached.clear();
    }
    if (volumesAttached != null) {
      for (io.kubernetes.client.openapi.models.V1AttachedVolume item : volumesAttached) {
        this.addToVolumesAttached(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumesAttached() {
    return volumesAttached != null && !volumesAttached.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      addNewVolumesAttached() {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl
        .VolumesAttachedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      addNewVolumesAttachedLike(io.kubernetes.client.openapi.models.V1AttachedVolume item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.VolumesAttachedNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      setNewVolumesAttachedLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item) {
    return new io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl.VolumesAttachedNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editVolumesAttached(java.lang.Integer index) {
    if (volumesAttached.size() <= index)
      throw new RuntimeException("Can't edit volumesAttached. Index exceeds size.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editFirstVolumesAttached() {
    if (volumesAttached.size() == 0)
      throw new RuntimeException("Can't edit first volumesAttached. The list is empty.");
    return setNewVolumesAttachedLike(0, buildVolumesAttached(0));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editLastVolumesAttached() {
    int index = volumesAttached.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last volumesAttached. The list is empty.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }

  public io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<A>
      editMatchingVolumesAttached(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < volumesAttached.size(); i++) {
      if (predicate.test(volumesAttached.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching volumesAttached. No match found.");
    return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
  }

  public A addToVolumesInUse(java.lang.Integer index, java.lang.String item) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new java.util.ArrayList<java.lang.String>();
    }
    this.volumesInUse.add(index, item);
    return (A) this;
  }

  public A setToVolumesInUse(java.lang.Integer index, java.lang.String item) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new java.util.ArrayList<java.lang.String>();
    }
    this.volumesInUse.set(index, item);
    return (A) this;
  }

  public A addToVolumesInUse(java.lang.String... items) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumesInUse.add(item);
    }
    return (A) this;
  }

  public A addAllToVolumesInUse(java.util.Collection<java.lang.String> items) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.volumesInUse.add(item);
    }
    return (A) this;
  }

  public A removeFromVolumesInUse(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.volumesInUse != null) {
        this.volumesInUse.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumesInUse(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.volumesInUse != null) {
        this.volumesInUse.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getVolumesInUse() {
    return this.volumesInUse;
  }

  public java.lang.String getVolumesInUse(java.lang.Integer index) {
    return this.volumesInUse.get(index);
  }

  public java.lang.String getFirstVolumesInUse() {
    return this.volumesInUse.get(0);
  }

  public java.lang.String getLastVolumesInUse() {
    return this.volumesInUse.get(volumesInUse.size() - 1);
  }

  public java.lang.String getMatchingVolumesInUse(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumesInUse) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumesInUse(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : volumesInUse) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumesInUse(java.util.List<java.lang.String> volumesInUse) {
    if (volumesInUse != null) {
      this.volumesInUse = new java.util.ArrayList();
      for (java.lang.String item : volumesInUse) {
        this.addToVolumesInUse(item);
      }
    } else {
      this.volumesInUse = null;
    }
    return (A) this;
  }

  public A withVolumesInUse(java.lang.String... volumesInUse) {
    if (this.volumesInUse != null) {
      this.volumesInUse.clear();
    }
    if (volumesInUse != null) {
      for (java.lang.String item : volumesInUse) {
        this.addToVolumesInUse(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumesInUse() {
    return volumesInUse != null && !volumesInUse.isEmpty();
  }

  public A addNewVolumesInUse(java.lang.String original) {
    return (A) addToVolumesInUse(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeStatusFluentImpl that = (V1NodeStatusFluentImpl) o;
    if (addresses != null ? !addresses.equals(that.addresses) : that.addresses != null)
      return false;
    if (allocatable != null ? !allocatable.equals(that.allocatable) : that.allocatable != null)
      return false;
    if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (config != null ? !config.equals(that.config) : that.config != null) return false;
    if (daemonEndpoints != null
        ? !daemonEndpoints.equals(that.daemonEndpoints)
        : that.daemonEndpoints != null) return false;
    if (images != null ? !images.equals(that.images) : that.images != null) return false;
    if (nodeInfo != null ? !nodeInfo.equals(that.nodeInfo) : that.nodeInfo != null) return false;
    if (phase != null ? !phase.equals(that.phase) : that.phase != null) return false;
    if (volumesAttached != null
        ? !volumesAttached.equals(that.volumesAttached)
        : that.volumesAttached != null) return false;
    if (volumesInUse != null ? !volumesInUse.equals(that.volumesInUse) : that.volumesInUse != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        addresses,
        allocatable,
        capacity,
        conditions,
        config,
        daemonEndpoints,
        images,
        nodeInfo,
        phase,
        volumesAttached,
        volumesInUse,
        super.hashCode());
  }

  public class AddressesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeAddressFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.AddressesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AddressesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeAddress item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(this, item);
    }

    AddressesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeAddressBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeAddressBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToAddresses(index, builder.build());
    }

    public N endAddress() {
      return and();
    }
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConditionFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConditionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1NodeCondition item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConditionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConditionBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToConditions(index, builder.build());
    }

    public N endCondition() {
      return and();
    }
  }

  public class ConfigNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.ConfigNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConfigNestedImpl(io.kubernetes.client.openapi.models.V1NodeConfigStatus item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder(this, item);
    }

    ConfigNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeConfigStatusBuilder builder;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withConfig(builder.build());
    }

    public N endConfig() {
      return and();
    }
  }

  public class DaemonEndpointsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.DaemonEndpointsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DaemonEndpointsNestedImpl(io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder(this, item);
    }

    DaemonEndpointsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeDaemonEndpointsBuilder builder;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withDaemonEndpoints(builder.build());
    }

    public N endDaemonEndpoints() {
      return and();
    }
  }

  public class ImagesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ContainerImageFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.ImagesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ImagesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ContainerImage item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(this, item);
    }

    ImagesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ContainerImageBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ContainerImageBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToImages(index, builder.build());
    }

    public N endImage() {
      return and();
    }
  }

  public class NodeInfoNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NodeSystemInfoFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.NodeInfoNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeInfoNestedImpl(io.kubernetes.client.openapi.models.V1NodeSystemInfo item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder(this, item);
    }

    NodeInfoNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NodeSystemInfoBuilder builder;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.withNodeInfo(builder.build());
    }

    public N endNodeInfo() {
      return and();
    }
  }

  public class VolumesAttachedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluentImpl<
          io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<N>>
      implements io.kubernetes.client.openapi.models.V1NodeStatusFluent.VolumesAttachedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VolumesAttachedNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1AttachedVolume item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(this, item);
    }

    VolumesAttachedNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1NodeStatusFluentImpl.this.setToVolumesAttached(index, builder.build());
    }

    public N endVolumesAttached() {
      return and();
    }
  }
}
