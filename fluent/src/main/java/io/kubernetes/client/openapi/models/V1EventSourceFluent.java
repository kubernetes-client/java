package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EventSourceFluent<A extends V1EventSourceFluent<A>> extends BaseFluent<A>{
  public V1EventSourceFluent() {
  }
  
  public V1EventSourceFluent(V1EventSource instance) {
    this.copyInstance(instance);
  }
  private String component;
  private String host;
  
  protected void copyInstance(V1EventSource instance) {
    instance = (instance != null ? instance : new V1EventSource());
    if (instance != null) {
          this.withComponent(instance.getComponent());
          this.withHost(instance.getHost());
        }
  }
  
  public String getComponent() {
    return this.component;
  }
  
  public A withComponent(String component) {
    this.component = component;
    return (A) this;
  }
  
  public boolean hasComponent() {
    return this.component != null;
  }
  
  public String getHost() {
    return this.host;
  }
  
  public A withHost(String host) {
    this.host = host;
    return (A) this;
  }
  
  public boolean hasHost() {
    return this.host != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EventSourceFluent that = (V1EventSourceFluent) o;
    if (!java.util.Objects.equals(component, that.component)) return false;
    if (!java.util.Objects.equals(host, that.host)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(component,  host,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (component != null) { sb.append("component:"); sb.append(component + ","); }
    if (host != null) { sb.append("host:"); sb.append(host); }
    sb.append("}");
    return sb.toString();
  }
  

}