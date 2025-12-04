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
public class V1PodResourceClaimFluent<A extends io.kubernetes.client.openapi.models.V1PodResourceClaimFluent<A>> extends BaseFluent<A>{

  private String name;
  private String resourceClaimName;
  private String resourceClaimTemplateName;

  public V1PodResourceClaimFluent() {
  }
  
  public V1PodResourceClaimFluent(V1PodResourceClaim instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodResourceClaim instance) {
    instance = instance != null ? instance : new V1PodResourceClaim();
    if (instance != null) {
        this.withName(instance.getName());
        this.withResourceClaimName(instance.getResourceClaimName());
        this.withResourceClaimTemplateName(instance.getResourceClaimTemplateName());
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
    V1PodResourceClaimFluent that = (V1PodResourceClaimFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimName, that.resourceClaimName))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimTemplateName, that.resourceClaimTemplateName))) {
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
  
  public String getResourceClaimTemplateName() {
    return this.resourceClaimTemplateName;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public boolean hasResourceClaimTemplateName() {
    return this.resourceClaimTemplateName != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, resourceClaimName, resourceClaimTemplateName);
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
        sb.append(",");
    }
    if (!(resourceClaimTemplateName == null)) {
        sb.append("resourceClaimTemplateName:");
        sb.append(resourceClaimTemplateName);
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
  
  public A withResourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return (A) this;
  }
  
}