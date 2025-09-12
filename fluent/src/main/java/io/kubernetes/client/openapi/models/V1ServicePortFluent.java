package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ServicePortFluent<A extends io.kubernetes.client.openapi.models.V1ServicePortFluent<A>> extends BaseFluent<A>{
  public V1ServicePortFluent() {
  }
  
  public V1ServicePortFluent(V1ServicePort instance) {
    this.copyInstance(instance);
  }
  private String appProtocol;
  private String name;
  private Integer nodePort;
  private Integer port;
  private String protocol;
  private IntOrString targetPort;
  
  protected void copyInstance(V1ServicePort instance) {
    instance = instance != null ? instance : new V1ServicePort();
    if (instance != null) {
        this.withAppProtocol(instance.getAppProtocol());
        this.withName(instance.getName());
        this.withNodePort(instance.getNodePort());
        this.withPort(instance.getPort());
        this.withProtocol(instance.getProtocol());
        this.withTargetPort(instance.getTargetPort());
    }
  }
  
  public String getAppProtocol() {
    return this.appProtocol;
  }
  
  public A withAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return (A) this;
  }
  
  public boolean hasAppProtocol() {
    return this.appProtocol != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Integer getNodePort() {
    return this.nodePort;
  }
  
  public A withNodePort(Integer nodePort) {
    this.nodePort = nodePort;
    return (A) this;
  }
  
  public boolean hasNodePort() {
    return this.nodePort != null;
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
  
  public IntOrString getTargetPort() {
    return this.targetPort;
  }
  
  public A withTargetPort(IntOrString targetPort) {
    this.targetPort = targetPort;
    return (A) this;
  }
  
  public boolean hasTargetPort() {
    return this.targetPort != null;
  }
  
  public A withNewTargetPort(int value) {
    return (A) this.withTargetPort(new IntOrString(value));
  }
  
  public A withNewTargetPort(String value) {
    return (A) this.withTargetPort(new IntOrString(value));
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
    V1ServicePortFluent that = (V1ServicePortFluent) o;
    if (!(Objects.equals(appProtocol, that.appProtocol))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(nodePort, that.nodePort))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    if (!(Objects.equals(protocol, that.protocol))) {
      return false;
    }
    if (!(Objects.equals(targetPort, that.targetPort))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(appProtocol, name, nodePort, port, protocol, targetPort);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(appProtocol == null)) {
        sb.append("appProtocol:");
        sb.append(appProtocol);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(nodePort == null)) {
        sb.append("nodePort:");
        sb.append(nodePort);
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
        sb.append(",");
    }
    if (!(targetPort == null)) {
        sb.append("targetPort:");
        sb.append(targetPort);
    }
    sb.append("}");
    return sb.toString();
  }
  

}