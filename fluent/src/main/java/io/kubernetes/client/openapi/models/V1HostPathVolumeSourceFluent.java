package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HostPathVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1HostPathVolumeSourceFluent() {
  }
  
  public V1HostPathVolumeSourceFluent(V1HostPathVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String path;
  private String type;
  
  protected void copyInstance(V1HostPathVolumeSource instance) {
    instance = instance != null ? instance : new V1HostPathVolumeSource();
    if (instance != null) {
        this.withPath(instance.getPath());
        this.withType(instance.getType());
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
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
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
    V1HostPathVolumeSourceFluent that = (V1HostPathVolumeSourceFluent) o;
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(path, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  

}