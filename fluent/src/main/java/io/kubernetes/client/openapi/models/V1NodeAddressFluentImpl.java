package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1NodeAddressFluentImpl<A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>{
  public V1NodeAddressFluentImpl() {
  }
  public V1NodeAddressFluentImpl(io.kubernetes.client.openapi.models.V1NodeAddress instance) {
    this.withAddress(instance.getAddress());

    this.withType(instance.getType());

  }
  private java.lang.String address;
  private io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type;
  public java.lang.String getAddress() {
    return this.address;
  }
  public A withAddress(java.lang.String address) {
    this.address=address; return (A) this;
  }
  public java.lang.Boolean hasAddress() {
    return this.address != null;
  }
  
  /**
   * Method is deprecated. use withAddress instead.
   */
  @java.lang.Deprecated
  public A withNewAddress(java.lang.String original) {
    return (A)withAddress(new String(original));
  }
  public io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum getType() {
    return this.type;
  }
  public A withType(io.kubernetes.client.openapi.models.V1NodeAddress.TypeEnum type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(java.lang.Object o) {
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
  
}