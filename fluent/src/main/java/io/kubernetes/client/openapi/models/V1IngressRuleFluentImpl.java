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

/** Generated */
public class V1IngressRuleFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1IngressRuleFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1IngressRuleFluent<A> {
  public V1IngressRuleFluentImpl() {}

  public V1IngressRuleFluentImpl(io.kubernetes.client.openapi.models.V1IngressRule instance) {
    this.withHost(instance.getHost());

    this.withHttp(instance.getHttp());
  }

  private java.lang.String host;
  private io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder http;

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

  /**
   * This method has been deprecated, please use method buildHttp instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue getHttp() {
    return this.http != null ? this.http.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue buildHttp() {
    return this.http != null ? this.http.build() : null;
  }

  public A withHttp(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue http) {
    _visitables.get("http").remove(this.http);
    if (http != null) {
      this.http = new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder(http);
      _visitables.get("http").add(this.http);
    }
    return (A) this;
  }

  public java.lang.Boolean hasHttp() {
    return this.http != null;
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttp() {
    return new io.kubernetes.client.openapi.models.V1IngressRuleFluentImpl.HttpNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<A> withNewHttpLike(
      io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item) {
    return new io.kubernetes.client.openapi.models.V1IngressRuleFluentImpl.HttpNestedImpl(item);
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

  public boolean equals(java.lang.Object o) {
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

  public class HttpNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueFluentImpl<
          io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<N>>
      implements io.kubernetes.client.openapi.models.V1IngressRuleFluent.HttpNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HttpNestedImpl(io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValueBuilder(this, item);
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
