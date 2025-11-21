package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
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
public class V1NetworkPolicyPortFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<A>> extends BaseFluent<A>{

  private Integer endPort;
  private IntOrString port;
  private String protocol;

  public V1NetworkPolicyPortFluent() {
  }
  
  public V1NetworkPolicyPortFluent(V1NetworkPolicyPort instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NetworkPolicyPort instance) {
    instance = instance != null ? instance : new V1NetworkPolicyPort();
    if (instance != null) {
        this.withEndPort(instance.getEndPort());
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
    V1NetworkPolicyPortFluent that = (V1NetworkPolicyPortFluent) o;
    if (!(Objects.equals(endPort, that.endPort))) {
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
  
  public Integer getEndPort() {
    return this.endPort;
  }
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public boolean hasEndPort() {
    return this.endPort != null;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public int hashCode() {
    return Objects.hash(endPort, port, protocol);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(endPort == null)) {
        sb.append("endPort:");
        sb.append(endPort);
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
  
  public A withEndPort(Integer endPort) {
    this.endPort = endPort;
    return (A) this;
  }
  
  public A withNewPort(int value) {
    return (A) this.withPort(new IntOrString(value));
  }
  
  public A withNewPort(String value) {
    return (A) this.withPort(new IntOrString(value));
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }
  
}