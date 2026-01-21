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
public class V1PortStatusFluent<A extends io.kubernetes.client.openapi.models.V1PortStatusFluent<A>> extends BaseFluent<A>{

  private String error;
  private Integer port;
  private String protocol;

  public V1PortStatusFluent() {
  }
  
  public V1PortStatusFluent(V1PortStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PortStatus instance) {
    instance = instance != null ? instance : new V1PortStatus();
    if (instance != null) {
        this.withError(instance.getError());
        this.withPort(instance.getPort());
        this.withProtocol(instance.getProtocol());
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
    V1PortStatusFluent that = (V1PortStatusFluent) o;
    if (!(Objects.equals(error, that.error))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    if (!(Objects.equals(protocol, that.protocol))) {
      return false;
    }
    return true;
  }
  
  public String getError() {
    return this.error;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public int hashCode() {
    return Objects.hash(error, port, protocol);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(error == null)) {
        sb.append("error:");
        sb.append(error);
        sb.append(",");
    }
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
        sb.append(",");
    }
    if (!(protocol == null)) {
        sb.append("protocol:");
        sb.append(protocol);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }
  
}