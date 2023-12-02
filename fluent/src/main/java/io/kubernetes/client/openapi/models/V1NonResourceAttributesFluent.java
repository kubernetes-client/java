package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NonResourceAttributesFluent<A extends V1NonResourceAttributesFluent<A>> extends BaseFluent<A>{
  public V1NonResourceAttributesFluent() {
  }
  
  public V1NonResourceAttributesFluent(V1NonResourceAttributes instance) {
    this.copyInstance(instance);
  }
  private String path;
  private String verb;
  
  protected void copyInstance(V1NonResourceAttributes instance) {
    instance = (instance != null ? instance : new V1NonResourceAttributes());
    if (instance != null) {
          this.withPath(instance.getPath());
          this.withVerb(instance.getVerb());
        }
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public String getVerb() {
    return this.verb;
  }
  
  public A withVerb(String verb) {
    this.verb = verb;
    return (A) this;
  }
  
  public boolean hasVerb() {
    return this.verb != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NonResourceAttributesFluent that = (V1NonResourceAttributesFluent) o;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(verb, that.verb)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(path,  verb,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (verb != null) { sb.append("verb:"); sb.append(verb); }
    sb.append("}");
    return sb.toString();
  }
  

}