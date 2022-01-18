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

public class V1QuobyteVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1QuobyteVolumeSource,
        io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder> {
  public V1QuobyteVolumeSourceBuilder() {
    this(false);
  }

  public V1QuobyteVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1QuobyteVolumeSource(), validationEnabled);
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1QuobyteVolumeSource(), validationEnabled);
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withGroup(instance.getGroup());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withRegistry(instance.getRegistry());

    fluent.withTenant(instance.getTenant());

    fluent.withUser(instance.getUser());

    fluent.withVolume(instance.getVolume());

    this.validationEnabled = validationEnabled;
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance) {
    this(instance, false);
  }

  public V1QuobyteVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withGroup(instance.getGroup());

    this.withReadOnly(instance.getReadOnly());

    this.withRegistry(instance.getRegistry());

    this.withTenant(instance.getTenant());

    this.withUser(instance.getUser());

    this.withVolume(instance.getVolume());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1QuobyteVolumeSource build() {
    V1QuobyteVolumeSource buildable = new V1QuobyteVolumeSource();
    buildable.setGroup(fluent.getGroup());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRegistry(fluent.getRegistry());
    buildable.setTenant(fluent.getTenant());
    buildable.setUser(fluent.getUser());
    buildable.setVolume(fluent.getVolume());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1QuobyteVolumeSourceBuilder that = (V1QuobyteVolumeSourceBuilder) o;
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
