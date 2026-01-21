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
public class V1SysctlFluent<A extends io.kubernetes.client.openapi.models.V1SysctlFluent<A>> extends BaseFluent<A>{

  private String name;
  private String value;

  public V1SysctlFluent() {
  }
  
  public V1SysctlFluent(V1Sysctl instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1Sysctl instance) {
    instance = instance != null ? instance : new V1Sysctl();
    if (instance != null) {
        this.withName(instance.getName());
        this.withValue(instance.getValue());
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
    V1SysctlFluent that = (V1SysctlFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withValue(String value) {
    this.value = value;
    return (A) this;
  }
  
}