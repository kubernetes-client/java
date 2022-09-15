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

public class V1FlockerVolumeSourceBuilder
    extends V1FlockerVolumeSourceFluentImpl<V1FlockerVolumeSourceBuilder>
    implements VisitableBuilder<V1FlockerVolumeSource, V1FlockerVolumeSourceBuilder> {
  public V1FlockerVolumeSourceBuilder() {
    this(false);
  }

  public V1FlockerVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlockerVolumeSource(), validationEnabled);
  }

  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1FlockerVolumeSourceBuilder(
      V1FlockerVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1FlockerVolumeSource(), validationEnabled);
  }

  public V1FlockerVolumeSourceBuilder(
      V1FlockerVolumeSourceFluent<?> fluent, V1FlockerVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1FlockerVolumeSourceBuilder(
      V1FlockerVolumeSourceFluent<?> fluent,
      V1FlockerVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDatasetName(instance.getDatasetName());

    fluent.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled;
  }

  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance) {
    this(instance, false);
  }

  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());

    this.validationEnabled = validationEnabled;
  }

  V1FlockerVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1FlockerVolumeSource build() {
    V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
}
