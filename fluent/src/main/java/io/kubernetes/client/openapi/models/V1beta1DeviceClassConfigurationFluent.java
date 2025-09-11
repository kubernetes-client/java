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
public class V1beta1DeviceClassConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceClassConfigurationFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceClassConfigurationFluent() {
  }
  
  public V1beta1DeviceClassConfigurationFluent(V1beta1DeviceClassConfiguration instance) {
    this.copyInstance(instance);
  }
  private V1beta1OpaqueDeviceConfigurationBuilder opaque;
  
  protected void copyInstance(V1beta1DeviceClassConfiguration instance) {
    instance = instance != null ? instance : new V1beta1DeviceClassConfiguration();
    if (instance != null) {
      this.withOpaque(instance.getOpaque());
    }
  }
  
  public V1beta1OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  public A withOpaque(V1beta1OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1beta1OpaqueDeviceConfigurationBuilder(opaque);
        this._visitables.get("opaque").add(this.opaque);
    } else {
        this.opaque = null;
        this._visitables.get("opaque").remove(this.opaque);
    }
    return (A) this;
  }
  
  public boolean hasOpaque() {
    return this.opaque != null;
  }
  
  public OpaqueNested<A> withNewOpaque() {
    return new OpaqueNested(null);
  }
  
  public OpaqueNested<A> withNewOpaqueLike(V1beta1OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public OpaqueNested<A> editOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return this.withNewOpaqueLike(Optional.ofNullable(this.buildOpaque()).orElse(new V1beta1OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1beta1OpaqueDeviceConfiguration item) {
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
    V1beta1DeviceClassConfigurationFluent that = (V1beta1DeviceClassConfigurationFluent) o;
    if (!(Objects.equals(opaque, that.opaque))) {
      return false;
    }
    return true;
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
  public class OpaqueNested<N> extends V1beta1OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
    OpaqueNested(V1beta1OpaqueDeviceConfiguration item) {
      this.builder = new V1beta1OpaqueDeviceConfigurationBuilder(this, item);
    }
    V1beta1OpaqueDeviceConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta1DeviceClassConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  
  }

}