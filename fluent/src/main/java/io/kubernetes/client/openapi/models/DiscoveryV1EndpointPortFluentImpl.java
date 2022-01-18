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
public class DiscoveryV1EndpointPortFluentImpl<
        A extends io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<A> {
  public DiscoveryV1EndpointPortFluentImpl() {}

  public DiscoveryV1EndpointPortFluentImpl(
      io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort instance) {
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());
  }

  private java.lang.String appProtocol;
  private java.lang.String name;
  private java.lang.Integer port;
  private java.lang.String protocol;

  public java.lang.String getAppProtocol() {
    return this.appProtocol;
  }

  public A withAppProtocol(java.lang.String appProtocol) {
    this.appProtocol = appProtocol;
    return (A) this;
  }

  public java.lang.Boolean hasAppProtocol() {
    return this.appProtocol != null;
  }

  /** Method is deprecated. use withAppProtocol instead. */
  @java.lang.Deprecated
  public A withNewAppProtocol(java.lang.String original) {
    return (A) withAppProtocol(new String(original));
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public java.lang.Integer getPort() {
    return this.port;
  }

  public A withPort(java.lang.Integer port) {
    this.port = port;
    return (A) this;
  }

  public java.lang.Boolean hasPort() {
    return this.port != null;
  }

  public java.lang.String getProtocol() {
    return this.protocol;
  }

  public A withProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return (A) this;
  }

  public java.lang.Boolean hasProtocol() {
    return this.protocol != null;
  }

  /** Method is deprecated. use withProtocol instead. */
  @java.lang.Deprecated
  public A withNewProtocol(java.lang.String original) {
    return (A) withProtocol(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscoveryV1EndpointPortFluentImpl that = (DiscoveryV1EndpointPortFluentImpl) o;
    if (appProtocol != null ? !appProtocol.equals(that.appProtocol) : that.appProtocol != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(appProtocol, name, port, protocol, super.hashCode());
  }
}
