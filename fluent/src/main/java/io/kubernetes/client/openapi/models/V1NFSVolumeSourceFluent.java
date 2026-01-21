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
public class V1NFSVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String path;
  private Boolean readOnly;
  private String server;

  public V1NFSVolumeSourceFluent() {
  }
  
  public V1NFSVolumeSourceFluent(V1NFSVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NFSVolumeSource instance) {
    instance = instance != null ? instance : new V1NFSVolumeSource();
    if (instance != null) {
        this.withPath(instance.getPath());
        this.withReadOnly(instance.getReadOnly());
        this.withServer(instance.getServer());
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
    V1NFSVolumeSourceFluent that = (V1NFSVolumeSourceFluent) o;
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(server, that.server))) {
      return false;
    }
    return true;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getServer() {
    return this.server;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasServer() {
    return this.server != null;
  }
  
  public int hashCode() {
    return Objects.hash(path, readOnly, server);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(server == null)) {
        sb.append("server:");
        sb.append(server);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withServer(String server) {
    this.server = server;
    return (A) this;
  }
  
}