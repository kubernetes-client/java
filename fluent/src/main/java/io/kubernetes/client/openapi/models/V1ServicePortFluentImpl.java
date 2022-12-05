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
  public class V1ServicePortFluentImpl<A extends V1ServicePortFluent<A>> extends BaseFluent<A> implements V1ServicePortFluent<A>{
  public V1ServicePortFluentImpl() {
  }
  public V1ServicePortFluentImpl(V1ServicePort instance) {
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withNodePort(instance.getNodePort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.withTargetPort(instance.getTargetPort());

  }
  private String appProtocol;
  private String name;
  private Integer nodePort;
  private Integer port;
  private String protocol;
  private IntOrString targetPort;
  public String getAppProtocol() {
    return this.appProtocol;
  }
  public A withAppProtocol(String appProtocol) {
    this.appProtocol=appProtocol; return (A) this;
  }
  public Boolean hasAppProtocol() {
    return this.appProtocol != null;
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
  public Integer getNodePort() {
    return this.nodePort;
  }
  public A withNodePort(Integer nodePort) {
    this.nodePort=nodePort; return (A) this;
  }
  public Boolean hasNodePort() {
    return this.nodePort != null;
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
  public IntOrString getTargetPort() {
    return this.targetPort;
  }
  public A withTargetPort(IntOrString targetPort) {
    this.targetPort=targetPort; return (A) this;
  }
  public Boolean hasTargetPort() {
    return this.targetPort != null;
  }
  public A withNewTargetPort(int value) {
    return (A)withTargetPort(new IntOrString(value));
  }
  public A withNewTargetPort(String value) {
    return (A)withTargetPort(new IntOrString(value));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServicePortFluentImpl that = (V1ServicePortFluentImpl) o;
    if (appProtocol != null ? !appProtocol.equals(that.appProtocol) :that.appProtocol != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (nodePort != null ? !nodePort.equals(that.nodePort) :that.nodePort != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
    if (targetPort != null ? !targetPort.equals(that.targetPort) :that.targetPort != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(appProtocol,  name,  nodePort,  port,  protocol,  targetPort,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (appProtocol != null) { sb.append("appProtocol:"); sb.append(appProtocol + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (nodePort != null) { sb.append("nodePort:"); sb.append(nodePort + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol + ","); }
    if (targetPort != null) { sb.append("targetPort:"); sb.append(targetPort); }
    sb.append("}");
    return sb.toString();
  }
  
}