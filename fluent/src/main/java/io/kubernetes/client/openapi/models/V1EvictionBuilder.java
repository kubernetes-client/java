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

public class V1EvictionBuilder
    extends io.kubernetes.client.openapi.models.V1EvictionFluentImpl<
        io.kubernetes.client.openapi.models.V1EvictionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Eviction,
        io.kubernetes.client.openapi.models.V1EvictionBuilder> {
  public V1EvictionBuilder() {
    this(false);
  }

  public V1EvictionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Eviction(), validationEnabled);
  }

  public V1EvictionBuilder(io.kubernetes.client.openapi.models.V1EvictionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EvictionBuilder(
      io.kubernetes.client.openapi.models.V1EvictionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Eviction(), validationEnabled);
  }

  public V1EvictionBuilder(
      io.kubernetes.client.openapi.models.V1EvictionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Eviction instance) {
    this(fluent, instance, false);
  }

  public V1EvictionBuilder(
      io.kubernetes.client.openapi.models.V1EvictionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Eviction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDeleteOptions(instance.getDeleteOptions());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1EvictionBuilder(io.kubernetes.client.openapi.models.V1Eviction instance) {
    this(instance, false);
  }

  public V1EvictionBuilder(
      io.kubernetes.client.openapi.models.V1Eviction instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withDeleteOptions(instance.getDeleteOptions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EvictionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Eviction build() {
    V1Eviction buildable = new V1Eviction();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeleteOptions(fluent.getDeleteOptions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EvictionBuilder that = (V1EvictionBuilder) o;
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
