package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1RollingUpdateDeploymentFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<A>> extends BaseFluent<A>{
  public V1RollingUpdateDeploymentFluent() {
  }
  
  public V1RollingUpdateDeploymentFluent(V1RollingUpdateDeployment instance) {
    this.copyInstance(instance);
  }
  private IntOrString maxSurge;
  private IntOrString maxUnavailable;
  
  protected void copyInstance(V1RollingUpdateDeployment instance) {
    instance = instance != null ? instance : new V1RollingUpdateDeployment();
    if (instance != null) {
        this.withMaxSurge(instance.getMaxSurge());
        this.withMaxUnavailable(instance.getMaxUnavailable());
    }
  }
  
  public IntOrString getMaxSurge() {
    return this.maxSurge;
  }
  
  public A withMaxSurge(IntOrString maxSurge) {
    this.maxSurge = maxSurge;
    return (A) this;
  }
  
  public boolean hasMaxSurge() {
    return this.maxSurge != null;
  }
  
  public A withNewMaxSurge(int value) {
    return (A) this.withMaxSurge(new IntOrString(value));
  }
  
  public A withNewMaxSurge(String value) {
    return (A) this.withMaxSurge(new IntOrString(value));
  }
  
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  
  public A withNewMaxUnavailable(int value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(String value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
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
    V1RollingUpdateDeploymentFluent that = (V1RollingUpdateDeploymentFluent) o;
    if (!(Objects.equals(maxSurge, that.maxSurge))) {
      return false;
    }
    if (!(Objects.equals(maxUnavailable, that.maxUnavailable))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxSurge == null)) {
        sb.append("maxSurge:");
        sb.append(maxSurge);
        sb.append(",");
    }
    if (!(maxUnavailable == null)) {
        sb.append("maxUnavailable:");
        sb.append(maxUnavailable);
    }
    sb.append("}");
    return sb.toString();
  }
  

}