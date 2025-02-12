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
public class V1alpha3DeviceSelectorFluent<A extends V1alpha3DeviceSelectorFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceSelectorFluent() {
  }
  
  public V1alpha3DeviceSelectorFluent(V1alpha3DeviceSelector instance) {
    this.copyInstance(instance);
  }
  private V1alpha3CELDeviceSelectorBuilder cel;
  
  protected void copyInstance(V1alpha3DeviceSelector instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceSelector());
    if (instance != null) {
          this.withCel(instance.getCel());
        }
  }
  
  public V1alpha3CELDeviceSelector buildCel() {
    return this.cel != null ? this.cel.build() : null;
  }
  
  public A withCel(V1alpha3CELDeviceSelector cel) {
    this._visitables.remove("cel");
    if (cel != null) {
        this.cel = new V1alpha3CELDeviceSelectorBuilder(cel);
        this._visitables.get("cel").add(this.cel);
    } else {
        this.cel = null;
        this._visitables.get("cel").remove(this.cel);
    }
    return (A) this;
  }
  
  public boolean hasCel() {
    return this.cel != null;
  }
  
  public CelNested<A> withNewCel() {
    return new CelNested(null);
  }
  
  public CelNested<A> withNewCelLike(V1alpha3CELDeviceSelector item) {
    return new CelNested(item);
  }
  
  public CelNested<A> editCel() {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(null));
  }
  
  public CelNested<A> editOrNewCel() {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(new V1alpha3CELDeviceSelectorBuilder().build()));
  }
  
  public CelNested<A> editOrNewCelLike(V1alpha3CELDeviceSelector item) {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceSelectorFluent that = (V1alpha3DeviceSelectorFluent) o;
    if (!java.util.Objects.equals(cel, that.cel)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(cel,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cel != null) { sb.append("cel:"); sb.append(cel); }
    sb.append("}");
    return sb.toString();
  }
  public class CelNested<N> extends V1alpha3CELDeviceSelectorFluent<CelNested<N>> implements Nested<N>{
    CelNested(V1alpha3CELDeviceSelector item) {
      this.builder = new V1alpha3CELDeviceSelectorBuilder(this, item);
    }
    V1alpha3CELDeviceSelectorBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceSelectorFluent.this.withCel(builder.build());
    }
    
    public N endCel() {
      return and();
    }
    
  
  }

}