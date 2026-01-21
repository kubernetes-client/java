package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1DeviceAttributeFluent<A extends io.kubernetes.client.openapi.models.V1DeviceAttributeFluent<A>> extends BaseFluent<A>{

  private Long _int;
  private Boolean bool;
  private String string;
  private String version;

  public V1DeviceAttributeFluent() {
  }
  
  public V1DeviceAttributeFluent(V1DeviceAttribute instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1DeviceAttribute instance) {
    instance = instance != null ? instance : new V1DeviceAttribute();
    if (instance != null) {
        this.withBool(instance.getBool());
        this.withInt(instance.getInt());
        this.withString(instance.getString());
        this.withVersion(instance.getVersion());
    }
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
    V1DeviceAttributeFluent that = (V1DeviceAttributeFluent) o;
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
  
  public Boolean getBool() {
    return this.bool;
  }
  
  public Long getInt() {
    return this._int;
  }
  
  public String getString() {
    return this.string;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean hasBool() {
    return this.bool != null;
  }
  
  public boolean hasInt() {
    return this._int != null;
  }
  
  public boolean hasString() {
    return this.string != null;
  }
  
  public boolean hasVersion() {
    return this.version != null;
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
  
  public A withBool(Boolean bool) {
    this.bool = bool;
    return (A) this;
  }
  
  public A withInt(Long _int) {
    this._int = _int;
    return (A) this;
  }
  
  public A withString(String string) {
    this.string = string;
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
}