package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ResourceFieldSelectorFluentImpl<A extends V1ResourceFieldSelectorFluent<A>> extends BaseFluent<A> implements V1ResourceFieldSelectorFluent<A>{
  public V1ResourceFieldSelectorFluentImpl() {
  }
  public V1ResourceFieldSelectorFluentImpl(V1ResourceFieldSelector instance) {
    this.withContainerName(instance.getContainerName());

    this.withDivisor(instance.getDivisor());

    this.withResource(instance.getResource());

  }
  private String containerName;
  private Quantity divisor;
  private String resource;
  public String getContainerName() {
    return this.containerName;
  }
  public A withContainerName(String containerName) {
    this.containerName=containerName; return (A) this;
  }
  public Boolean hasContainerName() {
    return this.containerName != null;
  }
  public Quantity getDivisor() {
    return this.divisor;
  }
  public A withDivisor(Quantity divisor) {
    this.divisor=divisor; return (A) this;
  }
  public Boolean hasDivisor() {
    return this.divisor != null;
  }
  public A withNewDivisor(String value) {
    return (A)withDivisor(new Quantity(value));
  }
  public String getResource() {
    return this.resource;
  }
  public A withResource(String resource) {
    this.resource=resource; return (A) this;
  }
  public Boolean hasResource() {
    return this.resource != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceFieldSelectorFluentImpl that = (V1ResourceFieldSelectorFluentImpl) o;
    if (containerName != null ? !containerName.equals(that.containerName) :that.containerName != null) return false;
    if (divisor != null ? !divisor.equals(that.divisor) :that.divisor != null) return false;
    if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(containerName,  divisor,  resource,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerName != null) { sb.append("containerName:"); sb.append(containerName + ","); }
    if (divisor != null) { sb.append("divisor:"); sb.append(divisor + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource); }
    sb.append("}");
    return sb.toString();
  }
  
}