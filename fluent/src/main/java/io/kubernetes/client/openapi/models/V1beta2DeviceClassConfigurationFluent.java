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
public class V1beta2DeviceClassConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceClassConfigurationFluent<A>> extends BaseFluent<A>{

  private V1beta2OpaqueDeviceConfigurationBuilder opaque;

  public V1beta2DeviceClassConfigurationFluent() {
  }
  
  public V1beta2DeviceClassConfigurationFluent(V1beta2DeviceClassConfiguration instance) {
    this.copyInstance(instance);
  }

  public V1beta2OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  protected void copyInstance(V1beta2DeviceClassConfiguration instance) {
    instance = instance != null ? instance : new V1beta2DeviceClassConfiguration();
    if (instance != null) {
      this.withOpaque(instance.getOpaque());
    }
  }
  
  public OpaqueNested<A> editOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(new V1beta2OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(item));
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
    V1beta2DeviceClassConfigurationFluent that = (V1beta2DeviceClassConfigurationFluent) o;
    if (!(Objects.equals(opaque, that.opaque))) {
      return false;
    }
    return true;
  }
  
  public boolean hasOpaque() {
    return this.opaque != null;
  }
  
  public int hashCode() {
    return Objects.hash(opaque);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(opaque == null)) {
        sb.append("opaque:");
        sb.append(opaque);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public OpaqueNested<A> withNewOpaque() {
    return new OpaqueNested(null);
  }
  
  public OpaqueNested<A> withNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public A withOpaque(V1beta2OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1beta2OpaqueDeviceConfigurationBuilder(opaque);
        this._visitables.get("opaque").add(this.opaque);
    } else {
        this.opaque = null;
        this._visitables.get("opaque").remove(this.opaque);
    }
    return (A) this;
  }
  public class OpaqueNested<N> extends V1beta2OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
  
    V1beta2OpaqueDeviceConfigurationBuilder builder;
  
    OpaqueNested(V1beta2OpaqueDeviceConfiguration item) {
      this.builder = new V1beta2OpaqueDeviceConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2DeviceClassConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  }
}