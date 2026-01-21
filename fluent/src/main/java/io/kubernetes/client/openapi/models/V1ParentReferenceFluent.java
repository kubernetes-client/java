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
public class V1ParentReferenceFluent<A extends io.kubernetes.client.openapi.models.V1ParentReferenceFluent<A>> extends BaseFluent<A>{

  private String group;
  private String name;
  private String namespace;
  private String resource;

  public V1ParentReferenceFluent() {
  }
  
  public V1ParentReferenceFluent(V1ParentReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ParentReference instance) {
    instance = instance != null ? instance : new V1ParentReference();
    if (instance != null) {
        this.withGroup(instance.getGroup());
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
        this.withResource(instance.getResource());
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
    V1ParentReferenceFluent that = (V1ParentReferenceFluent) o;
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public int hashCode() {
    return Objects.hash(group, name, namespace, resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
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
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
}