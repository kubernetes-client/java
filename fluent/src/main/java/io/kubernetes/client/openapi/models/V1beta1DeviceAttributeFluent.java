package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1DeviceAttributeFluent<A extends io.kubernetes.client.openapi.models.V1beta1DeviceAttributeFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceAttributeFluent() {
  }
  
  public V1beta1DeviceAttributeFluent(V1beta1DeviceAttribute instance) {
    this.copyInstance(instance);
  }
  private Boolean bool;
  private Long _int;
  private String string;
  private String version;
  
  protected void copyInstance(V1beta1DeviceAttribute instance) {
    instance = instance != null ? instance : new V1beta1DeviceAttribute();
    if (instance != null) {
        this.withBool(instance.getBool());
        this.withInt(instance.getInt());
        this.withString(instance.getString());
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1beta1DeviceAttributeFluent that = (V1beta1DeviceAttributeFluent) o;
    if (!(Objects.equals(bool, that.bool))) {
      return false;
    }
    if (!(Objects.equals(_int, that._int))) {
      return false;
    }
    if (!(Objects.equals(string, that.string))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(bool, _int, string, version);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(bool == null)) {
        sb.append("bool:");
        sb.append(bool);
        sb.append(",");
    }
    if (!(_int == null)) {
        sb.append("_int:");
        sb.append(_int);
        sb.append(",");
    }
    if (!(string == null)) {
        sb.append("string:");
        sb.append(string);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withBool() {
    return withBool(true);
  }
  

}