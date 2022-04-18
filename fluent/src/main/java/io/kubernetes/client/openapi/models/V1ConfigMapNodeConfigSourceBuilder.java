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

public class V1ConfigMapNodeConfigSourceBuilder
    extends V1ConfigMapNodeConfigSourceFluentImpl<V1ConfigMapNodeConfigSourceBuilder>
    implements VisitableBuilder<
        V1ConfigMapNodeConfigSource,
        io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder> {
  public V1ConfigMapNodeConfigSourceBuilder() {
    this(false);
  }

  public V1ConfigMapNodeConfigSourceBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapNodeConfigSource(), validationEnabled);
  }

  public V1ConfigMapNodeConfigSourceBuilder(V1ConfigMapNodeConfigSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ConfigMapNodeConfigSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ConfigMapNodeConfigSource(), validationEnabled);
  }

  public V1ConfigMapNodeConfigSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
    this(fluent, instance, false);
  }

  public V1ConfigMapNodeConfigSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKubeletConfigKey(instance.getKubeletConfigKey());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  public V1ConfigMapNodeConfigSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
    this(instance, false);
  }

  public V1ConfigMapNodeConfigSourceBuilder(
      io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withKubeletConfigKey(instance.getKubeletConfigKey());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource build() {
    V1ConfigMapNodeConfigSource buildable = new V1ConfigMapNodeConfigSource();
    buildable.setKubeletConfigKey(fluent.getKubeletConfigKey());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
}
