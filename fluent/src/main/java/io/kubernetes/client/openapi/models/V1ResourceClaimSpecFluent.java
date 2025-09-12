package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceClaimSpecFluent<A extends io.kubernetes.client.openapi.models.V1ResourceClaimSpecFluent<A>> extends BaseFluent<A>{
  public V1ResourceClaimSpecFluent() {
  }
  
  public V1ResourceClaimSpecFluent(V1ResourceClaimSpec instance) {
    this.copyInstance(instance);
  }
  private V1DeviceClaimBuilder devices;
  
  protected void copyInstance(V1ResourceClaimSpec instance) {
    instance = instance != null ? instance : new V1ResourceClaimSpec();
    if (instance != null) {
      this.withDevices(instance.getDevices());
    }
  }
  
  public V1DeviceClaim buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public A withDevices(V1DeviceClaim devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1DeviceClaimBuilder(devices);
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
  
  public DevicesNested<A> withNewDevicesLike(V1DeviceClaim item) {
    return new DevicesNested(item);
  }
  
  public DevicesNested<A> editDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return this.withNewDevicesLike(Optional.ofNullable(this.buildDevices()).orElse(new V1DeviceClaimBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1DeviceClaim item) {
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
    V1ResourceClaimSpecFluent that = (V1ResourceClaimSpecFluent) o;
    if (!(Objects.equals(devices, that.devices))) {
      return false;
    }
    return true;
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
  public class DevicesNested<N> extends V1DeviceClaimFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(V1DeviceClaim item) {
      this.builder = new V1DeviceClaimBuilder(this, item);
    }
    V1DeviceClaimBuilder builder;
    
    public N and() {
      return (N) V1ResourceClaimSpecFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  
  }

}