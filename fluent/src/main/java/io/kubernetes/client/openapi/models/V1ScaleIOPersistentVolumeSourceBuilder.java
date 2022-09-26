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

public class V1ScaleIOPersistentVolumeSourceBuilder
    extends V1ScaleIOPersistentVolumeSourceFluentImpl<V1ScaleIOPersistentVolumeSourceBuilder>
    implements VisitableBuilder<
        V1ScaleIOPersistentVolumeSource, V1ScaleIOPersistentVolumeSourceBuilder> {
  public V1ScaleIOPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ScaleIOPersistentVolumeSource(), validationEnabled);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(
      V1ScaleIOPersistentVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ScaleIOPersistentVolumeSource(), validationEnabled);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(
      V1ScaleIOPersistentVolumeSourceFluent<?> fluent, V1ScaleIOPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(
      V1ScaleIOPersistentVolumeSourceFluent<?> fluent,
      V1ScaleIOPersistentVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withGateway(instance.getGateway());

    fluent.withProtectionDomain(instance.getProtectionDomain());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withSslEnabled(instance.getSslEnabled());

    fluent.withStorageMode(instance.getStorageMode());

    fluent.withStoragePool(instance.getStoragePool());

    fluent.withSystem(instance.getSystem());

    fluent.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled;
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(V1ScaleIOPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1ScaleIOPersistentVolumeSourceBuilder(
      V1ScaleIOPersistentVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withGateway(instance.getGateway());

    this.withProtectionDomain(instance.getProtectionDomain());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withSslEnabled(instance.getSslEnabled());

    this.withStorageMode(instance.getStorageMode());

    this.withStoragePool(instance.getStoragePool());

    this.withSystem(instance.getSystem());

    this.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled;
  }

  V1ScaleIOPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1ScaleIOPersistentVolumeSource build() {
    V1ScaleIOPersistentVolumeSource buildable = new V1ScaleIOPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setGateway(fluent.getGateway());
    buildable.setProtectionDomain(fluent.getProtectionDomain());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setSslEnabled(fluent.getSslEnabled());
    buildable.setStorageMode(fluent.getStorageMode());
    buildable.setStoragePool(fluent.getStoragePool());
    buildable.setSystem(fluent.getSystem());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
}
