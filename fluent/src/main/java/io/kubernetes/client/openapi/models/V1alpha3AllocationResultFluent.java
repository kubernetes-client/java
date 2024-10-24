package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3AllocationResultFluent<A extends V1alpha3AllocationResultFluent<A>> extends BaseFluent<A>{
  public V1alpha3AllocationResultFluent() {
  }
  
  public V1alpha3AllocationResultFluent(V1alpha3AllocationResult instance) {
    this.copyInstance(instance);
  }
  private String controller;
  private V1alpha3DeviceAllocationResultBuilder devices;
  private V1NodeSelectorBuilder nodeSelector;
  
  protected void copyInstance(V1alpha3AllocationResult instance) {
    instance = (instance != null ? instance : new V1alpha3AllocationResult());
    if (instance != null) {
          this.withController(instance.getController());
          this.withDevices(instance.getDevices());
          this.withNodeSelector(instance.getNodeSelector());
        }
  }
  
  public String getController() {
    return this.controller;
  }
  
  public A withController(String controller) {
    this.controller = controller;
    return (A) this;
  }
  
  public boolean hasController() {
    return this.controller != null;
  }
  
  public V1alpha3DeviceAllocationResult buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public A withDevices(V1alpha3DeviceAllocationResult devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1alpha3DeviceAllocationResultBuilder(devices);
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
  
  public DevicesNested<A> withNewDevicesLike(V1alpha3DeviceAllocationResult item) {
    return new DevicesNested(item);
  }
  
  public DevicesNested<A> editDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(new V1alpha3DeviceAllocationResultBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1alpha3DeviceAllocationResult item) {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(item));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3AllocationResultFluent that = (V1alpha3AllocationResultFluent) o;
    if (!java.util.Objects.equals(controller, that.controller)) return false;
    if (!java.util.Objects.equals(devices, that.devices)) return false;
    if (!java.util.Objects.equals(nodeSelector, that.nodeSelector)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(controller,  devices,  nodeSelector,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (controller != null) { sb.append("controller:"); sb.append(controller + ","); }
    if (devices != null) { sb.append("devices:"); sb.append(devices + ","); }
    if (nodeSelector != null) { sb.append("nodeSelector:"); sb.append(nodeSelector); }
    sb.append("}");
    return sb.toString();
  }
  public class DevicesNested<N> extends V1alpha3DeviceAllocationResultFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(V1alpha3DeviceAllocationResult item) {
      this.builder = new V1alpha3DeviceAllocationResultBuilder(this, item);
    }
    V1alpha3DeviceAllocationResultBuilder builder;
    
    public N and() {
      return (N) V1alpha3AllocationResultFluent.this.withDevices(builder.build());
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
      return (N) V1alpha3AllocationResultFluent.this.withNodeSelector(builder.build());
    }
    
    public N endNodeSelector() {
      return and();
    }
    
  
  }

}