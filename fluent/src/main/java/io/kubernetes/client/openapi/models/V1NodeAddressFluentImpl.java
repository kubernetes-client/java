package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NodeAddressFluentImpl<A extends V1NodeAddressFluent<A>> extends BaseFluent<A> implements V1NodeAddressFluent<A>{
  public V1NodeAddressFluentImpl() {
  }
  public V1NodeAddressFluentImpl(V1NodeAddress instance) {
    this.withAddress(instance.getAddress());

    this.withType(instance.getType());

  }
  private String address;
  private String type;
  public String getAddress() {
    return this.address;
  }
  public A withAddress(String address) {
    this.address=address; return (A) this;
  }
  public Boolean hasAddress() {
    return this.address != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeAddressFluentImpl that = (V1NodeAddressFluentImpl) o;
    if (address != null ? !address.equals(that.address) :that.address != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(address,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (address != null) { sb.append("address:"); sb.append(address + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}