package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AttachedVolumeFluent<A extends V1AttachedVolumeFluent<A>> extends BaseFluent<A>{
  public V1AttachedVolumeFluent() {
  }
  
  public V1AttachedVolumeFluent(V1AttachedVolume instance) {
    this.copyInstance(instance);
  }
  private String devicePath;
  private String name;
  
  protected void copyInstance(V1AttachedVolume instance) {
    instance = (instance != null ? instance : new V1AttachedVolume());
    if (instance != null) {
          this.withDevicePath(instance.getDevicePath());
          this.withName(instance.getName());
        }
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public A withDevicePath(String devicePath) {
    this.devicePath = devicePath;
    return (A) this;
  }
  
  public boolean hasDevicePath() {
    return this.devicePath != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AttachedVolumeFluent that = (V1AttachedVolumeFluent) o;
    if (!java.util.Objects.equals(devicePath, that.devicePath)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(devicePath,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (devicePath != null) { sb.append("devicePath:"); sb.append(devicePath + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  

}