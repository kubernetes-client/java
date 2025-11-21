package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1KeyToPathFluent<A extends io.kubernetes.client.openapi.models.V1KeyToPathFluent<A>> extends BaseFluent<A>{

  private String key;
  private Integer mode;
  private String path;

  public V1KeyToPathFluent() {
  }
  
  public V1KeyToPathFluent(V1KeyToPath instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1KeyToPath instance) {
    instance = instance != null ? instance : new V1KeyToPath();
    if (instance != null) {
        this.withKey(instance.getKey());
        this.withMode(instance.getMode());
        this.withPath(instance.getPath());
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
    V1KeyToPathFluent that = (V1KeyToPathFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(mode, that.mode))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public Integer getMode() {
    return this.mode;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasMode() {
    return this.mode != null;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public int hashCode() {
    return Objects.hash(key, mode, path);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(mode == null)) {
        sb.append("mode:");
        sb.append(mode);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withMode(Integer mode) {
    this.mode = mode;
    return (A) this;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
}