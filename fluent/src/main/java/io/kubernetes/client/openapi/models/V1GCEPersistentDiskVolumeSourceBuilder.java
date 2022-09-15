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

public class V1GCEPersistentDiskVolumeSourceBuilder
    extends V1GCEPersistentDiskVolumeSourceFluentImpl<V1GCEPersistentDiskVolumeSourceBuilder>
    implements VisitableBuilder<
        V1GCEPersistentDiskVolumeSource, V1GCEPersistentDiskVolumeSourceBuilder> {
  public V1GCEPersistentDiskVolumeSourceBuilder() {
    this(false);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GCEPersistentDiskVolumeSource(), validationEnabled);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(V1GCEPersistentDiskVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(
      V1GCEPersistentDiskVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1GCEPersistentDiskVolumeSource(), validationEnabled);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(
      V1GCEPersistentDiskVolumeSourceFluent<?> fluent, V1GCEPersistentDiskVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(
      V1GCEPersistentDiskVolumeSourceFluent<?> fluent,
      V1GCEPersistentDiskVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withPartition(instance.getPartition());

    fluent.withPdName(instance.getPdName());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(V1GCEPersistentDiskVolumeSource instance) {
    this(instance, false);
  }

  public V1GCEPersistentDiskVolumeSourceBuilder(
      V1GCEPersistentDiskVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withPdName(instance.getPdName());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  V1GCEPersistentDiskVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1GCEPersistentDiskVolumeSource build() {
    V1GCEPersistentDiskVolumeSource buildable = new V1GCEPersistentDiskVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setPdName(fluent.getPdName());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
}
