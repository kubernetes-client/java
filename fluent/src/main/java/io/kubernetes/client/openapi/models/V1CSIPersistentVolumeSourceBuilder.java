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

public class V1CSIPersistentVolumeSourceBuilder
    extends io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource,
        io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder> {
  public V1CSIPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1CSIPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CSIPersistentVolumeSource(), validationEnabled);
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSIPersistentVolumeSource(), validationEnabled);
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    fluent.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    fluent.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeAttributes(instance.getVolumeAttributes());

    fluent.withVolumeHandle(instance.getVolumeHandle());

    this.validationEnabled = validationEnabled;
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1CSIPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withControllerExpandSecretRef(instance.getControllerExpandSecretRef());

    this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef());

    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withNodePublishSecretRef(instance.getNodePublishSecretRef());

    this.withNodeStageSecretRef(instance.getNodeStageSecretRef());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeAttributes(instance.getVolumeAttributes());

    this.withVolumeHandle(instance.getVolumeHandle());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource build() {
    V1CSIPersistentVolumeSource buildable = new V1CSIPersistentVolumeSource();
    buildable.setControllerExpandSecretRef(fluent.getControllerExpandSecretRef());
    buildable.setControllerPublishSecretRef(fluent.getControllerPublishSecretRef());
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.getNodePublishSecretRef());
    buildable.setNodeStageSecretRef(fluent.getNodeStageSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    buildable.setVolumeHandle(fluent.getVolumeHandle());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSIPersistentVolumeSourceBuilder that = (V1CSIPersistentVolumeSourceBuilder) o;
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
