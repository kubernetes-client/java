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
public class V1ForZoneFluent<A extends io.kubernetes.client.openapi.models.V1ForZoneFluent<A>> extends BaseFluent<A>{

  private String name;

  public V1ForZoneFluent() {
  }
  
  public V1ForZoneFluent(V1ForZone instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ForZone instance) {
    instance = instance != null ? instance : new V1ForZone();
    if (instance != null) {
      this.withName(instance.getName());
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
    V1ForZoneFluent that = (V1ForZoneFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}