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

public class V1CSIVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSIVolumeSource,
        io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder> {
  public V1CSIVolumeSourceBuilder() {
    this(false);
  }

  public V1CSIVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CSIVolumeSource(), validationEnabled);
  }

  public V1CSIVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSIVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSIVolumeSource(), validationEnabled);
  }

  public V1CSIVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1CSIVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled;
  }

  public V1CSIVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CSIVolumeSource instance) {
    this(instance, false);
  }

  public V1CSIVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSIVolumeSource build() {
    V1CSIVolumeSource buildable = new V1CSIVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.getNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIVolumeSourceBuilder that = (V1CSIVolumeSourceBuilder) o;
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
