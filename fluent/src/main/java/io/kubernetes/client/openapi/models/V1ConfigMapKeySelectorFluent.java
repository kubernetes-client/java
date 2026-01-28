package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ConfigMapKeySelectorFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<A>> extends BaseFluent<A>{

  private String key;
  private String name;
  private Boolean optional;

  public V1ConfigMapKeySelectorFluent() {
  }
  
  public V1ConfigMapKeySelectorFluent(V1ConfigMapKeySelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ConfigMapKeySelector instance) {
    instance = instance != null ? instance : new V1ConfigMapKeySelector();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withName(instance.getName());
        this.withOptional(instance.getOptional());
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
    V1ConfigMapKeySelectorFluent that = (V1ConfigMapKeySelectorFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(optional, that.optional))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
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
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
}