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
public class V1RoleRefFluent<A extends io.kubernetes.client.openapi.models.V1RoleRefFluent<A>> extends BaseFluent<A>{

  private String apiGroup;
  private String kind;
  private String name;

  public V1RoleRefFluent() {
  }
  
  public V1RoleRefFluent(V1RoleRef instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1RoleRef instance) {
    instance = instance != null ? instance : new V1RoleRef();
    if (instance != null) {
        this.withApiGroup(instance.getApiGroup());
        this.withKind(instance.getKind());
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
    V1RoleRefFluent that = (V1RoleRefFluent) o;
    if (!(Objects.equals(apiGroup, that.apiGroup))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
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
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiGroup, kind, name);
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
  
}