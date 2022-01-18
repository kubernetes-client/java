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

public class V1PersistentVolumeClaimSpecBuilder
    extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec,
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecBuilder> {
  public V1PersistentVolumeClaimSpecBuilder() {
    this(false);
  }

  public V1PersistentVolumeClaimSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimSpec(), validationEnabled);
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimSpec(), validationEnabled);
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec instance) {
    this(fluent, instance, false);
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAccessModes(instance.getAccessModes());

    fluent.withDataSource(instance.getDataSource());

    fluent.withDataSourceRef(instance.getDataSourceRef());

    fluent.withResources(instance.getResources());

    fluent.withSelector(instance.getSelector());

    fluent.withStorageClassName(instance.getStorageClassName());

    fluent.withVolumeMode(instance.getVolumeMode());

    fluent.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled;
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec instance) {
    this(instance, false);
  }

  public V1PersistentVolumeClaimSpecBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAccessModes(instance.getAccessModes());

    this.withDataSource(instance.getDataSource());

    this.withDataSourceRef(instance.getDataSourceRef());

    this.withResources(instance.getResources());

    this.withSelector(instance.getSelector());

    this.withStorageClassName(instance.getStorageClassName());

    this.withVolumeMode(instance.getVolumeMode());

    this.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec build() {
    V1PersistentVolumeClaimSpec buildable = new V1PersistentVolumeClaimSpec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setDataSource(fluent.getDataSource());
    buildable.setDataSourceRef(fluent.getDataSourceRef());
    buildable.setResources(fluent.getResources());
    buildable.setSelector(fluent.getSelector());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimSpecBuilder that = (V1PersistentVolumeClaimSpecBuilder) o;
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
