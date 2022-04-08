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

public class V1GlusterfsPersistentVolumeSourceBuilder
    extends V1GlusterfsPersistentVolumeSourceFluentImpl<V1GlusterfsPersistentVolumeSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource,
        io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder> {
  public V1GlusterfsPersistentVolumeSourceBuilder() {
    this(false);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GlusterfsPersistentVolumeSource(), validationEnabled);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      V1GlusterfsPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1GlusterfsPersistentVolumeSource(), validationEnabled);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEndpoints(instance.getEndpoints());

    fluent.withEndpointsNamespace(instance.getEndpointsNamespace());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
    this(instance, false);
  }

  public V1GlusterfsPersistentVolumeSourceBuilder(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withEndpoints(instance.getEndpoints());

    this.withEndpointsNamespace(instance.getEndpointsNamespace());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource build() {
    V1GlusterfsPersistentVolumeSource buildable = new V1GlusterfsPersistentVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setEndpointsNamespace(fluent.getEndpointsNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
}
