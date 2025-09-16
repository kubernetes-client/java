package io.kubernetes.client.openapi.models;

import java.lang.Integer;
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
public class ApiextensionsV1ServiceReferenceFluent<A extends io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReferenceFluent<A>> extends BaseFluent<A>{
  public ApiextensionsV1ServiceReferenceFluent() {
  }
  
  public ApiextensionsV1ServiceReferenceFluent(ApiextensionsV1ServiceReference instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String namespace;
  private String path;
  private Integer port;
  
  protected void copyInstance(ApiextensionsV1ServiceReference instance) {
    instance = instance != null ? instance : new ApiextensionsV1ServiceReference();
    if (instance != null) {
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
        this.withPath(instance.getPath());
        this.withPort(instance.getPort());
    }
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
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
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
  
  public Integer getPort() {
    return this.port;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
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
    ApiextensionsV1ServiceReferenceFluent that = (ApiextensionsV1ServiceReferenceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(name, namespace, path, port);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
  

}