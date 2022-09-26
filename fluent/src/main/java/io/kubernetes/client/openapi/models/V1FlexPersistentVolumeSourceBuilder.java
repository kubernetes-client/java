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

public class V1FlexPersistentVolumeSourceBuilder
    extends V1FlexPersistentVolumeSourceFluentImpl<V1FlexPersistentVolumeSourceBuilder>
    implements VisitableBuilder<V1FlexPersistentVolumeSource, V1FlexPersistentVolumeSourceBuilder> {
  public V1FlexPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1FlexPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlexPersistentVolumeSource(), validationEnabled);
  }

  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1FlexPersistentVolumeSourceBuilder(
      V1FlexPersistentVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1FlexPersistentVolumeSource(), validationEnabled);
  }

  public V1FlexPersistentVolumeSourceBuilder(
      V1FlexPersistentVolumeSourceFluent<?> fluent, V1FlexPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1FlexPersistentVolumeSourceBuilder(
      V1FlexPersistentVolumeSourceFluent<?> fluent,
      V1FlexPersistentVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withOptions(instance.getOptions());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1FlexPersistentVolumeSourceBuilder(
      V1FlexPersistentVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled;
  }

  V1FlexPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1FlexPersistentVolumeSource build() {
    V1FlexPersistentVolumeSource buildable = new V1FlexPersistentVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }
}
