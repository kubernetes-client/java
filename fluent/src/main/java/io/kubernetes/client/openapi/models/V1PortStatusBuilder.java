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

public class V1PortStatusBuilder
    extends io.kubernetes.client.openapi.models.V1PortStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1PortStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PortStatus,
        io.kubernetes.client.openapi.models.V1PortStatusBuilder> {
  public V1PortStatusBuilder() {
    this(false);
  }

  public V1PortStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PortStatus(), validationEnabled);
  }

  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PortStatusBuilder(
      io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PortStatus(), validationEnabled);
  }

  public V1PortStatusBuilder(
      io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PortStatus instance) {
    this(fluent, instance, false);
  }

  public V1PortStatusBuilder(
      io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PortStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withError(instance.getError());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  public V1PortStatusBuilder(io.kubernetes.client.openapi.models.V1PortStatus instance) {
    this(instance, false);
  }

  public V1PortStatusBuilder(
      io.kubernetes.client.openapi.models.V1PortStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withError(instance.getError());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PortStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PortStatus build() {
    V1PortStatus buildable = new V1PortStatus();
    buildable.setError(fluent.getError());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PortStatusBuilder that = (V1PortStatusBuilder) o;
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
