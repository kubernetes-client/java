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

public class V1AzureFilePersistentVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource,
        io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder> {
  public V1AzureFilePersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1AzureFilePersistentVolumeSource(), validationEnabled);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1AzureFilePersistentVolumeSource(), validationEnabled);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretName(instance.getSecretName());

    fluent.withSecretNamespace(instance.getSecretNamespace());

    fluent.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled;
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1AzureFilePersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withSecretNamespace(instance.getSecretNamespace());

    this.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource build() {
    V1AzureFilePersistentVolumeSource buildable = new V1AzureFilePersistentVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setSecretNamespace(fluent.getSecretNamespace());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AzureFilePersistentVolumeSourceBuilder that = (V1AzureFilePersistentVolumeSourceBuilder) o;
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
