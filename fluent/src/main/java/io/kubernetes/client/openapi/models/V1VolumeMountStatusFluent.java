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
public class V1VolumeMountStatusFluent<A extends io.kubernetes.client.openapi.models.V1VolumeMountStatusFluent<A>> extends BaseFluent<A>{

  private String mountPath;
  private String name;
  private Boolean readOnly;
  private String recursiveReadOnly;

  public V1VolumeMountStatusFluent() {
  }
  
  public V1VolumeMountStatusFluent(V1VolumeMountStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1VolumeMountStatus instance) {
    instance = instance != null ? instance : new V1VolumeMountStatus();
    if (instance != null) {
        this.withMountPath(instance.getMountPath());
        this.withName(instance.getName());
        this.withReadOnly(instance.getReadOnly());
        this.withRecursiveReadOnly(instance.getRecursiveReadOnly());
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
    V1VolumeMountStatusFluent that = (V1VolumeMountStatusFluent) o;
    if (!(Objects.equals(mountPath, that.mountPath))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(recursiveReadOnly, that.recursiveReadOnly))) {
      return false;
    }
    return true;
  }
  
  public String getMountPath() {
    return this.mountPath;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getRecursiveReadOnly() {
    return this.recursiveReadOnly;
  }
  
  public boolean hasMountPath() {
    return this.mountPath != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasRecursiveReadOnly() {
    return this.recursiveReadOnly != null;
  }
  
  public int hashCode() {
    return Objects.hash(mountPath, name, readOnly, recursiveReadOnly);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(mountPath == null)) {
        sb.append("mountPath:");
        sb.append(mountPath);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(recursiveReadOnly == null)) {
        sb.append("recursiveReadOnly:");
        sb.append(recursiveReadOnly);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMountPath(String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return (A) this;
  }
  
}