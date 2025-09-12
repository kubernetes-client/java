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
public class V1DaemonEndpointFluent<A extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A>> extends BaseFluent<A>{
  public V1DaemonEndpointFluent() {
  }
  
  public V1DaemonEndpointFluent(V1DaemonEndpoint instance) {
    this.copyInstance(instance);
  }
  private Integer port;
  
  protected void copyInstance(V1DaemonEndpoint instance) {
    instance = instance != null ? instance : new V1DaemonEndpoint();
    if (instance != null) {
      this.withPort(instance.getPort());
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
    V1DaemonEndpointFluent that = (V1DaemonEndpointFluent) o;
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(port);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
  

}