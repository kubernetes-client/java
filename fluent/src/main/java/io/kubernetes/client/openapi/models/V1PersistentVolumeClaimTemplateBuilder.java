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

public class V1PersistentVolumeClaimTemplateBuilder
    extends V1PersistentVolumeClaimTemplateFluentImpl<V1PersistentVolumeClaimTemplateBuilder>
    implements VisitableBuilder<
        V1PersistentVolumeClaimTemplate, V1PersistentVolumeClaimTemplateBuilder> {
  public V1PersistentVolumeClaimTemplateBuilder() {
    this(false);
  }

  public V1PersistentVolumeClaimTemplateBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimTemplate(), validationEnabled);
  }

  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplateFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PersistentVolumeClaimTemplateBuilder(
      V1PersistentVolumeClaimTemplateFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimTemplate(), validationEnabled);
  }

  public V1PersistentVolumeClaimTemplateBuilder(
      V1PersistentVolumeClaimTemplateFluent<?> fluent, V1PersistentVolumeClaimTemplate instance) {
    this(fluent, instance, false);
  }

  public V1PersistentVolumeClaimTemplateBuilder(
      V1PersistentVolumeClaimTemplateFluent<?> fluent,
      V1PersistentVolumeClaimTemplate instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplate instance) {
    this(instance, false);
  }

  public V1PersistentVolumeClaimTemplateBuilder(
      V1PersistentVolumeClaimTemplate instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  V1PersistentVolumeClaimTemplateFluent<?> fluent;
  Boolean validationEnabled;

  public V1PersistentVolumeClaimTemplate build() {
    V1PersistentVolumeClaimTemplate buildable = new V1PersistentVolumeClaimTemplate();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}
