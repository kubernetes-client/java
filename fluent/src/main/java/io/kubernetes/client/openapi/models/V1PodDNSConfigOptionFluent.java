package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodDNSConfigOptionFluent<A extends V1PodDNSConfigOptionFluent<A>> extends BaseFluent<A>{
  public V1PodDNSConfigOptionFluent() {
  }
  
  public V1PodDNSConfigOptionFluent(V1PodDNSConfigOption instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String value;
  
  protected void copyInstance(V1PodDNSConfigOption instance) {
    instance = (instance != null ? instance : new V1PodDNSConfigOption());
    if (instance != null) {
          this.withName(instance.getName());
          this.withValue(instance.getValue());
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
  
  public String getValue() {
    return this.value;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDNSConfigOptionFluent that = (V1PodDNSConfigOptionFluent) o;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(name,  value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}