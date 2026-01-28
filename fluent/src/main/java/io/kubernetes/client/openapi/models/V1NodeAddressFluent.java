package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeAddressFluent<A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>> extends BaseFluent<A>{

  private String address;
  private String type;

  public V1NodeAddressFluent() {
  }
  
  public V1NodeAddressFluent(V1NodeAddress instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NodeAddress instance) {
    instance = instance != null ? instance : new V1NodeAddress();
    if (instance != null) {
        this.withAddress(instance.getAddress());
        this.withType(instance.getType());
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
    V1NodeAddressFluent that = (V1NodeAddressFluent) o;
    if (!(Objects.equals(address, that.address))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasAddress() {
    return this.address != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(address, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(address == null)) {
        sb.append("address:");
        sb.append(address);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAddress(String address) {
    this.address = address;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}