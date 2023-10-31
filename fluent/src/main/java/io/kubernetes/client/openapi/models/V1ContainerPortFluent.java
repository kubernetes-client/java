package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerPortFluent<A extends V1ContainerPortFluent<A>> extends BaseFluent<A>{
  public V1ContainerPortFluent() {
  }
  
  public V1ContainerPortFluent(V1ContainerPort instance) {
    this.copyInstance(instance);
  }
  private Integer containerPort;
  private String hostIP;
  private Integer hostPort;
  private String name;
  private String protocol;
  
  protected void copyInstance(V1ContainerPort instance) {
    instance = (instance != null ? instance : new V1ContainerPort());
    if (instance != null) {
          this.withContainerPort(instance.getContainerPort());
          this.withHostIP(instance.getHostIP());
          this.withHostPort(instance.getHostPort());
          this.withName(instance.getName());
          this.withProtocol(instance.getProtocol());
        }
  }
  
  public Integer getContainerPort() {
    return this.containerPort;
  }
  
  public A withContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
    return (A) this;
  }
  
  public boolean hasContainerPort() {
    return this.containerPort != null;
  }
  
  public String getHostIP() {
    return this.hostIP;
  }
  
  public A withHostIP(String hostIP) {
    this.hostIP = hostIP;
    return (A) this;
  }
  
  public boolean hasHostIP() {
    return this.hostIP != null;
  }
  
  public Integer getHostPort() {
    return this.hostPort;
  }
  
  public A withHostPort(Integer hostPort) {
    this.hostPort = hostPort;
    return (A) this;
  }
  
  public boolean hasHostPort() {
    return this.hostPort != null;
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
    V1ContainerPortFluent that = (V1ContainerPortFluent) o;
    if (!java.util.Objects.equals(containerPort, that.containerPort)) return false;
    if (!java.util.Objects.equals(hostIP, that.hostIP)) return false;
    if (!java.util.Objects.equals(hostPort, that.hostPort)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(protocol, that.protocol)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(containerPort,  hostIP,  hostPort,  name,  protocol,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerPort != null) { sb.append("containerPort:"); sb.append(containerPort + ","); }
    if (hostIP != null) { sb.append("hostIP:"); sb.append(hostIP + ","); }
    if (hostPort != null) { sb.append("hostPort:"); sb.append(hostPort + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol); }
    sb.append("}");
    return sb.toString();
  }
  

}