package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FileKeySelectorFluent<A extends io.kubernetes.client.openapi.models.V1FileKeySelectorFluent<A>> extends BaseFluent<A>{
  public V1FileKeySelectorFluent() {
  }
  
  public V1FileKeySelectorFluent(V1FileKeySelector instance) {
    this.copyInstance(instance);
  }
  private String key;
  private Boolean optional;
  private String path;
  private String volumeName;
  
  protected void copyInstance(V1FileKeySelector instance) {
    instance = instance != null ? instance : new V1FileKeySelector();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withOptional(instance.getOptional());
        this.withPath(instance.getPath());
        this.withVolumeName(instance.getVolumeName());
    }
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public Boolean getOptional() {
    return this.optional;
  }
  
  public A withOptional(Boolean optional) {
    this.optional = optional;
    return (A) this;
  }
  
  public boolean hasOptional() {
    return this.optional != null;
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
  
  public String getVolumeName() {
    return this.volumeName;
  }
  
  public A withVolumeName(String volumeName) {
    this.volumeName = volumeName;
    return (A) this;
  }
  
  public boolean hasVolumeName() {
    return this.volumeName != null;
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
  
  public A withOptional() {
    return withOptional(true);
  }
  

}