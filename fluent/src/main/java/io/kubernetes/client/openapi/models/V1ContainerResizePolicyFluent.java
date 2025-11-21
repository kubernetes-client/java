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
public class V1ContainerResizePolicyFluent<A extends io.kubernetes.client.openapi.models.V1ContainerResizePolicyFluent<A>> extends BaseFluent<A>{

  private String resourceName;
  private String restartPolicy;

  public V1ContainerResizePolicyFluent() {
  }
  
  public V1ContainerResizePolicyFluent(V1ContainerResizePolicy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ContainerResizePolicy instance) {
    instance = instance != null ? instance : new V1ContainerResizePolicy();
    if (instance != null) {
        this.withResourceName(instance.getResourceName());
        this.withRestartPolicy(instance.getRestartPolicy());
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
    V1ContainerResizePolicyFluent that = (V1ContainerResizePolicyFluent) o;
    if (!(Objects.equals(resourceName, that.resourceName))) {
      return false;
    }
    if (!(Objects.equals(restartPolicy, that.restartPolicy))) {
      return false;
    }
    return true;
  }
  
  public String getResourceName() {
    return this.resourceName;
  }
  
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  
  public boolean hasResourceName() {
    return this.resourceName != null;
  }
  
  public boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  
  public int hashCode() {
    return Objects.hash(resourceName, restartPolicy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(resourceName == null)) {
        sb.append("resourceName:");
        sb.append(resourceName);
        sb.append(",");
    }
    if (!(restartPolicy == null)) {
        sb.append("restartPolicy:");
        sb.append(restartPolicy);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withResourceName(String resourceName) {
    this.resourceName = resourceName;
    return (A) this;
  }
  
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }
  
}