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

public class V1GroupVersionForDiscoveryBuilder
    extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluentImpl<
        io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery,
        io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryBuilder> {
  public V1GroupVersionForDiscoveryBuilder() {
    this(false);
  }

  public V1GroupVersionForDiscoveryBuilder(java.lang.Boolean validationEnabled) {
    this(new V1GroupVersionForDiscovery(), validationEnabled);
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1GroupVersionForDiscovery(), validationEnabled);
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance) {
    this(fluent, instance, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withGroupVersion(instance.getGroupVersion());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance) {
    this(instance, false);
  }

  public V1GroupVersionForDiscoveryBuilder(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withGroupVersion(instance.getGroupVersion());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery build() {
    V1GroupVersionForDiscovery buildable = new V1GroupVersionForDiscovery();
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GroupVersionForDiscoveryBuilder that = (V1GroupVersionForDiscoveryBuilder) o;
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
