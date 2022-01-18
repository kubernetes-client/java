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
public class V1SessionAffinityConfigFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent<A> {
  public V1SessionAffinityConfigFluentImpl() {}

  public V1SessionAffinityConfigFluentImpl(
      io.kubernetes.client.openapi.models.V1SessionAffinityConfig instance) {
    this.withClientIP(instance.getClientIP());
  }

  private io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder clientIP;

  /**
   * This method has been deprecated, please use method buildClientIP instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ClientIPConfig getClientIP() {
    return this.clientIP != null ? this.clientIP.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ClientIPConfig buildClientIP() {
    return this.clientIP != null ? this.clientIP.build() : null;
  }

  public A withClientIP(io.kubernetes.client.openapi.models.V1ClientIPConfig clientIP) {
    _visitables.get("clientIP").remove(this.clientIP);
    if (clientIP != null) {
      this.clientIP = new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder(clientIP);
      _visitables.get("clientIP").add(this.clientIP);
    }
    return (A) this;
  }

  public java.lang.Boolean hasClientIP() {
    return this.clientIP != null;
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      withNewClientIP() {
    return new io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluentImpl
        .ClientIPNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      withNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
    return new io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluentImpl
        .ClientIPNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editClientIP() {
    return withNewClientIPLike(getClientIP());
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editOrNewClientIP() {
    return withNewClientIPLike(
        getClientIP() != null
            ? getClientIP()
            : new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<A>
      editOrNewClientIPLike(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
    return withNewClientIPLike(getClientIP() != null ? getClientIP() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SessionAffinityConfigFluentImpl that = (V1SessionAffinityConfigFluentImpl) o;
    if (clientIP != null ? !clientIP.equals(that.clientIP) : that.clientIP != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(clientIP, super.hashCode());
  }

  public class ClientIPNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluentImpl<
          io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<N>>
      implements io.kubernetes.client.openapi.models.V1SessionAffinityConfigFluent.ClientIPNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ClientIPNestedImpl(io.kubernetes.client.openapi.models.V1ClientIPConfig item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder(this, item);
    }

    ClientIPNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ClientIPConfigBuilder builder;

    public N and() {
      return (N) V1SessionAffinityConfigFluentImpl.this.withClientIP(builder.build());
    }

    public N endClientIP() {
      return and();
    }
  }
}
