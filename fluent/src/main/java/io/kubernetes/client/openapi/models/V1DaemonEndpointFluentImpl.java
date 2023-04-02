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
  public class V1DaemonEndpointFluentImpl<A extends V1DaemonEndpointFluent<A>> extends BaseFluent<A> implements V1DaemonEndpointFluent<A>{
  public V1DaemonEndpointFluentImpl() {
  }
  public V1DaemonEndpointFluentImpl(V1DaemonEndpoint instance) {
    this.withPort(instance.getPort());

  }
  private Integer port;
  public Integer getPort() {
    return this.port;
  }
  public A withPort(Integer port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonEndpointFluentImpl that = (V1DaemonEndpointFluentImpl) o;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(port,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (port != null) { sb.append("port:"); sb.append(port); }
    sb.append("}");
    return sb.toString();
  }
  
}