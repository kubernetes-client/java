package io.kubernetes.client.openapi.models;

import java.lang.Integer;
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
public class V1GRPCActionFluent<A extends io.kubernetes.client.openapi.models.V1GRPCActionFluent<A>> extends BaseFluent<A>{
  public V1GRPCActionFluent() {
  }
  
  public V1GRPCActionFluent(V1GRPCAction instance) {
    this.copyInstance(instance);
  }
  private Integer port;
  private String service;
  
  protected void copyInstance(V1GRPCAction instance) {
    instance = instance != null ? instance : new V1GRPCAction();
    if (instance != null) {
        this.withPort(instance.getPort());
        this.withService(instance.getService());
    }
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public String getService() {
    return this.service;
  }
  
  public A withService(String service) {
    this.service = service;
    return (A) this;
  }
  
  public boolean hasService() {
    return this.service != null;
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
    V1GRPCActionFluent that = (V1GRPCActionFluent) o;
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    if (!(Objects.equals(service, that.service))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(port, service);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
        sb.append(",");
    }
    if (!(service == null)) {
        sb.append("service:");
        sb.append(service);
    }
    sb.append("}");
    return sb.toString();
  }
  

}