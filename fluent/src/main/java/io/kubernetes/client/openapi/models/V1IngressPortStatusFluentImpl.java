package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressPortStatusFluentImpl<A extends V1IngressPortStatusFluent<A>> extends BaseFluent<A> implements V1IngressPortStatusFluent<A>{
  public V1IngressPortStatusFluentImpl() {
  }
  public V1IngressPortStatusFluentImpl(V1IngressPortStatus instance) {
    if (instance != null) {
      this.withError(instance.getError());
      this.withPort(instance.getPort());
      this.withProtocol(instance.getProtocol());
    }
  }
  private String error;
  private Integer port;
  private String protocol;
  public String getError() {
    return this.error;
  }
  public A withError(String error) {
    this.error=error; return (A) this;
  }
  public Boolean hasError() {
    return this.error != null;
  }
  public Integer getPort() {
    return this.port;
  }
  public A withPort(Integer port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public String getProtocol() {
    return this.protocol;
  }
  public A withProtocol(String protocol) {
    this.protocol=protocol; return (A) this;
  }
  public Boolean hasProtocol() {
    return this.protocol != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressPortStatusFluentImpl that = (V1IngressPortStatusFluentImpl) o;
    if (!java.util.Objects.equals(error, that.error)) return false;

    if (!java.util.Objects.equals(port, that.port)) return false;

    if (!java.util.Objects.equals(protocol, that.protocol)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(error,  port,  protocol,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (error != null) { sb.append("error:"); sb.append(error + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol); }
    sb.append("}");
    return sb.toString();
  }
  
}