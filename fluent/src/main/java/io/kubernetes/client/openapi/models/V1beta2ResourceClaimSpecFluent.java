package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2ResourceClaimSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta2ResourceClaimSpecFluent<A>> extends BaseFluent<A>{

  private V1beta2DeviceClaimBuilder devices;

  public V1beta2ResourceClaimSpecFluent() {
  }
  
  public V1beta2ResourceClaimSpecFluent(V1beta2ResourceClaimSpec instance) {
    this.copyInstance(instance);
  }

  public V1beta2DeviceClaim buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  protected void copyInstance(V1beta2ResourceClaimSpec instance) {
    instance = instance != null ? instance : new V1beta2ResourceClaimSpec();
    if (instance != null) {
      this.withDevices(instance.getDevices());
    }
  }
  
  public DevicesNested<A> editDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(new V1beta2DeviceClaimBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1beta2DeviceClaim item) {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(item));
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
    V1beta2ResourceClaimSpecFluent that = (V1beta2ResourceClaimSpecFluent) o;
    if (!(Objects.equals(devices, that.devices))) {
      return false;
    }
    return true;
  }
  
  public boolean hasDevices() {
    return this.devices != null;
  }
  
  public int hashCode() {
    return Objects.hash(devices);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(devices == null)) {
        sb.append("devices:");
        sb.append(devices);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDevices(V1beta2DeviceClaim devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1beta2DeviceClaimBuilder(devices);
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
  
  public DevicesNested<A> withNewDevicesLike(V1beta2DeviceClaim item) {
    return new DevicesNested(item);
  }
  public class DevicesNested<N> extends V1beta2DeviceClaimFluent<DevicesNested<N>> implements Nested<N>{
  
    V1beta2DeviceClaimBuilder builder;
  
    DevicesNested(V1beta2DeviceClaim item) {
      this.builder = new V1beta2DeviceClaimBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2ResourceClaimSpecFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  }
}