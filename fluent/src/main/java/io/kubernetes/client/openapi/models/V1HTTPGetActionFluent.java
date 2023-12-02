package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HTTPGetActionFluent<A extends V1HTTPGetActionFluent<A>> extends BaseFluent<A>{
  public V1HTTPGetActionFluent() {
  }
  
  public V1HTTPGetActionFluent(V1HTTPGetAction instance) {
    this.copyInstance(instance);
  }
  private String host;
  private ArrayList<V1HTTPHeaderBuilder> httpHeaders;
  private String path;
  private IntOrString port;
  private String scheme;
  
  protected void copyInstance(V1HTTPGetAction instance) {
    instance = (instance != null ? instance : new V1HTTPGetAction());
    if (instance != null) {
          this.withHost(instance.getHost());
          this.withHttpHeaders(instance.getHttpHeaders());
          this.withPath(instance.getPath());
          this.withPort(instance.getPort());
          this.withScheme(instance.getScheme());
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
  
  public A addToHttpHeaders(int index,V1HTTPHeader item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);
    if (index < 0 || index >= httpHeaders.size()) { _visitables.get("httpHeaders").add(builder); httpHeaders.add(builder); } else { _visitables.get("httpHeaders").add(index, builder); httpHeaders.add(index, builder);}
    return (A)this;
  }
  
  public A setToHttpHeaders(int index,V1HTTPHeader item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);
    if (index < 0 || index >= httpHeaders.size()) { _visitables.get("httpHeaders").add(builder); httpHeaders.add(builder); } else { _visitables.get("httpHeaders").set(index, builder); httpHeaders.set(index, builder);}
    return (A)this;
  }
  
  public A addToHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").add(builder);this.httpHeaders.add(builder);} return (A)this;
  }
  
  public A addAllToHttpHeaders(Collection<V1HTTPHeader> items) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").add(builder);this.httpHeaders.add(builder);} return (A)this;
  }
  
  public A removeFromHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items) {
    if (this.httpHeaders == null) return (A)this;
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").remove(builder); this.httpHeaders.remove(builder);} return (A)this;
  }
  
  public A removeAllFromHttpHeaders(Collection<V1HTTPHeader> items) {
    if (this.httpHeaders == null) return (A)this;
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").remove(builder); this.httpHeaders.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromHttpHeaders(Predicate<V1HTTPHeaderBuilder> predicate) {
    if (httpHeaders == null) return (A) this;
    final Iterator<V1HTTPHeaderBuilder> each = httpHeaders.iterator();
    final List visitables = _visitables.get("httpHeaders");
    while (each.hasNext()) {
      V1HTTPHeaderBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1HTTPHeader> buildHttpHeaders() {
    return this.httpHeaders != null ? build(httpHeaders) : null;
  }
  
  public V1HTTPHeader buildHttpHeader(int index) {
    return this.httpHeaders.get(index).build();
  }
  
  public V1HTTPHeader buildFirstHttpHeader() {
    return this.httpHeaders.get(0).build();
  }
  
  public V1HTTPHeader buildLastHttpHeader() {
    return this.httpHeaders.get(httpHeaders.size() - 1).build();
  }
  
  public V1HTTPHeader buildMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
      for (V1HTTPHeaderBuilder item : httpHeaders) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
      for (V1HTTPHeaderBuilder item : httpHeaders) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withHttpHeaders(List<V1HTTPHeader> httpHeaders) {
    if (this.httpHeaders != null) {
      this._visitables.get("httpHeaders").clear();
    }
    if (httpHeaders != null) {
        this.httpHeaders = new ArrayList();
        for (V1HTTPHeader item : httpHeaders) {
          this.addToHttpHeaders(item);
        }
    } else {
      this.httpHeaders = null;
    }
    return (A) this;
  }
  
  public A withHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... httpHeaders) {
    if (this.httpHeaders != null) {
        this.httpHeaders.clear();
        _visitables.remove("httpHeaders");
    }
    if (httpHeaders != null) {
      for (V1HTTPHeader item : httpHeaders) {
        this.addToHttpHeaders(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasHttpHeaders() {
    return this.httpHeaders != null && !this.httpHeaders.isEmpty();
  }
  
  public HttpHeadersNested<A> addNewHttpHeader() {
    return new HttpHeadersNested(-1, null);
  }
  
  public HttpHeadersNested<A> addNewHttpHeaderLike(V1HTTPHeader item) {
    return new HttpHeadersNested(-1, item);
  }
  
  public HttpHeadersNested<A> setNewHttpHeaderLike(int index,V1HTTPHeader item) {
    return new HttpHeadersNested(index, item);
  }
  
  public HttpHeadersNested<A> editHttpHeader(int index) {
    if (httpHeaders.size() <= index) throw new RuntimeException("Can't edit httpHeaders. Index exceeds size.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public HttpHeadersNested<A> editFirstHttpHeader() {
    if (httpHeaders.size() == 0) throw new RuntimeException("Can't edit first httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(0, buildHttpHeader(0));
  }
  
  public HttpHeadersNested<A> editLastHttpHeader() {
    int index = httpHeaders.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public HttpHeadersNested<A> editMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
    int index = -1;
    for (int i=0;i<httpHeaders.size();i++) { 
    if (predicate.test(httpHeaders.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching httpHeaders. No match found.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public IntOrString getPort() {
    return this.port;
  }
  
  public A withPort(IntOrString port) {
    this.port = port;
    return (A) this;
  }
  
  public boolean hasPort() {
    return this.port != null;
  }
  
  public A withNewPort(int value) {
    return (A)withPort(new IntOrString(value));
  }
  
  public A withNewPort(String value) {
    return (A)withPort(new IntOrString(value));
  }
  
  public String getScheme() {
    return this.scheme;
  }
  
  public A withScheme(String scheme) {
    this.scheme = scheme;
    return (A) this;
  }
  
  public boolean hasScheme() {
    return this.scheme != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HTTPGetActionFluent that = (V1HTTPGetActionFluent) o;
    if (!java.util.Objects.equals(host, that.host)) return false;
    if (!java.util.Objects.equals(httpHeaders, that.httpHeaders)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(port, that.port)) return false;
    if (!java.util.Objects.equals(scheme, that.scheme)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(host,  httpHeaders,  path,  port,  scheme,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) { sb.append("host:"); sb.append(host + ","); }
    if (httpHeaders != null && !httpHeaders.isEmpty()) { sb.append("httpHeaders:"); sb.append(httpHeaders + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (port != null) { sb.append("port:"); sb.append(port + ","); }
    if (scheme != null) { sb.append("scheme:"); sb.append(scheme); }
    sb.append("}");
    return sb.toString();
  }
  public class HttpHeadersNested<N> extends V1HTTPHeaderFluent<HttpHeadersNested<N>> implements Nested<N>{
    HttpHeadersNested(int index,V1HTTPHeader item) {
      this.index = index;
      this.builder = new V1HTTPHeaderBuilder(this, item);
    }
    V1HTTPHeaderBuilder builder;
    int index;
    
    public N and() {
      return (N) V1HTTPGetActionFluent.this.setToHttpHeaders(index,builder.build());
    }
    
    public N endHttpHeader() {
      return and();
    }
    
  
  }

}