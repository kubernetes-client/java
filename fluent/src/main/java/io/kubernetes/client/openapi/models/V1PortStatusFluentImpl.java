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
  public class V1PortStatusFluentImpl<A extends V1PortStatusFluent<A>> extends BaseFluent<A> implements V1PortStatusFluent<A>{
  public V1PortStatusFluentImpl() {
  }
  public V1PortStatusFluentImpl(V1PortStatus instance) {
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

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
    V1PortStatusFluentImpl that = (V1PortStatusFluentImpl) o;
    if (error != null ? !error.equals(that.error) :that.error != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
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