package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2NamedResourcesAttributeFluent<A extends V1alpha2NamedResourcesAttributeFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesAttributeFluent() {
  }
  
  public V1alpha2NamedResourcesAttributeFluent(V1alpha2NamedResourcesAttribute instance) {
    this.copyInstance(instance);
  }
  private Boolean bool;
  private Long _int;
  private V1alpha2NamedResourcesIntSliceBuilder intSlice;
  private String name;
  private Quantity quantity;
  private String string;
  private V1alpha2NamedResourcesStringSliceBuilder stringSlice;
  private String version;
  
  protected void copyInstance(V1alpha2NamedResourcesAttribute instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesAttribute());
    if (instance != null) {
          this.withBool(instance.getBool());
          this.withInt(instance.getInt());
          this.withIntSlice(instance.getIntSlice());
          this.withName(instance.getName());
          this.withQuantity(instance.getQuantity());
          this.withString(instance.getString());
          this.withStringSlice(instance.getStringSlice());
          this.withVersion(instance.getVersion());
        }
  }
  
  public Boolean getBool() {
    return this.bool;
  }
  
  public A withBool(Boolean bool) {
    this.bool = bool;
    return (A) this;
  }
  
  public boolean hasBool() {
    return this.bool != null;
  }
  
  public Long getInt() {
    return this._int;
  }
  
  public A withInt(Long _int) {
    this._int = _int;
    return (A) this;
  }
  
  public boolean hasInt() {
    return this._int != null;
  }
  
  public V1alpha2NamedResourcesIntSlice buildIntSlice() {
    return this.intSlice != null ? this.intSlice.build() : null;
  }
  
  public A withIntSlice(V1alpha2NamedResourcesIntSlice intSlice) {
    this._visitables.remove("intSlice");
    if (intSlice != null) {
        this.intSlice = new V1alpha2NamedResourcesIntSliceBuilder(intSlice);
        this._visitables.get("intSlice").add(this.intSlice);
    } else {
        this.intSlice = null;
        this._visitables.get("intSlice").remove(this.intSlice);
    }
    return (A) this;
  }
  
  public boolean hasIntSlice() {
    return this.intSlice != null;
  }
  
  public IntSliceNested<A> withNewIntSlice() {
    return new IntSliceNested(null);
  }
  
  public IntSliceNested<A> withNewIntSliceLike(V1alpha2NamedResourcesIntSlice item) {
    return new IntSliceNested(item);
  }
  
  public IntSliceNested<A> editIntSlice() {
    return withNewIntSliceLike(java.util.Optional.ofNullable(buildIntSlice()).orElse(null));
  }
  
  public IntSliceNested<A> editOrNewIntSlice() {
    return withNewIntSliceLike(java.util.Optional.ofNullable(buildIntSlice()).orElse(new V1alpha2NamedResourcesIntSliceBuilder().build()));
  }
  
  public IntSliceNested<A> editOrNewIntSliceLike(V1alpha2NamedResourcesIntSlice item) {
    return withNewIntSliceLike(java.util.Optional.ofNullable(buildIntSlice()).orElse(item));
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
  
  public Quantity getQuantity() {
    return this.quantity;
  }
  
  public A withQuantity(Quantity quantity) {
    this.quantity = quantity;
    return (A) this;
  }
  
  public boolean hasQuantity() {
    return this.quantity != null;
  }
  
  public A withNewQuantity(String value) {
    return (A)withQuantity(new Quantity(value));
  }
  
  public String getString() {
    return this.string;
  }
  
  public A withString(String string) {
    this.string = string;
    return (A) this;
  }
  
  public boolean hasString() {
    return this.string != null;
  }
  
  public V1alpha2NamedResourcesStringSlice buildStringSlice() {
    return this.stringSlice != null ? this.stringSlice.build() : null;
  }
  
  public A withStringSlice(V1alpha2NamedResourcesStringSlice stringSlice) {
    this._visitables.remove("stringSlice");
    if (stringSlice != null) {
        this.stringSlice = new V1alpha2NamedResourcesStringSliceBuilder(stringSlice);
        this._visitables.get("stringSlice").add(this.stringSlice);
    } else {
        this.stringSlice = null;
        this._visitables.get("stringSlice").remove(this.stringSlice);
    }
    return (A) this;
  }
  
  public boolean hasStringSlice() {
    return this.stringSlice != null;
  }
  
  public StringSliceNested<A> withNewStringSlice() {
    return new StringSliceNested(null);
  }
  
  public StringSliceNested<A> withNewStringSliceLike(V1alpha2NamedResourcesStringSlice item) {
    return new StringSliceNested(item);
  }
  
  public StringSliceNested<A> editStringSlice() {
    return withNewStringSliceLike(java.util.Optional.ofNullable(buildStringSlice()).orElse(null));
  }
  
  public StringSliceNested<A> editOrNewStringSlice() {
    return withNewStringSliceLike(java.util.Optional.ofNullable(buildStringSlice()).orElse(new V1alpha2NamedResourcesStringSliceBuilder().build()));
  }
  
  public StringSliceNested<A> editOrNewStringSliceLike(V1alpha2NamedResourcesStringSlice item) {
    return withNewStringSliceLike(java.util.Optional.ofNullable(buildStringSlice()).orElse(item));
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesAttributeFluent that = (V1alpha2NamedResourcesAttributeFluent) o;
    if (!java.util.Objects.equals(bool, that.bool)) return false;
    if (!java.util.Objects.equals(_int, that._int)) return false;
    if (!java.util.Objects.equals(intSlice, that.intSlice)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(quantity, that.quantity)) return false;
    if (!java.util.Objects.equals(string, that.string)) return false;
    if (!java.util.Objects.equals(stringSlice, that.stringSlice)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(bool,  _int,  intSlice,  name,  quantity,  string,  stringSlice,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (bool != null) { sb.append("bool:"); sb.append(bool + ","); }
    if (_int != null) { sb.append("_int:"); sb.append(_int + ","); }
    if (intSlice != null) { sb.append("intSlice:"); sb.append(intSlice + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (quantity != null) { sb.append("quantity:"); sb.append(quantity + ","); }
    if (string != null) { sb.append("string:"); sb.append(string + ","); }
    if (stringSlice != null) { sb.append("stringSlice:"); sb.append(stringSlice + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBool() {
    return withBool(true);
  }
  public class IntSliceNested<N> extends V1alpha2NamedResourcesIntSliceFluent<IntSliceNested<N>> implements Nested<N>{
    IntSliceNested(V1alpha2NamedResourcesIntSlice item) {
      this.builder = new V1alpha2NamedResourcesIntSliceBuilder(this, item);
    }
    V1alpha2NamedResourcesIntSliceBuilder builder;
    
    public N and() {
      return (N) V1alpha2NamedResourcesAttributeFluent.this.withIntSlice(builder.build());
    }
    
    public N endIntSlice() {
      return and();
    }
    
  
  }
  public class StringSliceNested<N> extends V1alpha2NamedResourcesStringSliceFluent<StringSliceNested<N>> implements Nested<N>{
    StringSliceNested(V1alpha2NamedResourcesStringSlice item) {
      this.builder = new V1alpha2NamedResourcesStringSliceBuilder(this, item);
    }
    V1alpha2NamedResourcesStringSliceBuilder builder;
    
    public N and() {
      return (N) V1alpha2NamedResourcesAttributeFluent.this.withStringSlice(builder.build());
    }
    
    public N endStringSlice() {
      return and();
    }
    
  
  }

}