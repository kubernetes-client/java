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

public class V1LocalVolumeSourceBuilder
    extends V1LocalVolumeSourceFluentImpl<V1LocalVolumeSourceBuilder>
    implements VisitableBuilder<V1LocalVolumeSource, V1LocalVolumeSourceBuilder> {
  public V1LocalVolumeSourceBuilder() {
    this(false);
  }

  public V1LocalVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1LocalVolumeSource(), validationEnabled);
  }

  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LocalVolumeSourceBuilder(
      V1LocalVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1LocalVolumeSource(), validationEnabled);
  }

  public V1LocalVolumeSourceBuilder(
      V1LocalVolumeSourceFluent<?> fluent, V1LocalVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1LocalVolumeSourceBuilder(
      V1LocalVolumeSourceFluent<?> fluent,
      V1LocalVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance) {
    this(instance, false);
  }

  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withPath(instance.getPath());

    this.validationEnabled = validationEnabled;
  }

  V1LocalVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1LocalVolumeSource build() {
    V1LocalVolumeSource buildable = new V1LocalVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
}
