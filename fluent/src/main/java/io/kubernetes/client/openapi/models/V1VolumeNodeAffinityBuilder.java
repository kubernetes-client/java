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

public class V1VolumeNodeAffinityBuilder
    extends V1VolumeNodeAffinityFluentImpl<V1VolumeNodeAffinityBuilder>
    implements VisitableBuilder<
        V1VolumeNodeAffinity, io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder> {
  public V1VolumeNodeAffinityBuilder() {
    this(false);
  }

  public V1VolumeNodeAffinityBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeAffinity(), validationEnabled);
  }

  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeNodeAffinityBuilder(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeAffinity(), validationEnabled);
  }

  public V1VolumeNodeAffinityBuilder(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
    this(fluent, instance, false);
  }

  public V1VolumeNodeAffinityBuilder(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeNodeAffinityBuilder(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance) {
    this(instance, false);
  }

  public V1VolumeNodeAffinityBuilder(
      io.kubernetes.client.openapi.models.V1VolumeNodeAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity build() {
    V1VolumeNodeAffinity buildable = new V1VolumeNodeAffinity();
    buildable.setRequired(fluent.getRequired());
    return buildable;
  }
}
