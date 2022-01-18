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

public class V1AttachedVolumeBuilder
    extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluentImpl<
        io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1AttachedVolume,
        io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder> {
  public V1AttachedVolumeBuilder() {
    this(false);
  }

  public V1AttachedVolumeBuilder(java.lang.Boolean validationEnabled) {
    this(new V1AttachedVolume(), validationEnabled);
  }

  public V1AttachedVolumeBuilder(
      io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AttachedVolumeBuilder(
      io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1AttachedVolume(), validationEnabled);
  }

  public V1AttachedVolumeBuilder(
      io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
    this(fluent, instance, false);
  }

  public V1AttachedVolumeBuilder(
      io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1AttachedVolume instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDevicePath(instance.getDevicePath());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
    this(instance, false);
  }

  public V1AttachedVolumeBuilder(
      io.kubernetes.client.openapi.models.V1AttachedVolume instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1AttachedVolume build() {
    V1AttachedVolume buildable = new V1AttachedVolume();
    buildable.setDevicePath(fluent.getDevicePath());
    buildable.setName(fluent.getName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AttachedVolumeBuilder that = (V1AttachedVolumeBuilder) o;
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
