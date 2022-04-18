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

public class V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder
    extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<
        V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy,
        io.kubernetes.client.openapi.models
            .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder> {
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder() {
    this(false);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetPersistentVolumeClaimRetentionPolicy(), validationEnabled);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?>
          fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StatefulSetPersistentVolumeClaimRetentionPolicy(), validationEnabled);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withWhenDeleted(instance.getWhenDeleted());

    fluent.withWhenScaled(instance.getWhenScaled());

    this.validationEnabled = validationEnabled;
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          instance) {
    this(instance, false);
  }

  public V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withWhenDeleted(instance.getWhenDeleted());

    this.withWhenScaled(instance.getWhenScaled());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<?>
      fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
      build() {
    V1StatefulSetPersistentVolumeClaimRetentionPolicy buildable =
        new V1StatefulSetPersistentVolumeClaimRetentionPolicy();
    buildable.setWhenDeleted(fluent.getWhenDeleted());
    buildable.setWhenScaled(fluent.getWhenScaled());
    return buildable;
  }
}
