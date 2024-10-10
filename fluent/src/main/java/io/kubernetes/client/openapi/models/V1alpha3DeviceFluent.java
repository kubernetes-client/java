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
public class V1alpha3DeviceFluent<A extends V1alpha3DeviceFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceFluent() {
  }
  
  public V1alpha3DeviceFluent(V1alpha3Device instance) {
    this.copyInstance(instance);
  }
  private V1alpha3BasicDeviceBuilder basic;
  private String name;
  
  protected void copyInstance(V1alpha3Device instance) {
    instance = (instance != null ? instance : new V1alpha3Device());
    if (instance != null) {
          this.withBasic(instance.getBasic());
          this.withName(instance.getName());
        }
  }
  
  public V1alpha3BasicDevice buildBasic() {
    return this.basic != null ? this.basic.build() : null;
  }
  
  public A withBasic(V1alpha3BasicDevice basic) {
    this._visitables.remove("basic");
    if (basic != null) {
        this.basic = new V1alpha3BasicDeviceBuilder(basic);
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
  
  public BasicNested<A> withNewBasicLike(V1alpha3BasicDevice item) {
    return new BasicNested(item);
  }
  
  public BasicNested<A> editBasic() {
    return withNewBasicLike(java.util.Optional.ofNullable(buildBasic()).orElse(null));
  }
  
  public BasicNested<A> editOrNewBasic() {
    return withNewBasicLike(java.util.Optional.ofNullable(buildBasic()).orElse(new V1alpha3BasicDeviceBuilder().build()));
  }
  
  public BasicNested<A> editOrNewBasicLike(V1alpha3BasicDevice item) {
    return withNewBasicLike(java.util.Optional.ofNullable(buildBasic()).orElse(item));
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceFluent that = (V1alpha3DeviceFluent) o;
    if (!java.util.Objects.equals(basic, that.basic)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(basic,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (basic != null) { sb.append("basic:"); sb.append(basic + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  public class BasicNested<N> extends V1alpha3BasicDeviceFluent<BasicNested<N>> implements Nested<N>{
    BasicNested(V1alpha3BasicDevice item) {
      this.builder = new V1alpha3BasicDeviceBuilder(this, item);
    }
    V1alpha3BasicDeviceBuilder builder;
    
    public N and() {
      return (N) V1alpha3DeviceFluent.this.withBasic(builder.build());
    }
    
    public N endBasic() {
      return and();
    }
    
  
  }

}