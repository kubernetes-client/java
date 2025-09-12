package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ConfigMapEnvSourceFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<A>> extends BaseFluent<A>{
  public V1ConfigMapEnvSourceFluent() {
  }
  
  public V1ConfigMapEnvSourceFluent(V1ConfigMapEnvSource instance) {
    this.copyInstance(instance);
  }
  private String name;
  private Boolean optional;
  
  protected void copyInstance(V1ConfigMapEnvSource instance) {
    instance = instance != null ? instance : new V1ConfigMapEnvSource();
    if (instance != null) {
        this.withName(instance.getName());
        this.withOptional(instance.getOptional());
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
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
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
    V1ConfigMapEnvSourceFluent that = (V1ConfigMapEnvSourceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(optional, that.optional))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(name, optional);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(optional == null)) {
        sb.append("optional:");
        sb.append(optional);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  

}