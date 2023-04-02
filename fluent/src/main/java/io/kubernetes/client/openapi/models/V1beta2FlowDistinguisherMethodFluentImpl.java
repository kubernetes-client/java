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
  public class V1beta2FlowDistinguisherMethodFluentImpl<A extends V1beta2FlowDistinguisherMethodFluent<A>> extends BaseFluent<A> implements V1beta2FlowDistinguisherMethodFluent<A>{
  public V1beta2FlowDistinguisherMethodFluentImpl() {
  }
  public V1beta2FlowDistinguisherMethodFluentImpl(V1beta2FlowDistinguisherMethod instance) {
    this.withType(instance.getType());

  }
  private String type;
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
    V1beta2FlowDistinguisherMethodFluentImpl that = (V1beta2FlowDistinguisherMethodFluentImpl) o;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  
}