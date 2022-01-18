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

public class V1alpha1StorageVersionStatusBuilder
    extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus,
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusBuilder> {
  public V1alpha1StorageVersionStatusBuilder() {
    this(false);
  }

  public V1alpha1StorageVersionStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1StorageVersionStatus(), validationEnabled);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1StorageVersionStatus(), validationEnabled);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
    this(fluent, instance, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    fluent.withConditions(instance.getConditions());

    fluent.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
    this(instance, false);
  }

  public V1alpha1StorageVersionStatusBuilder(
      io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    this.withConditions(instance.getConditions());

    this.withStorageVersions(instance.getStorageVersions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus build() {
    V1alpha1StorageVersionStatus buildable = new V1alpha1StorageVersionStatus();
    buildable.setCommonEncodingVersion(fluent.getCommonEncodingVersion());
    buildable.setConditions(fluent.getConditions());
    buildable.setStorageVersions(fluent.getStorageVersions());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionStatusBuilder that = (V1alpha1StorageVersionStatusBuilder) o;
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
