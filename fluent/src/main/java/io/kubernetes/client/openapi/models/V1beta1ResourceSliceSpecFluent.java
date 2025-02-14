package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1ResourceSliceSpecFluent<A extends V1beta1ResourceSliceSpecFluent<A>> extends BaseFluent<A>{
  public V1beta1ResourceSliceSpecFluent() {
  }
  
  public V1beta1ResourceSliceSpecFluent(V1beta1ResourceSliceSpec instance) {
    this.copyInstance(instance);
  }
  private Boolean allNodes;
  private ArrayList<V1beta1DeviceBuilder> devices;
  private String driver;
  private String nodeName;
  private V1NodeSelectorBuilder nodeSelector;
  private V1beta1ResourcePoolBuilder pool;
  
  protected void copyInstance(V1beta1ResourceSliceSpec instance) {
    instance = (instance != null ? instance : new V1beta1ResourceSliceSpec());
    if (instance != null) {
          this.withAllNodes(instance.getAllNodes());
          this.withDevices(instance.getDevices());
          this.withDriver(instance.getDriver());
          this.withNodeName(instance.getNodeName());
          this.withNodeSelector(instance.getNodeSelector());
          this.withPool(instance.getPool());
        }
  }
  
  public Boolean getAllNodes() {
    return this.allNodes;
  }
  
  public A withAllNodes(Boolean allNodes) {
    this.allNodes = allNodes;
    return (A) this;
  }
  
  public boolean hasAllNodes() {
    return this.allNodes != null;
  }
  
  public A addToDevices(int index,V1beta1Device item) {
    if (this.devices == null) {this.devices = new ArrayList<V1beta1DeviceBuilder>();}
    V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);
    if (index < 0 || index >= devices.size()) { _visitables.get("devices").add(builder); devices.add(builder); } else { _visitables.get("devices").add(index, builder); devices.add(index, builder);}
    return (A)this;
  }
  
  public A setToDevices(int index,V1beta1Device item) {
    if (this.devices == null) {this.devices = new ArrayList<V1beta1DeviceBuilder>();}
    V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);
    if (index < 0 || index >= devices.size()) { _visitables.get("devices").add(builder); devices.add(builder); } else { _visitables.get("devices").set(index, builder); devices.set(index, builder);}
    return (A)this;
  }
  
  public A addToDevices(io.kubernetes.client.openapi.models.V1beta1Device... items) {
    if (this.devices == null) {this.devices = new ArrayList<V1beta1DeviceBuilder>();}
    for (V1beta1Device item : items) {V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);_visitables.get("devices").add(builder);this.devices.add(builder);} return (A)this;
  }
  
  public A addAllToDevices(Collection<V1beta1Device> items) {
    if (this.devices == null) {this.devices = new ArrayList<V1beta1DeviceBuilder>();}
    for (V1beta1Device item : items) {V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);_visitables.get("devices").add(builder);this.devices.add(builder);} return (A)this;
  }
  
  public A removeFromDevices(io.kubernetes.client.openapi.models.V1beta1Device... items) {
    if (this.devices == null) return (A)this;
    for (V1beta1Device item : items) {V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);_visitables.get("devices").remove(builder); this.devices.remove(builder);} return (A)this;
  }
  
  public A removeAllFromDevices(Collection<V1beta1Device> items) {
    if (this.devices == null) return (A)this;
    for (V1beta1Device item : items) {V1beta1DeviceBuilder builder = new V1beta1DeviceBuilder(item);_visitables.get("devices").remove(builder); this.devices.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromDevices(Predicate<V1beta1DeviceBuilder> predicate) {
    if (devices == null) return (A) this;
    final Iterator<V1beta1DeviceBuilder> each = devices.iterator();
    final List visitables = _visitables.get("devices");
    while (each.hasNext()) {
      V1beta1DeviceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1beta1Device> buildDevices() {
    return this.devices != null ? build(devices) : null;
  }
  
  public V1beta1Device buildDevice(int index) {
    return this.devices.get(index).build();
  }
  
  public V1beta1Device buildFirstDevice() {
    return this.devices.get(0).build();
  }
  
  public V1beta1Device buildLastDevice() {
    return this.devices.get(devices.size() - 1).build();
  }
  
  public V1beta1Device buildMatchingDevice(Predicate<V1beta1DeviceBuilder> predicate) {
      for (V1beta1DeviceBuilder item : devices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDevice(Predicate<V1beta1DeviceBuilder> predicate) {
      for (V1beta1DeviceBuilder item : devices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDevices(List<V1beta1Device> devices) {
    if (this.devices != null) {
      this._visitables.get("devices").clear();
    }
    if (devices != null) {
        this.devices = new ArrayList();
        for (V1beta1Device item : devices) {
          this.addToDevices(item);
        }
    } else {
      this.devices = null;
    }
    return (A) this;
  }
  
  public A withDevices(io.kubernetes.client.openapi.models.V1beta1Device... devices) {
    if (this.devices != null) {
        this.devices.clear();
        _visitables.remove("devices");
    }
    if (devices != null) {
      for (V1beta1Device item : devices) {
        this.addToDevices(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDevices() {
    return this.devices != null && !this.devices.isEmpty();
  }
  
  public DevicesNested<A> addNewDevice() {
    return new DevicesNested(-1, null);
  }
  
  public DevicesNested<A> addNewDeviceLike(V1beta1Device item) {
    return new DevicesNested(-1, item);
  }
  
  public DevicesNested<A> setNewDeviceLike(int index,V1beta1Device item) {
    return new DevicesNested(index, item);
  }
  
  public DevicesNested<A> editDevice(int index) {
    if (devices.size() <= index) throw new RuntimeException("Can't edit devices. Index exceeds size.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public DevicesNested<A> editFirstDevice() {
    if (devices.size() == 0) throw new RuntimeException("Can't edit first devices. The list is empty.");
    return setNewDeviceLike(0, buildDevice(0));
  }
  
  public DevicesNested<A> editLastDevice() {
    int index = devices.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last devices. The list is empty.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public DevicesNested<A> editMatchingDevice(Predicate<V1beta1DeviceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<devices.size();i++) { 
    if (predicate.test(devices.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching devices. No match found.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector != null ? this.nodeSelector.build() : null;
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
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
  }
  
  public NodeSelectorNested<A> withNewNodeSelector() {
    return new NodeSelectorNested(null);
  }
  
  public NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new NodeSelectorNested(item);
  }
  
  public NodeSelectorNested<A> editNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(null));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelector() {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return withNewNodeSelectorLike(java.util.Optional.ofNullable(buildNodeSelector()).orElse(item));
  }
  
  public V1beta1ResourcePool buildPool() {
    return this.pool != null ? this.pool.build() : null;
  }
  
  public A withPool(V1beta1ResourcePool pool) {
    this._visitables.remove("pool");
    if (pool != null) {
        this.pool = new V1beta1ResourcePoolBuilder(pool);
        this._visitables.get("pool").add(this.pool);
    } else {
        this.pool = null;
        this._visitables.get("pool").remove(this.pool);
    }
    return (A) this;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public PoolNested<A> withNewPool() {
    return new PoolNested(null);
  }
  
  public PoolNested<A> withNewPoolLike(V1beta1ResourcePool item) {
    return new PoolNested(item);
  }
  
  public PoolNested<A> editPool() {
    return withNewPoolLike(java.util.Optional.ofNullable(buildPool()).orElse(null));
  }
  
  public PoolNested<A> editOrNewPool() {
    return withNewPoolLike(java.util.Optional.ofNullable(buildPool()).orElse(new V1beta1ResourcePoolBuilder().build()));
  }
  
  public PoolNested<A> editOrNewPoolLike(V1beta1ResourcePool item) {
    return withNewPoolLike(java.util.Optional.ofNullable(buildPool()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1ResourceSliceSpecFluent that = (V1beta1ResourceSliceSpecFluent) o;
    if (!java.util.Objects.equals(allNodes, that.allNodes)) return false;
    if (!java.util.Objects.equals(devices, that.devices)) return false;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    if (!java.util.Objects.equals(pool, that.pool)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allNodes,  devices,  driver,  nodeName,  nodeSelector,  pool,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allNodes != null) { sb.append("allNodes:"); sb.append(allNodes + ","); }
    if (devices != null && !devices.isEmpty()) { sb.append("devices:"); sb.append(devices + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (nodeSelector != null) { sb.append("nodeSelector:"); sb.append(nodeSelector + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllNodes() {
    return withAllNodes(true);
  }
  public class DevicesNested<N> extends V1beta1DeviceFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(int index,V1beta1Device item) {
      this.index = index;
      this.builder = new V1beta1DeviceBuilder(this, item);
    }
    V1beta1DeviceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1ResourceSliceSpecFluent.this.setToDevices(index,builder.build());
    }
    
    public N endDevice() {
      return and();
    }
    
  
  }
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1beta1ResourceSliceSpecFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  
  }
  public class PoolNested<N> extends V1beta1ResourcePoolFluent<PoolNested<N>> implements Nested<N>{
    PoolNested(V1beta1ResourcePool item) {
      this.builder = new V1beta1ResourcePoolBuilder(this, item);
    }
    V1beta1ResourcePoolBuilder builder;
    
    public N and() {
      return (N) V1beta1ResourceSliceSpecFluent.this.withPool(builder.build());
    }
    
    public N endPool() {
      return and();
    }
    
  
  }

}