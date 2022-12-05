package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ServiceBackendPortFluentImpl<A extends V1ServiceBackendPortFluent<A>> extends BaseFluent<A> implements V1ServiceBackendPortFluent<A>{
  public V1ServiceBackendPortFluentImpl() {
  }
  public V1ServiceBackendPortFluentImpl(V1ServiceBackendPort instance) {
    this.withName(instance.getName());

    this.withNumber(instance.getNumber());

  }
  private String name;
  private Integer number;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Integer getNumber() {
    return this.number;
  }
  public A withNumber(Integer number) {
    this.number=number; return (A) this;
  }
  public Boolean hasNumber() {
    return this.number != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceBackendPortFluentImpl that = (V1ServiceBackendPortFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (number != null ? !number.equals(that.number) :that.number != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  number,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (number != null) { sb.append("number:"); sb.append(number); }
    sb.append("}");
    return sb.toString();
  }
  
}