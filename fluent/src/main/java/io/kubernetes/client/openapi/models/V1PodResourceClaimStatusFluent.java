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
public class V1PodResourceClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1PodResourceClaimStatusFluent<A>> extends BaseFluent<A>{

  private String name;
  private String resourceClaimName;

  public V1PodResourceClaimStatusFluent() {
  }
  
  public V1PodResourceClaimStatusFluent(V1PodResourceClaimStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1PodResourceClaimStatus();
    if (instance != null) {
        this.withName(instance.getName());
        this.withResourceClaimName(instance.getResourceClaimName());
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
    V1PodResourceClaimStatusFluent that = (V1PodResourceClaimStatusFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, resourceClaimName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resourceClaimName == null)) {
        sb.append("resourceClaimName:");
        sb.append(resourceClaimName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  
}