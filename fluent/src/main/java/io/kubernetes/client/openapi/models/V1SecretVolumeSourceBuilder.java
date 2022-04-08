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

public class V1SecretVolumeSourceBuilder
    extends V1SecretVolumeSourceFluentImpl<V1SecretVolumeSourceBuilder>
    implements VisitableBuilder<
        V1SecretVolumeSource, io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder> {
  public V1SecretVolumeSourceBuilder() {
    this(false);
  }

  public V1SecretVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1SecretVolumeSource(), validationEnabled);
  }

  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SecretVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SecretVolumeSource(), validationEnabled);
  }

  public V1SecretVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SecretVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1SecretVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SecretVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withItems(instance.getItems());

    fluent.withOptional(instance.getOptional());

    fluent.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled;
  }

  public V1SecretVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource instance) {
    this(instance, false);
  }

  public V1SecretVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.withOptional(instance.getOptional());

    this.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SecretVolumeSource build() {
    V1SecretVolumeSource buildable = new V1SecretVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.getItems());
    buildable.setOptional(fluent.getOptional());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
}
