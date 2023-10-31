package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta3FlowDistinguisherMethodFluent<A extends V1beta3FlowDistinguisherMethodFluent<A>> extends BaseFluent<A>{
  public V1beta3FlowDistinguisherMethodFluent() {
  }
  
  public V1beta3FlowDistinguisherMethodFluent(V1beta3FlowDistinguisherMethod instance) {
    this.copyInstance(instance);
  }
  private String type;
  
  protected void copyInstance(V1beta3FlowDistinguisherMethod instance) {
    instance = (instance != null ? instance : new V1beta3FlowDistinguisherMethod());
    if (instance != null) {
          this.withType(instance.getType());
        }
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3FlowDistinguisherMethodFluent that = (V1beta3FlowDistinguisherMethodFluent) o;
    if (!java.util.Objects.equals(type, that.type)) return false;
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