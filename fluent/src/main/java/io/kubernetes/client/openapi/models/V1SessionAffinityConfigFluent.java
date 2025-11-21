package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SessionAffinityConfigFluent<A extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<A>> extends BaseFluent<A>{

  private V1ClientIPConfigBuilder clientIP;

  public V1SessionAffinityConfigFluent() {
  }
  
  public V1SessionAffinityConfigFluent(V1SessionAffinityConfig instance) {
    this.copyInstance(instance);
  }

  public V1ClientIPConfig buildClientIP() {
    return this.clientIP != null ? this.clientIP.build() : null;
  }
  
  protected void copyInstance(V1SessionAffinityConfig instance) {
    instance = instance != null ? instance : new V1SessionAffinityConfig();
    if (instance != null) {
      this.withClientIP(instance.getClientIP());
    }
  }
  
  public ClientIPNested<A> editClientIP() {
    return this.withNewClientIPLike(Optional.ofNullable(this.buildClientIP()).orElse(null));
  }
  
  public ClientIPNested<A> editOrNewClientIP() {
    return this.withNewClientIPLike(Optional.ofNullable(this.buildClientIP()).orElse(new V1ClientIPConfigBuilder().build()));
  }
  
  public ClientIPNested<A> editOrNewClientIPLike(V1ClientIPConfig item) {
    return this.withNewClientIPLike(Optional.ofNullable(this.buildClientIP()).orElse(item));
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
    V1SessionAffinityConfigFluent that = (V1SessionAffinityConfigFluent) o;
    if (!(Objects.equals(clientIP, that.clientIP))) {
      return false;
    }
    return true;
  }
  
  public boolean hasClientIP() {
    return this.clientIP != null;
  }
  
  public int hashCode() {
    return Objects.hash(clientIP);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(clientIP == null)) {
        sb.append("clientIP:");
        sb.append(clientIP);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withClientIP(V1ClientIPConfig clientIP) {
    this._visitables.remove("clientIP");
    if (clientIP != null) {
        this.clientIP = new V1ClientIPConfigBuilder(clientIP);
        this._visitables.get("clientIP").add(this.clientIP);
    } else {
        this.clientIP = null;
        this._visitables.get("clientIP").remove(this.clientIP);
    }
    return (A) this;
  }
  
  public ClientIPNested<A> withNewClientIP() {
    return new ClientIPNested(null);
  }
  
  public ClientIPNested<A> withNewClientIPLike(V1ClientIPConfig item) {
    return new ClientIPNested(item);
  }
  public class ClientIPNested<N> extends V1ClientIPConfigFluent<ClientIPNested<N>> implements Nested<N>{
  
    V1ClientIPConfigBuilder builder;
  
    ClientIPNested(V1ClientIPConfig item) {
      this.builder = new V1ClientIPConfigBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SessionAffinityConfigFluent.this.withClientIP(builder.build());
    }
    
    public N endClientIP() {
      return and();
    }
    
  }
}