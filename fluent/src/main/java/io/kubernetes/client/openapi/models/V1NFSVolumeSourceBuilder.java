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

public class V1NFSVolumeSourceBuilder extends V1NFSVolumeSourceFluentImpl<V1NFSVolumeSourceBuilder>
    implements VisitableBuilder<V1NFSVolumeSource, V1NFSVolumeSourceBuilder> {
  public V1NFSVolumeSourceBuilder() {
    this(false);
  }

  public V1NFSVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1NFSVolumeSource(), validationEnabled);
  }

  public V1NFSVolumeSourceBuilder(V1NFSVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NFSVolumeSourceBuilder(V1NFSVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NFSVolumeSource(), validationEnabled);
  }

  public V1NFSVolumeSourceBuilder(V1NFSVolumeSourceFluent<?> fluent, V1NFSVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1NFSVolumeSourceBuilder(
      V1NFSVolumeSourceFluent<?> fluent, V1NFSVolumeSource instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withServer(instance.getServer());

    this.validationEnabled = validationEnabled;
  }

  public V1NFSVolumeSourceBuilder(V1NFSVolumeSource instance) {
    this(instance, false);
  }

  public V1NFSVolumeSourceBuilder(V1NFSVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withServer(instance.getServer());

    this.validationEnabled = validationEnabled;
  }

  V1NFSVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1NFSVolumeSource build() {
    V1NFSVolumeSource buildable = new V1NFSVolumeSource();
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setServer(fluent.getServer());
    return buildable;
  }
}
