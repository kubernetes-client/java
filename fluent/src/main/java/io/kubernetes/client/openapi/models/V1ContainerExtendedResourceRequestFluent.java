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
public class V1ContainerExtendedResourceRequestFluent<A extends io.kubernetes.client.openapi.models.V1ContainerExtendedResourceRequestFluent<A>> extends BaseFluent<A>{
  public V1ContainerExtendedResourceRequestFluent() {
  }
  
  public V1ContainerExtendedResourceRequestFluent(V1ContainerExtendedResourceRequest instance) {
    this.copyInstance(instance);
  }
  private String containerName;
  private String requestName;
  private String resourceName;
  
  protected void copyInstance(V1ContainerExtendedResourceRequest instance) {
    instance = instance != null ? instance : new V1ContainerExtendedResourceRequest();
    if (instance != null) {
        this.withContainerName(instance.getContainerName());
        this.withRequestName(instance.getRequestName());
        this.withResourceName(instance.getResourceName());
    }
  }
  
  public String getContainerName() {
    return this.containerName;
  }
  
  public A withContainerName(String containerName) {
    this.containerName = containerName;
    return (A) this;
  }
  
  public boolean hasContainerName() {
    return this.containerName != null;
  }
  
  public String getRequestName() {
    return this.requestName;
  }
  
  public A withRequestName(String requestName) {
    this.requestName = requestName;
    return (A) this;
  }
  
  public boolean hasRequestName() {
    return this.requestName != null;
  }
  
  public String getResourceName() {
    return this.resourceName;
  }
  
  public A withResourceName(String resourceName) {
    this.resourceName = resourceName;
    return (A) this;
  }
  
  public boolean hasResourceName() {
    return this.resourceName != null;
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
    V1ContainerExtendedResourceRequestFluent that = (V1ContainerExtendedResourceRequestFluent) o;
    if (!(Objects.equals(containerName, that.containerName))) {
      return false;
    }
    if (!(Objects.equals(requestName, that.requestName))) {
      return false;
    }
    if (!(Objects.equals(resourceName, that.resourceName))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(containerName, requestName, resourceName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerName == null)) {
        sb.append("containerName:");
        sb.append(containerName);
        sb.append(",");
    }
    if (!(requestName == null)) {
        sb.append("requestName:");
        sb.append(requestName);
        sb.append(",");
    }
    if (!(resourceName == null)) {
        sb.append("resourceName:");
        sb.append(resourceName);
    }
    sb.append("}");
    return sb.toString();
  }
  

}