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
public class V1PortStatusFluentImpl<A extends V1PortStatusFluent<A>> extends BaseFluent<A>
    implements V1PortStatusFluent<A> {
  public V1PortStatusFluentImpl() {}

  public V1PortStatusFluentImpl(io.kubernetes.client.openapi.models.V1PortStatus instance) {
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());
  }

  private String error;
  private Integer port;
  private java.lang.String protocol;

  public java.lang.String getError() {
    return this.error;
  }

  public A withError(java.lang.String error) {
    this.error = error;
    return (A) this;
  }

  public Boolean hasError() {
    return this.error != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PortStatusFluentImpl that = (V1PortStatusFluentImpl) o;
    if (error != null ? !error.equals(that.error) : that.error != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(error, port, protocol, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (error != null) {
      sb.append("error:");
      sb.append(error + ",");
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
