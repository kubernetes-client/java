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
public class V1GroupResourceFluent<A extends io.kubernetes.client.openapi.models.V1GroupResourceFluent<A>> extends BaseFluent<A>{

  private String group;
  private String resource;

  public V1GroupResourceFluent() {
  }
  
  public V1GroupResourceFluent(V1GroupResource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1GroupResource instance) {
    instance = instance != null ? instance : new V1GroupResource();
    if (instance != null) {
        this.withGroup(instance.getGroup());
        this.withResource(instance.getResource());
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
    V1GroupResourceFluent that = (V1GroupResourceFluent) o;
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public int hashCode() {
    return Objects.hash(group, resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
}