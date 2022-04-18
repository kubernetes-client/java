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

public class V1HostPathVolumeSourceBuilder
    extends V1HostPathVolumeSourceFluentImpl<V1HostPathVolumeSourceBuilder>
    implements VisitableBuilder<
        V1HostPathVolumeSource, io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder> {
  public V1HostPathVolumeSourceBuilder() {
    this(false);
  }

  public V1HostPathVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1HostPathVolumeSource(), validationEnabled);
  }

  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HostPathVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1HostPathVolumeSource(), validationEnabled);
  }

  public V1HostPathVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1HostPathVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPath(instance.getPath());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1HostPathVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
    this(instance, false);
  }

  public V1HostPathVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPath(instance.getPath());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1HostPathVolumeSource build() {
    V1HostPathVolumeSource buildable = new V1HostPathVolumeSource();
    buildable.setPath(fluent.getPath());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
