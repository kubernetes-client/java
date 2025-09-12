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
public class V1beta1DeviceFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceFluent() {
  }
  
  public V1beta1DeviceFluent(V1beta1Device instance) {
    this.copyInstance(instance);
  }
  private V1beta1BasicDeviceBuilder basic;
  private String name;
  
  protected void copyInstance(V1beta1Device instance) {
    instance = instance != null ? instance : new V1beta1Device();
    if (instance != null) {
        this.withBasic(instance.getBasic());
        this.withName(instance.getName());
    }
  }
  
  public V1beta1BasicDevice buildBasic() {
    return this.basic != null ? this.basic.build() : null;
  }
  
  public A withBasic(V1beta1BasicDevice basic) {
    this._visitables.remove("basic");
    if (basic != null) {
        this.basic = new V1beta1BasicDeviceBuilder(basic);
        this._visitables.get("basic").add(this.basic);
    } else {
        this.basic = null;
        this._visitables.get("basic").remove(this.basic);
    }
    return (A) this;
  }
  
  public boolean hasBasic() {
    return this.basic != null;
  }
  
  public BasicNested<A> withNewBasic() {
    return new BasicNested(null);
  }
  
  public BasicNested<A> withNewBasicLike(V1beta1BasicDevice item) {
    return new BasicNested(item);
  }
  
  public BasicNested<A> editBasic() {
    return this.withNewBasicLike(Optional.ofNullable(this.buildBasic()).orElse(null));
  }
  
  public BasicNested<A> editOrNewBasic() {
    return this.withNewBasicLike(Optional.ofNullable(this.buildBasic()).orElse(new V1beta1BasicDeviceBuilder().build()));
  }
  
  public BasicNested<A> editOrNewBasicLike(V1beta1BasicDevice item) {
    return this.withNewBasicLike(Optional.ofNullable(this.buildBasic()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
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
    V1beta1DeviceFluent that = (V1beta1DeviceFluent) o;
    if (!(Objects.equals(basic, that.basic))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(basic, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(basic == null)) {
        sb.append("basic:");
        sb.append(basic);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  public class BasicNested<N> extends V1beta1BasicDeviceFluent<BasicNested<N>> implements Nested<N>{
    BasicNested(V1beta1BasicDevice item) {
      this.builder = new V1beta1BasicDeviceBuilder(this, item);
    }
    V1beta1BasicDeviceBuilder builder;
    
    public N and() {
      return (N) V1beta1DeviceFluent.this.withBasic(builder.build());
    }
    
    public N endBasic() {
      return and();
    }
    
  
  }

}