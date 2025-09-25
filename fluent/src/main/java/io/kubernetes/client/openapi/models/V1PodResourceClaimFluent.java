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
public class V1PodResourceClaimFluent<A extends io.kubernetes.client.openapi.models.V1PodResourceClaimFluent<A>> extends BaseFluent<A>{
  public V1PodResourceClaimFluent() {
  }
  
  public V1PodResourceClaimFluent(V1PodResourceClaim instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String resourceClaimName;
  private String resourceClaimTemplateName;
  
  protected void copyInstance(V1PodResourceClaim instance) {
    instance = instance != null ? instance : new V1PodResourceClaim();
    if (instance != null) {
        this.withName(instance.getName());
        this.withResourceClaimName(instance.getResourceClaimName());
        this.withResourceClaimTemplateName(instance.getResourceClaimTemplateName());
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
  
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName = resourceClaimName;
    return (A) this;
  }
  
  public boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  
  public String getResourceClaimTemplateName() {
    return this.resourceClaimTemplateName;
  }
  
  public A withResourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName = resourceClaimTemplateName;
    return (A) this;
  }
  
  public boolean hasResourceClaimTemplateName() {
    return this.resourceClaimTemplateName != null;
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
  

}