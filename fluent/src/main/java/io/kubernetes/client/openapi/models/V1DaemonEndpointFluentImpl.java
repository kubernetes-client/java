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
public class V1DaemonEndpointFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<A> {
  public V1DaemonEndpointFluentImpl() {}

  public V1DaemonEndpointFluentImpl(io.kubernetes.client.openapi.models.V1DaemonEndpoint instance) {
    this.withPort(instance.getPort());
  }

  private java.lang.Integer port;

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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonEndpointFluentImpl that = (V1DaemonEndpointFluentImpl) o;
    if (port != null ? !port.equals(that.port) : that.port != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(port, super.hashCode());
  }
}
