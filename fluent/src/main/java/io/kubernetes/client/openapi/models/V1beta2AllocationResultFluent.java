package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2AllocationResultFluent<A extends io.kubernetes.client.openapi.models.V1beta2AllocationResultFluent<A>> extends BaseFluent<A>{
  public V1beta2AllocationResultFluent() {
  }
  
  public V1beta2AllocationResultFluent(V1beta2AllocationResult instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime allocationTimestamp;
  private V1beta2DeviceAllocationResultBuilder devices;
  private V1NodeSelectorBuilder nodeSelector;
  
  protected void copyInstance(V1beta2AllocationResult instance) {
    instance = instance != null ? instance : new V1beta2AllocationResult();
    if (instance != null) {
        this.withAllocationTimestamp(instance.getAllocationTimestamp());
        this.withDevices(instance.getDevices());
        this.withNodeSelector(instance.getNodeSelector());
    }
  }
  
  public OffsetDateTime getAllocationTimestamp() {
    return this.allocationTimestamp;
  }
  
  public A withAllocationTimestamp(OffsetDateTime allocationTimestamp) {
    this.allocationTimestamp = allocationTimestamp;
    return (A) this;
  }
  
  public boolean hasAllocationTimestamp() {
    return this.allocationTimestamp != null;
  }
  
  public V1beta2DeviceAllocationResult buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public A withDevices(V1beta2DeviceAllocationResult devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1beta2DeviceAllocationResultBuilder(devices);
        this._visitables.get("devices").add(this.devices);
    } else {
        this.devices = null;
        this._visitables.get("devices").remove(this.devices);
    }
    return (A) this;
  }
  
  public boolean hasDevices() {
    return this.devices != null;
  }
  
  public DevicesNested<A> withNewDevices() {
    return new DevicesNested(null);
  }
  
  public DevicesNested<A> withNewDevicesLike(V1beta2DeviceAllocationResult item) {
    return new DevicesNested(item);
  }
  
  public DevicesNested<A> editDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(new V1beta2DeviceAllocationResultBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1beta2DeviceAllocationResult item) {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(item));
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
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(null));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelector() {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public NodeSelectorNested<A> editOrNewNodeSelectorLike(V1NodeSelector item) {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(item));
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
    V1beta2AllocationResultFluent that = (V1beta2AllocationResultFluent) o;
    if (!(Objects.equals(allocationTimestamp, that.allocationTimestamp))) {
      return false;
    }
    if (!(Objects.equals(devices, that.devices))) {
      return false;
    }
    if (!(Objects.equals(nodeSelector, that.nodeSelector))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(allocationTimestamp, devices, nodeSelector);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocationTimestamp == null)) {
        sb.append("allocationTimestamp:");
        sb.append(allocationTimestamp);
        sb.append(",");
    }
    if (!(devices == null)) {
        sb.append("devices:");
        sb.append(devices);
        sb.append(",");
    }
    if (!(nodeSelector == null)) {
        sb.append("nodeSelector:");
        sb.append(nodeSelector);
    }
    sb.append("}");
    return sb.toString();
  }
  public class DevicesNested<N> extends V1beta2DeviceAllocationResultFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(V1beta2DeviceAllocationResult item) {
      this.builder = new V1beta2DeviceAllocationResultBuilder(this, item);
    }
    V1beta2DeviceAllocationResultBuilder builder;
    
    public N and() {
      return (N) V1beta2AllocationResultFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  
  }
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1beta2AllocationResultFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  
  }

}