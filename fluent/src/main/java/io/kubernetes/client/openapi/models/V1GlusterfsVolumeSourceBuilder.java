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

public class V1GlusterfsVolumeSourceBuilder
    extends V1GlusterfsVolumeSourceFluentImpl<V1GlusterfsVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource,
        io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder> {
  public V1GlusterfsVolumeSourceBuilder() {
    this(false);
  }

  public V1GlusterfsVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GlusterfsVolumeSource(), validationEnabled);
  }

  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GlusterfsVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1GlusterfsVolumeSource(), validationEnabled);
  }

  public V1GlusterfsVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1GlusterfsVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEndpoints(instance.getEndpoints());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1GlusterfsVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
    this(instance, false);
  }

  public V1GlusterfsVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withEndpoints(instance.getEndpoints());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource build() {
    V1GlusterfsVolumeSource buildable = new V1GlusterfsVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
}
