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
public class V1NonResourceAttributesFluent<A extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<A>> extends BaseFluent<A>{

  private String path;
  private String verb;

  public V1NonResourceAttributesFluent() {
  }
  
  public V1NonResourceAttributesFluent(V1NonResourceAttributes instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NonResourceAttributes instance) {
    instance = instance != null ? instance : new V1NonResourceAttributes();
    if (instance != null) {
        this.withPath(instance.getPath());
        this.withVerb(instance.getVerb());
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
    V1NonResourceAttributesFluent that = (V1NonResourceAttributesFluent) o;
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(verb, that.verb))) {
      return false;
    }
    return true;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getVerb() {
    return this.verb;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasVerb() {
    return this.verb != null;
  }
  
  public int hashCode() {
    return Objects.hash(path, verb);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(verb == null)) {
        sb.append("verb:");
        sb.append(verb);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withVerb(String verb) {
    this.verb = verb;
    return (A) this;
  }
  
}