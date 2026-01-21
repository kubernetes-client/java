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
public class ApiregistrationV1ServiceReferenceFluent<A extends io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReferenceFluent<A>> extends BaseFluent<A>{

  private String name;
  private String namespace;
  private Integer port;

  public ApiregistrationV1ServiceReferenceFluent() {
  }
  
  public ApiregistrationV1ServiceReferenceFluent(ApiregistrationV1ServiceReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(ApiregistrationV1ServiceReference instance) {
    instance = instance != null ? instance : new ApiregistrationV1ServiceReference();
    if (instance != null) {
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
        this.withPort(instance.getPort());
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
    ApiregistrationV1ServiceReferenceFluent that = (ApiregistrationV1ServiceReferenceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, namespace, port);
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
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
}