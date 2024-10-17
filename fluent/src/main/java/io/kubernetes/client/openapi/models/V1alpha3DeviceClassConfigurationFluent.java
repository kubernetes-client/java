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
public class V1alpha3DeviceClassConfigurationFluent<A extends V1alpha3DeviceClassConfigurationFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceClassConfigurationFluent() {
  }
  
  public V1alpha3DeviceClassConfigurationFluent(V1alpha3DeviceClassConfiguration instance) {
    this.copyInstance(instance);
  }
  private V1alpha3OpaqueDeviceConfigurationBuilder opaque;
  
  protected void copyInstance(V1alpha3DeviceClassConfiguration instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceClassConfiguration());
    if (instance != null) {
          this.withOpaque(instance.getOpaque());
        }
  }
  
  public V1alpha3OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  public A withOpaque(V1alpha3OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1alpha3OpaqueDeviceConfigurationBuilder(opaque);
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
  
  public OpaqueNested<A> withNewOpaqueLike(V1alpha3OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public OpaqueNested<A> editOpaque() {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(new V1alpha3OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1alpha3OpaqueDeviceConfiguration item) {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceClassConfigurationFluent that = (V1alpha3DeviceClassConfigurationFluent) o;
    if (!java.util.Objects.equals(opaque, that.opaque)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(opaque,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (opaque != null) { sb.append("opaque:"); sb.append(opaque); }
    sb.append("}");
    return sb.toString();
  }
  public class OpaqueNested<N> extends V1alpha3OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
    OpaqueNested(V1alpha3OpaqueDeviceConfiguration item) {
      this.builder = new V1alpha3OpaqueDeviceConfigurationBuilder(this, item);
    }
    V1alpha3OpaqueDeviceConfigurationBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceClassConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  
  }

}