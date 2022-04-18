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
public class V1ContainerPortFluentImpl<A extends V1ContainerPortFluent<A>> extends BaseFluent<A>
    implements V1ContainerPortFluent<A> {
  public V1ContainerPortFluentImpl() {}

  public V1ContainerPortFluentImpl(io.kubernetes.client.openapi.models.V1ContainerPort instance) {
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());
  }

  private Integer containerPort;
  private String hostIP;
  private java.lang.Integer hostPort;
  private java.lang.String name;
  private java.lang.String protocol;

  public java.lang.Integer getContainerPort() {
    return this.containerPort;
  }

  public A withContainerPort(java.lang.Integer containerPort) {
    this.containerPort = containerPort;
    return (A) this;
  }

  public Boolean hasContainerPort() {
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerPort != null) {
      sb.append("containerPort:");
      sb.append(containerPort + ",");
    }
    if (hostIP != null) {
      sb.append("hostIP:");
      sb.append(hostIP + ",");
    }
    if (hostPort != null) {
      sb.append("hostPort:");
      sb.append(hostPort + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (protocol != null) {
      sb.append("protocol:");
      sb.append(protocol);
    }
    sb.append("}");
    return sb.toString();
  }
}
