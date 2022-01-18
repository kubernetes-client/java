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

public class V1alpha1ServerStorageVersionBuilder
    extends io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluentImpl<
        io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion,
        io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> {
  public V1alpha1ServerStorageVersionBuilder() {
    this(false);
  }

  public V1alpha1ServerStorageVersionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1alpha1ServerStorageVersion(), validationEnabled);
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1alpha1ServerStorageVersion(), validationEnabled);
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion instance) {
    this(fluent, instance, false);
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiServerID(instance.getApiServerID());

    fluent.withDecodableVersions(instance.getDecodableVersions());

    fluent.withEncodingVersion(instance.getEncodingVersion());

    this.validationEnabled = validationEnabled;
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion instance) {
    this(instance, false);
  }

  public V1alpha1ServerStorageVersionBuilder(
      io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiServerID(instance.getApiServerID());

    this.withDecodableVersions(instance.getDecodableVersions());

    this.withEncodingVersion(instance.getEncodingVersion());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion build() {
    V1alpha1ServerStorageVersion buildable = new V1alpha1ServerStorageVersion();
    buildable.setApiServerID(fluent.getApiServerID());
    buildable.setDecodableVersions(fluent.getDecodableVersions());
    buildable.setEncodingVersion(fluent.getEncodingVersion());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ServerStorageVersionBuilder that = (V1alpha1ServerStorageVersionBuilder) o;
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
