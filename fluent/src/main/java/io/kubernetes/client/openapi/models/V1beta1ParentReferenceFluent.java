package io.kubernetes.client.openapi.models;

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
public class V1beta1ParentReferenceFluent<A extends io.kubernetes.client.openapi.models.V1beta1ParentReferenceFluent<A>> extends BaseFluent<A>{
  public V1beta1ParentReferenceFluent() {
  }
  
  public V1beta1ParentReferenceFluent(V1beta1ParentReference instance) {
    this.copyInstance(instance);
  }
  private String group;
  private String name;
  private String namespace;
  private String resource;
  
  protected void copyInstance(V1beta1ParentReference instance) {
    instance = instance != null ? instance : new V1beta1ParentReference();
    if (instance != null) {
        this.withGroup(instance.getGroup());
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
        this.withResource(instance.getResource());
    }
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
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
  
  public String getResource() {
    return this.resource;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
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
    V1beta1ParentReferenceFluent that = (V1beta1ParentReferenceFluent) o;
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
  

}