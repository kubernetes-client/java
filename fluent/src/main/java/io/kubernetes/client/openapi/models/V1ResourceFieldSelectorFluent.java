package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceFieldSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A>> extends BaseFluent<A>{
  public V1ResourceFieldSelectorFluent() {
  }
  
  public V1ResourceFieldSelectorFluent(V1ResourceFieldSelector instance) {
    this.copyInstance(instance);
  }
  private String containerName;
  private Quantity divisor;
  private String resource;
  
  protected void copyInstance(V1ResourceFieldSelector instance) {
    instance = instance != null ? instance : new V1ResourceFieldSelector();
    if (instance != null) {
        this.withContainerName(instance.getContainerName());
        this.withDivisor(instance.getDivisor());
        this.withResource(instance.getResource());
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
  
  public Quantity getDivisor() {
    return this.divisor;
  }
  
  public A withDivisor(Quantity divisor) {
    this.divisor = divisor;
    return (A) this;
  }
  
  public boolean hasDivisor() {
    return this.divisor != null;
  }
  
  public A withNewDivisor(String value) {
    return (A) this.withDivisor(new Quantity(value));
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
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
    V1ResourceFieldSelectorFluent that = (V1ResourceFieldSelectorFluent) o;
    if (!(Objects.equals(containerName, that.containerName))) {
      return false;
    }
    if (!(Objects.equals(divisor, that.divisor))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerName == null)) {
        sb.append("containerName:");
        sb.append(containerName);
        sb.append(",");
    }
    if (!(divisor == null)) {
        sb.append("divisor:");
        sb.append(divisor);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  

}