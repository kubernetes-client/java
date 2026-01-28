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
public class CoreV1EndpointPortFluent<A extends io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<A>> extends BaseFluent<A>{

  private String appProtocol;
  private String name;
  private Integer port;
  private String protocol;

  public CoreV1EndpointPortFluent() {
  }
  
  public CoreV1EndpointPortFluent(CoreV1EndpointPort instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(CoreV1EndpointPort instance) {
    instance = instance != null ? instance : new CoreV1EndpointPort();
    if (instance != null) {
        this.withAppProtocol(instance.getAppProtocol());
        this.withName(instance.getName());
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
    CoreV1EndpointPortFluent that = (CoreV1EndpointPortFluent) o;
    if (!(Objects.equals(appProtocol, that.appProtocol))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
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
  
  public String getAppProtocol() {
    return this.appProtocol;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public boolean hasAppProtocol() {
    return this.appProtocol != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public boolean hasProtocol() {
    return this.protocol != null;
  }
  
  public int hashCode() {
    return Objects.hash(appProtocol, name, port, protocol);
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
  
  public A withAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withPort(Integer port) {
    this.port = port;
    return (A) this;
  }
  
  public A withProtocol(String protocol) {
    this.protocol = protocol;
    return (A) this;
  }
  
}