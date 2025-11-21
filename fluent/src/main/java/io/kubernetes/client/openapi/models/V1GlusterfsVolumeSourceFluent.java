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
public class V1GlusterfsVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String endpoints;
  private String path;
  private Boolean readOnly;

  public V1GlusterfsVolumeSourceFluent() {
  }
  
  public V1GlusterfsVolumeSourceFluent(V1GlusterfsVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1GlusterfsVolumeSource instance) {
    instance = instance != null ? instance : new V1GlusterfsVolumeSource();
    if (instance != null) {
        this.withEndpoints(instance.getEndpoints());
        this.withPath(instance.getPath());
        this.withReadOnly(instance.getReadOnly());
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
    V1GlusterfsVolumeSourceFluent that = (V1GlusterfsVolumeSourceFluent) o;
    if (!(Objects.equals(endpoints, that.endpoints))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    return true;
  }
  
  public String getEndpoints() {
    return this.endpoints;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public boolean hasEndpoints() {
    return this.endpoints != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public int hashCode() {
    return Objects.hash(endpoints, path, readOnly);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(endpoints == null)) {
        sb.append("endpoints:");
        sb.append(endpoints);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withEndpoints(String endpoints) {
    this.endpoints = endpoints;
    return (A) this;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
}