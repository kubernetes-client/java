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
public class V1FileKeySelectorFluent<A extends io.kubernetes.client.openapi.models.V1FileKeySelectorFluent<A>> extends BaseFluent<A>{

  private String key;
  private Boolean optional;
  private String path;
  private String volumeName;

  public V1FileKeySelectorFluent() {
  }
  
  public V1FileKeySelectorFluent(V1FileKeySelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1FileKeySelector instance) {
    instance = instance != null ? instance : new V1FileKeySelector();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withOptional(instance.getOptional());
        this.withPath(instance.getPath());
        this.withVolumeName(instance.getVolumeName());
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
    V1FileKeySelectorFluent that = (V1FileKeySelectorFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(optional, that.optional))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(volumeName, that.volumeName))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
  }
  
  public int hashCode() {
    return Objects.hash(key, optional, path, volumeName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(optional == null)) {
        sb.append("optional:");
        sb.append(optional);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(volumeName == null)) {
        sb.append("volumeName:");
        sb.append(volumeName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withOptional() {
    return withOptional(true);
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
}