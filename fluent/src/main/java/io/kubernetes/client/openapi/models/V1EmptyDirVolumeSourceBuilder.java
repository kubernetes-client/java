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

public class V1EmptyDirVolumeSourceBuilder
    extends V1EmptyDirVolumeSourceFluentImpl<V1EmptyDirVolumeSourceBuilder>
    implements VisitableBuilder<V1EmptyDirVolumeSource, V1EmptyDirVolumeSourceBuilder> {
  public V1EmptyDirVolumeSourceBuilder() {
    this(false);
  }

  public V1EmptyDirVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1EmptyDirVolumeSource(), validationEnabled);
  }

  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EmptyDirVolumeSourceBuilder(
      V1EmptyDirVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1EmptyDirVolumeSource(), validationEnabled);
  }

  public V1EmptyDirVolumeSourceBuilder(
      V1EmptyDirVolumeSourceFluent<?> fluent, V1EmptyDirVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1EmptyDirVolumeSourceBuilder(
      V1EmptyDirVolumeSourceFluent<?> fluent,
      V1EmptyDirVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMedium(instance.getMedium());

    fluent.withSizeLimit(instance.getSizeLimit());

    this.validationEnabled = validationEnabled;
  }

  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance) {
    this(instance, false);
  }

  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMedium(instance.getMedium());

    this.withSizeLimit(instance.getSizeLimit());

    this.validationEnabled = validationEnabled;
  }

  V1EmptyDirVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1EmptyDirVolumeSource build() {
    V1EmptyDirVolumeSource buildable = new V1EmptyDirVolumeSource();
    buildable.setMedium(fluent.getMedium());
    buildable.setSizeLimit(fluent.getSizeLimit());
    return buildable;
  }
}
