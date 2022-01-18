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

public class V1VsphereVirtualDiskVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource,
        io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder> {
  public V1VsphereVirtualDiskVolumeSourceBuilder() {
    this(false);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1VsphereVirtualDiskVolumeSource(), validationEnabled);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VsphereVirtualDiskVolumeSource(), validationEnabled);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withStoragePolicyID(instance.getStoragePolicyID());

    fluent.withStoragePolicyName(instance.getStoragePolicyName());

    fluent.withVolumePath(instance.getVolumePath());

    this.validationEnabled = validationEnabled;
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance) {
    this(instance, false);
  }

  public V1VsphereVirtualDiskVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withStoragePolicyID(instance.getStoragePolicyID());

    this.withStoragePolicyName(instance.getStoragePolicyName());

    this.withVolumePath(instance.getVolumePath());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource build() {
    V1VsphereVirtualDiskVolumeSource buildable = new V1VsphereVirtualDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setStoragePolicyID(fluent.getStoragePolicyID());
    buildable.setStoragePolicyName(fluent.getStoragePolicyName());
    buildable.setVolumePath(fluent.getVolumePath());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VsphereVirtualDiskVolumeSourceBuilder that = (V1VsphereVirtualDiskVolumeSourceBuilder) o;
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
