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

public class V1EndpointSubsetBuilder
    extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluentImpl<
        io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EndpointSubset,
        io.kubernetes.client.openapi.models.V1EndpointSubsetBuilder> {
  public V1EndpointSubsetBuilder() {
    this(false);
  }

  public V1EndpointSubsetBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EndpointSubset(), validationEnabled);
  }

  public V1EndpointSubsetBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointSubsetBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EndpointSubset(), validationEnabled);
  }

  public V1EndpointSubsetBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointSubset instance) {
    this(fluent, instance, false);
  }

  public V1EndpointSubsetBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointSubset instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddresses(instance.getAddresses());

    fluent.withNotReadyAddresses(instance.getNotReadyAddresses());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointSubsetBuilder(io.kubernetes.client.openapi.models.V1EndpointSubset instance) {
    this(instance, false);
  }

  public V1EndpointSubsetBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSubset instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddresses(instance.getAddresses());

    this.withNotReadyAddresses(instance.getNotReadyAddresses());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EndpointSubset build() {
    V1EndpointSubset buildable = new V1EndpointSubset();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setNotReadyAddresses(fluent.getNotReadyAddresses());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointSubsetBuilder that = (V1EndpointSubsetBuilder) o;
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
