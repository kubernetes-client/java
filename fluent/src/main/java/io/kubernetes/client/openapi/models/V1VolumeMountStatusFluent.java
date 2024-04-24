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
public class V1VolumeMountStatusFluent<A extends V1VolumeMountStatusFluent<A>> extends BaseFluent<A>{
  public V1VolumeMountStatusFluent() {
  }
  
  public V1VolumeMountStatusFluent(V1VolumeMountStatus instance) {
    this.copyInstance(instance);
  }
  private String mountPath;
  private String name;
  private Boolean readOnly;
  private String recursiveReadOnly;
  
  protected void copyInstance(V1VolumeMountStatus instance) {
    instance = (instance != null ? instance : new V1VolumeMountStatus());
    if (instance != null) {
          this.withMountPath(instance.getMountPath());
          this.withName(instance.getName());
          this.withReadOnly(instance.getReadOnly());
          this.withRecursiveReadOnly(instance.getRecursiveReadOnly());
        }
  }
  
  public String getMountPath() {
    return this.mountPath;
  }
  
  public A withMountPath(String mountPath) {
    this.mountPath = mountPath;
    return (A) this;
  }
  
  public boolean hasMountPath() {
    return this.mountPath != null;
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
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public String getRecursiveReadOnly() {
    return this.recursiveReadOnly;
  }
  
  public A withRecursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return (A) this;
  }
  
  public boolean hasRecursiveReadOnly() {
    return this.recursiveReadOnly != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeMountStatusFluent that = (V1VolumeMountStatusFluent) o;
    if (!java.util.Objects.equals(mountPath, that.mountPath)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(recursiveReadOnly, that.recursiveReadOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(mountPath,  name,  readOnly,  recursiveReadOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (mountPath != null) { sb.append("mountPath:"); sb.append(mountPath + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (recursiveReadOnly != null) { sb.append("recursiveReadOnly:"); sb.append(recursiveReadOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}