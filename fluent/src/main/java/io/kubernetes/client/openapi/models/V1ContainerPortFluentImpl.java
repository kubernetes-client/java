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
public class V1ContainerPortFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ContainerPortFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ContainerPortFluent<A> {
  public V1ContainerPortFluentImpl() {}

  public V1ContainerPortFluentImpl(io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());
  }

  private java.lang.Integer containerPort;
  private java.lang.String hostIP;
  private java.lang.Integer hostPort;
  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum protocol;

  public java.lang.Integer getContainerPort() {
    return this.containerPort;
  }

  public A withContainerPort(java.lang.Integer containerPort) {
    this.containerPort = containerPort;
    return (A) this;
  }

  public java.lang.Boolean hasContainerPort() {
    return this.containerPort != null;
  }

  public java.lang.String getHostIP() {
    return this.hostIP;
  }

  public A withHostIP(java.lang.String hostIP) {
    this.hostIP = hostIP;
    return (A) this;
  }

  public java.lang.Boolean hasHostIP() {
    return this.hostIP != null;
  }

  /** Method is deprecated. use withHostIP instead. */
  @java.lang.Deprecated
  public A withNewHostIP(java.lang.String original) {
    return (A) withHostIP(new String(original));
  }

  public java.lang.Integer getHostPort() {
    return this.hostPort;
  }

  public A withHostPort(java.lang.Integer hostPort) {
    this.hostPort = hostPort;
    return (A) this;
  }

  public java.lang.Boolean hasHostPort() {
    return this.hostPort != null;
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

  public io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum getProtocol() {
    return this.protocol;
  }

  public A withProtocol(io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum protocol) {
    this.protocol = protocol;
    return (A) this;
  }

  public java.lang.Boolean hasProtocol() {
    return this.protocol != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerPortFluentImpl that = (V1ContainerPortFluentImpl) o;
    if (containerPort != null
        ? !containerPort.equals(that.containerPort)
        : that.containerPort != null) return false;
    if (hostIP != null ? !hostIP.equals(that.hostIP) : that.hostIP != null) return false;
    if (hostPort != null ? !hostPort.equals(that.hostPort) : that.hostPort != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        containerPort, hostIP, hostPort, name, protocol, super.hashCode());
  }
}
