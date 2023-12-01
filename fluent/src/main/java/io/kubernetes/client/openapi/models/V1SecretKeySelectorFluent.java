package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SecretKeySelectorFluent<A extends V1SecretKeySelectorFluent<A>> extends BaseFluent<A>{
  public V1SecretKeySelectorFluent() {
  }
  
  public V1SecretKeySelectorFluent(V1SecretKeySelector instance) {
    this.copyInstance(instance);
  }
  private String key;
  private String name;
  private Boolean optional;
  
  protected void copyInstance(V1SecretKeySelector instance) {
    instance = (instance != null ? instance : new V1SecretKeySelector());
    if (instance != null) {
          this.withKey(instance.getKey());
          this.withName(instance.getName());
          this.withOptional(instance.getOptional());
        }
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SecretKeySelectorFluent that = (V1SecretKeySelectorFluent) o;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(optional, that.optional)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(key,  name,  optional,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (optional != null) { sb.append("optional:"); sb.append(optional); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  

}