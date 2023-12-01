package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NetworkPolicyPortFluent<A extends V1NetworkPolicyPortFluent<A>> extends BaseFluent<A>{
  public V1NetworkPolicyPortFluent() {
  }
  
  public V1NetworkPolicyPortFluent(V1NetworkPolicyPort instance) {
    this.copyInstance(instance);
  }
  private Integer endPort;
  private IntOrString port;
  private String protocol;
  
  protected void copyInstance(V1NetworkPolicyPort instance) {
    instance = (instance != null ? instance : new V1NetworkPolicyPort());
    if (instance != null) {
          this.withEndPort(instance.getEndPort());
          this.withPort(instance.getPort());
          this.withProtocol(instance.getProtocol());
        }
  }
  
  public Integer getEndPort() {
    return this.endPort;
  }
  
  public A withEndPort(Integer endPort) {
    this.endPort = endPort;
    return (A) this;
  }
  
  public boolean hasEndPort() {
    return this.endPort != null;
  }
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
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
    this.protocol = protocol;
    return (A) this;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyPortFluent that = (V1NetworkPolicyPortFluent) o;
    if (!java.util.Objects.equals(endPort, that.endPort)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(protocol, that.protocol)) return false;
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