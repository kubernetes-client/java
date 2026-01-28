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
public class V1beta2DeviceSelectorFluent<A extends io.kubernetes.client.openapi.models.V1beta2DeviceSelectorFluent<A>> extends BaseFluent<A>{

  private V1beta2CELDeviceSelectorBuilder cel;

  public V1beta2DeviceSelectorFluent() {
  }
  
  public V1beta2DeviceSelectorFluent(V1beta2DeviceSelector instance) {
    this.copyInstance(instance);
  }

  public V1beta2CELDeviceSelector buildCel() {
    return this.cel != null ? this.cel.build() : null;
  }
  
  protected void copyInstance(V1beta2DeviceSelector instance) {
    instance = instance != null ? instance : new V1beta2DeviceSelector();
    if (instance != null) {
      this.withCel(instance.getCel());
    }
  }
  
  public CelNested<A> editCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(null));
  }
  
  public CelNested<A> editOrNewCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(new V1beta2CELDeviceSelectorBuilder().build()));
  }
  
  public CelNested<A> editOrNewCelLike(V1beta2CELDeviceSelector item) {
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
    V1beta2DeviceSelectorFluent that = (V1beta2DeviceSelectorFluent) o;
    if (!(Objects.equals(cel, that.cel))) {
      return false;
    }
    return true;
  }
  
  public boolean hasCel() {
    return this.cel != null;
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
  
  public A withCel(V1beta2CELDeviceSelector cel) {
    this._visitables.remove("cel");
    if (cel != null) {
        this.cel = new V1beta2CELDeviceSelectorBuilder(cel);
        this._visitables.get("cel").add(this.cel);
    } else {
        this.cel = null;
        this._visitables.get("cel").remove(this.cel);
    }
    return (A) this;
  }
  
  public CelNested<A> withNewCel() {
    return new CelNested(null);
  }
  
  public CelNested<A> withNewCelLike(V1beta2CELDeviceSelector item) {
    return new CelNested(item);
  }
  public class CelNested<N> extends V1beta2CELDeviceSelectorFluent<CelNested<N>> implements Nested<N>{
  
    V1beta2CELDeviceSelectorBuilder builder;
  
    CelNested(V1beta2CELDeviceSelector item) {
      this.builder = new V1beta2CELDeviceSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta2DeviceSelectorFluent.this.withCel(builder.build());
    }
    
    public N endCel() {
      return and();
    }
    
  }
}