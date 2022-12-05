package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TCPSocketActionFluentImpl<A extends V1TCPSocketActionFluent<A>> extends BaseFluent<A> implements V1TCPSocketActionFluent<A>{
  public V1TCPSocketActionFluentImpl() {
  }
  public V1TCPSocketActionFluentImpl(V1TCPSocketAction instance) {
    this.withHost(instance.getHost());

    this.withPort(instance.getPort());

  }
  private String host;
  private IntOrString port;
  public String getHost() {
    return this.host;
  }
  public A withHost(String host) {
    this.host=host; return (A) this;
  }
  public Boolean hasHost() {
    return this.host != null;
  }
  public IntOrString getPort() {
    return this.port;
  }
  public A withPort(IntOrString port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public A withNewPort(int value) {
    return (A)withPort(new IntOrString(value));
  }
  public A withNewPort(String value) {
    return (A)withPort(new IntOrString(value));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TCPSocketActionFluentImpl that = (V1TCPSocketActionFluentImpl) o;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(host,  port,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (port != null) { sb.append("port:"); sb.append(port); }
    sb.append("}");
    return sb.toString();
  }
  
}