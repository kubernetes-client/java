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

public class V1alpha1StorageVersionBuilder
    extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluentImpl<
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1StorageVersion,
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionBuilder> {
  public V1alpha1StorageVersionBuilder() {
    this(false);
  }

  public V1alpha1StorageVersionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1StorageVersion(), validationEnabled);
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersion(), validationEnabled);
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersion instance) {
    this(fluent, instance, false);
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersion instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersion instance) {
    this(instance, false);
  }

  public V1alpha1StorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersion instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1StorageVersionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersion build() {
    V1alpha1StorageVersion buildable = new V1alpha1StorageVersion();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionBuilder that = (V1alpha1StorageVersionBuilder) o;
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
