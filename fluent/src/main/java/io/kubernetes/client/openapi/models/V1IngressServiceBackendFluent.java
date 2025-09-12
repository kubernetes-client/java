package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressServiceBackendFluent<A extends io.kubernetes.client.openapi.models.V1IngressServiceBackendFluent<A>> extends BaseFluent<A>{
  public V1IngressServiceBackendFluent() {
  }
  
  public V1IngressServiceBackendFluent(V1IngressServiceBackend instance) {
    this.copyInstance(instance);
  }
  private String name;
  private V1ServiceBackendPortBuilder port;
  
  protected void copyInstance(V1IngressServiceBackend instance) {
    instance = instance != null ? instance : new V1IngressServiceBackend();
    if (instance != null) {
        this.withName(instance.getName());
        this.withPort(instance.getPort());
    }
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
  
  public V1ServiceBackendPort buildPort() {
    return this.port != null ? this.port.build() : null;
  }
  
  public A withPort(V1ServiceBackendPort port) {
    this._visitables.remove("port");
    if (port != null) {
        this.port = new V1ServiceBackendPortBuilder(port);
        this._visitables.get("port").add(this.port);
    } else {
        this.port = null;
        this._visitables.get("port").remove(this.port);
    }
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public PortNested<A> withNewPort() {
    return new PortNested(null);
  }
  
  public PortNested<A> withNewPortLike(V1ServiceBackendPort item) {
    return new PortNested(item);
  }
  
  public PortNested<A> editPort() {
    return this.withNewPortLike(Optional.ofNullable(this.buildPort()).orElse(null));
  }
  
  public PortNested<A> editOrNewPort() {
    return this.withNewPortLike(Optional.ofNullable(this.buildPort()).orElse(new V1ServiceBackendPortBuilder().build()));
  }
  
  public PortNested<A> editOrNewPortLike(V1ServiceBackendPort item) {
    return this.withNewPortLike(Optional.ofNullable(this.buildPort()).orElse(item));
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
    V1IngressServiceBackendFluent that = (V1IngressServiceBackendFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(port, that.port))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(name, port);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(port == null)) {
        sb.append("port:");
        sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
  public class PortNested<N> extends V1ServiceBackendPortFluent<PortNested<N>> implements Nested<N>{
    PortNested(V1ServiceBackendPort item) {
      this.builder = new V1ServiceBackendPortBuilder(this, item);
    }
    V1ServiceBackendPortBuilder builder;
    
    public N and() {
      return (N) V1IngressServiceBackendFluent.this.withPort(builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }

}