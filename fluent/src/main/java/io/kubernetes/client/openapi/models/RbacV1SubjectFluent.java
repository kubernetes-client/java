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
public class RbacV1SubjectFluent<A extends io.kubernetes.client.openapi.models.RbacV1SubjectFluent<A>> extends BaseFluent<A>{

  private String apiGroup;
  private String kind;
  private String name;
  private String namespace;

  public RbacV1SubjectFluent() {
  }
  
  public RbacV1SubjectFluent(RbacV1Subject instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(RbacV1Subject instance) {
    instance = instance != null ? instance : new RbacV1Subject();
    if (instance != null) {
        this.withApiGroup(instance.getApiGroup());
        this.withKind(instance.getKind());
        this.withName(instance.getName());
        this.withNamespace(instance.getNamespace());
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
    RbacV1SubjectFluent that = (RbacV1SubjectFluent) o;
    if (!(Objects.equals(apiGroup, that.apiGroup))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    return true;
  }
  
  public String getApiGroup() {
    return this.apiGroup;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name, namespace);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiGroup == null)) {
        sb.append("apiGroup:");
        sb.append(apiGroup);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
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
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
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
  
}