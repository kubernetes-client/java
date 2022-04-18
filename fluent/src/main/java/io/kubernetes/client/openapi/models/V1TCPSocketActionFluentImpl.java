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
public class V1TCPSocketActionFluentImpl<A extends V1TCPSocketActionFluent<A>> extends BaseFluent<A>
    implements V1TCPSocketActionFluent<A> {
  public V1TCPSocketActionFluentImpl() {}

  public V1TCPSocketActionFluentImpl(
      io.kubernetes.client.openapi.models.V1TCPSocketAction instance) {
    this.withHost(instance.getHost());

    this.withPort(instance.getPort());
  }

  private String host;
  private IntOrString port;

  public java.lang.String getHost() {
    return this.host;
  }

  public A withHost(java.lang.String host) {
    this.host = host;
    return (A) this;
  }

  public Boolean hasHost() {
    return this.host != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TCPSocketActionFluentImpl that = (V1TCPSocketActionFluentImpl) o;
    if (host != null ? !host.equals(that.host) : that.host != null) return false;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(host, port, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (host != null) {
      sb.append("host:");
      sb.append(host + ",");
    }
    if (port != null) {
      sb.append("port:");
      sb.append(port);
    }
    sb.append("}");
    return sb.toString();
  }
}
