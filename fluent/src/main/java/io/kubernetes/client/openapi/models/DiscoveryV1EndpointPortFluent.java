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
public class DiscoveryV1EndpointPortFluent<A extends DiscoveryV1EndpointPortFluent<A>> extends BaseFluent<A>{
  public DiscoveryV1EndpointPortFluent() {
  }
  
  public DiscoveryV1EndpointPortFluent(DiscoveryV1EndpointPort instance) {
    this.copyInstance(instance);
  }
  private String appProtocol;
  private String name;
  private Integer port;
  private String protocol;
  
  protected void copyInstance(DiscoveryV1EndpointPort instance) {
    instance = (instance != null ? instance : new DiscoveryV1EndpointPort());
    if (instance != null) {
          this.withAppProtocol(instance.getAppProtocol());
          this.withName(instance.getName());
          this.withPort(instance.getPort());
          this.withProtocol(instance.getProtocol());
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DiscoveryV1EndpointPortFluent that = (DiscoveryV1EndpointPortFluent) o;
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