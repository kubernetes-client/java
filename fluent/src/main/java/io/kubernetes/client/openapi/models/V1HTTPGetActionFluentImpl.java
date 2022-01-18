/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1HTTPGetActionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<A> {
  public V1HTTPGetActionFluentImpl() {}

  public V1HTTPGetActionFluentImpl(io.kubernetes.client.openapi.models.V1HTTPGetAction instance) {
    this.withHost(instance.getHost());

    this.withHttpHeaders(instance.getHttpHeaders());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

    this.withScheme(instance.getScheme());
  }

  private java.lang.String host;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> httpHeaders;
  private java.lang.String path;
  private io.kubernetes.client.custom.IntOrString port;
  private io.kubernetes.client.openapi.models.V1HTTPGetAction.SchemeEnum scheme;

  public java.lang.String getHost() {
    return this.host;
  }

  public A withHost(java.lang.String host) {
    this.host = host;
    return (A) this;
  }

  public java.lang.Boolean hasHost() {
    return this.host != null;
  }

  /** Method is deprecated. use withHost instead. */
  @java.lang.Deprecated
  public A withNewHost(java.lang.String original) {
    return (A) withHost(new String(original));
  }

  public A addToHttpHeaders(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item) {
    if (this.httpHeaders == null) {
      this.httpHeaders =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
        new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
    _visitables
        .get("httpHeaders")
        .add(index >= 0 ? index : _visitables.get("httpHeaders").size(), builder);
    this.httpHeaders.add(index >= 0 ? index : httpHeaders.size(), builder);
    return (A) this;
  }

  public A setToHttpHeaders(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item) {
    if (this.httpHeaders == null) {
      this.httpHeaders =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>();
    }
    io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
        new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
    if (index < 0 || index >= _visitables.get("httpHeaders").size()) {
      _visitables.get("httpHeaders").add(builder);
    } else {
      _visitables.get("httpHeaders").set(index, builder);
    }
    if (index < 0 || index >= httpHeaders.size()) {
      httpHeaders.add(builder);
    } else {
      httpHeaders.set(index, builder);
    }
    return (A) this;
  }

  public A addToHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items) {
    if (this.httpHeaders == null) {
      this.httpHeaders =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HTTPHeader item : items) {
      io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
      _visitables.get("httpHeaders").add(builder);
      this.httpHeaders.add(builder);
    }
    return (A) this;
  }

  public A addAllToHttpHeaders(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items) {
    if (this.httpHeaders == null) {
      this.httpHeaders =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1HTTPHeader item : items) {
      io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
      _visitables.get("httpHeaders").add(builder);
      this.httpHeaders.add(builder);
    }
    return (A) this;
  }

  public A removeFromHttpHeaders(io.kubernetes.client.openapi.models.V1HTTPHeader... items) {
    for (io.kubernetes.client.openapi.models.V1HTTPHeader item : items) {
      io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
      _visitables.get("httpHeaders").remove(builder);
      if (this.httpHeaders != null) {
        this.httpHeaders.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromHttpHeaders(
      java.util.Collection<io.kubernetes.client.openapi.models.V1HTTPHeader> items) {
    for (io.kubernetes.client.openapi.models.V1HTTPHeader item : items) {
      io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder =
          new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(item);
      _visitables.get("httpHeaders").remove(builder);
      if (this.httpHeaders != null) {
        this.httpHeaders.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromHttpHeaders(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
          predicate) {
    if (httpHeaders == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder> each =
        httpHeaders.iterator();
    final List visitables = _visitables.get("httpHeaders");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildHttpHeaders instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> getHttpHeaders() {
    return httpHeaders != null ? build(httpHeaders) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> buildHttpHeaders() {
    return httpHeaders != null ? build(httpHeaders) : null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildHttpHeader(java.lang.Integer index) {
    return this.httpHeaders.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildFirstHttpHeader() {
    return this.httpHeaders.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildLastHttpHeader() {
    return this.httpHeaders.get(httpHeaders.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1HTTPHeader buildMatchingHttpHeader(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder item : httpHeaders) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingHttpHeader(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder item : httpHeaders) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withHttpHeaders(
      java.util.List<io.kubernetes.client.openapi.models.V1HTTPHeader> httpHeaders) {
    if (this.httpHeaders != null) {
      _visitables.get("httpHeaders").removeAll(this.httpHeaders);
    }
    if (httpHeaders != null) {
      this.httpHeaders = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1HTTPHeader item : httpHeaders) {
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
    }
    if (httpHeaders != null) {
      for (io.kubernetes.client.openapi.models.V1HTTPHeader item : httpHeaders) {
        this.addToHttpHeaders(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasHttpHeaders() {
    return httpHeaders != null && !httpHeaders.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      addNewHttpHeader() {
    return new io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl
        .HttpHeadersNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      addNewHttpHeaderLike(io.kubernetes.client.openapi.models.V1HTTPHeader item) {
    return new io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl.HttpHeadersNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      setNewHttpHeaderLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item) {
    return new io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl.HttpHeadersNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editHttpHeader(java.lang.Integer index) {
    if (httpHeaders.size() <= index)
      throw new RuntimeException("Can't edit httpHeaders. Index exceeds size.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editFirstHttpHeader() {
    if (httpHeaders.size() == 0)
      throw new RuntimeException("Can't edit first httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(0, buildHttpHeader(0));
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editLastHttpHeader() {
    int index = httpHeaders.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last httpHeaders. The list is empty.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<A>
      editMatchingHttpHeader(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < httpHeaders.size(); i++) {
      if (predicate.test(httpHeaders.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching httpHeaders. No match found.");
    return setNewHttpHeaderLike(index, buildHttpHeader(index));
  }

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
  }

  public io.kubernetes.client.custom.IntOrString getPort() {
    return this.port;
  }

  public A withPort(io.kubernetes.client.custom.IntOrString port) {
    this.port = port;
    return (A) this;
  }

  public java.lang.Boolean hasPort() {
    return this.port != null;
  }

  public A withNewPort(int value) {
    return (A) withPort(new IntOrString(value));
  }

  public A withNewPort(java.lang.String value) {
    return (A) withPort(new IntOrString(value));
  }

  public io.kubernetes.client.openapi.models.V1HTTPGetAction.SchemeEnum getScheme() {
    return this.scheme;
  }

  public A withScheme(io.kubernetes.client.openapi.models.V1HTTPGetAction.SchemeEnum scheme) {
    this.scheme = scheme;
    return (A) this;
  }

  public java.lang.Boolean hasScheme() {
    return this.scheme != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPGetActionFluentImpl that = (V1HTTPGetActionFluentImpl) o;
    if (host != null ? !host.equals(that.host) : that.host != null) return false;
    if (httpHeaders != null ? !httpHeaders.equals(that.httpHeaders) : that.httpHeaders != null)
      return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (scheme != null ? !scheme.equals(that.scheme) : that.scheme != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(host, httpHeaders, path, port, scheme, super.hashCode());
  }

  public class HttpHeadersNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HTTPHeaderFluentImpl<
          io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<N>>
      implements io.kubernetes.client.openapi.models.V1HTTPGetActionFluent.HttpHeadersNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HttpHeadersNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1HTTPHeader item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(this, item);
    }

    HttpHeadersNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HTTPHeaderBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1HTTPGetActionFluentImpl.this.setToHttpHeaders(index, builder.build());
    }

    public N endHttpHeader() {
      return and();
    }
  }
}
