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
public class V1TypedLocalObjectReferenceFluent<A extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<A>> extends BaseFluent<A>{
  public V1TypedLocalObjectReferenceFluent() {
  }
  
  public V1TypedLocalObjectReferenceFluent(V1TypedLocalObjectReference instance) {
    this.copyInstance(instance);
  }
  private String apiGroup;
  private String kind;
  private String name;
  
  protected void copyInstance(V1TypedLocalObjectReference instance) {
    instance = instance != null ? instance : new V1TypedLocalObjectReference();
    if (instance != null) {
        this.withApiGroup(instance.getApiGroup());
        this.withKind(instance.getKind());
        this.withName(instance.getName());
    }
  }
  
  public String getApiGroup() {
    return this.apiGroup;
  }
  
  public A withApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }
  
  public boolean hasApiGroup() {
    return this.apiGroup != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
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
    V1TypedLocalObjectReferenceFluent that = (V1TypedLocalObjectReferenceFluent) o;
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
  

}