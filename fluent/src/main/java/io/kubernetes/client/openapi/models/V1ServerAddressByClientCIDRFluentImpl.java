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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ServerAddressByClientCIDRFluentImpl<A extends V1ServerAddressByClientCIDRFluent<A>>
    extends BaseFluent<A> implements V1ServerAddressByClientCIDRFluent<A> {
  public V1ServerAddressByClientCIDRFluentImpl() {}

  public V1ServerAddressByClientCIDRFluentImpl(
      io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR instance) {
    this.withClientCIDR(instance.getClientCIDR());

    this.withServerAddress(instance.getServerAddress());
  }

  private String clientCIDR;
  private java.lang.String serverAddress;

  public java.lang.String getClientCIDR() {
    return this.clientCIDR;
  }

  public A withClientCIDR(java.lang.String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return (A) this;
  }

  public Boolean hasClientCIDR() {
    return this.clientCIDR != null;
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

  public boolean equals(Object o) {
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientCIDR != null) {
      sb.append("clientCIDR:");
      sb.append(clientCIDR + ",");
    }
    if (serverAddress != null) {
      sb.append("serverAddress:");
      sb.append(serverAddress);
    }
    sb.append("}");
    return sb.toString();
  }
}
