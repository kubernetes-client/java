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

public class V1AzureDiskVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource,
        io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder> {
  public V1AzureDiskVolumeSourceBuilder() {
    this(false);
  }

  public V1AzureDiskVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1AzureDiskVolumeSource(), validationEnabled);
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1AzureDiskVolumeSource(), validationEnabled);
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCachingMode(instance.getCachingMode());

    fluent.withDiskName(instance.getDiskName());

    fluent.withDiskURI(instance.getDiskURI());

    fluent.withFsType(instance.getFsType());

    fluent.withKind(instance.getKind());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance) {
    this(instance, false);
  }

  public V1AzureDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCachingMode(instance.getCachingMode());

    this.withDiskName(instance.getDiskName());

    this.withDiskURI(instance.getDiskURI());

    this.withFsType(instance.getFsType());

    this.withKind(instance.getKind());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource build() {
    V1AzureDiskVolumeSource buildable = new V1AzureDiskVolumeSource();
    buildable.setCachingMode(fluent.getCachingMode());
    buildable.setDiskName(fluent.getDiskName());
    buildable.setDiskURI(fluent.getDiskURI());
    buildable.setFsType(fluent.getFsType());
    buildable.setKind(fluent.getKind());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AzureDiskVolumeSourceBuilder that = (V1AzureDiskVolumeSourceBuilder) o;
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
