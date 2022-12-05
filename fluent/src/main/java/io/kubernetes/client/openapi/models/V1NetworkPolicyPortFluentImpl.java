package io.kubernetes.client.openapi.models;

import java.lang.Integer;
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
  public class V1NetworkPolicyPortFluentImpl<A extends V1NetworkPolicyPortFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyPortFluent<A>{
  public V1NetworkPolicyPortFluentImpl() {
  }
  public V1NetworkPolicyPortFluentImpl(V1NetworkPolicyPort instance) {
    this.withEndPort(instance.getEndPort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

  }
  private Integer endPort;
  private IntOrString port;
  private String protocol;
  public Integer getEndPort() {
    return this.endPort;
  }
  public A withEndPort(Integer endPort) {
    this.endPort=endPort; return (A) this;
  }
  public Boolean hasEndPort() {
    return this.endPort != null;
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
    V1NetworkPolicyPortFluentImpl that = (V1NetworkPolicyPortFluentImpl) o;
    if (endPort != null ? !endPort.equals(that.endPort) :that.endPort != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(endPort,  port,  protocol,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endPort != null) { sb.append("endPort:"); sb.append(endPort + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol); }
    sb.append("}");
    return sb.toString();
  }
  
}