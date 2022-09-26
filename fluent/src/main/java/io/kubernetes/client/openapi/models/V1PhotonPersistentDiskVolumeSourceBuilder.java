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

public class V1PhotonPersistentDiskVolumeSourceBuilder
    extends V1PhotonPersistentDiskVolumeSourceFluentImpl<V1PhotonPersistentDiskVolumeSourceBuilder>
    implements VisitableBuilder<
        V1PhotonPersistentDiskVolumeSource, V1PhotonPersistentDiskVolumeSourceBuilder> {
  public V1PhotonPersistentDiskVolumeSourceBuilder() {
    this(false);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PhotonPersistentDiskVolumeSource(), validationEnabled);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(
      V1PhotonPersistentDiskVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(
      V1PhotonPersistentDiskVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PhotonPersistentDiskVolumeSource(), validationEnabled);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(
      V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,
      V1PhotonPersistentDiskVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(
      V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,
      V1PhotonPersistentDiskVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withPdID(instance.getPdID());

    this.validationEnabled = validationEnabled;
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(V1PhotonPersistentDiskVolumeSource instance) {
    this(instance, false);
  }

  public V1PhotonPersistentDiskVolumeSourceBuilder(
      V1PhotonPersistentDiskVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withPdID(instance.getPdID());

    this.validationEnabled = validationEnabled;
  }

  V1PhotonPersistentDiskVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1PhotonPersistentDiskVolumeSource build() {
    V1PhotonPersistentDiskVolumeSource buildable = new V1PhotonPersistentDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPdID(fluent.getPdID());
    return buildable;
  }
}
