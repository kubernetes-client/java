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

public class V1CinderVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CinderVolumeSource,
        io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder> {
  public V1CinderVolumeSourceBuilder() {
    this(false);
  }

  public V1CinderVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CinderVolumeSource(), validationEnabled);
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CinderVolumeSource(), validationEnabled);
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CinderVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CinderVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource instance) {
    this(instance, false);
  }

  public V1CinderVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CinderVolumeSource build() {
    V1CinderVolumeSource buildable = new V1CinderVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CinderVolumeSourceBuilder that = (V1CinderVolumeSourceBuilder) o;
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
