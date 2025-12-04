package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceSliceSpecFluent<A extends io.kubernetes.client.openapi.models.V1ResourceSliceSpecFluent<A>> extends BaseFluent<A>{

  private Boolean allNodes;
  private ArrayList<V1DeviceBuilder> devices;
  private String driver;
  private String nodeName;
  private V1NodeSelectorBuilder nodeSelector;
  private Boolean perDeviceNodeSelection;
  private V1ResourcePoolBuilder pool;
  private ArrayList<V1CounterSetBuilder> sharedCounters;

  public V1ResourceSliceSpecFluent() {
  }
  
  public V1ResourceSliceSpecFluent(V1ResourceSliceSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToDevices(Collection<V1Device> items) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    for (V1Device item : items) {
        V1DeviceBuilder builder = new V1DeviceBuilder(item);
        _visitables.get("devices").add(builder);
        this.devices.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToSharedCounters(Collection<V1CounterSet> items) {
    if (this.sharedCounters == null) {
      this.sharedCounters = new ArrayList();
    }
    for (V1CounterSet item : items) {
        V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
        _visitables.get("sharedCounters").add(builder);
        this.sharedCounters.add(builder);
    }
    return (A) this;
  }
  
  public DevicesNested<A> addNewDevice() {
    return new DevicesNested(-1, null);
  }
  
  public DevicesNested<A> addNewDeviceLike(V1Device item) {
    return new DevicesNested(-1, item);
  }
  
  public SharedCountersNested<A> addNewSharedCounter() {
    return new SharedCountersNested(-1, null);
  }
  
  public SharedCountersNested<A> addNewSharedCounterLike(V1CounterSet item) {
    return new SharedCountersNested(-1, item);
  }
  
  public A addToDevices(V1Device... items) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    for (V1Device item : items) {
        V1DeviceBuilder builder = new V1DeviceBuilder(item);
        _visitables.get("devices").add(builder);
        this.devices.add(builder);
    }
    return (A) this;
  }
  
  public A addToDevices(int index,V1Device item) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    V1DeviceBuilder builder = new V1DeviceBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToSharedCounters(V1CounterSet... items) {
    if (this.sharedCounters == null) {
      this.sharedCounters = new ArrayList();
    }
    for (V1CounterSet item : items) {
        V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
        _visitables.get("sharedCounters").add(builder);
        this.sharedCounters.add(builder);
    }
    return (A) this;
  }
  
  public A addToSharedCounters(int index,V1CounterSet item) {
    if (this.sharedCounters == null) {
      this.sharedCounters = new ArrayList();
    }
    V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
    if (index < 0 || index >= sharedCounters.size()) {
        _visitables.get("sharedCounters").add(builder);
        sharedCounters.add(builder);
    } else {
        _visitables.get("sharedCounters").add(builder);
        sharedCounters.add(index, builder);
    }
    return (A) this;
  }
  
  public V1Device buildDevice(int index) {
    return this.devices.get(index).build();
  }
  
  public List<V1Device> buildDevices() {
    return this.devices != null ? build(devices) : null;
  }
  
  public V1Device buildFirstDevice() {
    return this.devices.get(0).build();
  }
  
  public V1CounterSet buildFirstSharedCounter() {
    return this.sharedCounters.get(0).build();
  }
  
  public V1Device buildLastDevice() {
    return this.devices.get(devices.size() - 1).build();
  }
  
  public V1CounterSet buildLastSharedCounter() {
    return this.sharedCounters.get(sharedCounters.size() - 1).build();
  }
  
  public V1Device buildMatchingDevice(Predicate<V1DeviceBuilder> predicate) {
      for (V1DeviceBuilder item : devices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1CounterSet buildMatchingSharedCounter(Predicate<V1CounterSetBuilder> predicate) {
      for (V1CounterSetBuilder item : sharedCounters) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector != null ? this.nodeSelector.build() : null;
  }
  
  public V1ResourcePool buildPool() {
    return this.pool != null ? this.pool.build() : null;
  }
  
  public V1CounterSet buildSharedCounter(int index) {
    return this.sharedCounters.get(index).build();
  }
  
  public List<V1CounterSet> buildSharedCounters() {
    return this.sharedCounters != null ? build(sharedCounters) : null;
  }
  
  protected void copyInstance(V1ResourceSliceSpec instance) {
    instance = instance != null ? instance : new V1ResourceSliceSpec();
    if (instance != null) {
        this.withAllNodes(instance.getAllNodes());
        this.withDevices(instance.getDevices());
        this.withDriver(instance.getDriver());
        this.withNodeName(instance.getNodeName());
        this.withNodeSelector(instance.getNodeSelector());
        this.withPerDeviceNodeSelection(instance.getPerDeviceNodeSelection());
        this.withPool(instance.getPool());
        this.withSharedCounters(instance.getSharedCounters());
    }
  }
  
  public DevicesNested<A> editDevice(int index) {
    if (devices.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public DevicesNested<A> editFirstDevice() {
    if (devices.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "devices"));
    }
    return this.setNewDeviceLike(0, this.buildDevice(0));
  }
  
  public SharedCountersNested<A> editFirstSharedCounter() {
    if (sharedCounters.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "sharedCounters"));
    }
    return this.setNewSharedCounterLike(0, this.buildSharedCounter(0));
  }
  
  public DevicesNested<A> editLastDevice() {
    int index = devices.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public SharedCountersNested<A> editLastSharedCounter() {
    int index = sharedCounters.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "sharedCounters"));
    }
    return this.setNewSharedCounterLike(index, this.buildSharedCounter(index));
  }
  
  public DevicesNested<A> editMatchingDevice(Predicate<V1DeviceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < devices.size();i++) {
      if (predicate.test(devices.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public SharedCountersNested<A> editMatchingSharedCounter(Predicate<V1CounterSetBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < sharedCounters.size();i++) {
      if (predicate.test(sharedCounters.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "sharedCounters"));
    }
    return this.setNewSharedCounterLike(index, this.buildSharedCounter(index));
  }
  
  public NodeSelectorNested<A> editNodeSelector() {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(null));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelector() {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(item));
  }
  
  public PoolNested<A> editOrNewPool() {
    return this.withNewPoolLike(Optional.ofNullable(this.buildPool()).orElse(new V1ResourcePoolBuilder().build()));
  }
  
  public PoolNested<A> editOrNewPoolLike(V1ResourcePool item) {
    return this.withNewPoolLike(Optional.ofNullable(this.buildPool()).orElse(item));
  }
  
  public PoolNested<A> editPool() {
    return this.withNewPoolLike(Optional.ofNullable(this.buildPool()).orElse(null));
  }
  
  public SharedCountersNested<A> editSharedCounter(int index) {
    if (sharedCounters.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "sharedCounters"));
    }
    return this.setNewSharedCounterLike(index, this.buildSharedCounter(index));
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
    V1ResourceSliceSpecFluent that = (V1ResourceSliceSpecFluent) o;
    if (!(Objects.equals(allNodes, that.allNodes))) {
      return false;
    }
    if (!(Objects.equals(devices, that.devices))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(nodeSelector, that.nodeSelector))) {
      return false;
    }
    if (!(Objects.equals(perDeviceNodeSelection, that.perDeviceNodeSelection))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    if (!(Objects.equals(sharedCounters, that.sharedCounters))) {
      return false;
    }
    return true;
  }
  
  public Boolean getAllNodes() {
    return this.allNodes;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public Boolean getPerDeviceNodeSelection() {
    return this.perDeviceNodeSelection;
  }
  
  public boolean hasAllNodes() {
    return this.allNodes != null;
  }
  
  public boolean hasDevices() {
    return this.devices != null && !(this.devices.isEmpty());
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasMatchingDevice(Predicate<V1DeviceBuilder> predicate) {
      for (V1DeviceBuilder item : devices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingSharedCounter(Predicate<V1CounterSetBuilder> predicate) {
      for (V1CounterSetBuilder item : sharedCounters) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public boolean hasPerDeviceNodeSelection() {
    return this.perDeviceNodeSelection != null;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public boolean hasSharedCounters() {
    return this.sharedCounters != null && !(this.sharedCounters.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(allNodes, devices, driver, nodeName, nodeSelector, perDeviceNodeSelection, pool, sharedCounters);
  }
  
  public A removeAllFromDevices(Collection<V1Device> items) {
    if (this.devices == null) {
      return (A) this;
    }
    for (V1Device item : items) {
        V1DeviceBuilder builder = new V1DeviceBuilder(item);
        _visitables.get("devices").remove(builder);
        this.devices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromSharedCounters(Collection<V1CounterSet> items) {
    if (this.sharedCounters == null) {
      return (A) this;
    }
    for (V1CounterSet item : items) {
        V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
        _visitables.get("sharedCounters").remove(builder);
        this.sharedCounters.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromDevices(V1Device... items) {
    if (this.devices == null) {
      return (A) this;
    }
    for (V1Device item : items) {
        V1DeviceBuilder builder = new V1DeviceBuilder(item);
        _visitables.get("devices").remove(builder);
        this.devices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromSharedCounters(V1CounterSet... items) {
    if (this.sharedCounters == null) {
      return (A) this;
    }
    for (V1CounterSet item : items) {
        V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
        _visitables.get("sharedCounters").remove(builder);
        this.sharedCounters.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromDevices(Predicate<V1DeviceBuilder> predicate) {
    if (devices == null) {
      return (A) this;
    }
    Iterator<V1DeviceBuilder> each = devices.iterator();
    List visitables = _visitables.get("devices");
    while (each.hasNext()) {
        V1DeviceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromSharedCounters(Predicate<V1CounterSetBuilder> predicate) {
    if (sharedCounters == null) {
      return (A) this;
    }
    Iterator<V1CounterSetBuilder> each = sharedCounters.iterator();
    List visitables = _visitables.get("sharedCounters");
    while (each.hasNext()) {
        V1CounterSetBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public DevicesNested<A> setNewDeviceLike(int index,V1Device item) {
    return new DevicesNested(index, item);
  }
  
  public SharedCountersNested<A> setNewSharedCounterLike(int index,V1CounterSet item) {
    return new SharedCountersNested(index, item);
  }
  
  public A setToDevices(int index,V1Device item) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    V1DeviceBuilder builder = new V1DeviceBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToSharedCounters(int index,V1CounterSet item) {
    if (this.sharedCounters == null) {
      this.sharedCounters = new ArrayList();
    }
    V1CounterSetBuilder builder = new V1CounterSetBuilder(item);
    if (index < 0 || index >= sharedCounters.size()) {
        _visitables.get("sharedCounters").add(builder);
        sharedCounters.add(builder);
    } else {
        _visitables.get("sharedCounters").add(builder);
        sharedCounters.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allNodes == null)) {
        sb.append("allNodes:");
        sb.append(allNodes);
        sb.append(",");
    }
    if (!(devices == null) && !(devices.isEmpty())) {
        sb.append("devices:");
        sb.append(devices);
        sb.append(",");
    }
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(nodeSelector == null)) {
        sb.append("nodeSelector:");
        sb.append(nodeSelector);
        sb.append(",");
    }
    if (!(perDeviceNodeSelection == null)) {
        sb.append("perDeviceNodeSelection:");
        sb.append(perDeviceNodeSelection);
        sb.append(",");
    }
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
        sb.append(",");
    }
    if (!(sharedCounters == null) && !(sharedCounters.isEmpty())) {
        sb.append("sharedCounters:");
        sb.append(sharedCounters);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllNodes() {
    return withAllNodes(true);
  }
  
  public A withAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
    return (A) this;
  }
  
  public A withDevices(List<V1Device> devices) {
    if (this.devices != null) {
      this._visitables.get("devices").clear();
    }
    if (devices != null) {
        this.devices = new ArrayList();
        for (V1Device item : devices) {
          this.addToDevices(item);
        }
    } else {
      this.devices = null;
    }
    return (A) this;
  }
  
  public A withDevices(V1Device... devices) {
    if (this.devices != null) {
        this.devices.clear();
        _visitables.remove("devices");
    }
    if (devices != null) {
      for (V1Device item : devices) {
        this.addToDevices(item);
      }
    }
    return (A) this;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public NodeSelectorNested<A> withNewNodeSelector() {
    return new NodeSelectorNested(null);
  }
  
  public NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new NodeSelectorNested(item);
  }
  
  public PoolNested<A> withNewPool() {
    return new PoolNested(null);
  }
  
  public PoolNested<A> withNewPoolLike(V1ResourcePool item) {
    return new PoolNested(item);
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public A withNodeSelector(V1NodeSelector nodeSelector) {
    this._visitables.remove("nodeSelector");
    if (nodeSelector != null) {
        this.nodeSelector = new V1NodeSelectorBuilder(nodeSelector);
        this._visitables.get("nodeSelector").add(this.nodeSelector);
    } else {
        this.nodeSelector = null;
        this._visitables.get("nodeSelector").remove(this.nodeSelector);
    }
    return (A) this;
  }
  
  public A withPerDeviceNodeSelection() {
    return withPerDeviceNodeSelection(true);
  }
  
  public A withPerDeviceNodeSelection(Boolean perDeviceNodeSelection) {
    this.perDeviceNodeSelection = perDeviceNodeSelection;
    return (A) this;
  }
  
  public A withPool(V1ResourcePool pool) {
    this._visitables.remove("pool");
    if (pool != null) {
        this.pool = new V1ResourcePoolBuilder(pool);
        this._visitables.get("pool").add(this.pool);
    } else {
        this.pool = null;
        this._visitables.get("pool").remove(this.pool);
    }
    return (A) this;
  }
  
  public A withSharedCounters(List<V1CounterSet> sharedCounters) {
    if (this.sharedCounters != null) {
      this._visitables.get("sharedCounters").clear();
    }
    if (sharedCounters != null) {
        this.sharedCounters = new ArrayList();
        for (V1CounterSet item : sharedCounters) {
          this.addToSharedCounters(item);
        }
    } else {
      this.sharedCounters = null;
    }
    return (A) this;
  }
  
  public A withSharedCounters(V1CounterSet... sharedCounters) {
    if (this.sharedCounters != null) {
        this.sharedCounters.clear();
        _visitables.remove("sharedCounters");
    }
    if (sharedCounters != null) {
      for (V1CounterSet item : sharedCounters) {
        this.addToSharedCounters(item);
      }
    }
    return (A) this;
  }
  public class DevicesNested<N> extends V1DeviceFluent<DevicesNested<N>> implements Nested<N>{
  
    V1DeviceBuilder builder;
    int index;
  
    DevicesNested(int index,V1Device item) {
      this.index = index;
      this.builder = new V1DeviceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceSpecFluent.this.setToDevices(index, builder.build());
    }
    
    public N endDevice() {
      return and();
    }
    
  }
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
  
    V1NodeSelectorBuilder builder;
  
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceSpecFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  }
  public class PoolNested<N> extends V1ResourcePoolFluent<PoolNested<N>> implements Nested<N>{
  
    V1ResourcePoolBuilder builder;
  
    PoolNested(V1ResourcePool item) {
      this.builder = new V1ResourcePoolBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceSpecFluent.this.withPool(builder.build());
    }
    
    public N endPool() {
      return and();
    }
    
  }
  public class SharedCountersNested<N> extends V1CounterSetFluent<SharedCountersNested<N>> implements Nested<N>{
  
    V1CounterSetBuilder builder;
    int index;
  
    SharedCountersNested(int index,V1CounterSet item) {
      this.index = index;
      this.builder = new V1CounterSetBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ResourceSliceSpecFluent.this.setToSharedCounters(index, builder.build());
    }
    
    public N endSharedCounter() {
      return and();
    }
    
  }
}