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
public class V1LocalVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1LocalVolumeSourceFluent() {
  }
  
  public V1LocalVolumeSourceFluent(V1LocalVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String path;
  
  protected void copyInstance(V1LocalVolumeSource instance) {
    instance = instance != null ? instance : new V1LocalVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withPath(instance.getPath());
    }
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
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
    V1LocalVolumeSourceFluent that = (V1LocalVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, path);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
    }
    sb.append("}");
    return sb.toString();
  }
  

}