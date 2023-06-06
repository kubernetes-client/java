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
  public class DiscoveryV1EndpointPortFluentImpl<A extends DiscoveryV1EndpointPortFluent<A>> extends BaseFluent<A> implements DiscoveryV1EndpointPortFluent<A>{
  public DiscoveryV1EndpointPortFluentImpl() {
  }
  public DiscoveryV1EndpointPortFluentImpl(DiscoveryV1EndpointPort instance) {
    if (instance != null) {
      this.withAppProtocol(instance.getAppProtocol());
      this.withName(instance.getName());
      this.withPort(instance.getPort());
      this.withProtocol(instance.getProtocol());
    }
  }
  private String appProtocol;
  private String name;
  private Integer port;
  private String protocol;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DiscoveryV1EndpointPortFluentImpl that = (DiscoveryV1EndpointPortFluentImpl) o;
    if (!java.util.Objects.equals(appProtocol, that.appProtocol)) return false;

    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(port, that.port)) return false;

    if (!java.util.Objects.equals(protocol, that.protocol)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(appProtocol,  name,  port,  protocol,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (appProtocol != null) { sb.append("appProtocol:"); sb.append(appProtocol + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (protocol != null) { sb.append("protocol:"); sb.append(protocol); }
    sb.append("}");
    return sb.toString();
  }
  
}