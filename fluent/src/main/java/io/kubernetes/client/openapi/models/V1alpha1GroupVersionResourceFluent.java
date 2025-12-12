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
public class V1alpha1GroupVersionResourceFluent<A extends io.kubernetes.client.openapi.models.V1alpha1GroupVersionResourceFluent<A>> extends BaseFluent<A>{

  private String group;
  private String resource;
  private String version;

  public V1alpha1GroupVersionResourceFluent() {
  }
  
  public V1alpha1GroupVersionResourceFluent(V1alpha1GroupVersionResource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha1GroupVersionResource instance) {
    instance = instance != null ? instance : new V1alpha1GroupVersionResource();
    if (instance != null) {
        this.withGroup(instance.getGroup());
        this.withResource(instance.getResource());
        this.withVersion(instance.getVersion());
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
    V1alpha1GroupVersionResourceFluent that = (V1alpha1GroupVersionResourceFluent) o;
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
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
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public int hashCode() {
    return Objects.hash(group, resource, version);
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
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
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
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
}