package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServiceBackendPortFluent<A extends V1ServiceBackendPortFluent<A>> extends BaseFluent<A>{
  public V1ServiceBackendPortFluent() {
  }
  
  public V1ServiceBackendPortFluent(V1ServiceBackendPort instance) {
    this.copyInstance(instance);
  }
  private String name;
  private Integer number;
  
  protected void copyInstance(V1ServiceBackendPort instance) {
    instance = (instance != null ? instance : new V1ServiceBackendPort());
    if (instance != null) {
          this.withName(instance.getName());
          this.withNumber(instance.getNumber());
        }
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
  
  public Integer getNumber() {
    return this.number;
  }
  
  public A withNumber(Integer number) {
    this.number = number;
    return (A) this;
  }
  
  public boolean hasNumber() {
    return this.number != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceBackendPortFluent that = (V1ServiceBackendPortFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(number, that.number)) return false;
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