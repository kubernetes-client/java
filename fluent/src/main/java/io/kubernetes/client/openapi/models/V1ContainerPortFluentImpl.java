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
  public class V1ContainerPortFluentImpl<A extends V1ContainerPortFluent<A>> extends BaseFluent<A> implements V1ContainerPortFluent<A>{
  public V1ContainerPortFluentImpl() {
  }
  public V1ContainerPortFluentImpl(V1ContainerPort instance) {
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());

  }
  private Integer containerPort;
  private String hostIP;
  private Integer hostPort;
  private String name;
  private String protocol;
  public Integer getContainerPort() {
    return this.containerPort;
  }
  public A withContainerPort(Integer containerPort) {
    this.containerPort=containerPort; return (A) this;
  }
  public Boolean hasContainerPort() {
    return this.containerPort != null;
  }
  public String getHostIP() {
    return this.hostIP;
  }
  public A withHostIP(String hostIP) {
    this.hostIP=hostIP; return (A) this;
  }
  public Boolean hasHostIP() {
    return this.hostIP != null;
  }
  public Integer getHostPort() {
    return this.hostPort;
  }
  public A withHostPort(Integer hostPort) {
    this.hostPort=hostPort; return (A) this;
  }
  public Boolean hasHostPort() {
    return this.hostPort != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
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
    V1ContainerPortFluentImpl that = (V1ContainerPortFluentImpl) o;
    if (containerPort != null ? !containerPort.equals(that.containerPort) :that.containerPort != null) return false;
    if (hostIP != null ? !hostIP.equals(that.hostIP) :that.hostIP != null) return false;
    if (hostPort != null ? !hostPort.equals(that.hostPort) :that.hostPort != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
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