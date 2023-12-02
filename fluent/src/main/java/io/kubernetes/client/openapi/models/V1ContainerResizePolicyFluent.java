package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerResizePolicyFluent<A extends V1ContainerResizePolicyFluent<A>> extends BaseFluent<A>{
  public V1ContainerResizePolicyFluent() {
  }
  
  public V1ContainerResizePolicyFluent(V1ContainerResizePolicy instance) {
    this.copyInstance(instance);
  }
  private String resourceName;
  private String restartPolicy;
  
  protected void copyInstance(V1ContainerResizePolicy instance) {
    instance = (instance != null ? instance : new V1ContainerResizePolicy());
    if (instance != null) {
          this.withResourceName(instance.getResourceName());
          this.withRestartPolicy(instance.getRestartPolicy());
        }
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
  
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return (A) this;
  }
  
  public boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerResizePolicyFluent that = (V1ContainerResizePolicyFluent) o;
    if (!java.util.Objects.equals(resourceName, that.resourceName)) return false;
    if (!java.util.Objects.equals(restartPolicy, that.restartPolicy)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(resourceName,  restartPolicy,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resourceName != null) { sb.append("resourceName:"); sb.append(resourceName + ","); }
    if (restartPolicy != null) { sb.append("restartPolicy:"); sb.append(restartPolicy); }
    sb.append("}");
    return sb.toString();
  }
  

}