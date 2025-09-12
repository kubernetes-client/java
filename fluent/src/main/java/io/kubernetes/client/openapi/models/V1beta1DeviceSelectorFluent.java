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
public class V1beta1DeviceSelectorFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceSelectorFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceSelectorFluent() {
  }
  
  public V1beta1DeviceSelectorFluent(V1beta1DeviceSelector instance) {
    this.copyInstance(instance);
  }
  private V1beta1CELDeviceSelectorBuilder cel;
  
  protected void copyInstance(V1beta1DeviceSelector instance) {
    instance = instance != null ? instance : new V1beta1DeviceSelector();
    if (instance != null) {
      this.withCel(instance.getCel());
    }
  }
  
  public V1beta1CELDeviceSelector buildCel() {
    return this.cel != null ? this.cel.build() : null;
  }
  
  public A withCel(V1beta1CELDeviceSelector cel) {
    this._visitables.remove("cel");
    if (cel != null) {
        this.cel = new V1beta1CELDeviceSelectorBuilder(cel);
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
  
  public CelNested<A> withNewCelLike(V1beta1CELDeviceSelector item) {
    return new CelNested(item);
  }
  
  public CelNested<A> editCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(null));
  }
  
  public CelNested<A> editOrNewCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(new V1beta1CELDeviceSelectorBuilder().build()));
  }
  
  public CelNested<A> editOrNewCelLike(V1beta1CELDeviceSelector item) {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(item));
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
    V1beta1DeviceSelectorFluent that = (V1beta1DeviceSelectorFluent) o;
    if (!(Objects.equals(cel, that.cel))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(cel);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(cel == null)) {
        sb.append("cel:");
        sb.append(cel);
    }
    sb.append("}");
    return sb.toString();
  }
  public class CelNested<N> extends V1beta1CELDeviceSelectorFluent<CelNested<N>> implements Nested<N>{
    CelNested(V1beta1CELDeviceSelector item) {
      this.builder = new V1beta1CELDeviceSelectorBuilder(this, item);
    }
    V1beta1CELDeviceSelectorBuilder builder;
    
    public N and() {
      return (N) V1beta1DeviceSelectorFluent.this.withCel(builder.build());
    }
    
    public N endCel() {
      return and();
    }
    
  
  }

}