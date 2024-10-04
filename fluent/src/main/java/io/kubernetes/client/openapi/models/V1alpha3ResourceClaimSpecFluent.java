package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourceClaimSpecFluent<A extends V1alpha3ResourceClaimSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha3ResourceClaimSpecFluent() {
  }
  
  public V1alpha3ResourceClaimSpecFluent(V1alpha3ResourceClaimSpec instance) {
    this.copyInstance(instance);
  }
  private String controller;
  private V1alpha3DeviceClaimBuilder devices;
  
  protected void copyInstance(V1alpha3ResourceClaimSpec instance) {
    instance = (instance != null ? instance : new V1alpha3ResourceClaimSpec());
    if (instance != null) {
          this.withController(instance.getController());
          this.withDevices(instance.getDevices());
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
  
  public V1alpha3DeviceClaim buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public A withDevices(V1alpha3DeviceClaim devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1alpha3DeviceClaimBuilder(devices);
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
  
  public DevicesNested<A> withNewDevicesLike(V1alpha3DeviceClaim item) {
    return new DevicesNested(item);
  }
  
  public DevicesNested<A> editDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(new V1alpha3DeviceClaimBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1alpha3DeviceClaim item) {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3ResourceClaimSpecFluent that = (V1alpha3ResourceClaimSpecFluent) o;
    if (!java.util.Objects.equals(controller, that.controller)) return false;
    if (!java.util.Objects.equals(devices, that.devices)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(controller,  devices,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (controller != null) { sb.append("controller:"); sb.append(controller + ","); }
    if (devices != null) { sb.append("devices:"); sb.append(devices); }
    sb.append("}");
    return sb.toString();
  }
  public class DevicesNested<N> extends V1alpha3DeviceClaimFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(V1alpha3DeviceClaim item) {
      this.builder = new V1alpha3DeviceClaimBuilder(this, item);
    }
    V1alpha3DeviceClaimBuilder builder;
    
    public N and() {
      return (N) V1alpha3ResourceClaimSpecFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  
  }

}