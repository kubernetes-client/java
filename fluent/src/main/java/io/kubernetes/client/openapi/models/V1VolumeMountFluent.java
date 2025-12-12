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
public class V1VolumeMountFluent<A extends io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>> extends BaseFluent<A>{

  private String mountPath;
  private String mountPropagation;
  private String name;
  private Boolean readOnly;
  private String recursiveReadOnly;
  private String subPath;
  private String subPathExpr;

  public V1VolumeMountFluent() {
  }
  
  public V1VolumeMountFluent(V1VolumeMount instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1VolumeMount instance) {
    instance = instance != null ? instance : new V1VolumeMount();
    if (instance != null) {
        this.withMountPath(instance.getMountPath());
        this.withMountPropagation(instance.getMountPropagation());
        this.withName(instance.getName());
        this.withReadOnly(instance.getReadOnly());
        this.withRecursiveReadOnly(instance.getRecursiveReadOnly());
        this.withSubPath(instance.getSubPath());
        this.withSubPathExpr(instance.getSubPathExpr());
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
    V1VolumeMountFluent that = (V1VolumeMountFluent) o;
    if (!(Objects.equals(mountPath, that.mountPath))) {
      return false;
    }
    if (!(Objects.equals(mountPropagation, that.mountPropagation))) {
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
    if (!(Objects.equals(subPath, that.subPath))) {
      return false;
    }
    if (!(Objects.equals(subPathExpr, that.subPathExpr))) {
      return false;
    }
    return true;
  }
  
  public String getMountPath() {
    return this.mountPath;
  }
  
  public String getMountPropagation() {
    return this.mountPropagation;
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
  
  public String getSubPath() {
    return this.subPath;
  }
  
  public String getSubPathExpr() {
    return this.subPathExpr;
  }
  
  public boolean hasMountPath() {
    return this.mountPath != null;
  }
  
  public boolean hasMountPropagation() {
    return this.mountPropagation != null;
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
  
  public boolean hasSubPath() {
    return this.subPath != null;
  }
  
  public boolean hasSubPathExpr() {
    return this.subPathExpr != null;
  }
  
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, recursiveReadOnly, subPath, subPathExpr);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(mountPath == null)) {
        sb.append("mountPath:");
        sb.append(mountPath);
        sb.append(",");
    }
    if (!(mountPropagation == null)) {
        sb.append("mountPropagation:");
        sb.append(mountPropagation);
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
        sb.append(",");
    }
    if (!(subPath == null)) {
        sb.append("subPath:");
        sb.append(subPath);
        sb.append(",");
    }
    if (!(subPathExpr == null)) {
        sb.append("subPathExpr:");
        sb.append(subPathExpr);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMountPath(String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }
  
  public A withMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
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
  
  public A withSubPath(String subPath) {
    this.subPath = subPath;
    return (A) this;
  }
  
  public A withSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return (A) this;
  }
  
}