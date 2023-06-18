package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressServiceBackendFluentImpl<A extends V1IngressServiceBackendFluent<A>> extends BaseFluent<A> implements V1IngressServiceBackendFluent<A>{
  public V1IngressServiceBackendFluentImpl() {
  }
  public V1IngressServiceBackendFluentImpl(V1IngressServiceBackend instance) {
    if (instance != null) {
      this.withName(instance.getName());
      this.withPort(instance.getPort());
    }
  }
  private String name;
  private V1ServiceBackendPortBuilder port;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildPort instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceBackendPort getPort() {
    return this.port!=null ?this.port.build():null;
  }
  public V1ServiceBackendPort buildPort() {
    return this.port!=null ?this.port.build():null;
  }
  public A withPort(V1ServiceBackendPort port) {
    _visitables.get("port").remove(this.port);
    if (port!=null){ this.port= new V1ServiceBackendPortBuilder(port); _visitables.get("port").add(this.port);} else { this.port = null; _visitables.get("port").remove(this.port); } return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public V1IngressServiceBackendFluentImpl.PortNested<A> withNewPort() {
    return new V1IngressServiceBackendFluentImpl.PortNestedImpl();
  }
  public V1IngressServiceBackendFluentImpl.PortNested<A> withNewPortLike(V1ServiceBackendPort item) {
    return new V1IngressServiceBackendFluentImpl.PortNestedImpl(item);
  }
  public V1IngressServiceBackendFluentImpl.PortNested<A> editPort() {
    return withNewPortLike(getPort());
  }
  public V1IngressServiceBackendFluentImpl.PortNested<A> editOrNewPort() {
    return withNewPortLike(getPort() != null ? getPort(): new V1ServiceBackendPortBuilder().build());
  }
  public V1IngressServiceBackendFluentImpl.PortNested<A> editOrNewPortLike(V1ServiceBackendPort item) {
    return withNewPortLike(getPort() != null ? getPort(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressServiceBackendFluentImpl that = (V1IngressServiceBackendFluentImpl) o;
    if (!java.util.Objects.equals(name, that.name)) return false;

    if (!java.util.Objects.equals(port, that.port)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  port,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (port != null) { sb.append("port:"); sb.append(port); }
    sb.append("}");
    return sb.toString();
  }
  class PortNestedImpl<N> extends V1ServiceBackendPortFluentImpl<V1IngressServiceBackendFluentImpl.PortNested<N>> implements V1IngressServiceBackendFluentImpl.PortNested<N>,Nested<N>{
    PortNestedImpl(V1ServiceBackendPort item) {
      this.builder = new V1ServiceBackendPortBuilder(this, item);
    }
    PortNestedImpl() {
      this.builder = new V1ServiceBackendPortBuilder(this);
    }
    V1ServiceBackendPortBuilder builder;
    public N and() {
      return (N) V1IngressServiceBackendFluentImpl.this.withPort(builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}