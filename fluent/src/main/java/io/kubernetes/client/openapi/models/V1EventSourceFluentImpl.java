package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EventSourceFluentImpl<A extends V1EventSourceFluent<A>> extends BaseFluent<A> implements V1EventSourceFluent<A>{
  public V1EventSourceFluentImpl() {
  }
  public V1EventSourceFluentImpl(V1EventSource instance) {
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

  }
  private String component;
  private String host;
  public String getComponent() {
    return this.component;
  }
  public A withComponent(String component) {
    this.component=component; return (A) this;
  }
  public Boolean hasComponent() {
    return this.component != null;
  }
  public String getHost() {
    return this.host;
  }
  public A withHost(String host) {
    this.host=host; return (A) this;
  }
  public Boolean hasHost() {
    return this.host != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EventSourceFluentImpl that = (V1EventSourceFluentImpl) o;
    if (component != null ? !component.equals(that.component) :that.component != null) return false;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
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