package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1beta2FlowDistinguisherMethodFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<A>{
  public V1beta2FlowDistinguisherMethodFluentImpl() {
  }
  public V1beta2FlowDistinguisherMethodFluentImpl(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance) {
    this.withType(instance.getType());

  }
  private java.lang.String type;
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original) {
    return (A)withType(new String(original));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2FlowDistinguisherMethodFluentImpl that = (V1beta2FlowDistinguisherMethodFluentImpl) o;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(type,  super.hashCode());
  }
  
}