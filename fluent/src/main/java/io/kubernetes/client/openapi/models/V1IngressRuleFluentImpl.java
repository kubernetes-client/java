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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1IngressRuleFluentImpl<A extends V1IngressRuleFluent<A>> extends BaseFluent<A>
    implements V1IngressRuleFluent<A> {
  public V1IngressRuleFluentImpl() {}

  public V1IngressRuleFluentImpl(io.kubernetes.client.openapi.models.V1IngressRule instance) {
    this.withHost(instance.getHost());

    this.withHttp(instance.getHttp());
  }

  private String host;
  private V1HTTPIngressRuleValueBuilder http;

  public java.lang.String getHost() {
    return this.host;
  }

  public A withHost(java.lang.String host) {
    this.host = host;
    return (A) this;
  }

  public Boolean hasHost() {
    return this.host != null;
  }

  /**
   * This method has been deprecated, please use method buildHttp instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue getHttp() {
    return this.http != null ? this.http.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue buildHttp() {
    return this.http != null ? this.http.build() : null;
  }

  public A withHttp(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue http) {
    _visitables.get("http").remove(this.http);
    if (http != null) {
      this.http = new V1HTTPIngressRuleValueBuilder(http);
      _visitables.get("http").add(this.http);
    }
    return (A) this;
  }

  public java.lang.Boolean hasHttp() {
    return this.http != null;
  }

  public V1IngressRuleFluent.HttpNested<A> withNewHttp() {
    return new V1IngressRuleFluentImpl.HttpNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttpLike(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item) {
    return new V1IngressRuleFluentImpl.HttpNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editHttp() {
    return withNewHttpLike(getHttp());
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttp() {
    return withNewHttpLike(
        getHttp() != null
            ? getHttp()
            : new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item) {
    return withNewHttpLike(getHttp() != null ? getHttp() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressRuleFluentImpl that = (V1IngressRuleFluentImpl) o;
    if (host != null ? !host.equals(that.host) : that.host != null) return false;
    if (http != null ? !http.equals(that.http) : that.http != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(host, http, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) {
      sb.append("host:");
      sb.append(host + ",");
    }
    if (http != null) {
      sb.append("http:");
      sb.append(http);
    }
    sb.append("}");
    return sb.toString();
  }

  class HttpNestedImpl<N>
      extends V1HTTPIngressRuleValueFluentImpl<V1IngressRuleFluent.HttpNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<N>, Nested<N> {
    HttpNestedImpl(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item) {
      this.builder = new V1HTTPIngressRuleValueBuilder(this, item);
    }

    HttpNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder builder;

    public N and() {
      return (N) V1IngressRuleFluentImpl.this.withHttp(builder.build());
    }

    public N endHttp() {
      return and();
    }
  }
}
