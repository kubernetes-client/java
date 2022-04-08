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
import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1NetworkPolicyPortFluentImpl<A extends V1NetworkPolicyPortFluent<A>>
    extends BaseFluent<A> implements V1NetworkPolicyPortFluent<A> {
  public V1NetworkPolicyPortFluentImpl() {}

  public V1NetworkPolicyPortFluentImpl(
      io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance) {
    this.withEndPort(instance.getEndPort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());
  }

  private Integer endPort;
  private IntOrString port;
  private String protocol;

  public java.lang.Integer getEndPort() {
    return this.endPort;
  }

  public A withEndPort(java.lang.Integer endPort) {
    this.endPort = endPort;
    return (A) this;
  }

  public Boolean hasEndPort() {
    return this.endPort != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyPortFluentImpl that = (V1NetworkPolicyPortFluentImpl) o;
    if (endPort != null ? !endPort.equals(that.endPort) : that.endPort != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(endPort, port, protocol, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endPort != null) {
      sb.append("endPort:");
      sb.append(endPort + ",");
    }
    if (port != null) {
      sb.append("port:");
      sb.append(port + ",");
    }
    if (protocol != null) {
      sb.append("protocol:");
      sb.append(protocol);
    }
    sb.append("}");
    return sb.toString();
  }
}
