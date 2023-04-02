package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1HTTPGetActionFluentImpl<A extends V1HTTPGetActionFluent<A>> extends BaseFluent<A> implements V1HTTPGetActionFluent<A>{
  public V1HTTPGetActionFluentImpl() {
  }
  public V1HTTPGetActionFluentImpl(V1HTTPGetAction instance) {
    this.withHost(instance.getHost());

    this.withHttpHeaders(instance.getHttpHeaders());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.withScheme(instance.getScheme());

  }
  private String host;
  private ArrayList<V1HTTPHeaderBuilder> httpHeaders;
  private String path;
  private IntOrString port;
  private String scheme;
  public String getHost() {
    return this.host;
  }
  public A withHost(String host) {
    this.host=host; return (A) this;
  }
  public Boolean hasHost() {
    return this.host != null;
  }
  public A addToHttpHeaders(Integer index,V1HTTPHeader item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").add(index >= 0 ? index : _visitables.get("httpHeaders").size(), builder);this.httpHeaders.add(index >= 0 ? index : httpHeaders.size(), builder); return (A)this;
  }
  public A setToHttpHeaders(Integer index,V1HTTPHeader item) {
    if (this.httpHeaders == null) {this.httpHeaders = new ArrayList<V1HTTPHeaderBuilder>();}
    V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);
    if (index < 0 || index >= _visitables.get("httpHeaders").size()) { _visitables.get("httpHeaders").add(builder); } else { _visitables.get("httpHeaders").set(index, builder);}
    if (index < 0 || index >= httpHeaders.size()) { httpHeaders.add(builder); } else { httpHeaders.set(index, builder);}
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
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").remove(builder);if (this.httpHeaders != null) {this.httpHeaders.remove(builder);}} return (A)this;
  }
  public A removeAllFromHttpHeaders(Collection<V1HTTPHeader> items) {
    for (V1HTTPHeader item : items) {V1HTTPHeaderBuilder builder = new V1HTTPHeaderBuilder(item);_visitables.get("httpHeaders").remove(builder);if (this.httpHeaders != null) {this.httpHeaders.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildHttpHeaders instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HTTPHeader> getHttpHeaders() {
    return httpHeaders != null ? build(httpHeaders) : null;
  }
  public List<V1HTTPHeader> buildHttpHeaders() {
    return httpHeaders != null ? build(httpHeaders) : null;
  }
  public V1HTTPHeader buildHttpHeader(Integer index) {
    return this.httpHeaders.get(index).build();
  }
  public V1HTTPHeader buildFirstHttpHeader() {
    return this.httpHeaders.get(0).build();
  }
  public V1HTTPHeader buildLastHttpHeader() {
    return this.httpHeaders.get(httpHeaders.size() - 1).build();
  }
  public V1HTTPHeader buildMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
    for (V1HTTPHeaderBuilder item: httpHeaders) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
    for (V1HTTPHeaderBuilder item: httpHeaders) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withHttpHeaders(List<V1HTTPHeader> httpHeaders) {
    if (this.httpHeaders != null) { _visitables.get("httpHeaders").removeAll(this.httpHeaders);}
    if (httpHeaders != null) {this.httpHeaders = new ArrayList(); for (V1HTTPHeader item : httpHeaders){this.addToHttpHeaders(item);}} else { this.httpHeaders = null;} return (A) this;
  }
  public A withHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... httpHeaders) {
    if (this.httpHeaders != null) {this.httpHeaders.clear();}
    if (httpHeaders != null) {for (V1HTTPHeader item :httpHeaders){ this.addToHttpHeaders(item);}} return (A) this;
  }
  public Boolean hasHttpHeaders() {
    return httpHeaders != null && !httpHeaders.isEmpty();
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader() {
    return new V1HTTPGetActionFluentImpl.HttpHeadersNestedImpl();
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeaderLike(V1HTTPHeader item) {
    return new V1HTTPGetActionFluentImpl.HttpHeadersNestedImpl(-1, item);
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> setNewHttpHeaderLike(Integer index,V1HTTPHeader item) {
    return new V1HTTPGetActionFluentImpl.HttpHeadersNestedImpl(index, item);
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editHttpHeader(Integer index) {
    if (httpHeaders.size() <= index) throw new RuntimeException("Can't edit httpHeaders. Index exceeds size.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editFirstHttpHeader() {
    if (httpHeaders.size() == 0) throw new RuntimeException("Can't edit first httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(0, buildHttpHeader(0));
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editLastHttpHeader() {
    int index = httpHeaders.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }
  public V1HTTPGetActionFluent.HttpHeadersNested<A> editMatchingHttpHeader(Predicate<V1HTTPHeaderBuilder> predicate) {
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
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public IntOrString getPort() {
    return this.port;
  }
  public A withPort(IntOrString port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
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
    this.scheme=scheme; return (A) this;
  }
  public Boolean hasScheme() {
    return this.scheme != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPGetActionFluentImpl that = (V1HTTPGetActionFluentImpl) o;
    if (host != null ? !host.equals(that.host) :that.host != null) return false;
    if (httpHeaders != null ? !httpHeaders.equals(that.httpHeaders) :that.httpHeaders != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (scheme != null ? !scheme.equals(that.scheme) :that.scheme != null) return false;
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
  class HttpHeadersNestedImpl<N> extends V1HTTPHeaderFluentImpl<V1HTTPGetActionFluent.HttpHeadersNested<N>> implements V1HTTPGetActionFluent.HttpHeadersNested<N>,Nested<N>{
    HttpHeadersNestedImpl(Integer index,V1HTTPHeader item) {
      this.index = index;
      this.builder = new V1HTTPHeaderBuilder(this, item);
    }
    HttpHeadersNestedImpl() {
      this.index = -1;
      this.builder = new V1HTTPHeaderBuilder(this);
    }
    V1HTTPHeaderBuilder builder;
    Integer index;
    public N and() {
      return (N) V1HTTPGetActionFluentImpl.this.setToHttpHeaders(index,builder.build());
    }
    public N endHttpHeader() {
      return and();
    }
    
  }
  
}