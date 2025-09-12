package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.RuntimeException;
import java.util.Iterator;
import io.kubernetes.client.custom.Quantity;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeStatusFluent<A extends io.kubernetes.client.openapi.models.V1NodeStatusFluent<A>> extends BaseFluent<A>{
  public V1NodeStatusFluent() {
  }
  
  public V1NodeStatusFluent(V1NodeStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1NodeAddressBuilder> addresses;
  private Map<String,Quantity> allocatable;
  private Map<String,Quantity> capacity;
  private ArrayList<V1NodeConditionBuilder> conditions;
  private V1NodeConfigStatusBuilder config;
  private V1NodeDaemonEndpointsBuilder daemonEndpoints;
  private V1NodeFeaturesBuilder features;
  private ArrayList<V1ContainerImageBuilder> images;
  private V1NodeSystemInfoBuilder nodeInfo;
  private String phase;
  private ArrayList<V1NodeRuntimeHandlerBuilder> runtimeHandlers;
  private ArrayList<V1AttachedVolumeBuilder> volumesAttached;
  private List<String> volumesInUse;
  
  protected void copyInstance(V1NodeStatus instance) {
    instance = instance != null ? instance : new V1NodeStatus();
    if (instance != null) {
        this.withAddresses(instance.getAddresses());
        this.withAllocatable(instance.getAllocatable());
        this.withCapacity(instance.getCapacity());
        this.withConditions(instance.getConditions());
        this.withConfig(instance.getConfig());
        this.withDaemonEndpoints(instance.getDaemonEndpoints());
        this.withFeatures(instance.getFeatures());
        this.withImages(instance.getImages());
        this.withNodeInfo(instance.getNodeInfo());
        this.withPhase(instance.getPhase());
        this.withRuntimeHandlers(instance.getRuntimeHandlers());
        this.withVolumesAttached(instance.getVolumesAttached());
        this.withVolumesInUse(instance.getVolumesInUse());
    }
  }
  
  public A addToAddresses(int index,V1NodeAddress item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) {
        _visitables.get("addresses").add(builder);
        addresses.add(builder);
    } else {
        _visitables.get("addresses").add(builder);
        addresses.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToAddresses(int index,V1NodeAddress item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) {
        _visitables.get("addresses").add(builder);
        addresses.add(builder);
    } else {
        _visitables.get("addresses").add(builder);
        addresses.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToAddresses(V1NodeAddress... items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (V1NodeAddress item : items) {
        V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
        _visitables.get("addresses").add(builder);
        this.addresses.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToAddresses(Collection<V1NodeAddress> items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (V1NodeAddress item : items) {
        V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
        _visitables.get("addresses").add(builder);
        this.addresses.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromAddresses(V1NodeAddress... items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (V1NodeAddress item : items) {
        V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
        _visitables.get("addresses").remove(builder);
        this.addresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromAddresses(Collection<V1NodeAddress> items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (V1NodeAddress item : items) {
        V1NodeAddressBuilder builder = new V1NodeAddressBuilder(item);
        _visitables.get("addresses").remove(builder);
        this.addresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromAddresses(Predicate<V1NodeAddressBuilder> predicate) {
    if (addresses == null) {
      return (A) this;
    }
    Iterator<V1NodeAddressBuilder> each = addresses.iterator();
    List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
        V1NodeAddressBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1NodeAddress> buildAddresses() {
    return this.addresses != null ? build(addresses) : null;
  }
  
  public V1NodeAddress buildAddress(int index) {
    return this.addresses.get(index).build();
  }
  
  public V1NodeAddress buildFirstAddress() {
    return this.addresses.get(0).build();
  }
  
  public V1NodeAddress buildLastAddress() {
    return this.addresses.get(addresses.size() - 1).build();
  }
  
  public V1NodeAddress buildMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
      for (V1NodeAddressBuilder item : addresses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
      for (V1NodeAddressBuilder item : addresses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAddresses(List<V1NodeAddress> addresses) {
    if (this.addresses != null) {
      this._visitables.get("addresses").clear();
    }
    if (addresses != null) {
        this.addresses = new ArrayList();
        for (V1NodeAddress item : addresses) {
          this.addToAddresses(item);
        }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }
  
  public A withAddresses(V1NodeAddress... addresses) {
    if (this.addresses != null) {
        this.addresses.clear();
        _visitables.remove("addresses");
    }
    if (addresses != null) {
      for (V1NodeAddress item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAddresses() {
    return this.addresses != null && !(this.addresses.isEmpty());
  }
  
  public AddressesNested<A> addNewAddress() {
    return new AddressesNested(-1, null);
  }
  
  public AddressesNested<A> addNewAddressLike(V1NodeAddress item) {
    return new AddressesNested(-1, item);
  }
  
  public AddressesNested<A> setNewAddressLike(int index,V1NodeAddress item) {
    return new AddressesNested(index, item);
  }
  
  public AddressesNested<A> editAddress(int index) {
    if (index <= addresses.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public AddressesNested<A> editFirstAddress() {
    if (addresses.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "addresses"));
    }
    return this.setNewAddressLike(0, this.buildAddress(0));
  }
  
  public AddressesNested<A> editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public AddressesNested<A> editMatchingAddress(Predicate<V1NodeAddressBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < addresses.size();i++) {
      if (predicate.test(addresses.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public A addToAllocatable(String key,Quantity value) {
    if (this.allocatable == null && key != null && value != null) {
      this.allocatable = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.allocatable.put(key, value);
    }
    return (A) this;
  }
  
  public A addToAllocatable(Map<String,Quantity> map) {
    if (this.allocatable == null && map != null) {
      this.allocatable = new LinkedHashMap();
    }
    if (map != null) {
      this.allocatable.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromAllocatable(String key) {
    if (this.allocatable == null) {
      return (A) this;
    }
    if (key != null && this.allocatable != null) {
      this.allocatable.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromAllocatable(Map<String,Quantity> map) {
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
  
  public Map<String,Quantity> getAllocatable() {
    return this.allocatable;
  }
  
  public <K,V>A withAllocatable(Map<String,Quantity> allocatable) {
    if (allocatable == null) {
      this.allocatable = null;
    } else {
      this.allocatable = new LinkedHashMap(allocatable);
    }
    return (A) this;
  }
  
  public boolean hasAllocatable() {
    return this.allocatable != null;
  }
  
  public A addToCapacity(String key,Quantity value) {
    if (this.capacity == null && key != null && value != null) {
      this.capacity = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.capacity.put(key, value);
    }
    return (A) this;
  }
  
  public A addToCapacity(Map<String,Quantity> map) {
    if (this.capacity == null && map != null) {
      this.capacity = new LinkedHashMap();
    }
    if (map != null) {
      this.capacity.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromCapacity(String key) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (key != null && this.capacity != null) {
      this.capacity.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromCapacity(Map<String,Quantity> map) {
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
  
  public Map<String,Quantity> getCapacity() {
    return this.capacity;
  }
  
  public <K,V>A withCapacity(Map<String,Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new LinkedHashMap(capacity);
    }
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public A addToConditions(int index,V1NodeCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToConditions(int index,V1NodeCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToConditions(V1NodeCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1NodeCondition item : items) {
        V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToConditions(Collection<V1NodeCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1NodeCondition item : items) {
        V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1NodeCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1NodeCondition item : items) {
        V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromConditions(Collection<V1NodeCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1NodeCondition item : items) {
        V1NodeConditionBuilder builder = new V1NodeConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1NodeConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1NodeConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1NodeConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1NodeCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1NodeCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1NodeCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1NodeCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1NodeCondition buildMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
      for (V1NodeConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
      for (V1NodeConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1NodeCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1NodeCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1NodeCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1NodeCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1NodeCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1NodeCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (index <= conditions.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1NodeConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public V1NodeConfigStatus buildConfig() {
    return this.config != null ? this.config.build() : null;
  }
  
  public A withConfig(V1NodeConfigStatus config) {
    this._visitables.remove("config");
    if (config != null) {
        this.config = new V1NodeConfigStatusBuilder(config);
        this._visitables.get("config").add(this.config);
    } else {
        this.config = null;
        this._visitables.get("config").remove(this.config);
    }
    return (A) this;
  }
  
  public boolean hasConfig() {
    return this.config != null;
  }
  
  public ConfigNested<A> withNewConfig() {
    return new ConfigNested(null);
  }
  
  public ConfigNested<A> withNewConfigLike(V1NodeConfigStatus item) {
    return new ConfigNested(item);
  }
  
  public ConfigNested<A> editConfig() {
    return this.withNewConfigLike(Optional.ofNullable(this.buildConfig()).orElse(null));
  }
  
  public ConfigNested<A> editOrNewConfig() {
    return this.withNewConfigLike(Optional.ofNullable(this.buildConfig()).orElse(new V1NodeConfigStatusBuilder().build()));
  }
  
  public ConfigNested<A> editOrNewConfigLike(V1NodeConfigStatus item) {
    return this.withNewConfigLike(Optional.ofNullable(this.buildConfig()).orElse(item));
  }
  
  public V1NodeDaemonEndpoints buildDaemonEndpoints() {
    return this.daemonEndpoints != null ? this.daemonEndpoints.build() : null;
  }
  
  public A withDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
    this._visitables.remove("daemonEndpoints");
    if (daemonEndpoints != null) {
        this.daemonEndpoints = new V1NodeDaemonEndpointsBuilder(daemonEndpoints);
        this._visitables.get("daemonEndpoints").add(this.daemonEndpoints);
    } else {
        this.daemonEndpoints = null;
        this._visitables.get("daemonEndpoints").remove(this.daemonEndpoints);
    }
    return (A) this;
  }
  
  public boolean hasDaemonEndpoints() {
    return this.daemonEndpoints != null;
  }
  
  public DaemonEndpointsNested<A> withNewDaemonEndpoints() {
    return new DaemonEndpointsNested(null);
  }
  
  public DaemonEndpointsNested<A> withNewDaemonEndpointsLike(V1NodeDaemonEndpoints item) {
    return new DaemonEndpointsNested(item);
  }
  
  public DaemonEndpointsNested<A> editDaemonEndpoints() {
    return this.withNewDaemonEndpointsLike(Optional.ofNullable(this.buildDaemonEndpoints()).orElse(null));
  }
  
  public DaemonEndpointsNested<A> editOrNewDaemonEndpoints() {
    return this.withNewDaemonEndpointsLike(Optional.ofNullable(this.buildDaemonEndpoints()).orElse(new V1NodeDaemonEndpointsBuilder().build()));
  }
  
  public DaemonEndpointsNested<A> editOrNewDaemonEndpointsLike(V1NodeDaemonEndpoints item) {
    return this.withNewDaemonEndpointsLike(Optional.ofNullable(this.buildDaemonEndpoints()).orElse(item));
  }
  
  public V1NodeFeatures buildFeatures() {
    return this.features != null ? this.features.build() : null;
  }
  
  public A withFeatures(V1NodeFeatures features) {
    this._visitables.remove("features");
    if (features != null) {
        this.features = new V1NodeFeaturesBuilder(features);
        this._visitables.get("features").add(this.features);
    } else {
        this.features = null;
        this._visitables.get("features").remove(this.features);
    }
    return (A) this;
  }
  
  public boolean hasFeatures() {
    return this.features != null;
  }
  
  public FeaturesNested<A> withNewFeatures() {
    return new FeaturesNested(null);
  }
  
  public FeaturesNested<A> withNewFeaturesLike(V1NodeFeatures item) {
    return new FeaturesNested(item);
  }
  
  public FeaturesNested<A> editFeatures() {
    return this.withNewFeaturesLike(Optional.ofNullable(this.buildFeatures()).orElse(null));
  }
  
  public FeaturesNested<A> editOrNewFeatures() {
    return this.withNewFeaturesLike(Optional.ofNullable(this.buildFeatures()).orElse(new V1NodeFeaturesBuilder().build()));
  }
  
  public FeaturesNested<A> editOrNewFeaturesLike(V1NodeFeatures item) {
    return this.withNewFeaturesLike(Optional.ofNullable(this.buildFeatures()).orElse(item));
  }
  
  public A addToImages(int index,V1ContainerImage item) {
    if (this.images == null) {
      this.images = new ArrayList();
    }
    V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
    if (index < 0 || index >= images.size()) {
        _visitables.get("images").add(builder);
        images.add(builder);
    } else {
        _visitables.get("images").add(builder);
        images.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToImages(int index,V1ContainerImage item) {
    if (this.images == null) {
      this.images = new ArrayList();
    }
    V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
    if (index < 0 || index >= images.size()) {
        _visitables.get("images").add(builder);
        images.add(builder);
    } else {
        _visitables.get("images").add(builder);
        images.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToImages(V1ContainerImage... items) {
    if (this.images == null) {
      this.images = new ArrayList();
    }
    for (V1ContainerImage item : items) {
        V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
        _visitables.get("images").add(builder);
        this.images.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToImages(Collection<V1ContainerImage> items) {
    if (this.images == null) {
      this.images = new ArrayList();
    }
    for (V1ContainerImage item : items) {
        V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
        _visitables.get("images").add(builder);
        this.images.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromImages(V1ContainerImage... items) {
    if (this.images == null) {
      return (A) this;
    }
    for (V1ContainerImage item : items) {
        V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
        _visitables.get("images").remove(builder);
        this.images.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromImages(Collection<V1ContainerImage> items) {
    if (this.images == null) {
      return (A) this;
    }
    for (V1ContainerImage item : items) {
        V1ContainerImageBuilder builder = new V1ContainerImageBuilder(item);
        _visitables.get("images").remove(builder);
        this.images.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromImages(Predicate<V1ContainerImageBuilder> predicate) {
    if (images == null) {
      return (A) this;
    }
    Iterator<V1ContainerImageBuilder> each = images.iterator();
    List visitables = _visitables.get("images");
    while (each.hasNext()) {
        V1ContainerImageBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ContainerImage> buildImages() {
    return this.images != null ? build(images) : null;
  }
  
  public V1ContainerImage buildImage(int index) {
    return this.images.get(index).build();
  }
  
  public V1ContainerImage buildFirstImage() {
    return this.images.get(0).build();
  }
  
  public V1ContainerImage buildLastImage() {
    return this.images.get(images.size() - 1).build();
  }
  
  public V1ContainerImage buildMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
      for (V1ContainerImageBuilder item : images) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
      for (V1ContainerImageBuilder item : images) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withImages(List<V1ContainerImage> images) {
    if (this.images != null) {
      this._visitables.get("images").clear();
    }
    if (images != null) {
        this.images = new ArrayList();
        for (V1ContainerImage item : images) {
          this.addToImages(item);
        }
    } else {
      this.images = null;
    }
    return (A) this;
  }
  
  public A withImages(V1ContainerImage... images) {
    if (this.images != null) {
        this.images.clear();
        _visitables.remove("images");
    }
    if (images != null) {
      for (V1ContainerImage item : images) {
        this.addToImages(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasImages() {
    return this.images != null && !(this.images.isEmpty());
  }
  
  public ImagesNested<A> addNewImage() {
    return new ImagesNested(-1, null);
  }
  
  public ImagesNested<A> addNewImageLike(V1ContainerImage item) {
    return new ImagesNested(-1, item);
  }
  
  public ImagesNested<A> setNewImageLike(int index,V1ContainerImage item) {
    return new ImagesNested(index, item);
  }
  
  public ImagesNested<A> editImage(int index) {
    if (index <= images.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "images"));
    }
    return this.setNewImageLike(index, this.buildImage(index));
  }
  
  public ImagesNested<A> editFirstImage() {
    if (images.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "images"));
    }
    return this.setNewImageLike(0, this.buildImage(0));
  }
  
  public ImagesNested<A> editLastImage() {
    int index = images.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "images"));
    }
    return this.setNewImageLike(index, this.buildImage(index));
  }
  
  public ImagesNested<A> editMatchingImage(Predicate<V1ContainerImageBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < images.size();i++) {
      if (predicate.test(images.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "images"));
    }
    return this.setNewImageLike(index, this.buildImage(index));
  }
  
  public V1NodeSystemInfo buildNodeInfo() {
    return this.nodeInfo != null ? this.nodeInfo.build() : null;
  }
  
  public A withNodeInfo(V1NodeSystemInfo nodeInfo) {
    this._visitables.remove("nodeInfo");
    if (nodeInfo != null) {
        this.nodeInfo = new V1NodeSystemInfoBuilder(nodeInfo);
        this._visitables.get("nodeInfo").add(this.nodeInfo);
    } else {
        this.nodeInfo = null;
        this._visitables.get("nodeInfo").remove(this.nodeInfo);
    }
    return (A) this;
  }
  
  public boolean hasNodeInfo() {
    return this.nodeInfo != null;
  }
  
  public NodeInfoNested<A> withNewNodeInfo() {
    return new NodeInfoNested(null);
  }
  
  public NodeInfoNested<A> withNewNodeInfoLike(V1NodeSystemInfo item) {
    return new NodeInfoNested(item);
  }
  
  public NodeInfoNested<A> editNodeInfo() {
    return this.withNewNodeInfoLike(Optional.ofNullable(this.buildNodeInfo()).orElse(null));
  }
  
  public NodeInfoNested<A> editOrNewNodeInfo() {
    return this.withNewNodeInfoLike(Optional.ofNullable(this.buildNodeInfo()).orElse(new V1NodeSystemInfoBuilder().build()));
  }
  
  public NodeInfoNested<A> editOrNewNodeInfoLike(V1NodeSystemInfo item) {
    return this.withNewNodeInfoLike(Optional.ofNullable(this.buildNodeInfo()).orElse(item));
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public A addToRuntimeHandlers(int index,V1NodeRuntimeHandler item) {
    if (this.runtimeHandlers == null) {
      this.runtimeHandlers = new ArrayList();
    }
    V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
    if (index < 0 || index >= runtimeHandlers.size()) {
        _visitables.get("runtimeHandlers").add(builder);
        runtimeHandlers.add(builder);
    } else {
        _visitables.get("runtimeHandlers").add(builder);
        runtimeHandlers.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToRuntimeHandlers(int index,V1NodeRuntimeHandler item) {
    if (this.runtimeHandlers == null) {
      this.runtimeHandlers = new ArrayList();
    }
    V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
    if (index < 0 || index >= runtimeHandlers.size()) {
        _visitables.get("runtimeHandlers").add(builder);
        runtimeHandlers.add(builder);
    } else {
        _visitables.get("runtimeHandlers").add(builder);
        runtimeHandlers.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToRuntimeHandlers(V1NodeRuntimeHandler... items) {
    if (this.runtimeHandlers == null) {
      this.runtimeHandlers = new ArrayList();
    }
    for (V1NodeRuntimeHandler item : items) {
        V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
        _visitables.get("runtimeHandlers").add(builder);
        this.runtimeHandlers.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRuntimeHandlers(Collection<V1NodeRuntimeHandler> items) {
    if (this.runtimeHandlers == null) {
      this.runtimeHandlers = new ArrayList();
    }
    for (V1NodeRuntimeHandler item : items) {
        V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
        _visitables.get("runtimeHandlers").add(builder);
        this.runtimeHandlers.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromRuntimeHandlers(V1NodeRuntimeHandler... items) {
    if (this.runtimeHandlers == null) {
      return (A) this;
    }
    for (V1NodeRuntimeHandler item : items) {
        V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
        _visitables.get("runtimeHandlers").remove(builder);
        this.runtimeHandlers.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRuntimeHandlers(Collection<V1NodeRuntimeHandler> items) {
    if (this.runtimeHandlers == null) {
      return (A) this;
    }
    for (V1NodeRuntimeHandler item : items) {
        V1NodeRuntimeHandlerBuilder builder = new V1NodeRuntimeHandlerBuilder(item);
        _visitables.get("runtimeHandlers").remove(builder);
        this.runtimeHandlers.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRuntimeHandlers(Predicate<V1NodeRuntimeHandlerBuilder> predicate) {
    if (runtimeHandlers == null) {
      return (A) this;
    }
    Iterator<V1NodeRuntimeHandlerBuilder> each = runtimeHandlers.iterator();
    List visitables = _visitables.get("runtimeHandlers");
    while (each.hasNext()) {
        V1NodeRuntimeHandlerBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1NodeRuntimeHandler> buildRuntimeHandlers() {
    return this.runtimeHandlers != null ? build(runtimeHandlers) : null;
  }
  
  public V1NodeRuntimeHandler buildRuntimeHandler(int index) {
    return this.runtimeHandlers.get(index).build();
  }
  
  public V1NodeRuntimeHandler buildFirstRuntimeHandler() {
    return this.runtimeHandlers.get(0).build();
  }
  
  public V1NodeRuntimeHandler buildLastRuntimeHandler() {
    return this.runtimeHandlers.get(runtimeHandlers.size() - 1).build();
  }
  
  public V1NodeRuntimeHandler buildMatchingRuntimeHandler(Predicate<V1NodeRuntimeHandlerBuilder> predicate) {
      for (V1NodeRuntimeHandlerBuilder item : runtimeHandlers) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRuntimeHandler(Predicate<V1NodeRuntimeHandlerBuilder> predicate) {
      for (V1NodeRuntimeHandlerBuilder item : runtimeHandlers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRuntimeHandlers(List<V1NodeRuntimeHandler> runtimeHandlers) {
    if (this.runtimeHandlers != null) {
      this._visitables.get("runtimeHandlers").clear();
    }
    if (runtimeHandlers != null) {
        this.runtimeHandlers = new ArrayList();
        for (V1NodeRuntimeHandler item : runtimeHandlers) {
          this.addToRuntimeHandlers(item);
        }
    } else {
      this.runtimeHandlers = null;
    }
    return (A) this;
  }
  
  public A withRuntimeHandlers(V1NodeRuntimeHandler... runtimeHandlers) {
    if (this.runtimeHandlers != null) {
        this.runtimeHandlers.clear();
        _visitables.remove("runtimeHandlers");
    }
    if (runtimeHandlers != null) {
      for (V1NodeRuntimeHandler item : runtimeHandlers) {
        this.addToRuntimeHandlers(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRuntimeHandlers() {
    return this.runtimeHandlers != null && !(this.runtimeHandlers.isEmpty());
  }
  
  public RuntimeHandlersNested<A> addNewRuntimeHandler() {
    return new RuntimeHandlersNested(-1, null);
  }
  
  public RuntimeHandlersNested<A> addNewRuntimeHandlerLike(V1NodeRuntimeHandler item) {
    return new RuntimeHandlersNested(-1, item);
  }
  
  public RuntimeHandlersNested<A> setNewRuntimeHandlerLike(int index,V1NodeRuntimeHandler item) {
    return new RuntimeHandlersNested(index, item);
  }
  
  public RuntimeHandlersNested<A> editRuntimeHandler(int index) {
    if (index <= runtimeHandlers.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "runtimeHandlers"));
    }
    return this.setNewRuntimeHandlerLike(index, this.buildRuntimeHandler(index));
  }
  
  public RuntimeHandlersNested<A> editFirstRuntimeHandler() {
    if (runtimeHandlers.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "runtimeHandlers"));
    }
    return this.setNewRuntimeHandlerLike(0, this.buildRuntimeHandler(0));
  }
  
  public RuntimeHandlersNested<A> editLastRuntimeHandler() {
    int index = runtimeHandlers.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "runtimeHandlers"));
    }
    return this.setNewRuntimeHandlerLike(index, this.buildRuntimeHandler(index));
  }
  
  public RuntimeHandlersNested<A> editMatchingRuntimeHandler(Predicate<V1NodeRuntimeHandlerBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < runtimeHandlers.size();i++) {
      if (predicate.test(runtimeHandlers.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "runtimeHandlers"));
    }
    return this.setNewRuntimeHandlerLike(index, this.buildRuntimeHandler(index));
  }
  
  public A addToVolumesAttached(int index,V1AttachedVolume item) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList();
    }
    V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
    if (index < 0 || index >= volumesAttached.size()) {
        _visitables.get("volumesAttached").add(builder);
        volumesAttached.add(builder);
    } else {
        _visitables.get("volumesAttached").add(builder);
        volumesAttached.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToVolumesAttached(int index,V1AttachedVolume item) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList();
    }
    V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
    if (index < 0 || index >= volumesAttached.size()) {
        _visitables.get("volumesAttached").add(builder);
        volumesAttached.add(builder);
    } else {
        _visitables.get("volumesAttached").add(builder);
        volumesAttached.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToVolumesAttached(V1AttachedVolume... items) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList();
    }
    for (V1AttachedVolume item : items) {
        V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
        _visitables.get("volumesAttached").add(builder);
        this.volumesAttached.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToVolumesAttached(Collection<V1AttachedVolume> items) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList();
    }
    for (V1AttachedVolume item : items) {
        V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
        _visitables.get("volumesAttached").add(builder);
        this.volumesAttached.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromVolumesAttached(V1AttachedVolume... items) {
    if (this.volumesAttached == null) {
      return (A) this;
    }
    for (V1AttachedVolume item : items) {
        V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
        _visitables.get("volumesAttached").remove(builder);
        this.volumesAttached.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromVolumesAttached(Collection<V1AttachedVolume> items) {
    if (this.volumesAttached == null) {
      return (A) this;
    }
    for (V1AttachedVolume item : items) {
        V1AttachedVolumeBuilder builder = new V1AttachedVolumeBuilder(item);
        _visitables.get("volumesAttached").remove(builder);
        this.volumesAttached.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    if (volumesAttached == null) {
      return (A) this;
    }
    Iterator<V1AttachedVolumeBuilder> each = volumesAttached.iterator();
    List visitables = _visitables.get("volumesAttached");
    while (each.hasNext()) {
        V1AttachedVolumeBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1AttachedVolume> buildVolumesAttached() {
    return this.volumesAttached != null ? build(volumesAttached) : null;
  }
  
  public V1AttachedVolume buildVolumesAttached(int index) {
    return this.volumesAttached.get(index).build();
  }
  
  public V1AttachedVolume buildFirstVolumesAttached() {
    return this.volumesAttached.get(0).build();
  }
  
  public V1AttachedVolume buildLastVolumesAttached() {
    return this.volumesAttached.get(volumesAttached.size() - 1).build();
  }
  
  public V1AttachedVolume buildMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
      for (V1AttachedVolumeBuilder item : volumesAttached) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
      for (V1AttachedVolumeBuilder item : volumesAttached) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumesAttached(List<V1AttachedVolume> volumesAttached) {
    if (this.volumesAttached != null) {
      this._visitables.get("volumesAttached").clear();
    }
    if (volumesAttached != null) {
        this.volumesAttached = new ArrayList();
        for (V1AttachedVolume item : volumesAttached) {
          this.addToVolumesAttached(item);
        }
    } else {
      this.volumesAttached = null;
    }
    return (A) this;
  }
  
  public A withVolumesAttached(V1AttachedVolume... volumesAttached) {
    if (this.volumesAttached != null) {
        this.volumesAttached.clear();
        _visitables.remove("volumesAttached");
    }
    if (volumesAttached != null) {
      for (V1AttachedVolume item : volumesAttached) {
        this.addToVolumesAttached(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumesAttached() {
    return this.volumesAttached != null && !(this.volumesAttached.isEmpty());
  }
  
  public VolumesAttachedNested<A> addNewVolumesAttached() {
    return new VolumesAttachedNested(-1, null);
  }
  
  public VolumesAttachedNested<A> addNewVolumesAttachedLike(V1AttachedVolume item) {
    return new VolumesAttachedNested(-1, item);
  }
  
  public VolumesAttachedNested<A> setNewVolumesAttachedLike(int index,V1AttachedVolume item) {
    return new VolumesAttachedNested(index, item);
  }
  
  public VolumesAttachedNested<A> editVolumesAttached(int index) {
    if (index <= volumesAttached.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "volumesAttached"));
    }
    return this.setNewVolumesAttachedLike(index, this.buildVolumesAttached(index));
  }
  
  public VolumesAttachedNested<A> editFirstVolumesAttached() {
    if (volumesAttached.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "volumesAttached"));
    }
    return this.setNewVolumesAttachedLike(0, this.buildVolumesAttached(0));
  }
  
  public VolumesAttachedNested<A> editLastVolumesAttached() {
    int index = volumesAttached.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "volumesAttached"));
    }
    return this.setNewVolumesAttachedLike(index, this.buildVolumesAttached(index));
  }
  
  public VolumesAttachedNested<A> editMatchingVolumesAttached(Predicate<V1AttachedVolumeBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < volumesAttached.size();i++) {
      if (predicate.test(volumesAttached.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "volumesAttached"));
    }
    return this.setNewVolumesAttachedLike(index, this.buildVolumesAttached(index));
  }
  
  public A addToVolumesInUse(int index,String item) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList();
    }
    this.volumesInUse.add(index, item);
    return (A) this;
  }
  
  public A setToVolumesInUse(int index,String item) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList();
    }
    this.volumesInUse.set(index, item);
    return (A) this;
  }
  
  public A addToVolumesInUse(String... items) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList();
    }
    for (String item : items) {
      this.volumesInUse.add(item);
    }
    return (A) this;
  }
  
  public A addAllToVolumesInUse(Collection<String> items) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList();
    }
    for (String item : items) {
      this.volumesInUse.add(item);
    }
    return (A) this;
  }
  
  public A removeFromVolumesInUse(String... items) {
    if (this.volumesInUse == null) {
      return (A) this;
    }
    for (String item : items) {
      this.volumesInUse.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromVolumesInUse(Collection<String> items) {
    if (this.volumesInUse == null) {
      return (A) this;
    }
    for (String item : items) {
      this.volumesInUse.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getVolumesInUse() {
    return this.volumesInUse;
  }
  
  public String getVolumesInUse(int index) {
    return this.volumesInUse.get(index);
  }
  
  public String getFirstVolumesInUse() {
    return this.volumesInUse.get(0);
  }
  
  public String getLastVolumesInUse() {
    return this.volumesInUse.get(volumesInUse.size() - 1);
  }
  
  public String getMatchingVolumesInUse(Predicate<String> predicate) {
      for (String item : volumesInUse) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingVolumesInUse(Predicate<String> predicate) {
      for (String item : volumesInUse) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withVolumesInUse(List<String> volumesInUse) {
    if (volumesInUse != null) {
        this.volumesInUse = new ArrayList();
        for (String item : volumesInUse) {
          this.addToVolumesInUse(item);
        }
    } else {
      this.volumesInUse = null;
    }
    return (A) this;
  }
  
  public A withVolumesInUse(String... volumesInUse) {
    if (this.volumesInUse != null) {
        this.volumesInUse.clear();
        _visitables.remove("volumesInUse");
    }
    if (volumesInUse != null) {
      for (String item : volumesInUse) {
        this.addToVolumesInUse(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasVolumesInUse() {
    return this.volumesInUse != null && !(this.volumesInUse.isEmpty());
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1NodeStatusFluent that = (V1NodeStatusFluent) o;
    if (!(Objects.equals(addresses, that.addresses))) {
      return false;
    }
    if (!(Objects.equals(allocatable, that.allocatable))) {
      return false;
    }
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(config, that.config))) {
      return false;
    }
    if (!(Objects.equals(daemonEndpoints, that.daemonEndpoints))) {
      return false;
    }
    if (!(Objects.equals(features, that.features))) {
      return false;
    }
    if (!(Objects.equals(images, that.images))) {
      return false;
    }
    if (!(Objects.equals(nodeInfo, that.nodeInfo))) {
      return false;
    }
    if (!(Objects.equals(phase, that.phase))) {
      return false;
    }
    if (!(Objects.equals(runtimeHandlers, that.runtimeHandlers))) {
      return false;
    }
    if (!(Objects.equals(volumesAttached, that.volumesAttached))) {
      return false;
    }
    if (!(Objects.equals(volumesInUse, that.volumesInUse))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(addresses, allocatable, capacity, conditions, config, daemonEndpoints, features, images, nodeInfo, phase, runtimeHandlers, volumesAttached, volumesInUse);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(addresses == null) && !(addresses.isEmpty())) {
        sb.append("addresses:");
        sb.append(addresses);
        sb.append(",");
    }
    if (!(allocatable == null) && !(allocatable.isEmpty())) {
        sb.append("allocatable:");
        sb.append(allocatable);
        sb.append(",");
    }
    if (!(capacity == null) && !(capacity.isEmpty())) {
        sb.append("capacity:");
        sb.append(capacity);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(config == null)) {
        sb.append("config:");
        sb.append(config);
        sb.append(",");
    }
    if (!(daemonEndpoints == null)) {
        sb.append("daemonEndpoints:");
        sb.append(daemonEndpoints);
        sb.append(",");
    }
    if (!(features == null)) {
        sb.append("features:");
        sb.append(features);
        sb.append(",");
    }
    if (!(images == null) && !(images.isEmpty())) {
        sb.append("images:");
        sb.append(images);
        sb.append(",");
    }
    if (!(nodeInfo == null)) {
        sb.append("nodeInfo:");
        sb.append(nodeInfo);
        sb.append(",");
    }
    if (!(phase == null)) {
        sb.append("phase:");
        sb.append(phase);
        sb.append(",");
    }
    if (!(runtimeHandlers == null) && !(runtimeHandlers.isEmpty())) {
        sb.append("runtimeHandlers:");
        sb.append(runtimeHandlers);
        sb.append(",");
    }
    if (!(volumesAttached == null) && !(volumesAttached.isEmpty())) {
        sb.append("volumesAttached:");
        sb.append(volumesAttached);
        sb.append(",");
    }
    if (!(volumesInUse == null) && !(volumesInUse.isEmpty())) {
        sb.append("volumesInUse:");
        sb.append(volumesInUse);
    }
    sb.append("}");
    return sb.toString();
  }
  public class AddressesNested<N> extends V1NodeAddressFluent<AddressesNested<N>> implements Nested<N>{
    AddressesNested(int index,V1NodeAddress item) {
      this.index = index;
      this.builder = new V1NodeAddressBuilder(this, item);
    }
    V1NodeAddressBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.setToAddresses(index, builder.build());
    }
    
    public N endAddress() {
      return and();
    }
    
  
  }
  public class ConditionsNested<N> extends V1NodeConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1NodeCondition item) {
      this.index = index;
      this.builder = new V1NodeConditionBuilder(this, item);
    }
    V1NodeConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class ConfigNested<N> extends V1NodeConfigStatusFluent<ConfigNested<N>> implements Nested<N>{
    ConfigNested(V1NodeConfigStatus item) {
      this.builder = new V1NodeConfigStatusBuilder(this, item);
    }
    V1NodeConfigStatusBuilder builder;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.withConfig(builder.build());
    }
    
    public N endConfig() {
      return and();
    }
    
  
  }
  public class DaemonEndpointsNested<N> extends V1NodeDaemonEndpointsFluent<DaemonEndpointsNested<N>> implements Nested<N>{
    DaemonEndpointsNested(V1NodeDaemonEndpoints item) {
      this.builder = new V1NodeDaemonEndpointsBuilder(this, item);
    }
    V1NodeDaemonEndpointsBuilder builder;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.withDaemonEndpoints(builder.build());
    }
    
    public N endDaemonEndpoints() {
      return and();
    }
    
  
  }
  public class FeaturesNested<N> extends V1NodeFeaturesFluent<FeaturesNested<N>> implements Nested<N>{
    FeaturesNested(V1NodeFeatures item) {
      this.builder = new V1NodeFeaturesBuilder(this, item);
    }
    V1NodeFeaturesBuilder builder;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.withFeatures(builder.build());
    }
    
    public N endFeatures() {
      return and();
    }
    
  
  }
  public class ImagesNested<N> extends V1ContainerImageFluent<ImagesNested<N>> implements Nested<N>{
    ImagesNested(int index,V1ContainerImage item) {
      this.index = index;
      this.builder = new V1ContainerImageBuilder(this, item);
    }
    V1ContainerImageBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.setToImages(index, builder.build());
    }
    
    public N endImage() {
      return and();
    }
    
  
  }
  public class NodeInfoNested<N> extends V1NodeSystemInfoFluent<NodeInfoNested<N>> implements Nested<N>{
    NodeInfoNested(V1NodeSystemInfo item) {
      this.builder = new V1NodeSystemInfoBuilder(this, item);
    }
    V1NodeSystemInfoBuilder builder;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.withNodeInfo(builder.build());
    }
    
    public N endNodeInfo() {
      return and();
    }
    
  
  }
  public class RuntimeHandlersNested<N> extends V1NodeRuntimeHandlerFluent<RuntimeHandlersNested<N>> implements Nested<N>{
    RuntimeHandlersNested(int index,V1NodeRuntimeHandler item) {
      this.index = index;
      this.builder = new V1NodeRuntimeHandlerBuilder(this, item);
    }
    V1NodeRuntimeHandlerBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.setToRuntimeHandlers(index, builder.build());
    }
    
    public N endRuntimeHandler() {
      return and();
    }
    
  
  }
  public class VolumesAttachedNested<N> extends V1AttachedVolumeFluent<VolumesAttachedNested<N>> implements Nested<N>{
    VolumesAttachedNested(int index,V1AttachedVolume item) {
      this.index = index;
      this.builder = new V1AttachedVolumeBuilder(this, item);
    }
    V1AttachedVolumeBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeStatusFluent.this.setToVolumesAttached(index, builder.build());
    }
    
    public N endVolumesAttached() {
      return and();
    }
    
  
  }

}