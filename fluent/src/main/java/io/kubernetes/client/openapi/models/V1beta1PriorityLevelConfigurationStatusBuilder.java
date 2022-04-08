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

public class V1beta1PriorityLevelConfigurationStatusBuilder
    extends V1beta1PriorityLevelConfigurationStatusFluentImpl<
        V1beta1PriorityLevelConfigurationStatusBuilder>
    implements VisitableBuilder<
        V1beta1PriorityLevelConfigurationStatus,
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusBuilder> {
  public V1beta1PriorityLevelConfigurationStatusBuilder() {
    this(false);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationStatus(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      V1beta1PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationStatus(), validationEnabled);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus instance) {
    this(fluent, instance, false);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus instance) {
    this(instance, false);
  }

  public V1beta1PriorityLevelConfigurationStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus build() {
    V1beta1PriorityLevelConfigurationStatus buildable =
        new V1beta1PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
}
