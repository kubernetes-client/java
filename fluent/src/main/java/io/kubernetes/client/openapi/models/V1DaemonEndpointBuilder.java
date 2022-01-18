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

public class V1DaemonEndpointBuilder
    extends io.kubernetes.client.openapi.models.V1DaemonEndpointFluentImpl<
        io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DaemonEndpoint,
        io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder> {
  public V1DaemonEndpointBuilder() {
    this(false);
  }

  public V1DaemonEndpointBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DaemonEndpoint(), validationEnabled);
  }

  public V1DaemonEndpointBuilder(
      io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DaemonEndpointBuilder(
      io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DaemonEndpoint(), validationEnabled);
  }

  public V1DaemonEndpointBuilder(
      io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonEndpoint instance) {
    this(fluent, instance, false);
  }

  public V1DaemonEndpointBuilder(
      io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonEndpoint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  public V1DaemonEndpointBuilder(io.kubernetes.client.openapi.models.V1DaemonEndpoint instance) {
    this(instance, false);
  }

  public V1DaemonEndpointBuilder(
      io.kubernetes.client.openapi.models.V1DaemonEndpoint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPort(instance.getPort());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DaemonEndpointFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DaemonEndpoint build() {
    V1DaemonEndpoint buildable = new V1DaemonEndpoint();
    buildable.setPort(fluent.getPort());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DaemonEndpointBuilder that = (V1DaemonEndpointBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
