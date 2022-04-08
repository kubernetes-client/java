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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1DaemonEndpointBuilder extends V1DaemonEndpointFluentImpl<V1DaemonEndpointBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DaemonEndpoint,
        io.kubernetes.client.openapi.models.V1DaemonEndpointBuilder> {
  public V1DaemonEndpointBuilder() {
    this(false);
  }

  public V1DaemonEndpointBuilder(Boolean validationEnabled) {
    this(new V1DaemonEndpoint(), validationEnabled);
  }

  public V1DaemonEndpointBuilder(V1DaemonEndpointFluent<?> fluent) {
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
}
