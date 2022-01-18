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

public class V1CapabilitiesBuilder
    extends io.kubernetes.client.openapi.models.V1CapabilitiesFluentImpl<
        io.kubernetes.client.openapi.models.V1CapabilitiesBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Capabilities,
        io.kubernetes.client.openapi.models.V1CapabilitiesBuilder> {
  public V1CapabilitiesBuilder() {
    this(false);
  }

  public V1CapabilitiesBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Capabilities(), validationEnabled);
  }

  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CapabilitiesBuilder(
      io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Capabilities(), validationEnabled);
  }

  public V1CapabilitiesBuilder(
      io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Capabilities instance) {
    this(fluent, instance, false);
  }

  public V1CapabilitiesBuilder(
      io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Capabilities instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAdd(instance.getAdd());

    fluent.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled;
  }

  public V1CapabilitiesBuilder(io.kubernetes.client.openapi.models.V1Capabilities instance) {
    this(instance, false);
  }

  public V1CapabilitiesBuilder(
      io.kubernetes.client.openapi.models.V1Capabilities instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAdd(instance.getAdd());

    this.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CapabilitiesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Capabilities build() {
    V1Capabilities buildable = new V1Capabilities();
    buildable.setAdd(fluent.getAdd());
    buildable.setDrop(fluent.getDrop());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CapabilitiesBuilder that = (V1CapabilitiesBuilder) o;
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
