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
  public class V1IngressRuleFluentImpl<A extends V1IngressRuleFluent<A>> extends BaseFluent<A> implements V1IngressRuleFluent<A>{
  public V1IngressRuleFluentImpl() {
  }
  public V1IngressRuleFluentImpl(V1IngressRule instance) {
    this.withHost(instance.getHost());

    this.withHttp(instance.getHttp());

  }
  private String host;
  private V1HTTPIngressRuleValueBuilder http;
  public String getHost() {
    return this.host;
  }
  public A withHost(String host) {
    this.host=host; return (A) this;
  }
  public Boolean hasHost() {
    return this.host != null;
  }
  
  /**
   * This method has been deprecated, please use method buildHttp instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPIngressRuleValue getHttp() {
    return this.http!=null ?this.http.build():null;
  }
  public V1HTTPIngressRuleValue buildHttp() {
    return this.http!=null ?this.http.build():null;
  }
  public A withHttp(V1HTTPIngressRuleValue http) {
    _visitables.get("http").remove(this.http);
    if (http!=null){ this.http= new V1HTTPIngressRuleValueBuilder(http); _visitables.get("http").add(this.http);} else { this.http = null; _visitables.get("http").remove(this.http); } return (A) this;
  }
  public Boolean hasHttp() {
    return this.http != null;
  }
  public V1IngressRuleFluent.HttpNested<A> withNewHttp() {
    return new V1IngressRuleFluentImpl.HttpNestedImpl();
  }
  public V1IngressRuleFluent.HttpNested<A> withNewHttpLike(V1HTTPIngressRuleValue item) {
    return new V1IngressRuleFluentImpl.HttpNestedImpl(item);
  }
  public V1IngressRuleFluent.HttpNested<A> editHttp() {
    return withNewHttpLike(getHttp());
  }
  public V1IngressRuleFluent.HttpNested<A> editOrNewHttp() {
    return withNewHttpLike(getHttp() != null ? getHttp(): new V1HTTPIngressRuleValueBuilder().build());
  }
  public V1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(V1HTTPIngressRuleValue item) {
    return withNewHttpLike(getHttp() != null ? getHttp(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressRuleFluentImpl that = (V1IngressRuleFluentImpl) o;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
    if (http != null ? !http.equals(that.http) :that.http != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(host,  http,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (http != null) { sb.append("http:"); sb.append(http); }
    sb.append("}");
    return sb.toString();
  }
  class HttpNestedImpl<N> extends V1HTTPIngressRuleValueFluentImpl<V1IngressRuleFluent.HttpNested<N>> implements V1IngressRuleFluent.HttpNested<N>,Nested<N>{
    HttpNestedImpl(V1HTTPIngressRuleValue item) {
      this.builder = new V1HTTPIngressRuleValueBuilder(this, item);
    }
    HttpNestedImpl() {
      this.builder = new V1HTTPIngressRuleValueBuilder(this);
    }
    V1HTTPIngressRuleValueBuilder builder;
    public N and() {
      return (N) V1IngressRuleFluentImpl.this.withHttp(builder.build());
    }
    public N endHttp() {
      return and();
    }
    
  }
  
}