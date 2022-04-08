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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1StorageOSPersistentVolumeSourceBuilder
    extends V1StorageOSPersistentVolumeSourceFluentImpl<V1StorageOSPersistentVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource,
        io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder> {
  public V1StorageOSPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1StorageOSPersistentVolumeSource(), validationEnabled);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      V1StorageOSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StorageOSPersistentVolumeSource(), validationEnabled);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeName(instance.getVolumeName());

    fluent.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled;
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1StorageOSPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeName(instance.getVolumeName());

    this.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource build() {
    V1StorageOSPersistentVolumeSource buildable = new V1StorageOSPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
}
