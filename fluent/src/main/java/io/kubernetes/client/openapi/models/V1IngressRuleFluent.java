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
public class V1IngressRuleFluent<A extends io.kubernetes.client.openapi.models.V1IngressRuleFluent<A>> extends BaseFluent<A>{
  public V1IngressRuleFluent() {
  }
  
  public V1IngressRuleFluent(V1IngressRule instance) {
    this.copyInstance(instance);
  }
  private String host;
  private V1HTTPIngressRuleValueBuilder http;
  
  protected void copyInstance(V1IngressRule instance) {
    instance = instance != null ? instance : new V1IngressRule();
    if (instance != null) {
        this.withHost(instance.getHost());
        this.withHttp(instance.getHttp());
    }
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
  
  public V1HTTPIngressRuleValue buildHttp() {
    return this.http != null ? this.http.build() : null;
  }
  
  public A withHttp(V1HTTPIngressRuleValue http) {
    this._visitables.remove("http");
    if (http != null) {
        this.http = new V1HTTPIngressRuleValueBuilder(http);
        this._visitables.get("http").add(this.http);
    } else {
        this.http = null;
        this._visitables.get("http").remove(this.http);
    }
    return (A) this;
  }
  
  public boolean hasHttp() {
    return this.http != null;
  }
  
  public HttpNested<A> withNewHttp() {
    return new HttpNested(null);
  }
  
  public HttpNested<A> withNewHttpLike(V1HTTPIngressRuleValue item) {
    return new HttpNested(item);
  }
  
  public HttpNested<A> editHttp() {
    return this.withNewHttpLike(Optional.ofNullable(this.buildHttp()).orElse(null));
  }
  
  public HttpNested<A> editOrNewHttp() {
    return this.withNewHttpLike(Optional.ofNullable(this.buildHttp()).orElse(new V1HTTPIngressRuleValueBuilder().build()));
  }
  
  public HttpNested<A> editOrNewHttpLike(V1HTTPIngressRuleValue item) {
    return this.withNewHttpLike(Optional.ofNullable(this.buildHttp()).orElse(item));
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
    V1IngressRuleFluent that = (V1IngressRuleFluent) o;
    if (!(Objects.equals(host, that.host))) {
      return false;
    }
    if (!(Objects.equals(http, that.http))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(host, http);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(host == null)) {
        sb.append("host:");
        sb.append(host);
        sb.append(",");
    }
    if (!(http == null)) {
        sb.append("http:");
        sb.append(http);
    }
    sb.append("}");
    return sb.toString();
  }
  public class HttpNested<N> extends V1HTTPIngressRuleValueFluent<HttpNested<N>> implements Nested<N>{
    HttpNested(V1HTTPIngressRuleValue item) {
      this.builder = new V1HTTPIngressRuleValueBuilder(this, item);
    }
    V1HTTPIngressRuleValueBuilder builder;
    
    public N and() {
      return (N) V1IngressRuleFluent.this.withHttp(builder.build());
    }
    
    public N endHttp() {
      return and();
    }
    
  
  }

}