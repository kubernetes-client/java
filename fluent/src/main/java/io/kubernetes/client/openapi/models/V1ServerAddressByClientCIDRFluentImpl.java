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
public class V1ServerAddressByClientCIDRFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A> {
  public V1ServerAddressByClientCIDRFluentImpl() {}

  public V1ServerAddressByClientCIDRFluentImpl(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());
  }

  private java.lang.String clientCIDR;
  private java.lang.String serverAddress;

  public java.lang.String getClientCIDR() {
    return this.clientCIDR;
  }

  public A withClientCIDR(java.lang.String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return (A) this;
  }

  public java.lang.Boolean hasClientCIDR() {
    return this.clientCIDR != null;
  }

  /** Method is deprecated. use withClientCIDR instead. */
  @java.lang.Deprecated
  public A withNewClientCIDR(java.lang.String original) {
    return (A) withClientCIDR(new String(original));
  }

  public java.lang.String getServerAddress() {
    return this.serverAddress;
  }

  public A withServerAddress(java.lang.String serverAddress) {
    this.serverAddress = serverAddress;
    return (A) this;
  }

  public java.lang.Boolean hasServerAddress() {
    return this.serverAddress != null;
  }

  /** Method is deprecated. use withServerAddress instead. */
  @java.lang.Deprecated
  public A withNewServerAddress(java.lang.String original) {
    return (A) withServerAddress(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServerAddressByClientCIDRFluentImpl that = (V1ServerAddressByClientCIDRFluentImpl) o;
    if (clientCIDR != null ? !clientCIDR.equals(that.clientCIDR) : that.clientCIDR != null)
      return false;
    if (serverAddress != null
        ? !serverAddress.equals(that.serverAddress)
        : that.serverAddress != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(clientCIDR, serverAddress, super.hashCode());
  }
}
