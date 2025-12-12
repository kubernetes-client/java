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
public class V1DeviceSelectorFluent<A extends io.kubernetes.client.openapi.models.V1DeviceSelectorFluent<A>> extends BaseFluent<A>{

  private V1CELDeviceSelectorBuilder cel;

  public V1DeviceSelectorFluent() {
  }
  
  public V1DeviceSelectorFluent(V1DeviceSelector instance) {
    this.copyInstance(instance);
  }

  public V1CELDeviceSelector buildCel() {
    return this.cel != null ? this.cel.build() : null;
  }
  
  protected void copyInstance(V1DeviceSelector instance) {
    instance = instance != null ? instance : new V1DeviceSelector();
    if (instance != null) {
      this.withCel(instance.getCel());
    }
  }
  
  public CelNested<A> editCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(null));
  }
  
  public CelNested<A> editOrNewCel() {
    return this.withNewCelLike(Optional.ofNullable(this.buildCel()).orElse(new V1CELDeviceSelectorBuilder().build()));
  }
  
  public CelNested<A> editOrNewCelLike(V1CELDeviceSelector item) {
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
    V1DeviceSelectorFluent that = (V1DeviceSelectorFluent) o;
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
  
  public A withCel(V1CELDeviceSelector cel) {
    this._visitables.remove("cel");
    if (cel != null) {
        this.cel = new V1CELDeviceSelectorBuilder(cel);
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
  
  public CelNested<A> withNewCelLike(V1CELDeviceSelector item) {
    return new CelNested(item);
  }
  public class CelNested<N> extends V1CELDeviceSelectorFluent<CelNested<N>> implements Nested<N>{
  
    V1CELDeviceSelectorBuilder builder;
  
    CelNested(V1CELDeviceSelector item) {
      this.builder = new V1CELDeviceSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1DeviceSelectorFluent.this.withCel(builder.build());
    }
    
    public N endCel() {
      return and();
    }
    
  }
}