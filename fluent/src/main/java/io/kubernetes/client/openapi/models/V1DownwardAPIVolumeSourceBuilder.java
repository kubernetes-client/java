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

public class V1DownwardAPIVolumeSourceBuilder
    extends V1DownwardAPIVolumeSourceFluentImpl<V1DownwardAPIVolumeSourceBuilder>
    implements VisitableBuilder<V1DownwardAPIVolumeSource, V1DownwardAPIVolumeSourceBuilder> {
  public V1DownwardAPIVolumeSourceBuilder() {
    this(false);
  }

  public V1DownwardAPIVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1DownwardAPIVolumeSource(), validationEnabled);
  }

  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DownwardAPIVolumeSourceBuilder(
      V1DownwardAPIVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIVolumeSource(), validationEnabled);
  }

  public V1DownwardAPIVolumeSourceBuilder(
      V1DownwardAPIVolumeSourceFluent<?> fluent, V1DownwardAPIVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1DownwardAPIVolumeSourceBuilder(
      V1DownwardAPIVolumeSourceFluent<?> fluent,
      V1DownwardAPIVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSource instance) {
    this(instance, false);
  }

  public V1DownwardAPIVolumeSourceBuilder(
      V1DownwardAPIVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  V1DownwardAPIVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1DownwardAPIVolumeSource build() {
    V1DownwardAPIVolumeSource buildable = new V1DownwardAPIVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.getItems());
    return buildable;
  }
}
