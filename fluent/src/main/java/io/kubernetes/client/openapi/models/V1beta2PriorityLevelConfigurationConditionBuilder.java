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

public class V1beta2PriorityLevelConfigurationConditionBuilder
    extends V1beta2PriorityLevelConfigurationConditionFluentImpl<
        V1beta2PriorityLevelConfigurationConditionBuilder>
    implements VisitableBuilder<
        V1beta2PriorityLevelConfigurationCondition,
        io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionBuilder> {
  public V1beta2PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      V1beta2PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?>
          fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?>
          fluent,
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance) {
    this(instance, false);
  }

  public V1beta2PriorityLevelConfigurationConditionBuilder(
      io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition build() {
    V1beta2PriorityLevelConfigurationCondition buildable =
        new V1beta2PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
