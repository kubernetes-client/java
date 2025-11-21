package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1AllocationResultFluent<A extends io.kubernetes.client.openapi.models.V1beta1AllocationResultFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime allocationTimestamp;
  private V1beta1DeviceAllocationResultBuilder devices;
  private V1NodeSelectorBuilder nodeSelector;

  public V1beta1AllocationResultFluent() {
  }
  
  public V1beta1AllocationResultFluent(V1beta1AllocationResult instance) {
    this.copyInstance(instance);
  }

  public V1beta1DeviceAllocationResult buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public V1NodeSelector buildNodeSelector() {
    return this.nodeSelector != null ? this.nodeSelector.build() : null;
  }
  
  protected void copyInstance(V1beta1AllocationResult instance) {
    instance = instance != null ? instance : new V1beta1AllocationResult();
    if (instance != null) {
        this.withAllocationTimestamp(instance.getAllocationTimestamp());
        this.withDevices(instance.getDevices());
        this.withNodeSelector(instance.getNodeSelector());
    }
  }
  
  public DevicesNested<A> editDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(null));
  }
  
  public NodeSelectorNested<A> editNodeSelector() {
    return this.withNewNodeSelectorLike(Optional.ofNullable(this.buildNodeSelector()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(new V1beta1DeviceAllocationResultBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1beta1DeviceAllocationResult item) {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(item));
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
    V1beta1AllocationResultFluent that = (V1beta1AllocationResultFluent) o;
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
  
  public OffsetDateTime getAllocationTimestamp() {
    return this.allocationTimestamp;
  }
  
  public boolean hasAllocationTimestamp() {
    return this.allocationTimestamp != null;
  }
  
  public boolean hasDevices() {
    return this.devices != null;
  }
  
  public boolean hasNodeSelector() {
    return this.nodeSelector != null;
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
  
  public A withAllocationTimestamp(OffsetDateTime allocationTimestamp) {
    this.allocationTimestamp = allocationTimestamp;
    return (A) this;
  }
  
  public A withDevices(V1beta1DeviceAllocationResult devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1beta1DeviceAllocationResultBuilder(devices);
        this._visitables.get("devices").add(this.devices);
    } else {
        this.devices = null;
        this._visitables.get("devices").remove(this.devices);
    }
    return (A) this;
  }
  
  public DevicesNested<A> withNewDevices() {
    return new DevicesNested(null);
  }
  
  public DevicesNested<A> withNewDevicesLike(V1beta1DeviceAllocationResult item) {
    return new DevicesNested(item);
  }
  
  public NodeSelectorNested<A> withNewNodeSelector() {
    return new NodeSelectorNested(null);
  }
  
  public NodeSelectorNested<A> withNewNodeSelectorLike(V1NodeSelector item) {
    return new NodeSelectorNested(item);
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
  public class DevicesNested<N> extends V1beta1DeviceAllocationResultFluent<DevicesNested<N>> implements Nested<N>{
  
    V1beta1DeviceAllocationResultBuilder builder;
  
    DevicesNested(V1beta1DeviceAllocationResult item) {
      this.builder = new V1beta1DeviceAllocationResultBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1AllocationResultFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  }
  public class NodeSelectorNested<N> extends V1NodeSelectorFluent<NodeSelectorNested<N>> implements Nested<N>{
  
    V1NodeSelectorBuilder builder;
  
    NodeSelectorNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1AllocationResultFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  }
}