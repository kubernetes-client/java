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
public class V1ServicePortFluentImpl<A extends V1ServicePortFluent<A>> extends BaseFluent<A>
    implements V1ServicePortFluent<A> {
  public V1ServicePortFluentImpl() {}

  public V1ServicePortFluentImpl(io.kubernetes.client.openapi.models.V1ServicePort instance) {
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withNodePort(instance.getNodePort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.withTargetPort(instance.getTargetPort());
  }

  private String appProtocol;
  private java.lang.String name;
  private Integer nodePort;
  private java.lang.Integer port;
  private java.lang.String protocol;
  private IntOrString targetPort;

  public java.lang.String getAppProtocol() {
    return this.appProtocol;
  }

  public A withAppProtocol(java.lang.String appProtocol) {
    this.appProtocol = appProtocol;
    return (A) this;
  }

  public Boolean hasAppProtocol() {
    return this.appProtocol != null;
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

  public java.lang.Integer getNodePort() {
    return this.nodePort;
  }

  public A withNodePort(java.lang.Integer nodePort) {
    this.nodePort = nodePort;
    return (A) this;
  }

  public java.lang.Boolean hasNodePort() {
    return this.nodePort != null;
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

  public io.kubernetes.client.custom.IntOrString getTargetPort() {
    return this.targetPort;
  }

  public A withTargetPort(io.kubernetes.client.custom.IntOrString targetPort) {
    this.targetPort = targetPort;
    return (A) this;
  }

  public java.lang.Boolean hasTargetPort() {
    return this.targetPort != null;
  }

  public A withNewTargetPort(int value) {
    return (A) withTargetPort(new IntOrString(value));
  }

  public A withNewTargetPort(java.lang.String value) {
    return (A) withTargetPort(new IntOrString(value));
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServicePortFluentImpl that = (V1ServicePortFluentImpl) o;
    if (appProtocol != null ? !appProtocol.equals(that.appProtocol) : that.appProtocol != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (nodePort != null ? !nodePort.equals(that.nodePort) : that.nodePort != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    if (targetPort != null ? !targetPort.equals(that.targetPort) : that.targetPort != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        appProtocol, name, nodePort, port, protocol, targetPort, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (appProtocol != null) {
      sb.append("appProtocol:");
      sb.append(appProtocol + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (nodePort != null) {
      sb.append("nodePort:");
      sb.append(nodePort + ",");
    }
    if (port != null) {
      sb.append("port:");
      sb.append(port + ",");
    }
    if (protocol != null) {
      sb.append("protocol:");
      sb.append(protocol + ",");
    }
    if (targetPort != null) {
      sb.append("targetPort:");
      sb.append(targetPort);
    }
    sb.append("}");
    return sb.toString();
  }
}
