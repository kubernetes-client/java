package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ContainerResizePolicyFluentImpl<A extends V1ContainerResizePolicyFluent<A>> extends BaseFluent<A> implements V1ContainerResizePolicyFluent<A>{
  public V1ContainerResizePolicyFluentImpl() {
  }
  public V1ContainerResizePolicyFluentImpl(V1ContainerResizePolicy instance) {
    if (instance != null) {
      this.withResourceName(instance.getResourceName());
      this.withRestartPolicy(instance.getRestartPolicy());
    }
  }
  private String resourceName;
  private String restartPolicy;
  public String getResourceName() {
    return this.resourceName;
  }
  public A withResourceName(String resourceName) {
    this.resourceName=resourceName; return (A) this;
  }
  public Boolean hasResourceName() {
    return this.resourceName != null;
  }
  public String getRestartPolicy() {
    return this.restartPolicy;
  }
  public A withRestartPolicy(String restartPolicy) {
    this.restartPolicy=restartPolicy; return (A) this;
  }
  public Boolean hasRestartPolicy() {
    return this.restartPolicy != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerResizePolicyFluentImpl that = (V1ContainerResizePolicyFluentImpl) o;
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