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

public class V1EndpointSliceBuilder
    extends io.kubernetes.client.openapi.models.V1EndpointSliceFluentImpl<
        io.kubernetes.client.openapi.models.V1EndpointSliceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EndpointSlice,
        io.kubernetes.client.openapi.models.V1EndpointSliceBuilder> {
  public V1EndpointSliceBuilder() {
    this(false);
  }

  public V1EndpointSliceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EndpointSlice(), validationEnabled);
  }

  public V1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSliceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSliceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EndpointSlice(), validationEnabled);
  }

  public V1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSliceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointSlice instance) {
    this(fluent, instance, false);
  }

  public V1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSliceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EndpointSlice instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddressType(instance.getAddressType());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withEndpoints(instance.getEndpoints());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  public V1EndpointSliceBuilder(io.kubernetes.client.openapi.models.V1EndpointSlice instance) {
    this(instance, false);
  }

  public V1EndpointSliceBuilder(
      io.kubernetes.client.openapi.models.V1EndpointSlice instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddressType(instance.getAddressType());

    this.withApiVersion(instance.getApiVersion());

    this.withEndpoints(instance.getEndpoints());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EndpointSliceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EndpointSlice build() {
    V1EndpointSlice buildable = new V1EndpointSlice();
    buildable.setAddressType(fluent.getAddressType());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointSliceBuilder that = (V1EndpointSliceBuilder) o;
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
