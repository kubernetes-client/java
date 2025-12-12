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
public class V1ContainerPortFluent<A extends io.kubernetes.client.openapi.models.V1ContainerPortFluent<A>> extends BaseFluent<A>{

  private Integer containerPort;
  private String hostIP;
  private Integer hostPort;
  private String name;
  private String protocol;

  public V1ContainerPortFluent() {
  }
  
  public V1ContainerPortFluent(V1ContainerPort instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ContainerPort instance) {
    instance = instance != null ? instance : new V1ContainerPort();
    if (instance != null) {
        this.withContainerPort(instance.getContainerPort());
        this.withHostIP(instance.getHostIP());
        this.withHostPort(instance.getHostPort());
        this.withName(instance.getName());
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
    V1ContainerPortFluent that = (V1ContainerPortFluent) o;
    if (!(Objects.equals(containerPort, that.containerPort))) {
      return false;
    }
    if (!(Objects.equals(hostIP, that.hostIP))) {
      return false;
    }
    if (!(Objects.equals(hostPort, that.hostPort))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(protocol, that.protocol))) {
      return false;
    }
    return true;
  }
  
  public Integer getContainerPort() {
    return this.containerPort;
  }
  
  public String getHostIP() {
    return this.hostIP;
  }
  
  public Integer getHostPort() {
    return this.hostPort;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public boolean hasContainerPort() {
    return this.containerPort != null;
  }
  
  public boolean hasHostIP() {
    return this.hostIP != null;
  }
  
  public boolean hasHostPort() {
    return this.hostPort != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerPort == null)) {
        sb.append("containerPort:");
        sb.append(containerPort);
        sb.append(",");
    }
    if (!(hostIP == null)) {
        sb.append("hostIP:");
        sb.append(hostIP);
        sb.append(",");
    }
    if (!(hostPort == null)) {
        sb.append("hostPort:");
        sb.append(hostPort);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(protocol == null)) {
        sb.append("protocol:");
        sb.append(protocol);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
    return (A) this;
  }
  
  public A withHostIP(String hostIP) {
    this.hostIP = hostIP;
    return (A) this;
  }
  
  public A withHostPort(Integer hostPort) {
    this.hostPort = hostPort;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }
  
}