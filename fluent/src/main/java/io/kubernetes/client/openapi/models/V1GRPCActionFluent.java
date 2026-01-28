package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1GRPCActionFluent<A extends io.kubernetes.client.openapi.models.V1GRPCActionFluent<A>> extends BaseFluent<A>{

  private Integer port;
  private String service;

  public V1GRPCActionFluent() {
  }
  
  public V1GRPCActionFluent(V1GRPCAction instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1GRPCAction instance) {
    instance = instance != null ? instance : new V1GRPCAction();
    if (instance != null) {
        this.withPort(instance.getPort());
        this.withService(instance.getService());
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
    V1GRPCActionFluent that = (V1GRPCActionFluent) o;
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    if (!(Objects.equals(service, that.service))) {
      return false;
    }
    return true;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public String getService() {
    return this.service;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public boolean hasService() {
    return this.service != null;
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
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public A withService(String service) {
    this.service = service;
    return (A) this;
  }
  
}