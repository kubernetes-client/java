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
public class V1AttachedVolumeFluent<A extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<A>> extends BaseFluent<A>{

  private String devicePath;
  private String name;

  public V1AttachedVolumeFluent() {
  }
  
  public V1AttachedVolumeFluent(V1AttachedVolume instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1AttachedVolume instance) {
    instance = instance != null ? instance : new V1AttachedVolume();
    if (instance != null) {
        this.withDevicePath(instance.getDevicePath());
        this.withName(instance.getName());
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
    V1AttachedVolumeFluent that = (V1AttachedVolumeFluent) o;
    if (!(Objects.equals(devicePath, that.devicePath))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getDevicePath() {
    return this.devicePath;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasDevicePath() {
    return this.devicePath != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(devicePath == null)) {
        sb.append("devicePath:");
        sb.append(devicePath);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDevicePath(String devicePath) {
    this.devicePath = devicePath;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}