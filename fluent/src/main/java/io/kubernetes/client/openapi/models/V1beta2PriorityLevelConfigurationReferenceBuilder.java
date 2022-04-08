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

public class V1beta2PriorityLevelConfigurationReferenceBuilder
    extends V1beta2PriorityLevelConfigurationReferenceFluentImpl<
        V1beta2PriorityLevelConfigurationReferenceBuilder>
    implements VisitableBuilder<
        V1beta2PriorityLevelConfigurationReference,
        io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceBuilder> {
  public V1beta2PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?>
          fluent) {
    this(fluent, false);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?>
          fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance) {
    this(instance, false);
  }

  public V1beta2PriorityLevelConfigurationReferenceBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationReference build() {
    V1beta2PriorityLevelConfigurationReference buildable =
        new V1beta2PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
